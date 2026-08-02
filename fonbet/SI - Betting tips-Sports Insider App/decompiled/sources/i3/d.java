package i3;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import e3.x;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends ConnectivityManager.NetworkCallback {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10904c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10905a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10906b;

    public /* synthetic */ d(int i5, Object obj) {
        this.f10905a = i5;
        this.f10906b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f10905a) {
            case 2:
                Intrinsics.checkNotNullParameter(network, "network");
                ((we.a) this.f10906b).h(Boolean.TRUE);
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        f a7;
        switch (this.f10905a) {
            case 0:
                Intrinsics.checkNotNullParameter(network, "network");
                Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
                x.e().a(k.f10922a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((fg.d) this.f10906b).invoke(a.f10902a);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(network, "network");
                Intrinsics.checkNotNullParameter(networkCapabilities, "capabilities");
                x.e().a(k3.i.f18805a, "Network capabilities changed: " + networkCapabilities);
                k3.h hVar = (k3.h) this.f10906b;
                if (Build.VERSION.SDK_INT >= 28) {
                    Intrinsics.checkNotNullParameter(networkCapabilities, "<this>");
                    a7 = new f(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18));
                } else {
                    a7 = k3.i.a(hVar.f18803f);
                }
                hVar.b(a7);
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f10905a) {
            case 0:
                Intrinsics.checkNotNullParameter(network, "network");
                x.e().a(k.f10922a, "NetworkRequestConstraintController onLost callback");
                ((fg.d) this.f10906b).invoke(new b(7));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(network, "network");
                x.e().a(k3.i.f18805a, "Network connection lost");
                k3.h hVar = (k3.h) this.f10906b;
                hVar.b(k3.i.a(hVar.f18803f));
                break;
            default:
                Intrinsics.checkNotNullParameter(network, "network");
                ((we.a) this.f10906b).h(Boolean.FALSE);
                break;
        }
    }

    public d(fg.d dVar) {
        this.f10905a = 0;
        this.f10906b = dVar;
    }
}
