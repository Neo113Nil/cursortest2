package ru.ozon.app.android.storefront.core.notifications.di;

import We.B;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusObserver;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusProvider;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/core/notifications/di/NotificationStatusComponentApi;", "Lhi/a;", "Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatusObserver;", "getNotificationStatusObserver", "()Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatusObserver;", "Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatusProvider;", "getNotificationStatusProvider", "()Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatusProvider;", "LWe/B;", "getNotificationStatusInterceptor", "()LWe/B;", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NotificationStatusComponentApi extends InterfaceC6958a {
    B getNotificationStatusInterceptor();

    @NotNull
    NotificationStatusObserver getNotificationStatusObserver();

    @NotNull
    NotificationStatusProvider getNotificationStatusProvider();
}
