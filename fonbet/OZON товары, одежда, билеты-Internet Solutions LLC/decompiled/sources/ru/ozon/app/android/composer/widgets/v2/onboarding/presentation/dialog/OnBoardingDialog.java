package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.C;
import androidx.activity.J;
import androidx.activity.s;
import androidx.core.content.a;
import androidx.core.os.d;
import androidx.core.view.Y;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.b0;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.composer.R$style;
import ru.ozon.app.android.composer.databinding.LayoutOnboardingBinding;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.DaggerOnboardingDialogComponent;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnboardingDialogComponent;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingResultState;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\b*\u0001K\b\u0001\u0018\u0000 Q2\u00020\u0001:\u0001QB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001c\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\u0003J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J-\u0010-\u001a\u0004\u0018\u00010\u00132\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u00062\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00132\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001dH\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0004H\u0016¢\u0006\u0004\b4\u0010\u0003J\u001f\u00105\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b5\u0010\u000bR\"\u00107\u001a\u0002068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006R"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialog;", "Landroidx/fragment/app/k;", "<init>", "()V", "", "bind", "Landroid/view/ViewGroup;", "rootViewGroup", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialogCutConfig;", "onBoardingCutConfig", "updateVerticalParams", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialogCutConfig;)V", "onboardingCutConfig", "", DynamicElementDTO.TIMER, "startAnimation", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialogCutConfig;Ljava/lang/Long;)V", "configureAnimationsAndStart", "(Ljava/lang/Long;)V", "Landroid/view/View;", "rootView", "onboardingSize", "createOnBoardingBackground", "(Landroid/view/View;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialogCutConfig;)V", "Landroid/animation/Animator;", "fadeInAnimator", "(Landroid/view/View;)Landroid/animation/Animator;", "", "isBannerTopPosition", "", "topMarginBanner", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialogCutConfig;Z)I", "topMarginTriangle", "rootViewHeight", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialogCutConfig;I)Z", "setShownResultAndDismiss", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "getTheme", "()I", "onDestroyView", "updateVerticalConfig", "Lru/ozon/app/android/network/version/AppVersionService;", "appVersionService", "Lru/ozon/app/android/network/version/AppVersionService;", "getAppVersionService", "()Lru/ozon/app/android/network/version/AppVersionService;", "setAppVersionService", "(Lru/ozon/app/android/network/version/AppVersionService;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnboardingDialogViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnboardingDialogViewModel;", "viewModel", "Landroid/animation/AnimatorSet;", "onBoardingAnimation", "Landroid/animation/AnimatorSet;", "Lru/ozon/app/android/composer/databinding/LayoutOnboardingBinding;", "_binding", "Lru/ozon/app/android/composer/databinding/LayoutOnboardingBinding;", "isShown", "Z", "ru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialog$onBackPressedCallback$1", "onBackPressedCallback", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialog$onBackPressedCallback$1;", "getBinding", "()Lru/ozon/app/android/composer/databinding/LayoutOnboardingBinding;", "binding", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"LifecycleMethodsOrder"})
/* loaded from: classes11.dex */
public final class OnBoardingDialog extends DialogInterfaceOnCancelListenerC5390k {
    private LayoutOnboardingBinding _binding;
    public AppVersionService appVersionService;
    private boolean isShown;

