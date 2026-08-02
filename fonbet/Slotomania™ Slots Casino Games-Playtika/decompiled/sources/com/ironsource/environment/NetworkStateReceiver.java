package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.Bc;
import com.ironsource.C2556n4;
import com.ironsource.environment.thread.IronSourceThreadManager;

/* loaded from: classes6.dex */
public class NetworkStateReceiver extends BroadcastReceiver {
    private ConnectivityManager a;
    private Bc b;
    private boolean c = false;

    class a implements Runnable {
        a() {
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

    private boolean a() {
        boolean z = this.c;
        ConnectivityManager connectivityManager = this.a;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                this.c = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            } catch (Exception e) {
                C2556n4.d().a(e);
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

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !a()) {
            return;
        }
        b();
    }
}
