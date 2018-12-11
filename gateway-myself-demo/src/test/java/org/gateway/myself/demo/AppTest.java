package org.gateway.myself.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public static void main(String[] args) throws ParseException {
		/*String asd="2018-01-32";
		System.out.println(asd.length());
		System.out.println(asd.substring(0,7));*/
		
		/*Map<String,List> ss=new HashMap();
		List as=new ArrayList();
		ss.put("asd", as);
		as.add("asdadsasd");
		System.out.println(ss);
		
		List<String> dd=new ArrayList();
		dd.add("2018-01-30");
		dd.add("2018-01-26");
		dd.add("2018-01-29");
		dd.add("2018-01-27");
		dd=	dd.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
		System.out.println(dd);
		SimpleDateFormat  ssd=new SimpleDateFormat("yyyy-MM-dd");
		Date d1=ssd.parse("2018-12-09");  System.out.println();
		Calendar cc=Calendar.getInstance();
		cc.setTime(d1);
		System.out.println(cc.get(Calendar.DAY_OF_WEEK));*/
    	
    	System.out.println("2018-01-26".compareTo("2018-01-29"));
    	System.out.println("2018-01-30 10:20:36".compareTo("2018-01-29 10:20:36"));
	}
}
