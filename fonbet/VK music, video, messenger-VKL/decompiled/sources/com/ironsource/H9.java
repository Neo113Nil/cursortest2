package com.ironsource;

/* loaded from: classes13.dex */
public final class H9 implements InterfaceC4439m9 {
    private final C4288e1 a;
    private final E9 b;

    public H9(C4288e1 c4288e1, E9 e9) {
        this.a = c4288e1;
        this.b = e9;
    }

    @Override // com.ironsource.InterfaceC4306f1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC4590v
    public long b() {
        return this.b.e();
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
