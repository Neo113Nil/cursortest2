package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.data.NotificationSubscriptionMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.NotificationSubscriptionWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionWidgetViewModel;", "kotlin.jvm.PlatformType", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class NotificationSubscriptionComponent$widgetViewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<NotificationSubscriptionWidgetViewModel>> {
    final /* synthetic */ NotificationSubscriptionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionComponent$widgetViewModelProvider$2(NotificationSubscriptionComponent notificationSubscriptionComponent) {
        super(0);
        this.this$0 = notificationSubscriptionComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationSubscriptionWidgetViewModel invoke$lambda$0(NotificationSubscriptionComponent notificationSubscriptionComponent) {
        ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        composerWidgetAsyncComponentApi = notificationSubscriptionComponent.asyncComponentApi;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository();
        NotificationSubscriptionMapper mapper = notificationSubscriptionComponent.getMapper();
        coroutineDispatchersComponentApi = notificationSubscriptionComponent.dispatcherComponentApi;
        return new NotificationSubscriptionWidgetViewModel(composerAsyncWidgetRepository, mapper, coroutineDispatchersComponentApi.getDispatcherProvider());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<NotificationSubscriptionWidgetViewModel> invoke() {
        final NotificationSubscriptionComponent notificationSubscriptionComponent = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.di.b
            @Override // Pc.a
            public final Object get() {
                NotificationSubscriptionWidgetViewModel invoke$lambda$0;
                invoke$lambda$0 = NotificationSubscriptionComponent$widgetViewModelProvider$2.invoke$lambda$0(NotificationSubscriptionComponent.this);
                return invoke$lambda$0;
            }
        };
    }
}
