package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* loaded from: classes6.dex */
public abstract class AFi1bSDK extends AFj1qSDK {
    private AFd1rSDK getMediationNetwork;

    public AFi1bSDK(String str, String str2, AFd1rSDK aFd1rSDK, Runnable runnable) {
        super(str, str2, runnable);
        this.getMediationNetwork = aFd1rSDK;
    }

    protected final boolean AFAdRevenueData() {
        if (this.getMediationNetwork.getRevenue.AFAdRevenueData("appsFlyerCount", 0) <= 0) {
            return true;
        }
        AFLogger.afRDLog("Install referrer will not load, the counter > 1, ");
        return false;
    }
}
