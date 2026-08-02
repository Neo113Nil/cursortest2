package kg;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
final class j extends f {

    /* renamed from: d, reason: collision with root package name */
    private static final Comparator<Map.Entry<String, Long>> f71586d = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f71587e = 0;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap f71588c = new ConcurrentHashMap(16, 0.75f, 2);

    final class a implements Comparator<Map.Entry<String, Long>> {
        @Override // java.util.Comparator
        public final int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            return entry2.getKey().length() - entry.getKey().length();
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map<k, Map<Long, String>> f71589a;

        b(Map<k, Map<Long, String>> map) {
            this.f71589a = map;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (k kVar : map.keySet()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry<Long, String> entry : map.get(kVar).entrySet()) {
                    String value = entry.getValue();
                    String value2 = entry.getValue();
                    Long key = entry.getKey();
                    int i11 = j.f71587e;
                    hashMap2.put(value, new AbstractMap.SimpleImmutableEntry(value2, key));
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.values());
                Collections.sort(arrayList2, j.f71586d);
                hashMap.put(kVar, arrayList2);
                arrayList.addAll(arrayList2);
                hashMap.put(null, arrayList);
            }
            Collections.sort(arrayList, j.f71586d);
        }

        final String a(long j11, k kVar) {
            Map<Long, String> map = this.f71589a.get(kVar);
            if (map != null) {
                return map.get(Long.valueOf(j11));
            }
            return null;
        }
    }

    j() {
    }

    private static b d(HashMap hashMap) {
        hashMap.put(k.FULL_STANDALONE, hashMap.get(k.FULL));
        hashMap.put(k.SHORT_STANDALONE, hashMap.get(k.SHORT));
        k kVar = k.NARROW;
        if (hashMap.containsKey(kVar)) {
            k kVar2 = k.NARROW_STANDALONE;
            if (!hashMap.containsKey(kVar2)) {
                hashMap.put(kVar2, hashMap.get(kVar));
            }
        }
        return new b(hashMap);
    }

    private static String e(int i11, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i11) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "日";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i11) {
                case 1:
                    return "ن";
                case 2:
                    return "ث";
                case 3:
                    return "ر";
                case 4:
                    return "خ";
                case 5:
                    return "ج";
                case 6:
                    return "س";
                case 7:
                    return "ح";
            }
        }
        return str.substring(0, 1);
    }

    private static String f(int i11, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i11) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "七";
                case 8:
                    return "八";
                case 9:
                    return "九";
                case 10:
                    return "十";
                case 11:
                    return "十一";
                case 12:
                    return "十二";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i11) {
                case 1:
                    return "ي";
                case 2:
                    return "ف";
                case 3:
                    return "م";
                case 4:
                    return "أ";
                case 5:
                    return "و";
                case 6:
                    return "ن";
                case 7:
                    return "ل";
                case 8:
                    return "غ";
                case 9:
                    return "س";
                case 10:
                    return "ك";
                case 11:
                    return "ب";
                case 12:
                    return "د";
            }
        }
        return (locale.getLanguage().equals("ja") && locale.getCountry().equals("JP")) ? Integer.toString(i11) : str.substring(0, 1);
    }

    @Override // kg.f
    public final String b(mg.h hVar, long j11, k kVar, Locale locale) {
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry;
        ConcurrentHashMap concurrentHashMap;
        Object obj;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(hVar, locale);
        ConcurrentHashMap concurrentHashMap2 = this.f71588c;
        Object obj2 = concurrentHashMap2.get(simpleImmutableEntry2);
        if (obj2 == null) {
            if (hVar == EnumC8145a.MONTH_OF_YEAR) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                HashMap hashMap = new HashMap();
                String[] months = dateFormatSymbols.getMonths();
                simpleImmutableEntry = simpleImmutableEntry2;
                HashMap hashMap2 = new HashMap();
                concurrentHashMap = concurrentHashMap2;
                hashMap2.put(1L, months[0]);
                hashMap2.put(2L, months[1]);
                hashMap2.put(3L, months[2]);
                hashMap2.put(4L, months[3]);
                hashMap2.put(5L, months[4]);
                hashMap2.put(6L, months[5]);
                hashMap2.put(7L, months[6]);
                hashMap2.put(8L, months[7]);
                hashMap2.put(9L, months[8]);
                hashMap2.put(10L, months[9]);
                hashMap2.put(11L, months[10]);
                hashMap2.put(12L, months[11]);
                hashMap.put(k.FULL, hashMap2);
                HashMap hashMap3 = new HashMap();
                hashMap3.put(1L, f(1, months[0], locale));
                hashMap3.put(2L, f(2, months[1], locale));
                hashMap3.put(3L, f(3, months[2], locale));
                hashMap3.put(4L, f(4, months[3], locale));
                hashMap3.put(5L, f(5, months[4], locale));
                hashMap3.put(6L, f(6, months[5], locale));
                hashMap3.put(7L, f(7, months[6], locale));
                hashMap3.put(8L, f(8, months[7], locale));
                hashMap3.put(9L, f(9, months[8], locale));
                hashMap3.put(10L, f(10, months[9], locale));
                hashMap3.put(11L, f(11, months[10], locale));
                hashMap3.put(12L, f(12, months[11], locale));
                hashMap.put(k.NARROW, hashMap3);
                String[] shortMonths = dateFormatSymbols.getShortMonths();
                HashMap hashMap4 = new HashMap();
                hashMap4.put(1L, shortMonths[0]);
                hashMap4.put(2L, shortMonths[1]);
                hashMap4.put(3L, shortMonths[2]);
                hashMap4.put(4L, shortMonths[3]);
                hashMap4.put(5L, shortMonths[4]);
                hashMap4.put(6L, shortMonths[5]);
                hashMap4.put(7L, shortMonths[6]);
                hashMap4.put(8L, shortMonths[7]);
                hashMap4.put(9L, shortMonths[8]);
                hashMap4.put(10L, shortMonths[9]);
                hashMap4.put(11L, shortMonths[10]);
                hashMap4.put(12L, shortMonths[11]);
                hashMap.put(k.SHORT, hashMap4);
                obj = d(hashMap);
            } else {
                simpleImmutableEntry = simpleImmutableEntry2;
                concurrentHashMap = concurrentHashMap2;
                if (hVar == EnumC8145a.DAY_OF_WEEK) {
                    DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                    HashMap hashMap5 = new HashMap();
                    String[] weekdays = dateFormatSymbols2.getWeekdays();
                    HashMap hashMap6 = new HashMap();
                    hashMap6.put(1L, weekdays[2]);
                    hashMap6.put(2L, weekdays[3]);
                    hashMap6.put(3L, weekdays[4]);
                    hashMap6.put(4L, weekdays[5]);
                    hashMap6.put(5L, weekdays[6]);
                    hashMap6.put(6L, weekdays[7]);
                    hashMap6.put(7L, weekdays[1]);
                    hashMap5.put(k.FULL, hashMap6);
                    HashMap hashMap7 = new HashMap();
                    hashMap7.put(1L, e(1, weekdays[2], locale));
                    hashMap7.put(2L, e(2, weekdays[3], locale));
                    hashMap7.put(3L, e(3, weekdays[4], locale));
                    hashMap7.put(4L, e(4, weekdays[5], locale));
                    hashMap7.put(5L, e(5, weekdays[6], locale));
                    hashMap7.put(6L, e(6, weekdays[7], locale));
                    hashMap7.put(7L, e(7, weekdays[1], locale));
                    hashMap5.put(k.NARROW, hashMap7);
                    String[] shortWeekdays = dateFormatSymbols2.getShortWeekdays();
                    HashMap hashMap8 = new HashMap();
                    hashMap8.put(1L, shortWeekdays[2]);
                    hashMap8.put(2L, shortWeekdays[3]);
                    hashMap8.put(3L, shortWeekdays[4]);
                    hashMap8.put(4L, shortWeekdays[5]);
                    hashMap8.put(5L, shortWeekdays[6]);
                    hashMap8.put(6L, shortWeekdays[7]);
                    hashMap8.put(7L, shortWeekdays[1]);
                    hashMap5.put(k.SHORT, hashMap8);
                    obj = d(hashMap5);
                } else if (hVar == EnumC8145a.AMPM_OF_DAY) {
                    DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
                    HashMap hashMap9 = new HashMap();
                    String[] amPmStrings = dateFormatSymbols3.getAmPmStrings();
                    HashMap hashMap10 = new HashMap();
                    hashMap10.put(0L, amPmStrings[0]);
                    hashMap10.put(1L, amPmStrings[1]);
                    hashMap9.put(k.FULL, hashMap10);
                    hashMap9.put(k.SHORT, hashMap10);
                    obj = d(hashMap9);
                } else if (hVar == EnumC8145a.ERA) {
                    DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
                    HashMap hashMap11 = new HashMap();
                    String[] eras = dateFormatSymbols4.getEras();
                    HashMap hashMap12 = new HashMap();
                    hashMap12.put(0L, eras[0]);
                    hashMap12.put(1L, eras[1]);
                    hashMap11.put(k.SHORT, hashMap12);
                    if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                        HashMap hashMap13 = new HashMap();
                        hashMap13.put(0L, "Before Christ");
                        hashMap13.put(1L, "Anno Domini");
                        hashMap11.put(k.FULL, hashMap13);
                    } else {
                        hashMap11.put(k.FULL, hashMap12);
                    }
                    HashMap hashMap14 = new HashMap();
                    hashMap14.put(0L, eras[0].substring(0, 1));
                    hashMap14.put(1L, eras[1].substring(0, 1));
                    hashMap11.put(k.NARROW, hashMap14);
                    obj = d(hashMap11);
                } else if (hVar == mg.c.f74845a) {
                    HashMap hashMap15 = new HashMap();
                    HashMap hashMap16 = new HashMap();
                    hashMap16.put(1L, "Q1");
                    hashMap16.put(2L, "Q2");
                    hashMap16.put(3L, "Q3");
                    hashMap16.put(4L, "Q4");
                    hashMap15.put(k.SHORT, hashMap16);
                    HashMap hashMap17 = new HashMap();
                    hashMap17.put(1L, "1st quarter");
                    hashMap17.put(2L, "2nd quarter");
                    hashMap17.put(3L, "3rd quarter");
                    hashMap17.put(4L, "4th quarter");
                    hashMap15.put(k.FULL, hashMap17);
                    obj = d(hashMap15);
                } else {
                    obj = "";
                }
            }
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = simpleImmutableEntry;
            ConcurrentHashMap concurrentHashMap3 = concurrentHashMap;
            concurrentHashMap3.putIfAbsent(simpleImmutableEntry3, obj);
            obj2 = concurrentHashMap3.get(simpleImmutableEntry3);
        }
        if (obj2 instanceof b) {
            return ((b) obj2).a(j11, kVar);
        }
        return null;
    }
}
