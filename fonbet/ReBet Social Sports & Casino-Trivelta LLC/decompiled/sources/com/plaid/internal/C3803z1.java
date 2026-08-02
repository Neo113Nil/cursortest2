package com.plaid.internal;

import ei.AbstractC4212b;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.z1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3803z1 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H5> f41228a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<AbstractC4212b> f41229b;

    public C3803z1(Provider<H5> provider, Provider<AbstractC4212b> provider2) {
        this.f41228a = provider;
        this.f41229b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C3794y1(this.f41228a.get(), Gg.a.c(this.f41229b));
    }
}
