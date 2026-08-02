package ru.ozon.app.android.product.addToCart.presentation.likezone;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.addToCart.presentation.likezone.AddToFamilyCartButtonView;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "invoke", "()Landroid/animation/ValueAnimator;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AddToCartContainerView$offsetAnimatorToMax$2 extends AbstractC7737t implements Function0<ValueAnimator> {
    final /* synthetic */ AddToCartContainerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartContainerView$offsetAnimatorToMax$2(AddToCartContainerView addToCartContainerView) {
        super(0);
        this.this$0 = addToCartContainerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$0(AddToCartContainerView addToCartContainerView, ValueAnimator valueAnimator) {
        AddToFamilyCartButtonView addToFamilyCartBtn;
        AddToFamilyCartButtonView addToFamilyCartBtn2;
        int intValue = ((Integer) Bi.a.b(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
        addToFamilyCartBtn = addToCartContainerView.getAddToFamilyCartBtn();
        addToFamilyCartBtn.getAnimationParams().setRightBorderOffset(intValue);
        addToFamilyCartBtn2 = addToCartContainerView.getAddToFamilyCartBtn();
        addToFamilyCartBtn2.invalidate();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ValueAnimator invoke() {
        int maxOffset;
        maxOffset = this.this$0.getMaxOffset();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, maxOffset);
        final AddToCartContainerView addToCartContainerView = this.this$0;
        ofInt.setDuration(300L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.app.android.product.addToCart.presentation.likezone.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AddToCartContainerView$offsetAnimatorToMax$2.invoke$lambda$2$lambda$0(AddToCartContainerView.this, valueAnimator);
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerView$offsetAnimatorToMax$2$invoke$lambda$2$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                AddToFamilyCartButtonView addToFamilyCartBtn;
                int maxOffset2;
                AddToFamilyCartButtonView addToFamilyCartBtn2;
                addToFamilyCartBtn = AddToCartContainerView.this.getAddToFamilyCartBtn();
                AddToFamilyCartButtonView.AnimationParams animationParams = addToFamilyCartBtn.getAnimationParams();
                maxOffset2 = AddToCartContainerView.this.getMaxOffset();
                animationParams.setRightBorderOffset(maxOffset2);
                addToFamilyCartBtn2 = AddToCartContainerView.this.getAddToFamilyCartBtn();
                addToFamilyCartBtn2.invalidate();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        return ofInt;
    }
}
