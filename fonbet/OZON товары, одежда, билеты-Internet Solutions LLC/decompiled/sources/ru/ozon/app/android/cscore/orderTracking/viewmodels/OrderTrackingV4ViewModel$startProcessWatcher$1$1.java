package ru.ozon.app.android.cscore.orderTracking.viewmodels;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.csma.orderTracking.data.BarcodeTimerManager;
import ru.ozon.app.android.csma.orderTracking.utils.ProcessLifecyclePublisher;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/csma/orderTracking/utils/ProcessLifecyclePublisher$PreviousAndCurrentProcessState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cscore.orderTracking.viewmodels.OrderTrackingV4ViewModel$startProcessWatcher$1$1", f = "OrderTrackingV4ViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class OrderTrackingV4ViewModel$startProcessWatcher$1$1 extends j implements Function2<ProcessLifecyclePublisher.PreviousAndCurrentProcessState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OrderTrackingV4ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderTrackingV4ViewModel$startProcessWatcher$1$1(OrderTrackingV4ViewModel orderTrackingV4ViewModel, d<? super OrderTrackingV4ViewModel$startProcessWatcher$1$1> dVar) {
        super(2, dVar);
        this.this$0 = orderTrackingV4ViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        OrderTrackingV4ViewModel$startProcessWatcher$1$1 orderTrackingV4ViewModel$startProcessWatcher$1$1 = new OrderTrackingV4ViewModel$startProcessWatcher$1$1(this.this$0, dVar);
        orderTrackingV4ViewModel$startProcessWatcher$1$1.L$0 = obj;
        return orderTrackingV4ViewModel$startProcessWatcher$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ProcessLifecyclePublisher.PreviousAndCurrentProcessState previousAndCurrentProcessState = (ProcessLifecyclePublisher.PreviousAndCurrentProcessState) this.L$0;
        if (previousAndCurrentProcessState.isFromBackground()) {
            BarcodeTimerManager.DefaultImpls.restartTimer$default(this.this$0.getBarcodeTimerManager(), false, 1, null);
        } else if (previousAndCurrentProcessState.isFromForeground()) {
            this.this$0.getBarcodeTimerManager().pauseTimer();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProcessLifecyclePublisher.PreviousAndCurrentProcessState previousAndCurrentProcessState, d<? super Unit> dVar) {
        return ((OrderTrackingV4ViewModel$startProcessWatcher$1$1) create(previousAndCurrentProcessState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
