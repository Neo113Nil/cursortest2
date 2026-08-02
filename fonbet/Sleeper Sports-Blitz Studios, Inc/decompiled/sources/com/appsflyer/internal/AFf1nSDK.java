package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* loaded from: classes6.dex */
public final class AFf1nSDK extends AFf1uSDK {
    public AFf1nSDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFd1kSDK aFd1kSDK) {
        super(AFf1wSDK.PURCHASE_VALIDATE, new AFf1wSDK[]{AFf1wSDK.RC_CDN, AFf1wSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, map, purchaseValidationCallback);
        this.AFAdRevenueData.add(AFf1wSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    public final AFe1rSDK<String> getCurrencyIso4217Code(Map<String, Object> map, String str, String str2) {
        return this.component2.getMediationNetwork(map, str, str2);
    }
}
