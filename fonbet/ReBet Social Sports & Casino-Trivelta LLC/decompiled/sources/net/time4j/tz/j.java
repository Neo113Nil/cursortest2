package net.time4j.tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import li.InterfaceC5467a;
import li.InterfaceC5472f;
import li.InterfaceC5473g;

/* loaded from: classes5.dex */
public final class j extends l implements m {
    private static final long serialVersionUID = 7807230388259573234L;

    /* renamed from: v, reason: collision with root package name */
    public static final j f58344v = new j(p.f58410k);
    private final p offset;

    public j(p pVar) {
        if (pVar.i() == 0) {
            this.offset = pVar;
        } else {
            int j10 = pVar.j();
            this.offset = p.p(pVar.i() < 0 ? j10 - 1 : j10);
        }
    }

    public static j R(p pVar) {
        return (pVar.j() == 0 && pVar.i() == 0) ? f58344v : new j(pVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.offset.i() != 0) {
            throw new InvalidObjectException("Fractional offset is invalid.");
        }
    }

    @Override // net.time4j.tz.l
    public p A(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g) {
        return this.offset;
    }

    @Override // net.time4j.tz.l
    public p B(InterfaceC5472f interfaceC5472f) {
        return this.offset;
    }

    @Override // net.time4j.tz.l
    public o E() {
        return l.f58348d;
    }

    @Override // net.time4j.tz.l
    public boolean I(InterfaceC5472f interfaceC5472f) {
        return false;
    }

    @Override // net.time4j.tz.l
    public boolean J() {
        return true;
    }

    @Override // net.time4j.tz.l
    public boolean K(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g) {
        return false;
    }

    @Override // net.time4j.tz.l
    public l Q(o oVar) {
        return this;
    }

    @Override // net.time4j.tz.m
    public q a(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g) {
        return null;
    }

    @Override // net.time4j.tz.m
    public boolean b() {
        return false;
    }

    @Override // net.time4j.tz.m
    public List c(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g) {
        return Collections.singletonList(this.offset);
    }

    @Override // net.time4j.tz.m
    public p d() {
        return this.offset;
    }

    @Override // net.time4j.tz.m
    public q e(InterfaceC5472f interfaceC5472f) {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.offset.equals(((j) obj).offset);
        }
        return false;
    }

    public int hashCode() {
        return this.offset.hashCode();
    }

    @Override // net.time4j.tz.m
    public boolean isEmpty() {
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        sb2.append(j.class.getName());
        sb2.append(':');
        sb2.append(this.offset);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.tz.l
    public String w(d dVar, Locale locale) {
        return dVar.a() ? this.offset.toString() : this.offset.a();
    }

    @Override // net.time4j.tz.l
    public m y() {
        return this;
    }

    @Override // net.time4j.tz.l
    public k z() {
        return this.offset;
    }
}
