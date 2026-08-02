package com.zoho.livechat.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.zoho.livechat.android.utils.C3938g;

/* loaded from: classes4.dex */
public class NotificationDeleteReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            new C3938g(intent.getStringExtra("groupid"), intent.getStringExtra("timeuuid"), false).start();
        } catch (Exception unused) {
        }
    }
}
