package ng;

import ig.q;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class d implements Comparable<d>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final ig.g f77121a;

    /* renamed from: b, reason: collision with root package name */
    private final q f77122b;

    /* renamed from: c, reason: collision with root package name */
    private final q f77123c;

    d(ig.g gVar, q qVar, q qVar2) {
        this.f77121a = gVar;
        this.f77122b = qVar;
        this.f77123c = qVar2;
    }

    private Object writeReplace() {
        return new C8592a((byte) 2, this);
    }

    public final ig.g a() {
        return this.f77121a.B1(this.f77123c.i() - this.f77122b.i());
    }

    public final ig.g b() {
        return this.f77121a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        d dVar2 = dVar;
        q qVar = this.f77122b;
        return ig.e.a1(this.f77121a.T0(qVar), r1.a1().W0()).compareTo(ig.e.a1(dVar2.f77121a.T0(dVar2.f77122b), r1.a1().W0()));
    }

    public final ig.d d() {
        return ig.d.e(this.f77123c.i() - this.f77122b.i());
    }

    public final q e() {
        return this.f77123c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f77121a.equals(dVar.f77121a) && this.f77122b.equals(dVar.f77122b) && this.f77123c.equals(dVar.f77123c)) {
                return true;
            }
        }
        return false;
    }

    public final q f() {
        return this.f77122b;
    }

    final List<q> g() {
        return h() ? Collections.EMPTY_LIST : Arrays.asList(this.f77122b, this.f77123c);
    }

    public final boolean h() {
        return this.f77123c.i() > this.f77122b.i();
    }

    public final int hashCode() {
        return (this.f77121a.hashCode() ^ this.f77122b.hashCode()) ^ Integer.rotateLeft(this.f77123c.hashCode(), 16);
    }

    public final long i() {
        return this.f77121a.T0(this.f77122b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transition[");
        sb2.append(h() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f77121a);
        sb2.append(this.f77122b);
        sb2.append(" to ");
        sb2.append(this.f77123c);
        sb2.append(']');
        return sb2.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        C8592a.f(i(), objectOutput);
        C8592a.g(this.f77122b, objectOutput);
        C8592a.g(this.f77123c, objectOutput);
    }

    d(long j11, q qVar, q qVar2) {
        this.f77121a = ig.g.x1(j11, 0, qVar);
        this.f77122b = qVar;
        this.f77123c = qVar2;
    }
}
