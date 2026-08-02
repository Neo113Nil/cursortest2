package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.u0;
import com.fyber.inneractive.sdk.flow.x;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class NativeAdVideoContentController extends u0 {
    @Override // com.fyber.inneractive.sdk.flow.j0
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        x adContent = inneractiveAdSpot.getAdContent();
        return (adContent instanceof NativeAdContent) && adContent.isVideoAd();
    }
}
