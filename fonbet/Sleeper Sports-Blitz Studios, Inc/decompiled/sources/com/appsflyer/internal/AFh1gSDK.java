package com.appsflyer.internal;

/* loaded from: classes6.dex */
public final class AFh1gSDK extends AFa1mSDK {
    @Override // com.appsflyer.internal.AFa1mSDK
    public final boolean component4() {
        return true;
    }

    @Override // com.appsflyer.internal.AFa1mSDK
    public final AFf1wSDK AFAdRevenueData() {
        if (this.component4 == 1) {
            return AFf1wSDK.CONVERSION;
        }
        return AFf1wSDK.LAUNCH;
    }
}
