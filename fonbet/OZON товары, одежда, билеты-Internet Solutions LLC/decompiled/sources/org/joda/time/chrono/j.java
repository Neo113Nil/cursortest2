package org.joda.time.chrono;

import java.text.DateFormatSymbols;
import java.util.Comparator;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* loaded from: classes10.dex */
final class j {

    /* renamed from: n, reason: collision with root package name */
    private static ConcurrentHashMap f79191n = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final String[] f79192a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f79193b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f79194c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f79195d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f79196e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f79197f;

    /* renamed from: g, reason: collision with root package name */
    private final TreeMap<String, Integer> f79198g;

    /* renamed from: h, reason: collision with root package name */
    private final TreeMap<String, Integer> f79199h;

    /* renamed from: i, reason: collision with root package name */
    private final TreeMap<String, Integer> f79200i;

    /* renamed from: j, reason: collision with root package name */
    private final int f79201j;

    /* renamed from: k, reason: collision with root package name */
    private final int f79202k;

    /* renamed from: l, reason: collision with root package name */
    private final int f79203l;

    /* renamed from: m, reason: collision with root package name */
    private final int f79204m;

    private j(Locale locale) {
        DateFormatSymbols a11 = org.joda.time.c.a(locale);
        this.f79192a = a11.getEras();
        String[] weekdays = a11.getWeekdays();
        String[] strArr = new String[8];
        int i11 = 1;
        while (i11 < 8) {
            strArr[i11] = weekdays[i11 < 7 ? i11 + 1 : 1];
            i11++;
        }
        this.f79193b = strArr;
        String[] shortWeekdays = a11.getShortWeekdays();
        String[] strArr2 = new String[8];
        int i12 = 1;
        while (i12 < 8) {
            strArr2[i12] = shortWeekdays[i12 < 7 ? i12 + 1 : 1];
            i12++;
        }
        this.f79194c = strArr2;
        String[] months = a11.getMonths();
        String[] strArr3 = new String[13];
        for (int i13 = 1; i13 < 13; i13++) {
            strArr3[i13] = months[i13 - 1];
        }
        this.f79195d = strArr3;
        String[] shortMonths = a11.getShortMonths();
        String[] strArr4 = new String[13];
        for (int i14 = 1; i14 < 13; i14++) {
            strArr4[i14] = shortMonths[i14 - 1];
        }
        this.f79196e = strArr4;
        this.f79197f = a11.getAmPmStrings();
        Integer[] numArr = new Integer[13];
        for (int i15 = 0; i15 < 13; i15++) {
            numArr[i15] = Integer.valueOf(i15);
        }
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        TreeMap<String, Integer> treeMap = new TreeMap<>((Comparator<? super String>) comparator);
        this.f79198g = treeMap;
        a(treeMap, this.f79192a, numArr);
        if ("en".equals(locale.getLanguage())) {
            treeMap.put("BCE", numArr[0]);
            treeMap.put("CE", numArr[1]);
        }
        TreeMap<String, Integer> treeMap2 = new TreeMap<>((Comparator<? super String>) comparator);
        this.f79199h = treeMap2;
        a(treeMap2, this.f79193b, numArr);
        a(treeMap2, this.f79194c, numArr);
        for (int i16 = 1; i16 <= 7; i16++) {
            treeMap2.put(String.valueOf(i16).intern(), numArr[i16]);
        }
        TreeMap<String, Integer> treeMap3 = new TreeMap<>((Comparator<? super String>) comparator);
        this.f79200i = treeMap3;
        a(treeMap3, this.f79195d, numArr);
        a(treeMap3, this.f79196e, numArr);
        for (int i17 = 1; i17 <= 12; i17++) {
            treeMap3.put(String.valueOf(i17).intern(), numArr[i17]);
        }
        this.f79201j = n(this.f79192a);
        this.f79202k = n(this.f79193b);
        n(this.f79194c);
        this.f79203l = n(this.f79195d);
        n(this.f79196e);
        this.f79204m = n(this.f79197f);
    }

    private static void a(TreeMap<String, Integer> treeMap, String[] strArr, Integer[] numArr) {
        int length = strArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            String str = strArr[length];
            if (str != null) {
                treeMap.put(str, numArr[length]);
            }
        }
    }

    static j g(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        ConcurrentHashMap concurrentHashMap = f79191n;
        j jVar = (j) concurrentHashMap.get(locale);
        if (jVar == null) {
            jVar = new j(locale);
            j jVar2 = (j) concurrentHashMap.putIfAbsent(locale, jVar);
            if (jVar2 != null) {
                return jVar2;
            }
        }
        return jVar;
    }

    private static int n(String[] strArr) {
        int length;
        int length2 = strArr.length;
        int i11 = 0;
        while (true) {
            length2--;
            if (length2 < 0) {
                return i11;
            }
            String str = strArr[length2];
            if (str != null && (length = str.length()) > i11) {
                i11 = length;
            }
        }
    }

    public final int b(String str) {
        Integer num = this.f79199h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.K(), str);
    }

    public final String c(int i11) {
        return this.f79194c[i11];
    }

    public final String d(int i11) {
        return this.f79193b[i11];
    }

    public final int e(String str) {
        Integer num = this.f79198g.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.M(), str);
    }

    public final String f(int i11) {
        return this.f79192a[i11];
    }

    public final int h() {
        return this.f79202k;
    }

    public final int i() {
        return this.f79201j;
    }

    public final int j() {
        return this.f79204m;
    }

    public final int k() {
        return this.f79203l;
    }

    public final int l(String str) {
        String[] strArr = this.f79197f;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new IllegalFieldValueException(DateTimeFieldType.R(), str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return length;
    }

    public final String m(int i11) {
        return this.f79197f[i11];
    }

    public final int o(String str) {
        Integer num = this.f79200i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.Y(), str);
    }

    public final String p(int i11) {
        return this.f79196e[i11];
    }

    public final String q(int i11) {
        return this.f79195d[i11];
    }
}
