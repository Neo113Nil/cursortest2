package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.f2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3625f2 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final C3552a2 f40595a;

    public C3625f2(I1 i12, C3552a2 c3552a2) {
        this.f40595a = c3552a2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        M7 webviewFallbackIdStore = (M7) this.f40595a.get();
        Intrinsics.checkNotNullParameter(webviewFallbackIdStore, "webviewFallbackIdStore");
        return (B8) Gg.d.d(webviewFallbackIdStore);
    }
}
