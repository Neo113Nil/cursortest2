package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.Bc;
import com.ironsource.C4157k4;
import com.ironsource.environment.thread.IronSourceThreadManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class NetworkStateReceiver extends BroadcastReceiver {
    private ConnectivityManager a;
    private Bc b;
    private boolean c = false;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NetworkStateReceiver networkStateReceiver = NetworkStateReceiver.this;
            Bc bc = networkStateReceiver.b;
            if (bc != null) {
                bc.a(networkStateReceiver.c);
            }
        }
    }

    public NetworkStateReceiver(Context context, Bc bc) {
        this.b = bc;
        if (context != null) {
            this.a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a() {
        boolean z;
        boolean z2 = this.c;
        ConnectivityManager connectivityManager = this.a;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                z = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
                this.c = z;
            } catch (Exception e) {
                C4157k4.d().a(e);
                this.c = false;
            }
            return z2 == z;
        }
        this.c = false;
        z = false;
        if (z2 == z) {
        }
    }

    private void b() {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !a()) {
            return;
        }
        b();
    }
}
