package com.plaid.internal;

import android.app.Application;

/* loaded from: classes3.dex */
public final class O5 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.b f39488a;

    public O5(Gg.b bVar) {
        this.f39488a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new N5((Application) this.f39488a.get());
    }
}
