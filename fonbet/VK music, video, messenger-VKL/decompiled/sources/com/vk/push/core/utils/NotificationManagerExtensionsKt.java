package com.vk.push.core.utils;

import android.app.NotificationChannel;
import android.app.NotificationManager;

/* compiled from: NotificationManagerExtensions.kt */
/* loaded from: classes5.dex */
public final class NotificationManagerExtensionsKt {
    public static final void createNotificationChannelCompat(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static final NotificationChannel getNotificationChannelCompat(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannel(str);
    }

    public static final Integer getNotificationChannelImportanceCompat(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel != null) {
            return Integer.valueOf(notificationChannel.getImportance());
        }
        return null;
    }
}
