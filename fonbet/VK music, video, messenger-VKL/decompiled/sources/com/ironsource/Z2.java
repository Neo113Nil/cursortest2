package com.ironsource;

/* loaded from: classes13.dex */
public final class Z2 implements InterfaceC4439m9 {
    private final C4288e1 a;
    private final U2 b;

    public Z2(C4288e1 c4288e1, U2 u2) {
        this.a = c4288e1;
        this.b = u2;
    }

    @Override // com.ironsource.InterfaceC4306f1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC4590v
    public long b() {
        return this.b.b();
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
