package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.u0;
import com.fyber.inneractive.sdk.util.v;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class InneractiveNativeVideoContentController extends u0 {
    public WeakReference a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface Renderer {
        void pauseVideo();

        void playVideo();
    }

    @Override // com.fyber.inneractive.sdk.flow.j0
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent().isVideoAd();
    }

    public void pauseVideo() {
        if (((Renderer) v.a(this.a)) != null) {
            ((Renderer) this.a.get()).pauseVideo();
        }
    }

    public void playVideo() {
        Renderer renderer = (Renderer) v.a(this.a);
        if (renderer != null) {
            renderer.playVideo();
        }
    }

    public void setControlledRenderer(Renderer renderer) {
        this.a = new WeakReference(renderer);
    }
}
