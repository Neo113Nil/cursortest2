package com.vk.superapp.ads.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CheckNativeAds.kt */
/* loaded from: classes6.dex */
public final class CheckNativeAds$Parameters implements ad6 {

    @pmi0("ad_format")
    private final String adFormat;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("use_waterfall")
    private final Boolean useWaterfall;

    public CheckNativeAds$Parameters(String str, String str2, Boolean bool) {
        this.adFormat = str;
        this.requestId = str2;
        this.useWaterfall = bool;
    }

    public static final CheckNativeAds$Parameters a(CheckNativeAds$Parameters checkNativeAds$Parameters) {
        return checkNativeAds$Parameters.requestId == null ? new CheckNativeAds$Parameters(checkNativeAds$Parameters.adFormat, "default_request_id", checkNativeAds$Parameters.useWaterfall) : checkNativeAds$Parameters;
    }

    public static final void b(CheckNativeAds$Parameters checkNativeAds$Parameters) {
        if (checkNativeAds$Parameters.adFormat == null) {
            throw new IllegalArgumentException("Value of non-nullable member adFormat cannot be\n                        null");
        }
        if (checkNativeAds$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.adFormat;
    }

    public final Boolean d() {
        return this.useWaterfall;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckNativeAds$Parameters)) {
            return false;
        }
        CheckNativeAds$Parameters checkNativeAds$Parameters = (CheckNativeAds$Parameters) obj;
        return epx.f(this.adFormat, checkNativeAds$Parameters.adFormat) && epx.f(this.requestId, checkNativeAds$Parameters.requestId) && epx.f(this.useWaterfall, checkNativeAds$Parameters.useWaterfall);
    }

    public final int hashCode() {
        int a = urd0.a(this.adFormat.hashCode() * 31, 31, this.requestId);
        Boolean bool = this.useWaterfall;
        return a + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(adFormat=");
        sb.append(this.adFormat);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", useWaterfall=");
        return tn.a(sb, this.useWaterfall, ')');
    }

    public /* synthetic */ CheckNativeAds$Parameters(String str, String str2, Boolean bool, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : bool);
    }
}
