package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFh1tSDK implements AFh1uSDK {
    private AFg1aSDK AFAdRevenueData;
    private AFh1vSDK getCurrencyIso4217Code;
    private AFh1oSDK getMediationNetwork;
    private final AFd1kSDK getMonetizationNetwork;

    public AFh1tSDK(AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.getMonetizationNetwork = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void getCurrencyIso4217Code() {
        AFh1vSDK aFh1vSDK = this.getCurrencyIso4217Code;
        if (aFh1vSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1wSDK.v$default(aFLogger, AFh1xSDK.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1vSDK);
            this.getCurrencyIso4217Code = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void AFAdRevenueData() {
        AFh1oSDK aFh1oSDK = this.getMediationNetwork;
        if (aFh1oSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1wSDK.v$default(aFLogger, AFh1xSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1oSDK);
            this.getMediationNetwork = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void getMonetizationNetwork() {
        AFg1aSDK aFg1aSDK = this.AFAdRevenueData;
        if (aFg1aSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1wSDK.v$default(aFLogger, AFh1xSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1aSDK);
            this.AFAdRevenueData = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void component2() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1wSDK[] aFh1wSDKArr = new AFh1wSDK[1];
        if (this.AFAdRevenueData == null) {
            this.AFAdRevenueData = new AFg1aSDK();
        }
        AFg1aSDK aFg1aSDK = this.AFAdRevenueData;
        Intrinsics.checkNotNull(aFg1aSDK);
        aFh1wSDKArr[0] = aFg1aSDK;
        aFLogger.registerClient(aFh1wSDKArr);
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void getMediationNetwork() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1wSDK[] aFh1wSDKArr = new AFh1wSDK[1];
        if (this.getMediationNetwork == null) {
            this.getMediationNetwork = new AFh1oSDK(this.getMonetizationNetwork);
        }
        AFh1oSDK aFh1oSDK = this.getMediationNetwork;
        Intrinsics.checkNotNull(aFh1oSDK);
        aFh1wSDKArr[0] = aFh1oSDK;
        aFLogger.registerClient(aFh1wSDKArr);
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void getRevenue() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1wSDK[] aFh1wSDKArr = new AFh1wSDK[1];
        if (this.getCurrencyIso4217Code == null) {
            this.getCurrencyIso4217Code = new AFh1vSDK(this.getMonetizationNetwork);
        }
        AFh1vSDK aFh1vSDK = this.getCurrencyIso4217Code;
        Intrinsics.checkNotNull(aFh1vSDK);
        aFh1wSDKArr[0] = aFh1vSDK;
        aFLogger.registerClient(aFh1wSDKArr);
    }
}
