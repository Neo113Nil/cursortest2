package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky;

import TM.b;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky.HotelsGalleryFiltersAnimator;
import ru.ozon.app.android.uikit.utils.FigmaInterpolator;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/sticky/HotelsGalleryFiltersAnimator;", "", "view", "Landroid/view/View;", "getTargetHeight", "Lkotlin/Function0;", "", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "currentAnimator", "Landroid/animation/ValueAnimator;", "animateAppearance", "", "isInstant", "", "animateDisappearance", "cancel", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFiltersAnimator {
    private ValueAnimator currentAnimator;

    @NotNull
    private final Function0<Integer> getTargetHeight;

    @NotNull
    private final View view;

    public HotelsGalleryFiltersAnimator(@NotNull View view, @NotNull Function0<Integer> getTargetHeight) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(getTargetHeight, "getTargetHeight");
        this.view = view;
        this.getTargetHeight = getTargetHeight;
    }

    public static /* synthetic */ void animateAppearance$default(HotelsGalleryFiltersAnimator hotelsGalleryFiltersAnimator, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        hotelsGalleryFiltersAnimator.animateAppearance(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateAppearance$lambda$5$lambda$2(HotelsGalleryFiltersAnimator hotelsGalleryFiltersAnimator, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        View view = hotelsGalleryFiltersAnimator.view;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((Integer) animatedValue).intValue();
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDisappearance$lambda$10$lambda$7(HotelsGalleryFiltersAnimator hotelsGalleryFiltersAnimator, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        View view = hotelsGalleryFiltersAnimator.view;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((Integer) animatedValue).intValue();
        view.setLayoutParams(layoutParams);
    }

    public final void animateAppearance(boolean isInstant) {
        int intValue;
        cancel();
        if ((this.view.getVisibility() != 0 || this.view.getHeight() <= 0) && (intValue = this.getTargetHeight.invoke().intValue()) > 0) {
            long j11 = isInstant ? 0L : 250L;
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = 0;
            view.setLayoutParams(layoutParams);
            this.view.setVisibility(0);
            ValueAnimator ofInt = ValueAnimator.ofInt(0, intValue);
            ofInt.setInterpolator(FigmaInterpolator.INSTANCE.getEaseIn());
            ofInt.setDuration(j11);
            ofInt.addUpdateListener(new b(this, 1));
            ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky.HotelsGalleryFiltersAnimator$animateAppearance$lambda$5$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
                    View view2;
                    view2 = HotelsGalleryFiltersAnimator.this.view;
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams2.height = -2;
                    view2.setLayoutParams(layoutParams2);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator) {
                }
            });
            ofInt.start();
            this.currentAnimator = ofInt;
        }
    }

    public final void animateDisappearance() {
        cancel();
        if (this.view.getVisibility() != 0 || this.view.getHeight() == 0) {
            this.view.setVisibility(8);
            return;
        }
        int height = this.view.getHeight();
        if (height <= 0) {
            this.view.setVisibility(8);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(height, 0);
        ofInt.setInterpolator(FigmaInterpolator.INSTANCE.getEaseOut());
        ofInt.setDuration(250L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fS.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                HotelsGalleryFiltersAnimator.animateDisappearance$lambda$10$lambda$7(HotelsGalleryFiltersAnimator.this, valueAnimator);
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky.HotelsGalleryFiltersAnimator$animateDisappearance$lambda$10$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                View view;
                View view2;
                view = HotelsGalleryFiltersAnimator.this.view;
                view.setVisibility(8);
                view2 = HotelsGalleryFiltersAnimator.this.view;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = -2;
                view2.setLayoutParams(layoutParams);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        ofInt.start();
        this.currentAnimator = ofInt;
    }

    public final void cancel() {
        ValueAnimator valueAnimator = this.currentAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.currentAnimator = null;
    }
}
