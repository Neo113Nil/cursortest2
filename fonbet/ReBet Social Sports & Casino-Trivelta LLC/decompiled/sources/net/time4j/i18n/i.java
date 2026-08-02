package net.time4j.i18n;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import li.AbstractC5470d;
import net.time4j.Y;
import net.time4j.format.y;

/* loaded from: classes5.dex */
public class i implements y {

    /* renamed from: a, reason: collision with root package name */
    public final String f58268a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f58269b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f58270c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f58271d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f58272e;

    public i() {
        String substring;
        Y y10;
        HashMap hashMap;
        URI f10 = AbstractC5470d.c().f("i18n", i.class, "data/week.data");
        InputStream e10 = AbstractC5470d.c().e(f10, true);
        if (e10 == null) {
            try {
                e10 = AbstractC5470d.c().d(i.class, "data/week.data", true);
            } catch (IOException unused) {
            }
        }
        if (e10 == null) {
            this.f58268a = "@STATIC";
            this.f58269b = Collections.EMPTY_SET;
            Map map = Collections.EMPTY_MAP;
            this.f58270c = map;
            this.f58271d = map;
            this.f58272e = map;
            System.err.println("Warning: File \"data/week.data\" not found.");
            return;
        }
        this.f58268a = "@" + f10;
        HashSet hashSet = new HashSet();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        try {
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(e10, "US-ASCII"));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            this.f58269b = Collections.unmodifiableSet(hashSet);
                            this.f58270c = Collections.unmodifiableMap(hashMap2);
                            this.f58271d = Collections.unmodifiableMap(hashMap3);
                            this.f58272e = Collections.unmodifiableMap(hashMap4);
                            try {
                                e10.close();
                                return;
                            } catch (IOException e11) {
                                e11.printStackTrace(System.err);
                                return;
                            }
                        }
                        if (!readLine.startsWith("#")) {
                            int indexOf = readLine.indexOf(61);
                            int i10 = 0;
                            String trim = readLine.substring(0, indexOf).trim();
                            String[] split = readLine.substring(indexOf + 1).split(" ");
                            if (trim.equals("minDays-4")) {
                                int length = split.length;
                                while (i10 < length) {
                                    String upperCase = split[i10].trim().toUpperCase(Locale.US);
                                    if (!upperCase.isEmpty()) {
                                        hashSet.add(upperCase);
                                    }
                                    i10++;
                                }
                            } else {
                                if (trim.startsWith("start-")) {
                                    substring = trim.substring(6);
                                    y10 = Y.SATURDAY;
                                    hashMap = hashMap3;
                                } else if (trim.startsWith("end-")) {
                                    substring = trim.substring(4);
                                    y10 = Y.SUNDAY;
                                    hashMap = hashMap4;
                                } else {
                                    if (!trim.startsWith("first-")) {
                                        throw new IllegalStateException("Unexpected format: " + this.f58268a);
                                    }
                                    substring = trim.substring(6);
                                    y10 = Y.MONDAY;
                                    hashMap = hashMap2;
                                }
                                if (substring.equals("sun")) {
                                    y10 = Y.SUNDAY;
                                } else if (substring.equals("sat")) {
                                    y10 = Y.SATURDAY;
                                } else if (substring.equals("fri")) {
                                    y10 = Y.FRIDAY;
                                } else if (substring.equals("thu")) {
                                    y10 = Y.THURSDAY;
                                } else if (substring.equals("wed")) {
                                    y10 = Y.WEDNESDAY;
                                } else if (substring.equals("tue")) {
                                    y10 = Y.TUESDAY;
                                } else if (substring.equals("mon")) {
                                    y10 = Y.MONDAY;
                                }
                                int length2 = split.length;
                                while (i10 < length2) {
                                    String upperCase2 = split[i10].trim().toUpperCase(Locale.US);
                                    if (!upperCase2.isEmpty()) {
                                        hashMap.put(upperCase2, y10);
                                    }
                                    i10++;
                                }
                            }
                        }
                    }
                } catch (Exception e12) {
                    throw new IllegalStateException("Unexpected format: " + this.f58268a, e12);
                }
            } catch (UnsupportedEncodingException e13) {
                throw new AssertionError(e13);
            }
        } catch (Throwable th2) {
            try {
                e10.close();
            } catch (IOException e14) {
                e14.printStackTrace(System.err);
            }
            throw th2;
        }
    }

    @Override // net.time4j.format.y
    public int a(Locale locale) {
        String country = locale.getCountry();
        Y y10 = Y.SUNDAY;
        if (this.f58272e.containsKey(country)) {
            y10 = (Y) this.f58272e.get(country);
        }
        return y10.b();
    }

    @Override // net.time4j.format.y
    public int b(Locale locale) {
        if (this.f58269b.isEmpty()) {
            return new GregorianCalendar(locale).getMinimalDaysInFirstWeek();
        }
        String country = locale.getCountry();
        return ((country.isEmpty() && locale.getLanguage().isEmpty()) || this.f58269b.contains(country)) ? 4 : 1;
    }

    @Override // net.time4j.format.y
    public int c(Locale locale) {
        String country = locale.getCountry();
        Y y10 = Y.SATURDAY;
        if (this.f58271d.containsKey(country)) {
            y10 = (Y) this.f58271d.get(country);
        }
        return y10.b();
    }

    @Override // net.time4j.format.y
    public int d(Locale locale) {
        if (this.f58270c.isEmpty()) {
            int firstDayOfWeek = new GregorianCalendar(locale).getFirstDayOfWeek();
            if (firstDayOfWeek == 1) {
                return 7;
            }
            return firstDayOfWeek - 1;
        }
        String country = locale.getCountry();
        Y y10 = Y.MONDAY;
        if (this.f58270c.containsKey(country)) {
            y10 = (Y) this.f58270c.get(country);
        }
        return y10.b();
    }

    public String toString() {
        return getClass().getName() + this.f58268a;
    }
}
