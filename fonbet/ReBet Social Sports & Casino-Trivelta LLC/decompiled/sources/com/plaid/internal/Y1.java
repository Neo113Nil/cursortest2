package com.plaid.internal;

import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Y1 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.b f39784a;

    public Y1(I1 i12, Gg.b bVar) {
        this.f39784a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f39784a.get();
        Intrinsics.checkNotNullParameter(application, "application");
        Context context = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        return (InterfaceC3773v7) Gg.d.d(new N(new L(context, new J())));
    }
}
