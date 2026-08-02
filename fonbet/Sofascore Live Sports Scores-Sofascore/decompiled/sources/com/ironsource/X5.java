package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class X5 implements InterfaceC4128ia {

    @NotNull
    private final We a;
    private long b;

    public X5(@NotNull InterfaceC4107h7 interfaceC4107h7, @NotNull We we) {
        interfaceC4107h7.getClass();
        we.getClass();
        this.a = we;
        interfaceC4107h7.a(this);
        f();
    }

    private final long e() {
        return System.currentTimeMillis() - this.b;
    }

    private final void f() {
        this.b = System.currentTimeMillis();
    }

    @Override // com.ironsource.InterfaceC4128ia
    public void a() {
        this.a.a(Long.valueOf(e()));
        this.a.run();
    }

    @Override // com.ironsource.InterfaceC4128ia
    public void b() {
        f();
    }

    @Override // com.ironsource.InterfaceC4128ia
    public void c() {
    }

    @Override // com.ironsource.InterfaceC4128ia
    public void d() {
    }
}
