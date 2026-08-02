package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class F2 implements K {
    private final InterfaceC2765yg a;

    public F2(InterfaceC2765yg viewBinder) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        this.a = viewBinder;
    }

    @Override // com.ironsource.K
    public void a(B2 bannerAdInstance) {
        Intrinsics.checkNotNullParameter(bannerAdInstance, "bannerAdInstance");
        bannerAdInstance.a(this.a);
    }
}
