package de.appplant.cordova.plugin.localnotification;

import android.os.Bundle;
import de.appplant.cordova.plugin.notification.Builder;
import de.appplant.cordova.plugin.notification.Notification;
import de.appplant.cordova.plugin.notification.receiver.AbstractTriggerReceiver;

/* loaded from: classes4.dex */
public class TriggerReceiver extends AbstractTriggerReceiver {
    @Override // de.appplant.cordova.plugin.notification.receiver.AbstractTriggerReceiver
    public void onTrigger(Notification notification, Bundle bundle) {
        performNotification(notification);
    }

    @Override // de.appplant.cordova.plugin.notification.receiver.AbstractNotificationReceiver
    public void dispatchAppEvent(String str, Notification notification) {
        LocalNotification.fireEvent(str, notification);
    }

    @Override // de.appplant.cordova.plugin.notification.receiver.AbstractNotificationReceiver
    public boolean checkAppRunning() {
        return LocalNotification.isAppRunning();
    }

    @Override // de.appplant.cordova.plugin.notification.receiver.AbstractTriggerReceiver
    public Notification buildNotification(Builder builder, Bundle bundle) {
        return builder.setClickActivity(ClickReceiver.class).setClearReceiver(ClearReceiver.class).setExtras(bundle).build();
    }
}
