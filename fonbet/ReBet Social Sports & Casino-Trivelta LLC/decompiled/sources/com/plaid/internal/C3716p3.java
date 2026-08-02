package com.plaid.internal;

import android.app.Application;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.p3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3716p3 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.b f40958a;

    public C3716p3(C3608d3 c3608d3, Gg.b bVar) {
        this.f40958a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f40958a.get();
        Intrinsics.checkNotNullParameter(application, "application");
        Resources resources = application.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return (Resources) Gg.d.d(resources);
    }
}
