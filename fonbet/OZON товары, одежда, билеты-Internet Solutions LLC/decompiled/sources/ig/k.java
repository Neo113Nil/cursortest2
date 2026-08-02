package ig;

import Fm.C3051a;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectStreamException;
import java.io.Serializable;
import lg.AbstractC7957b;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
public final class k extends AbstractC7957b implements mg.f, Comparable<k>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final g f66436b;

    /* renamed from: c, reason: collision with root package name */
    private final q f66437c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f66438a;

        static {
            int[] iArr = new int[EnumC8145a.values().length];
            f66438a = iArr;
            try {
                iArr[EnumC8145a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66438a[EnumC8145a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        g gVar = g.f66417d;
        q qVar = q.f66457h;
        gVar.getClass();
        E0(gVar, qVar);
        g gVar2 = g.f66418e;
        q qVar2 = q.f66456g;
        gVar2.getClass();
        E0(gVar2, qVar2);
    }

    private k(g gVar, q qVar) {
        super(false);
        lg.c.e(gVar, "dateTime");
        this.f66436b = gVar;
        lg.c.e(qVar, "offset");
        this.f66437c = qVar;
    }

    public static k E0(g gVar, q qVar) {
        return new k(gVar, qVar);
    }

    static k L0(ObjectInput objectInput) throws IOException {
        g gVar = g.f66417d;
        f fVar = f.f66410e;
        return new k(g.v1(f.E1(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), h.t1(objectInput)), q.A(objectInput));
    }

    private k T0(g gVar, q qVar) {
        return (this.f66436b == gVar && this.f66437c.equals(qVar)) ? this : new k(gVar, qVar);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 69, this);
    }

    @Override // mg.d
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public final k T0(long j11, mg.k kVar) {
        return kVar instanceof mg.b ? T0(this.f66436b.M0(j11, kVar), this.f66437c) : (k) kVar.a(this, j11);
    }

    @Override // mg.e
    public final boolean L(mg.h hVar) {
        if (hVar instanceof EnumC8145a) {
            return true;
        }
        return hVar != null && hVar.a(this);
    }

    public final long M0() {
        return this.f66436b.T0(this.f66437c);
    }

    @Override // Lf.a, mg.e
    public final int Q(mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return super.Q(hVar);
        }
        int i11 = a.f66438a[((EnumC8145a) hVar).ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? this.f66436b.Q(hVar) : this.f66437c.i();
        }
        throw new C7073b(C3051a.c("Field too large for an int: ", hVar));
    }

    @Override // mg.f
    public final mg.d R(mg.d dVar) {
        EnumC8145a enumC8145a = EnumC8145a.EPOCH_DAY;
        g gVar = this.f66436b;
        return dVar.j1(gVar.F1().a1(), enumC8145a).j1(gVar.a1().u1(), EnumC8145a.NANO_OF_DAY).j1(this.f66437c.i(), EnumC8145a.OFFSET_SECONDS);
    }

    final void W0(DataOutput dataOutput) throws IOException {
        this.f66436b.R1(dataOutput);
        this.f66437c.B(dataOutput);
    }

    @Override // mg.d
    /* renamed from: Z */
    public final mg.d j1(long j11, mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return (k) hVar.e(this, j11);
        }
        EnumC8145a enumC8145a = (EnumC8145a) hVar;
        int i11 = a.f66438a[enumC8145a.ordinal()];
        q qVar = this.f66437c;
        g gVar = this.f66436b;
        if (i11 != 1) {
            return i11 != 2 ? T0(gVar.c1(j11, hVar), qVar) : T0(gVar, q.u(enumC8145a.h(j11)));
        }
        e a12 = e.a1(j11, gVar.l1());
        lg.c.e(a12, "instant");
        lg.c.e(qVar, "zone");
        q a11 = qVar.b().a(a12);
        return new k(g.x1(a12.L0(), a12.M0(), a11), a11);
    }

    @Override // java.lang.Comparable
    public final int compareTo(k kVar) {
        k kVar2 = kVar;
        boolean equals = this.f66437c.equals(kVar2.f66437c);
        g gVar = this.f66436b;
        g gVar2 = kVar2.f66436b;
        if (equals) {
            return gVar.compareTo(gVar2);
        }
        int a11 = lg.c.a(M0(), kVar2.M0());
        if (a11 != 0) {
            return a11;
        }
        int W02 = gVar.a1().W0() - gVar2.a1().W0();
        return W02 == 0 ? gVar.compareTo(gVar2) : W02;
    }

    @Override // Lf.a, mg.e
    public final <R> R d(mg.j<R> jVar) {
        if (jVar == mg.i.a()) {
            return (R) jg.l.f70047c;
        }
        if (jVar == mg.i.e()) {
            return (R) mg.b.NANOS;
        }
        if (jVar == mg.i.d() || jVar == mg.i.f()) {
            return (R) this.f66437c;
        }
        mg.j<f> b11 = mg.i.b();
        g gVar = this.f66436b;
        if (jVar == b11) {
            return (R) gVar.F1();
        }
        if (jVar == mg.i.c()) {
            return (R) gVar.a1();
        }
        if (jVar == mg.i.g()) {
            return null;
        }
        return (R) super.d(jVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f66436b.equals(kVar.f66436b) && this.f66437c.equals(kVar.f66437c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f66436b.hashCode() ^ this.f66437c.hashCode();
    }

    @Override // mg.d
    /* renamed from: j */
    public final mg.d k1(f fVar) {
        return T0(this.f66436b.L1(fVar), this.f66437c);
    }

    @Override // mg.e
    public final long m(mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return hVar.f(this);
        }
        int i11 = a.f66438a[((EnumC8145a) hVar).ordinal()];
        return i11 != 1 ? i11 != 2 ? this.f66436b.m(hVar) : this.f66437c.i() : M0();
    }

    @Override // Lf.a, mg.e
    public final mg.m p(mg.h hVar) {
        return hVar instanceof EnumC8145a ? (hVar == EnumC8145a.INSTANT_SECONDS || hVar == EnumC8145a.OFFSET_SECONDS) ? ((EnumC8145a) hVar).d() : this.f66436b.p(hVar) : hVar.g(this);
    }

    @Override // lg.AbstractC7957b, mg.d
    public final mg.d s(long j11, mg.k kVar) {
        return j11 == Long.MIN_VALUE ? W0(Long.MAX_VALUE, kVar).W0(1L, kVar) : W0(-j11, kVar);
    }

    @Override // Lf.a
    public final String toString() {
        return this.f66436b.toString() + this.f66437c.toString();
    }
}
