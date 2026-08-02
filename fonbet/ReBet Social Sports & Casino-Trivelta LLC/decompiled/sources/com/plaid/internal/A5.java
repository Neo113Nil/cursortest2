package com.plaid.internal;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class A5 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.b f39154a;

    public A5(C3727q5 c3727q5, Gg.b bVar) {
        this.f39154a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f39154a.get();
        Intrinsics.checkNotNullParameter(application, "application");
        return (C3691m5) Gg.d.d(new C3691m5(application));
    }
}
