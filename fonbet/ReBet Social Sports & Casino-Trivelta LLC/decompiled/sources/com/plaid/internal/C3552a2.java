package com.plaid.internal;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.a2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3552a2 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final I1 f39817a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<T3> f39818b;

    public C3552a2(I1 i12, Provider<T3> provider) {
        this.f39817a = i12;
        this.f39818b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i12 = this.f39817a;
        T3 localPaneStateStore = this.f39818b.get();
        i12.getClass();
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        return (M7) Gg.d.d(new M7(localPaneStateStore));
    }
}
