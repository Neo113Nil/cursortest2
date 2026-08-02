package ru.ozon.app.android.pdp.view;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "Lkotlin/jvm/internal/EnhancedNullability;", "onAnimationUpdate"}, k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes13.dex */
public final class ViewExtKt$expandWithAnimation$2$1 implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ View $this_expandWithAnimation;

    public ViewExtKt$expandWithAnimation$2$1(View view) {
        this.$this_expandWithAnimation = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        View view = this.$this_expandWithAnimation;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((Integer) animatedValue).intValue();
        view.setLayoutParams(layoutParams);
    }
}
