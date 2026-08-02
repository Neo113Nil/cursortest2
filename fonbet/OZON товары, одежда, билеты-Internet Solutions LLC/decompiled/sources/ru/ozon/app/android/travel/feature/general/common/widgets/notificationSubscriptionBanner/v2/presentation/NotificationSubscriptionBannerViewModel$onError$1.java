package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation;

import Ae.w0;
import Ae.x0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerViewModel;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerViewModel$onError$1", f = "NotificationSubscriptionBannerViewModel.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationSubscriptionBannerViewModel$onError$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ NotificationSubscriptionBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionBannerViewModel$onError$1(NotificationSubscriptionBannerViewModel notificationSubscriptionBannerViewModel, d<? super NotificationSubscriptionBannerViewModel$onError$1> dVar) {
        super(2, dVar);
        this.this$0 = notificationSubscriptionBannerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new NotificationSubscriptionBannerViewModel$onError$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NotificationSubscriptionBannerVO notificationSubscriptionBannerVO;
        w0 w0Var;
        ButtonV3DTO subscribeButton;
        x0 x0Var;
        Object value;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            notificationSubscriptionBannerVO = this.this$0.itemVO;
            if (notificationSubscriptionBannerVO != null && (subscribeButton = notificationSubscriptionBannerVO.getSubscribeButton()) != null) {
                x0Var = this.this$0.widgetStateFlow;
                do {
                    value = x0Var.getValue();
                } while (!x0Var.b(value, new NotificationSubscriptionBannerViewModel.WidgetState(subscribeButton, false, 2, null)));
            }
            w0Var = this.this$0.viewEffects;
            NotificationSubscriptionBannerViewModel.ViewEffect.ShowNetworkError showNetworkError = NotificationSubscriptionBannerViewModel.ViewEffect.ShowNetworkError.INSTANCE;
            this.label = 1;
            if (w0Var.emit(showNetworkError, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((NotificationSubscriptionBannerViewModel$onError$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
