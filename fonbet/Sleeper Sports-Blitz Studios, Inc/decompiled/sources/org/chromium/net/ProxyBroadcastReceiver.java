package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.base.TraceEvent;

/* loaded from: classes10.dex */
final class ProxyBroadcastReceiver extends BroadcastReceiver {
    private final ProxyChangeListener mListener;

    ProxyBroadcastReceiver(ProxyChangeListener listener) {
        this.mListener = listener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        TraceEvent scoped = TraceEvent.scoped("ProxyBroadcastReceiver#onReceive");
        try {
            if ("android.intent.action.PROXY_CHANGE".equals(intent.getAction())) {
                this.mListener.updateProxyConfigFromConnectivityManager(intent);
            }
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
