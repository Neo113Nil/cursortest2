package ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusProvider;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/presentation/PromoPushEnableViewModelFactory;", "Landroidx/lifecycle/z0$b;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "notificationsHandler", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "coroutineDispatcherProvider", "Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatusProvider;", "pushNotificationStatusProvider", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatusProvider;)V", "Landroidx/lifecycle/w0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatusProvider;", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromoPushEnableViewModelFactory implements z0.b {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final CoroutineDispatcherProvider coroutineDispatcherProvider;

    @NotNull
    private final EnableNotificationsSuggestingHandler notificationsHandler;

    @NotNull
    private final NotificationStatusProvider pushNotificationStatusProvider;

    public PromoPushEnableViewModelFactory(@NotNull ActionV2Repository actionV2Repository, @NotNull EnableNotificationsSuggestingHandler notificationsHandler, @NotNull CoroutineDispatcherProvider coroutineDispatcherProvider, @NotNull NotificationStatusProvider pushNotificationStatusProvider) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(notificationsHandler, "notificationsHandler");
        Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "coroutineDispatcherProvider");
        Intrinsics.checkNotNullParameter(pushNotificationStatusProvider, "pushNotificationStatusProvider");
        this.actionV2Repository = actionV2Repository;
        this.notificationsHandler = notificationsHandler;
        this.coroutineDispatcherProvider = coroutineDispatcherProvider;
        this.pushNotificationStatusProvider = pushNotificationStatusProvider;
    }

    @Override // androidx.lifecycle.z0.b
    @NotNull
    public <T extends w0> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return new PromoPushEnableViewModel(this.actionV2Repository, this.notificationsHandler, this.coroutineDispatcherProvider, this.pushNotificationStatusProvider);
    }
}
