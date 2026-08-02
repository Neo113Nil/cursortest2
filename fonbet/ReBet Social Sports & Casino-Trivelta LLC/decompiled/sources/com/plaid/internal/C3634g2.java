package com.plaid.internal;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.g2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3634g2 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final C3562b2 f40622a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<L7> f40623b;

    public C3634g2(I1 i12, C3562b2 c3562b2, Provider provider) {
        this.f40622a = c3562b2;
        this.f40623b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        O7 webviewFallbackUriStore = (O7) this.f40622a.get();
        L7 webviewFallbackBaseUrlOverWriter = this.f40623b.get();
        Intrinsics.checkNotNullParameter(webviewFallbackUriStore, "webviewFallbackUriStore");
        Intrinsics.checkNotNullParameter(webviewFallbackBaseUrlOverWriter, "webviewFallbackBaseUrlOverWriter");
        return (C8) Gg.d.d(webviewFallbackUriStore);
    }
}
