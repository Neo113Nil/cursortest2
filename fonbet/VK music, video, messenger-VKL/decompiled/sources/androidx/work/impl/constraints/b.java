package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.impl.constraints.a;
import androidx.work.impl.constraints.c;
import xsna.m100;
import xsna.wux0;

/* compiled from: WorkConstraintsTracker.kt */
/* loaded from: classes12.dex */
public final class b extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int b = 0;
    public final c.b a;

    public b(c.b bVar) {
        this.a = bVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        m100 c = m100.c();
        int i = wux0.a;
        c.getClass();
        this.a.invoke(a.C0094a.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        m100 c = m100.c();
        int i = wux0.a;
        c.getClass();
        this.a.invoke(new a.b(7));
    }
}
