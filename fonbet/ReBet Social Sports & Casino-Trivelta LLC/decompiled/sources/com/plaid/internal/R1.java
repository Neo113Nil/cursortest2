package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class R1 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final N1 f39575a;

    public R1(I1 i12, N1 n12) {
        this.f39575a = n12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C3576c6 preCompletionResultStore = (C3576c6) this.f39575a.get();
        Intrinsics.checkNotNullParameter(preCompletionResultStore, "preCompletionResultStore");
        return (InterfaceC3808z6) Gg.d.d(preCompletionResultStore);
    }
}
