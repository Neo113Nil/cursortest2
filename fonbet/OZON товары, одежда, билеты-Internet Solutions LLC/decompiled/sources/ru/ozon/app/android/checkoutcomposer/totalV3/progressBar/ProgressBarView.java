package ru.ozon.app.android.checkoutcomposer.totalV3.progressBar;

import Sc.InterfaceC4008j;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.a;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.R$raw;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 42\u00020\u0001:\u00014B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\fJ\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\fJ\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00100\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,R\u001b\u00103\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,¨\u00065"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "addTitleView", "()V", "addAnimationView", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "bindOrGone", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "playProgressBarAnimation", "cancelProgressBarAnimation", "cancelTitleAnimation", "Landroid/animation/AnimatorSet;", "startAnimation", "()Landroid/animation/AnimatorSet;", "Lkotlin/Function0;", "afterAnimation", "stopAnimation", "(Lkotlin/jvm/functions/Function0;)V", "cancelAnimations", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lcom/airbnb/lottie/LottieAnimationView;", "animationView", "Lcom/airbnb/lottie/LottieAnimationView;", "Landroidx/constraintlayout/widget/Guideline;", "guideline", "Landroidx/constraintlayout/widget/Guideline;", "Landroid/animation/ObjectAnimator;", "animatorStartStateBackground$delegate", "LSc/j;", "getAnimatorStartStateBackground", "()Landroid/animation/ObjectAnimator;", "animatorStartStateBackground", "animatorEndStateBackground$delegate", "getAnimatorEndStateBackground", "animatorEndStateBackground", "animatorBlinkTitle$delegate", "getAnimatorBlinkTitle", "animatorBlinkTitle", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProgressBarView extends ConstraintLayout {

    @NotNull
    private final LottieAnimationView animationView;

    /* renamed from: animatorBlinkTitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j animatorBlinkTitle;

    /* renamed from: animatorEndStateBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j animatorEndStateBackground;

    /* renamed from: animatorStartStateBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j animatorStartStateBackground;

    @NotNull
    private final Guideline guideline;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_12 = UiExtKt.toPx(12);
    private static final int DP_24 = UiExtKt.toPx(24);
    private static final int DP_32 = UiExtKt.toPx(32);
    private static final int DP_56 = UiExtKt.toPx(56);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarView$Companion;", "", "<init>", "()V", "", "DP_12", "I", "getDP_12", "()I", "DP_24", "getDP_24", "DP_32", "getDP_32", "", "MIN_ALPHA_BLINK_TITLE", "F", "MAX_ALPHA_BLINK_TITLE", "", "DURATION_ANIMATION_BLINK_TITLE", "J", "DURATION_ANIMATION_ALPHA_BACKGROUND", "ALPHA_BACKGROUND_START", "ALPHA_BACKGROUND_LOADING", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDP_12() {
            return ProgressBarView.DP_12;
        }

        public final int getDP_24() {
            return ProgressBarView.DP_24;
        }

        public final int getDP_32() {
            return ProgressBarView.DP_32;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProgressBarView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void addAnimationView() {
        addView(this.animationView);
        ConstraintLayoutExtKt.updateConstraints(this, new ProgressBarView$addAnimationView$1(this));
        LottieAnimationView lottieAnimationView = this.animationView;
        ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41599F = 1.0f;
        lottieAnimationView.setLayoutParams(bVar);
    }

    private final void addTitleView() {
        addView(this.titleView);
        ConstraintLayoutExtKt.updateConstraints(this, new ProgressBarView$addTitleView$1(this));
        TextAtomV2View textAtomV2View = this.titleView;
        ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41599F = 0.0f;
        textAtomV2View.setLayoutParams(bVar);
    }

    private final ObjectAnimator getAnimatorBlinkTitle() {
        Object value = this.animatorBlinkTitle.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ObjectAnimator) value;
    }

    private final ObjectAnimator getAnimatorEndStateBackground() {
        Object value = this.animatorEndStateBackground.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ObjectAnimator) value;
    }

    private final ObjectAnimator getAnimatorStartStateBackground() {
        Object value = this.animatorStartStateBackground.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ObjectAnimator) value;
    }

    public final void bindOrGone(TextDTO title) {
        TextHolderKt.bindOrGone$default(this.titleView, title, null, 2, null);
    }

    public final void cancelAnimations() {
        getAnimatorBlinkTitle().cancel();
        getAnimatorStartStateBackground().cancel();
        getAnimatorEndStateBackground().cancel();
    }

    public final void cancelProgressBarAnimation() {
        this.animationView.cancelAnimation();
    }

    public final void cancelTitleAnimation() {
        getAnimatorBlinkTitle().cancel();
    }

    @NotNull
    public final TextAtomV2View getTitleView() {
        return this.titleView;
    }

    public final void playProgressBarAnimation() {
        this.animationView.playAnimation();
    }

    @NotNull
    public final AnimatorSet startAnimation() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(getAnimatorStartStateBackground(), getAnimatorBlinkTitle());
        animatorSet.start();
        return animatorSet;
    }

    public final void stopAnimation(@NotNull final Function0<Unit> afterAnimation) {
        Intrinsics.checkNotNullParameter(afterAnimation, "afterAnimation");
        getAnimatorStartStateBackground().cancel();
        ObjectAnimator animatorEndStateBackground = getAnimatorEndStateBackground();
        animatorEndStateBackground.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.checkoutcomposer.totalV3.progressBar.ProgressBarView$stopAnimation$lambda$6$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                Function0.this.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        animatorEndStateBackground.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressBarView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textAtomV2View.setId(View.generateViewId());
        textAtomV2View.setTextIsSelectable(false);
        this.titleView = textAtomV2View;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        int i12 = DP_56;
        lottieAnimationView.setLayoutParams(new ConstraintLayout.b(i12, i12));
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        lottieAnimationView.setAnimation(R$raw.checkout_animation);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setRepeatMode(1);
        lottieAnimationView.setId(View.generateViewId());
        this.animationView = lottieAnimationView;
        Guideline guideline = new Guideline(context);
        guideline.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41615V = 0;
        bVar.f41624c = 0.5f;
        guideline.setLayoutParams(bVar);
        this.guideline = guideline;
        this.animatorStartStateBackground = LazyUtilsKt.unsafeLazy(new ProgressBarView$animatorStartStateBackground$2(this));
        this.animatorEndStateBackground = LazyUtilsKt.unsafeLazy(new ProgressBarView$animatorEndStateBackground$2(this));
        this.animatorBlinkTitle = LazyUtilsKt.unsafeLazy(new ProgressBarView$animatorBlinkTitle$2(this));
        setLayoutParams(new ConstraintLayout.b(-1, -1));
        setBackgroundColor(a.getColor(context, UniColors.LAYER_OVERLAY_DIMMING.getResId()));
        setAlpha(0.0f);
        addView(guideline);
        addAnimationView();
        addTitleView();
    }
}
