package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.NotificationSubscriptionViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionViewModel;", "kotlin.jvm.PlatformType", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class NotificationSubscriptionComponent$viewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<NotificationSubscriptionViewModel>> {
    final /* synthetic */ NotificationSubscriptionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionComponent$viewModelProvider$2(NotificationSubscriptionComponent notificationSubscriptionComponent) {
        super(0);
        this.this$0 = notificationSubscriptionComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationSubscriptionViewModel invoke$lambda$0(NotificationSubscriptionComponent notificationSubscriptionComponent) {
        ActionComponentApi actionComponentApi;
        actionComponentApi = notificationSubscriptionComponent.actionComponentApi;
        return new NotificationSubscriptionViewModel(actionComponentApi.getActionRepository());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<NotificationSubscriptionViewModel> invoke() {
        final NotificationSubscriptionComponent notificationSubscriptionComponent = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.di.a
            @Override // Pc.a
            public final Object get() {
                NotificationSubscriptionViewModel invoke$lambda$0;
                invoke$lambda$0 = NotificationSubscriptionComponent$viewModelProvider$2.invoke$lambda$0(NotificationSubscriptionComponent.this);
                return invoke$lambda$0;
            }
        };
    }
}