    @NotNull
    private final OnBoardingDialog$onBackPressedCallback$1 onBackPressedCallback;
    private AnimatorSet onBoardingAnimation;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final float DEFAULT_CUT_CORNER_RADIUS = UiExtKt.toPxF(12);
    private static final float DEFAULT_BANNER_RADIUS = UiExtKt.toPxF(CornerRadius.RADIUS_500.getPx());
    private static final float SELECT_BANNER_RADIUS = UiExtKt.toPxF(CornerRadius.RADIUS_550.getPx());
    private static final int BANNER_PADDING = UiExtKt.toPx(16);
    private static final int BANNER_PADDING_API_25 = UiExtKt.toPx(37);
    private static final int TRIANGLE_TOP_SEPARATOR = UiExtKt.toPx(18);
    private static final int TRIANGLE_BOTTOM_SEPARATOR = UiExtKt.toPx(8);
    private static final int TOP_SAFE_AREA = UiExtKt.toPx(24);
    private static final int SELECT_TRIANGLE_TOP_MARGIN = UiExtKt.toPx(1);

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialog$Companion;", "", "<init>", "()V", "REQUEST_CODE", "", "EXTRA_ON_BOARDING_STATE", "EXTRA_SIZE", "EXTRA_BANNER", "FADE_IN_DURATION", "", "DEFAULT_CUT_CORNER_RADIUS", "", "DEFAULT_BANNER_RADIUS", "SELECT_BANNER_RADIUS", "BANNER_PADDING", "", "BANNER_PADDING_API_25", "TRIANGLE_TOP_SEPARATOR", "TRIANGLE_BOTTOM_SEPARATOR", "TOP_SAFE_AREA", "SELECT_TRIANGLE_TOP_MARGIN", "newInstance", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialog;", "onboardingCutConfig", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialogCutConfig;", "onBoardingDTO", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OnBoardingDialog newInstance(@NotNull OnBoardingDialogCutConfig onboardingCutConfig, @NotNull OnBoardingDTO onBoardingDTO) {
            Intrinsics.checkNotNullParameter(onboardingCutConfig, "onboardingCutConfig");
            Intrinsics.checkNotNullParameter(onBoardingDTO, "onBoardingDTO");
            OnBoardingDialog onBoardingDialog = new OnBoardingDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("onBoarding_banner_view", onBoardingDTO);
            bundle.putParcelable("onBoarding_size", onboardingCutConfig);
            onBoardingDialog.setArguments(bundle);
            return onBoardingDialog;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingDialog$onBackPressedCallback$1] */
    public OnBoardingDialog() {
        InterfaceC4008j a11 = k.a(n.NONE, new OnBoardingDialog$special$$inlined$viewModels$default$2(new OnBoardingDialog$special$$inlined$viewModels$default$1(this)));
        this.viewModel = b0.b(this, N.b(OnboardingDialogViewModel.class), new OnBoardingDialog$special$$inlined$viewModels$default$3(a11), new OnBoardingDialog$special$$inlined$viewModels$default$4(null, a11), new OnBoardingDialog$special$$inlined$viewModels$default$5(this, a11));
        this.onBackPressedCallback = new C() { // from class: ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingDialog$onBackPressedCallback$1
            {
                super(true);
            }

            @Override // androidx.activity.C
            public void handleOnBackPressed() {
                OnBoardingDialog.this.setShownResultAndDismiss();
            }
        };
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bind() {
        final LayoutOnboardingBinding binding = getBinding();
        Bundle arguments = getArguments();
        final OnBoardingDialogCutConfig onBoardingDialogCutConfig = arguments != null ? (OnBoardingDialogCutConfig) arguments.getParcelable("onBoarding_size") : null;
        Bundle arguments2 = getArguments();
        OnBoardingDTO onBoardingDTO = arguments2 != null ? (OnBoardingDTO) arguments2.getParcelable("onBoarding_banner_view") : null;
        ViewGroup rootView = ContextExtKt.getRootView(requireActivity());
        final ViewGroup viewGroup = rootView != null ? (ViewGroup) rootView.findViewById(R.id.content) : null;
        if (viewGroup == null || onBoardingDialogCutConfig == null || onBoardingDTO == null) {
            dismiss();
            return;
        }
        binding.bannerObv.bind(onBoardingDTO, new OnBoardingDialog$bind$1$1(this));
        OnBoardingBannerView bannerObv = binding.bannerObv;
        Intrinsics.checkNotNullExpressionValue(bannerObv, "bannerObv");
        int i11 = Y.f42258g;
        if (!bannerObv.isLaidOut() || bannerObv.isLayoutRequested()) {
            bannerObv.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingDialog$bind$lambda$7$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    OnBoardingDialog.this.updateVerticalParams(viewGroup, onBoardingDialogCutConfig);
                    OnBoardingBannerView bannerObv2 = binding.bannerObv;
                    Intrinsics.checkNotNullExpressionValue(bannerObv2, "bannerObv");
                    bannerObv2.addOnLayoutChangeListener(new OnBoardingDialog$bind$lambda$7$lambda$6$$inlined$doOnNextLayout$1(OnBoardingDialog.this, viewGroup, onBoardingDialogCutConfig));
                    ImageView triangleIv = binding.triangleIv;
                    Intrinsics.checkNotNullExpressionValue(triangleIv, "triangleIv");
                    ViewGroup.LayoutParams layoutParams = triangleIv.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.leftMargin = ((onBoardingDialogCutConfig.getLeft() + onBoardingDialogCutConfig.getRight()) - layoutParams2.width) / 2;
                    triangleIv.setLayoutParams(layoutParams2);
                    binding.tapOnboardingArea.setOnTouchListener(new OnBoardingDialog$bind$1$2$3(OnBoardingDialog.this));
                }
            });
        } else {
            updateVerticalParams(viewGroup, onBoardingDialogCutConfig);
            OnBoardingBannerView bannerObv2 = binding.bannerObv;
            Intrinsics.checkNotNullExpressionValue(bannerObv2, "bannerObv");
            bannerObv2.addOnLayoutChangeListener(new OnBoardingDialog$bind$lambda$7$lambda$6$$inlined$doOnNextLayout$1(this, viewGroup, onBoardingDialogCutConfig));
            ImageView triangleIv = binding.triangleIv;
            Intrinsics.checkNotNullExpressionValue(triangleIv, "triangleIv");
            ViewGroup.LayoutParams layoutParams = triangleIv.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = ((onBoardingDialogCutConfig.getLeft() + onBoardingDialogCutConfig.getRight()) - layoutParams2.width) / 2;
            triangleIv.setLayoutParams(layoutParams2);
            binding.tapOnboardingArea.setOnTouchListener(new OnBoardingDialog$bind$1$2$3(this));
        }
        OnBoardingDTO.Options options = onBoardingDTO.getOptions();
        startAnimation(onBoardingDialogCutConfig, options != null ? options.getHideTimer() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureAnimationsAndStart(final Long timer) {
        final LayoutOnboardingBinding binding = getBinding();
        AnimatorSet animatorSet = new AnimatorSet();
        OnBoardingBannerView bannerObv = binding.bannerObv;
        Intrinsics.checkNotNullExpressionValue(bannerObv, "bannerObv");
        Animator fadeInAnimator = fadeInAnimator(bannerObv);
        ImageView triangleIv = binding.triangleIv;
        Intrinsics.checkNotNullExpressionValue(triangleIv, "triangleIv");
        animatorSet.playTogether(fadeInAnimator, fadeInAnimator(triangleIv));
        AnimatorSet animatorSet2 = new AnimatorSet();
        FrameLayout rootFl = binding.rootFl;
        Intrinsics.checkNotNullExpressionValue(rootFl, "rootFl");
        animatorSet2.playSequentially(fadeInAnimator(rootFl), animatorSet);
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingDialog$configureAnimationsAndStart$lambda$16$lambda$15$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                OnboardingDialogViewModel viewModel;
                viewModel = OnBoardingDialog.this.getViewModel();
                viewModel.startTimer(timer);
                FrameLayout frameLayout = binding.rootFl;
                final OnBoardingDialog onBoardingDialog = OnBoardingDialog.this;
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingDialog$configureAnimationsAndStart$1$1$1$1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnBoardingDialog.this.setShownResultAndDismiss();
                    }
                });
                OnBoardingDialog.this.isShown = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        animatorSet2.start();
        this.onBoardingAnimation = animatorSet2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createOnBoardingBackground(View rootView, OnBoardingDialogCutConfig onboardingSize) {
        Rect rect = new Rect(onboardingSize.getLeft(), onboardingSize.getTop(), onboardingSize.getRight(), onboardingSize.getBottom());
        Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(a.getColor(requireContext(), R$color.oz_semantic_dimming));
        RectF rectF = new RectF(rect);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Float cornerRadius = onboardingSize.getCornerRadius();
        float floatValue = cornerRadius != null ? cornerRadius.floatValue() : DEFAULT_CUT_CORNER_RADIUS;
        canvas.drawRoundRect(rectF, floatValue, floatValue, paint);
        int right = onboardingSize.getRight() - onboardingSize.getLeft();
        int bottom = onboardingSize.getBottom() - onboardingSize.getTop();
        View tapOnboardingArea = getBinding().tapOnboardingArea;
        Intrinsics.checkNotNullExpressionValue(tapOnboardingArea, "tapOnboardingArea");
        ViewGroup.LayoutParams layoutParams = tapOnboardingArea.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = right;
        layoutParams2.height = bottom;
        layoutParams2.leftMargin = onboardingSize.getLeft();
        layoutParams2.topMargin = onboardingSize.getTop();
        tapOnboardingArea.setLayoutParams(layoutParams2);
        FrameLayout frameLayout = getBinding().rootFl;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        frameLayout.setBackground(new BitmapDrawable(resources, createBitmap));
    }

    private final Animator fadeInAnimator(final View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        Intrinsics.f(ofFloat);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingDialog$fadeInAnimator$lambda$22$$inlined$doOnStart$1
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
                view.setVisibility(0);
            }
        });
        ofFloat.setDuration(500L);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    private final LayoutOnboardingBinding getBinding() {
        LayoutOnboardingBinding layoutOnboardingBinding = this._binding;
        Intrinsics.f(layoutOnboardingBinding);
        return layoutOnboardingBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnboardingDialogViewModel getViewModel() {
        return (OnboardingDialogViewModel) this.viewModel.getValue();
    }

    private final boolean isBannerTopPosition(OnBoardingDialogCutConfig onBoardingCutConfig, int rootViewHeight) {
        if (onBoardingCutConfig.getIsBannerTopPosition()) {
            return (onBoardingCutConfig.getTop() - getBinding().bannerObv.getHeight()) - BANNER_PADDING >= TOP_SAFE_AREA;
        }
        return (getBinding().bannerObv.getHeight() + onBoardingCutConfig.getBottom()) + BANNER_PADDING > rootViewHeight - TOP_SAFE_AREA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShownResultAndDismiss() {
        getParentFragmentManager().m1(d.b(new Pair("onBoardingState", new OnBoardingResultState.Shown(true))), "OnboardingResultFragment");
        dismiss();
    }

    private final void startAnimation(final OnBoardingDialogCutConfig onboardingCutConfig, final Long timer) {
        try {
            FrameLayout rootFl = getBinding().rootFl;
            Intrinsics.checkNotNullExpressionValue(rootFl, "rootFl");
            int i11 = Y.f42258g;
            if (!rootFl.isLaidOut() || rootFl.isLayoutRequested()) {
                rootFl.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingDialog$startAnimation$lambda$12$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        OnBoardingDialog.this.createOnBoardingBackground(view, onboardingCutConfig);
                        OnBoardingDialog.this.configureAnimationsAndStart(timer);
                    }
                });
            } else {
                createOnBoardingBackground(rootFl, onboardingCutConfig);
                configureAnimationsAndStart(timer);
            }
        } catch (Throwable th2) {
            Lm0.a.f17149a.e(th2);
            this.isShown = false;
            dismissAllowingStateLoss();
        }
    }

    private final int topMarginBanner(OnBoardingDialogCutConfig onBoardingCutConfig, boolean isBannerTopPosition) {
        if (!isBannerTopPosition) {
            return onBoardingCutConfig.getBottom() + BANNER_PADDING;
        }
        return (onBoardingCutConfig.getTop() - getBinding().bannerObv.getHeight()) - BANNER_PADDING;
    }

    private final int topMarginTriangle(OnBoardingDialogCutConfig onBoardingCutConfig, boolean isBannerTopPosition) {
        int i11 = AppVersionService.INSTANCE.isSelect(getAppVersionService()) ? SELECT_TRIANGLE_TOP_MARGIN : 0;
        return isBannerTopPosition ? (onBoardingCutConfig.getTop() - TRIANGLE_TOP_SEPARATOR) - i11 : ((onBoardingCutConfig.getBottom() + BANNER_PADDING) - TRIANGLE_BOTTOM_SEPARATOR) + i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateVerticalParams(ViewGroup rootViewGroup, OnBoardingDialogCutConfig onBoardingCutConfig) {
        LayoutOnboardingBinding binding = getBinding();
        boolean isBannerTopPosition = isBannerTopPosition(onBoardingCutConfig, rootViewGroup != null ? rootViewGroup.getHeight() : 0);
        OnBoardingBannerView bannerObv = binding.bannerObv;
        Intrinsics.checkNotNullExpressionValue(bannerObv, "bannerObv");
        ViewGroup.LayoutParams layoutParams = bannerObv.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = topMarginBanner(onBoardingCutConfig, isBannerTopPosition);
        bannerObv.setLayoutParams(layoutParams2);
        ImageView triangleIv = binding.triangleIv;
        Intrinsics.checkNotNullExpressionValue(triangleIv, "triangleIv");
        ViewGroup.LayoutParams layoutParams3 = triangleIv.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        binding.triangleIv.setRotation(isBannerTopPosition ? 0.0f : 180.0f);
        layoutParams4.topMargin = topMarginTriangle(onBoardingCutConfig, isBannerTopPosition);
        triangleIv.setLayoutParams(layoutParams4);
    }

    @NotNull
    public final AppVersionService getAppVersionService() {
        AppVersionService appVersionService = this.appVersionService;
        if (appVersionService != null) {
            return appVersionService;
        }
        Intrinsics.n("appVersionService");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public int getTheme() {
        return R$style.ComposerOnboardingDialogTheme;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        OnboardingDialogComponent.Factory factory = DaggerOnboardingDialogComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        factory.create((NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class)).inject(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (savedInstanceState != null) {
            dismiss();
            return null;
        }
        LayoutOnboardingBinding inflate = LayoutOnboardingBinding.inflate(inflater, container, false);
        OnBoardingBannerView onBoardingBannerView = inflate.bannerObv;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AppVersionService.INSTANCE.isSelect(getAppVersionService()) ? SELECT_BANNER_RADIUS : DEFAULT_BANNER_RADIUS);
        gradientDrawable.setColor(a.getColor(requireContext(), R$color.oz_semantic_bg_secondary));
        onBoardingBannerView.setBackground(gradientDrawable);
        this._binding = inflate;
        return getBinding().getConstraintLayout();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        this._binding = null;
        AnimatorSet animatorSet = this.onBoardingAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.onBoardingAnimation = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        J onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        bind();
        getViewModel().getTimerEndEvent().observe(getViewLifecycleOwner(), new OnBoardingDialog$sam$androidx_lifecycle_Observer$0(new OnBoardingDialog$onViewCreated$1(this)));
        Dialog dialog = getDialog();
        s sVar = dialog instanceof s ? (s) dialog : null;
        if (sVar == null || (onBackPressedDispatcher = sVar.getOnBackPressedDispatcher()) == null) {
            return;
        }
        OnBoardingDialog$onBackPressedCallback$1 onBackPressedCallback = this.onBackPressedCallback;
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        onBackPressedDispatcher.i(onBackPressedCallback);
    }

    public final void updateVerticalConfig(ViewGroup rootViewGroup, @NotNull OnBoardingDialogCutConfig onBoardingCutConfig) {
        Intrinsics.checkNotNullParameter(onBoardingCutConfig, "onBoardingCutConfig");
        LayoutOnboardingBinding layoutOnboardingBinding = this._binding;
        if (layoutOnboardingBinding != null) {
            updateVerticalParams(rootViewGroup, onBoardingCutConfig);
            View tapOnboardingArea = layoutOnboardingBinding.tapOnboardingArea;
            Intrinsics.checkNotNullExpressionValue(tapOnboardingArea, "tapOnboardingArea");
            ViewGroup.LayoutParams layoutParams = tapOnboardingArea.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = onBoardingCutConfig.getTop();
            tapOnboardingArea.setLayoutParams(layoutParams2);
        }
    }
}
