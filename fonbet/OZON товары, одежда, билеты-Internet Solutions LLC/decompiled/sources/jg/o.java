package jg;

import Fm.C3051a;
import ig.C7073b;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
public final class o extends AbstractC7422a<o> {

    /* renamed from: e, reason: collision with root package name */
    static final ig.f f70052e = ig.f.E1(1873, 1, 1);

    /* renamed from: b, reason: collision with root package name */
    private final ig.f f70053b;

    /* renamed from: c, reason: collision with root package name */
    private transient p f70054c;

    /* renamed from: d, reason: collision with root package name */
    private transient int f70055d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70056a;

        static {
            int[] iArr = new int[EnumC8145a.values().length];
            f70056a = iArr;
            try {
                iArr[EnumC8145a.DAY_OF_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70056a[EnumC8145a.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70056a[EnumC8145a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70056a[EnumC8145a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f70056a[EnumC8145a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f70056a[EnumC8145a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f70056a[EnumC8145a.ERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    o(ig.f fVar) {
        if (fVar.x1(f70052e)) {
            throw new C7073b("Minimum supported date is January 1st Meiji 6");
        }
        this.f70054c = p.H0(fVar);
        this.f70055d = fVar.v1() - (r0.T0().v1() - 1);
        this.f70053b = fVar;
    }

    private mg.m n1(int i11) {
        Calendar calendar = Calendar.getInstance(n.f70049c);
        calendar.set(0, this.f70054c.L0() + 2);
        calendar.set(this.f70055d, r2.u1() - 1, this.f70053b.n1());
        return mg.m.h(calendar.getActualMinimum(i11), calendar.getActualMaximum(i11));
    }

    private long q1() {
        int i11 = this.f70055d;
        ig.f fVar = this.f70053b;
        return i11 == 1 ? (fVar.t1() - this.f70054c.T0().t1()) + 1 : fVar.t1();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        ig.f fVar = this.f70053b;
        this.f70054c = p.H0(fVar);
        this.f70055d = fVar.v1() - (r0.T0().v1() - 1);
    }

    private o u1(ig.f fVar) {
        return fVar.equals(this.f70053b) ? this : new o(fVar);
    }

    private o v1(p pVar, int i11) {
        n.f70050d.getClass();
        if (pVar == null) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int v12 = (pVar.T0().v1() + i11) - 1;
        mg.m.h(1L, (pVar.E0().v1() - pVar.T0().v1()) + 1).b(i11, EnumC8145a.YEAR_OF_ERA);
        return u1(this.f70053b.d2(v12));
    }

    private Object writeReplace() {
        return new t((byte) 1, this);
    }

    @Override // jg.AbstractC7422a, jg.AbstractC7423b
    public final c<o> E0(ig.h hVar) {
        return d.j1(this, hVar);
    }

    @Override // jg.AbstractC7423b, mg.e
    public final boolean L(mg.h hVar) {
        if (hVar == EnumC8145a.ALIGNED_DAY_OF_WEEK_IN_MONTH || hVar == EnumC8145a.ALIGNED_DAY_OF_WEEK_IN_YEAR || hVar == EnumC8145a.ALIGNED_WEEK_OF_MONTH || hVar == EnumC8145a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return super.L(hVar);
    }

    @Override // jg.AbstractC7423b
    public final g L0() {
        return n.f70050d;
    }

    @Override // jg.AbstractC7423b
    public final h M0() {
        return this.f70054c;
    }

    @Override // jg.AbstractC7422a, jg.AbstractC7423b, mg.d
    /* renamed from: O */
    public final mg.d T0(long j11, mg.k kVar) {
        return (o) super.T0(j11, kVar);
    }

    @Override // jg.AbstractC7423b
    /* renamed from: T0 */
    public final AbstractC7423b s(long j11, mg.k kVar) {
        return (o) super.s(j11, kVar);
    }

    @Override // jg.AbstractC7422a, jg.AbstractC7423b
    /* renamed from: W0 */
    public final AbstractC7423b T0(long j11, mg.k kVar) {
        return (o) super.T0(j11, kVar);
    }

    @Override // jg.AbstractC7423b
    public final long a1() {
        return this.f70053b.a1();
    }

    @Override // jg.AbstractC7423b
    /* renamed from: d1 */
    public final AbstractC7423b k1(mg.f fVar) {
        return (o) super.k1(fVar);
    }

    @Override // jg.AbstractC7423b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return this.f70053b.equals(((o) obj).f70053b);
        }
        return false;
    }

    @Override // jg.AbstractC7423b
    public final int hashCode() {
        n.f70050d.getClass();
        return this.f70053b.hashCode() ^ (-688086063);
    }

    @Override // jg.AbstractC7423b, mg.d
    /* renamed from: j */
    public final mg.d k1(ig.f fVar) {
        return (o) super.k1(fVar);
    }

    @Override // jg.AbstractC7422a
    /* renamed from: j1 */
    public final AbstractC7422a<o> T0(long j11, mg.k kVar) {
        return (o) super.T0(j11, kVar);
    }

    @Override // jg.AbstractC7422a
    final AbstractC7422a<o> k1(long j11) {
        return u1(this.f70053b.M1(j11));
    }

    @Override // jg.AbstractC7422a
    final AbstractC7422a<o> l1(long j11) {
        return u1(this.f70053b.R1(j11));
    }

    @Override // mg.e
    public final long m(mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return hVar.f(this);
        }
        switch (a.f70056a[((EnumC8145a) hVar).ordinal()]) {
            case 1:
                return q1();
            case 2:
                return this.f70055d;
            case 3:
            case 4:
            case 5:
            case 6:
                throw new mg.l(C3051a.c("Unsupported field: ", hVar));
            case 7:
                return this.f70054c.L0();
            default:
                return this.f70053b.m(hVar);
        }
    }

    @Override // jg.AbstractC7422a
    final AbstractC7422a<o> m1(long j11) {
        return u1(this.f70053b.S1(j11));
    }

    @Override // Lf.a, mg.e
    public final mg.m p(mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return hVar.g(this);
        }
        if (!L(hVar)) {
            throw new mg.l(C3051a.c("Unsupported field: ", hVar));
        }
        EnumC8145a enumC8145a = (EnumC8145a) hVar;
        int i11 = a.f70056a[enumC8145a.ordinal()];
        return i11 != 1 ? i11 != 2 ? n.f70050d.n(enumC8145a) : n1(1) : n1(6);
    }

    @Override // jg.AbstractC7423b, lg.AbstractC7957b, mg.d
    public final mg.d s(long j11, mg.k kVar) {
        return (o) super.s(j11, kVar);
    }

    @Override // jg.AbstractC7423b
    /* renamed from: t1, reason: merged with bridge method [inline-methods] */
    public final o j1(long j11, mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return (o) hVar.e(this, j11);
        }
        EnumC8145a enumC8145a = (EnumC8145a) hVar;
        if (m(enumC8145a) == j11) {
            return this;
        }
        int[] iArr = a.f70056a;
        int i11 = iArr[enumC8145a.ordinal()];
        ig.f fVar = this.f70053b;
        if (i11 == 1 || i11 == 2 || i11 == 7) {
            int a11 = n.f70050d.n(enumC8145a).a(j11, enumC8145a);
            int i12 = iArr[enumC8145a.ordinal()];
            if (i12 == 1) {
                return u1(fVar.M1(a11 - q1()));
            }
            if (i12 == 2) {
                return v1(this.f70054c, a11);
            }
            if (i12 == 7) {
                return v1(p.M0(a11), this.f70055d);
            }
        }
        return u1(fVar.Z(j11, hVar));
    }
}
