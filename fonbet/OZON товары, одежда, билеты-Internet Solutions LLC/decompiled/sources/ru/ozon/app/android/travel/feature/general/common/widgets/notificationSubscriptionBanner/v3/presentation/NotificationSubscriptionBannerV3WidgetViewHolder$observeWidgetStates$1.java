package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3ViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "buttonState", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel$ButtonState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3WidgetViewHolder$observeWidgetStates$1", f = "NotificationSubscriptionBannerV3WidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationSubscriptionBannerV3WidgetViewHolder$observeWidgetStates$1 extends j implements Function2<NotificationSubscriptionBannerV3ViewModel.ButtonState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationSubscriptionBannerV3WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionBannerV3WidgetViewHolder$observeWidgetStates$1(NotificationSubscriptionBannerV3WidgetViewHolder notificationSubscriptionBannerV3WidgetViewHolder, d<? super NotificationSubscriptionBannerV3WidgetViewHolder$observeWidgetStates$1> dVar) {
        super(2, dVar);
        this.this$0 = notificationSubscriptionBannerV3WidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        NotificationSubscriptionBannerV3WidgetViewHolder$observeWidgetStates$1 notificationSubscriptionBannerV3WidgetViewHolder$observeWidgetStates$1 = new NotificationSubscriptionBannerV3WidgetViewHolder$observeWidgetStates$1(this.this$0, dVar);
        notificationSubscriptionBannerV3WidgetViewHolder$observeWidgetStates$1.L$0 = obj;
        return notificationSubscriptionBannerV3WidgetViewHolder$observeWidgetStates$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ButtonV3DTO actualButtonDTO;
        NotificationSubscriptionBannerV3View notificationSubscriptionBannerV3View;
        Function1<? super AtomAction, Unit> function1;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        NotificationSubscriptionBannerV3ViewModel.ButtonState buttonState = (NotificationSubscriptionBannerV3ViewModel.ButtonState) this.L$0;
        actualButtonDTO = this.this$0.getActualButtonDTO(buttonState.getSubscribeActionSucceed());
        if (actualButtonDTO != null) {
            NotificationSubscriptionBannerV3WidgetViewHolder notificationSubscriptionBannerV3WidgetViewHolder = this.this$0;
            notificationSubscriptionBannerV3View = notificationSubscriptionBannerV3WidgetViewHolder.containerView;
            boolean isLoading = buttonState.getIsLoading();
            function1 = notificationSubscriptionBannerV3WidgetViewHolder.actionHandler;
            notificationSubscriptionBannerV3View.updateButtonState(actualButtonDTO, isLoading, function1);
        } else {
            Lm0.a.f17149a.e("Кнопка обязательно должна быть", new Object[0]);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NotificationSubscriptionBannerV3ViewModel.ButtonState buttonState, d<? super Unit> dVar) {
        return ((NotificationSubscriptionBannerV3WidgetViewHolder$observeWidgetStates$1) create(buttonState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
