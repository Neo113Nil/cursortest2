package com.unity3d.ironsourceads.interstitial;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InterstitialAdInfo {
    private final String a;
    private final String b;

    public InterstitialAdInfo(String instanceId, String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.a = instanceId;
        this.b = adId;
    }

    public final String getAdId() {
        return this.b;
    }

    public final String getInstanceId() {
        return this.a;
    }

    public String toString() {
        return "[instanceId: '" + this.a + "', adId: '" + this.b + "']";
    }
}
