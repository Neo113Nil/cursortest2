package ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation;

import android.animation.ValueAnimator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetBottomCartBinding;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class BottomCartWidgetViewHolder$translationXListener$2 extends AbstractC7737t implements Function0<ValueAnimator.AnimatorUpdateListener> {
    final /* synthetic */ BottomCartWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BottomCartWidgetViewHolder$translationXListener$2(BottomCartWidgetViewHolder bottomCartWidgetViewHolder) {
        super(0);
        this.this$0 = bottomCartWidgetViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(BottomCartWidgetViewHolder bottomCartWidgetViewHolder, ValueAnimator valueAnimator) {
        WidgetBottomCartBinding widgetBottomCartBinding;
        float floatValue = ((Float) Bi.a.b(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        widgetBottomCartBinding = bottomCartWidgetViewHolder.binding;
        widgetBottomCartBinding.cartButton.setTranslationX(floatValue);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ValueAnimator.AnimatorUpdateListener invoke() {
        final BottomCartWidgetViewHolder bottomCartWidgetViewHolder = this.this$0;
        return new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BottomCartWidgetViewHolder$translationXListener$2.invoke$lambda$0(BottomCartWidgetViewHolder.this, valueAnimator);
            }
        };
    }
}
