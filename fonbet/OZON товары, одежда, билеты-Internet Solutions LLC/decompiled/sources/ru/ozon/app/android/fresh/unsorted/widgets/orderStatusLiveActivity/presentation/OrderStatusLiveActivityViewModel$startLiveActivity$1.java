package ru.ozon.app.android.fresh.unsorted.widgets.orderStatusLiveActivity.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.push.OzonPushManager;
import xe.M;
import xe.U;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.orderStatusLiveActivity.presentation.OrderStatusLiveActivityViewModel$startLiveActivity$1", f = "OrderStatusLiveActivityViewModel.kt", l = {15}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class OrderStatusLiveActivityViewModel$startLiveActivity$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $orderId;
    final /* synthetic */ String $widgetName;
    int label;
    final /* synthetic */ OrderStatusLiveActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderStatusLiveActivityViewModel$startLiveActivity$1(OrderStatusLiveActivityViewModel orderStatusLiveActivityViewModel, String str, String str2, d<? super OrderStatusLiveActivityViewModel$startLiveActivity$1> dVar) {
        super(2, dVar);
        this.this$0 = orderStatusLiveActivityViewModel;
        this.$widgetName = str;
        this.$orderId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OrderStatusLiveActivityViewModel$startLiveActivity$1(this.this$0, this.$widgetName, this.$orderId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        OzonPushManager ozonPushManager;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ozonPushManager = this.this$0.ozonPushManager;
            U<Unit> a11 = ozonPushManager.getLiveActivityInteractor().a(this.$widgetName, kotlin.collections.U.i(new Pair("orderId", this.$orderId)));
            this.label = 1;
            if (a11.s(this) == aVar) {
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
        return ((OrderStatusLiveActivityViewModel$startLiveActivity$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
