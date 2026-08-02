package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFh1ySDK implements AFg1bSDK {
    private final AFc1fSDK AFAdRevenueData;
    private AFg1eSDK getMediationNetwork;
    private AFg1fSDK getMonetizationNetwork;
    private AFg1cSDK getRevenue;

    public AFh1ySDK(AFc1fSDK aFc1fSDK) {
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        this.AFAdRevenueData = aFc1fSDK;
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void AFAdRevenueData() {
        AFg1fSDK aFg1fSDK = this.getMonetizationNetwork;
        if (aFg1fSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1gSDK.v$default(aFLogger, AFh1zSDK.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1fSDK);
            this.getMonetizationNetwork = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getCurrencyIso4217Code() {
        AFg1cSDK aFg1cSDK = this.getRevenue;
        if (aFg1cSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1gSDK.v$default(aFLogger, AFh1zSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1cSDK);
            this.getRevenue = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getMediationNetwork() {
        AFg1eSDK aFg1eSDK = this.getMediationNetwork;
        if (aFg1eSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1gSDK.v$default(aFLogger, AFh1zSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1eSDK);
            this.getMediationNetwork = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void component1() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1gSDK[] aFg1gSDKArr = new AFg1gSDK[1];
        if (this.getMediationNetwork == null) {
            this.getMediationNetwork = new AFg1eSDK();
        }
        AFg1eSDK aFg1eSDK = this.getMediationNetwork;
        Intrinsics.checkNotNull(aFg1eSDK);
        aFg1gSDKArr[0] = aFg1eSDK;
        aFLogger.registerClient(aFg1gSDKArr);
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getRevenue() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1gSDK[] aFg1gSDKArr = new AFg1gSDK[1];
        if (this.getRevenue == null) {
            this.getRevenue = new AFg1cSDK(this.AFAdRevenueData);
        }
        AFg1cSDK aFg1cSDK = this.getRevenue;
        Intrinsics.checkNotNull(aFg1cSDK);
        aFg1gSDKArr[0] = aFg1cSDK;
        aFLogger.registerClient(aFg1gSDKArr);
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getMonetizationNetwork() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1gSDK[] aFg1gSDKArr = new AFg1gSDK[1];
        if (this.getMonetizationNetwork == null) {
            this.getMonetizationNetwork = new AFg1fSDK(this.AFAdRevenueData);
        }
        AFg1fSDK aFg1fSDK = this.getMonetizationNetwork;
        Intrinsics.checkNotNull(aFg1fSDK);
        aFg1gSDKArr[0] = aFg1fSDK;
        aFLogger.registerClient(aFg1gSDKArr);
    }
}
