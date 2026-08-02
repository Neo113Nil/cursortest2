package jg;

import lg.AbstractC7957b;
import mg.EnumC8145a;

/* renamed from: jg.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC7423b extends AbstractC7957b implements mg.f, Comparable<AbstractC7423b> {
    public AbstractC7423b() {
        super(false);
    }

    public c<?> E0(ig.h hVar) {
        return d.j1(this, hVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: H0 */
    public int compareTo(AbstractC7423b abstractC7423b) {
        int a11 = lg.c.a(a1(), abstractC7423b.a1());
        if (a11 != 0) {
            return a11;
        }
        return L0().i().compareTo(abstractC7423b.L0().i());
    }

    @Override // mg.e
    public boolean L(mg.h hVar) {
        return hVar instanceof EnumC8145a ? ((EnumC8145a) hVar).b() : hVar != null && hVar.a(this);
    }

    public abstract g L0();

    public h M0() {
        return L0().f(Q(EnumC8145a.ERA));
    }

    @Override // mg.f
    public mg.d R(mg.d dVar) {
        return dVar.j1(a1(), EnumC8145a.EPOCH_DAY);
    }

    @Override // lg.AbstractC7957b, mg.d
    /* renamed from: T0 */
    public AbstractC7423b s(long j11, mg.k kVar) {
        return L0().b(super.s(j11, kVar));
    }

    @Override // mg.d
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC7423b T0(long j11, mg.k kVar);

    public long a1() {
        return m(EnumC8145a.EPOCH_DAY);
    }

    @Override // mg.d
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC7423b j1(long j11, mg.h hVar);

    @Override // Lf.a, mg.e
    public <R> R d(mg.j<R> jVar) {
        if (jVar == mg.i.a()) {
            return (R) L0();
        }
        if (jVar == mg.i.e()) {
            return (R) mg.b.DAYS;
        }
        if (jVar == mg.i.b()) {
            return (R) ig.f.J1(a1());
        }
        if (jVar == mg.i.c() || jVar == mg.i.f() || jVar == mg.i.g() || jVar == mg.i.d()) {
            return null;
        }
        return (R) super.d(jVar);
    }

    @Override // mg.d
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public AbstractC7423b k1(mg.f fVar) {
        return L0().b(fVar.R(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC7423b) && compareTo((AbstractC7423b) obj) == 0;
    }

    public int hashCode() {
        long a12 = a1();
        return ((int) (a12 ^ (a12 >>> 32))) ^ L0().hashCode();
    }

    @Override // Lf.a
    public String toString() {
        long m11 = m(EnumC8145a.YEAR_OF_ERA);
        long m12 = m(EnumC8145a.MONTH_OF_YEAR);
        long m13 = m(EnumC8145a.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(L0().i());
        sb2.append(" ");
        sb2.append(M0());
        sb2.append(" ");
        sb2.append(m11);
        sb2.append(m12 < 10 ? "-0" : "-");
        sb2.append(m12);
        sb2.append(m13 < 10 ? "-0" : "-");
        sb2.append(m13);
        return sb2.toString();
    }
}
