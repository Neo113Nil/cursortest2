package jg;

import Fm.C3051a;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
public final class v extends AbstractC7422a<v> {

    /* renamed from: b, reason: collision with root package name */
    private final ig.f f70070b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70071a;

        static {
            int[] iArr = new int[EnumC8145a.values().length];
            f70071a = iArr;
            try {
                iArr[EnumC8145a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70071a[EnumC8145a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70071a[EnumC8145a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70071a[EnumC8145a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f70071a[EnumC8145a.PROLEPTIC_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f70071a[EnumC8145a.YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f70071a[EnumC8145a.ERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    v(ig.f fVar) {
        lg.c.e(fVar, "date");
        this.f70070b = fVar;
    }

    private int n1() {
        return this.f70070b.v1() + 543;
    }

    private v t1(ig.f fVar) {
        return fVar.equals(this.f70070b) ? this : new v(fVar);
    }

    private Object writeReplace() {
        return new t((byte) 7, this);
    }

    @Override // jg.AbstractC7422a, jg.AbstractC7423b
    public final c<v> E0(ig.h hVar) {
        return d.j1(this, hVar);
    }

    @Override // jg.AbstractC7423b
    public final g L0() {
        return u.f70068c;
    }

    @Override // jg.AbstractC7423b
    public final h M0() {
        return (w) super.M0();
    }

    @Override // jg.AbstractC7422a, jg.AbstractC7423b, mg.d
    /* renamed from: O */
    public final mg.d T0(long j11, mg.k kVar) {
        return (v) super.T0(j11, kVar);
    }

    @Override // jg.AbstractC7423b
    /* renamed from: T0 */
    public final AbstractC7423b s(long j11, mg.k kVar) {
        return (v) super.s(j11, kVar);
    }

    @Override // jg.AbstractC7422a, jg.AbstractC7423b
    /* renamed from: W0 */
    public final AbstractC7423b T0(long j11, mg.k kVar) {
        return (v) super.T0(j11, kVar);
    }

    @Override // jg.AbstractC7423b
    public final long a1() {
        return this.f70070b.a1();
    }

    @Override // jg.AbstractC7423b
    /* renamed from: d1 */
    public final AbstractC7423b k1(mg.f fVar) {
        return (v) super.k1(fVar);
    }

    @Override // jg.AbstractC7423b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.f70070b.equals(((v) obj).f70070b);
        }
        return false;
    }

    @Override // jg.AbstractC7423b
    public final int hashCode() {
        u.f70068c.getClass();
        return this.f70070b.hashCode() ^ 146118545;
    }

    @Override // jg.AbstractC7423b, mg.d
    /* renamed from: j */
    public final mg.d k1(ig.f fVar) {
        return (v) super.k1(fVar);
    }

    @Override // jg.AbstractC7422a
    /* renamed from: j1 */
    public final AbstractC7422a<v> T0(long j11, mg.k kVar) {
        return (v) super.T0(j11, kVar);
    }

    @Override // jg.AbstractC7422a
    final AbstractC7422a<v> k1(long j11) {
        return t1(this.f70070b.M1(j11));
    }

    @Override // jg.AbstractC7422a
    final AbstractC7422a<v> l1(long j11) {
        return t1(this.f70070b.R1(j11));
    }

    @Override // mg.e
    public final long m(mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return hVar.f(this);
        }
        int i11 = a.f70071a[((EnumC8145a) hVar).ordinal()];
        if (i11 == 4) {
            int n12 = n1();
            if (n12 < 1) {
                n12 = 1 - n12;
            }
            return n12;
        }
        ig.f fVar = this.f70070b;
        if (i11 == 5) {
            return ((n1() * 12) + fVar.u1()) - 1;
        }
        if (i11 == 6) {
            return n1();
        }
        if (i11 != 7) {
            return fVar.m(hVar);
        }
        return n1() < 1 ? 0 : 1;
    }

    @Override // jg.AbstractC7422a
    final AbstractC7422a<v> m1(long j11) {
        return t1(this.f70070b.S1(j11));
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
        int i11 = a.f70071a[enumC8145a.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return this.f70070b.p(hVar);
        }
        if (i11 != 4) {
            return u.f70068c.n(enumC8145a);
        }
        mg.m d11 = EnumC8145a.YEAR.d();
        return mg.m.h(1L, n1() <= 0 ? (-(d11.e() + 543)) + 1 : 543 + d11.d());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // jg.AbstractC7423b
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v j1(long j11, mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return (v) hVar.e(this, j11);
        }
        EnumC8145a enumC8145a = (EnumC8145a) hVar;
        if (m(enumC8145a) == j11) {
            return this;
        }
        int[] iArr = a.f70071a;
        int i11 = iArr[enumC8145a.ordinal()];
        ig.f fVar = this.f70070b;
        if (i11 != 4) {
            if (i11 == 5) {
                u.f70068c.n(enumC8145a).b(j11, enumC8145a);
                return t1(fVar.R1(j11 - (((n1() * 12) + fVar.u1()) - 1)));
            }
            if (i11 != 6) {
            }
        }
        int a11 = u.f70068c.n(enumC8145a).a(j11, enumC8145a);
        int i12 = iArr[enumC8145a.ordinal()];
        if (i12 == 4) {
            if (n1() < 1) {
                a11 = 1 - a11;
            }
            return t1(fVar.d2(a11 - 543));
        }
        if (i12 == 6) {
            return t1(fVar.d2(a11 - 543));
        }
        if (i12 == 7) {
            return t1(fVar.d2((-542) - n1()));
        }
        return t1(fVar.Z(j11, hVar));
    }

    @Override // jg.AbstractC7423b, lg.AbstractC7957b, mg.d
    public final mg.d s(long j11, mg.k kVar) {
        return (v) super.s(j11, kVar);
    }
}
