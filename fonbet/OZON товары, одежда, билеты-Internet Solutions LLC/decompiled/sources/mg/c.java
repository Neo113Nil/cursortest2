package mg;

import C.C2702w;
import Gl.C3124a;
import ig.EnumC7074c;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final h f74845a = b.QUARTER_OF_YEAR;

    /* renamed from: b, reason: collision with root package name */
    public static final h f74846b = b.WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: c, reason: collision with root package name */
    public static final h f74847c = b.WEEK_BASED_YEAR;

    /* renamed from: d, reason: collision with root package name */
    public static final k f74848d = EnumC1276c.WEEK_BASED_YEARS;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f74849a;

        static {
            int[] iArr = new int[EnumC1276c.values().length];
            f74849a = iArr;
            try {
                iArr[EnumC1276c.WEEK_BASED_YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74849a[EnumC1276c.QUARTER_YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class b implements h {
        private static final /* synthetic */ b[] $VALUES;
        public static final b DAY_OF_QUARTER;
        private static final int[] QUARTER_DAYS;
        public static final b QUARTER_OF_YEAR;
        public static final b WEEK_BASED_YEAR;
        public static final b WEEK_OF_WEEK_BASED_YEAR;

        enum a extends b {
            a() {
                super("DAY_OF_QUARTER", 0);
            }

            @Override // mg.h
            public final boolean a(e eVar) {
                return eVar.L(EnumC8145a.DAY_OF_YEAR) && eVar.L(EnumC8145a.MONTH_OF_YEAR) && eVar.L(EnumC8145a.YEAR) && jg.g.g(eVar).equals(jg.l.f70047c);
            }

            @Override // mg.h
            public final m d() {
                return m.i(1L, 1L, 90L, 92L);
            }

            @Override // mg.h
            public final <R extends mg.d> R e(R r11, long j11) {
                long f7 = f(r11);
                d().b(j11, this);
                EnumC8145a enumC8145a = EnumC8145a.DAY_OF_YEAR;
                return (R) r11.j1((j11 - f7) + r11.m(enumC8145a), enumC8145a);
            }

            @Override // mg.h
            public final long f(e eVar) {
                if (!eVar.L(this)) {
                    throw new l("Unsupported field: DayOfQuarter");
                }
                int Q11 = eVar.Q(EnumC8145a.DAY_OF_YEAR);
                int Q12 = eVar.Q(EnumC8145a.MONTH_OF_YEAR);
                long m11 = eVar.m(EnumC8145a.YEAR);
                int[] iArr = b.QUARTER_DAYS;
                int i11 = (Q12 - 1) / 3;
                jg.l.f70047c.getClass();
                return Q11 - iArr[i11 + (jg.l.n(m11) ? 4 : 0)];
            }

            @Override // mg.c.b, mg.h
            public final m g(e eVar) {
                if (!eVar.L(this)) {
                    throw new l("Unsupported field: DayOfQuarter");
                }
                long m11 = eVar.m(b.QUARTER_OF_YEAR);
                if (m11 != 1) {
                    return m11 == 2 ? m.h(1L, 91L) : (m11 == 3 || m11 == 4) ? m.h(1L, 92L) : d();
                }
                long m12 = eVar.m(EnumC8145a.YEAR);
                jg.l.f70047c.getClass();
                return jg.l.n(m12) ? m.h(1L, 91L) : m.h(1L, 90L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        }

        /* renamed from: mg.c$b$b, reason: collision with other inner class name */
        enum C1274b extends b {
            C1274b() {
                super("QUARTER_OF_YEAR", 1);
            }

            @Override // mg.h
            public final boolean a(e eVar) {
                return eVar.L(EnumC8145a.MONTH_OF_YEAR) && jg.g.g(eVar).equals(jg.l.f70047c);
            }

            @Override // mg.h
            public final m d() {
                return m.h(1L, 4L);
            }

            @Override // mg.h
            public final <R extends mg.d> R e(R r11, long j11) {
                long f7 = f(r11);
                d().b(j11, this);
                EnumC8145a enumC8145a = EnumC8145a.MONTH_OF_YEAR;
                return (R) r11.j1(((j11 - f7) * 3) + r11.m(enumC8145a), enumC8145a);
            }

            @Override // mg.h
            public final long f(e eVar) {
                if (eVar.L(this)) {
                    return (eVar.m(EnumC8145a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new l("Unsupported field: QuarterOfYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        }

        /* renamed from: mg.c$b$c, reason: collision with other inner class name */
        enum C1275c extends b {
            C1275c() {
                super("WEEK_OF_WEEK_BASED_YEAR", 2);
            }

            @Override // mg.h
            public final boolean a(e eVar) {
                return eVar.L(EnumC8145a.EPOCH_DAY) && jg.g.g(eVar).equals(jg.l.f70047c);
            }

            @Override // mg.h
            public final m d() {
                return m.i(1L, 1L, 52L, 53L);
            }

            @Override // mg.h
            public final <R extends mg.d> R e(R r11, long j11) {
                d().b(j11, this);
                long f7 = f(r11);
                long j12 = j11 - f7;
                if ((j11 ^ j12) >= 0 || (j11 ^ f7) >= 0) {
                    return (R) r11.T0(j12, mg.b.WEEKS);
                }
                StringBuilder d11 = C2702w.d(j11, "Subtraction overflows a long: ", " - ");
                d11.append(f7);
                throw new ArithmeticException(d11.toString());
            }

            @Override // mg.h
            public final long f(e eVar) {
                if (eVar.L(this)) {
                    return b.j(ig.f.l1(eVar));
                }
                throw new l("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // mg.c.b, mg.h
            public final m g(e eVar) {
                if (eVar.L(this)) {
                    return b.i(ig.f.l1(eVar));
                }
                throw new l("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        }

        enum d extends b {
            d() {
                super("WEEK_BASED_YEAR", 3);
            }

            @Override // mg.h
            public final boolean a(e eVar) {
                return eVar.L(EnumC8145a.EPOCH_DAY) && jg.g.g(eVar).equals(jg.l.f70047c);
            }

            @Override // mg.h
            public final m d() {
                return EnumC8145a.YEAR.d();
            }

            @Override // mg.h
            public final <R extends mg.d> R e(R r11, long j11) {
                if (!a(r11)) {
                    throw new l("Unsupported field: WeekBasedYear");
                }
                int a11 = EnumC8145a.YEAR.d().a(j11, b.WEEK_BASED_YEAR);
                ig.f l12 = ig.f.l1(r11);
                int Q11 = l12.Q(EnumC8145a.DAY_OF_WEEK);
                int j12 = b.j(l12);
                if (j12 == 53 && b.p(a11) == 52) {
                    j12 = 52;
                }
                return (R) r11.k1(ig.f.E1(a11, 1, 4).M1(((j12 - 1) * 7) + (Q11 - r6.Q(r0))));
            }

            @Override // mg.h
            public final long f(e eVar) {
                if (eVar.L(this)) {
                    return b.n(ig.f.l1(eVar));
                }
                throw new l("Unsupported field: WeekBasedYear");
            }

            @Override // mg.c.b, mg.h
            public final m g(e eVar) {
                return EnumC8145a.YEAR.d();
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        }

        static {
            a aVar = new a();
            DAY_OF_QUARTER = aVar;
            C1274b c1274b = new C1274b();
            QUARTER_OF_YEAR = c1274b;
            C1275c c1275c = new C1275c();
            WEEK_OF_WEEK_BASED_YEAR = c1275c;
            d dVar = new d();
            WEEK_BASED_YEAR = dVar;
            $VALUES = new b[]{aVar, c1274b, c1275c, dVar};
            QUARTER_DAYS = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        private b() {
            throw null;
        }

        static m i(ig.f fVar) {
            return m.h(1L, p(n(fVar)));
        }

        static int j(ig.f fVar) {
            int ordinal = fVar.q1().ordinal();
            int t12 = fVar.t1() - 1;
            int i11 = (3 - ordinal) + t12;
            int i12 = i11 - ((i11 / 7) * 7);
            int i13 = i12 - 3;
            if (i13 < -3) {
                i13 = i12 + 4;
            }
            if (t12 < i13) {
                return (int) m.h(1L, p(n(fVar.c2(180).S1(-1L)))).d();
            }
            int a11 = C3124a.a(t12, i13, 7, 1);
            if (a11 != 53 || i13 == -3 || (i13 == -2 && fVar.y1())) {
                return a11;
            }
            return 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int n(ig.f fVar) {
            int v12 = fVar.v1();
            int t12 = fVar.t1();
            if (t12 <= 3) {
                return t12 - fVar.q1().ordinal() < -2 ? v12 - 1 : v12;
            }
            if (t12 >= 363) {
                return ((t12 - 363) - (fVar.y1() ? 1 : 0)) - fVar.q1().ordinal() >= 0 ? v12 + 1 : v12;
            }
            return v12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int p(int i11) {
            ig.f E12 = ig.f.E1(i11, 1, 1);
            if (E12.q1() != EnumC7074c.THURSDAY) {
                return (E12.q1() == EnumC7074c.WEDNESDAY && E12.y1()) ? 53 : 52;
            }
            return 53;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @Override // mg.h
        public final boolean b() {
            return true;
        }

        @Override // mg.h
        public m g(e eVar) {
            return d();
        }
    }

    /* renamed from: mg.c$c, reason: collision with other inner class name */
    private enum EnumC1276c implements k {
        WEEK_BASED_YEARS("WeekBasedYears", ig.d.e(31556952)),
        QUARTER_YEARS("QuarterYears", ig.d.e(7889238));

        private final ig.d duration;
        private final String name;

        EnumC1276c(String str, ig.d dVar) {
            this.name = str;
            this.duration = dVar;
        }

        @Override // mg.k
        public final <R extends d> R a(R r11, long j11) {
            int i11 = a.f74849a[ordinal()];
            if (i11 == 1) {
                return (R) r11.j1(lg.c.g(r11.Q(r0), j11), c.f74847c);
            }
            if (i11 == 2) {
                return (R) r11.T0(j11 / 256, mg.b.YEARS).T0((j11 % 256) * 3, mg.b.MONTHS);
            }
            throw new IllegalStateException("Unreachable");
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.name;
        }
    }

    static {
        EnumC1276c enumC1276c = EnumC1276c.WEEK_BASED_YEARS;
    }
}
