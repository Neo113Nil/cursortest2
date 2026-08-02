package net.time4j.format;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import oi.F;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;
import qi.EnumC6185f;

/* loaded from: classes5.dex */
public final class a implements InterfaceC5908d {

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC5907c f57803b = q.a("CALENDAR_TYPE", String.class);

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC5907c f57804c = q.a("LANGUAGE", Locale.class);

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC5907c f57805d = q.a("TIMEZONE_ID", net.time4j.tz.k.class);

    /* renamed from: e, reason: collision with root package name */
    public static final InterfaceC5907c f57806e = q.a("TRANSITION_STRATEGY", net.time4j.tz.o.class);

    /* renamed from: f, reason: collision with root package name */
    public static final InterfaceC5907c f57807f = q.a("LENIENCY", g.class);

    /* renamed from: g, reason: collision with root package name */
    public static final InterfaceC5907c f57808g = q.a("TEXT_WIDTH", v.class);

    /* renamed from: h, reason: collision with root package name */
    public static final InterfaceC5907c f57809h = q.a("OUTPUT_CONTEXT", m.class);

    /* renamed from: i, reason: collision with root package name */
    public static final InterfaceC5907c f57810i = q.a("PARSE_CASE_INSENSITIVE", Boolean.class);

    /* renamed from: j, reason: collision with root package name */
    public static final InterfaceC5907c f57811j = q.a("PARSE_PARTIAL_COMPARE", Boolean.class);

    /* renamed from: k, reason: collision with root package name */
    public static final InterfaceC5907c f57812k = q.a("PARSE_MULTIPLE_CONTEXT", Boolean.class);

    /* renamed from: l, reason: collision with root package name */
    public static final InterfaceC5907c f57813l = q.a("NUMBER_SYSTEM", j.class);

    /* renamed from: m, reason: collision with root package name */
    public static final InterfaceC5907c f57814m = q.a("ZERO_DIGIT", Character.class);

    /* renamed from: n, reason: collision with root package name */
    public static final InterfaceC5907c f57815n = q.a("NO_GMT_PREFIX", Boolean.class);

    /* renamed from: o, reason: collision with root package name */
    public static final InterfaceC5907c f57816o = q.a("DECIMAL_SEPARATOR", Character.class);

    /* renamed from: p, reason: collision with root package name */
    public static final InterfaceC5907c f57817p = q.a("PAD_CHAR", Character.class);

    /* renamed from: q, reason: collision with root package name */
    public static final InterfaceC5907c f57818q = q.a("PIVOT_YEAR", Integer.class);

    /* renamed from: r, reason: collision with root package name */
    public static final InterfaceC5907c f57819r = q.a("TRAILING_CHARACTERS", Boolean.class);

    /* renamed from: s, reason: collision with root package name */
    public static final InterfaceC5907c f57820s = q.a("PROTECTED_CHARACTERS", Integer.class);

    /* renamed from: t, reason: collision with root package name */
    public static final InterfaceC5907c f57821t = q.a("CALENDAR_VARIANT", String.class);

    /* renamed from: u, reason: collision with root package name */
    public static final InterfaceC5907c f57822u = q.a("START_OF_DAY", F.class);

    /* renamed from: v, reason: collision with root package name */
    public static final InterfaceC5907c f57823v = q.a("FOUR_DIGIT_YEAR", Boolean.class);

    /* renamed from: w, reason: collision with root package name */
    public static final InterfaceC5907c f57824w = q.a("TIME_SCALE", EnumC6185f.class);

    /* renamed from: x, reason: collision with root package name */
    public static final InterfaceC5907c f57825x = q.a("FORMAT_PATTERN", String.class);

    /* renamed from: y, reason: collision with root package name */
    public static final a f57826y = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Map f57827a;

    /* renamed from: net.time4j.format.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0840a {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$format$Leniency;

        static {
            int[] iArr = new int[g.values().length];
            $SwitchMap$net$time4j$format$Leniency = iArr;
            try {
                iArr[g.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$format$Leniency[g.SMART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$time4j$format$Leniency[g.LAX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public /* synthetic */ a(Map map, C0840a c0840a) {
        this(map);
    }

    public static InterfaceC5907c e(String str, Class cls) {
        return q.a(str, cls);
    }

