package net.time4j.tz.model;

import java.io.Serializable;
import li.AbstractC5468b;
import li.InterfaceC5467a;
import net.time4j.B;
import net.time4j.EnumC5706f;
import net.time4j.F;

/* loaded from: classes5.dex */
public abstract class g extends d implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: e, reason: collision with root package name */
    public final transient byte f58387e;

    public g(B b10, int i10, i iVar, int i11) {
        super(i10, iVar, i11);
        this.f58387e = (byte) b10.b();
    }

    @Override // net.time4j.tz.model.d
    public String a() {
        return "iso8601";
    }

    @Override // net.time4j.tz.model.d
    public final F b(int i10) {
        return (F) j(i10).E(c(), EnumC5706f.f57798h);
    }

    @Override // net.time4j.tz.model.d
    public int h(long j10) {
        return AbstractC5468b.h(AbstractC5468b.k(j10));
    }

    @Override // net.time4j.tz.model.d
    public int i(InterfaceC5467a interfaceC5467a) {
        return interfaceC5467a.n();
    }

    public abstract F j(int i10);

    public byte k() {
        return this.f58387e;
    }

    public boolean l(g gVar) {
        return f().equals(gVar.f()) && c() == gVar.c() && d() == gVar.d() && e() == gVar.e() && this.f58387e == gVar.f58387e;
    }
}
