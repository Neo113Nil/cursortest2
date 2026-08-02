package net.time4j.tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import li.InterfaceC5467a;
import li.InterfaceC5472f;
import li.InterfaceC5473g;

/* loaded from: classes5.dex */
public final class a extends l {
    private static final long serialVersionUID = -2894726563499525332L;
    private final l fallback;
    private final k tzid;

    public a(k kVar, l lVar) {
        if (kVar == null || lVar == null) {
            throw null;
        }
        this.tzid = kVar;
        this.fallback = lVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 12);
    }

    @Override // net.time4j.tz.l
    public p A(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g) {
        return this.fallback.A(interfaceC5467a, interfaceC5473g);
    }

    @Override // net.time4j.tz.l
    public p B(InterfaceC5472f interfaceC5472f) {
        return this.fallback.B(interfaceC5472f);
    }

    @Override // net.time4j.tz.l
    public o E() {
        return this.fallback.E();
    }

    @Override // net.time4j.tz.l
    public boolean I(InterfaceC5472f interfaceC5472f) {
        return this.fallback.I(interfaceC5472f);
    }

    @Override // net.time4j.tz.l
    public boolean J() {
        return this.fallback.J();
    }

    @Override // net.time4j.tz.l
    public boolean K(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g) {
        return this.fallback.K(interfaceC5467a, interfaceC5473g);
    }

    @Override // net.time4j.tz.l
    public l Q(o oVar) {
        return new a(this.tzid, this.fallback.Q(oVar));
    }

    public l R() {
        return this.fallback;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.tzid.a().equals(aVar.tzid.a()) && this.fallback.equals(aVar.fallback)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.tzid.a().hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        sb2.append(a.class.getName());
        sb2.append(':');
        sb2.append(this.tzid.a());
        sb2.append(",fallback=");
        sb2.append(this.fallback);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.tz.l
    public m y() {
        return this.fallback.y();
    }

    @Override // net.time4j.tz.l
    public k z() {
        return this.tzid;
    }
}
