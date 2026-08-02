package com.plaid.internal;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Q1 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final I1 f39563a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<L4> f39564b;

    public Q1(I1 i12, Provider<L4> provider) {
        this.f39563a = i12;
        this.f39564b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i12 = this.f39563a;
        L4 paneStore = this.f39564b.get();
        i12.getClass();
        Intrinsics.checkNotNullParameter(paneStore, "paneStore");
        return (InterfaceC3799y6) Gg.d.d(paneStore);
    }
}
