package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3VO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$1", f = "DeliveryWidgetV3OverlayViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$1 extends j implements Function2<DeliveryWidgetV3VO, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DeliveryWidgetV3OverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$1(DeliveryWidgetV3OverlayViewHolder deliveryWidgetV3OverlayViewHolder, d<? super DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$1> dVar) {
        super(2, dVar);
        this.this$0 = deliveryWidgetV3OverlayViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$1 deliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$1 = new DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$1(this.this$0, dVar);
        deliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$1.L$0 = obj;
        return deliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        DeliveryWidgetV3ViewModel deliveryWidgetV3ViewModel;
        DeliveryWidgetV3View containerView;
        DeliveryWidgetV3ViewModel deliveryWidgetV3ViewModel2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        DeliveryWidgetV3VO deliveryWidgetV3VO = (DeliveryWidgetV3VO) this.L$0;
        deliveryWidgetV3ViewModel = this.this$0.viewModel;
        if (deliveryWidgetV3ViewModel.isTimerModeActive$widgets_unsorted_prodGoogleAllVendorsRelease() && deliveryWidgetV3VO.getTimerDeadline() == null) {
            return Unit.f71690a;
        }
        containerView = this.this$0.getContainerView();
        if (containerView != null) {
            containerView.bind(deliveryWidgetV3VO);
        }
        deliveryWidgetV3ViewModel2 = this.this$0.viewModel;
        deliveryWidgetV3ViewModel2.scheduleUpdate(deliveryWidgetV3VO);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DeliveryWidgetV3VO deliveryWidgetV3VO, d<? super Unit> dVar) {
        return ((DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$1) create(deliveryWidgetV3VO, dVar)).invokeSuspend(Unit.f71690a);
    }
}
