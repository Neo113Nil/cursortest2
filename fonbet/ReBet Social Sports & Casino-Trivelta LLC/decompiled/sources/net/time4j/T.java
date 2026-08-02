package net.time4j;

import i3.C4527h;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import li.AbstractC5470d;

/* loaded from: classes5.dex */
public final class T {

    /* renamed from: o, reason: collision with root package name */
    public static final net.time4j.format.x f57660o;

    /* renamed from: p, reason: collision with root package name */
    public static final net.time4j.format.x f57661p;

    /* renamed from: a, reason: collision with root package name */
    public final Locale f57662a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f57663b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f57664c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f57665d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f57666e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f57667f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f57668g;

    /* renamed from: h, reason: collision with root package name */
    public final String f57669h;

    /* renamed from: i, reason: collision with root package name */
    public final String f57670i;

    /* renamed from: j, reason: collision with root package name */
    public final String f57671j;

    /* renamed from: k, reason: collision with root package name */
    public final String f57672k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f57673l;

    /* renamed from: m, reason: collision with root package name */
    public final Map f57674m;

    /* renamed from: n, reason: collision with root package name */
    public static final ConcurrentMap f57659n = new ConcurrentHashMap();
    private static final InterfaceC5729w[] UNIT_IDS = {EnumC5706f.f57794d, EnumC5706f.f57796f, EnumC5706f.f57797g, EnumC5706f.f57798h, EnumC5714g.f58143a, EnumC5714g.f58144b, EnumC5714g.f58145c, EnumC5714g.f58146d, EnumC5714g.f58147e, EnumC5714g.f58148f};

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$format$TextWidth;

