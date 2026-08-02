package com.plaid.internal;

/* loaded from: classes3.dex */
public final class B3 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final C3733r3 f39173a;

    /* renamed from: b, reason: collision with root package name */
    public final C3635g3 f39174b;

    public B3(C3733r3 c3733r3, C3635g3 c3635g3) {
        this.f39173a = c3733r3;
        this.f39174b = c3635g3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C3787x3((i8) this.f39173a.get(), (A3) this.f39174b.get());
    }
}
