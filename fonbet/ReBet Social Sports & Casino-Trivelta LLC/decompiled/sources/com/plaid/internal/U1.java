package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class U1 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final C3552a2 f39655a;

    public U1(I1 i12, C3552a2 c3552a2) {
        this.f39655a = c3552a2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        M7 webviewFallbackIdStore = (M7) this.f39655a.get();
        Intrinsics.checkNotNullParameter(webviewFallbackIdStore, "webviewFallbackIdStore");
        return (B6) Gg.d.d(webviewFallbackIdStore);
    }
}
