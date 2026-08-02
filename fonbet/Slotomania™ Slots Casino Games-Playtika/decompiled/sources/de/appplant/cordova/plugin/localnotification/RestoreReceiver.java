package de.appplant.cordova.plugin.localnotification;

import de.appplant.cordova.plugin.notification.Builder;
import de.appplant.cordova.plugin.notification.Manager;
import de.appplant.cordova.plugin.notification.Notification;
import de.appplant.cordova.plugin.notification.Request;
import de.appplant.cordova.plugin.notification.receiver.AbstractRestoreReceiver;
import java.util.Date;

/* loaded from: classes8.dex */
public class RestoreReceiver extends AbstractRestoreReceiver {
    @Override // de.appplant.cordova.plugin.notification.receiver.AbstractRestoreReceiver
    public void onRestore(Request request, Notification notification) {
        Date triggerDate = request.getTriggerDate();
        boolean z = triggerDate != null && triggerDate.after(new Date());
        if (!z && notification.isHighPrio()) {
            performNotification(notification);
            return;
        }
        Manager manager = Manager.getInstance(notification.getContext());
        if (z || notification.isRepeating()) {
            manager.schedule(request, TriggerReceiver.class);
        }
    }

    @Override // de.appplant.cordova.plugin.notification.receiver.AbstractNotificationReceiver
    public void dispatchAppEvent(String str, Notification notification) {
        LocalNotification.fireEvent(str, notification);
    }

    @Override // de.appplant.cordova.plugin.notification.receiver.AbstractNotificationReceiver
    public boolean checkAppRunning() {
        return LocalNotification.isAppRunning();
    }

    @Override // de.appplant.cordova.plugin.notification.receiver.AbstractRestoreReceiver
    public Notification buildNotification(Builder builder) {
        return builder.setClickActivity(ClickReceiver.class).setClearReceiver(ClearReceiver.class).build();
    }
}
