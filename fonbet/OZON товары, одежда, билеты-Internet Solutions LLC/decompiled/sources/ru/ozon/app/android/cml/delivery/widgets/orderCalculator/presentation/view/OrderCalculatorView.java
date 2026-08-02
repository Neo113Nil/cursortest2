package ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.view;

import B90.C2618u;
import Bi.a;
import Bi.b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.R$id;
import ru.ozon.app.android.cml.delivery.common.ext.Dimens;
import ru.ozon.app.android.cml.delivery.common.ext.DrawableExtKt;
import ru.ozon.app.android.cml.delivery.molecules.boxCard.presentation.BoxCardVO;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.view.OrderCalculatorView;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 [2\u00020\u0001:\u0001[B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0012¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0012¢\u0006\u0004\b\u0017\u0010\u0016J)\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00182\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001b¢\u0006\u0004\b \u0010\u001fJ\u001b\u0010$\u001a\u00020\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\u0004\b$\u0010%J)\u0010(\u001a\u00020\u001d2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u001b¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.J;\u0010/\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u001bH\u0002¢\u0006\u0004\b/\u00100J#\u00104\u001a\u0002032\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\r0\u0012H\u0002¢\u0006\u0004\b4\u00105J%\u00107\u001a\u00020\u001d2\u0006\u00106\u001a\u00020*2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001bH\u0002¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u000203*\u00020*2\u0006\u00109\u001a\u0002012\u0006\u0010:\u001a\u000201H\u0002¢\u0006\u0004\b;\u0010<R\u0017\u0010>\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010C\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010H\u001a\u00020G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010L\u001a\u00020*8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010Q\u001a\u00020P8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0014\u0010+\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010OR\u0014\u0010,\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010OR\u0014\u0010Z\u001a\u00020W8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006\\"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/view/OrderCalculatorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "topPatchColor", "backgroundColor", "", "bindBackground", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bindSource", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lkotlin/jvm/functions/Function1;)V", "bindDestination", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "bindSwapButton", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "updateTextAction", "Landroid/animation/AnimatorSet;", "updateSourceWithFade", "(Lkotlin/jvm/functions/Function0;)Landroid/animation/AnimatorSet;", "updateDestinationWithFade", "", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;", "boxCards", "scrollToSelectedBox", "(Ljava/util/List;)V", "sourceUpdateAction", "destinationUpdateAction", "swapRegions", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroid/animation/AnimatorSet;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "sourceTv", "destinationTv", "slideOutFadeOutAnimator", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/uni/android/atom/text/TextAtomV2View;)Landroid/animation/AnimatorSet;", "slideInFadeInAnimator", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/uni/android/atom/text/TextAtomV2View;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroid/animation/AnimatorSet;", "", "onRotationAngleChanged", "Landroid/animation/ValueAnimator;", "rotateAnimator", "(Lkotlin/jvm/functions/Function1;)Landroid/animation/ValueAnimator;", "textView", "updateTextWithFade", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lkotlin/jvm/functions/Function0;)Landroid/animation/AnimatorSet;", "from", "to", "fadeTextAnimator", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;FF)Landroid/animation/ValueAnimator;", "Landroid/view/View;", "roundedBackgroundView", "Landroid/view/View;", "getRoundedBackgroundView", "()Landroid/view/View;", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/view/RegionsView;", "viewRegions", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/view/RegionsView;", "getViewRegions", "()Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/view/RegionsView;", "Landroidx/recyclerview/widget/RecyclerView;", "boxCardsRv", "Landroidx/recyclerview/widget/RecyclerView;", "getBoxCardsRv", "()Landroidx/recyclerview/widget/RecyclerView;", "infoTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getInfoTv", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "createOrderButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getCreateOrderButton", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getSourceTv", "getDestinationTv", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getSwapButton", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "swapButton", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderCalculatorView extends ConstraintLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final RecyclerView boxCardsRv;

    @NotNull
    private final ButtonV3View createOrderButton;

    @NotNull
    private final TextAtomV2View infoTv;

    @NotNull
    private final View roundedBackgroundView;

    @NotNull
    private final RegionsView viewRegions;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/view/OrderCalculatorView$Companion;", "", "<init>", "()V", "MAX_ALPHA", "", "MIN_ALPHA", "ANIM_DURATION", "", "SWAP_ICON_ROTATION_ANGLE", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ OrderCalculatorView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final ValueAnimator fadeTextAnimator(final TextAtomV2View textAtomV2View, float f7, float f11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f11);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cq.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                OrderCalculatorView.fadeTextAnimator$lambda$30$lambda$29(TextAtomV2View.this, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fadeTextAnimator$lambda$30$lambda$29(TextAtomV2View textAtomV2View, ValueAnimator valueAnimator) {
        textAtomV2View.setAlpha(((Float) a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    private final TextAtomV2View getDestinationTv() {
        return this.viewRegions.getDestinationTv();
    }

    private final TextAtomV2View getSourceTv() {
        return this.viewRegions.getSourceTv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconButtonV3View getSwapButton() {
        return this.viewRegions.getSwapButton();
    }

    private final ValueAnimator rotateAnimator(final Function1<? super Float, Unit> onRotationAngleChanged) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -180.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cq.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                OrderCalculatorView.rotateAnimator$lambda$26$lambda$25(Function1.this, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rotateAnimator$lambda$26$lambda$25(Function1 function1, ValueAnimator valueAnimator) {
        function1.invoke((Float) a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float"));
    }

    private final AnimatorSet slideInFadeInAnimator(final TextAtomV2View sourceTv, final TextAtomV2View destinationTv, final Function0<Unit> sourceUpdateAction, final Function0<Unit> destinationUpdateAction) {
        final float height = sourceTv.getHeight() / 2.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(height, 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cq.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                OrderCalculatorView.slideInFadeInAnimator$lambda$21$lambda$20(TextAtomV2View.this, height, valueAnimator);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.view.OrderCalculatorView$slideInFadeInAnimator$moveUp$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                animation.removeListener(this);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                sourceUpdateAction.invoke();
            }
        });
        final float height2 = destinationTv.getHeight() / 2.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-height2, 0.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cq.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                OrderCalculatorView.slideInFadeInAnimator$lambda$23$lambda$22(TextAtomV2View.this, height2, valueAnimator);
            }
        });
        ofFloat2.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.view.OrderCalculatorView$slideInFadeInAnimator$moveDown$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                animation.removeListener(this);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                destinationUpdateAction.invoke();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void slideInFadeInAnimator$lambda$21$lambda$20(TextAtomV2View textAtomV2View, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        textAtomV2View.setTranslationY(floatValue);
        textAtomV2View.setAlpha(1.0f - (floatValue / f7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void slideInFadeInAnimator$lambda$23$lambda$22(TextAtomV2View textAtomV2View, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        textAtomV2View.setTranslationY(floatValue);
        textAtomV2View.setAlpha(1.0f - ((-floatValue) / f7));
    }

    private final AnimatorSet slideOutFadeOutAnimator(final TextAtomV2View sourceTv, final TextAtomV2View destinationTv) {
        final float height = sourceTv.getHeight() / 2.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, height);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cq.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                OrderCalculatorView.slideOutFadeOutAnimator$lambda$16$lambda$15(TextAtomV2View.this, height, valueAnimator);
            }
        });
        final float height2 = destinationTv.getHeight() / 2.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, -height2);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cq.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                OrderCalculatorView.slideOutFadeOutAnimator$lambda$18$lambda$17(TextAtomV2View.this, height2, valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void slideOutFadeOutAnimator$lambda$16$lambda$15(TextAtomV2View textAtomV2View, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        textAtomV2View.setTranslationY(floatValue);
        textAtomV2View.setAlpha(1.0f - (floatValue / f7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void slideOutFadeOutAnimator$lambda$18$lambda$17(TextAtomV2View textAtomV2View, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        textAtomV2View.setTranslationY(floatValue);
        textAtomV2View.setAlpha(1.0f - ((-floatValue) / f7));
    }

    private final AnimatorSet updateTextWithFade(TextAtomV2View textView, final Function0<Unit> updateTextAction) {
        ValueAnimator fadeTextAnimator = fadeTextAnimator(textView, 1.0f, 0.0f);
        ValueAnimator fadeTextAnimator2 = fadeTextAnimator(textView, 0.0f, 1.0f);
        fadeTextAnimator2.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.view.OrderCalculatorView$updateTextWithFade$fadeIn$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                updateTextAction.invoke();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                animation.removeListener(this);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                updateTextAction.invoke();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(fadeTextAnimator, fadeTextAnimator2);
        animatorSet.setDuration(200L);
        animatorSet.start();
        return animatorSet;
    }

    public final void bindBackground(String topPatchColor, String backgroundColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context, topPatchColor, R$color.layer_floor_0));
        Drawable background = this.roundedBackgroundView.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            gradientDrawable.setColor(ColorStateList.valueOf(styleParser.parseColor(context2, backgroundColor, R$color.layer_floor_1)));
        }
    }

    public final void bindDestination(@NotNull TextDTO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextHolderKt.bind(getDestinationTv(), item, actionHandler);
    }

    public final void bindSource(@NotNull TextDTO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextHolderKt.bind(getSourceTv(), item, actionHandler);
    }

    public final void bindSwapButton(@NotNull IconButtonV3DTO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        IconButtonV3HolderKt.bind(getSwapButton(), item, actionHandler);
    }

    @NotNull
    public final RecyclerView getBoxCardsRv() {
        return this.boxCardsRv;
    }

    @NotNull
    public final ButtonV3View getCreateOrderButton() {
        return this.createOrderButton;
    }

    @NotNull
    public final TextAtomV2View getInfoTv() {
        return this.infoTv;
    }

    @NotNull
    public final RegionsView getViewRegions() {
        return this.viewRegions;
    }

    public final void scrollToSelectedBox(@NotNull List<BoxCardVO> boxCards) {
        Intrinsics.checkNotNullParameter(boxCards, "boxCards");
        Iterator<BoxCardVO> it = boxCards.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().getIsSelected()) {
                break;
            } else {
                i11++;
            }
        }
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            this.boxCardsRv.smoothScrollToPosition(valueOf.intValue());
        }
    }

    @NotNull
    public final AnimatorSet swapRegions(@NotNull Function0<Unit> sourceUpdateAction, @NotNull Function0<Unit> destinationUpdateAction) {
        Intrinsics.checkNotNullParameter(sourceUpdateAction, "sourceUpdateAction");
        Intrinsics.checkNotNullParameter(destinationUpdateAction, "destinationUpdateAction");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(slideOutFadeOutAnimator(getSourceTv(), getDestinationTv()), slideInFadeInAnimator(getSourceTv(), getDestinationTv(), sourceUpdateAction, destinationUpdateAction));
        ValueAnimator rotateAnimator = rotateAnimator(new OrderCalculatorView$swapRegions$swapButtonIconRotateAnimation$1(this));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(rotateAnimator, animatorSet);
        animatorSet2.start();
        return animatorSet2;
    }

    @NotNull
    public final AnimatorSet updateDestinationWithFade(@NotNull Function0<Unit> updateTextAction) {
        Intrinsics.checkNotNullParameter(updateTextAction, "updateTextAction");
        return updateTextWithFade(getDestinationTv(), updateTextAction);
    }

    @NotNull
    public final AnimatorSet updateSourceWithFade(@NotNull Function0<Unit> updateTextAction) {
        Intrinsics.checkNotNullParameter(updateTextAction, "updateTextAction");
        return updateTextWithFade(getSourceTv(), updateTextAction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderCalculatorView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View view = new View(context);
        view.setId(R$id.calculator_roundedBackground);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        view.setLayoutParams(bVar);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Dimens dimens = Dimens.INSTANCE;
        DrawableExtKt.setCornerRadius$default(gradientDrawable, dimens.getCalculatorTopCornersRadius(), dimens.getCalculatorTopCornersRadius(), 0.0f, 0.0f, 12, null);
        view.setBackground(gradientDrawable);
        this.roundedBackgroundView = view;
        RegionsView regionsView = new RegionsView(context, null, 0, 6, null);
        regionsView.setId(R$id.calculator_regionsView);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        int i12 = R$id.calculator_roundedBackground;
        bVar2.f41636i = i12;
        bVar2.f41656t = i12;
        bVar2.f41658v = i12;
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = dimens.getDp16();
        bVar2.setMarginStart(dimens.getDp16());
        bVar2.setMarginEnd(dimens.getDp16());
        regionsView.setLayoutParams(bVar2);
        this.viewRegions = regionsView;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.calculator_boxCardsRv);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.f41638j = R$id.calculator_regionsView;
        int i13 = R$id.calculator_roundedBackground;
        bVar3.f41656t = i13;
        bVar3.f41658v = i13;
        ((ViewGroup.MarginLayoutParams) bVar3).topMargin = dimens.getDp12();
        recyclerView.setLayoutParams(bVar3);
        recyclerView.setNestedScrollingEnabled(false);
        this.boxCardsRv = recyclerView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.calculator_infoTv, 0, -2);
        d11.f41638j = R$id.calculator_boxCardsRv;
        int i14 = R$id.calculator_roundedBackground;
        d11.f41656t = i14;
        d11.f41658v = i14;
        ((ViewGroup.MarginLayoutParams) d11).topMargin = dimens.getDp8();
        d11.setMarginStart(dimens.getDp16());
        d11.setMarginEnd(dimens.getDp16());
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        this.infoTv = textAtomV2View;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, R$id.calculator_createOrderButton, -1, -2);
        e11.f41638j = R$id.calculator_infoTv;
        int i15 = R$id.calculator_roundedBackground;
        e11.f41642l = i15;
        e11.f41656t = i15;
        e11.f41658v = i15;
        ((ViewGroup.MarginLayoutParams) e11).topMargin = dimens.getDp12();
        ((ViewGroup.MarginLayoutParams) e11).bottomMargin = dimens.getDp16();
        e11.setMarginStart(dimens.getDp16());
        e11.setMarginEnd(dimens.getDp16());
        buttonV3View.setLayoutParams(e11);
        this.createOrderButton = buttonV3View;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(view);
        addView(regionsView);
        addView(recyclerView);
        addView(textAtomV2View);
        addView(buttonV3View);
    }
}
