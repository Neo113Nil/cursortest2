package io.appmetrica.analytics.location.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final p f15046a;

    public n(p pVar) {
        this.f15046a = pVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            p pVar = this.f15046a;
            pVar.getClass();
            String provider = location.getProvider();
            t tVar = (t) pVar.f15052e.get(provider);
            if (tVar == null) {
                t tVar2 = new t(pVar.f15048a.f15026a);
                tVar2.f15059c.add(pVar.f15050c);
                Iterator it = pVar.f15051d.iterator();
                while (it.hasNext()) {
                    tVar2.f15059c.add((Consumer) it.next());
                }
                pVar.f15052e.put(provider, tVar2);
                tVar = tVar2;
            } else {
                tVar.f15057a = pVar.f15048a.f15026a;
            }
            if (tVar.f15060d != null) {
                boolean didTimePassMillis = tVar.f15058b.didTimePassMillis(tVar.f15061e, tVar.f15057a.getUpdateTimeInterval(), "isSavedLocationOutdated");
                boolean z5 = location.distanceTo(tVar.f15060d) > tVar.f15057a.getUpdateDistanceInterval();
                boolean z7 = tVar.f15060d == null || location.getTime() - tVar.f15060d.getTime() >= 0;
                if ((!didTimePassMillis && !z5) || !z7) {
                    return;
                }
            }
            tVar.f15060d = location;
            tVar.f15061e = System.currentTimeMillis();
            Iterator it2 = tVar.f15059c.iterator();
            while (it2.hasNext()) {
                ((Consumer) it2.next()).consume(location);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i5, Bundle bundle) {
    }
}
