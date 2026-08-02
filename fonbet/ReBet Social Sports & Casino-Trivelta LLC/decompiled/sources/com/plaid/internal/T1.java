package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class T1 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Z1 f39630a;

    public T1(I1 i12, Z1 z12) {
        this.f39630a = z12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        E7 webviewBackgroundTransparencyStore = (E7) this.f39630a.get();
        Intrinsics.checkNotNullParameter(webviewBackgroundTransparencyStore, "webviewBackgroundTransparencyStore");
        return (A6) Gg.d.d(webviewBackgroundTransparencyStore);
    }
}
