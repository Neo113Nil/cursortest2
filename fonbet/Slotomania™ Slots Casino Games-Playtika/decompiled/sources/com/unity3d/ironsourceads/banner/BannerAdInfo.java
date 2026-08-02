package com.unity3d.ironsourceads.banner;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BannerAdInfo {
    private final String a;
    private final String b;

    public BannerAdInfo(String instanceId, String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.a = instanceId;
        this.b = adId;
    }

    public static /* synthetic */ BannerAdInfo copy$default(BannerAdInfo bannerAdInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerAdInfo.a;
        }
        if ((i & 2) != 0) {
            str2 = bannerAdInfo.b;
        }
        return bannerAdInfo.copy(str, str2);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final BannerAdInfo copy(String instanceId, String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        return new BannerAdInfo(instanceId, adId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdInfo)) {
            return false;
        }
        BannerAdInfo bannerAdInfo = (BannerAdInfo) obj;
        return Intrinsics.areEqual(this.a, bannerAdInfo.a) && Intrinsics.areEqual(this.b, bannerAdInfo.b);
    }

    public final String getAdId() {
        return this.b;
    }

    public final String getInstanceId() {
        return this.a;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "[instanceId: '" + this.a + "', adId: '" + this.b + "']";
    }
}
