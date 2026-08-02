package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class V1 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final C3562b2 f39703a;

    public V1(I1 i12, C3562b2 c3562b2) {
        this.f39703a = c3562b2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        O7 webviewFallbackUriStore = (O7) this.f39703a.get();
        Intrinsics.checkNotNullParameter(webviewFallbackUriStore, "webviewFallbackUriStore");
        return (C6) Gg.d.d(webviewFallbackUriStore);
    }
}
