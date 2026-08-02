package defpackage;

import android.media.MediaRouter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ubc extends MediaRouter.VolumeCallback {
    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        yie p = vie.p(routeInfo);
        if (p != null) {
            p.a.j(i);
        }
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        yie p = vie.p(routeInfo);
        if (p != null) {
            p.a.k(i);
        }
    }
}
