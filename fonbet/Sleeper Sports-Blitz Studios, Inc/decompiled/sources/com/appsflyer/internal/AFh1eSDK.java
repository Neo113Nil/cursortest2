package com.appsflyer.internal;

/* loaded from: classes6.dex */
public final class AFh1eSDK extends AFa1mSDK {
    public final AFf1wSDK copydefault;

    @Deprecated
    public AFh1eSDK() {
        this.copydefault = null;
    }

    public AFh1eSDK(String str, byte[] bArr, String str2, AFf1wSDK aFf1wSDK) {
        super(null, str, Boolean.FALSE);
        this.getRevenue = str2;
        getMediationNetwork(bArr);
        this.copydefault = aFf1wSDK;
    }

    @Override // com.appsflyer.internal.AFa1mSDK
    public final AFf1wSDK AFAdRevenueData() {
        AFf1wSDK aFf1wSDK = this.copydefault;
        return aFf1wSDK != null ? aFf1wSDK : AFf1wSDK.CACHED_EVENT;
    }
}
