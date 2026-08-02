package rj;

import Ae.x0;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import rj.AbstractC9286a;

/* loaded from: classes6.dex */
public final class c extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f83587a;

    c(b bVar) {
        this.f83587a = bVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Set set;
        x0 x0Var;
        Intrinsics.checkNotNullParameter(network, "network");
        b bVar = this.f83587a;
        set = bVar.f83583b;
        set.add(network);
        x0Var = bVar.f83584c;
        x0Var.setValue(AbstractC9286a.C1429a.f83578a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Set set;
        x0 x0Var;
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        b bVar = this.f83587a;
        set = bVar.f83583b;
        set.add(network);
        x0Var = bVar.f83584c;
        x0Var.setValue(bVar.e());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Set set;
        x0 x0Var;
        Intrinsics.checkNotNullParameter(network, "network");
        b bVar = this.f83587a;
        set = bVar.f83583b;
        set.remove(network);
        x0Var = bVar.f83584c;
        x0Var.setValue(bVar.e());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        x0 x0Var;
        x0Var = this.f83587a.f83584c;
        x0Var.setValue(AbstractC9286a.b.f83579a);
    }
}
