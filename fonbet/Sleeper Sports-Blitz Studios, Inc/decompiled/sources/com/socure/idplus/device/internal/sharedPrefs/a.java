package com.socure.idplus.device.internal.sharedPrefs;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f874a;
    public final SharedPreferences.Editor b;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("socure_pref", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.f874a = sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(edit, "edit(...)");
        this.b = edit;
    }

    public final void a() {
        String string = this.f874a.getString("SocureDeviceRiskUUID", "");
        if (string == null || StringsKt.isBlank(string)) {
            return;
        }
        this.b.remove("SocureDeviceRiskUUID");
        this.b.apply();
    }
}
