package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.a8g;
import defpackage.f79;
import defpackage.hbc;
import defpackage.jbc;
import defpackage.obc;
import defpackage.pbc;
import defpackage.z7g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbl extends jbc {
    public static final Logger d = new Logger("MediaRouterCallback", null);
    public final zzbg a;
    public final zzbx b;
    public final zzce c;

    public zzbl(zzbg zzbgVar, zzbx zzbxVar, zzce zzceVar) {
        Preconditions.i(zzbgVar);
        this.a = zzbgVar;
        this.b = zzbxVar;
        this.c = zzceVar;
    }

    @Override // defpackage.jbc
    public final void d(pbc pbcVar, obc obcVar) {
        try {
            this.a.r3(obcVar.s, obcVar.c);
        } catch (RemoteException unused) {
            d.b("Unable to call %s on %s.", "onRouteAdded", "zzbg");
        }
        o(pbcVar);
    }

    @Override // defpackage.jbc
    public final void e(pbc pbcVar, obc obcVar) {
        if (obcVar.g()) {
            try {
                this.a.G3(obcVar.s, obcVar.c);
            } catch (RemoteException unused) {
                d.b("Unable to call %s on %s.", "onRouteChanged", "zzbg");
            }
            o(pbcVar);
        }
    }

    @Override // defpackage.jbc
    public final void f(obc obcVar, obc obcVar2) {
        int i = obcVar.l;
        String str = obcVar.c;
        Logger logger = d;
        if (i != 1) {
            logger.c("ignore onRouteConnected for non-remote connected routeId: %s", str);
            return;
        }
        logger.c("onRouteConnected with connectedRouteId = %s", str);
        this.b.g = true;
        try {
            zzbg zzbgVar = this.a;
            int zze = zzbgVar.zze();
            String str2 = obcVar2.c;
            if (zze >= 251600000) {
                zzbgVar.s4(str2, obcVar.s, str);
            } else {
                zzbgVar.Z3(str2, obcVar.s, str);
            }
        } catch (RemoteException unused) {
            logger.b("Unable to call %s on %s.", "onRouteConnected", "zzbg");
        }
    }

    @Override // defpackage.jbc
    public final void g(obc obcVar, obc obcVar2, int i) {
        String str = obcVar2.c;
        Logger logger = d;
        if (obcVar != null) {
            String str2 = obcVar.c;
            if (obcVar.l == 1) {
                logger.c("onRouteDisconnected with disconnectedRouteId = %s, requestedRouteId = %s, reason = %d", str2, str, Integer.valueOf(i));
                this.b.g = false;
                try {
                    zzbg zzbgVar = this.a;
                    if (zzbgVar.zze() >= 251600000) {
                        zzbgVar.V2(i, obcVar.s, str, str2);
                        return;
                    } else {
                        zzbgVar.y1(str2, i, obcVar.s);
                        return;
                    }
                } catch (RemoteException unused) {
                    logger.b("Unable to call %s on %s.", "onRouteDisconnected", "zzbg");
                    return;
                }
            }
        }
        logger.c("ignore onRouteDisconnected for invalid or non-remote disconnected route", new Object[0]);
    }

    @Override // defpackage.jbc
    public final void h(pbc pbcVar, obc obcVar) {
        try {
            this.a.n4(obcVar.s, obcVar.c);
        } catch (RemoteException unused) {
            d.b("Unable to call %s on %s.", "onRouteRemoved", "zzbg");
        }
        o(pbcVar);
    }

    @Override // defpackage.jbc
    public final void j(pbc pbcVar, obc obcVar, int i, obc obcVar2) {
        int i2 = obcVar.l;
        String str = obcVar.c;
        Logger logger = d;
        if (i2 != 1) {
            logger.c("ignore onRouteSelected for non-remote selected routeId: %s", str);
            return;
        }
        logger.c("onRouteSelected with reason = %d, routeId = %s", Integer.valueOf(i), str);
        try {
            zzbg zzbgVar = this.a;
            if (zzbgVar.zze() >= 220400000) {
                zzbgVar.Z3(obcVar2.c, obcVar.s, str);
            } else {
                zzbgVar.C4(obcVar.s, obcVar2.c);
            }
        } catch (RemoteException unused) {
            logger.b("Unable to call %s on %s.", "onRouteSelected", "zzbg");
        }
        o(pbcVar);
    }

    @Override // defpackage.jbc
    public final void l(pbc pbcVar, obc obcVar, int i) {
        int i2 = obcVar.l;
        String str = obcVar.c;
        Logger logger = d;
        if (i2 != 1) {
            logger.c("ignore onRouteUnselected for non-remote routeId: %s", str);
            return;
        }
        logger.c("onRouteUnselected with reason = %d, routeId = %s", Integer.valueOf(i), str);
        try {
            this.a.y1(str, i, obcVar.s);
        } catch (RemoteException unused) {
            logger.b("Unable to call %s on %s.", "onRouteUnselected", "zzbg");
        }
        o(pbcVar);
    }

    public final void o(pbc pbcVar) {
        zzce zzceVar = this.c;
        if (zzceVar != null && zzceVar.f && zzceVar.a.q) {
            SessionManager sessionManager = zzceVar.g;
            if ((sessionManager != null ? sessionManager.c() : null) == null) {
                pbc.i(null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            pbc.b();
            Iterator it = pbc.c().i.iterator();
            while (it.hasNext()) {
                obc obcVar = (obc) it.next();
                if (CastDevice.Y0(obcVar.s) != null) {
                    arrayList.add(new z7g(new f79(obcVar.c, 6)));
                }
            }
            zzce.i.a("updateRouteListingPreference with %d available routes", Integer.valueOf(arrayList.size()));
            hbc hbcVar = new hbc();
            hbcVar.b = Collections.EMPTY_LIST;
            hbcVar.c = true;
            hbcVar.b = Collections.unmodifiableList(new ArrayList(arrayList));
            pbc.i(new a8g(hbcVar));
        }
    }
}
