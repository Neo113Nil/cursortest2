package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$1", f = "DeliveryWidgetV4OverlayViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class DeliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$1 extends j implements Function2<DeliveryWidgetV4VO, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DeliveryWidgetV4OverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$1(DeliveryWidgetV4OverlayViewHolder deliveryWidgetV4OverlayViewHolder, d<? super DeliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$1> dVar) {
        super(2, dVar);
        this.this$0 = deliveryWidgetV4OverlayViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DeliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$1 deliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$1 = new DeliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$1(this.this$0, dVar);
        deliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$1.L$0 = obj;
        return deliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        DeliveryWidgetV4VO deliveryWidgetV4VO = (DeliveryWidgetV4VO) this.L$0;
        this.this$0.currentTokenizedEvent = deliveryWidgetV4VO.getTokenizedEvent();
        z11 = this.this$0.isFirstBind;
        if (z11) {
            this.this$0.scheduleFirstBind(deliveryWidgetV4VO);
            return Unit.f71690a;
        }
        DeliveryWidgetV4View containerView = this.this$0.getContainerView();
        if (containerView != null) {
            containerView.bind(deliveryWidgetV4VO, false);
        }
        this.this$0.viewModel.scheduleUpdate(deliveryWidgetV4VO);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DeliveryWidgetV4VO deliveryWidgetV4VO, d<? super Unit> dVar) {
        return ((DeliveryWidgetV4OverlayViewHolder$subscribeToWidgetUpdates$1) create(deliveryWidgetV4VO, dVar)).invokeSuspend(Unit.f71690a);
    }
}
