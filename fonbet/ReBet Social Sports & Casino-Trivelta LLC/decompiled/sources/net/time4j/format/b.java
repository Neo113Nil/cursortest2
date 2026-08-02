package net.time4j.format;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import li.AbstractC5470d;
import oi.InterfaceC5913i;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import pi.AbstractC6084d;
import pi.InterfaceC6083c;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: l, reason: collision with root package name */
    public static final Set f57829l;

    /* renamed from: m, reason: collision with root package name */
    public static final f f57830m;

    /* renamed from: n, reason: collision with root package name */
    public static final u f57831n;

    /* renamed from: o, reason: collision with root package name */
    public static final u f57832o;

    /* renamed from: p, reason: collision with root package name */
    public static final ConcurrentMap f57833p;

    /* renamed from: a, reason: collision with root package name */
    public final String f57834a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f57835b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f57836c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f57837d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f57838e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f57839f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f57840g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f57841h;

    /* renamed from: i, reason: collision with root package name */
    public final String f57842i;

    /* renamed from: j, reason: collision with root package name */
    public final Locale f57843j;

    /* renamed from: k, reason: collision with root package name */
    public final MissingResourceException f57844k;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$format$DisplayMode;
        static final /* synthetic */ int[] $SwitchMap$net$time4j$format$TextWidth;

        static {
            int[] iArr = new int[e.values().length];
            $SwitchMap$net$time4j$format$DisplayMode = iArr;
            try {
                iArr[e.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$format$DisplayMode[e.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$time4j$format$DisplayMode[e.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$time4j$format$DisplayMode[e.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[v.values().length];
            $SwitchMap$net$time4j$format$TextWidth = iArr2;
            try {
                iArr2[v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$net$time4j$format$TextWidth[v.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$net$time4j$format$TextWidth[v.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$net$time4j$format$TextWidth[v.NARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: net.time4j.format.b$b, reason: collision with other inner class name */
    public static class C0841b implements u {
        public C0841b() {
        }

        @Override // net.time4j.format.u
        public boolean b(Locale locale) {
            return true;
        }

        @Override // net.time4j.format.u
        public String[] c(String str, Locale locale, v vVar, m mVar) {
            return vVar == v.NARROW ? new String[]{"1", "2", "3", "4"} : new String[]{"Q1", "Q2", "Q3", "Q4"};
        }

        @Override // net.time4j.format.u
        public String[] d(String str, Locale locale, v vVar, m mVar, boolean z10) {
            return vVar == v.WIDE ? new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13"} : new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
        }

        @Override // net.time4j.format.u
        public String[] f(String str, Locale locale, v vVar) {
            return vVar == v.NARROW ? new String[]{"B", "A"} : new String[]{BouncyCastleProvider.PROVIDER_NAME, "AD"};
        }

        @Override // net.time4j.format.u
        public String[] g(String str, Locale locale, v vVar, m mVar) {
            return new String[]{"1", "2", "3", "4", "5", "6", "7"};
        }

        @Override // net.time4j.format.u
        public String[] h(String str, Locale locale, v vVar, m mVar) {
            return vVar == v.NARROW ? new String[]{"A", "P"} : new String[]{"AM", "PM"};
        }

        @Override // net.time4j.format.u
        public boolean j(String str) {
            return true;
        }

        public String toString() {
            return "FallbackProvider";
        }

        public /* synthetic */ C0841b(a aVar) {
            this();
        }
    }

    public static class c implements f {

        /* renamed from: a, reason: collision with root package name */
        public final f f57845a;

        public c(f fVar) {
            this.f57845a = fVar;
        }

        public static String b(DateFormat dateFormat) {
            if (dateFormat instanceof SimpleDateFormat) {
                return ((SimpleDateFormat) SimpleDateFormat.class.cast(dateFormat)).toPattern();
            }
            throw new IllegalStateException("Cannot retrieve format pattern: " + dateFormat);
        }

        public static int c(e eVar) {
            int i10 = a.$SwitchMap$net$time4j$format$DisplayMode[eVar.ordinal()];
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 == 4) {
                return 3;
            }
            throw new UnsupportedOperationException("Unknown: " + eVar);
        }

        @Override // net.time4j.format.f
        public String a(e eVar, Locale locale) {
            f fVar = this.f57845a;
            return AbstractC6084d.a(fVar == null ? b(DateFormat.getTimeInstance(c(eVar), locale)) : fVar instanceof InterfaceC6083c ? ((InterfaceC6083c) InterfaceC6083c.class.cast(fVar)).i(eVar, locale, true) : fVar.a(eVar, locale));
        }

        @Override // net.time4j.format.f
        public String e(e eVar, Locale locale) {
            f fVar = this.f57845a;
            return fVar == null ? b(DateFormat.getDateInstance(c(eVar), locale)) : fVar.e(eVar, locale);
        }

        @Override // net.time4j.format.f
        public String k(e eVar, e eVar2, Locale locale) {
            f fVar = this.f57845a;
            if (fVar == null) {
                return b(DateFormat.getDateTimeInstance(c(eVar), c(eVar2), locale));
            }
            return this.f57845a.k(eVar, eVar2, locale).replace("{1}", this.f57845a.e(eVar, locale)).replace("{0}", fVar.a(eVar2, locale));
        }
    }

    public static class d implements u {
        public d() {
        }

        public static String[] a(String[] strArr, int i10) {
            String[] strArr2 = new String[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                if (strArr[i11].isEmpty()) {
                    strArr2[i11] = String.valueOf(i11 + 1);
                } else {
                    strArr2[i11] = e(strArr[i11]);
                }
            }
            return strArr2;
        }

        public static String e(String str) {
            char charAt = Normalizer.normalize(str, Normalizer.Form.NFD).charAt(0);
            return (charAt < 'A' || charAt > 'Z') ? (charAt < 'a' || charAt > 'z') ? (charAt < 1040 || charAt > 1071) ? (charAt < 1072 || charAt > 1103) ? str : String.valueOf((char) (charAt - ' ')) : String.valueOf(charAt) : String.valueOf((char) (charAt - ' ')) : String.valueOf(charAt);
        }

        @Override // net.time4j.format.u
        public boolean b(Locale locale) {
            String language = locale.getLanguage();
            for (Locale locale2 : DateFormatSymbols.getAvailableLocales()) {
                if (locale2.getLanguage().equals(language)) {
                    return true;
                }
            }
            return false;
        }

        @Override // net.time4j.format.u
        public String[] c(String str, Locale locale, v vVar, m mVar) {
            return new String[]{"Q1", "Q2", "Q3", "Q4"};
        }

        @Override // net.time4j.format.u
        public String[] d(String str, Locale locale, v vVar, m mVar, boolean z10) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            int i10 = a.$SwitchMap$net$time4j$format$TextWidth[vVar.ordinal()];
            if (i10 == 1) {
                return dateFormatSymbols.getMonths();
            }
            if (i10 == 2 || i10 == 3) {
                return dateFormatSymbols.getShortMonths();
            }
            if (i10 == 4) {
                return a(dateFormatSymbols.getShortMonths(), 12);
            }
            throw new UnsupportedOperationException(vVar.name());
        }

        @Override // net.time4j.format.u
        public String[] f(String str, Locale locale, v vVar) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            if (vVar != v.NARROW) {
                return dateFormatSymbols.getEras();
            }
            String[] eras = dateFormatSymbols.getEras();
            String[] strArr = new String[eras.length];
            int length = eras.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (!eras[i10].isEmpty()) {
                    strArr[i10] = e(eras[i10]);
                } else if (i10 == 0 && eras.length == 2) {
                    strArr[i10] = "B";
                } else if (i10 == 1 && eras.length == 2) {
                    strArr[i10] = "A";
                } else {
                    strArr[i10] = String.valueOf(i10);
                }
            }
            return strArr;
        }

        @Override // net.time4j.format.u
        public String[] g(String str, Locale locale, v vVar, m mVar) {
            String[] weekdays;
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            int i10 = a.$SwitchMap$net$time4j$format$TextWidth[vVar.ordinal()];
            if (i10 == 1) {
                weekdays = dateFormatSymbols.getWeekdays();
            } else if (i10 == 2 || i10 == 3) {
                weekdays = dateFormatSymbols.getShortWeekdays();
            } else {
                if (i10 != 4) {
                    throw new UnsupportedOperationException("Unknown text width: " + vVar);
                }
                weekdays = a(g("", locale, v.SHORT, mVar), 7);
            }
            if (weekdays.length <= 7) {
                return weekdays;
            }
            String str2 = weekdays[1];
            String[] strArr = new String[7];
            System.arraycopy(weekdays, 2, strArr, 0, 6);
            strArr[6] = str2;
            return strArr;
        }

        @Override // net.time4j.format.u
        public String[] h(String str, Locale locale, v vVar, m mVar) {
            return vVar == v.NARROW ? new String[]{"A", "P"} : DateFormatSymbols.getInstance(locale).getAmPmStrings();
        }

        @Override // net.time4j.format.u
        public boolean j(String str) {
            return "iso8601".equals(str);
        }

        public String toString() {
            return "JDKTextProvider";
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("ar");
        hashSet.add("dv");
        hashSet.add("fa");
        hashSet.add("ha");
        hashSet.add("he");
        hashSet.add("iw");
        hashSet.add("ji");
        hashSet.add("ps");
        hashSet.add("sd");
        hashSet.add("ug");
        hashSet.add("ur");
        hashSet.add("yi");
        f57829l = Collections.unmodifiableSet(hashSet);
        Iterator it = AbstractC5470d.c().g(f.class).iterator();
        f57830m = new c(it.hasNext() ? (f) it.next() : new net.time4j.i18n.c());
        a aVar = null;
        f57831n = new d(aVar);
        f57832o = new C0841b(aVar);
        f57833p = new ConcurrentHashMap();
    }

    public b(String str, Locale locale, u uVar) {
        this.f57834a = uVar.toString();
        int i10 = 0;
        Map unmodifiableMap = Collections.unmodifiableMap(i(str, locale, uVar, false));
        this.f57835b = unmodifiableMap;
        Map i11 = i(str, locale, uVar, true);
        if (i11 == null) {
            this.f57836c = unmodifiableMap;
        } else {
            this.f57836c = Collections.unmodifiableMap(i11);
        }
        EnumMap enumMap = new EnumMap(v.class);
        v[] values = v.values();
        int length = values.length;
        int i12 = 0;
        while (i12 < length) {
            v vVar = values[i12];
            EnumMap enumMap2 = new EnumMap(m.class);
            m[] values2 = m.values();
            int length2 = values2.length;
            int i13 = i10;
            while (i13 < length2) {
                m mVar = values2[i13];
                enumMap2.put((EnumMap) mVar, (m) new s(uVar.c(str, locale, vVar, mVar)));
                i13++;
                values = values;
            }
            enumMap.put((EnumMap) vVar, (v) enumMap2);
            i12++;
            i10 = 0;
        }
        this.f57837d = Collections.unmodifiableMap(enumMap);
        EnumMap enumMap3 = new EnumMap(v.class);
        v[] values3 = v.values();
        int length3 = values3.length;
        for (int i14 = 0; i14 < length3; i14++) {
            v vVar2 = values3[i14];
            EnumMap enumMap4 = new EnumMap(m.class);
            m[] values4 = m.values();
            int length4 = values4.length;
            int i15 = 0;
            while (i15 < length4) {
                m mVar2 = values4[i15];
                enumMap4.put((EnumMap) mVar2, (m) new s(uVar.g(str, locale, vVar2, mVar2)));
                i15++;
                values3 = values3;
                length3 = length3;
            }
            enumMap3.put((EnumMap) vVar2, (v) enumMap4);
        }
        this.f57838e = Collections.unmodifiableMap(enumMap3);
        EnumMap enumMap5 = new EnumMap(v.class);
        for (v vVar3 : v.values()) {
            enumMap5.put((EnumMap) vVar3, (v) new s(uVar.f(str, locale, vVar3)));
        }
        this.f57840g = Collections.unmodifiableMap(enumMap5);
        EnumMap enumMap6 = new EnumMap(v.class);
        v[] values5 = v.values();
        int length5 = values5.length;
        for (int i16 = 0; i16 < length5; i16++) {
            v vVar4 = values5[i16];
            EnumMap enumMap7 = new EnumMap(m.class);
            m[] values6 = m.values();
            int length6 = values6.length;
            int i17 = 0;
            while (i17 < length6) {
                m mVar3 = values6[i17];
                enumMap7.put((EnumMap) mVar3, (m) new s(uVar.h(str, locale, vVar4, mVar3)));
                i17++;
                values5 = values5;
            }
            enumMap6.put((EnumMap) vVar4, (v) enumMap7);
        }
        this.f57839f = Collections.unmodifiableMap(enumMap6);
        HashMap hashMap = new HashMap();
        try {
            net.time4j.i18n.e h10 = net.time4j.i18n.e.h("calendar/names/" + str + "/" + str, locale);
            for (String str2 : h10.g()) {
                hashMap.put(str2, h10.f(str2));
            }
            e = null;
        } catch (MissingResourceException e10) {
            e = e10;
        }
        this.f57841h = Collections.unmodifiableMap(hashMap);
        this.f57842i = str;
        this.f57843j = locale;
        this.f57844k = e;
    }

    public static String a(oi.x xVar) {
        net.time4j.format.c cVar = (net.time4j.format.c) xVar.r().getAnnotation(net.time4j.format.c.class);
        return cVar == null ? "iso8601" : cVar.value();
    }

    public static b c(String str, Locale locale) {
        u uVar;
        if (str == null) {
            throw new NullPointerException("Missing calendar type.");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(':');
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!country.isEmpty()) {
            sb2.append('-');
            sb2.append(country);
        }
        String sb3 = sb2.toString();
        b bVar = (b) f57833p.get(sb3);
        if (bVar != null) {
            return bVar;
        }
        if (locale.getLanguage().isEmpty() && str.equals("iso8601")) {
            uVar = f57832o;
        } else {
            Iterator it = AbstractC5470d.c().g(u.class).iterator();
            while (true) {
                if (!it.hasNext()) {
                    uVar = null;
                    break;
                }
                u uVar2 = (u) it.next();
                if (uVar2.j(str) && uVar2.b(locale)) {
                    uVar = uVar2;
                    break;
                }
            }
            if (uVar == null) {
                u uVar3 = f57831n;
                if (uVar3.j(str) && uVar3.b(locale)) {
                    uVar = uVar3;
                }
                if (uVar == null) {
                    uVar = f57832o;
                }
            }
        }
        b bVar2 = new b(str, locale, uVar);
        b bVar3 = (b) f57833p.putIfAbsent(sb3, bVar2);
        return bVar3 != null ? bVar3 : bVar2;
    }

    public static b d(Locale locale) {
        return c("iso8601", locale);
    }

    public static String f(String str, int i10, String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            if (i10 > 0) {
                return null;
            }
            return str;
        }
        if (strArr.length < i10) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(str);
        boolean z10 = true;
        for (int i11 = 0; i11 < strArr.length - i10; i11++) {
            if (z10) {
                sb2.append('(');
                z10 = false;
            } else {
                sb2.append('|');
            }
            sb2.append(strArr[i11]);
        }
        if (!z10) {
            sb2.append(')');
        }
        return sb2.toString();
    }

    public static Map i(String str, Locale locale, u uVar, boolean z10) {
        EnumMap enumMap = new EnumMap(v.class);
        boolean z11 = false;
        for (v vVar : v.values()) {
            EnumMap enumMap2 = new EnumMap(m.class);
            for (m mVar : m.values()) {
                String[] d10 = uVar.d(str, locale, vVar, mVar, z10);
                if (z10 && !z11) {
                    z11 = !Arrays.equals(uVar.d(str, locale, vVar, mVar, false), d10);
                }
                enumMap2.put((EnumMap) mVar, (m) new s(d10));
            }
            enumMap.put((EnumMap) vVar, (v) enumMap2);
        }
        if (!z10 || z11) {
            return enumMap;
        }
        return null;
    }

    public static boolean q(Locale locale) {
        return f57829l.contains(locale.getLanguage());
    }

    public static String r(e eVar, Locale locale) {
        return f57830m.e(eVar, locale);
    }

    public static String s(e eVar, e eVar2, Locale locale) {
        return f57830m.k(eVar, eVar2, locale);
    }

    public static String t(e eVar, Locale locale) {
        return f57830m.a(eVar, locale);
    }

    public static String u(e eVar, e eVar2, Locale locale) {
        return AbstractC6084d.a(f57830m.k(eVar, eVar2, locale));
    }

    public static String v(String str, int i10, int i11) {
        return str + '_' + (i10 + i11);
    }

    public s b(v vVar) {
        return (s) this.f57840g.get(vVar);
    }

    public final String e(String str) {
        return (this.f57841h.containsKey("useShortKeys") && "true".equals(this.f57841h.get("useShortKeys"))) ? (str.equals("MONTH_OF_YEAR") || str.equals("DAY_OF_WEEK") || str.equals("QUARTER_OF_YEAR") || str.equals("ERA")) ? str.substring(0, 1) : str.equals("EVANGELIST") ? "EV" : str.equals("SANSCULOTTIDES") ? "S" : str.equals("DAY_OF_DECADE") ? "D" : str : str;
    }

    public s g(v vVar, m mVar) {
        return j(vVar, mVar, true);
    }

    public s h(v vVar, m mVar) {
        return (s) ((Map) this.f57839f.get(vVar)).get(mVar);
    }

    public final s j(v vVar, m mVar, boolean z10) {
        return z10 ? (s) ((Map) this.f57836c.get(vVar)).get(mVar) : (s) ((Map) this.f57835b.get(vVar)).get(mVar);
    }

    public s k(v vVar, m mVar) {
        return (s) ((Map) this.f57837d.get(vVar)).get(mVar);
    }

    public s l(v vVar, m mVar) {
        return j(vVar, mVar, false);
    }

    public Map m() {
        return this.f57841h;
    }

    public s n(String str, Class cls, String... strArr) {
        String str2;
        if (this.f57844k != null) {
            throw new MissingResourceException(this.f57844k.getMessage(), this.f57844k.getClassName(), this.f57844k.getKey());
        }
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        int length = enumArr.length;
        String[] strArr2 = new String[length];
        String e10 = e(str);
        int i10 = !InterfaceC5913i.class.isAssignableFrom(cls) ? 1 : 0;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = 0;
            while (true) {
                String f10 = f(e10, i12, strArr);
                if (f10 == null) {
                    str2 = null;
                    break;
                }
                str2 = v(f10, i11, i10);
                if (this.f57841h.containsKey(str2)) {
                    break;
                }
                i12++;
            }
            if (str2 != null) {
                strArr2[i11] = (String) this.f57841h.get(str2);
            } else if (this.f57841h.containsKey(str)) {
                strArr2[i11] = (String) this.f57841h.get(str);
            } else {
                strArr2[i11] = enumArr[i11].name();
            }
        }
        return new s(strArr2);
    }

    public s o(oi.p pVar, String... strArr) {
        return n(pVar.name(), pVar.getType(), strArr);
    }

    public s p(v vVar, m mVar) {
        return (s) ((Map) this.f57838e.get(vVar)).get(mVar);
    }

    public String toString() {
        return this.f57834a + "(" + this.f57842i + "/" + this.f57843j + ")";
    }
}
