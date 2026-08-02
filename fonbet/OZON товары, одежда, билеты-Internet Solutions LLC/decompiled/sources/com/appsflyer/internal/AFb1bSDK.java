package com.appsflyer.internal;

import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface AFb1bSDK {
    void AFInAppEventParameterName();

    void AFInAppEventParameterName(@NotNull String str, int i11, @NotNull String str2);

    void AFInAppEventParameterName(@NotNull String str, @NotNull String... strArr);

    void AFInAppEventType();

    void AFInAppEventType(@NotNull String str, @NotNull String str2);

    void AFInAppEventType(@NotNull Throwable th2);

    void AFKeystoreWrapper();

    boolean d();

    void valueOf();

    void valueOf(String str, PackageManager packageManager);

    void valueOf(@NotNull String str, @NotNull String str2);

    boolean values();
}
