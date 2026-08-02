package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface AFc1cSDK {
    @Nullable
    String AFAdRevenueData(@NotNull Throwable th2, @NotNull String str);

    void getCurrencyIso4217Code(int i5, int i10);

    boolean getCurrencyIso4217Code();

    int getMediationNetwork();

    boolean getMonetizationNetwork(@NotNull String... strArr);

    @NotNull
    List<AFc1aSDK> getRevenue();
}
