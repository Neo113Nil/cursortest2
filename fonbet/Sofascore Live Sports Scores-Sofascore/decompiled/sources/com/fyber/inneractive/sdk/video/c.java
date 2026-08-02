package com.fyber.inneractive.sdk.video;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.g;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.interfaces.f;
import com.fyber.inneractive.sdk.renderers.s;
import com.fyber.inneractive.sdk.renderers.x;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c implements g {
    @Override // com.fyber.inneractive.sdk.factories.g
    public final boolean a(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof t0);
    }

    @Override // com.fyber.inneractive.sdk.factories.g
    public final f b(InneractiveAdSpot inneractiveAdSpot) {
        InneractiveAdRequest inneractiveAdRequest = inneractiveAdSpot.getAdContent().a;
        return (inneractiveAdSpot.getAdContent().b() && (inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen())) ? new x() : new s();
    }
}
