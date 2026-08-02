package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.unsorted.utils.timer.TimerState;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "timerState", "Lru/ozon/app/android/fresh/unsorted/utils/timer/TimerState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$3", f = "DeliveryWidgetV3OverlayViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$3 extends j implements Function2<TimerState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DeliveryWidgetV3OverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$3(DeliveryWidgetV3OverlayViewHolder deliveryWidgetV3OverlayViewHolder, d<? super DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$3> dVar) {
        super(2, dVar);
        this.this$0 = deliveryWidgetV3OverlayViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$3 deliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$3 = new DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$3(this.this$0, dVar);
        deliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$3.L$0 = obj;
        return deliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        DeliveryWidgetV3View containerView;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        TimerState timerState = (TimerState) this.L$0;
        this.this$0.updateTimerDisplay(timerState.getTimeLeftMs());
        containerView = this.this$0.getContainerView();
        if (containerView != null) {
            containerView.setTimerProgress(timerState.getProgressPercent());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TimerState timerState, d<? super Unit> dVar) {
        return ((DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$3) create(timerState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
