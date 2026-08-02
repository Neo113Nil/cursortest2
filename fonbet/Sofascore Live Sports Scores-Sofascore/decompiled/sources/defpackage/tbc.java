package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tbc extends MediaRouter.Callback {
    public final vie a;

    public tbc(vie vieVar) {
        this.a = vieVar;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        vie vieVar = this.a;
        if (vieVar.k(routeInfo)) {
            vieVar.t();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        vie vieVar;
        int l;
        if (vie.p(routeInfo) != null || (l = (vieVar = this.a).l(routeInfo)) < 0) {
            return;
        }
        vieVar.u((xie) vieVar.q.get(l));
        vieVar.t();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        vie vieVar = this.a;
        int l = vieVar.l(routeInfo);
        if (l >= 0) {
            xie xieVar = (xie) vieVar.q.get(l);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != xieVar.c.a.getInt("presentationDisplayId", -1)) {
                mac macVar = xieVar.c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (macVar == null) {
                    a70.p("descriptor must not be null");
                    return;
                }
                Bundle bundle = new Bundle(macVar.a);
                ArrayList c = macVar.c();
                ArrayList b = macVar.b();
                HashSet a = macVar.a();
                bundle.putInt("presentationDisplayId", displayId);
                bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
                bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
                bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
                xieVar.c = new mac(bundle);
                vieVar.t();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        vie vieVar;
        int l;
        if (vie.p(routeInfo) != null || (l = (vieVar = this.a).l(routeInfo)) < 0) {
            return;
        }
        vieVar.q.remove(l);
        vieVar.t();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        obc obcVar;
        vie vieVar = this.a;
        if (routeInfo != vieVar.j.getSelectedRoute(8388611)) {
            return;
        }
        yie p = vie.p(routeInfo);
        if (p != null) {
            p.a.l(false);
            return;
        }
        int l = vieVar.l(routeInfo);
        if (l >= 0) {
            xie xieVar = (xie) vieVar.q.get(l);
            yz8 yz8Var = vieVar.i;
            String str = xieVar.b;
            yz8Var.a.removeMessages(262);
            nbc d = yz8Var.d(yz8Var.s);
            if (d != null) {
                Iterator it = d.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obcVar = null;
                        break;
                    } else {
                        obcVar = (obc) it.next();
                        if (obcVar.b.equals(str)) {
                            break;
                        }
                    }
                }
                if (obcVar != null) {
                    obcVar.l(false);
                }
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        vie vieVar;
        int l;
        if (vie.p(routeInfo) != null || (l = (vieVar = this.a).l(routeInfo)) < 0) {
            return;
        }
        xie xieVar = (xie) vieVar.q.get(l);
        int volume = routeInfo.getVolume();
        if (volume != xieVar.c.a.getInt("volume")) {
            mac macVar = xieVar.c;
            new ArrayList();
            new ArrayList();
            new HashSet();
            if (macVar == null) {
                a70.p("descriptor must not be null");
                return;
            }
            Bundle bundle = new Bundle(macVar.a);
            ArrayList c = macVar.c();
            ArrayList b = macVar.b();
            HashSet a = macVar.a();
            bundle.putInt("volume", volume);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
            xieVar.c = new mac(bundle);
            vieVar.t();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
    }
}
