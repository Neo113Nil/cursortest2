package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation;

import A00.a;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "it", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$3", f = "DeliveryWidgetV4OverlayViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class DeliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$3 extends j implements Function2<a, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ DeliveryWidgetV4OverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$3(DeliveryWidgetV4OverlayViewHolder deliveryWidgetV4OverlayViewHolder, d<? super DeliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$3> dVar) {
        super(2, dVar);
        this.this$0 = deliveryWidgetV4OverlayViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new DeliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$3(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, d<? super Unit> dVar) {
        return ((DeliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$3) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        DeliveryWidgetV4VO deliveryWidgetV4VO = (DeliveryWidgetV4VO) this.this$0.getBoundData();
        if (deliveryWidgetV4VO != null) {
            this.this$0.viewModel.scheduleUpdate(deliveryWidgetV4VO);
        }
        return Unit.f71690a;
    }
}
