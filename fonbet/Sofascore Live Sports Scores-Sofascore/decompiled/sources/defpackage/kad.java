package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class kad extends ConnectivityManager.NetworkCallback {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final /* synthetic */ sx2 b;

    public kad(sx2 sx2Var) {
        this.b = sx2Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        this.a.post(new jad(this.b, 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        this.a.post(new jad(this.b, 1));
    }
}
