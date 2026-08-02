package com.ironsource;

/* renamed from: com.ironsource.a6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4221a6 implements InterfaceC4386ja {
    private final Ye a;
    private long b;

    public C4221a6(InterfaceC4419l7 interfaceC4419l7, Ye ye) {
        this.a = ye;
        interfaceC4419l7.a(this);
        f();
    }

    private final long e() {
        return System.currentTimeMillis() - this.b;
    }

    private final void f() {
        this.b = System.currentTimeMillis();
    }

    @Override // com.ironsource.InterfaceC4386ja
    public void a() {
        this.a.a(Long.valueOf(e()));
        this.a.run();
    }

    @Override // com.ironsource.InterfaceC4386ja
    public void b() {
        f();
    }

    @Override // com.ironsource.InterfaceC4386ja
    public void c() {
    }

    @Override // com.ironsource.InterfaceC4386ja
    public void d() {
    }
}
