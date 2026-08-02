package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c implements com.fyber.inneractive.sdk.factories.g {
    public final /* synthetic */ IAMraidKit a;

    public c(IAMraidKit iAMraidKit) {
        this.a = iAMraidKit;
    }

    @Override // com.fyber.inneractive.sdk.factories.g
    public final boolean a(InneractiveAdSpot inneractiveAdSpot) {
        boolean isMRaidSpotContent;
        isMRaidSpotContent = this.a.isMRaidSpotContent(inneractiveAdSpot);
        return isMRaidSpotContent;
    }

    @Override // com.fyber.inneractive.sdk.factories.g
    public final com.fyber.inneractive.sdk.interfaces.f b(InneractiveAdSpot inneractiveAdSpot) {
        return new com.fyber.inneractive.sdk.renderers.v();
    }
}
