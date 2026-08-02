package com.appsflyer.internal;

/* loaded from: classes8.dex */
public final class AFh1nSDK extends AFh1tSDK {
    @Override // com.appsflyer.internal.AFh1tSDK
    public final boolean component4() {
        return true;
    }

    @Override // com.appsflyer.internal.AFh1tSDK
    public final AFe1uSDK getMediationNetwork() {
        if (this.component1 == 1) {
            return AFe1uSDK.CONVERSION;
        }
        return AFe1uSDK.LAUNCH;
    }
}
