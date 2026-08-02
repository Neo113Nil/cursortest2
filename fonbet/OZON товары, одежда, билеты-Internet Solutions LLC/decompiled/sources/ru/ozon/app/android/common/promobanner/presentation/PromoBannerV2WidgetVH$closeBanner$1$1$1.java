package ru.ozon.app.android.common.promobanner.presentation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.ui.promobanner.databinding.WidgetPromoBannerV2Binding;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class PromoBannerV2WidgetVH$closeBanner$1$1$1 extends AbstractC7737t implements Function1<Animator, Unit> {
    final /* synthetic */ int $originalHeight;
    final /* synthetic */ ViewPropertyAnimator $this_apply;
    final /* synthetic */ WidgetPromoBannerV2Binding $this_with;
    final /* synthetic */ PromoBannerV2WidgetVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoBannerV2WidgetVH$closeBanner$1$1$1(ViewPropertyAnimator viewPropertyAnimator, int i11, PromoBannerV2WidgetVH promoBannerV2WidgetVH, WidgetPromoBannerV2Binding widgetPromoBannerV2Binding) {
        super(1);
        this.$this_apply = viewPropertyAnimator;
        this.$originalHeight = i11;
        this.this$0 = promoBannerV2WidgetVH;
        this.$this_with = widgetPromoBannerV2Binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(int i11, PromoBannerV2WidgetVH promoBannerV2WidgetVH, WidgetPromoBannerV2Binding widgetPromoBannerV2Binding, ValueAnimator it) {
        int minHeight;
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        int floatValue = (int) ((1 - ((Float) animatedValue).floatValue()) * i11);
        minHeight = promoBannerV2WidgetVH.minHeight();
        if (floatValue < minHeight) {
            floatValue = minHeight;
        }
        FrameLayout bannerWrapper = widgetPromoBannerV2Binding.bannerWrapper;
        Intrinsics.checkNotNullExpressionValue(bannerWrapper, "bannerWrapper");
        ViewGroup.LayoutParams layoutParams = bannerWrapper.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = floatValue;
        bannerWrapper.setLayoutParams(layoutParams);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
        invoke2(animator);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Animator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ViewPropertyAnimator viewPropertyAnimator = this.$this_apply;
        final int i11 = this.$originalHeight;
        final PromoBannerV2WidgetVH promoBannerV2WidgetVH = this.this$0;
        final WidgetPromoBannerV2Binding widgetPromoBannerV2Binding = this.$this_with;
        viewPropertyAnimator.setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.app.android.common.promobanner.presentation.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PromoBannerV2WidgetVH$closeBanner$1$1$1.invoke$lambda$1(i11, promoBannerV2WidgetVH, widgetPromoBannerV2Binding, valueAnimator);
            }
        });
    }
}
