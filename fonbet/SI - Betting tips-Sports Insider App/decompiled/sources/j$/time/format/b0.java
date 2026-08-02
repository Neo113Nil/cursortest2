package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f17377a = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: b, reason: collision with root package name */
    public static final z f17378b = new z();

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f17379c = new b0();

    public String c(j$.time.temporal.p pVar, long j, g0 g0Var, Locale locale) {
        Object a7 = a(pVar, locale);
        if (a7 instanceof a0) {
            return ((a0) a7).a(j, g0Var);
        }
        return null;
    }

    public String b(j$.time.chrono.k kVar, j$.time.temporal.p pVar, long j, g0 g0Var, Locale locale) {
        if (kVar == j$.time.chrono.r.f17346c || !(pVar instanceof j$.time.temporal.a)) {
            return c(pVar, j, g0Var, locale);
        }
        return null;
    }

    public Iterator e(j$.time.temporal.p pVar, g0 g0Var, Locale locale) {
        List list;
        Object a7 = a(pVar, locale);
        if (!(a7 instanceof a0) || (list = (List) ((HashMap) ((a0) a7).f17375b).get(g0Var)) == null) {
            return null;
        }
        return list.iterator();
    }

    public Iterator d(j$.time.chrono.k kVar, j$.time.temporal.p pVar, g0 g0Var, Locale locale) {
        if (kVar == j$.time.chrono.r.f17346c || !(pVar instanceof j$.time.temporal.a)) {
            return e(pVar, g0Var, locale);
        }
        return null;
    }

    public static Object a(j$.time.temporal.p pVar, Locale locale) {
        Object obj;
        long j;
        String substring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(pVar, locale);
        ConcurrentHashMap concurrentHashMap = f17377a;
        V v5 = concurrentHashMap.get(simpleImmutableEntry);
        if (v5 != 0) {
            return v5;
        }
        HashMap hashMap = new HashMap();
        if (pVar == j$.time.temporal.a.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            for (int i5 = 0; i5 < eras.length; i5++) {
                if (!eras[i5].isEmpty()) {
                    long j6 = i5;
                    hashMap2.put(Long.valueOf(j6), eras[i5]);
                    Long valueOf = Long.valueOf(j6);
                    String str = eras[i5];
                    hashMap3.put(valueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                }
            }
            if (!hashMap2.isEmpty()) {
                hashMap.put(g0.FULL, hashMap2);
                hashMap.put(g0.SHORT, hashMap2);
                hashMap.put(g0.NARROW, hashMap3);
            }
            obj = new a0(hashMap);
        } else {
            long j10 = 1;
            if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
                int length = DateFormatSymbols.getInstance(locale).getMonths().length;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (long j11 = 1; j11 <= length; j11++) {
                    String C = j$.com.android.tools.r8.a.C(j11, "LLLL", locale);
                    linkedHashMap.put(Long.valueOf(j11), C);
                    linkedHashMap2.put(Long.valueOf(j11), C.substring(0, Character.charCount(C.codePointAt(0))));
                    linkedHashMap3.put(Long.valueOf(j11), j$.com.android.tools.r8.a.C(j11, "LLL", locale));
                }
                if (length > 0) {
                    hashMap.put(g0.FULL_STANDALONE, linkedHashMap);
                    hashMap.put(g0.NARROW_STANDALONE, linkedHashMap2);
                    hashMap.put(g0.SHORT_STANDALONE, linkedHashMap3);
                    hashMap.put(g0.FULL, linkedHashMap);
                    hashMap.put(g0.NARROW, linkedHashMap2);
                    hashMap.put(g0.SHORT, linkedHashMap3);
                }
                obj = new a0(hashMap);
            } else if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
                int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                boolean z5 = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
                long j12 = 1;
                while (j12 <= length2) {
                    String B = j$.com.android.tools.r8.a.B(j12, "cccc", locale);
                    linkedHashMap4.put(Long.valueOf(j12), B);
                    Long valueOf2 = Long.valueOf(j12);
                    if (!z5) {
                        j = j10;
                        substring = B.substring(0, Character.charCount(B.codePointAt(0)));
                    } else {
                        j = j10;
                        substring = new StringBuilder().appendCodePoint(B.codePointBefore(B.length())).toString();
                    }
                    linkedHashMap5.put(valueOf2, substring);
                    linkedHashMap6.put(Long.valueOf(j12), j$.com.android.tools.r8.a.B(j12, "ccc", locale));
                    j12 += j;
                    j10 = j;
                }
                if (length2 > 0) {
                    hashMap.put(g0.FULL_STANDALONE, linkedHashMap4);
                    hashMap.put(g0.NARROW_STANDALONE, linkedHashMap5);
                    hashMap.put(g0.SHORT_STANDALONE, linkedHashMap6);
                    hashMap.put(g0.FULL, linkedHashMap4);
                    hashMap.put(g0.NARROW, linkedHashMap5);
                    hashMap.put(g0.SHORT, linkedHashMap6);
                }
                obj = new a0(hashMap);
            } else if (pVar == j$.time.temporal.a.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap4 = new HashMap();
                HashMap hashMap5 = new HashMap();
                String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
                for (int i10 = 0; i10 < amPmStrings.length; i10++) {
                    if (!amPmStrings[i10].isEmpty()) {
                        long j13 = i10;
                        hashMap4.put(Long.valueOf(j13), amPmStrings[i10]);
                        Long valueOf3 = Long.valueOf(j13);
                        String str2 = amPmStrings[i10];
                        hashMap5.put(valueOf3, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                    }
                }
                if (!hashMap4.isEmpty()) {
                    hashMap.put(g0.FULL, hashMap4);
                    hashMap.put(g0.SHORT, hashMap4);
                    hashMap.put(g0.NARROW, hashMap5);
                }
                obj = new a0(hashMap);
            } else {
                obj = "";
            }
        }
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, obj);
        return concurrentHashMap.get(simpleImmutableEntry);
    }
}
