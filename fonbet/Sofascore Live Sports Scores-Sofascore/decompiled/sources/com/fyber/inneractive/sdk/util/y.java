package com.fyber.inneractive.sdk.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class y extends BroadcastReceiver {
    public final /* synthetic */ b0 a;

    public y(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b0 b0Var = this.a;
        b0Var.getClass();
        IAlog.a("%sonReceive. action = %s", IAlog.a(b0Var), intent.getAction());
        b0.a(this.a, context, intent);
    }
}
