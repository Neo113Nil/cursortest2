package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import com.appsflyer.internal.AFa1zSDK;

/* loaded from: classes7.dex */
public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
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
        AFLogger.afInfoLog("MultipleInstallBroadcastReceiver called");
        AFa1zSDK monetizationNetwork = AFa1zSDK.getMonetizationNetwork();
        AFa1zSDK.AFAdRevenueData(new Object[]{monetizationNetwork, context, intent}, -1435995239, 1435995258, System.identityHashCode(monetizationNetwork));
        for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER"), 0)) {
            String action = intent.getAction();
            if (((PackageItemInfo) resolveInfo.activityInfo).packageName.equals(context.getPackageName()) && "com.android.vending.INSTALL_REFERRER".equals(action) && !getClass().getName().equals(((PackageItemInfo) resolveInfo.activityInfo).name)) {
                AFLogger.afInfoLog(new StringBuilder("trigger onReceive: class: ").append(((PackageItemInfo) resolveInfo.activityInfo).name).toString());
                try {
                    ((BroadcastReceiver) Class.forName(((PackageItemInfo) resolveInfo.activityInfo).name).newInstance()).onReceive(context, intent);
                } catch (Throwable th2) {
                    AFLogger.afErrorLog(new StringBuilder("error in BroadcastReceiver ").append(((PackageItemInfo) resolveInfo.activityInfo).name).toString(), th2);
                }
            }
        }
    }
}
