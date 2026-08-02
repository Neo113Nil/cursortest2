package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface AFc1tSDK {
    @NotNull
    List<AFc1uSDK> getCurrencyIso4217Code();

    @Nullable
    String getMediationNetwork(@NotNull AFc1uSDK aFc1uSDK);

    void getMediationNetwork();

    void getRevenue();

    boolean getRevenue(@Nullable String str);
}
