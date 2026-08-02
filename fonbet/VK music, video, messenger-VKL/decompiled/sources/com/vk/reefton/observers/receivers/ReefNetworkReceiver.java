package com.vk.reefton.observers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import xsna.cof0;
import xsna.dof0;

/* compiled from: ReefNetworkReceiver.kt */
/* loaded from: classes5.dex */
public final class ReefNetworkReceiver extends BroadcastReceiver {
    public final Context a;
    public dof0 b;

    public ReefNetworkReceiver(Context context) {
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast() && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            boolean z = !intent.getBooleanExtra("noConnectivity", false);
            dof0 dof0Var = this.b;
            if (dof0Var != null) {
                dof0Var.k.onNext(new cof0.d(z));
            }
        }
    }
}
