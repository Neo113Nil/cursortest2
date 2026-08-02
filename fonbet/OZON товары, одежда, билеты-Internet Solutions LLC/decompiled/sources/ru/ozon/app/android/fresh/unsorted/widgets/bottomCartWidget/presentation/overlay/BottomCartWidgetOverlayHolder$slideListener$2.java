package ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.overlay;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetBottomCartBinding;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class BottomCartWidgetOverlayHolder$slideListener$2 extends AbstractC7737t implements Function0<ValueAnimator.AnimatorUpdateListener> {
    final /* synthetic */ BottomCartWidgetOverlayHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BottomCartWidgetOverlayHolder$slideListener$2(BottomCartWidgetOverlayHolder bottomCartWidgetOverlayHolder) {
        super(0);
        this.this$0 = bottomCartWidgetOverlayHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(BottomCartWidgetOverlayHolder bottomCartWidgetOverlayHolder, ValueAnimator valueAnimator) {
        WidgetBottomCartBinding widgetBottomCartBinding;
        WidgetBottomCartBinding widgetBottomCartBinding2;
        WidgetBottomCartBinding widgetBottomCartBinding3;
        int intValue = ((Integer) Bi.a.b(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
        widgetBottomCartBinding = bottomCartWidgetOverlayHolder.binding;
        ViewGroup.LayoutParams layoutParams = widgetBottomCartBinding.bottomCartLayout.getLayoutParams();
        layoutParams.height = intValue;
        widgetBottomCartBinding2 = bottomCartWidgetOverlayHolder.binding;
        widgetBottomCartBinding2.bottomCartLayout.setLayoutParams(layoutParams);
        widgetBottomCartBinding3 = bottomCartWidgetOverlayHolder.binding;
        ConstraintLayout bottomCartLayout = widgetBottomCartBinding3.bottomCartLayout;
        Intrinsics.checkNotNullExpressionValue(bottomCartLayout, "bottomCartLayout");
        bottomCartLayout.setVisibility(intValue != 0 ? 0 : 8);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ValueAnimator.AnimatorUpdateListener invoke() {
        final BottomCartWidgetOverlayHolder bottomCartWidgetOverlayHolder = this.this$0;
        return new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.overlay.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BottomCartWidgetOverlayHolder$slideListener$2.invoke$lambda$0(BottomCartWidgetOverlayHolder.this, valueAnimator);
            }
        };
    }
}
