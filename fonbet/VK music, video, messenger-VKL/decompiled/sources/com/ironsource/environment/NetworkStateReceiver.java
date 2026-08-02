package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.C4452n4;
import com.ironsource.Cc;
import com.ironsource.environment.thread.IronSourceThreadManager;

/* loaded from: classes13.dex */
public class NetworkStateReceiver extends BroadcastReceiver {
    private ConnectivityManager a;
    private Cc b;
    private boolean c = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NetworkStateReceiver networkStateReceiver = NetworkStateReceiver.this;
            Cc cc = networkStateReceiver.b;
            if (cc != null) {
                cc.a(networkStateReceiver.c);
            }
        }
    }

    public NetworkStateReceiver(Context context, Cc cc) {
        this.b = cc;
        if (context != null) {
            this.a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        a();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !a()) {
            return;
        }
        b();
    }

    private boolean a() {
        boolean z = this.c;
        ConnectivityManager connectivityManager = this.a;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                this.c = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            } catch (Exception e) {
                C4452n4.d().a(e);
                this.c = false;
            }
        } else {
            this.c = false;
        }
        return z != this.c;
    }

    private void b() {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a());
    }
}
