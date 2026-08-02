package com.plaid.internal;

import javax.inject.Provider;

/* renamed from: com.plaid.internal.l6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3683l6 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Z2> f40765a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Y2> f40766b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<N5> f40767c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C3561b1> f40768d;

    /* renamed from: e, reason: collision with root package name */
    public final C3701n6 f40769e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<L7> f40770f;

    public C3683l6(Provider provider, Provider provider2, Provider provider3, Provider provider4, C3701n6 c3701n6, Provider provider5) {
        this.f40765a = provider;
        this.f40766b = provider2;
        this.f40767c = provider3;
        this.f40768d = provider4;
        this.f40769e = c3701n6;
        this.f40770f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C3674k6(this.f40765a.get(), this.f40766b.get(), this.f40767c.get(), this.f40768d.get(), (C3692m6) this.f40769e.get(), this.f40770f.get());
    }
}
