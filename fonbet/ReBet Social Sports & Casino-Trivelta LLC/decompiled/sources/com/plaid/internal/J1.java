package com.plaid.internal;

import ei.AbstractC4212b;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class J1 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final I1 f39307a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<T3> f39308b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<AbstractC4212b> f39309c;

    public J1(I1 i12, Provider<T3> provider, Provider<AbstractC4212b> provider2) {
        this.f39307a = i12;
        this.f39308b = provider;
        this.f39309c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i12 = this.f39307a;
        T3 localPaneStateStore = this.f39308b.get();
        AbstractC4212b json = this.f39309c.get();
        i12.getClass();
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        Intrinsics.checkNotNullParameter(json, "json");
        return (C) Gg.d.d(new C(localPaneStateStore, json));
    }
}
