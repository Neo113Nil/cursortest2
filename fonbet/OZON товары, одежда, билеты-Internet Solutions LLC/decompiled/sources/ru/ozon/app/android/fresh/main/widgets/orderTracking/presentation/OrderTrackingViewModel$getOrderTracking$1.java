package ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.api.OrderTrackingApi;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation.OrderTrackingViewModel$getOrderTracking$1", f = "OrderTrackingViewModel.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class OrderTrackingViewModel$getOrderTracking$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ OrderTrackingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderTrackingViewModel$getOrderTracking$1(OrderTrackingViewModel orderTrackingViewModel, d<? super OrderTrackingViewModel$getOrderTracking$1> dVar) {
        super(2, dVar);
        this.this$0 = orderTrackingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OrderTrackingViewModel$getOrderTracking$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        OrderTrackingApi orderTrackingApi;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                orderTrackingApi = this.this$0.orderTrackingApi;
                this.label = 1;
                obj = orderTrackingApi.getOrderTracking(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            this.this$0.getState().onNext((ActionV2Response) obj);
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OrderTrackingViewModel$getOrderTracking$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
