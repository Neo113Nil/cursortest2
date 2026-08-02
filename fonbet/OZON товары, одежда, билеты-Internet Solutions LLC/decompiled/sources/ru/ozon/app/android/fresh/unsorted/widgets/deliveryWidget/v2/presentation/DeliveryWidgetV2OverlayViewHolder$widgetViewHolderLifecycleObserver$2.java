package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.DeliveryWidgetV2AnimationDelegate;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "ru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2OverlayViewHolder$widgetViewHolderLifecycleObserver$2$1", "invoke", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2OverlayViewHolder$widgetViewHolderLifecycleObserver$2$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DeliveryWidgetV2OverlayViewHolder$widgetViewHolderLifecycleObserver$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    final /* synthetic */ DeliveryWidgetV2OverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV2OverlayViewHolder$widgetViewHolderLifecycleObserver$2(DeliveryWidgetV2OverlayViewHolder deliveryWidgetV2OverlayViewHolder) {
        super(0);
        this.this$0 = deliveryWidgetV2OverlayViewHolder;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2OverlayViewHolder$widgetViewHolderLifecycleObserver$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        final DeliveryWidgetV2OverlayViewHolder deliveryWidgetV2OverlayViewHolder = this.this$0;
        return new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2OverlayViewHolder$widgetViewHolderLifecycleObserver$2.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(J owner) {
                DeliveryWidgetV2AnimationDelegate animationDelegate;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onPause(owner);
                animationDelegate = DeliveryWidgetV2OverlayViewHolder.this.getAnimationDelegate();
                animationDelegate.pause();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                DeliveryWidgetV2AnimationDelegate animationDelegate;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onResume(owner);
                animationDelegate = DeliveryWidgetV2OverlayViewHolder.this.getAnimationDelegate();
                animationDelegate.resume();
            }
        };
    }
}
