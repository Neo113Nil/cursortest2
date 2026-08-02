package io.intercom.android.sdk.utilities.connectivity;

import android.content.Context;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
import io.intercom.android.sdk.utilities.connectivity.ConnectivityBroadcastReceiver;

/* loaded from: classes9.dex */
public class NetworkConnectivityMonitor implements ConnectivityBroadcastReceiver.ConnectivityUpdateListener {
    private ConnectivityEventListener listener;
    private NetworkState lastState = NetworkState.UNKNOWN;
    private boolean didRegister = false;
    private final ConnectivityBroadcastReceiver receiver = new ConnectivityBroadcastReceiver(this);

    public interface ConnectivityEventListener {
        void onDisconnect();

        void onReconnect();
    }

    @Override // io.intercom.android.sdk.utilities.connectivity.ConnectivityBroadcastReceiver.ConnectivityUpdateListener
    public void onUpdate(NetworkState networkState) {
        if (networkState == this.lastState) {
            return;
        }
        if (this.listener != null) {
            if (networkState == NetworkState.NOT_CONNECTED) {
                this.listener.onDisconnect();
            } else if (networkState == NetworkState.CONNECTED && this.lastState == NetworkState.NOT_CONNECTED) {
                this.listener.onReconnect();
            }
        }
        this.lastState = networkState;
    }

    public synchronized void startListening(Context context) {
        if (!this.didRegister) {
            ContextCompat.registerReceiver(context, this.receiver, new IntentFilter(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION), 4);
            this.didRegister = true;
        }
    }

    public synchronized void stopListening(Context context) {
        if (this.didRegister) {
            context.unregisterReceiver(this.receiver);
            this.didRegister = false;
        }
    }

    public void setListener(ConnectivityEventListener connectivityEventListener) {
        this.listener = connectivityEventListener;
    }

    ConnectivityEventListener getListener() {
        return this.listener;
    }
}
