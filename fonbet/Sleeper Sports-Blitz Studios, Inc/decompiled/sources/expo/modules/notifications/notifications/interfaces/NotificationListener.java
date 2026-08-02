package expo.modules.notifications.notifications.interfaces;

import android.os.Bundle;
import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.notifications.model.NotificationResponse;
import expo.modules.notifications.service.NotificationsService;
import io.sentry.protocol.Response;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationListener.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"Lexpo/modules/notifications/notifications/interfaces/NotificationListener;", "", "onNotificationReceived", "", NotificationsService.NOTIFICATION_KEY, "Lexpo/modules/notifications/notifications/model/Notification;", "onNotificationResponseReceived", "", Response.TYPE, "Lexpo/modules/notifications/notifications/model/NotificationResponse;", "onNotificationResponseIntentReceived", "extras", "Landroid/os/Bundle;", "onNotificationsDropped", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface NotificationListener {

    /* compiled from: NotificationListener.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onNotificationReceived(NotificationListener notificationListener, Notification notification) {
            Intrinsics.checkNotNullParameter(notification, "notification");
        }

        public static void onNotificationResponseIntentReceived(NotificationListener notificationListener, Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
        }

        public static boolean onNotificationResponseReceived(NotificationListener notificationListener, NotificationResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return false;
        }

        public static void onNotificationsDropped(NotificationListener notificationListener) {
        }
    }

    void onNotificationReceived(Notification notification);

    void onNotificationResponseIntentReceived(Bundle extras);

    boolean onNotificationResponseReceived(NotificationResponse response);

    void onNotificationsDropped();
}
