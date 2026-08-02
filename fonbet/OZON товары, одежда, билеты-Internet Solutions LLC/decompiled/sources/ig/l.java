package ig;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectStreamException;
import java.io.Serializable;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
public final class l extends Lf.a implements mg.d, mg.f, Comparable<l>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final h f66439b;

    /* renamed from: c, reason: collision with root package name */
    private final q f66440c;

    static {
        h hVar = h.f66422f;
        q qVar = q.f66457h;
        hVar.getClass();
        E0(hVar, qVar);
        h hVar2 = h.f66423g;
        q qVar2 = q.f66456g;
        hVar2.getClass();
        E0(hVar2, qVar2);
    }

    private l(h hVar, q qVar) {
        super(false);
        lg.c.e(hVar, "time");
        this.f66439b = hVar;
        lg.c.e(qVar, "offset");
        this.f66440c = qVar;
    }

    public static l E0(h hVar, q qVar) {
        return new l(hVar, qVar);
    }

    static l L0(ObjectInput objectInput) throws IOException {
        return new l(h.t1(objectInput), q.A(objectInput));
    }

    private l M0(h hVar, q qVar) {
        return (this.f66439b == hVar && this.f66440c.equals(qVar)) ? this : new l(hVar, qVar);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 66, this);
    }

    @Override // mg.d
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public final l T0(long j11, mg.k kVar) {
        return kVar instanceof mg.b ? M0(this.f66439b.W0(j11, kVar), this.f66440c) : (l) kVar.a(this, j11);
    }

    @Override // mg.e
    public final boolean L(mg.h hVar) {
        return hVar instanceof EnumC8145a ? ((EnumC8145a) hVar).j() || hVar == EnumC8145a.OFFSET_SECONDS : hVar != null && hVar.a(this);
    }

    @Override // mg.f
    public final mg.d R(mg.d dVar) {
        return dVar.j1(this.f66439b.u1(), EnumC8145a.NANO_OF_DAY).j1(this.f66440c.i(), EnumC8145a.OFFSET_SECONDS);
    }

    final void T0(DataOutput dataOutput) throws IOException {
        this.f66439b.B1(dataOutput);
        this.f66440c.B(dataOutput);
    }

    @Override // mg.d
    /* renamed from: Z */
    public final mg.d j1(long j11, mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return (l) hVar.e(this, j11);
        }
        EnumC8145a enumC8145a = EnumC8145a.OFFSET_SECONDS;
        h hVar2 = this.f66439b;
        return hVar == enumC8145a ? M0(hVar2, q.u(((EnumC8145a) hVar).h(j11))) : M0(hVar2.c1(j11, hVar), this.f66440c);
    }

    @Override // java.lang.Comparable
    public final int compareTo(l lVar) {
        int a11;
        l lVar2 = lVar;
        q qVar = lVar2.f66440c;
        q qVar2 = this.f66440c;
        boolean equals = qVar2.equals(qVar);
        h hVar = lVar2.f66439b;
        h hVar2 = this.f66439b;
        return (equals || (a11 = lg.c.a(hVar2.u1() - (((long) qVar2.i()) * 1000000000), hVar.u1() - (((long) lVar2.f66440c.i()) * 1000000000))) == 0) ? hVar2.compareTo(hVar) : a11;
    }

    @Override // Lf.a, mg.e
    public final <R> R d(mg.j<R> jVar) {
        if (jVar == mg.i.e()) {
            return (R) mg.b.NANOS;
        }
        if (jVar == mg.i.d() || jVar == mg.i.f()) {
            return (R) this.f66440c;
        }
        if (jVar == mg.i.c()) {
            return (R) this.f66439b;
        }
        if (jVar == mg.i.a() || jVar == mg.i.b() || jVar == mg.i.g()) {
            return null;
        }
        return (R) super.d(jVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f66439b.equals(lVar.f66439b) && this.f66440c.equals(lVar.f66440c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f66439b.hashCode() ^ this.f66440c.hashCode();
    }

    @Override // mg.d
    /* renamed from: j */
    public final mg.d k1(f fVar) {
        return (l) fVar.R(this);
    }

    @Override // mg.e
    public final long m(mg.h hVar) {
        return hVar instanceof EnumC8145a ? hVar == EnumC8145a.OFFSET_SECONDS ? this.f66440c.i() : this.f66439b.m(hVar) : hVar.f(this);
    }

    @Override // Lf.a, mg.e
    public final mg.m p(mg.h hVar) {
        return hVar instanceof EnumC8145a ? hVar == EnumC8145a.OFFSET_SECONDS ? ((EnumC8145a) hVar).d() : this.f66439b.p(hVar) : hVar.g(this);
    }

    @Override // mg.d
    public final mg.d s(long j11, mg.k kVar) {
        return j11 == Long.MIN_VALUE ? W0(Long.MAX_VALUE, kVar).W0(1L, kVar) : W0(-j11, kVar);
    }

    @Override // Lf.a
    public final String toString() {
        return this.f66439b.toString() + this.f66440c.toString();
    }
}
