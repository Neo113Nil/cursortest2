package com.appsflyer;

import com.appsflyer.internal.AFb1kSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* loaded from: classes4.dex */
public final class PurchaseHandler {
    public final AFf1zSDK AFAdRevenueData;
    public final AFd1kSDK getMediationNetwork;
    private final AFd1rSDK getMonetizationNetwork;

    public interface PurchaseValidationCallback {
        void onFailure(Throwable th);

        void onResponse(ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(AFd1kSDK aFd1kSDK) {
        this.getMediationNetwork = aFd1kSDK;
        this.getMonetizationNetwork = aFd1kSDK.getCurrencyIso4217Code();
        this.AFAdRevenueData = aFd1kSDK.copydefault();
    }

    public final boolean getMediationNetwork(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean mediationNetwork = AFb1kSDK.getMediationNetwork(map, strArr, this.getMonetizationNetwork);
        if (!mediationNetwork && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return mediationNetwork;
    }
}
