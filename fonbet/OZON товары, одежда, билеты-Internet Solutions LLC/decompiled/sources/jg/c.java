package jg;

import jg.AbstractC7423b;
import lg.AbstractC7957b;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
public abstract class c<D extends AbstractC7423b> extends AbstractC7957b implements mg.f, Comparable<c<?>> {
    public c() {
        super(false);
    }

    public abstract e E0(ig.q qVar);

    /* JADX WARN: Type inference failed for: r3v1, types: [jg.b] */
    @Override // java.lang.Comparable
    /* renamed from: H0 */
    public int compareTo(c<?> cVar) {
        int compareTo = W0().compareTo(cVar.W0());
        return (compareTo == 0 && (compareTo = a1().compareTo(cVar.a1())) == 0) ? W0().L0().i().compareTo(cVar.W0().L0().i()) : compareTo;
    }

    @Override // lg.AbstractC7957b, mg.d
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public c s(long j11, mg.b bVar) {
        return W0().L0().d(super.s(j11, bVar));
    }

    @Override // mg.d
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public abstract c<D> T0(long j11, mg.k kVar);

    @Override // mg.f
    public mg.d R(mg.d dVar) {
        return dVar.j1(W0().a1(), EnumC8145a.EPOCH_DAY).j1(a1().u1(), EnumC8145a.NANO_OF_DAY);
    }

    public final long T0(ig.q qVar) {
        lg.c.e(qVar, "offset");
        return ((W0().a1() * 86400) + a1().v1()) - qVar.i();
    }

    public abstract D W0();

    public abstract ig.h a1();

    @Override // mg.d
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public abstract c j1(long j11, mg.h hVar);

    @Override // Lf.a, mg.e
    public <R> R d(mg.j<R> jVar) {
        if (jVar == mg.i.a()) {
            return (R) W0().L0();
        }
        if (jVar == mg.i.e()) {
            return (R) mg.b.NANOS;
        }
        if (jVar == mg.i.b()) {
            return (R) ig.f.J1(W0().a1());
        }
        if (jVar == mg.i.c()) {
            return (R) a1();
        }
        if (jVar == mg.i.f() || jVar == mg.i.g() || jVar == mg.i.d()) {
            return null;
        }
        return (R) super.d(jVar);
    }

    @Override // mg.d
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public c k1(ig.f fVar) {
        return W0().L0().d(fVar.R(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && compareTo((c) obj) == 0;
    }

    public int hashCode() {
        return W0().hashCode() ^ a1().hashCode();
    }

    @Override // Lf.a
    public String toString() {
        return W0().toString() + 'T' + a1().toString();
    }
}
