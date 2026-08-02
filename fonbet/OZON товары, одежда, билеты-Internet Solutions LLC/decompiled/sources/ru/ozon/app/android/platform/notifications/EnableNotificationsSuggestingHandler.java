package ru.ozon.app.android.platform.notifications;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u0004\"\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "", "isEnablePushNotificationsOptionSuggestedByFirstTime", "", "()Z", "setEnablePushNotificationsOptionSuggestedByFirstTime", "(Z)V", "isPermissionForPushNotificationsForApiMoreThan32Requested", "setPermissionForPushNotificationsForApiMoreThan32Requested", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface EnableNotificationsSuggestingHandler {
    boolean isEnablePushNotificationsOptionSuggestedByFirstTime();

    boolean isPermissionForPushNotificationsForApiMoreThan32Requested();

    void setEnablePushNotificationsOptionSuggestedByFirstTime(boolean z11);

    void setPermissionForPushNotificationsForApiMoreThan32Requested(boolean z11);
}
