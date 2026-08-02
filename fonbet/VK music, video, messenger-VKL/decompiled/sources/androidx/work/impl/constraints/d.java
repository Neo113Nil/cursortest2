package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.work.impl.constraints.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.izs;
import xsna.j5g;
import xsna.m100;
import xsna.wux0;

/* compiled from: WorkConstraintsTracker.kt */
/* loaded from: classes12.dex */
public final class d extends ConnectivityManager.NetworkCallback {
    public static final d a = new d();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        List<Map.Entry> O0;
        boolean canBeSatisfiedBy;
        m100 c2 = m100.c();
        int i = wux0.a;
        c2.getClass();
        synchronized (b) {
            O0 = j5g.O0(c.entrySet());
        }
        for (Map.Entry entry : O0) {
            izs izsVar = (izs) entry.getKey();
            canBeSatisfiedBy = ((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities);
            izsVar.invoke(canBeSatisfiedBy ? a.C0094a.a : new a.b(7));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        List O0;
        m100 c2 = m100.c();
        int i = wux0.a;
        c2.getClass();
        synchronized (b) {
            O0 = j5g.O0(c.keySet());
        }
        Iterator it = O0.iterator();
        while (it.hasNext()) {
            ((izs) it.next()).invoke(new a.b(7));
        }
    }
}
