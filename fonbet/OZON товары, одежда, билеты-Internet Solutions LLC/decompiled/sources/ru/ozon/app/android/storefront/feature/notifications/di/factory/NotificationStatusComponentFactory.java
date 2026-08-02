package ru.ozon.app.android.storefront.feature.notifications.di.factory;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storefront.core.notifications.di.NotificationStatusComponentApi;
import ru.ozon.app.android.storefront.feature.notifications.di.DaggerNotificationStatusComponent;
import ru.ozon.app.android.storefront.feature.notifications.di.NotificationStatusComponent;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/storefront/feature/notifications/di/factory/NotificationStatusComponentFactory;", "Lii/a;", "Lru/ozon/app/android/storefront/core/notifications/di/NotificationStatusComponentApi;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "<init>", "()V", "Lgi/b;", "componentStorage", "create", "(Lgi/b;)Lru/ozon/app/android/storefront/core/notifications/di/NotificationStatusComponentApi;", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NotificationStatusComponentFactory implements InterfaceC7081a<NotificationStatusComponentApi> {
    @Override // ii.InterfaceC7081a
    @NotNull
    public NotificationStatusComponentApi create(@NotNull C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        NotificationStatusComponent.Factory factory = DaggerNotificationStatusComponent.factory();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) componentStorage.b(ContextComponentDependencies.class);
        if (AndroidPlatformComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentDependencies is not DiComponent");
        }
        return factory.create(contextComponentDependencies, (AndroidPlatformComponentDependencies) componentStorage.b(AndroidPlatformComponentDependencies.class));
    }
}
