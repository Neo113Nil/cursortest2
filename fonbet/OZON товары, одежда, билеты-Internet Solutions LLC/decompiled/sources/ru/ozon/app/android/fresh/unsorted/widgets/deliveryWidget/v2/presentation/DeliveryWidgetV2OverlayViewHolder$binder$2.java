package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation;

import WZ.l;
import WZ.m;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.unsorted.databinding.DeliveryWidgetV2Binding;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.DeliveryWidgetV2AnimationDelegate;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.DeliveryWidgetV2Binder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/utils/DeliveryWidgetV2Binder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DeliveryWidgetV2OverlayViewHolder$binder$2 extends AbstractC7737t implements Function0<DeliveryWidgetV2Binder> {
    final /* synthetic */ DeliveryWidgetV2Binding $binding;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ DeliveryWidgetV2OverlayViewHolder this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2OverlayViewHolder$binder$2$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7719a implements Function1<t, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, m.class, "processViewEvents", "processViewEvents(Lru/ozon/composer/analytics/tokenized/TokenizedAnalytics;Lru/ozon/composer/analytics/tokenized/TokenizedEvent;Lru/ozon/composer/analytics/tokenized/CustomParamsModifier;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t tVar) {
            invoke2(tVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            m.c((l) this.receiver, p02, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2OverlayViewHolder$binder$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<AtomAction, Unit> {
        final /* synthetic */ DeliveryWidgetV2OverlayViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(DeliveryWidgetV2OverlayViewHolder deliveryWidgetV2OverlayViewHolder) {
            super(1);
            this.this$0 = deliveryWidgetV2OverlayViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
            invoke2(atomAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction action) {
            Function1 actionHandler;
            DeliveryWidgetV2AnimationDelegate animationDelegate;
            Intrinsics.checkNotNullParameter(action, "action");
            actionHandler = this.this$0.getActionHandler();
            actionHandler.invoke(action);
            if (action instanceof AtomAction.OpenComposerNestedPage) {
                return;
            }
            animationDelegate = this.this$0.getAnimationDelegate();
            animationDelegate.disappear();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV2OverlayViewHolder$binder$2(DeliveryWidgetV2Binding deliveryWidgetV2Binding, l lVar, DeliveryWidgetV2OverlayViewHolder deliveryWidgetV2OverlayViewHolder) {
        super(0);
        this.$binding = deliveryWidgetV2Binding;
        this.$tokenizedAnalytics = lVar;
        this.this$0 = deliveryWidgetV2OverlayViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DeliveryWidgetV2Binder invoke() {
        return new DeliveryWidgetV2Binder(this.$binding, new AnonymousClass1(this.$tokenizedAnalytics), new AnonymousClass2(this.this$0));
    }
}
