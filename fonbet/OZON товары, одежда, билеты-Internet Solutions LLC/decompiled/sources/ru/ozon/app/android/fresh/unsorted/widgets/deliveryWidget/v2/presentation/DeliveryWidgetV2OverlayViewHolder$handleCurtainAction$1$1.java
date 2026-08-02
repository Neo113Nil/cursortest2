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
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2VO;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.DeliveryWidgetV2AnimationDelegate;
import xe.B0;
import xe.C10727i;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DeliveryWidgetV2OverlayViewHolder$handleCurtainAction$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ DeliveryWidgetV2VO.SellerVOWidget $vo;
    final /* synthetic */ DeliveryWidgetV2OverlayViewHolder this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2OverlayViewHolder$handleCurtainAction$1$1$1", f = "DeliveryWidgetV2OverlayViewHolder.kt", l = {134}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2OverlayViewHolder$handleCurtainAction$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ DeliveryWidgetV2VO.SellerVOWidget $vo;
        int label;
        final /* synthetic */ DeliveryWidgetV2OverlayViewHolder this$0;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2OverlayViewHolder$handleCurtainAction$1$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C17801 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ DeliveryWidgetV2VO.SellerVOWidget $vo;
            final /* synthetic */ DeliveryWidgetV2OverlayViewHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17801(DeliveryWidgetV2OverlayViewHolder deliveryWidgetV2OverlayViewHolder, DeliveryWidgetV2VO.SellerVOWidget sellerVOWidget) {
                super(0);
                this.this$0 = deliveryWidgetV2OverlayViewHolder;
                this.$vo = sellerVOWidget;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.rebind(this.$vo);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DeliveryWidgetV2OverlayViewHolder deliveryWidgetV2OverlayViewHolder, DeliveryWidgetV2VO.SellerVOWidget sellerVOWidget, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = deliveryWidgetV2OverlayViewHolder;
            this.$vo = sellerVOWidget;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$vo, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            DeliveryWidgetV2AnimationDelegate animationDelegate;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                this.label = 1;
                if (Y.b(800L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            animationDelegate = this.this$0.getAnimationDelegate();
            animationDelegate.show(this.$vo.getLifetimeSeconds(), new C17801(this.this$0, this.$vo));
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV2OverlayViewHolder$handleCurtainAction$1$1(DeliveryWidgetV2OverlayViewHolder deliveryWidgetV2OverlayViewHolder, DeliveryWidgetV2VO.SellerVOWidget sellerVOWidget) {
        super(0);
        this.this$0 = deliveryWidgetV2OverlayViewHolder;
        this.$vo = sellerVOWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        B0 b02;
        M m11;
        b02 = this.this$0.curtainListenerJob;
        if (b02 != null) {
            b02.j(null);
        }
        DeliveryWidgetV2OverlayViewHolder deliveryWidgetV2OverlayViewHolder = this.this$0;
        m11 = deliveryWidgetV2OverlayViewHolder.coroutineScope;
        deliveryWidgetV2OverlayViewHolder.curtainListenerJob = C10727i.c(m11, null, null, new AnonymousClass1(this.this$0, this.$vo, null), 3);
    }
}
