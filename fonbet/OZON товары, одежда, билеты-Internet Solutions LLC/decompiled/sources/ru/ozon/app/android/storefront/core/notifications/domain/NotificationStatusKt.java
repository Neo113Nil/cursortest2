package ru.ozon.app.android.storefront.core.notifications.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"canPostNotifications", "", "Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatus;", "getCanPostNotifications", "(Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatus;)Z", "hasDisabledChannels", "getHasDisabledChannels", "notifications_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NotificationStatusKt {
    public static final boolean getCanPostNotifications(@NotNull NotificationStatus notificationStatus) {
        Intrinsics.checkNotNullParameter(notificationStatus, "<this>");
        return notificationStatus.getIsNotificationEnabled() && notificationStatus.getAreChannelsEnabled();
    }

    public static final boolean getHasDisabledChannels(@NotNull NotificationStatus notificationStatus) {
        Intrinsics.checkNotNullParameter(notificationStatus, "<this>");
        return notificationStatus.getIsNotificationEnabled() && !notificationStatus.getAreChannelsEnabled();
    }
}
