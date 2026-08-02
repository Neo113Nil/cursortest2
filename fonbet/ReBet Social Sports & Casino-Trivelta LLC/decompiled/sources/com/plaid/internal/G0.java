package com.plaid.internal;

import android.app.Application;
import android.provider.Settings;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class G0 {
    @Nullable
    public static String a(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return Settings.Secure.getString(application.getApplicationContext().getContentResolver(), "android_id");
    }
}
