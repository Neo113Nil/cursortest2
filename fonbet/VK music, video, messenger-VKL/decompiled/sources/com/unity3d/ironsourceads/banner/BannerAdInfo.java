package com.unity3d.ironsourceads.banner;

import xsna.epx;
import xsna.ss9;

/* loaded from: classes14.dex */
public final class BannerAdInfo {
    private final String a;
    private final String b;

    public BannerAdInfo(String str, String str2) {
        this.a = str;
        this.b = str2;
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

    public final BannerAdInfo copy(String str, String str2) {
        return new BannerAdInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdInfo)) {
            return false;
        }
        BannerAdInfo bannerAdInfo = (BannerAdInfo) obj;
        return epx.f(this.a, bannerAdInfo.a) && epx.f(this.b, bannerAdInfo.b);
    }

    public final String getAdId() {
        return this.b;
    }

    public final String getInstanceId() {
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        return ss9.a("[instanceId: '", this.a, "', adId: '", this.b, "']");
    }
}
