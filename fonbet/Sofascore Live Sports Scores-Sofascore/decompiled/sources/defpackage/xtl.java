package defpackage;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.blaze.blazesdk.features.videos.players.ui.a;
import com.inmobi.media.AbstractC3765so;
import com.inmobi.media.GestureDetectorOnGestureListenerC3889xi;
import com.ironsource.C3990ag;
import com.ironsource.C4022cc;
import com.ironsource.C4289rb;
import com.ironsource.C4436ze;
import com.ironsource.sdk.controller.v;
import com.mbridge.msdk.config.component.info.provider.subprovider.b;
import com.vungle.ads.internal.load.g;
import com.vungle.ads.internal.omsdk.c;
import com.vungle.ads.internal.ui.z;
import com.vungle.ads.internal.w2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class xtl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xtl(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                C3990ag.b.a((C3990ag.b) obj);
                break;
            case 1:
                ((b) obj).f();
                break;
            case 2:
                ((com.mbridge.msdk.config.component.status.b) obj).c();
                break;
            case 3:
                com.vungle.ads.internal.session.b.b((com.vungle.ads.internal.session.b) obj);
                break;
            case 4:
                c.a((c) obj);
                break;
            case 5:
                ((com.mbridge.msdk.config.component.common.network.connect.socket.c) obj).c();
                break;
            case 6:
                C4022cc.a((C4022cc) obj);
                break;
            case 7:
                ((RecyclerView) obj).requestLayout();
                break;
            case 8:
                g5m g5mVar = (g5m) obj;
                g5mVar.c = false;
                RecyclerView recyclerView = g5mVar.d;
                if (recyclerView != null) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
            case 9:
                g.h((g) obj);
                break;
            case 10:
                com.vungle.ads.internal.ui.view.g.a((com.vungle.ads.internal.ui.view.g) obj);
                break;
            case 11:
                C4289rb.b((Class) obj);
                break;
            case 12:
                AbstractC3765so.c((AbstractC3765so) obj);
                break;
            case 13:
                ((v) obj).C();
                break;
            case 14:
                w2.a((w2) obj);
                break;
            case 15:
                a aVar = (a) obj;
                if (aVar.t) {
                    ((w3m) aVar.getViewModel()).B(true);
                    break;
                }
                break;
            case 16:
                boolean z = e0n.n;
                evl.q((TextView) obj);
                break;
            case 17:
                GestureDetectorOnGestureListenerC3889xi.a((GestureDetectorOnGestureListenerC3889xi) obj);
                break;
            case 18:
                z.a(true, (z) obj);
                break;
            default:
                C4436ze.b((C4436ze) obj);
                break;
        }
    }
}
