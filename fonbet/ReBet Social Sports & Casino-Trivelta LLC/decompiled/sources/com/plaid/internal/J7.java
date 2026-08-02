package com.plaid.internal;

import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class J7 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C3787x3> f39315a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<B6> f39316b;

    public J7(Provider<C3787x3> provider, Provider<B6> provider2) {
        this.f39315a = provider;
        this.f39316b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new I7(this.f39315a.get(), this.f39316b.get());
    }
}
