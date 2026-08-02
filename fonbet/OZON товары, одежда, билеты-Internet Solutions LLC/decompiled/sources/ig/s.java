package ig;

import Fm.C3051a;
import ig.AbstractC7072a;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import kg.C7676a;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
public final class s extends jg.e<f> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final g f66464b;

    /* renamed from: c, reason: collision with root package name */
    private final q f66465c;

    /* renamed from: d, reason: collision with root package name */
    private final p f66466d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f66467a;

        static {
            int[] iArr = new int[EnumC8145a.values().length];
            f66467a = iArr;
            try {
                iArr[EnumC8145a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66467a[EnumC8145a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private s(g gVar, p pVar, q qVar) {
        this.f66464b = gVar;
        this.f66465c = qVar;
        this.f66466d = pVar;
    }

    private static s m1(long j11, int i11, p pVar) {
        q a11 = pVar.b().a(e.a1(j11, i11));
        return new s(g.x1(j11, i11, a11), pVar, a11);
    }

    public static s q1() {
        AbstractC7072a.C1099a c1099a = new AbstractC7072a.C1099a(p.f());
        e T02 = e.T0(System.currentTimeMillis());
        p a11 = c1099a.a();
        lg.c.e(T02, "instant");
        lg.c.e(a11, "zone");
        return m1(T02.L0(), T02.M0(), a11);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static s t1(g gVar, p pVar, q qVar) {
        lg.c.e(gVar, "localDateTime");
        lg.c.e(pVar, "zone");
        if (pVar instanceof q) {
            return new s(gVar, pVar, (q) pVar);
        }
        ng.f b11 = pVar.b();
        List<q> d11 = b11.d(gVar);
        if (d11.size() == 1) {
            qVar = d11.get(0);
        } else if (d11.size() == 0) {
            ng.d b12 = b11.b(gVar);
            gVar = gVar.B1(b12.d().b());
            qVar = b12.e();
        } else if (qVar == null || !d11.contains(qVar)) {
            q qVar2 = d11.get(0);
            lg.c.e(qVar2, "offset");
            qVar = qVar2;
        }
        return new s(gVar, pVar, qVar);
    }

    static s v1(ObjectInput objectInput) throws IOException {
        g gVar = g.f66417d;
        f fVar = f.f66410e;
        g v12 = g.v1(f.E1(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), h.t1(objectInput));
        q A11 = q.A(objectInput);
        p pVar = (p) m.a(objectInput);
        lg.c.e(pVar, "zone");
        if (!(pVar instanceof q) || A11.equals(pVar)) {
            return new s(v12, pVar, A11);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    private Object writeReplace() {
        return new m((byte) 6, this);
    }

    @Override // jg.e
    /* renamed from: B1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final s k1(f fVar) {
        return t1(g.v1(fVar, this.f66464b.a1()), this.f66466d, this.f66465c);
    }

    public final s E1(p pVar) {
        lg.c.e(pVar, "zone");
        if (this.f66466d.equals(pVar)) {
            return this;
        }
        g gVar = this.f66464b;
        return m1(gVar.T0(this.f66465c), gVar.l1(), pVar);
    }

    final void F1(DataOutput dataOutput) throws IOException {
        this.f66464b.R1(dataOutput);
        this.f66465c.B(dataOutput);
        this.f66466d.g((ObjectOutput) dataOutput);
    }

    @Override // jg.e
    public final q H0() {
        return this.f66465c;
    }

    @Override // mg.e
    public final boolean L(mg.h hVar) {
        if (hVar instanceof EnumC8145a) {
            return true;
        }
        return hVar != null && hVar.a(this);
    }

    @Override // jg.e
    public final p L0() {
        return this.f66466d;
    }

    @Override // jg.e
    /* renamed from: M0 */
    public final jg.e s(long j11, mg.b bVar) {
        return j11 == Long.MIN_VALUE ? W0(Long.MAX_VALUE, bVar).W0(1L, bVar) : W0(-j11, bVar);
    }

    @Override // jg.e, Lf.a, mg.e
    public final int Q(mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return super.Q(hVar);
        }
        int i11 = a.f66467a[((EnumC8145a) hVar).ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? this.f66464b.Q(hVar) : this.f66465c.i();
        }
        throw new C7073b(C3051a.c("Field too large for an int: ", hVar));
    }

    @Override // jg.e
    public final f a1() {
        return this.f66464b.F1();
    }

    @Override // jg.e
    public final jg.c<f> c1() {
        return this.f66464b;
    }

    @Override // jg.e, Lf.a, mg.e
    public final <R> R d(mg.j<R> jVar) {
        return jVar == mg.i.b() ? (R) this.f66464b.F1() : (R) super.d(jVar);
    }

    @Override // jg.e
    public final h d1() {
        return this.f66464b.a1();
    }

    @Override // jg.e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f66464b.equals(sVar.f66464b) && this.f66465c.equals(sVar.f66465c) && this.f66466d.equals(sVar.f66466d)) {
                return true;
            }
        }
        return false;
    }

    @Override // jg.e
    public final int hashCode() {
        return (this.f66464b.hashCode() ^ this.f66465c.hashCode()) ^ Integer.rotateLeft(this.f66466d.hashCode(), 3);
    }

    @Override // jg.e
    public final jg.e<f> l1(p pVar) {
        lg.c.e(pVar, "zone");
        return this.f66466d.equals(pVar) ? this : t1(this.f66464b, pVar, this.f66465c);
    }

    @Override // jg.e, mg.e
    public final long m(mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return hVar.f(this);
        }
        int i11 = a.f66467a[((EnumC8145a) hVar).ordinal()];
        return i11 != 1 ? i11 != 2 ? this.f66464b.m(hVar) : this.f66465c.i() : W0();
    }

    public final String n1(C7676a c7676a) {
        return c7676a.a(this);
    }

    @Override // jg.e, Lf.a, mg.e
    public final mg.m p(mg.h hVar) {
        return hVar instanceof EnumC8145a ? (hVar == EnumC8145a.INSTANT_SECONDS || hVar == EnumC8145a.OFFSET_SECONDS) ? ((EnumC8145a) hVar).d() : this.f66464b.p(hVar) : hVar.g(this);
    }

    @Override // jg.e, lg.AbstractC7957b, mg.d
    public final mg.d s(long j11, mg.k kVar) {
        mg.b bVar = (mg.b) kVar;
        return j11 == Long.MIN_VALUE ? W0(Long.MAX_VALUE, bVar).W0(1L, bVar) : W0(-j11, bVar);
    }

    @Override // jg.e, Lf.a
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f66464b.toString());
        q qVar = this.f66465c;
        sb2.append(qVar.toString());
        String sb3 = sb2.toString();
        p pVar = this.f66466d;
        if (qVar == pVar) {
            return sb3;
        }
        return sb3 + '[' + pVar.toString() + ']';
    }

    @Override // jg.e
    /* renamed from: u1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final s T0(long j11, mg.k kVar) {
        if (!(kVar instanceof mg.b)) {
            return (s) kVar.a(this, j11);
        }
        mg.b bVar = (mg.b) kVar;
        int compareTo = bVar.compareTo(mg.b.DAYS);
        q qVar = this.f66465c;
        p pVar = this.f66466d;
        g gVar = this.f66464b;
        if (compareTo >= 0 && bVar != mg.b.FOREVER) {
            return t1(gVar.M0(j11, kVar), pVar, qVar);
        }
        g M02 = gVar.M0(j11, kVar);
        lg.c.e(M02, "localDateTime");
        lg.c.e(qVar, "offset");
        lg.c.e(pVar, "zone");
        return m1(M02.T0(qVar), M02.l1(), pVar);
    }

    public final g x1() {
        return this.f66464b;
    }

    @Override // jg.e
    /* renamed from: y1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final s j1(long j11, mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return (s) hVar.e(this, j11);
        }
        EnumC8145a enumC8145a = (EnumC8145a) hVar;
        int i11 = a.f66467a[enumC8145a.ordinal()];
        g gVar = this.f66464b;
        p pVar = this.f66466d;
        if (i11 == 1) {
            return m1(j11, gVar.l1(), pVar);
        }
        q qVar = this.f66465c;
        if (i11 != 2) {
            return t1(gVar.c1(j11, hVar), pVar, qVar);
        }
        q u11 = q.u(enumC8145a.h(j11));
        return (u11.equals(qVar) || !pVar.b().g(gVar, u11)) ? this : new s(gVar, pVar, u11);
    }
}
