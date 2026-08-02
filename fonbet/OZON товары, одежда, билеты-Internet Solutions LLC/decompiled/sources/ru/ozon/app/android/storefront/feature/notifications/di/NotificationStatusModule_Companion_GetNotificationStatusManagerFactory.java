package ru.ozon.app.android.storefront.feature.notifications.di;

import Jb.e;
import Jb.j;
import android.app.Application;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusManager;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes7.dex */
public final class NotificationStatusModule_Companion_GetNotificationStatusManagerFactory implements e<NotificationStatusManager> {
    public static NotificationStatusManager getNotificationStatusManager(Application application, AppType appType) {
        NotificationStatusManager notificationStatusManager = NotificationStatusModule.INSTANCE.getNotificationStatusManager(application, appType);
        j.d(notificationStatusManager);
        return notificationStatusManager;
    }
}
