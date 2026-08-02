package net.time4j.calendar;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import li.AbstractC5469c;
import mi.k;
import net.time4j.Y;
import net.time4j.a0;
import oi.AbstractC5909e;
import oi.EnumC5900A;
import oi.InterfaceC5908d;
import oi.o;
import oi.p;
import oi.q;
import oi.s;
import oi.x;
import oi.z;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final p f57761a = k.f56638a;

    public static class b implements z {

        /* renamed from: a, reason: collision with root package name */
        public final d f57762a;

        private p a(q qVar, boolean z10) {
            f P10 = f.P(qVar.getClass(), this.f57762a.model);
            int q10 = q(qVar);
            EnumC5900A enumC5900A = EnumC5900A.UTC;
            long longValue = ((Long) qVar.j(enumC5900A)).longValue();
            int e10 = qVar.e(this.f57762a.dayElement);
            if (z10) {
                if (((Integer) qVar.c(this.f57762a.dayElement)).intValue() < e10 + (((Long) qVar.y(P10, qVar.c(P10)).j(enumC5900A)).longValue() - longValue)) {
                    return this.f57762a.dayElement;
                }
            } else if (q10 <= 1) {
                if (((Integer) qVar.m(this.f57762a.dayElement)).intValue() > e10 - (longValue - ((Long) qVar.y(P10, qVar.m(P10)).j(enumC5900A)).longValue())) {
                    return this.f57762a.dayElement;
                }
            }
            return P10;
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public p b(q qVar) {
            return a(qVar, true);
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p d(q qVar) {
            return a(qVar, false);
        }

        public final int g(q qVar) {
            return r(qVar, 1);
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer e(q qVar) {
            return Integer.valueOf(g(qVar));
        }

        public final int k(q qVar) {
            return r(qVar, -1);
        }

        @Override // oi.z
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer i(q qVar) {
            return Integer.valueOf(k(qVar));
        }

        @Override // oi.z
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Integer p(q qVar) {
            return Integer.valueOf(q(qVar));
        }

        public final int q(q qVar) {
            return r(qVar, 0);
        }

        public final int r(q qVar, int i10) {
            int e10 = qVar.e(this.f57762a.dayElement);
            int c10 = a.c((((Long) qVar.j(EnumC5900A.UTC)).longValue() - e10) + 1).c(this.f57762a.model);
            int i11 = c10 <= 8 - this.f57762a.model.g() ? 2 - c10 : 9 - c10;
            if (i10 == -1) {
                e10 = 1;
            } else if (i10 != 0) {
                if (i10 != 1) {
                    throw new AssertionError("Unexpected: " + i10);
                }
                e10 = ((Integer) qVar.c(this.f57762a.dayElement)).intValue();
            }
            return AbstractC5469c.a(e10 - i11, 7) + 1;
        }

        public final q s(q qVar, int i10) {
            int q10 = q(qVar);
            if (i10 == q10) {
                return qVar;
            }
            int i11 = (i10 - q10) * 7;
            EnumC5900A enumC5900A = EnumC5900A.UTC;
            return qVar.x(enumC5900A, ((Long) qVar.j(enumC5900A)).longValue() + i11);
        }

        @Override // oi.z
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public q q(q qVar, Integer num, boolean z10) {
            if (num != null && (z10 || isValid(qVar, num))) {
                return s(qVar, num.intValue());
            }
            throw new IllegalArgumentException("Invalid value: " + num + " (context=" + qVar + ")");
        }

        public b(d dVar) {
            this.f57762a = dVar;
        }

        @Override // oi.z
        public boolean isValid(q qVar, Integer num) {
            int intValue;
            return num != null && (intValue = num.intValue()) >= k(qVar) && intValue <= g(qVar);
        }
    }

    public static class c implements z {

        /* renamed from: a, reason: collision with root package name */
        public final d f57763a;

        public final int a(q qVar) {
            int k10;
            int e10 = qVar.e(this.f57763a.dayElement);
            int j10 = j(qVar, 0);
            if (j10 > e10) {
                k10 = ((e10 + k(qVar, -1)) - j(qVar, -1)) / 7;
            } else {
                if (j(qVar, 1) + k(qVar, 0) <= e10) {
                    return 1;
                }
                k10 = (e10 - j10) / 7;
            }
            return k10 + 1;
        }

        public final p c(Object obj) {
            return new f((Class) obj, this.f57763a.model);
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p b(q qVar) {
            return c(qVar.getClass());
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public p d(q qVar) {
            return c(qVar.getClass());
        }

        public final int j(q qVar, int i10) {
            Y s10 = s(qVar, i10);
            a0 a0Var = this.f57763a.model;
            int c10 = s10.c(a0Var);
            return c10 <= 8 - a0Var.g() ? 2 - c10 : 9 - c10;
        }

        public final int k(q qVar, int i10) {
            int e10 = qVar.e(this.f57763a.dayElement);
            if (i10 == -1) {
                p pVar = this.f57763a.dayElement;
                EnumC5900A enumC5900A = EnumC5900A.UTC;
                return a.d(pVar, qVar.x(enumC5900A, ((Long) qVar.j(enumC5900A)).longValue() - e10));
            }
            if (i10 == 0) {
                return a.d(this.f57763a.dayElement, qVar);
            }
            if (i10 == 1) {
                int d10 = a.d(this.f57763a.dayElement, qVar);
                p pVar2 = this.f57763a.dayElement;
                EnumC5900A enumC5900A2 = EnumC5900A.UTC;
                return a.d(pVar2, qVar.x(enumC5900A2, ((((Long) qVar.j(enumC5900A2)).longValue() + d10) + 1) - e10));
            }
            throw new AssertionError("Unexpected: " + i10);
        }

        public final int l(q qVar) {
            int e10 = qVar.e(this.f57763a.dayElement);
            int j10 = j(qVar, 0);
            if (j10 > e10) {
                return ((j10 + k(qVar, -1)) - j(qVar, -1)) / 7;
            }
            int j11 = j(qVar, 1) + k(qVar, 0);
            if (j11 <= e10) {
                try {
                    int j12 = j(qVar, 1);
                    EnumC5900A enumC5900A = EnumC5900A.UTC;
                    j11 = j(qVar.x(enumC5900A, ((Long) qVar.j(enumC5900A)).longValue() + 7), 1) + k(qVar, 1);
                    j10 = j12;
                } catch (RuntimeException unused) {
                    j11 += 7;
                }
            }
            return (j11 - j10) / 7;
        }

        @Override // oi.z
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Integer e(q qVar) {
            return Integer.valueOf(l(qVar));
        }

        @Override // oi.z
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public Integer i(q qVar) {
            return 1;
        }

        @Override // oi.z
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public Integer p(q qVar) {
            return Integer.valueOf(a(qVar));
        }

        public final Y s(q qVar, int i10) {
            int e10 = qVar.e(this.f57763a.dayElement);
            if (i10 == -1) {
                return a.c(((((Long) qVar.j(EnumC5900A.UTC)).longValue() - e10) - qVar.x(r8, r4).e(this.f57763a.dayElement)) + 1);
            }
            if (i10 == 0) {
                return a.c((((Long) qVar.j(EnumC5900A.UTC)).longValue() - e10) + 1);
            }
            if (i10 == 1) {
                return a.c(((((Long) qVar.j(EnumC5900A.UTC)).longValue() + a.d(this.f57763a.dayElement, qVar)) + 1) - e10);
            }
            throw new AssertionError("Unexpected: " + i10);
        }

        public final q t(q qVar, int i10) {
            if (i10 == a(qVar)) {
                return qVar;
            }
            EnumC5900A enumC5900A = EnumC5900A.UTC;
            return qVar.x(enumC5900A, ((Long) qVar.j(enumC5900A)).longValue() + ((i10 - r0) * 7));
        }

        @Override // oi.z
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public q q(q qVar, Integer num, boolean z10) {
            int intValue = num.intValue();
            if (z10 || isValid(qVar, num)) {
                return t(qVar, intValue);
            }
            throw new IllegalArgumentException("Invalid value: " + intValue + " (context=" + qVar + ")");
        }

        public c(d dVar) {
            this.f57763a = dVar;
        }

        @Override // oi.z
        public boolean isValid(q qVar, Integer num) {
            int intValue;
            return num != null && (intValue = num.intValue()) >= 1 && intValue <= l(qVar);
        }
    }

    public static class d extends ni.f {
        private static final long serialVersionUID = -7471192143785466686L;
        private final boolean bounded;
        private final p dayElement;
        private final a0 model;

        public d(String str, Class cls, int i10, int i11, char c10, a0 a0Var, p pVar, boolean z10) {
            super(str, cls, i10, i11, c10);
            if (a0Var == null) {
                throw new NullPointerException("Missing week model.");
            }
            this.model = a0Var;
            this.dayElement = pVar;
            this.bounded = z10;
        }

        public static d C(String str, Class cls, int i10, int i11, char c10, a0 a0Var, p pVar, boolean z10) {
            return new d(str, cls, i10, i11, c10, a0Var, pVar, z10);
        }

        @Override // oi.AbstractC5909e, oi.p
        public boolean g() {
            return true;
        }

        @Override // oi.AbstractC5909e
        public z r(x xVar) {
            if (x().equals(xVar.r())) {
                return this.bounded ? new b(this) : new c(this);
            }
            return null;
        }

        @Override // ni.d
        public Object readResolve() {
            return this;
        }

        @Override // ni.d, oi.AbstractC5909e
        public boolean s(AbstractC5909e abstractC5909e) {
            if (super.s(abstractC5909e)) {
                d dVar = (d) d.class.cast(abstractC5909e);
                if (this.model.equals(dVar.model) && this.bounded == dVar.bounded) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class e implements z {

        /* renamed from: a, reason: collision with root package name */
        public final f f57764a;

        @Override // oi.z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p b(q qVar) {
            return null;
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public p d(q qVar) {
            return null;
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Y e(q qVar) {
            long a10 = x.z(qVar.getClass()).q().a();
            long longValue = ((Long) qVar.j(EnumC5900A.UTC)).longValue();
            return (longValue + 7) - ((long) a.c(longValue).c(this.f57764a.model)) > a10 ? a.c(a10) : this.f57764a.c();
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Y i(q qVar) {
            long d10 = x.z(qVar.getClass()).q().d();
            long longValue = ((Long) qVar.j(EnumC5900A.UTC)).longValue();
            return (longValue + 1) - ((long) a.c(longValue).c(this.f57764a.model)) < d10 ? a.c(d10) : this.f57764a.d0();
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Y p(q qVar) {
            return a.c(((Long) qVar.j(EnumC5900A.UTC)).longValue());
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public q q(q qVar, Y y10, boolean z10) {
            EnumC5900A enumC5900A = EnumC5900A.UTC;
            long longValue = ((Long) qVar.j(enumC5900A)).longValue();
            if (y10 == a.c(longValue)) {
                return qVar;
            }
            return qVar.x(enumC5900A, (longValue + y10.c(this.f57764a.model)) - r2.c(this.f57764a.model));
        }

        public e(f fVar) {
            this.f57764a = fVar;
        }

        @Override // oi.z
        public boolean isValid(q qVar, Y y10) {
            if (y10 == null) {
                return false;
            }
            try {
                q(qVar, y10, false);
                return true;
            } catch (ArithmeticException | IllegalArgumentException unused) {
                return false;
            }
        }
    }

    public static class f extends ni.e {
        private static final long serialVersionUID = 5613494586572932860L;
        private final a0 model;

        public f(Class cls, a0 a0Var) {
            super("LOCAL_DAY_OF_WEEK", cls, Y.class, 'e');
            this.model = a0Var;
        }

        public static f P(Class cls, a0 a0Var) {
            return new f(cls, a0Var);
        }

        @Override // ni.e
        public boolean E() {
            return true;
        }

        @Override // oi.p
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public Y c() {
            return this.model.f().d(6);
        }

        @Override // oi.p
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public Y d0() {
            return this.model.f();
        }

        @Override // ni.e
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public int G(Y y10) {
            return y10.c(this.model);
        }

        @Override // oi.AbstractC5909e, java.util.Comparator
        /* renamed from: q */
        public int compare(o oVar, o oVar2) {
            int c10 = ((Y) oVar.j(this)).c(this.model);
            int c11 = ((Y) oVar2.j(this)).c(this.model);
            if (c10 < c11) {
                return -1;
            }
            return c10 == c11 ? 0 : 1;
        }

        @Override // oi.AbstractC5909e
        public z r(x xVar) {
            if (x().equals(xVar.r())) {
                return new e(this);
            }
            return null;
        }

        @Override // ni.d
        public Object readResolve() {
            return this;
        }

        @Override // ni.d, oi.AbstractC5909e
        public boolean s(AbstractC5909e abstractC5909e) {
            if (!super.s(abstractC5909e)) {
                return false;
            }
            return this.model.equals(((f) f.class.cast(abstractC5909e)).model);
        }
    }

    public static Y c(long j10) {
        return Y.f(AbstractC5469c.d(j10 + 5, 7) + 1);
    }

    public static int d(p pVar, q qVar) {
        return ((Integer) Integer.class.cast(qVar.c(pVar))).intValue();
    }

    public static class g implements s {

        /* renamed from: a, reason: collision with root package name */
        public final Class f57765a;

        /* renamed from: b, reason: collision with root package name */
        public final p f57766b;

        /* renamed from: c, reason: collision with root package name */
        public final p f57767c;

        /* renamed from: d, reason: collision with root package name */
        public final a0 f57768d;

        public g(Class cls, p pVar, p pVar2, a0 a0Var) {
            this.f57765a = cls;
            this.f57766b = pVar;
            this.f57767c = pVar2;
            this.f57768d = a0Var;
        }

        @Override // oi.s
        public boolean a(p pVar) {
            return false;
        }

        @Override // oi.s
        public boolean b(Class cls) {
            return this.f57765a.equals(cls);
        }

        @Override // oi.s
        public Set c(Locale locale, InterfaceC5908d interfaceC5908d) {
            a0 j10 = locale.getCountry().isEmpty() ? this.f57768d : a0.j(locale);
            HashSet hashSet = new HashSet();
            hashSet.add(f.P(this.f57765a, j10));
            hashSet.add(d.C("WEEK_OF_MONTH", this.f57765a, 1, 5, 'W', j10, this.f57766b, false));
            hashSet.add(d.C("WEEK_OF_YEAR", this.f57765a, 1, 52, 'w', j10, this.f57767c, false));
            hashSet.add(d.C("BOUNDED_WEEK_OF_MONTH", this.f57765a, 1, 5, (char) 0, j10, this.f57766b, true));
            hashSet.add(d.C("BOUNDED_WEEK_OF_YEAR", this.f57765a, 1, 52, (char) 0, j10, this.f57767c, true));
            return Collections.unmodifiableSet(hashSet);
        }

        @Override // oi.s
        public q d(q qVar, Locale locale, InterfaceC5908d interfaceC5908d) {
            return qVar;
        }
    }
}
