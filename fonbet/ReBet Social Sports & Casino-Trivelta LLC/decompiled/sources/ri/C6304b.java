package ri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import li.AbstractC5470d;
import net.time4j.i18n.e;
import net.time4j.tz.d;
import net.time4j.tz.s;

/* renamed from: ri.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6304b implements s {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentMap f64416a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final Set f64417b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f64418c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f64419d;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("Z");
        hashSet.add("GMT");
        hashSet.add("GMT0");
        hashSet.add("Greenwich");
        hashSet.add("UCT");
        hashSet.add("UTC");
        hashSet.add("UTC0");
        hashSet.add("Universal");
        hashSet.add("Zulu");
        f64417b = Collections.unmodifiableSet(hashSet);
        HashMap hashMap = new HashMap();
        g(hashMap, "data/zone1970.tab");
        f64418c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        a(hashMap2, "CL", "America/Santiago");
        a(hashMap2, "CN", "Asia/Shanghai");
        a(hashMap2, "DE", "Europe/Berlin");
        a(hashMap2, "EC", "America/Guayaquil");
        a(hashMap2, "ES", "Europe/Madrid");
        a(hashMap2, "MH", "Pacific/Majuro");
        a(hashMap2, "MY", "Asia/Kuala_Lumpur");
        a(hashMap2, "NZ", "Pacific/Auckland");
        a(hashMap2, "PT", "Europe/Lisbon");
        a(hashMap2, "UA", "Europe/Kiev");
        a(hashMap2, "UZ", "Asia/Tashkent");
        f64419d = Collections.unmodifiableMap(hashMap2);
    }

    public static void a(Map map, String str, String str2) {
        map.put(str, str2);
    }

    public static void c(Map map, String str, String str2) {
        Set set = (Set) map.get(str);
        if (set == null) {
            set = new LinkedHashSet();
            map.put(str, set);
        }
        set.add(str2);
    }

    public static e e(Locale locale) {
        return e.h("olson/zones/tzname", locale);
    }

    public static void g(Map map, String str) {
        InputStream e10 = AbstractC5470d.c().e(AbstractC5470d.c().f("olson", C6304b.class, str), true);
        if (e10 == null) {
            e10 = C6304b.class.getClassLoader().getResourceAsStream(str);
        }
        try {
            if (e10 == null) {
                System.err.println("Warning: File \"" + str + "\" not found.");
                return;
            }
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(e10, "UTF-8"));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            try {
                                e10.close();
                                return;
                            } catch (IOException e11) {
                                e11.printStackTrace(System.err);
                                return;
                            }
                        }
                        if (!readLine.startsWith("#") && !readLine.isEmpty()) {
                            String[] split = readLine.split("\t");
                            if (split.length >= 3) {
                                for (String str2 : split[0].split(",")) {
                                    c(map, str2, split[2]);
                                }
                            }
                        }
                    }
                } catch (IOException e12) {
                    throw new IllegalStateException(e12);
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

    @Override // net.time4j.tz.s
    public Set b(Locale locale, boolean z10) {
        String country = locale.getCountry();
        if (z10) {
            if (country.equals("US")) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add("America/New_York");
                linkedHashSet.add("America/Chicago");
                linkedHashSet.add("America/Denver");
                linkedHashSet.add("America/Los_Angeles");
                linkedHashSet.add("America/Anchorage");
                linkedHashSet.add("Pacific/Honolulu");
                return Collections.unmodifiableSet(linkedHashSet);
            }
            String str = (String) f64419d.get(country);
            if (str != null) {
                return Collections.singleton(str);
            }
        }
        Set set = (Set) f64418c.get(country);
        return set == null ? Collections.EMPTY_SET : set;
    }

    @Override // net.time4j.tz.s
    public String d(boolean z10, Locale locale) {
        return e(locale).f(z10 ? "utc-literal" : "offset-pattern");
    }

    @Override // net.time4j.tz.s
    public String f(String str, d dVar, Locale locale) {
        if (f64417b.contains(str)) {
            return "";
        }
        Map map = (Map) f64416a.get(locale);
        if (map == null) {
            String[][] zoneStrings = DateFormatSymbols.getInstance(locale).getZoneStrings();
            HashMap hashMap = new HashMap();
            for (String[] strArr : zoneStrings) {
                EnumMap enumMap = new EnumMap(d.class);
                enumMap.put((EnumMap) d.LONG_STANDARD_TIME, (d) strArr[1]);
                enumMap.put((EnumMap) d.SHORT_STANDARD_TIME, (d) strArr[2]);
                enumMap.put((EnumMap) d.LONG_DAYLIGHT_TIME, (d) strArr[3]);
                enumMap.put((EnumMap) d.SHORT_DAYLIGHT_TIME, (d) strArr[4]);
                hashMap.put(strArr[0], enumMap);
            }
            map = (Map) f64416a.putIfAbsent(locale, hashMap);
            if (map == null) {
                map = hashMap;
            }
        }
        Map map2 = (Map) map.get(str);
        return map2 != null ? (String) map2.get(dVar) : "";
    }
}
