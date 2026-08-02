package de.appplant.cordova.plugin.notification.util;

import android.content.Context;
import android.content.Intent;
import com.safedk.android.utils.Logger;

/* loaded from: classes8.dex */
public final class LaunchUtils {
    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public static void launchApp(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return;
        }
        launchIntentForPackage.addFlags(805437440);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, launchIntentForPackage);
    }
}
