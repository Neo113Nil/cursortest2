package com.vk.pushes.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import xsna.b010;
import xsna.bpn0;

/* compiled from: NotificationActionsReceiver.kt */
/* loaded from: classes5.dex */
public final class NotificationActionsReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        new c(new bpn0(new b010(this, 16))).a(context, intent);
    }
}
