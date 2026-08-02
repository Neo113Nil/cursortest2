package com.plaid.internal;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class N1 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final I1 f39386a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<T3> f39387b;

    public N1(I1 i12, Provider<T3> provider) {
        this.f39386a = i12;
        this.f39387b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i12 = this.f39386a;
        T3 localPaneStateStore = this.f39387b.get();
        i12.getClass();
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        return (C3576c6) Gg.d.d(new C3576c6(localPaneStateStore));
    }
}
