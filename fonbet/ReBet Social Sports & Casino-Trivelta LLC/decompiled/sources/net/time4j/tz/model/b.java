package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.List;
import li.InterfaceC5467a;
import li.InterfaceC5472f;
import li.InterfaceC5473g;
import net.time4j.tz.p;
import net.time4j.tz.q;

/* loaded from: classes5.dex */
public final class b extends l {
    private static final long serialVersionUID = 1749643877954103721L;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f58374b;

    /* renamed from: c, reason: collision with root package name */
    public final transient a f58375c;

    /* renamed from: d, reason: collision with root package name */
    public final transient j f58376d;

    /* renamed from: e, reason: collision with root package name */
    public final transient q f58377e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f58378f = 0;

    public b(int i10, List list, List list2, boolean z10, boolean z11) {
        this.f58374b = i10;
        a aVar = new a(list, z10, z11);
        this.f58375c = aVar;
        q n10 = aVar.n();
        this.f58377e = n10;
        this.f58376d = new j(n10, list2, z10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 127);
    }

    @Override // net.time4j.tz.m
    public q a(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g) {
        return this.f58375c.m(interfaceC5467a, interfaceC5473g, this.f58376d);
    }

    @Override // net.time4j.tz.m
    public boolean b() {
        return this.f58376d.b() || this.f58375c.b();
    }

    @Override // net.time4j.tz.m
    public List c(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g) {
        return this.f58375c.p(interfaceC5467a, interfaceC5473g, this.f58376d);
    }

    @Override // net.time4j.tz.m
    public p d() {
        return this.f58375c.d();
    }

    @Override // net.time4j.tz.m
    public q e(InterfaceC5472f interfaceC5472f) {
        if (interfaceC5472f.k() < this.f58377e.e()) {
            return this.f58375c.e(interfaceC5472f);
        }
        q e10 = this.f58376d.e(interfaceC5472f);
        return e10 == null ? this.f58377e : e10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f58375c.l(bVar.f58375c, this.f58374b, bVar.f58374b) && this.f58376d.n().equals(bVar.f58376d.n())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f58378f;
        if (i10 != 0) {
            return i10;
        }
        int q10 = this.f58375c.q(this.f58374b) + (this.f58376d.n().hashCode() * 37);
        this.f58378f = q10;
        return q10;
    }

    public List k() {
        return this.f58376d.n();
    }

    public void l(ObjectOutput objectOutput) {
        this.f58375c.t(this.f58374b, objectOutput);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(b.class.getName());
        sb2.append("[transition-count=");
        sb2.append(this.f58374b);
        sb2.append(",hash=");
        sb2.append(hashCode());
        sb2.append(",last-rules=");
        sb2.append(this.f58376d.n());
        sb2.append(']');
        return sb2.toString();
    }
}
