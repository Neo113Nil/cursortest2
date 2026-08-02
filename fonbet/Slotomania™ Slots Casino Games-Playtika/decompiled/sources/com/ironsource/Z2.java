package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Z2 implements InterfaceC2525l9 {
    private final C2392e1 a;
    private final U2 b;

    public Z2(C2392e1 adapterConfig, U2 adFormatConfigurations) {
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        this.a = adapterConfig;
        this.b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC2410f1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC2694v
    public long b() {
        return this.b.b();
    }

    @Override // com.ironsource.InterfaceC2410f1
    public String c() {
        String f = this.a.f();
        Intrinsics.checkNotNullExpressionValue(f, "adapterConfig.providerName");
        return f;
    }

    @Override // com.ironsource.InterfaceC2410f1
    public boolean d() {
        return !this.a.j();
    }

    @Override // com.ironsource.InterfaceC2410f1
    public String e() {
        String a = this.a.a();
        Intrinsics.checkNotNullExpressionValue(a, "adapterConfig.adSourceNameForEvents");
        return a;
    }

    @Override // com.ironsource.InterfaceC2410f1
    public EnumC2579o9 f() {
        return EnumC2579o9.b.a(this.a.d());
    }
}
