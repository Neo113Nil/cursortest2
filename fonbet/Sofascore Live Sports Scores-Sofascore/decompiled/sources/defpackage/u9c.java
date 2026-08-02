package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u9c extends MediaRouter2$ControllerCallback {
    public final /* synthetic */ z9c a;

    public u9c(z9c z9cVar) {
        this.a = z9cVar;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.o(routingController);
    }
}
