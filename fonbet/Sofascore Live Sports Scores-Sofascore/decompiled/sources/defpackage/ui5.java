package defpackage;

import com.inmobi.media.Ei;
import com.inmobi.media.Fi;
import com.inmobi.media.GestureDetectorOnGestureListenerC3889xi;
import com.inmobi.media.Jo;
import com.inmobi.media.Yi;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class ui5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Jo b;
    public final /* synthetic */ Yi c;
    public final /* synthetic */ Fi d;
    public final /* synthetic */ GestureDetectorOnGestureListenerC3889xi e;

    public /* synthetic */ ui5(Jo jo, Yi yi, Fi fi, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, int i) {
        this.a = i;
        this.b = jo;
        this.c = yi;
        this.d = fi;
        this.e = gestureDetectorOnGestureListenerC3889xi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Ei.b(this.b, this.c, this.d, this.e);
                break;
            default:
                Ei.a(this.b, this.c, this.d, this.e);
                break;
        }
    }
}
