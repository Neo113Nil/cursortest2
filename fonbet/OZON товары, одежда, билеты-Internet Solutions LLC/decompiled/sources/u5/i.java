package u5;

import A5.t;
import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"MissingPermission"})
/* loaded from: classes8.dex */
final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConnectivityManager f100318a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final t f100319b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final h f100320c;

    public i(@NotNull ConnectivityManager connectivityManager, @NotNull t tVar) {
        this.f100318a = connectivityManager;
        this.f100319b = tVar;
        h hVar = new h(this);
        this.f100320c = hVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), hVar);
    }

    public static final void b(i iVar, Network network, boolean z11) {
        boolean z12;
        Network[] allNetworks = iVar.f100318a.getAllNetworks();
        int length = allNetworks.length;
        boolean z13 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Network network2 = allNetworks[i11];
            if (Intrinsics.d(network2, network)) {
                z12 = z11;
            } else {
                NetworkCapabilities networkCapabilities = iVar.f100318a.getNetworkCapabilities(network2);
                z12 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z12) {
                z13 = true;
                break;
            }
            i11++;
        }
        iVar.f100319b.b(z13);
    }

    @Override // u5.f
    public final boolean a() {
        ConnectivityManager connectivityManager = this.f100318a;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // u5.f
    public final void shutdown() {
        this.f100318a.unregisterNetworkCallback(this.f100320c);
    }
}
