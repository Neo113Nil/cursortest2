package ru.ozon.app.android.storefront.feature.notifications.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storefront.core.notifications.di.NotificationStatusComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/storefront/feature/notifications/di/NotificationStatusComponent;", "Lru/ozon/app/android/storefront/core/notifications/di/NotificationStatusComponentApi;", "Factory", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NotificationStatusComponent extends NotificationStatusComponentApi {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/feature/notifications/di/NotificationStatusComponent$Factory;", "", "create", "Lru/ozon/app/android/storefront/feature/notifications/di/NotificationStatusComponent;", "contextComponentApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "androidPlatformComponentApi", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        NotificationStatusComponent create(@NotNull ContextComponentDependencies contextComponentApi, @NotNull AndroidPlatformComponentDependencies androidPlatformComponentApi);
    }
}
