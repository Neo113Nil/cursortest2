package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y9c extends MediaRouter2$TransferCallback {
    public final /* synthetic */ z9c a;

    public y9c(z9c z9cVar) {
        this.a = z9cVar;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        obc c;
        z9c z9cVar = this.a;
        z9cVar.s = null;
        ebc ebcVar = (ebc) z9cVar.k.remove(routingController);
        if (ebcVar == null) {
            Objects.toString(routingController);
            return;
        }
        yz8 yz8Var = (yz8) z9cVar.j.b;
        if (ebcVar != yz8Var.e || yz8Var.h() == (c = yz8Var.c())) {
            return;
        }
        yz8Var.l(c, 2, true);
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        z9c z9cVar = this.a;
        obc obcVar = null;
        z9cVar.s = null;
        z9cVar.k.remove(routingController);
        if (routingController2 == z9cVar.i.getSystemController()) {
            yz8 yz8Var = (yz8) z9cVar.j.b;
            obc c = yz8Var.c();
            if (yz8Var.h() != c) {
                yz8Var.l(c, 3, true);
                return;
            }
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            return;
        }
        String id = i3c.d(selectedRoutes.get(0)).getId();
        z9cVar.k.put(routingController2, new v9c(z9cVar, routingController2, id));
        yz8 yz8Var2 = (yz8) z9cVar.j.b;
        Iterator it = yz8Var2.i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            obc obcVar2 = (obc) it.next();
            if (obcVar2.c() == yz8Var2.r && TextUtils.equals(id, obcVar2.b)) {
                obcVar = obcVar2;
                break;
            }
        }
        if (obcVar != null) {
            yz8Var2.l(obcVar, 3, true);
        }
        z9cVar.o(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        this.a.s = null;
        Objects.toString(mediaRoute2Info);
    }
}
