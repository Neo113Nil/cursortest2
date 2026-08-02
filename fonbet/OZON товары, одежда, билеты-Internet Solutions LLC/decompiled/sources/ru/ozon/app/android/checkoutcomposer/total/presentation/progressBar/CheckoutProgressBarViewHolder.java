package ru.ozon.app.android.checkoutcomposer.total.presentation.progressBar;

import Sc.InterfaceC4008j;
import Yo.a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import ru.ozon.app.android.checkout.databinding.HighloadProgressBarBinding;
import ru.ozon.app.android.checkoutcomposer.total.models.CheckoutProgressBarVO;
import ru.ozon.app.android.checkoutcomposer.total.presentation.progressBar.CheckoutProgressBarViewHolder$onBackPressedCallback$2;
import ru.ozon.app.android.checkoutcomposer.utils.ExtensionsKt;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewState;
import ru.ozon.app.android.payment.ui.createorder.HandledState;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f*\u00011\b\u0001\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001BB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u000e*\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0019J\u000f\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u0019J\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u001a\u0010*\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u0010:R\u001b\u0010>\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00103\u001a\u0004\b=\u0010:R\u001b\u0010A\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00103\u001a\u0004\b@\u0010:¨\u0006C"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/presentation/progressBar/CheckoutProgressBarViewHolder;", "Ld20/b;", "Lru/ozon/app/android/checkoutcomposer/total/models/CheckoutProgressBarVO;", "Lru/ozon/app/android/checkout/databinding/HighloadProgressBarBinding;", "binding", "Ll10/i;", "container", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/checkout/databinding/HighloadProgressBarBinding;Ll10/i;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;)V", "Lru/ozon/app/android/payment/ui/createorder/HandledState;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;", "handledState", "", "onViewStateChanged", "(Lru/ozon/app/android/payment/ui/createorder/HandledState;)V", "Landroid/animation/AnimatorSet;", "startAnimation", "()Landroid/animation/AnimatorSet;", "Lkotlin/Function0;", "afterAnimation", "stopAnimation", "(Lkotlin/jvm/functions/Function0;)V", "cancelAnimations", "()V", "Landroid/view/WindowManager$LayoutParams;", "getOverlayLayoutParams", "()Landroid/view/WindowManager$LayoutParams;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtom", "bind", "(Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "onWidgetCreated", "onWidgetDestroyed", "item", "(Lru/ozon/app/android/checkoutcomposer/total/models/CheckoutProgressBarVO;)V", "Lru/ozon/app/android/checkout/databinding/HighloadProgressBarBinding;", "Ll10/i;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "metricView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMetricView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/ViewGroup;", "decorView", "Landroid/view/ViewGroup;", "ru/ozon/app/android/checkoutcomposer/total/presentation/progressBar/CheckoutProgressBarViewHolder$onBackPressedCallback$2$1", "onBackPressedCallback$delegate", "LSc/j;", "getOnBackPressedCallback", "()Lru/ozon/app/android/checkoutcomposer/total/presentation/progressBar/CheckoutProgressBarViewHolder$onBackPressedCallback$2$1;", "onBackPressedCallback", "Landroid/animation/ObjectAnimator;", "animatorStartStateBackground$delegate", "getAnimatorStartStateBackground", "()Landroid/animation/ObjectAnimator;", "animatorStartStateBackground", "animatorEndStateBackground$delegate", "getAnimatorEndStateBackground", "animatorEndStateBackground", "animatorBlinkTitle$delegate", "getAnimatorBlinkTitle", "animatorBlinkTitle", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckoutProgressBarViewHolder extends AbstractC6065b<CheckoutProgressBarVO> {

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
    private final HighloadProgressBarBinding binding;

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
    /* renamed from: ru.ozon.app.android.checkoutcomposer.total.presentation.progressBar.CheckoutProgressBarViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<HandledState<CreateAndPayViewState>, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HandledState<CreateAndPayViewState> handledState) {
            invoke2(handledState);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HandledState<CreateAndPayViewState> handledState) {
            CheckoutProgressBarViewHolder checkoutProgressBarViewHolder = CheckoutProgressBarViewHolder.this;
            Intrinsics.f(handledState);
            checkoutProgressBarViewHolder.onViewStateChanged(handledState);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/presentation/progressBar/CheckoutProgressBarViewHolder$Companion;", "", "<init>", "()V", "LETTER_SPACING_TITLE", "", "MIN_ALPHA_BLINK_TITLE", "MAX_ALPHA_BLINK_TITLE", "DURATION_ANIMATION_BLINK_TITLE", "", "DURATION_ANIMATION_ALPHA_BACKGROUND", "ALPHA_BACKGROUND_START", "ALPHA_BACKGROUND_LOADING", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CheckoutProgressBarViewHolder(@NotNull HighloadProgressBarBinding binding, @NotNull i container, @NotNull CreateAndPayViewModel viewModel) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.binding = binding;
        this.container = container;
        this.viewModel = viewModel;
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.metricView = root;
        Window actualWindow = ExtensionsKt.getActualWindow(container);
        View decorView = actualWindow != null ? actualWindow.getDecorView() : null;
        this.decorView = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        this.onBackPressedCallback = LazyUtilsKt.unsafeLazy(CheckoutProgressBarViewHolder$onBackPressedCallback$2.INSTANCE);
        this.animatorStartStateBackground = LazyUtilsKt.unsafeLazy(new CheckoutProgressBarViewHolder$animatorStartStateBackground$2(this));
        this.animatorEndStateBackground = LazyUtilsKt.unsafeLazy(new CheckoutProgressBarViewHolder$animatorEndStateBackground$2(this));
        this.animatorBlinkTitle = LazyUtilsKt.unsafeLazy(new CheckoutProgressBarViewHolder$animatorBlinkTitle$2(this));
        binding.getRoot().setOnClickListener(new a());
        viewModel.getViewState().observe(this, new CheckoutProgressBarViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(View view) {
    }

    private final void cancelAnimations() {
        getAnimatorBlinkTitle().cancel();
        getAnimatorStartStateBackground().cancel();
        getAnimatorEndStateBackground().cancel();
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
    public final CheckoutProgressBarViewHolder$onBackPressedCallback$2.AnonymousClass1 getOnBackPressedCallback() {
        return (CheckoutProgressBarViewHolder$onBackPressedCallback$2.AnonymousClass1) this.onBackPressedCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowManager.LayoutParams getOverlayLayoutParams() {
        return new WindowManager.LayoutParams(-1, -1, 2038, 256, -3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onViewStateChanged(HandledState<CreateAndPayViewState> handledState) {
        handledState.state(new CheckoutProgressBarViewHolder$onViewStateChanged$1(this));
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
        animatorEndStateBackground.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.checkoutcomposer.total.presentation.progressBar.CheckoutProgressBarViewHolder$stopAnimation$lambda$3$$inlined$doOnEnd$1
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
            viewGroup.removeView(this.binding.getRoot());
        }
        this.decorView = null;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull CheckoutProgressBarVO item) {
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
