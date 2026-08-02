package com.sofascore.results.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.mha;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/service/NotificationChangesReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationChangesReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (context == null || action == null) {
            return;
        }
        if (action.equals("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED") || action.equals("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED")) {
            mha.F(context);
        }
    }
}
