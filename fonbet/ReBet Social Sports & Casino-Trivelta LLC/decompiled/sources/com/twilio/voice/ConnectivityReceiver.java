package com.twilio.voice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.twilio.voice.Voice;

/* loaded from: classes4.dex */
class ConnectivityReceiver extends BroadcastReceiver {
    private static final Logger logger = Logger.getLogger(ConnectivityReceiver.class);
    private NetworkInfo currentNetworkInfo;

    public static void logNetworkChangeEvent(Voice.NetworkChangeEvent networkChangeEvent, NetworkInfo networkInfo, NetworkInfo networkInfo2, boolean z10) {
        Logger logger2 = logger;
        logger2.d("networkChangeEvent: " + networkChangeEvent.name() + " reportedToSdk: " + Boolean.toString(z10));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("currentNetworkInfo: ");
        sb2.append(networkInfo == null ? "null" : networkInfo.toString());
        logger2.d(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("newNetworkInfo: ");
        sb3.append(networkInfo2 != null ? networkInfo2.toString() : "null");
        logger2.d(sb3.toString());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        NetworkInfo networkInfo;
        Logger logger2 = logger;
        logger2.d("Network event received");
        if (intent.getAction().equalsIgnoreCase("android.net.conn.CONNECTIVITY_CHANGE")) {
            if (isInitialStickyBroadcast()) {
                logger2.d("Ignoring network event, sticky broadcast");
                return;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            Voice.NetworkChangeEvent networkChangeEvent = Voice.NetworkChangeEvent.CONNECTION_CHANGED;
            if (activeNetworkInfo != null && ((networkInfo = this.currentNetworkInfo) == null || networkInfo.getDetailedState() != activeNetworkInfo.getDetailedState() || this.currentNetworkInfo.getType() != activeNetworkInfo.getType() || this.currentNetworkInfo.getSubtype() != activeNetworkInfo.getSubtype())) {
                if (!activeNetworkInfo.isConnectedOrConnecting()) {
                    networkChangeEvent = Voice.NetworkChangeEvent.CONNECTION_LOST;
                }
                logNetworkChangeEvent(networkChangeEvent, this.currentNetworkInfo, activeNetworkInfo, true);
                Voice.onNetworkChanged(networkChangeEvent);
            } else if (activeNetworkInfo == null) {
                Voice.NetworkChangeEvent networkChangeEvent2 = Voice.NetworkChangeEvent.CONNECTION_LOST;
                logNetworkChangeEvent(networkChangeEvent2, this.currentNetworkInfo, activeNetworkInfo, true);
                Voice.onNetworkChanged(networkChangeEvent2);
            } else {
                logNetworkChangeEvent(networkChangeEvent, this.currentNetworkInfo, activeNetworkInfo, false);
            }
            this.currentNetworkInfo = activeNetworkInfo;
        }
    }
}
