package com.plaid.internal;

import android.app.Application;
import android.content.SharedPreferences;
import com.plaid.internal.C3556a6;
import com.plaid.internal.EnumC3664j5;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.plaid.internal.m5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3691m5 implements Y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f40797a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f40798b;

    public C3691m5(@NotNull Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40797a = context;
        this.f40798b = LazyKt.lazy(new C3682l5(this));
    }

    public final void a(@NotNull EnumC3664j5 environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        ((SharedPreferences) this.f40798b.getValue()).edit().putString("plaid_environment", environment.getJson()).apply();
    }

    @NotNull
    public final EnumC3664j5 b() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f40798b.getValue();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "<get-sharedPrefs>(...)");
        String a10 = C3567b7.a(sharedPreferences, EnumC3664j5.SANDBOX.getJson());
        try {
            EnumC3664j5.Companion.getClass();
            return EnumC3664j5.a.a(a10);
        } catch (Exception e10) {
            C3556a6.a.b(C3556a6.f39823a, "Unknown value was stored in shared prefs: " + a10, new Object[]{e10});
            return EnumC3664j5.SANDBOX;
        }
    }

    @Override // com.plaid.internal.Y
    @NotNull
    public final String a() {
        return b().name();
    }
}
