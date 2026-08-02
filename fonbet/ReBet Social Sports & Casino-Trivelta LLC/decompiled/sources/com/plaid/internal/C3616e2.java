package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.e2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3616e2 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Z1 f40577a;

    public C3616e2(I1 i12, Z1 z12) {
        this.f40577a = z12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        E7 webviewBackgroundTransparencyStore = (E7) this.f40577a.get();
        Intrinsics.checkNotNullParameter(webviewBackgroundTransparencyStore, "webviewBackgroundTransparencyStore");
        return (A8) Gg.d.d(webviewBackgroundTransparencyStore);
    }
}
