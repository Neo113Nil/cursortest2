package net.time4j.tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.List;
import li.InterfaceC5467a;
import li.InterfaceC5472f;
import li.InterfaceC5473g;

/* loaded from: classes5.dex */
public final class c extends l {
    private static final long serialVersionUID = 1738909257417361021L;

    /* renamed from: v, reason: collision with root package name */
    public final transient k f58329v;

    /* renamed from: w, reason: collision with root package name */
    public final transient m f58330w;

    /* renamed from: x, reason: collision with root package name */
    public final transient o f58331x;

    public c(k kVar, m mVar) {
        this(kVar, mVar, l.f58348d);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 14);
    }

    @Override // net.time4j.tz.l
    public p A(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g) {
        List c10 = this.f58330w.c(interfaceC5467a, interfaceC5473g);
        return c10.size() == 1 ? (p) c10.get(0) : p.p(this.f58330w.a(interfaceC5467a, interfaceC5473g).i());
    }

    @Override // net.time4j.tz.l
    public p B(InterfaceC5472f interfaceC5472f) {
        q e10 = this.f58330w.e(interfaceC5472f);
        return e10 == null ? this.f58330w.d() : p.p(e10.i());
    }

    @Override // net.time4j.tz.l
    public o E() {
        return this.f58331x;
    }

    @Override // net.time4j.tz.l
    public boolean I(InterfaceC5472f interfaceC5472f) {
        InterfaceC5472f b10;
        q e10;
        q e11 = this.f58330w.e(interfaceC5472f);
        if (e11 == null) {
            return false;
        }
        int d10 = e11.d();
        if (d10 > 0) {
            return true;
        }
        if (d10 >= 0 && this.f58330w.b() && (e10 = this.f58330w.e((b10 = i.b(e11.e(), 0)))) != null) {
            return e10.h() == e11.h() ? e10.d() < 0 : I(b10);
        }
        return false;
    }

    @Override // net.time4j.tz.l
    public boolean J() {
        return this.f58330w.isEmpty();
    }

    @Override // net.time4j.tz.l
    public boolean K(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g) {
        q a10 = this.f58330w.a(interfaceC5467a, interfaceC5473g);
        return a10 != null && a10.j();
    }

    @Override // net.time4j.tz.l
    public l Q(o oVar) {
        return this.f58331x == oVar ? this : new c(this.f58329v, this.f58330w, oVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f58329v.a().equals(cVar.f58329v.a()) && this.f58330w.equals(cVar.f58330w) && this.f58331x.equals(cVar.f58331x)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f58329v.a().hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        sb2.append(c.class.getName());
        sb2.append(':');
        sb2.append(this.f58329v.a());
        sb2.append(",history={");
        sb2.append(this.f58330w);
        sb2.append("},strategy=");
        sb2.append(this.f58331x);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.tz.l
    public m y() {
        return this.f58330w;
    }

    @Override // net.time4j.tz.l
    public k z() {
        return this.f58329v;
    }

    public c(k kVar, m mVar, o oVar) {
        if (kVar == null) {
            throw new NullPointerException("Missing timezone id.");
        }
        if ((kVar instanceof p) && !mVar.isEmpty()) {
            throw new IllegalArgumentException("Fixed zonal offset can't be combined with offset transitions: " + kVar.a());
        }
        if (mVar == null) {
            throw new NullPointerException("Missing timezone history.");
        }
        if (oVar == null) {
            throw new NullPointerException("Missing transition strategy.");
        }
        this.f58329v = kVar;
        this.f58330w = mVar;
        this.f58331x = oVar;
    }
}
