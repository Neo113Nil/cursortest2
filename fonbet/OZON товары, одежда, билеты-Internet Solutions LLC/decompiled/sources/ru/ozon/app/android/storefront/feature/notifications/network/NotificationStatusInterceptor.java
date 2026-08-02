package ru.ozon.app.android.storefront.feature.notifications.network;

import Ek.a;
import We.B;
import We.G;
import We.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.interceptors.BXInterceptor;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusKt;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusProvider;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/storefront/feature/notifications/network/NotificationStatusInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatusProvider;", "notificationStatusProvider", "<init>", "(Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatusProvider;)V", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatusProvider;", "", "getCurrentNotificationStatus", "()Ljava/lang/String;", "currentNotificationStatus", "Companion", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NotificationStatusInterceptor extends BXInterceptor {

    @NotNull
    private final NotificationStatusProvider notificationStatusProvider;
    public static final int $stable = 8;

    public NotificationStatusInterceptor(@NotNull NotificationStatusProvider notificationStatusProvider) {
        Intrinsics.checkNotNullParameter(notificationStatusProvider, "notificationStatusProvider");
        this.notificationStatusProvider = notificationStatusProvider;
    }

    private final String getCurrentNotificationStatus() {
        return String.valueOf(NotificationStatusKt.getCanPostNotifications(this.notificationStatusProvider.getStatusFlow().getValue()));
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        G.a aVar = new G.a(a.a(chain, "chain"));
        aVar.a("x-is-push-enabled", getCurrentNotificationStatus());
        return chain.proceed(aVar.b());
    }
}
