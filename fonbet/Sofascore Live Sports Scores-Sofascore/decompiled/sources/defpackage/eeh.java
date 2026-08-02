package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eeh extends ConnectivityManager.NetworkCallback {
    public static final eeh a = new eeh();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;
    public static Boolean f;

    public static boolean a(NetworkRequest networkRequest, NetworkCapabilities networkCapabilities) {
        Boolean bool = f;
        bool.getClass();
        return !bool.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities);
    }

    public static void b() {
        ArrayList arrayList = new ArrayList();
        synchronized (b) {
            try {
                if (e && f != null) {
                    for (Map.Entry entry : c.entrySet()) {
                        Function1 function1 = (Function1) entry.getKey();
                        NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                        eeh eehVar = a;
                        NetworkCapabilities networkCapabilities = d;
                        eehVar.getClass();
                        arrayList.add(new Pair(function1, a(networkRequest, networkCapabilities) ? hn3.a : new in3(7)));
                    }
                    Unit unit = Unit.a;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ((Function1) pair.a).invoke((jn3) pair.b);
                    }
                    return;
                }
                rik o = rik.o();
                int i = kbl.a;
                o.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        rik o = rik.o();
        int i = kbl.a;
        o.getClass();
        synchronized (b) {
            if (Intrinsics.c(f, Boolean.valueOf(z))) {
                return;
            }
            f = Boolean.valueOf(z);
            Unit unit = Unit.a;
            b();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        rik o = rik.o();
        int i = kbl.a;
        o.getClass();
        synchronized (b) {
            d = networkCapabilities;
            e = true;
            Unit unit = Unit.a;
        }
        b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        rik o = rik.o();
        int i = kbl.a;
        o.getClass();
        synchronized (b) {
            try {
                d = null;
                Iterator it = c.keySet().iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(new in3(7));
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
