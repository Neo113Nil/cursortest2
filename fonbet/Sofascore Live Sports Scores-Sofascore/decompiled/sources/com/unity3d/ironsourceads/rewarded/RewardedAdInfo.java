package com.unity3d.ironsourceads.rewarded;

import defpackage.bf3;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class RewardedAdInfo {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    public RewardedAdInfo(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @NotNull
    public final String getAdId() {
        return this.b;
    }

    @NotNull
    public final String getInstanceId() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return bf3.k("[instanceId: '", this.a, "', adId: '", this.b, "']");
    }
}
