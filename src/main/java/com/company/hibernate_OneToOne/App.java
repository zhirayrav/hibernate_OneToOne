package com.company.hibernate_OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.company.models.Passport;
import com.company.models.Person;

/**
 * Hello world!
 *
 */
public class App  {
    public static void main( String[] args ) {
       Configuration configuration = new Configuration().addAnnotatedClass(Person.class)
    		   .addAnnotatedClass(Passport.class);
       SessionFactory sessionFactory = configuration.buildSessionFactory();
       try(sessionFactory){
    	   Session session = sessionFactory.getCurrentSession(); 
    	   session.beginTransaction();
// Add new person with new passport
//    	   
//    	   Person person = new Person("One",1);
//    	   Passport passport = new Passport(person,12345);
//    	   person.setPassport(passport);
//    	   session.save(person);
    	   
// Get person and get his passport 
//    	   
//    	   Person person = session.get(Person.class, 13);
//    	   System.out.println(person.getPassport().getPassportNumber());
    	   
// Get passport and get its owner
//    	   Passport passport = session.get(Passport.class,13);
//    	   System.out.println(passport.getPerson());
    	   
// Change passport_number of person
//    	   Person person = session.get(Person.class, 13);
//    	   person.getPassport().setPassportNumber(7777); //not necessary save, person in persistent state
    	   
// Remove person and will remove his passport(person_id int ... on delete cascade)
//    	   Person person = session.get(Person.class, 13);
//    	   session.remove(person);
    	  
    	   session.getTransaction().commit();
    	   
       }
    }
}
