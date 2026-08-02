package ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import WZ.l;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.W;
import d20.AbstractC6064a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetBottomCartBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.BottomCartWidgetVO;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.BottomCartWidgetViewHolder;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.WidgetState;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 i2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001iB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u0014J\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u0010/\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R\u001b\u00102\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u001b\u00105\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010+R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010)\u001a\u0004\b;\u0010<R#\u0010C\u001a\n ?*\u0004\u0018\u00010>0>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010)\u001a\u0004\bA\u0010BR#\u0010F\u001a\n ?*\u0004\u0018\u00010>0>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010)\u001a\u0004\bE\u0010BR#\u0010K\u001a\n ?*\u0004\u0018\u00010G0G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010)\u001a\u0004\bI\u0010JR#\u0010N\u001a\n ?*\u0004\u0018\u00010G0G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010)\u001a\u0004\bM\u0010JR\u001b\u0010Q\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010)\u001a\u0004\bP\u0010<R#\u0010T\u001a\n ?*\u0004\u0018\u00010>0>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010)\u001a\u0004\bS\u0010BR#\u0010W\u001a\n ?*\u0004\u0018\u00010>0>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010)\u001a\u0004\bV\u0010BR\u001b\u0010Z\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010)\u001a\u0004\bY\u0010<R#\u0010]\u001a\n ?*\u0004\u0018\u00010>0>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010)\u001a\u0004\b\\\u0010BR#\u0010`\u001a\n ?*\u0004\u0018\u00010>0>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010)\u001a\u0004\b_\u0010BR \u0010c\u001a\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020\u000f0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020f0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006j"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetVO;", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetBottomCartBinding;", "binding", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Ll10/i;", "refs", "<init>", "(Lru/ozon/app/android/fresh/unsorted/databinding/WidgetBottomCartBinding;LWZ/l;Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetViewModel;Lru/ozon/app/android/composer/ComposerNavigator;Ll10/i;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetVO;)V", "vo", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "cartButton", "slideUpButton", "(Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetVO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "slideDownButton", "cartButtonV3DTO", "showCartButton", "hideCartButton", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetVO$ViewState;", "viewState", "prepareLayout", "(Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetVO$ViewState;)V", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetBottomCartBinding;", "LWZ/l;", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetViewModel;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Ll10/i;", "", "containerHeight$delegate", "LSc/j;", "getContainerHeight", "()I", "containerHeight", "iconButtonWidth$delegate", "getIconButtonWidth", "iconButtonWidth", "layoutOffset$delegate", "getLayoutOffset", "layoutOffset", "paddingOffset$delegate", "getPaddingOffset", "paddingOffset", "Landroid/view/animation/PathInterpolator;", "pathInterpolator", "Landroid/view/animation/PathInterpolator;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "slideListener$delegate", "getSlideListener", "()Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "slideListener", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "slideUp$delegate", "getSlideUp", "()Landroid/animation/ValueAnimator;", "slideUp", "slideDown$delegate", "getSlideDown", "slideDown", "Landroid/animation/ObjectAnimator;", "buttonHideAlphaAnimator$delegate", "getButtonHideAlphaAnimator", "()Landroid/animation/ObjectAnimator;", "buttonHideAlphaAnimator", "buttonShowAlphaAnimator$delegate", "getButtonShowAlphaAnimator", "buttonShowAlphaAnimator", "widthListener$delegate", "getWidthListener", "widthListener", "widthToIconButton$delegate", "getWidthToIconButton", "widthToIconButton", "widthToNormalButton$delegate", "getWidthToNormalButton", "widthToNormalButton", "translationXListener$delegate", "getTranslationXListener", "translationXListener", "cartButtonFadeIn$delegate", "getCartButtonFadeIn", "cartButtonFadeIn", "cartButtonFadeOut$delegate", "getCartButtonFadeOut", "cartButtonFadeOut", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroidx/lifecycle/W;", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/WidgetState$NewState;", "observer", "Landroidx/lifecycle/W;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BottomCartWidgetViewHolder extends AbstractC6064a<BottomCartWidgetVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetBottomCartBinding binding;

    /* renamed from: buttonHideAlphaAnimator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonHideAlphaAnimator;

    /* renamed from: buttonShowAlphaAnimator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonShowAlphaAnimator;

    /* renamed from: cartButtonFadeIn$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cartButtonFadeIn;

    /* renamed from: cartButtonFadeOut$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cartButtonFadeOut;

    /* renamed from: containerHeight$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j containerHeight;

    /* renamed from: iconButtonWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconButtonWidth;

    /* renamed from: layoutOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j layoutOffset;

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final W<WidgetState.NewState> observer;

    /* renamed from: paddingOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j paddingOffset;

    @NotNull
    private final PathInterpolator pathInterpolator;

    @NotNull
    private final i refs;

    /* renamed from: slideDown$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j slideDown;

    /* renamed from: slideListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j slideListener;

    /* renamed from: slideUp$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j slideUp;

    @NotNull
    private final l tokenizedAnalytics;

    /* renamed from: translationXListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j translationXListener;

    @NotNull
    private final BottomCartWidgetViewModel viewModel;

    /* renamed from: widthListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j widthListener;

    /* renamed from: widthToIconButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j widthToIconButton;

    /* renamed from: widthToNormalButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j widthToNormalButton;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetViewHolder$Companion;", "", "<init>", "()V", "ANIMATION_DURATION", "", "FRESH_MAIN_PAGE_LINK", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomCartWidgetViewHolder(@NotNull WidgetBottomCartBinding binding, @NotNull l tokenizedAnalytics, @NotNull BottomCartWidgetViewModel viewModel, @NotNull ComposerNavigator navigator, @NotNull i refs) {
        super(refs, new Ww.a(binding, 0));
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.binding = binding;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.navigator = navigator;
        this.refs = refs;
        this.containerHeight = k.b(BottomCartWidgetViewHolder$containerHeight$2.INSTANCE);
        this.iconButtonWidth = k.b(BottomCartWidgetViewHolder$iconButtonWidth$2.INSTANCE);
        this.layoutOffset = k.b(BottomCartWidgetViewHolder$layoutOffset$2.INSTANCE);
        this.paddingOffset = k.b(BottomCartWidgetViewHolder$paddingOffset$2.INSTANCE);
        this.pathInterpolator = new PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f);
        this.slideListener = k.b(new BottomCartWidgetViewHolder$slideListener$2(this));
        this.slideUp = k.b(new BottomCartWidgetViewHolder$slideUp$2(this));
        this.slideDown = k.b(new BottomCartWidgetViewHolder$slideDown$2(this));
        this.buttonHideAlphaAnimator = k.b(new BottomCartWidgetViewHolder$buttonHideAlphaAnimator$2(this));
        this.buttonShowAlphaAnimator = k.b(new BottomCartWidgetViewHolder$buttonShowAlphaAnimator$2(this));
        this.widthListener = k.b(new BottomCartWidgetViewHolder$widthListener$2(this));
        this.widthToIconButton = k.b(new BottomCartWidgetViewHolder$widthToIconButton$2(this));
        this.widthToNormalButton = k.b(new BottomCartWidgetViewHolder$widthToNormalButton$2(this));
        this.translationXListener = k.b(new BottomCartWidgetViewHolder$translationXListener$2(this));
        this.cartButtonFadeIn = k.b(new BottomCartWidgetViewHolder$cartButtonFadeIn$2(this));
        this.cartButtonFadeOut = k.b(new BottomCartWidgetViewHolder$cartButtonFadeOut$2(this));
        this.actionHandler = new ActionHandler.Builder(refs, this).onPreProcess(new BottomCartWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.observer = new W() { // from class: Ww.b
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                BottomCartWidgetViewHolder.observer$lambda$1(BottomCartWidgetViewHolder.this, (WidgetState.NewState) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View _init_$lambda$0(WidgetBottomCartBinding widgetBottomCartBinding, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ConstraintLayout constraintLayout = widgetBottomCartBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    private final ObjectAnimator getButtonHideAlphaAnimator() {
        return (ObjectAnimator) this.buttonHideAlphaAnimator.getValue();
    }

    private final ObjectAnimator getButtonShowAlphaAnimator() {
        return (ObjectAnimator) this.buttonShowAlphaAnimator.getValue();
    }

    private final ValueAnimator getCartButtonFadeIn() {
        return (ValueAnimator) this.cartButtonFadeIn.getValue();
    }

    private final ValueAnimator getCartButtonFadeOut() {
        return (ValueAnimator) this.cartButtonFadeOut.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContainerHeight() {
        return ((Number) this.containerHeight.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getIconButtonWidth() {
        return ((Number) this.iconButtonWidth.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getLayoutOffset() {
        return ((Number) this.layoutOffset.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPaddingOffset() {
        return ((Number) this.paddingOffset.getValue()).intValue();
    }

    private final ValueAnimator getSlideDown() {
        return (ValueAnimator) this.slideDown.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValueAnimator.AnimatorUpdateListener getSlideListener() {
        return (ValueAnimator.AnimatorUpdateListener) this.slideListener.getValue();
    }

    private final ValueAnimator getSlideUp() {
        return (ValueAnimator) this.slideUp.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValueAnimator.AnimatorUpdateListener getTranslationXListener() {
        return (ValueAnimator.AnimatorUpdateListener) this.translationXListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValueAnimator.AnimatorUpdateListener getWidthListener() {
        return (ValueAnimator.AnimatorUpdateListener) this.widthListener.getValue();
    }

    private final ValueAnimator getWidthToIconButton() {
        return (ValueAnimator) this.widthToIconButton.getValue();
    }

    private final ValueAnimator getWidthToNormalButton() {
        return (ValueAnimator) this.widthToNormalButton.getValue();
    }

    private final void hideCartButton(final BottomCartWidgetVO vo) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(this.pathInterpolator);
        animatorSet.playTogether(getWidthToNormalButton(), getButtonHideAlphaAnimator(), getCartButtonFadeOut());
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.BottomCartWidgetViewHolder$hideCartButton$lambda$12$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                WidgetBottomCartBinding widgetBottomCartBinding;
                WidgetBottomCartBinding widgetBottomCartBinding2;
                i iVar;
                widgetBottomCartBinding = BottomCartWidgetViewHolder.this.binding;
                ButtonV3View catalogButton = widgetBottomCartBinding.catalogButton;
                Intrinsics.checkNotNullExpressionValue(catalogButton, "catalogButton");
                ViewGroup.LayoutParams layoutParams = catalogButton.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = 0;
                catalogButton.setLayoutParams(layoutParams);
                widgetBottomCartBinding2 = BottomCartWidgetViewHolder.this.binding;
                ButtonV3View cartButton = widgetBottomCartBinding2.cartButton;
                Intrinsics.checkNotNullExpressionValue(cartButton, "cartButton");
                ViewExtKt.gone(cartButton);
                iVar = BottomCartWidgetViewHolder.this.refs;
                iVar.M().update(vo);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void observer$lambda$1(BottomCartWidgetViewHolder bottomCartWidgetViewHolder, WidgetState.NewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BottomCartWidgetVO bottomCartWidgetVO = (BottomCartWidgetVO) bottomCartWidgetViewHolder.getBoundData();
        if (bottomCartWidgetVO == null) {
            return;
        }
        BottomCartWidgetVO vO$default = BottomCartWidgetMapperKt.toVO$default(it.getDto(), bottomCartWidgetVO.getId(), null, 2, null);
        Map<String, String> trackingPayloads = it.getTrackingPayloads();
        if (trackingPayloads != null) {
            bottomCartWidgetViewHolder.tokenizedAnalytics.e(trackingPayloads);
        }
        if (vO$default.getViewState().getClass() == bottomCartWidgetVO.getViewState().getClass() && vO$default.getId() == bottomCartWidgetVO.getId()) {
            bottomCartWidgetViewHolder.refs.M().update(vO$default);
            return;
        }
        if (vO$default.getViewState() instanceof BottomCartWidgetVO.ViewState.CartButtonState) {
            bottomCartWidgetViewHolder.slideUpButton(vO$default, ((BottomCartWidgetVO.ViewState.CartButtonState) vO$default.getViewState()).getCartButton());
            return;
        }
        if (vO$default.getViewState() instanceof BottomCartWidgetVO.ViewState.NoButtonsState) {
            bottomCartWidgetViewHolder.slideDownButton(vO$default);
        } else if (vO$default.getViewState() instanceof BottomCartWidgetVO.ViewState.CatalogButtonState) {
            bottomCartWidgetViewHolder.hideCartButton(vO$default);
        } else if (vO$default.getViewState() instanceof BottomCartWidgetVO.ViewState.TwoButtonState) {
            bottomCartWidgetViewHolder.showCartButton(vO$default, ((BottomCartWidgetVO.ViewState.TwoButtonState) vO$default.getViewState()).getCartButton());
        }
    }

    private final void prepareLayout(BottomCartWidgetVO.ViewState viewState) {
        WidgetBottomCartBinding widgetBottomCartBinding = this.binding;
        if (viewState instanceof BottomCartWidgetVO.ViewState.NoButtonsState) {
            ButtonV3View cartButton = widgetBottomCartBinding.cartButton;
            Intrinsics.checkNotNullExpressionValue(cartButton, "cartButton");
            ViewExtKt.gone(cartButton);
            ButtonV3View catalogButton = widgetBottomCartBinding.catalogButton;
            Intrinsics.checkNotNullExpressionValue(catalogButton, "catalogButton");
            ViewExtKt.gone(catalogButton);
            ConstraintLayout bottomCartLayout = widgetBottomCartBinding.bottomCartLayout;
            Intrinsics.checkNotNullExpressionValue(bottomCartLayout, "bottomCartLayout");
            ViewGroup.LayoutParams layoutParams = bottomCartLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = -2;
            bottomCartLayout.setLayoutParams(layoutParams);
            return;
        }
        if (viewState instanceof BottomCartWidgetVO.ViewState.TwoButtonState) {
            ButtonV3View buttonV3View = widgetBottomCartBinding.cartButton;
            Intrinsics.f(buttonV3View);
            BottomCartWidgetVO.ViewState.TwoButtonState twoButtonState = (BottomCartWidgetVO.ViewState.TwoButtonState) viewState;
            ButtonV3HolderKt.bindOrGone(buttonV3View, twoButtonState.getCartButton(), this.actionHandler);
            buttonV3View.setAlpha(1.0f);
            buttonV3View.setTranslationX(0.0f);
            ButtonV3View buttonV3View2 = widgetBottomCartBinding.catalogButton;
            Intrinsics.f(buttonV3View2);
            ButtonV3HolderKt.bindOrGone(buttonV3View2, twoButtonState.getCatalogButton(), this.actionHandler);
            ViewGroup.LayoutParams layoutParams2 = buttonV3View2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = getIconButtonWidth();
            buttonV3View2.setLayoutParams(layoutParams2);
            return;
        }
        if (viewState instanceof BottomCartWidgetVO.ViewState.CartButtonState) {
            ButtonV3View cartButton2 = widgetBottomCartBinding.cartButton;
            Intrinsics.checkNotNullExpressionValue(cartButton2, "cartButton");
            ButtonV3HolderKt.bindOrGone(cartButton2, ((BottomCartWidgetVO.ViewState.CartButtonState) viewState).getCartButton(), this.actionHandler);
            ConstraintLayout bottomCartLayout2 = widgetBottomCartBinding.bottomCartLayout;
            Intrinsics.checkNotNullExpressionValue(bottomCartLayout2, "bottomCartLayout");
            if (bottomCartLayout2.getVisibility() == 0) {
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(this.pathInterpolator);
            animatorSet.playTogether(getSlideUp(), getButtonShowAlphaAnimator());
            animatorSet.start();
            return;
        }
        if (!(viewState instanceof BottomCartWidgetVO.ViewState.CatalogButtonState)) {
            throw new o();
        }
        ButtonV3View buttonV3View3 = widgetBottomCartBinding.catalogButton;
        Intrinsics.f(buttonV3View3);
        ButtonV3HolderKt.bindOrGone(buttonV3View3, ((BottomCartWidgetVO.ViewState.CatalogButtonState) viewState).getCatalogButton(), this.actionHandler);
        ButtonV3View catalogButton2 = this.binding.catalogButton;
        Intrinsics.checkNotNullExpressionValue(catalogButton2, "catalogButton");
        ViewGroup.LayoutParams layoutParams3 = catalogButton2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.width = 0;
        catalogButton2.setLayoutParams(layoutParams3);
        ButtonV3View cartButton3 = widgetBottomCartBinding.cartButton;
        Intrinsics.checkNotNullExpressionValue(cartButton3, "cartButton");
        ViewExtKt.gone(cartButton3);
    }

    private final void showCartButton(final BottomCartWidgetVO vo, final ButtonV3DTO cartButtonV3DTO) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(this.pathInterpolator);
        animatorSet.playTogether(getWidthToIconButton(), getButtonShowAlphaAnimator(), getCartButtonFadeIn());
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.BottomCartWidgetViewHolder$showCartButton$lambda$9$$inlined$doOnStart$1
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
                WidgetBottomCartBinding widgetBottomCartBinding;
                widgetBottomCartBinding = BottomCartWidgetViewHolder.this.binding;
                ButtonV3View cartButton = widgetBottomCartBinding.cartButton;
                Intrinsics.checkNotNullExpressionValue(cartButton, "cartButton");
                ButtonV3HolderKt.bindOrGone$default(cartButton, cartButtonV3DTO, null, 2, null);
            }
        });
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.BottomCartWidgetViewHolder$showCartButton$lambda$9$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                i iVar;
                iVar = BottomCartWidgetViewHolder.this.refs;
                iVar.M().update(vo);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        animatorSet.start();
    }

    private final void slideDownButton(final BottomCartWidgetVO vo) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(this.pathInterpolator);
        animatorSet.playTogether(getSlideDown(), getButtonHideAlphaAnimator());
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.BottomCartWidgetViewHolder$slideDownButton$lambda$6$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                WidgetBottomCartBinding widgetBottomCartBinding;
                i iVar;
                widgetBottomCartBinding = BottomCartWidgetViewHolder.this.binding;
                ButtonV3View cartButton = widgetBottomCartBinding.cartButton;
                Intrinsics.checkNotNullExpressionValue(cartButton, "cartButton");
                ViewExtKt.gone(cartButton);
                iVar = BottomCartWidgetViewHolder.this.refs;
                iVar.M().update(vo);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        animatorSet.start();
    }

    private final void slideUpButton(final BottomCartWidgetVO vo, final ButtonV3DTO cartButton) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(this.pathInterpolator);
        animatorSet.playTogether(getSlideUp(), getButtonShowAlphaAnimator());
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.BottomCartWidgetViewHolder$slideUpButton$lambda$4$$inlined$doOnStart$1
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
                WidgetBottomCartBinding widgetBottomCartBinding;
                widgetBottomCartBinding = BottomCartWidgetViewHolder.this.binding;
                ButtonV3View cartButton2 = widgetBottomCartBinding.cartButton;
                Intrinsics.checkNotNullExpressionValue(cartButton2, "cartButton");
                ButtonV3HolderKt.bindOrGone$default(cartButton2, cartButton, null, 2, null);
            }
        });
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.BottomCartWidgetViewHolder$slideUpButton$lambda$4$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                i iVar;
                iVar = BottomCartWidgetViewHolder.this.refs;
                iVar.M().update(vo);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        animatorSet.start();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        this.viewModel.getWidgetState().observe(this, this.observer);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull BottomCartWidgetVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.viewModel.setAsyncData(item.getAsyncData());
        prepareLayout(item.getViewState());
    }
}
