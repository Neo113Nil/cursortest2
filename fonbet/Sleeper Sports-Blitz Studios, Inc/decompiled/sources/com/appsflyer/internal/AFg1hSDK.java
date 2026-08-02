package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFg1hSDK implements AFg1fSDK {
    private final AFg1dSDK getMonetizationNetwork;

    public AFg1hSDK(AFg1dSDK aFg1dSDK) {
        Intrinsics.checkNotNullParameter(aFg1dSDK, "");
        this.getMonetizationNetwork = aFg1dSDK;
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final boolean getCurrencyIso4217Code(AFg1gSDK aFg1gSDK) {
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        if (aFg1gSDK.getGetMediationNetwork()) {
            this.getMonetizationNetwork.getCurrencyIso4217Code(aFg1gSDK);
        }
        return aFg1gSDK.getGetMonetizationNetwork();
    }
}
