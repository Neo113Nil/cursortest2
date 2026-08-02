package ru.ozon.app.android.cscore.orderTracking.viewmodels;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.csma.orderTracking.data.OrderTrackingV4DTO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cscore.orderTracking.viewmodels.OrderTrackingV4ViewModel$updateOrderTracking$1", f = "OrderTrackingV4ViewModel.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OrderTrackingV4ViewModel$updateOrderTracking$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $updateActionName;
    int label;
    final /* synthetic */ OrderTrackingV4ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderTrackingV4ViewModel$updateOrderTracking$1(OrderTrackingV4ViewModel orderTrackingV4ViewModel, String str, d<? super OrderTrackingV4ViewModel$updateOrderTracking$1> dVar) {
        super(2, dVar);
        this.this$0 = orderTrackingV4ViewModel;
        this.$updateActionName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OrderTrackingV4ViewModel$updateOrderTracking$1(this.this$0, this.$updateActionName, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Object data;
        SingleLiveEvent singleLiveEvent;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                actionV2Repository = this.this$0.actionV2Repository;
                ActionV2Request actionV2Request = new ActionV2Request(null, this.$updateActionName, false, 5, null);
                this.label = 1;
                obj = actionV2Repository.callActionSuspend(actionV2Request, OrderTrackingV4DTO.class, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            data = ((ActionV2Response) obj).getData();
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
        }
        if (data == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        singleLiveEvent = this.this$0._updateOrderTrackingObserver;
        singleLiveEvent.postValue((OrderTrackingV4DTO) data);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OrderTrackingV4ViewModel$updateOrderTracking$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
