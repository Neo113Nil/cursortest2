package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFf1zSDK.AnonymousClass3;

/* loaded from: classes6.dex */
public final class AFg1xSDK implements AFe1fSDK {
    private final Object AFAdRevenueData = new Object();
    private final AFf1zSDK areAllFieldsValid;
    private final AFg1wSDK component1;
    private AFf1aSDK component2;
    private AFi1xSDK component3;
    private final AFe1qSDK component4;
    private final AFg1zSDK getCurrencyIso4217Code;
    public final AFg1vSDK getMediationNetwork;
    private final AFg1uSDK getMonetizationNetwork;
    private final AFd1rSDK getRevenue;

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void AFAdRevenueData(AFe1bSDK<?> aFe1bSDK) {
    }

    public AFg1xSDK(AFg1zSDK aFg1zSDK, AFd1rSDK aFd1rSDK, AFg1uSDK aFg1uSDK, AFg1vSDK aFg1vSDK, AFe1qSDK aFe1qSDK, AFg1wSDK aFg1wSDK, AFf1zSDK aFf1zSDK) {
        this.getCurrencyIso4217Code = aFg1zSDK;
        this.getRevenue = aFd1rSDK;
        this.getMonetizationNetwork = aFg1uSDK;
        this.getMediationNetwork = aFg1vSDK;
        this.component4 = aFe1qSDK;
        this.component1 = aFg1wSDK;
        this.areAllFieldsValid = aFf1zSDK;
        aFf1zSDK.getMediationNetwork.add(this);
    }

    public final void AFAdRevenueData(AFf1bSDK aFf1bSDK) {
        AFg1ySDK aFg1ySDK = new AFg1ySDK(this.getCurrencyIso4217Code, this.getRevenue, this.getMonetizationNetwork, this.getMediationNetwork, this.component4, this.component1, "v1", aFf1bSDK);
        AFf1zSDK aFf1zSDK = this.areAllFieldsValid;
        aFf1zSDK.getRevenue.execute(aFf1zSDK.new AnonymousClass3(aFg1ySDK));
    }

    public final AFi1xSDK AFAdRevenueData() {
        AFi1xSDK aFi1xSDK;
        synchronized (this.AFAdRevenueData) {
            aFi1xSDK = this.component3;
            this.component3 = null;
        }
        return aFi1xSDK;
    }

    private void getRevenue(AFf1aSDK aFf1aSDK, AFf1bSDK aFf1bSDK) {
        synchronized (this.AFAdRevenueData) {
            this.component2 = aFf1aSDK;
        }
        if (aFf1bSDK != null) {
            aFf1bSDK.onRemoteConfigUpdateFinished(aFf1aSDK);
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void getRevenue(AFe1bSDK<?> aFe1bSDK, AFe1dSDK aFe1dSDK) {
        if (aFe1bSDK instanceof AFg1ySDK) {
            AFg1ySDK aFg1ySDK = (AFg1ySDK) aFe1bSDK;
            AFf1aSDK aFf1aSDK = aFg1ySDK.component3;
            if (aFf1aSDK == null) {
                AFLogger.INSTANCE.w(AFh1xSDK.REMOTE_CONTROL, "update RC returned null result, something went wrong!");
                aFf1aSDK = AFf1aSDK.FAILURE;
            }
            if (aFf1aSDK != AFf1aSDK.USE_CACHED) {
                AFi1xSDK aFi1xSDK = aFg1ySDK.component4;
                synchronized (this.AFAdRevenueData) {
                    this.component3 = aFi1xSDK;
                }
            }
            getRevenue(aFf1aSDK, aFg1ySDK.areAllFieldsValid);
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void getMediationNetwork(AFe1bSDK<?> aFe1bSDK) {
        if (aFe1bSDK instanceof AFg1ySDK) {
            AFg1ySDK aFg1ySDK = (AFg1ySDK) aFe1bSDK;
            synchronized (this.AFAdRevenueData) {
                this.component3 = null;
            }
            getRevenue(AFf1aSDK.FAILURE, aFg1ySDK.areAllFieldsValid);
        }
    }
}
