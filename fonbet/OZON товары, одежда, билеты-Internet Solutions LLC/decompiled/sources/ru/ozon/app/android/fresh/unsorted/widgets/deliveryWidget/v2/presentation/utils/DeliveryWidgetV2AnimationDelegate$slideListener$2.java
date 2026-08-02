package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DeliveryWidgetV2AnimationDelegate$slideListener$2 extends AbstractC7737t implements Function0<ValueAnimator.AnimatorUpdateListener> {
    final /* synthetic */ DeliveryWidgetV2AnimationDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV2AnimationDelegate$slideListener$2(DeliveryWidgetV2AnimationDelegate deliveryWidgetV2AnimationDelegate) {
        super(0);
        this.this$0 = deliveryWidgetV2AnimationDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(DeliveryWidgetV2AnimationDelegate deliveryWidgetV2AnimationDelegate, ValueAnimator valueAnimator) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        int intValue = ((Integer) Bi.a.b(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
        constraintLayout = deliveryWidgetV2AnimationDelegate.root;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        layoutParams.height = intValue;
        constraintLayout2 = deliveryWidgetV2AnimationDelegate.root;
        constraintLayout2.setLayoutParams(layoutParams);
        constraintLayout3 = deliveryWidgetV2AnimationDelegate.root;
        constraintLayout3.setVisibility(intValue != 0 ? 0 : 8);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ValueAnimator.AnimatorUpdateListener invoke() {
        final DeliveryWidgetV2AnimationDelegate deliveryWidgetV2AnimationDelegate = this.this$0;
        return new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DeliveryWidgetV2AnimationDelegate$slideListener$2.invoke$lambda$0(DeliveryWidgetV2AnimationDelegate.this, valueAnimator);
            }
        };
    }
}
