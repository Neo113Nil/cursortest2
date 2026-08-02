package defpackage;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x9c extends MediaRouter2$RouteCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ z9c b;

    public /* synthetic */ x9c(z9c z9cVar, int i) {
        this.a = i;
        this.b = z9cVar;
    }

    public void onRoutesAdded(List list) {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            default:
                super.onRoutesAdded(list);
                break;
        }
    }

    public void onRoutesChanged(List list) {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            default:
                super.onRoutesChanged(list);
                break;
        }
    }

    public void onRoutesRemoved(List list) {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            default:
                super.onRoutesRemoved(list);
                break;
        }
    }

    public void onRoutesUpdated(List list) {
        switch (this.a) {
            case 1:
                this.b.n();
                break;
            default:
                super.onRoutesUpdated(list);
                break;
        }
    }
}
