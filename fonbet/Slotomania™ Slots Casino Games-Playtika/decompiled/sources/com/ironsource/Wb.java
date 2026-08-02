package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Wb implements K {
    private final Ob a;

    public Wb(Ob nativeAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        this.a = nativeAdBinder;
    }

    @Override // com.ironsource.K
    public void a(Vb nativeAdInstance) {
        Intrinsics.checkNotNullParameter(nativeAdInstance, "nativeAdInstance");
        nativeAdInstance.a(this.a);
    }
}