    public static a f() {
        return f57826y;
    }

    @Override // oi.InterfaceC5908d
    public Object a(InterfaceC5907c interfaceC5907c) {
        Object obj = this.f57827a.get(interfaceC5907c.name());
        if (obj != null) {
            return interfaceC5907c.type().cast(obj);
        }
        throw new NoSuchElementException(interfaceC5907c.name());
    }

    @Override // oi.InterfaceC5908d
    public Object b(InterfaceC5907c interfaceC5907c, Object obj) {
        Object obj2 = this.f57827a.get(interfaceC5907c.name());
        return obj2 == null ? obj : interfaceC5907c.type().cast(obj2);
    }

    @Override // oi.InterfaceC5908d
    public boolean c(InterfaceC5907c interfaceC5907c) {
        return this.f57827a.containsKey(interfaceC5907c.name());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f57827a.equals(((a) obj).f57827a);
        }
        return false;
    }

    public int hashCode() {
        return this.f57827a.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f57827a.size() * 32);
        sb2.append(a.class.getName());
        sb2.append('[');
        sb2.append(this.f57827a);
        sb2.append(']');
        return sb2.toString();
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Map f57828a = new HashMap();

        public b() {
        }

        public a a() {
            return new a(this.f57828a, null);
        }

        public b b(InterfaceC5907c interfaceC5907c, char c10) {
            this.f57828a.put(interfaceC5907c.name(), Character.valueOf(c10));
            return this;
        }

        public b c(InterfaceC5907c interfaceC5907c, int i10) {
            if (interfaceC5907c != a.f57818q || i10 >= 100) {
                this.f57828a.put(interfaceC5907c.name(), Integer.valueOf(i10));
                return this;
            }
            throw new IllegalArgumentException("Pivot year in far past not supported: " + i10);
        }

        public b d(InterfaceC5907c interfaceC5907c, Enum r52) {
            if (r52 == null) {
                throw new NullPointerException("Missing attribute value for key: " + interfaceC5907c);
            }
            this.f57828a.put(interfaceC5907c.name(), r52);
            if (interfaceC5907c != a.f57807f) {
                if (interfaceC5907c == a.f57813l) {
                    j jVar = (j) j.class.cast(r52);
                    if (jVar.l()) {
                        b(a.f57814m, jVar.j().charAt(0));
                    }
                }
                return this;
            }
            int i10 = C0840a.$SwitchMap$net$time4j$format$Leniency[((g) g.class.cast(r52)).ordinal()];
            if (i10 == 1) {
                e(a.f57810i, false);
                e(a.f57811j, false);
                e(a.f57819r, false);
                e(a.f57812k, false);
                return this;
            }
            if (i10 == 2) {
                e(a.f57810i, true);
                e(a.f57811j, false);
                e(a.f57819r, false);
                e(a.f57812k, true);
                return this;
            }
            if (i10 != 3) {
                throw new UnsupportedOperationException(r52.name());
            }
            e(a.f57810i, true);
            e(a.f57811j, true);
            e(a.f57819r, true);
            e(a.f57812k, true);
            return this;
        }

        public b e(InterfaceC5907c interfaceC5907c, boolean z10) {
            this.f57828a.put(interfaceC5907c.name(), Boolean.valueOf(z10));
            return this;
        }

        public b f(a aVar) {
            this.f57828a.putAll(aVar.f57827a);
            return this;
        }

        public final void g(InterfaceC5907c interfaceC5907c, Object obj) {
            if (obj != null) {
                this.f57828a.put(interfaceC5907c.name(), obj);
                return;
            }
            throw new NullPointerException("Missing attribute value for key: " + interfaceC5907c);
        }

        public b h(Locale locale) {
            g(a.f57804c, locale);
            return this;
        }

        public b i(net.time4j.tz.k kVar) {
            g(a.f57805d, kVar);
            return this;
        }

        public b(oi.x xVar) {
            g(a.f57803b, net.time4j.format.b.a(xVar));
        }
    }

    public a() {
        this.f57827a = Collections.EMPTY_MAP;
    }

    public a(Map map) {
        this.f57827a = Collections.unmodifiableMap(new HashMap(map));
    }
}
