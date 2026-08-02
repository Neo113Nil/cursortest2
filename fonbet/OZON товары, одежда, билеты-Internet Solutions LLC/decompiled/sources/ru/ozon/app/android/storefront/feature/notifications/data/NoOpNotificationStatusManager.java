package ru.ozon.app.android.storefront.feature.notifications.data;

import Ae.x0;
import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatus;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusManager;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/feature/notifications/data/NoOpNotificationStatusManager;", "Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatusManager;", "<init>", "()V", "", "init", "LAe/x0;", "Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatus;", "getStatusFlow", "()LAe/x0;", "notificationStatus$delegate", "LSc/j;", "getNotificationStatus", "notificationStatus", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NoOpNotificationStatusManager implements NotificationStatusManager {

    @NotNull
    public static final NoOpNotificationStatusManager INSTANCE = new NoOpNotificationStatusManager();

    /* renamed from: notificationStatus$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j notificationStatus = k.b(NoOpNotificationStatusManager$notificationStatus$2.INSTANCE);
    public static final int $stable = 8;

    private NoOpNotificationStatusManager() {
    }

    private final x0<NotificationStatus> getNotificationStatus() {
        return (x0) notificationStatus.getValue();
    }

    @Override // ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusObserver
    public void init() {
    }

    @Override // ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusProvider
    @NotNull
    public x0<NotificationStatus> getStatusFlow() {
        return getNotificationStatus();
    }
}
