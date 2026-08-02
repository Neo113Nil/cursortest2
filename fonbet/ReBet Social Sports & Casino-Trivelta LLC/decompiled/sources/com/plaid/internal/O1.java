package com.plaid.internal;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class O1 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.b f39473a;

    /* renamed from: b, reason: collision with root package name */
    public final W1 f39474b;

    public O1(I1 i12, Gg.b bVar, W1 w12) {
        this.f39473a = bVar;
        this.f39474b = w12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f39473a.get();
        InterfaceC3639g7 snaApi = (InterfaceC3639g7) this.f39474b.get();
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(snaApi, "snaApi");
        return (C3736r6) Gg.d.d(new C3736r6(application.getApplicationContext(), snaApi));
    }
}
