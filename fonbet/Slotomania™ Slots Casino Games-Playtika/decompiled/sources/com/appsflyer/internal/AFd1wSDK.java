package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AFd1wSDK implements AFd1vSDK {
    private final AFc1aSDK AFAdRevenueData;

    public AFd1wSDK(AFc1aSDK aFc1aSDK) {
        Intrinsics.checkNotNullParameter(aFc1aSDK, "");
        this.AFAdRevenueData = aFc1aSDK;
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void getMonetizationNetwork(byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFd1uSDK(bArr, map, 2000).getCurrencyIso4217Code()) {
            this.AFAdRevenueData.getMonetizationNetwork();
        }
    }
}
