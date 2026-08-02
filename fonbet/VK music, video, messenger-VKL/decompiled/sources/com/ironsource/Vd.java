package com.ironsource;

/* loaded from: classes13.dex */
public final class Vd implements InterfaceC4439m9 {
    private final C4288e1 a;
    private final C4301ee b;

    public Vd(C4288e1 c4288e1, C4301ee c4301ee) {
        this.a = c4288e1;
        this.b = c4301ee;
    }

    @Override // com.ironsource.InterfaceC4306f1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC4590v
    public long b() {
        return this.b.i();
    }

    @Override // com.ironsource.InterfaceC4306f1
    public String c() {
        return this.a.f();
    }

    @Override // com.ironsource.InterfaceC4306f1
    public boolean d() {
        return !this.a.j();
    }

    @Override // com.ironsource.InterfaceC4306f1
    public String e() {
        return this.a.a();
    }

    @Override // com.ironsource.InterfaceC4306f1
    public EnumC4493p9 f() {
        return EnumC4493p9.b.a(this.a.d());
    }
}
