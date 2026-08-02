package net.time4j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: net.time4j.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class EnumC5706f implements InterfaceC5727u {
    private static final /* synthetic */ EnumC5706f[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC5706f f57791a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC5706f f57792b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC5706f f57793c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC5706f f57794d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC5706f f57795e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC5706f f57796f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC5706f f57797g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC5706f f57798h;

    /* renamed from: co, reason: collision with root package name */
    private final InterfaceC5727u f57799co;
    private final InterfaceC5727u eof;
    private final InterfaceC5727u joda;
    private final InterfaceC5727u kld;
    private final InterfaceC5727u nvd;

    /* renamed from: ui, reason: collision with root package name */
    private final InterfaceC5727u f57800ui;

    /* renamed from: net.time4j.f$a */
    public enum a extends EnumC5706f {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // net.time4j.InterfaceC5729w
        public char a() {
            return 'I';
        }

        @Override // oi.w
        public double getLength() {
            return 3.1556952E10d;
        }
    }

    /* renamed from: net.time4j.f$i */
    public static /* synthetic */ class i {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$CalendarUnit;

        static {
            int[] iArr = new int[EnumC5706f.values().length];
            $SwitchMap$net$time4j$CalendarUnit = iArr;
            try {
                iArr[EnumC5706f.f57797g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[EnumC5706f.f57798h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[EnumC5706f.f57791a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[EnumC5706f.f57792b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[EnumC5706f.f57793c.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[EnumC5706f.f57794d.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[EnumC5706f.f57795e.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[EnumC5706f.f57796f.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: net.time4j.f$j */
    public static class j implements oi.M {

        /* renamed from: a, reason: collision with root package name */
        public final EnumC5706f f57801a;

        /* renamed from: b, reason: collision with root package name */
        public final int f57802b;

        public j(EnumC5706f enumC5706f) {
            this(enumC5706f, 0);
        }

        public static long e(F f10, F f11) {
            return f10.n() == f11.n() ? f11.v0() - f10.v0() : f11.w0() - f10.w0();
        }

        @Override // oi.M
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.q b(oi.q qVar, long j10) {
            oi.p pVar = F.f57534l;
            return qVar.y(pVar, F.m0(this.f57801a, (F) qVar.j(pVar), j10, this.f57802b));
        }

        @Override // oi.M
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(oi.q qVar, oi.q qVar2) {
            long e10;
            oi.p pVar = F.f57534l;
            F f10 = (F) qVar.j(pVar);
            F f11 = (F) qVar2.j(pVar);
            switch (i.$SwitchMap$net$time4j$CalendarUnit[this.f57801a.ordinal()]) {
                case 1:
                    e10 = e(f10, f11) / 7;
                    break;
                case 2:
                    e10 = e(f10, f11);
                    break;
                case 3:
                    e10 = f(f10, f11) / 12000;
                    break;
                case 4:
                    e10 = f(f10, f11) / 1200;
                    break;
                case 5:
                    e10 = f(f10, f11) / 120;
                    break;
                case 6:
                    e10 = f(f10, f11) / 12;
                    break;
                case 7:
                    e10 = f(f10, f11) / 3;
                    break;
                case 8:
                    e10 = f(f10, f11);
                    break;
                default:
                    throw new UnsupportedOperationException(this.f57801a.name());
            }
            if (e10 == 0) {
                return e10;
            }
            oi.p pVar2 = G.f57584n;
            if (!qVar.f(pVar2) || !qVar2.f(pVar2)) {
                return e10;
            }
            EnumC5706f enumC5706f = this.f57801a;
            if (enumC5706f != EnumC5706f.f57798h && ((F) f10.E(e10, enumC5706f)).G(f11) != 0) {
                return e10;
            }
            G g10 = (G) qVar.j(pVar2);
            G g11 = (G) qVar2.j(pVar2);
            return (e10 <= 0 || !g10.r0(g11)) ? (e10 >= 0 || !g10.s0(g11)) ? e10 : e10 + 1 : e10 - 1;
        }

        public final long f(F f10, F f11) {
            long x02 = f11.x0() - f10.x0();
            int i10 = this.f57802b;
            if (i10 != 5 && i10 != 2 && i10 != 6) {
                return (x02 <= 0 || f11.p() >= f10.p()) ? (x02 >= 0 || f11.p() <= f10.p()) ? x02 : x02 + 1 : x02 - 1;
            }
            EnumC5706f enumC5706f = EnumC5706f.f57796f;
            return (x02 <= 0 || !F.m0(enumC5706f, f10, x02, i10).J(f11)) ? (x02 >= 0 || !F.m0(enumC5706f, f10, x02, this.f57802b).K(f11)) ? x02 : x02 + 1 : x02 - 1;
        }

        public j(EnumC5706f enumC5706f, int i10) {
            this.f57801a = enumC5706f;
            this.f57802b = i10;
        }
    }

    static {
        a aVar = new a("MILLENNIA", 0);
        f57791a = aVar;
        EnumC5706f enumC5706f = new EnumC5706f("CENTURIES", 1) { // from class: net.time4j.f.b
            {
                a aVar2 = null;
            }

            @Override // net.time4j.InterfaceC5729w
            public char a() {
                return 'C';
            }

            @Override // oi.w
            public double getLength() {
                return 3.1556952E9d;
            }
        };
        f57792b = enumC5706f;
        EnumC5706f enumC5706f2 = new EnumC5706f("DECADES", 2) { // from class: net.time4j.f.c
            {
                a aVar2 = null;
            }

            @Override // net.time4j.InterfaceC5729w
            public char a() {
                return 'E';
            }

            @Override // oi.w
            public double getLength() {
                return 3.1556952E8d;
            }
        };
        f57793c = enumC5706f2;
        EnumC5706f enumC5706f3 = new EnumC5706f("YEARS", 3) { // from class: net.time4j.f.d
            {
                a aVar2 = null;
            }

            @Override // net.time4j.InterfaceC5729w
            public char a() {
                return 'Y';
            }

            @Override // oi.w
            public double getLength() {
                return 3.1556952E7d;
            }
        };
        f57794d = enumC5706f3;
        EnumC5706f enumC5706f4 = new EnumC5706f("QUARTERS", 4) { // from class: net.time4j.f.e
            {
                a aVar2 = null;
            }

            @Override // net.time4j.InterfaceC5729w
            public char a() {
                return 'Q';
            }

            @Override // oi.w
            public double getLength() {
                return 7889238.0d;
            }
        };
        f57795e = enumC5706f4;
        EnumC5706f enumC5706f5 = new EnumC5706f("MONTHS", 5) { // from class: net.time4j.f.f
            {
                a aVar2 = null;
            }

            @Override // net.time4j.InterfaceC5729w
            public char a() {
                return 'M';
            }

            @Override // oi.w
            public double getLength() {
                return 2629746.0d;
            }
        };
        f57796f = enumC5706f5;
        EnumC5706f enumC5706f6 = new EnumC5706f("WEEKS", 6) { // from class: net.time4j.f.g
            {
                a aVar2 = null;
            }

            @Override // net.time4j.InterfaceC5729w
            public char a() {
                return 'W';
            }

            @Override // oi.w
            public double getLength() {
                return 604800.0d;
            }
        };
        f57797g = enumC5706f6;
        EnumC5706f enumC5706f7 = new EnumC5706f("DAYS", 7) { // from class: net.time4j.f.h
            {
                a aVar2 = null;
            }

            @Override // net.time4j.InterfaceC5729w
            public char a() {
                return 'D';
            }

            @Override // oi.w
            public double getLength() {
                return 86400.0d;
            }
        };
        f57798h = enumC5706f7;
        $VALUES = new EnumC5706f[]{aVar, enumC5706f, enumC5706f2, enumC5706f3, enumC5706f4, enumC5706f5, enumC5706f6, enumC5706f7};
    }

    public EnumC5706f(String str, int i10) {
        this.eof = new E(this, 2);
        this.kld = new E(this, 5);
        this.f57800ui = new E(this, 4);
        this.nvd = new E(this, 1);
        this.f57799co = new E(this, 3);
        this.joda = new E(this, 6);
    }

    public static InterfaceC5727u d() {
        return X.f57677a;
    }

    public static EnumC5706f valueOf(String str) {
        return (EnumC5706f) Enum.valueOf(EnumC5706f.class, str);
    }

    public static EnumC5706f[] values() {
        return (EnumC5706f[]) $VALUES.clone();
    }

    @Override // oi.w
    public boolean b() {
        return true;
    }

    public long c(oi.K k10, oi.K k11) {
        return k10.F(k11, this);
    }

    public /* synthetic */ EnumC5706f(String str, int i10, a aVar) {
        this(str, i10);
    }
}
