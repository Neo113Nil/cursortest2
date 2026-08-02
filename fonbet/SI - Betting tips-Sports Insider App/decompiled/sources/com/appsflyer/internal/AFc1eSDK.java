package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFc1eSDK {

    @Nullable
    public AFb1rSDK AFAdRevenueData;
    public boolean areAllFieldsValid;

    @Nullable
    public AppsFlyerConsent component1;
    public boolean component2;

    @Nullable
    public AFh1rSDK component3;

    @Nullable
    public AFd1aSDK component4;

    @Nullable
    public AFb1gSDK copydefault;

    @Nullable
    public String getCurrencyIso4217Code;

    @Nullable
    public String getMediationNetwork;

    @Nullable
    public String getMonetizationNetwork;

    @Nullable
    public AFb1tSDK getRevenue;

    public final boolean AFAdRevenueData() {
        return this.component2;
    }

    public final synchronized void getMediationNetwork(@Nullable AFd1aSDK aFd1aSDK) {
        this.component4 = aFd1aSDK;
    }

    public final boolean getMediationNetwork() {
        return this.areAllFieldsValid;
    }
}
