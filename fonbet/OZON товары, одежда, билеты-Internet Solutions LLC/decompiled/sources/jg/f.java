package jg;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import jg.AbstractC7423b;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
final class f<D extends AbstractC7423b> extends e<D> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final d<D> f70007b;

    /* renamed from: c, reason: collision with root package name */
    private final ig.q f70008c;

    /* renamed from: d, reason: collision with root package name */
    private final ig.p f70009d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70010a;

        static {
            int[] iArr = new int[EnumC8145a.values().length];
            f70010a = iArr;
            try {
                iArr[EnumC8145a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70010a[EnumC8145a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private f(ig.p pVar, ig.q qVar, d dVar) {
        lg.c.e(dVar, "dateTime");
        this.f70007b = dVar;
        lg.c.e(qVar, "offset");
        this.f70008c = qVar;
        lg.c.e(pVar, "zone");
        this.f70009d = pVar;
    }

    static e m1(ig.p pVar, ig.q qVar, d dVar) {
        lg.c.e(dVar, "localDateTime");
        lg.c.e(pVar, "zone");
        if (pVar instanceof ig.q) {
            return new f(pVar, (ig.q) pVar, dVar);
        }
        ng.f b11 = pVar.b();
        ig.g k12 = ig.g.k1(dVar);
        List<ig.q> d11 = b11.d(k12);
        if (d11.size() == 1) {
            qVar = d11.get(0);
        } else if (d11.size() == 0) {
            ng.d b12 = b11.b(k12);
            dVar = dVar.l1(b12.d().b());
            qVar = b12.e();
        } else if (qVar == null || !d11.contains(qVar)) {
            qVar = d11.get(0);
        }
        lg.c.e(qVar, "offset");
        return new f(pVar, qVar, dVar);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 13, this);
    }

    @Override // jg.e
    public final ig.q H0() {
        return this.f70008c;
    }

    @Override // mg.e
    public final boolean L(mg.h hVar) {
        if (hVar instanceof EnumC8145a) {
            return true;
        }
        return hVar != null && hVar.a(this);
    }

    @Override // jg.e
    public final ig.p L0() {
        return this.f70009d;
    }

    @Override // jg.e, mg.d
    public final e<D> T0(long j11, mg.k kVar) {
        return kVar instanceof mg.b ? k1(this.f70007b.T0(j11, kVar)) : a1().L0().e(kVar.a(this, j11));
    }

    @Override // jg.e
    public final c<D> c1() {
        return this.f70007b;
    }

    @Override // jg.e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && compareTo((e) obj) == 0;
    }

    @Override // jg.e
    public final int hashCode() {
        return (this.f70007b.hashCode() ^ this.f70008c.hashCode()) ^ Integer.rotateLeft(this.f70009d.hashCode(), 3);
    }

    @Override // jg.e, mg.d
    public final e j1(long j11, mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return a1().L0().e(hVar.e(this, j11));
        }
        EnumC8145a enumC8145a = (EnumC8145a) hVar;
        int i11 = a.f70010a[enumC8145a.ordinal()];
        if (i11 == 1) {
            return T0(j11 - W0(), mg.b.SECONDS);
        }
        ig.p pVar = this.f70009d;
        d<D> dVar = this.f70007b;
        if (i11 != 2) {
            return m1(pVar, this.f70008c, dVar.j1(j11, hVar));
        }
        ig.e a12 = ig.e.a1(dVar.T0(ig.q.u(enumC8145a.h(j11))), dVar.a1().W0());
        g L02 = a1().L0();
        ig.q a11 = pVar.b().a(a12);
        lg.c.e(a11, "offset");
        return new f(pVar, a11, (d) L02.j(ig.g.x1(a12.L0(), a12.M0(), a11)));
    }

    @Override // jg.e
    public final e<D> l1(ig.p pVar) {
        return m1(pVar, this.f70008c, this.f70007b);
    }

    @Override // jg.e, Lf.a
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f70007b.toString());
        ig.q qVar = this.f70008c;
        sb2.append(qVar.toString());
        String sb3 = sb2.toString();
        ig.p pVar = this.f70009d;
        if (qVar == pVar) {
            return sb3;
        }
        return sb3 + '[' + pVar.toString() + ']';
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f70007b);
        objectOutput.writeObject(this.f70008c);
        objectOutput.writeObject(this.f70009d);
    }
}
