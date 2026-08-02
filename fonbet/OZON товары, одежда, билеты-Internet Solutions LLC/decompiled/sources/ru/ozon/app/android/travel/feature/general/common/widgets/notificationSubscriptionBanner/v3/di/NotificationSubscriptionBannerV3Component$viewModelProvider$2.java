package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3ViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel;", "kotlin.jvm.PlatformType", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class NotificationSubscriptionBannerV3Component$viewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<NotificationSubscriptionBannerV3ViewModel>> {
    final /* synthetic */ NotificationSubscriptionBannerV3Component this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionBannerV3Component$viewModelProvider$2(NotificationSubscriptionBannerV3Component notificationSubscriptionBannerV3Component) {
        super(0);
        this.this$0 = notificationSubscriptionBannerV3Component;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationSubscriptionBannerV3ViewModel invoke$lambda$0(NotificationSubscriptionBannerV3Component notificationSubscriptionBannerV3Component) {
        ActionComponentApi actionComponentApi;
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        AndroidPlatformComponentApi androidPlatformComponentApi;
        actionComponentApi = notificationSubscriptionBannerV3Component.actionComponentApi;
        ActionV2Repository actionRepository = actionComponentApi.getActionRepository();
        coroutineDispatchersComponentApi = notificationSubscriptionBannerV3Component.coroutineDispatchersComponentApi;
        CoroutineDispatcherProvider dispatcherProvider = coroutineDispatchersComponentApi.getDispatcherProvider();
        androidPlatformComponentApi = notificationSubscriptionBannerV3Component.androidPlatformComponentApi;
        return new NotificationSubscriptionBannerV3ViewModel(actionRepository, dispatcherProvider, androidPlatformComponentApi.getEnableNotificationsSuggestingHandler());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<NotificationSubscriptionBannerV3ViewModel> invoke() {
        final NotificationSubscriptionBannerV3Component notificationSubscriptionBannerV3Component = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.di.a
            @Override // Pc.a
            public final Object get() {
                NotificationSubscriptionBannerV3ViewModel invoke$lambda$0;
                invoke$lambda$0 = NotificationSubscriptionBannerV3Component$viewModelProvider$2.invoke$lambda$0(NotificationSubscriptionBannerV3Component.this);
                return invoke$lambda$0;
            }
        };
    }
}
