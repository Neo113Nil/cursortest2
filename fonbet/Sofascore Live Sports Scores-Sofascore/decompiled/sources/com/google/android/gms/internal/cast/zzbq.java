package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.cast.CastMediaControlIntent;
import com.google.android.gms.cast.internal.Logger;
import defpackage.con;
import defpackage.fn0;
import defpackage.ibc;
import defpackage.jbc;
import defpackage.obc;
import defpackage.pbc;
import defpackage.unn;
import defpackage.xnn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbq extends jbc {
    public static final Logger f = new Logger("MRDiscoveryCallback", null);
    public final zzby e;
    public final Map c = Collections.synchronizedMap(new HashMap());
    public final LinkedHashSet d = new LinkedHashSet();
    public final Set b = Collections.synchronizedSet(new LinkedHashSet());
    public final xnn a = new xnn(this);

    public zzbq(Context context) {
        this.e = new zzby(context);
    }

    @Override // defpackage.jbc
    public final void d(pbc pbcVar, obc obcVar) {
        f.a("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        o(obcVar, true);
    }

    @Override // defpackage.jbc
    public final void e(pbc pbcVar, obc obcVar) {
        f.a("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        o(obcVar, true);
    }

    @Override // defpackage.jbc
    public final void h(pbc pbcVar, obc obcVar) {
        f.a("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        o(obcVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0192, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0199, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(obc obcVar, boolean z) {
        boolean z2;
        Set t;
        boolean remove;
        Logger logger = f;
        logger.a("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z), obcVar);
        Map map = this.c;
        synchronized (map) {
            try {
                String valueOf = String.valueOf(map.keySet());
                StringBuilder sb = new StringBuilder(valueOf.length() + 45);
                sb.append("appIdToRouteInfo has these appId route keys: ");
                sb.append(valueOf);
                logger.a(sb.toString(), new Object[0]);
                z2 = false;
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    unn unnVar = (unn) entry.getValue();
                    if (obcVar.h(unnVar.b)) {
                        if (z) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32);
                            sb2.append("Adding/updating route for appId ");
                            sb2.append(str);
                            logger.a(sb2.toString(), new Object[0]);
                            remove = unnVar.a.add(obcVar);
                            if (!remove) {
                                String valueOf2 = String.valueOf(obcVar);
                                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 32 + String.valueOf(str).length());
                                sb3.append("Route ");
                                sb3.append(valueOf2);
                                sb3.append(" already exists for appId ");
                                sb3.append(str);
                                logger.c(sb3.toString(), new Object[0]);
                            }
                        } else {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 25);
                            sb4.append("Removing route for appId ");
                            sb4.append(str);
                            logger.a(sb4.toString(), new Object[0]);
                            remove = unnVar.a.remove(obcVar);
                            if (!remove) {
                                String valueOf3 = String.valueOf(obcVar);
                                StringBuilder sb5 = new StringBuilder(valueOf3.length() + 34 + String.valueOf(str).length());
                                sb5.append("Route ");
                                sb5.append(valueOf3);
                                sb5.append(" already removed from appId ");
                                sb5.append(str);
                                logger.c(sb5.toString(), new Object[0]);
                            }
                        }
                        z2 = remove;
                    }
                }
            } finally {
            }
        }
        if (z2) {
            f.a("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.b) {
                try {
                    HashMap hashMap = new HashMap();
                    Map map2 = this.c;
                    synchronized (map2) {
                        for (String str2 : map2.keySet()) {
                            unn unnVar2 = (unn) map2.get(zzhb.a(str2));
                            if (unnVar2 == null) {
                                int i = zzhz.c;
                                t = b.j;
                            } else {
                                LinkedHashSet linkedHashSet = unnVar2.a;
                                int i2 = zzhz.c;
                                Object[] array = linkedHashSet.toArray();
                                t = zzhz.t(array.length, array);
                            }
                            if (!t.isEmpty()) {
                                hashMap.put(str2, t);
                            }
                        }
                    }
                    zzhy.a(hashMap.entrySet());
                    Iterator it = this.b.iterator();
                    while (it.hasNext()) {
                        ((com.google.android.gms.cast.framework.zzbe) it.next()).a();
                    }
                } finally {
                }
            }
        }
    }

    public final void p() {
        int size = this.d.size();
        Logger logger = f;
        logger.a(fn0.k(size, "Starting RouteDiscovery with ", " IDs", new StringBuilder(String.valueOf(size).length() + 33)), new Object[0]);
        logger.a("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            q();
        } else {
            new zzfk(Looper.getMainLooper()).post(new con(this, 0));
        }
    }

    public final void q() {
        zzby zzbyVar = this.e;
        pbc pbcVar = zzbyVar.b;
        if (pbcVar == null) {
            pbcVar = pbc.d(zzbyVar.a);
            zzbyVar.b = pbcVar;
        }
        pbcVar.h(this);
        LinkedHashSet linkedHashSet = this.d;
        synchronized (linkedHashSet) {
            try {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String a = CastMediaControlIntent.a(str);
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (!arrayList.contains(a)) {
                        arrayList.add(a);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("controlCategories", arrayList);
                    ibc ibcVar = new ibc(bundle, arrayList);
                    Map map = this.c;
                    if (((unn) map.get(str)) == null) {
                        map.put(str, new unn(ibcVar));
                    }
                    Logger logger = f;
                    String a2 = CastMediaControlIntent.a(str);
                    StringBuilder sb = new StringBuilder(a2.length() + 49);
                    sb.append("Adding mediaRouter callback for control category ");
                    sb.append(a2);
                    logger.a(sb.toString(), new Object[0]);
                    pbc pbcVar2 = zzbyVar.b;
                    if (pbcVar2 == null) {
                        pbcVar2 = pbc.d(zzbyVar.a);
                        zzbyVar.b = pbcVar2;
                    }
                    pbcVar2.a(ibcVar, this, 4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Map map2 = this.c;
        f.a("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map2.keySet())), new Object[0]);
    }
}
