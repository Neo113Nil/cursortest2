package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.u0;
import com.fyber.inneractive.sdk.renderers.x;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class InneractiveAdViewVideoContentController extends u0 {
    @Override // com.fyber.inneractive.sdk.flow.j0
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() instanceof t0;
    }

    public void setControlledRenderer(x xVar) {
        new WeakReference(xVar);
    }

    public void pauseVideo() {
    }

    public void playVideo() {
    }
}
