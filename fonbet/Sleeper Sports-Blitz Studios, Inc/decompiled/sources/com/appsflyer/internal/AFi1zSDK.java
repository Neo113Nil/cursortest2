package com.appsflyer.internal;

import com.appsflyer.AFInAppEventType;

/* loaded from: classes6.dex */
public final class AFi1zSDK extends AFh1hSDK {
    public AFi1zSDK() {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE);
    }

    @Override // com.appsflyer.internal.AFa1mSDK
    public final AFa1mSDK getMonetizationNetwork(String str) {
        return super.getMonetizationNetwork(getRevenue(str));
    }

    @Override // com.appsflyer.internal.AFa1mSDK
    public final AFf1wSDK AFAdRevenueData() {
        return AFf1wSDK.PURCHASE_VALIDATE;
    }
}
