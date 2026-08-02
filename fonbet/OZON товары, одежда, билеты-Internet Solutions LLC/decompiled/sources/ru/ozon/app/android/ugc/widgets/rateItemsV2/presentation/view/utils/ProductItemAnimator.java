package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fBA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\rJ\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/view/utils/ProductItemAnimator;", "", "ratingView", "Lru/ozon/uni/android/atom/rating/RatingView;", "hideButton", "Landroid/view/View;", "cell", "titleView", "Landroid/widget/TextView;", "rootLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "onItemAnimationComplete", "Lkotlin/Function0;", "", "<init>", "(Lru/ozon/uni/android/atom/rating/RatingView;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Lkotlin/jvm/functions/Function0;)V", "runningSet", "Landroid/animation/AnimatorSet;", "animateProductItem", "resetAnimationState", "wasAnimated", "", "cancel", "resetCellState", "createAnimations", "", "Landroid/animation/Animator;", "createTitleAnimator", "Landroid/animation/ValueAnimator;", "applyTitleState", "rated", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductItemAnimator {

    @NotNull
    private final View cell;

    @NotNull
    private final View hideButton;
    private final Function0<Unit> onItemAnimationComplete;

    @NotNull
    private final RatingView ratingView;

    @NotNull
    private final ConstraintLayout rootLayout;
    private AnimatorSet runningSet;

    @NotNull
    private final TextView titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float RATING_TRANSLATION_Y = ResourceExtKt.toPxF(-32);
    private static final float RATING_TRANSLATION_X = ResourceExtKt.toPxF(-23);
    private static final float HIDE_TRANSLATION_Y = ResourceExtKt.toPxF(-16);
    private static final float CELL_TRANSLATION_Y = ResourceExtKt.toPxF(-28);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/view/utils/ProductItemAnimator$Companion;", "", "<init>", "()V", "", "RATING_SCALE", "F", "HIDE_SCALE", "", "DURATION", "J", "TITLE_DELAY", "", "TITLE_MAX_LINES_RATED", "I", "TITLE_MAX_LINES_DEFAULT", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ProductItemAnimator(@NotNull RatingView ratingView, @NotNull View hideButton, @NotNull View cell, @NotNull TextView titleView, @NotNull ConstraintLayout rootLayout, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(ratingView, "ratingView");
        Intrinsics.checkNotNullParameter(hideButton, "hideButton");
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(titleView, "titleView");
        Intrinsics.checkNotNullParameter(rootLayout, "rootLayout");
        this.ratingView = ratingView;
        this.hideButton = hideButton;
        this.cell = cell;
        this.titleView = titleView;
        this.rootLayout = rootLayout;
        this.onItemAnimationComplete = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTitleState(boolean rated) {
        if (rated) {
            this.titleView.setMaxLines(1);
        }
        ConstraintLayoutExtKt.updateConstraints(this.rootLayout, new ProductItemAnimator$applyTitleState$1(this, rated));
    }

    private final List<Animator> createAnimations() {
        RatingView ratingView = this.ratingView;
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ratingView, (Property<RatingView, Float>) property, 1.0f, 0.7f);
        RatingView ratingView2 = this.ratingView;
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ratingView2, (Property<RatingView, Float>) property2, 1.0f, 0.7f);
        RatingView ratingView3 = this.ratingView;
        Property property3 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ratingView3, (Property<RatingView, Float>) property3, 0.0f, RATING_TRANSLATION_Y);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.ratingView, (Property<RatingView, Float>) View.TRANSLATION_X, 0.0f, RATING_TRANSLATION_X);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.hideButton, (Property<View, Float>) property3, 0.0f, HIDE_TRANSLATION_Y);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.hideButton, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.hideButton, (Property<View, Float>) property, 1.0f, 0.5f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.hideButton, (Property<View, Float>) property2, 1.0f, 0.5f);
        View view = this.cell;
        return C7714v.b0(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(view, (Property<View, Float>) property3, view.getTranslationY(), CELL_TRANSLATION_Y), createTitleAnimator());
    }

    private final ValueAnimator createTitleAnimator() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 1);
        ofInt.setStartDelay(70L);
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.utils.ProductItemAnimator$createTitleAnimator$lambda$3$$inlined$doOnStart$1
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
                ProductItemAnimator.this.applyTitleState(true);
            }
        };
        ofInt.addListener(animatorListener);
        ofInt.addListener(animatorListener);
        Intrinsics.checkNotNullExpressionValue(ofInt, "apply(...)");
        return ofInt;
    }

    private final void resetCellState(boolean wasAnimated) {
        if (wasAnimated) {
            this.cell.setTranslationY(CELL_TRANSLATION_Y);
            return;
        }
        if (!ViewExtKt.isVisible(this.cell)) {
            this.cell.setTranslationY(0.0f);
            return;
        }
        View view = this.cell;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.utils.ProductItemAnimator$resetCellState$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    ProductItemAnimator.this.cell.setTranslationY(view2.getHeight());
                }
            });
        } else {
            this.cell.setTranslationY(view.getHeight());
        }
    }

    public final void animateProductItem() {
        cancel();
        this.ratingView.setClickable(false);
        this.hideButton.setClickable(false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.playTogether(createAnimations());
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.utils.ProductItemAnimator$animateProductItem$1$1
            private boolean cancelled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.cancelled = true;
            }

            /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
            
                r2 = r1.this$0.onItemAnimationComplete;
             */
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onAnimationEnd(Animator animation) {
                Function0 function0;
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.cancelled || function0 == null) {
                    return;
                }
                function0.invoke();
            }
        });
        animatorSet.start();
        this.runningSet = animatorSet;
    }

    public final void cancel() {
        AnimatorSet animatorSet = this.runningSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.runningSet = null;
    }

    public final void resetAnimationState(boolean wasAnimated) {
        cancel();
        float f7 = wasAnimated ? 0.7f : 1.0f;
        this.ratingView.setScaleX(f7);
        this.ratingView.setScaleY(f7);
        this.ratingView.setTranslationX(wasAnimated ? RATING_TRANSLATION_X : 0.0f);
        this.ratingView.setTranslationY(wasAnimated ? RATING_TRANSLATION_Y : 0.0f);
        this.ratingView.setClickable(!wasAnimated);
        float f11 = wasAnimated ? 0.5f : 1.0f;
        this.hideButton.setTranslationY(wasAnimated ? HIDE_TRANSLATION_Y : 0.0f);
        this.hideButton.setAlpha(wasAnimated ? 0.0f : 1.0f);
        this.hideButton.setScaleX(f11);
        this.hideButton.setScaleY(f11);
        this.hideButton.setClickable(!wasAnimated);
        resetCellState(wasAnimated);
        applyTitleState(wasAnimated);
    }
}
