package ru.ozon.app.android.storefront.feature.notifications.data;

import Ae.O0;
import Ae.x0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatus;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LAe/x0;", "Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatus;", "invoke", "()LAe/x0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class NoOpNotificationStatusManager$notificationStatus$2 extends AbstractC7737t implements Function0<x0<NotificationStatus>> {
    public static final NoOpNotificationStatusManager$notificationStatus$2 INSTANCE = new NoOpNotificationStatusManager$notificationStatus$2();

    NoOpNotificationStatusManager$notificationStatus$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final x0<NotificationStatus> invoke() {
        return O0.a(new NotificationStatus(false, false));
    }
}
