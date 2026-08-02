package com.appsflyer.internal;

import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface AFd1ySDK {
    void AFKeystoreWrapper();

    void AFKeystoreWrapper(@NotNull String str, @NotNull String... strArr);

    void AFKeystoreWrapper(@NotNull Throwable th);

    void AFLogger(@NotNull String str, @NotNull String str2);

    boolean AFLogger();

    void d();

    void d(@NotNull String str, int i, @NotNull String str2);

    boolean e();

    void registerClient();

    void unregisterClient();

    void unregisterClient(@Nullable String str, @NotNull String str2);

    void v_(@Nullable String str, @Nullable PackageManager packageManager);
}
