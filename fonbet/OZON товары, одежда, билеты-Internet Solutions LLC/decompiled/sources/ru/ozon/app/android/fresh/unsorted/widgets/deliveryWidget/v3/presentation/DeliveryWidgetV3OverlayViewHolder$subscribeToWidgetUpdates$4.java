package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isFinished", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$4", f = "DeliveryWidgetV3OverlayViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$4 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ DeliveryWidgetV3OverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$4(DeliveryWidgetV3OverlayViewHolder deliveryWidgetV3OverlayViewHolder, d<? super DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$4> dVar) {
        super(2, dVar);
        this.this$0 = deliveryWidgetV3OverlayViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$4 deliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$4 = new DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$4(this.this$0, dVar);
        deliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$4.Z$0 = ((Boolean) obj).booleanValue();
        return deliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1 actionHandler;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        boolean z11 = this.Z$0;
        DeliveryWidgetV3VO deliveryWidgetV3VO = (DeliveryWidgetV3VO) this.this$0.getBoundData();
        if (deliveryWidgetV3VO == null) {
            return Unit.f71690a;
        }
        if (z11) {
            actionHandler = this.this$0.getActionHandler();
            actionHandler.invoke(deliveryWidgetV3VO.getAction());
        }
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((DeliveryWidgetV3OverlayViewHolder$subscribeToWidgetUpdates$4) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
