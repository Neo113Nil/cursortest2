package ru.ozon.app.android.storefront.feature.notifications.di;

import We.B;
import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusManager;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusProvider;
import ru.ozon.app.android.storefront.feature.notifications.data.NoOpNotificationStatusManager;
import ru.ozon.app.android.storefront.feature.notifications.data.NotificationStatusManagerImpl;
import ru.ozon.app.android.storefront.feature.notifications.network.NotificationStatusInterceptor;
import ru.ozon.app.android.storefront.feature.notifications.utils.AppTypeExtKt;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/storefront/feature/notifications/di/NotificationStatusModule;", "", "Companion", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class NotificationStatusModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/feature/notifications/di/NotificationStatusModule$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatusProvider;", "notificationStatusProvider", "LWe/B;", "getNotificationStatusInterceptor", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatusProvider;)LWe/B;", "Landroid/app/Application;", "application", "Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatusManager;", "getNotificationStatusManager", "(Landroid/app/Application;Lru/ozon/app/android/utils/AppType;)Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatusManager;", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final B getNotificationStatusInterceptor(@NotNull AppType appType, @NotNull NotificationStatusProvider notificationStatusProvider) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(notificationStatusProvider, "notificationStatusProvider");
            if (AppTypeExtKt.isPushHeaderEnabled(appType)) {
                return new NotificationStatusInterceptor(notificationStatusProvider);
            }
            return null;
        }

        @NotNull
        public final NotificationStatusManager getNotificationStatusManager(@NotNull Application application, @NotNull AppType appType) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(appType, "appType");
            return AppTypeExtKt.isPushHeaderEnabled(appType) ? new NotificationStatusManagerImpl(application) : NoOpNotificationStatusManager.INSTANCE;
        }

        private Companion() {
        }
    }
}
