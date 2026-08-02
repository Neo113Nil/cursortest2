package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\f\u0010\f\u001a\u00020\u0005*\u00020\tH\u0002J\f\u0010\r\u001a\u00020\u0005*\u00020\tH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5AnimationController;", "", "<init>", "()V", "objectAnimator", "Landroid/animation/ObjectAnimator;", "updateVisibility", "", "view", "Landroid/view/View;", "isVisible", "", "hideWithScrollDownAnimation", "showViewWithScrollUpAnimation", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageButtonV5AnimationController {
    private ObjectAnimator objectAnimator;
    public static final int $stable = 8;

    private final ObjectAnimator hideWithScrollDownAnimation(final View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, view.getHeight());
        Intrinsics.f(ofFloat);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation.HotelsPageButtonV5AnimationController$hideWithScrollDownAnimation$lambda$3$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                view.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(200L);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    private final ObjectAnimator showViewWithScrollUpAnimation(final View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getHeight(), 0.0f);
        Intrinsics.f(ofFloat);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation.HotelsPageButtonV5AnimationController$showViewWithScrollUpAnimation$lambda$5$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
                view.setTranslationY(r2.getHeight());
                view.setVisibility(0);
            }
        });
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(200L);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    public final void updateVisibility(@NotNull View view, boolean isVisible) {
        ObjectAnimator hideWithScrollDownAnimation;
        ObjectAnimator objectAnimator;
        Intrinsics.checkNotNullParameter(view, "view");
        if (isVisible != (view.getVisibility() == 0)) {
            ObjectAnimator objectAnimator2 = this.objectAnimator;
            if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.objectAnimator) != null) {
                objectAnimator.end();
            }
            if (isVisible) {
                hideWithScrollDownAnimation = showViewWithScrollUpAnimation(view);
                hideWithScrollDownAnimation.start();
            } else {
                hideWithScrollDownAnimation = hideWithScrollDownAnimation(view);
                hideWithScrollDownAnimation.start();
            }
            this.objectAnimator = hideWithScrollDownAnimation;
        }
    }
}
