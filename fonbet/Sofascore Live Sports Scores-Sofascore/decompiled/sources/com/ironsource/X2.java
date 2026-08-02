package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class X2 implements InterfaceC4198m9 {

    @NotNull
    private final C4011c1 a;

    @NotNull
    private final S2 b;

    public X2(@NotNull C4011c1 c4011c1, @NotNull S2 s2) {
        c4011c1.getClass();
        s2.getClass();
        this.a = c4011c1;
        this.b = s2;
    }

    @Override // com.ironsource.InterfaceC4029d1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC4349v
    public long b() {
        return this.b.b();
    }

    @Override // com.ironsource.InterfaceC4029d1
    @NotNull
    public String c() {
        String f = this.a.f();
        f.getClass();
        return f;
    }

    @Override // com.ironsource.InterfaceC4029d1
    public boolean d() {
        return !this.a.j();
    }

    @Override // com.ironsource.InterfaceC4029d1
    @NotNull
    public String e() {
        String a = this.a.a();
        a.getClass();
        return a;
    }

    @Override // com.ironsource.InterfaceC4029d1
    @NotNull
    public EnumC4252p9 f() {
        return EnumC4252p9.b.a(this.a.d());
    }
}
