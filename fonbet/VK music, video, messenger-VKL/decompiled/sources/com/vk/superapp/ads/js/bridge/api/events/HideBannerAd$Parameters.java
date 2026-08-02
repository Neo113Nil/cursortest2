package com.vk.superapp.ads.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: HideBannerAd.kt */
/* loaded from: classes6.dex */
public final class HideBannerAd$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public HideBannerAd$Parameters(String str) {
        this.requestId = str;
    }

    public static final HideBannerAd$Parameters a(HideBannerAd$Parameters hideBannerAd$Parameters) {
        return hideBannerAd$Parameters.requestId == null ? new HideBannerAd$Parameters("default_request_id") : hideBannerAd$Parameters;
    }

    public static final void b(HideBannerAd$Parameters hideBannerAd$Parameters) {
        if (hideBannerAd$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HideBannerAd$Parameters) && epx.f(this.requestId, ((HideBannerAd$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
