package de.appplant.cordova.plugin.notification.util;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes3.dex */
public class PowerUtil {
    public static void wakeUp(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return;
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(268435462, "LocalNotification" + Math.random());
        newWakeLock.setReferenceCounted(false);
        newWakeLock.acquire(1000L);
        newWakeLock.release(1);
    }
}
