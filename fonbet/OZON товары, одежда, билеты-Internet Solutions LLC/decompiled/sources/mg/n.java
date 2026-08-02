package mg;

import ig.EnumC7074c;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes10.dex */
public final class n implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    private static final ConcurrentHashMap f74863g = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f74864h = 0;

    /* renamed from: a, reason: collision with root package name */
    private final EnumC7074c f74865a;

    /* renamed from: b, reason: collision with root package name */
    private final int f74866b;

    /* renamed from: c, reason: collision with root package name */
    private final transient h f74867c = a.i(this);

    /* renamed from: d, reason: collision with root package name */
    private final transient h f74868d = a.k(this);

    /* renamed from: e, reason: collision with root package name */
    private final transient h f74869e;

    /* renamed from: f, reason: collision with root package name */
    private final transient h f74870f;

    static class a implements h {

        /* renamed from: f, reason: collision with root package name */
        private static final m f74871f = m.h(1, 7);

        /* renamed from: g, reason: collision with root package name */
        private static final m f74872g = m.i(0, 1, 4, 6);

        /* renamed from: h, reason: collision with root package name */
        private static final m f74873h;

        /* renamed from: i, reason: collision with root package name */
        private static final m f74874i;

        /* renamed from: a, reason: collision with root package name */
        private final String f74875a;

        /* renamed from: b, reason: collision with root package name */
        private final n f74876b;

        /* renamed from: c, reason: collision with root package name */
        private final Enum f74877c;

        /* renamed from: d, reason: collision with root package name */
        private final Enum f74878d;

        /* renamed from: e, reason: collision with root package name */
        private final m f74879e;

        static {
            m.i(0L, 1L, 52L, 54L);
            f74873h = m.i(1L, 1L, 52L, 53L);
            f74874i = EnumC8145a.YEAR.d();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private a(String str, n nVar, k kVar, k kVar2, m mVar) {
            this.f74875a = str;
            this.f74876b = nVar;
            this.f74877c = (Enum) kVar;
            this.f74878d = (Enum) kVar2;
            this.f74879e = mVar;
        }

        private static int c(int i11, int i12) {
            return ((i12 - 1) + (i11 + 7)) / 7;
        }

        private long h(e eVar, int i11) {
            int Q11 = eVar.Q(EnumC8145a.DAY_OF_YEAR);
            return c(n(Q11, i11), Q11);
        }

        static a i(n nVar) {
            return new a("DayOfWeek", nVar, b.DAYS, b.WEEKS, f74871f);
        }

        static a j(n nVar) {
            return new a("WeekBasedYear", nVar, c.f74848d, b.FOREVER, f74874i);
        }

        static a k(n nVar) {
            return new a("WeekOfMonth", nVar, b.WEEKS, b.MONTHS, f74872g);
        }

        static a l(n nVar) {
            return new a("WeekOfWeekBasedYear", nVar, b.WEEKS, c.f74848d, f74873h);
        }

        private m m(e eVar) {
            n nVar = this.f74876b;
            int c11 = lg.c.c(eVar.Q(EnumC8145a.DAY_OF_WEEK) - nVar.d().a(), 7) + 1;
            long h11 = h(eVar, c11);
            if (h11 == 0) {
                return m(jg.g.g(eVar).a(eVar).s(2L, b.WEEKS));
            }
            return h11 >= ((long) c(n(eVar.Q(EnumC8145a.DAY_OF_YEAR), c11), nVar.e() + (ig.n.E0((long) eVar.Q(EnumC8145a.YEAR)) ? 366 : 365))) ? m(jg.g.g(eVar).a(eVar).T0(2L, b.WEEKS)) : m.h(1L, r0 - 1);
        }

        private int n(int i11, int i12) {
            int c11 = lg.c.c(i11 - i12, 7);
            return c11 + 1 > this.f74876b.e() ? 7 - c11 : -c11;
        }

        @Override // mg.h
        public final boolean a(e eVar) {
            if (!eVar.L(EnumC8145a.DAY_OF_WEEK)) {
                return false;
            }
            b bVar = b.WEEKS;
            Enum r12 = this.f74878d;
            if (r12 == bVar) {
                return true;
            }
            if (r12 == b.MONTHS) {
                return eVar.L(EnumC8145a.DAY_OF_MONTH);
            }
            if (r12 == b.YEARS) {
                return eVar.L(EnumC8145a.DAY_OF_YEAR);
            }
            if (r12 == c.f74848d || r12 == b.FOREVER) {
                return eVar.L(EnumC8145a.EPOCH_DAY);
            }
            return false;
        }

        @Override // mg.h
        public final boolean b() {
            return true;
        }

        @Override // mg.h
        public final m d() {
            return this.f74879e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Enum, mg.k] */
        @Override // mg.h
        public final <R extends d> R e(R r11, long j11) {
            int a11 = this.f74879e.a(j11, this);
            if (a11 == r11.Q(this)) {
                return r11;
            }
            if (this.f74878d != b.FOREVER) {
                return (R) r11.T0(a11 - r1, this.f74877c);
            }
            int Q11 = r11.Q(this.f74876b.f74869e);
            long j12 = (long) ((j11 - r1) * 52.1775d);
            b bVar = b.WEEKS;
            d T02 = r11.T0(j12, bVar);
            if (T02.Q(this) > a11) {
                return (R) T02.s(T02.Q(r2.f74869e), bVar);
            }
            if (T02.Q(this) < a11) {
                T02 = T02.T0(2L, bVar);
            }
            R r12 = (R) T02.T0(Q11 - T02.Q(r2.f74869e), bVar);
            return r12.Q(this) > a11 ? (R) r12.s(1L, bVar) : r12;
        }

        @Override // mg.h
        public final long f(e eVar) {
            int i11;
            int c11;
            n nVar = this.f74876b;
            int a11 = nVar.d().a();
            EnumC8145a enumC8145a = EnumC8145a.DAY_OF_WEEK;
            int c12 = lg.c.c(eVar.Q(enumC8145a) - a11, 7) + 1;
            b bVar = b.WEEKS;
            Enum r52 = this.f74878d;
            if (r52 == bVar) {
                return c12;
            }
            if (r52 == b.MONTHS) {
                int Q11 = eVar.Q(EnumC8145a.DAY_OF_MONTH);
                c11 = c(n(Q11, c12), Q11);
            } else {
                if (r52 != b.YEARS) {
                    if (r52 == c.f74848d) {
                        int c13 = lg.c.c(eVar.Q(enumC8145a) - nVar.d().a(), 7) + 1;
                        long h11 = h(eVar, c13);
                        if (h11 == 0) {
                            i11 = ((int) h(jg.g.g(eVar).a(eVar).s(1L, bVar), c13)) + 1;
                        } else {
                            if (h11 >= 53) {
                                if (h11 >= c(n(eVar.Q(EnumC8145a.DAY_OF_YEAR), c13), nVar.e() + (ig.n.E0((long) eVar.Q(EnumC8145a.YEAR)) ? 366 : 365))) {
                                    h11 -= r13 - 1;
                                }
                            }
                            i11 = (int) h11;
                        }
                        return i11;
                    }
                    if (r52 != b.FOREVER) {
                        throw new IllegalStateException("unreachable");
                    }
                    int c14 = lg.c.c(eVar.Q(enumC8145a) - nVar.d().a(), 7) + 1;
                    int Q12 = eVar.Q(EnumC8145a.YEAR);
                    long h12 = h(eVar, c14);
                    if (h12 == 0) {
                        Q12--;
                    } else if (h12 >= 53) {
                        if (h12 >= c(n(eVar.Q(EnumC8145a.DAY_OF_YEAR), c14), nVar.e() + (ig.n.E0((long) Q12) ? 366 : 365))) {
                            Q12++;
                        }
                    }
                    return Q12;
                }
                int Q13 = eVar.Q(EnumC8145a.DAY_OF_YEAR);
                c11 = c(n(Q13, c12), Q13);
            }
            return c11;
        }

        @Override // mg.h
        public final m g(e eVar) {
            EnumC8145a enumC8145a;
            b bVar = b.WEEKS;
            Enum r12 = this.f74878d;
            if (r12 == bVar) {
                return this.f74879e;
            }
            if (r12 == b.MONTHS) {
                enumC8145a = EnumC8145a.DAY_OF_MONTH;
            } else {
                if (r12 != b.YEARS) {
                    if (r12 == c.f74848d) {
                        return m(eVar);
                    }
                    if (r12 == b.FOREVER) {
                        return eVar.p(EnumC8145a.YEAR);
                    }
                    throw new IllegalStateException("unreachable");
                }
                enumC8145a = EnumC8145a.DAY_OF_YEAR;
            }
            int n11 = n(eVar.Q(enumC8145a), lg.c.c(eVar.Q(EnumC8145a.DAY_OF_WEEK) - this.f74876b.d().a(), 7) + 1);
            m p11 = eVar.p(enumC8145a);
            return m.h(c(n11, (int) p11.e()), c(n11, (int) p11.d()));
        }

        public final String toString() {
            return this.f74875a + "[" + this.f74876b.toString() + "]";
        }
    }

    static {
        new n(4, EnumC7074c.MONDAY);
        f(1, EnumC7074c.SUNDAY);
    }

    private n(int i11, EnumC7074c enumC7074c) {
        b bVar = b.NANOS;
        this.f74869e = a.l(this);
        this.f74870f = a.j(this);
        lg.c.e(enumC7074c, "firstDayOfWeek");
        if (i11 < 1 || i11 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f74865a = enumC7074c;
        this.f74866b = i11;
    }

    public static n f(int i11, EnumC7074c enumC7074c) {
        String str = enumC7074c.toString() + i11;
        ConcurrentHashMap concurrentHashMap = f74863g;
        n nVar = (n) concurrentHashMap.get(str);
        if (nVar != null) {
            return nVar;
        }
        concurrentHashMap.putIfAbsent(str, new n(i11, enumC7074c));
        return (n) concurrentHashMap.get(str);
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return f(this.f74866b, this.f74865a);
        } catch (IllegalArgumentException e11) {
            throw new InvalidObjectException("Invalid WeekFields" + e11.getMessage());
        }
    }

    public final h b() {
        return this.f74867c;
    }

    public final EnumC7074c d() {
        return this.f74865a;
    }

    public final int e() {
        return this.f74866b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && hashCode() == obj.hashCode();
    }

    public final h g() {
        return this.f74870f;
    }

    public final h h() {
        return this.f74868d;
    }

    public final int hashCode() {
        return (this.f74865a.ordinal() * 7) + this.f74866b;
    }

    public final h i() {
        return this.f74869e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WeekFields[");
        sb2.append(this.f74865a);
        sb2.append(',');
        return Ek.a.d(sb2, this.f74866b, ']');
    }
}
