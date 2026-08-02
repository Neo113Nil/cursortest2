package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2ViewModel;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.DeliveryWidgetV2AnimationDelegate;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2ViewModel$DeliveryWidgetAction;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2OverlayViewHolder$onWidgetCreated$1", f = "DeliveryWidgetV2OverlayViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class DeliveryWidgetV2OverlayViewHolder$onWidgetCreated$1 extends j implements Function2<DeliveryWidgetV2ViewModel.DeliveryWidgetAction, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DeliveryWidgetV2OverlayViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2OverlayViewHolder$onWidgetCreated$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ DeliveryWidgetV2ViewModel.DeliveryWidgetAction $action;
        final /* synthetic */ DeliveryWidgetV2OverlayViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DeliveryWidgetV2OverlayViewHolder deliveryWidgetV2OverlayViewHolder, DeliveryWidgetV2ViewModel.DeliveryWidgetAction deliveryWidgetAction) {
            super(0);
            this.this$0 = deliveryWidgetV2OverlayViewHolder;
            this.$action = deliveryWidgetAction;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.rebind(((DeliveryWidgetV2ViewModel.DeliveryWidgetAction.ShowAction) this.$action).getValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV2OverlayViewHolder$onWidgetCreated$1(DeliveryWidgetV2OverlayViewHolder deliveryWidgetV2OverlayViewHolder, d<? super DeliveryWidgetV2OverlayViewHolder$onWidgetCreated$1> dVar) {
        super(2, dVar);
        this.this$0 = deliveryWidgetV2OverlayViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DeliveryWidgetV2OverlayViewHolder$onWidgetCreated$1 deliveryWidgetV2OverlayViewHolder$onWidgetCreated$1 = new DeliveryWidgetV2OverlayViewHolder$onWidgetCreated$1(this.this$0, dVar);
        deliveryWidgetV2OverlayViewHolder$onWidgetCreated$1.L$0 = obj;
        return deliveryWidgetV2OverlayViewHolder$onWidgetCreated$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        DeliveryWidgetV2AnimationDelegate animationDelegate;
        DeliveryWidgetV2AnimationDelegate animationDelegate2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        DeliveryWidgetV2ViewModel.DeliveryWidgetAction deliveryWidgetAction = (DeliveryWidgetV2ViewModel.DeliveryWidgetAction) this.L$0;
        if (deliveryWidgetAction instanceof DeliveryWidgetV2ViewModel.DeliveryWidgetAction.ShowAction) {
            animationDelegate2 = this.this$0.getAnimationDelegate();
            animationDelegate2.show(((DeliveryWidgetV2ViewModel.DeliveryWidgetAction.ShowAction) deliveryWidgetAction).getValue().getLifetimeSeconds(), new AnonymousClass1(this.this$0, deliveryWidgetAction));
        } else if (deliveryWidgetAction instanceof DeliveryWidgetV2ViewModel.DeliveryWidgetAction.CurtainAction) {
            this.this$0.handleCurtainAction(((DeliveryWidgetV2ViewModel.DeliveryWidgetAction.CurtainAction) deliveryWidgetAction).getValue());
        } else {
            animationDelegate = this.this$0.getAnimationDelegate();
            DeliveryWidgetV2AnimationDelegate.animateDisappear$default(animationDelegate, 0L, 1, null);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DeliveryWidgetV2ViewModel.DeliveryWidgetAction deliveryWidgetAction, d<? super Unit> dVar) {
        return ((DeliveryWidgetV2OverlayViewHolder$onWidgetCreated$1) create(deliveryWidgetAction, dVar)).invokeSuspend(Unit.f71690a);
    }
}
