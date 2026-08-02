package i3;

import a2.l;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import e3.x;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final h f10912a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f10913b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f10914c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static NetworkCapabilities f10915d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f10916e;

    public static l a(ConnectivityManager connManager, NetworkRequest networkRequest, fg.d onConstraintState) {
        NetworkCapabilities networkCapabilities;
        Intrinsics.checkNotNullParameter(connManager, "connManager");
        Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
        Intrinsics.checkNotNullParameter(onConstraintState, "onConstraintState");
        synchronized (f10913b) {
            try {
                LinkedHashMap linkedHashMap = f10914c;
                boolean isEmpty = linkedHashMap.isEmpty();
                linkedHashMap.put(onConstraintState, networkRequest);
                if (isEmpty) {
                    x.e().a(k.f10922a, "NetworkRequestConstraintController register shared callback");
                    connManager.registerDefaultNetworkCallback(f10912a);
                }
                x.e().a(k.f10922a, "NetworkRequestConstraintController send initial capabilities");
                f10912a.getClass();
                Intrinsics.checkNotNullParameter(connManager, "<this>");
                if (f10916e) {
                    networkCapabilities = f10915d;
                } else {
                    networkCapabilities = connManager.getNetworkCapabilities(connManager.getActiveNetwork());
                    f10915d = networkCapabilities;
                    f10916e = true;
                }
                onConstraintState.invoke(networkRequest.canBeSatisfiedBy(networkCapabilities) ? a.f10902a : new b(7));
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new l(6, onConstraintState, connManager);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        x.e().a(k.f10922a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (f10913b) {
            try {
                f10915d = networkCapabilities;
                for (Map.Entry entry : f10914c.entrySet()) {
                    ((Function1) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? a.f10902a : new b(7));
                }
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        x.e().a(k.f10922a, "NetworkRequestConstraintController onLost callback");
        synchronized (f10913b) {
            try {
                f10915d = null;
                Iterator it = f10914c.keySet().iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(new b(7));
                }
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
