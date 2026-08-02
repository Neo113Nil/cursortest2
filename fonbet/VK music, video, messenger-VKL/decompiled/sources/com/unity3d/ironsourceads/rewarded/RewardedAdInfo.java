package com.unity3d.ironsourceads.rewarded;

import xsna.ss9;

/* loaded from: classes14.dex */
public final class RewardedAdInfo {
    private final String a;
    private final String b;

    public RewardedAdInfo(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String getAdId() {
        return this.b;
    }

    public final String getInstanceId() {
        return this.a;
    }

    public String toString() {
        return ss9.a("[instanceId: '", this.a, "', adId: '", this.b, "']");
    }
}
