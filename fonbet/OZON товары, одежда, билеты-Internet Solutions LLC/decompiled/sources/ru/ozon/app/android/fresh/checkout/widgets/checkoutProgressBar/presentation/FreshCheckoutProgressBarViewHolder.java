package ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation;

import Sc.InterfaceC4008j;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.fresh.checkout.databinding.FreshHighloadProgressBarBinding;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation.FreshCheckoutProgressBarViewHolder$onBackPressedCallback$2;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewState;
import ru.ozon.app.android.payment.ui.createorder.HandledState;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f*\u00014\b\u0001\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001EB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u000e*\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\u0019J\u000f\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010\u0019J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u001a\u0010-\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010=R\u001b\u0010A\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b@\u0010=R\u001b\u0010D\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00106\u001a\u0004\bC\u0010=¨\u0006F"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshCheckoutProgressBarViewHolder;", "Ld20/b;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshProgressBarVO;", "Lru/ozon/app/android/fresh/checkout/databinding/FreshHighloadProgressBarBinding;", "binding", "Ll10/i;", "container", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/fresh/checkout/databinding/FreshHighloadProgressBarBinding;Ll10/i;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;)V", "Lru/ozon/app/android/payment/ui/createorder/HandledState;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;", "handledState", "", "onViewStateChanged", "(Lru/ozon/app/android/payment/ui/createorder/HandledState;)V", "Landroid/animation/AnimatorSet;", "startAnimation", "()Landroid/animation/AnimatorSet;", "Lkotlin/Function0;", "afterAnimation", "stopAnimation", "(Lkotlin/jvm/functions/Function0;)V", "cancelAnimations", "()V", "Landroid/view/WindowManager$LayoutParams;", "getOverlayLayoutParams", "()Landroid/view/WindowManager$LayoutParams;", "Landroid/view/Window;", "getActualWindow", "(Ll10/i;)Landroid/view/Window;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtom", "bind", "(Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "onWidgetCreated", "onWidgetDestroyed", "item", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshProgressBarVO;)V", "Lru/ozon/app/android/fresh/checkout/databinding/FreshHighloadProgressBarBinding;", "Ll10/i;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "metricView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMetricView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/ViewGroup;", "decorView", "Landroid/view/ViewGroup;", "ru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshCheckoutProgressBarViewHolder$onBackPressedCallback$2$1", "onBackPressedCallback$delegate", "LSc/j;", "getOnBackPressedCallback", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshCheckoutProgressBarViewHolder$onBackPressedCallback$2$1;", "onBackPressedCallback", "Landroid/animation/ObjectAnimator;", "animatorStartStateBackground$delegate", "getAnimatorStartStateBackground", "()Landroid/animation/ObjectAnimator;", "animatorStartStateBackground", "animatorEndStateBackground$delegate", "getAnimatorEndStateBackground", "animatorEndStateBackground", "animatorBlinkTitle$delegate", "getAnimatorBlinkTitle", "animatorBlinkTitle", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshCheckoutProgressBarViewHolder extends AbstractC6065b<FreshProgressBarVO> {

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
    private final FreshHighloadProgressBarBinding binding;

    @NotNull
    private final i container;
    private ViewGroup decorView;

    @NotNull
    private final ConstraintLayout metricView;

    /* renamed from: onBackPressedCallback$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j onBackPressedCallback;

    @NotNull
    private final CreateAndPayViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "handledState", "Lru/ozon/app/android/payment/ui/createorder/HandledState;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/payment/ui/createorder/HandledState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation.FreshCheckoutProgressBarViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<HandledState<CreateAndPayViewState>, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HandledState<CreateAndPayViewState> handledState) {
            invoke2(handledState);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HandledState<CreateAndPayViewState> handledState) {
            FreshCheckoutProgressBarViewHolder freshCheckoutProgressBarViewHolder = FreshCheckoutProgressBarViewHolder.this;
            Intrinsics.f(handledState);
            freshCheckoutProgressBarViewHolder.onViewStateChanged(handledState);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshCheckoutProgressBarViewHolder$Companion;", "", "<init>", "()V", "LETTER_SPACING_TITLE", "", "MIN_ALPHA_BLINK_TITLE", "MAX_ALPHA_BLINK_TITLE", "DURATION_ANIMATION_BLINK_TITLE", "", "DURATION_ANIMATION_ALPHA_BACKGROUND", "ALPHA_BACKGROUND_START", "ALPHA_BACKGROUND_LOADING", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FreshCheckoutProgressBarViewHolder(@NotNull FreshHighloadProgressBarBinding binding, @NotNull i container, @NotNull CreateAndPayViewModel viewModel) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.binding = binding;
        this.container = container;
        this.viewModel = viewModel;
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.metricView = constraintLayout;
        Window actualWindow = getActualWindow(container);
        View decorView = actualWindow != null ? actualWindow.getDecorView() : null;
        this.decorView = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        this.onBackPressedCallback = LazyUtilsKt.unsafeLazy(FreshCheckoutProgressBarViewHolder$onBackPressedCallback$2.INSTANCE);
        this.animatorStartStateBackground = LazyUtilsKt.unsafeLazy(new FreshCheckoutProgressBarViewHolder$animatorStartStateBackground$2(this));
        this.animatorEndStateBackground = LazyUtilsKt.unsafeLazy(new FreshCheckoutProgressBarViewHolder$animatorEndStateBackground$2(this));
        this.animatorBlinkTitle = LazyUtilsKt.unsafeLazy(new FreshCheckoutProgressBarViewHolder$animatorBlinkTitle$2(this));
        binding.getConstraintLayout().setOnClickListener(null);
        viewModel.getViewState().observe(this, new FreshCheckoutProgressBarViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
    }

    private final void cancelAnimations() {
        getAnimatorBlinkTitle().cancel();
        getAnimatorStartStateBackground().cancel();
        getAnimatorEndStateBackground().cancel();
    }

    private final Window getActualWindow(i iVar) {
        Dialog dialog;
        Window window;
        ComponentCallbacksC5392m j11 = iVar.Q().j();
        ComposerFragment composerFragment = j11 instanceof ComposerFragment ? (ComposerFragment) j11 : null;
        ComponentCallbacksC5392m parentFragment = composerFragment != null ? composerFragment.getParentFragment() : null;
        BottomSheetComposerFragment bottomSheetComposerFragment = parentFragment instanceof BottomSheetComposerFragment ? (BottomSheetComposerFragment) parentFragment : null;
        if (bottomSheetComposerFragment != null && (dialog = bottomSheetComposerFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
            return window;
        }
        r a11 = iVar.Q().a();
        if (a11 != null) {
            return a11.getWindow();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ObjectAnimator getAnimatorBlinkTitle() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final FreshCheckoutProgressBarViewHolder$onBackPressedCallback$2.AnonymousClass1 getOnBackPressedCallback() {
        return (FreshCheckoutProgressBarViewHolder$onBackPressedCallback$2.AnonymousClass1) this.onBackPressedCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowManager.LayoutParams getOverlayLayoutParams() {
        return new WindowManager.LayoutParams(-1, -1, 2038, 256, -3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onViewStateChanged(HandledState<CreateAndPayViewState> handledState) {
        handledState.state(new FreshCheckoutProgressBarViewHolder$onViewStateChanged$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnimatorSet startAnimation() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(getAnimatorStartStateBackground(), getAnimatorBlinkTitle());
        animatorSet.start();
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopAnimation(final Function0<Unit> afterAnimation) {
        getAnimatorStartStateBackground().cancel();
        ObjectAnimator animatorEndStateBackground = getAnimatorEndStateBackground();
        animatorEndStateBackground.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation.FreshCheckoutProgressBarViewHolder$stopAnimation$lambda$2$$inlined$doOnEnd$1
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

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        r a11 = this.container.Q().a();
        if (a11 == null) {
            return;
        }
        a11.getOnBackPressedDispatcher().h(this, getOnBackPressedCallback());
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        cancelAnimations();
        getOnBackPressedCallback().setEnabled(false);
        getOnBackPressedCallback().remove();
        ViewGroup viewGroup = this.decorView;
        if (viewGroup != null) {
            viewGroup.removeView(this.binding.getConstraintLayout());
        }
        this.decorView = null;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull FreshProgressBarVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        cancelAnimations();
        TextAtomView titleTextAtomView = this.binding.titleTextAtomView;
        Intrinsics.checkNotNullExpressionValue(titleTextAtomView, "titleTextAtomView");
        bind(titleTextAtomView, item.getText());
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public ConstraintLayout getMetricView() {
        return this.metricView;
    }

    private final void bind(TextAtomView textAtomView, TextAtom textAtom) {
        TextAtomHolderKt.bindOrGone$default(textAtomView, textAtom, null, 2, null);
        textAtomView.setEllipsize(TextUtils.TruncateAt.END);
        textAtomView.setLetterSpacing(0.0f);
    }
}
