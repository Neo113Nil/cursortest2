package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes.dex */
class NotificationApiHelperForO {
    static boolean isChannelEnabled(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel;
        int importance;
        notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel == null) {
            return true;
        }
        importance = notificationChannel.getImportance();
        return importance != 0;
    }

    static Notification copyNotificationOntoChannel(Context context, NotificationManager notificationManager, Notification notification, String str, String str2) {
        NotificationChannel notificationChannel;
        int importance;
        notificationManager.createNotificationChannel(ComponentDialog$$ExternalSyntheticApiModelOutline0.m(str, str2, 3));
        notificationChannel = notificationManager.getNotificationChannel(str);
        importance = notificationChannel.getImportance();
        if (importance == 0) {
            return null;
        }
        Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, notification);
        recoverBuilder.setChannelId(str);
        return recoverBuilder.build();
    }

    private NotificationApiHelperForO() {
    }
}
