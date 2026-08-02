package u5;

import android.net.ConnectivityManager;
import android.net.Network;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class h extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f100317a;

    h(i iVar) {
        this.f100317a = iVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(@NotNull Network network) {
        i.b(this.f100317a, network, true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(@NotNull Network network) {
        i.b(this.f100317a, network, false);
    }
}
