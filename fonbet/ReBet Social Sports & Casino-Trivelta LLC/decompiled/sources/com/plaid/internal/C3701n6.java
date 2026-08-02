package com.plaid.internal;

import ei.AbstractC4212b;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.n6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3701n6 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<N5> f40858a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C3575c5> f40859b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<AbstractC4212b> f40860c;

    public C3701n6(Provider<N5> provider, Provider<C3575c5> provider2, Provider<AbstractC4212b> provider3) {
        this.f40858a = provider;
        this.f40859b = provider2;
        this.f40860c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C3692m6(this.f40858a.get(), this.f40859b.get(), this.f40860c.get());
    }
}
