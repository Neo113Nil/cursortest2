package com.plaid.internal;

import android.app.Application;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class K1 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.b f39324a;

    public K1(I1 i12, Gg.b bVar) {
        this.f39324a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f39324a.get();
        Intrinsics.checkNotNullParameter(application, "application");
        File cacheDir = application.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        return (C3655i5) Gg.d.d(new C3655i5(cacheDir, "plaid-sdk/images"));
    }
}
