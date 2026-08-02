package com.plaid.internal;

import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class C0 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC3799y6> f39182a;

    public C0(Provider<InterfaceC3799y6> provider) {
        this.f39182a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new A0(this.f39182a.get());
    }
}
