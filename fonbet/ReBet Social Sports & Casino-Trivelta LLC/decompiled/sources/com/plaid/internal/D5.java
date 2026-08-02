package com.plaid.internal;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class D5 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.b f39205a;

    public D5(C3727q5 c3727q5, Gg.b bVar) {
        this.f39205a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f39205a.get();
        Intrinsics.checkNotNullParameter(application, "application");
        return (I5) Gg.d.d(new I5(application));
    }
}
