package ru.ozon.app.android.travel.molecules.view.starsBadge.v1;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/animation/ValueAnimator;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class GradientTextView$animator$2 extends AbstractC7737t implements Function0<ValueAnimator> {
    final /* synthetic */ GradientTextView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GradientTextView$animator$2(GradientTextView gradientTextView) {
        super(0);
        this.this$0 = gradientTextView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1$lambda$0(GradientTextView gradientTextView, ValueAnimator valueAnimator) {
        gradientTextView.setGradientProgress(((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ValueAnimator invoke() {
        ValueAnimator valueAnimator = new ValueAnimator();
        final GradientTextView gradientTextView = this.this$0;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.app.android.travel.molecules.view.starsBadge.v1.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                GradientTextView$animator$2.invoke$lambda$1$lambda$0(GradientTextView.this, valueAnimator2);
            }
        });
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setRepeatMode(1);
        valueAnimator.setInterpolator(new LinearInterpolator());
        return valueAnimator;
    }
}
