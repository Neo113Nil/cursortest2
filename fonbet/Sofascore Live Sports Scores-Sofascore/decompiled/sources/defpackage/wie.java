package defpackage;

import android.media.MediaRouter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wie extends ebc {
    public final MediaRouter.RouteInfo a;

    public wie(MediaRouter.RouteInfo routeInfo) {
        this.a = routeInfo;
    }

    @Override // defpackage.ebc
    public final void f(int i) {
        this.a.requestSetVolume(i);
    }

    @Override // defpackage.ebc
    public final void i(int i) {
        this.a.requestUpdateVolume(i);
    }
}
