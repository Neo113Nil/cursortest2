package com.appsflyer.internal;

import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface AFd1oSDK {
    void AFAdRevenueData(@NotNull String str, int i5, @NotNull String str2);

    boolean AFAdRevenueData();

    boolean areAllFieldsValid();

    void getCurrencyIso4217Code();

    void getMediationNetwork();

    void getMonetizationNetwork();

    void getMonetizationNetwork(@NotNull String str, @NotNull String str2);

    void getRevenue();

    void getRevenue(@Nullable String str, @NotNull String str2);

    void getRevenue(@NotNull String str, @NotNull String... strArr);

    void getRevenue(@NotNull Throwable th2);

    void q_(@Nullable String str, @Nullable PackageManager packageManager);
}
