package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;

@AdNetworkIdentifier(packageName = h.D)
/* loaded from: classes2.dex */
public class MolocoCreativeInfo extends CreativeInfo {
    private static final long serialVersionUID = 0;

    public MolocoCreativeInfo() {
    }

    public MolocoCreativeInfo(BrandSafetyUtils.AdType adType, String sdk, String id, String creativeId, String downstreamStruct, String sdkVersion, String placementId, String packageName, String adDomain, String eventId) {
        super(adType, sdk, id, creativeId, null, null, downstreamStruct, sdkVersion);
        this.K = placementId;
        this.aX = adDomain;
        this.M = packageName;
        h(eventId);
    }
}
