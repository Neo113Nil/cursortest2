package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appsflyer.internal.AFa1zSDK;
import com.google.android.exoplayer2.ExoPlayer;

/* loaded from: classes8.dex */
public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent == null) {
            return;
        }
        try {
            str = intent.getStringExtra("referrer");
        } catch (Throwable th) {
            AFLogger.afErrorLog("error in BroadcastReceiver ", th);
            str = null;
        }
        if (str != null && AFa1zSDK.c_(context).getString("referrer", null) != null) {
            AFa1zSDK.getMonetizationNetwork().getRevenue(context, str);
            return;
        }
        String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
        long currentTimeMillis = System.currentTimeMillis();
        if (string == null || currentTimeMillis - Long.parseLong(string) >= ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS) {
            AFLogger.afInfoLog("SingleInstallBroadcastReceiver called");
            AFa1zSDK monetizationNetwork = AFa1zSDK.getMonetizationNetwork();
            AFa1zSDK.AFAdRevenueData(new Object[]{monetizationNetwork, context, intent}, -1435995239, 1435995258, System.identityHashCode(monetizationNetwork));
            AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
        }
    }
}
