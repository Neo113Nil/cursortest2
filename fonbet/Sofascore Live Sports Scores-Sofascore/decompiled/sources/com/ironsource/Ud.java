package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ud implements InterfaceC4198m9 {

    @NotNull
    private final C4011c1 a;

    @NotNull
    private final C4042de b;

    public Ud(@NotNull C4011c1 c4011c1, @NotNull C4042de c4042de) {
        c4011c1.getClass();
        c4042de.getClass();
        this.a = c4011c1;
        this.b = c4042de;
    }

    @Override // com.ironsource.InterfaceC4029d1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC4349v
    public long b() {
        return this.b.i();
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