        static {
            int[] iArr = new int[net.time4j.format.v.values().length];
            $SwitchMap$net$time4j$format$TextWidth = iArr;
            try {
                iArr[net.time4j.format.v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$format$TextWidth[net.time4j.format.v.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$time4j$format$TextWidth[net.time4j.format.v.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$time4j$format$TextWidth[net.time4j.format.v.NARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b implements net.time4j.format.x {
        public b() {
        }

        public static String F(String str, String str2, String str3, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            int i10 = a.$SwitchMap$net$time4j$format$TextWidth[vVar.ordinal()];
            if (i10 == 1) {
                return G(str, nVar);
            }
            if (i10 == 2 || i10 == 3) {
                return G(str2, nVar);
            }
            if (i10 != 4) {
                throw new UnsupportedOperationException(vVar.name());
            }
            return "{0}" + str3;
        }

        public static String G(String str, net.time4j.format.n nVar) {
            return "{0} " + str + (nVar == net.time4j.format.n.ONE ? "" : "s");
        }

        public static String H(String str, boolean z10, net.time4j.format.n nVar) {
            String str2 = nVar == net.time4j.format.n.ONE ? "" : "s";
            if (z10) {
                return "in {0} " + str + str2;
            }
            return "{0} " + str + str2 + " ago";
        }

        public static String I(String str, boolean z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10 ? "+" : "-");
            sb2.append("{0} ");
            sb2.append(str);
            return sb2.toString();
        }

        public static String J(String str) {
            return "{0} " + str;
        }

        @Override // net.time4j.format.x
        public String B(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("microsecond", "µsec", "µs", vVar, nVar) : J("µs");
        }

        @Override // net.time4j.format.x
        public String C(Locale locale, boolean z10, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? H("minute", z10, nVar) : I("min", z10);
        }

        @Override // net.time4j.format.x
        public String c(Locale locale) {
            return "now";
        }

        @Override // net.time4j.format.x
        public String d(Locale locale, boolean z10, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? H("second", z10, nVar) : I("s", z10);
        }

        @Override // net.time4j.format.x
        public String e(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("minute", "min", X9.m.f13664a, vVar, nVar) : J("min");
        }

        @Override // net.time4j.format.x
        public String f(Locale locale, boolean z10, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? H("month", z10, nVar) : I(X9.m.f13664a, z10);
        }

        @Override // net.time4j.format.x
        public String g(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("hour", "hr", C4527h.f48087o, vVar, nVar) : J(C4527h.f48087o);
        }

        @Override // net.time4j.format.x
        public String i(Locale locale, boolean z10, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? H("week", z10, nVar) : I("w", z10);
        }

        @Override // net.time4j.format.x
        public String k(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("year", "yr", "y", vVar, nVar) : J("y");
        }

        @Override // net.time4j.format.x
        public String l(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("second", "sec", "s", vVar, nVar) : J("s");
        }

        @Override // net.time4j.format.x
        public String m(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("month", "mth", X9.m.f13664a, vVar, nVar) : J(X9.m.f13664a);
        }

        @Override // net.time4j.format.x
        public String n(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("nanosecond", "nsec", "ns", vVar, nVar) : J("ns");
        }

        @Override // net.time4j.format.x
        public String p(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("millisecond", "msec", "ms", vVar, nVar) : J("ms");
        }

        @Override // net.time4j.format.x
        public String r(Locale locale, boolean z10, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? H("hour", z10, nVar) : I(C4527h.f48087o, z10);
        }

        @Override // net.time4j.format.x
        public String s(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("day", "day", W9.d.f13160a, vVar, nVar) : J(W9.d.f13160a);
        }

        @Override // net.time4j.format.x
        public String t(Locale locale, net.time4j.format.v vVar, int i10) {
            if (i10 < 2) {
                throw new IllegalArgumentException("Size must be greater than 1.");
            }
            StringBuilder sb2 = new StringBuilder(i10 * 5);
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append('{');
                sb2.append(i11);
                sb2.append('}');
                if (i11 < i10 - 1) {
                    sb2.append(", ");
                }
            }
            return sb2.toString();
        }

        @Override // net.time4j.format.x
        public String u(Locale locale, boolean z10, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? H("day", z10, nVar) : I(W9.d.f13160a, z10);
        }

        @Override // net.time4j.format.x
        public String v(Locale locale, net.time4j.format.v vVar, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? F("week", "wk", "w", vVar, nVar) : J("w");
        }

        @Override // net.time4j.format.x
        public String z(Locale locale, boolean z10, net.time4j.format.n nVar) {
            return locale.getLanguage().equals("en") ? H("year", z10, nVar) : I("y", z10);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [net.time4j.format.x] */
    static {
        b bVar = new b(false ? 1 : 0);
        f57661p = bVar;
        Iterator it = AbstractC5470d.c().g(net.time4j.format.x.class).iterator();
        b bVar2 = it.hasNext() ? (net.time4j.format.x) it.next() : null;
        if (bVar2 != null) {
            bVar = bVar2;
        }
        f57660o = bVar;
    }

    public T(Locale locale) {
        String str;
        String str2;
        String str3;
        String str4;
        HashMap hashMap;
        HashMap hashMap2;
        this.f57662a = locale;
        HashMap hashMap3 = new HashMap(10);
        HashMap hashMap4 = new HashMap(10);
        HashMap hashMap5 = new HashMap(10);
        HashMap hashMap6 = new HashMap(10);
        HashMap hashMap7 = new HashMap(10);
        HashMap hashMap8 = new HashMap(10);
        InterfaceC5729w[] interfaceC5729wArr = UNIT_IDS;
        int length = interfaceC5729wArr.length;
        int i10 = 0;
        while (i10 < length) {
            InterfaceC5729w interfaceC5729w = interfaceC5729wArr[i10];
            EnumMap enumMap = new EnumMap(net.time4j.format.v.class);
            net.time4j.format.v[] values = net.time4j.format.v.values();
            int length2 = values.length;
            InterfaceC5729w[] interfaceC5729wArr2 = interfaceC5729wArr;
            int i11 = 0;
            while (i11 < length2) {
                int i12 = length;
                net.time4j.format.v vVar = values[i11];
                int i13 = i11;
                EnumMap enumMap2 = new EnumMap(net.time4j.format.n.class);
                net.time4j.format.n[] values2 = net.time4j.format.n.values();
                int i14 = i10;
                int i15 = 0;
                for (int length3 = values2.length; i15 < length3; length3 = length3) {
                    int i16 = i15;
                    net.time4j.format.n nVar = values2[i16];
                    enumMap2.put((EnumMap) nVar, (net.time4j.format.n) c(locale, interfaceC5729w, vVar, nVar));
                    i15 = i16 + 1;
                }
                enumMap.put((EnumMap) vVar, (net.time4j.format.v) Collections.unmodifiableMap(enumMap2));
                i11 = i13 + 1;
                length = i12;
                i10 = i14;
            }
            int i17 = length;
            int i18 = i10;
            hashMap3.put(interfaceC5729w, Collections.unmodifiableMap(enumMap));
            if (Character.isDigit(interfaceC5729w.a())) {
                hashMap = hashMap3;
                hashMap2 = hashMap4;
            } else {
                EnumMap enumMap3 = new EnumMap(net.time4j.format.n.class);
                net.time4j.format.n[] values3 = net.time4j.format.n.values();
                int length4 = values3.length;
                int i19 = 0;
                while (i19 < length4) {
                    net.time4j.format.n nVar2 = values3[i19];
                    enumMap3.put((EnumMap) nVar2, (net.time4j.format.n) d(locale, interfaceC5729w, false, false, nVar2));
                    i19++;
                    hashMap3 = hashMap3;
                }
                hashMap = hashMap3;
                hashMap4.put(interfaceC5729w, Collections.unmodifiableMap(enumMap3));
                EnumMap enumMap4 = new EnumMap(net.time4j.format.n.class);
                for (net.time4j.format.n nVar3 : net.time4j.format.n.values()) {
                    enumMap4.put((EnumMap) nVar3, (net.time4j.format.n) d(locale, interfaceC5729w, false, true, nVar3));
                }
                hashMap6.put(interfaceC5729w, Collections.unmodifiableMap(enumMap4));
                EnumMap enumMap5 = new EnumMap(net.time4j.format.n.class);
                net.time4j.format.n[] values4 = net.time4j.format.n.values();
                int length5 = values4.length;
                int i20 = 0;
                while (i20 < length5) {
                    net.time4j.format.n nVar4 = values4[i20];
                    enumMap5.put((EnumMap) nVar4, (net.time4j.format.n) d(locale, interfaceC5729w, true, false, nVar4));
                    i20++;
                    hashMap4 = hashMap4;
                }
                hashMap2 = hashMap4;
                hashMap5.put(interfaceC5729w, Collections.unmodifiableMap(enumMap5));
                EnumMap enumMap6 = new EnumMap(net.time4j.format.n.class);
                for (net.time4j.format.n nVar5 : net.time4j.format.n.values()) {
                    enumMap6.put((EnumMap) nVar5, (net.time4j.format.n) d(locale, interfaceC5729w, true, true, nVar5));
                }
                hashMap7.put(interfaceC5729w, Collections.unmodifiableMap(enumMap6));
            }
            i10 = i18 + 1;
            hashMap4 = hashMap2;
            interfaceC5729wArr = interfaceC5729wArr2;
            length = i17;
            hashMap3 = hashMap;
        }
        HashMap hashMap9 = hashMap3;
        HashMap hashMap10 = hashMap4;
        for (int i21 = 2; i21 <= 7; i21++) {
            Integer valueOf = Integer.valueOf(i21);
            EnumMap enumMap7 = new EnumMap(net.time4j.format.v.class);
            for (net.time4j.format.v vVar2 : net.time4j.format.v.values()) {
                enumMap7.put((EnumMap) vVar2, (net.time4j.format.v) e(locale, vVar2, i21));
            }
            hashMap8.put(valueOf, Collections.unmodifiableMap(enumMap7));
        }
        this.f57663b = Collections.unmodifiableMap(hashMap9);
        this.f57664c = Collections.unmodifiableMap(hashMap10);
        this.f57665d = Collections.unmodifiableMap(hashMap5);
        this.f57666e = Collections.unmodifiableMap(hashMap6);
        this.f57667f = Collections.unmodifiableMap(hashMap7);
        this.f57668g = Collections.unmodifiableMap(hashMap8);
        EnumMap enumMap8 = new EnumMap(Y.class);
        EnumMap enumMap9 = new EnumMap(Y.class);
        Y[] values5 = Y.values();
        int length6 = values5.length;
        int i22 = 0;
        while (true) {
            str = "";
            if (i22 < length6) {
                Y y10 = values5[i22];
                enumMap8.put((EnumMap) y10, (Y) "");
                enumMap9.put((EnumMap) y10, (Y) "");
                i22++;
            } else {
                try {
                    break;
                } catch (MissingResourceException unused) {
                    str2 = "";
                    str3 = str2;
                }
            }
        }
        net.time4j.format.x xVar = f57660o;
        String c10 = xVar.c(locale);
        if (xVar instanceof net.time4j.format.r) {
            net.time4j.format.r rVar = (net.time4j.format.r) net.time4j.format.r.class.cast(xVar);
            String b10 = rVar.b(locale);
            try {
                str3 = rVar.o(locale);
                try {
                    str = rVar.h(locale);
                    for (Y y11 : Y.values()) {
                        enumMap8.put((EnumMap) y11, (Y) rVar.j(y11, locale));
                        enumMap9.put((EnumMap) y11, (Y) rVar.A(y11, locale));
                    }
                    str4 = str;
                    str = b10;
                } catch (MissingResourceException unused2) {
                    str2 = str;
                    str = b10;
                    c10 = f57661p.c(locale);
                    str4 = str2;
                    this.f57669h = c10;
                    this.f57670i = str;
                    this.f57671j = str3;
                    this.f57672k = str4;
                    this.f57673l = Collections.unmodifiableMap(enumMap8);
                    this.f57674m = Collections.unmodifiableMap(enumMap9);
                }
            } catch (MissingResourceException unused3) {
                str2 = "";
                str3 = str2;
            }
        } else {
            str4 = "";
            str3 = str4;
        }
        this.f57669h = c10;
        this.f57670i = str;
        this.f57671j = str3;
        this.f57672k = str4;
        this.f57673l = Collections.unmodifiableMap(enumMap8);
        this.f57674m = Collections.unmodifiableMap(enumMap9);
    }

    public static char a(InterfaceC5729w interfaceC5729w) {
        char a10 = interfaceC5729w.a();
        if (interfaceC5729w == EnumC5714g.f58144b) {
            return 'N';
        }
        return a10;
    }

    public static String c(Locale locale, InterfaceC5729w interfaceC5729w, net.time4j.format.v vVar, net.time4j.format.n nVar) {
        try {
            return f(f57660o, locale, a(interfaceC5729w), vVar, nVar);
        } catch (MissingResourceException unused) {
            return f(f57661p, locale, a(interfaceC5729w), vVar, nVar);
        }
    }

    public static String d(Locale locale, InterfaceC5729w interfaceC5729w, boolean z10, boolean z11, net.time4j.format.n nVar) {
        Locale locale2;
        boolean z12;
        boolean z13;
        net.time4j.format.n nVar2;
        try {
            locale2 = locale;
            z12 = z10;
            z13 = z11;
            nVar2 = nVar;
        } catch (MissingResourceException unused) {
            locale2 = locale;
            z12 = z10;
            z13 = z11;
            nVar2 = nVar;
        }
        try {
            return g(f57660o, locale2, a(interfaceC5729w), z12, z13, nVar2);
        } catch (MissingResourceException unused2) {
            return g(f57661p, locale2, a(interfaceC5729w), z12, z13, nVar2);
        }
    }

    public static String e(Locale locale, net.time4j.format.v vVar, int i10) {
        try {
            return f57660o.t(locale, vVar, i10);
        } catch (MissingResourceException unused) {
            return f57661p.t(locale, vVar, i10);
        }
    }

    public static String f(net.time4j.format.x xVar, Locale locale, char c10, net.time4j.format.v vVar, net.time4j.format.n nVar) {
        if (c10 == '3') {
            return xVar.p(locale, vVar, nVar);
        }
        if (c10 == '6') {
            return xVar.B(locale, vVar, nVar);
        }
        if (c10 == '9') {
            return xVar.n(locale, vVar, nVar);
        }
        if (c10 == 'D') {
            return xVar.s(locale, vVar, nVar);
        }
        if (c10 == 'H') {
            return xVar.g(locale, vVar, nVar);
        }
        if (c10 == 'S') {
            return xVar.l(locale, vVar, nVar);
        }
        if (c10 == 'W') {
            return xVar.v(locale, vVar, nVar);
        }
        if (c10 == 'Y') {
            return xVar.k(locale, vVar, nVar);
        }
        if (c10 == 'M') {
            return xVar.m(locale, vVar, nVar);
        }
        if (c10 == 'N') {
            return xVar.e(locale, vVar, nVar);
        }
        throw new UnsupportedOperationException("Unit-ID: " + c10);
    }

    public static String g(net.time4j.format.x xVar, Locale locale, char c10, boolean z10, boolean z11, net.time4j.format.n nVar) {
        if (!z11 || !(xVar instanceof net.time4j.format.r)) {
            if (c10 == 'D') {
                return xVar.u(locale, z10, nVar);
            }
            if (c10 == 'H') {
                return xVar.r(locale, z10, nVar);
            }
            if (c10 == 'S') {
                return xVar.d(locale, z10, nVar);
            }
            if (c10 == 'W') {
                return xVar.i(locale, z10, nVar);
            }
            if (c10 == 'Y') {
                return xVar.z(locale, z10, nVar);
            }
            if (c10 == 'M') {
                return xVar.f(locale, z10, nVar);
            }
            if (c10 == 'N') {
                return xVar.C(locale, z10, nVar);
            }
            throw new UnsupportedOperationException("Unit-ID: " + c10);
        }
        net.time4j.format.r rVar = (net.time4j.format.r) net.time4j.format.r.class.cast(xVar);
        if (c10 == 'D') {
            return rVar.w(locale, z10, nVar);
        }
        if (c10 == 'H') {
            return rVar.a(locale, z10, nVar);
        }
        if (c10 == 'S') {
            return rVar.y(locale, z10, nVar);
        }
        if (c10 == 'W') {
            return rVar.x(locale, z10, nVar);
        }
        if (c10 == 'Y') {
            return rVar.q(locale, z10, nVar);
        }
        if (c10 == 'M') {
            return rVar.D(locale, z10, nVar);
        }
        if (c10 == 'N') {
            return rVar.E(locale, z10, nVar);
        }
        throw new UnsupportedOperationException("Unit-ID: " + c10);
    }

    public static T h(Locale locale) {
        if (locale == null) {
            throw new NullPointerException("Missing language.");
        }
        ConcurrentMap concurrentMap = f57659n;
        T t10 = (T) concurrentMap.get(locale);
        if (t10 == null) {
            t10 = new T(locale);
            T t11 = (T) concurrentMap.putIfAbsent(locale, t10);
            if (t11 != null) {
                return t11;
            }
        }
        return t10;
    }

    public String b() {
        return this.f57671j;
    }
}
