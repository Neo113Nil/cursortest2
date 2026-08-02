package ru.ozon.app.android.select.feature.entry.splash.view;

import android.animation.ValueAnimator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class RadialGradientView$startAnimation$2 extends AbstractC7737t implements Function1<ValueAnimator, Unit> {
    final /* synthetic */ RadialGradientView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RadialGradientView$startAnimation$2(RadialGradientView radialGradientView) {
        super(1);
        this.this$0 = radialGradientView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ValueAnimator valueAnimator) {
        invoke2(valueAnimator);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        RadialGradientView radialGradientView = this.this$0;
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        radialGradientView.currentAlpha = ((Float) animatedValue).floatValue();
        this.this$0.invalidate();
    }
}
