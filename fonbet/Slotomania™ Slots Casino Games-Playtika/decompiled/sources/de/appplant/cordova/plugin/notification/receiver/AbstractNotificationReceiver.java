package de.appplant.cordova.plugin.notification.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import de.appplant.cordova.plugin.notification.Manager;
import de.appplant.cordova.plugin.notification.Notification;
import de.appplant.cordova.plugin.notification.Options;
import de.appplant.cordova.plugin.notification.Request;
import de.appplant.cordova.plugin.notification.util.LaunchUtils;
import java.util.Calendar;

/* loaded from: classes8.dex */
public abstract class AbstractNotificationReceiver extends BroadcastReceiver {
    public abstract boolean checkAppRunning();

    public abstract void dispatchAppEvent(String str, Notification notification);

    public void performNotification(Notification notification) {
        Context context = notification.getContext();
        Options options = notification.getOptions();
        Manager manager = Manager.getInstance(context);
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        boolean z = false;
        boolean z2 = options.isAutoLaunchingApp() && Build.VERSION.SDK_INT <= 28 && !options.useFullScreenIntent();
        boolean z3 = Build.VERSION.SDK_INT < 26 || (powerManager != null && powerManager.isInteractive());
        int badgeNumber = options.getBadgeNumber();
        if (badgeNumber > 0) {
            manager.setBadge(badgeNumber);
        }
        if (options.shallWakeUp()) {
            wakeUp(notification);
        }
        if (z2) {
            LaunchUtils.launchApp(context);
        }
        if (!options.triggerInApp() || ((!z2 && !checkAppRunning()) || !z3)) {
            notification.show();
            z = true;
        }
        if (options.triggerInApp() && !z) {
            if (!options.shallWakeUp()) {
                wakeUp(notification);
            }
            dispatchAppEvent("trigger", notification);
        }
        if (options.isInfiniteTrigger()) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(12, 1);
            manager.schedule(new Request(options, calendar.getTime()), getClass());
        }
    }

    private void wakeUp(Notification notification) {
        Context context = notification.getContext();
        Options options = notification.getOptions();
        String str = context.getApplicationInfo().name + ":LocalNotification";
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return;
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(805306394, str);
        newWakeLock.setReferenceCounted(false);
        newWakeLock.acquire(options.getWakeLockTimeout());
    }
}
