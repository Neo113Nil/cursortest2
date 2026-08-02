package com.vk.superapp.ads.js.bridge.api.events;

import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShowBannerAd.kt */
/* loaded from: classes6.dex */
public final class ShowBannerAd$Parameters implements ad6 {

    @pmi0("banner_align")
    private final String bannerAlign;

    @pmi0("banner_location")
    private final String bannerLocation;

    @pmi0("height_type")
    private final String heightType;

    @pmi0(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)
    private final String layoutType;

    @pmi0(X3.i.n)
    private final String orientation;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public ShowBannerAd$Parameters(String str, String str2, String str3, String str4, String str5, String str6) {
        this.requestId = str;
        this.bannerLocation = str2;
        this.bannerAlign = str3;
        this.layoutType = str4;
        this.heightType = str5;
        this.orientation = str6;
    }

    public static final ShowBannerAd$Parameters a(ShowBannerAd$Parameters showBannerAd$Parameters) {
        return showBannerAd$Parameters.requestId == null ? new ShowBannerAd$Parameters("default_request_id", showBannerAd$Parameters.bannerLocation, showBannerAd$Parameters.bannerAlign, showBannerAd$Parameters.layoutType, showBannerAd$Parameters.heightType, showBannerAd$Parameters.orientation) : showBannerAd$Parameters;
    }

    public static final void b(ShowBannerAd$Parameters showBannerAd$Parameters) {
        if (showBannerAd$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.bannerAlign;
    }

    public final String d() {
        return this.bannerLocation;
    }

    public final String e() {
        return this.heightType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowBannerAd$Parameters)) {
            return false;
        }
        ShowBannerAd$Parameters showBannerAd$Parameters = (ShowBannerAd$Parameters) obj;
        return epx.f(this.requestId, showBannerAd$Parameters.requestId) && epx.f(this.bannerLocation, showBannerAd$Parameters.bannerLocation) && epx.f(this.bannerAlign, showBannerAd$Parameters.bannerAlign) && epx.f(this.layoutType, showBannerAd$Parameters.layoutType) && epx.f(this.heightType, showBannerAd$Parameters.heightType) && epx.f(this.orientation, showBannerAd$Parameters.orientation);
    }

    public final String f() {
        return this.layoutType;
    }

    public final String g() {
        return this.orientation;
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        String str = this.bannerLocation;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bannerAlign;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.layoutType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.heightType;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.orientation;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", bannerLocation=");
        sb.append(this.bannerLocation);
        sb.append(", bannerAlign=");
        sb.append(this.bannerAlign);
        sb.append(", layoutType=");
        sb.append(this.layoutType);
        sb.append(", heightType=");
        sb.append(this.heightType);
        sb.append(", orientation=");
        return ho8.a(sb, this.orientation, ')');
    }

    public /* synthetic */ ShowBannerAd$Parameters(String str, String str2, String str3, String str4, String str5, String str6, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
