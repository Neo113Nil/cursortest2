package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.d2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3607d2 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final N1 f40554a;

    public C3607d2(I1 i12, N1 n12) {
        this.f40554a = n12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C3576c6 preCompletionResultStore = (C3576c6) this.f40554a.get();
        Intrinsics.checkNotNullParameter(preCompletionResultStore, "preCompletionResultStore");
        return (z8) Gg.d.d(preCompletionResultStore);
    }
}
