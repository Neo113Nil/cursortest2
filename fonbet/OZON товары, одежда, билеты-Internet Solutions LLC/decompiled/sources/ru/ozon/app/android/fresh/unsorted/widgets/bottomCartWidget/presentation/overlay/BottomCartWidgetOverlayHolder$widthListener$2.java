package ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.overlay;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetBottomCartBinding;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class BottomCartWidgetOverlayHolder$widthListener$2 extends AbstractC7737t implements Function0<ValueAnimator.AnimatorUpdateListener> {
    final /* synthetic */ BottomCartWidgetOverlayHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BottomCartWidgetOverlayHolder$widthListener$2(BottomCartWidgetOverlayHolder bottomCartWidgetOverlayHolder) {
        super(0);
        this.this$0 = bottomCartWidgetOverlayHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(BottomCartWidgetOverlayHolder bottomCartWidgetOverlayHolder, ValueAnimator valueAnimator) {
        WidgetBottomCartBinding widgetBottomCartBinding;
        int intValue = ((Integer) Bi.a.b(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
        widgetBottomCartBinding = bottomCartWidgetOverlayHolder.binding;
        ButtonV3View catalogButton = widgetBottomCartBinding.catalogButton;
        Intrinsics.checkNotNullExpressionValue(catalogButton, "catalogButton");
        ViewGroup.LayoutParams layoutParams = catalogButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = intValue;
        catalogButton.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ValueAnimator.AnimatorUpdateListener invoke() {
        final BottomCartWidgetOverlayHolder bottomCartWidgetOverlayHolder = this.this$0;
        return new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.overlay.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BottomCartWidgetOverlayHolder$widthListener$2.invoke$lambda$1(BottomCartWidgetOverlayHolder.this, valueAnimator);
            }
        };
    }
}
