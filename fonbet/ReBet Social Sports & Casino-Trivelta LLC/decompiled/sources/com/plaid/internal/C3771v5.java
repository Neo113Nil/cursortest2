package com.plaid.internal;

import android.app.Application;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.v5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3771v5 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.b f41149a;

    public C3771v5(C3727q5 c3727q5, Gg.b bVar) {
        this.f41149a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f41149a.get();
        Intrinsics.checkNotNullParameter(application, "application");
        SharedPreferences sharedPreferences = application.getSharedPreferences("plaid_feature_overrides", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences sharedPreferences2 = application.getSharedPreferences("plaid_features_from_server", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(...)");
        return (AbstractC3606d1) Gg.d.d(new C3557a7(sharedPreferences, sharedPreferences2));
    }
}
