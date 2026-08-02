package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFd1eSDK implements AFd1aSDK {
    private final AFd1gSDK getMediationNetwork;

    public AFd1eSDK(AFd1gSDK aFd1gSDK) {
        Intrinsics.checkNotNullParameter(aFd1gSDK, "");
        this.getMediationNetwork = aFd1gSDK;
    }

    @Override // com.appsflyer.internal.AFd1aSDK
    public final void AFAdRevenueData(byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFd1dSDK(bArr, map, 2000).getMediationNetwork()) {
            this.getMediationNetwork.getMediationNetwork();
        }
    }
}
