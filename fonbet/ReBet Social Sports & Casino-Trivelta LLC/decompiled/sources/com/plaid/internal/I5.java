package com.plaid.internal;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.plaid.link.Plaid;
import com.plaid.link.R;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class I5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f39298a;

    @Inject
    public I5(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f39298a = application;
    }

    @NotNull
    public final String a() {
        Bundle bundle = this.f39298a.getPackageManager().getApplicationInfo(this.f39298a.getPackageName(), 128).metaData;
        String string = bundle != null ? bundle.getString("com.plaid.link.react_native") : null;
        if (string != null) {
            String string2 = this.f39298a.getString(R.string.plaid_user_agent_string_format_react_native, string, Plaid.getVERSION_NAME(), this.f39298a.getPackageName(), String.valueOf(Build.VERSION.SDK_INT));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = this.f39298a.getString(R.string.plaid_user_agent_string_format_android, Plaid.getVERSION_NAME(), this.f39298a.getPackageName(), String.valueOf(Build.VERSION.SDK_INT));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }
}
