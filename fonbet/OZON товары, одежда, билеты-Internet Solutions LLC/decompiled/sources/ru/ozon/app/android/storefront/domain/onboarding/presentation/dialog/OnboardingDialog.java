package ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog;

import Lm0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.os.d;
import androidx.core.view.Y;
import androidx.fragment.app.C5402x;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.b0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;
import ru.ozon.app.android.storefront.domain.onboarding.R$layout;
import ru.ozon.app.android.storefront.domain.onboarding.R$style;
import ru.ozon.app.android.storefront.domain.onboarding.databinding.StorefrontLayoutOnboardingBinding;
import ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog.OnboardingDialog;
import ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog.OnboardingResultState;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ColorExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 B2\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u0006*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020!2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010#J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010%J-\u0010,\u001a\u0004\u0018\u00010\r2\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J!\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020!H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\u0003J\u0015\u00104\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b4\u0010\fR\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010A¨\u0006C"}, d2 = {"Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingDialog;", "Landroidx/fragment/app/k;", "<init>", "()V", "", "isShown", "", "bind", "(Z)V", "Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingDialogCutConfig;", "onBoardingCutConfig", "updateVerticalParams", "(Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingDialogCutConfig;)V", "Landroid/view/View;", "rootViewGroup", "onboardingCutConfig", "startAnimation", "(Landroid/view/View;Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingDialogCutConfig;)V", "configureAnimationsAndStart", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "block", "takeScreenshot", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Landroid/widget/ImageView;", "underlyingBitmap", "onboardingSize", "drawOnBoardingArea", "(Landroid/widget/ImageView;Landroid/graphics/Bitmap;Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingDialogCutConfig;)V", "Landroid/animation/Animator;", "fadeInAnimator", "(Landroid/view/View;)Landroid/animation/Animator;", "isBannerTopPosition", "", "topMarginBanner", "(Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingDialogCutConfig;Z)I", "topMarginTriangle", "(Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingDialogCutConfig;)Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "getTheme", "()I", "onDestroyView", "updateVerticalConfig", "Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingDialogViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingDialogViewModel;", "viewModel", "Landroid/animation/AnimatorSet;", "onBoardingAnimation", "Landroid/animation/AnimatorSet;", "Lru/ozon/app/android/storefront/domain/onboarding/databinding/StorefrontLayoutOnboardingBinding;", "binding", "Lru/ozon/app/android/storefront/domain/onboarding/databinding/StorefrontLayoutOnboardingBinding;", "Z", "Companion", "onboarding_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnboardingDialog extends DialogInterfaceOnCancelListenerC5390k {
    private StorefrontLayoutOnboardingBinding binding;
    private boolean isShown;
    private AnimatorSet onBoardingAnimation;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int BANNER_PADDING = UiExtKt.toPx(16);
    private static final int TRIANGLE_BANNER_INTERSECT_AREA = UiExtKt.toPx(1);
    private static final int TOP_SAFE_AREA = UiExtKt.toPx(24);

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingDialog$Companion;", "", "<init>", "()V", "REQUEST_CODE", "", "EXTRA_ON_BOARDING_STATE", "EXTRA_SIZE", "EXTRA_BANNER", "FADE_IN_DURATION", "", "BANNER_PADDING", "", "TRIANGLE_BANNER_INTERSECT_AREA", "TOP_SAFE_AREA", "newInstance", "Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingDialog;", "onboardingCutConfig", "Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingDialogCutConfig;", "onboardingModel", "Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "onboarding_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OnboardingDialog newInstance(@NotNull OnboardingDialogCutConfig onboardingCutConfig, @NotNull OnboardingModel onboardingModel) {
            Intrinsics.checkNotNullParameter(onboardingCutConfig, "onboardingCutConfig");
            Intrinsics.checkNotNullParameter(onboardingModel, "onboardingModel");
            OnboardingDialog onboardingDialog = new OnboardingDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("onBoarding_banner_view", onboardingModel);
            bundle.putParcelable("onBoarding_size", onboardingCutConfig);
            onboardingDialog.setArguments(bundle);
            return onboardingDialog;
        }

        private Companion() {
        }
    }

    public OnboardingDialog() {
        super(R$layout.storefront_layout_onboarding);
        InterfaceC4008j a11 = k.a(n.NONE, new OnboardingDialog$special$$inlined$viewModels$default$2(new OnboardingDialog$special$$inlined$viewModels$default$1(this)));
        this.viewModel = b0.b(this, N.b(OnboardingDialogViewModel.class), new OnboardingDialog$special$$inlined$viewModels$default$3(a11), new OnboardingDialog$special$$inlined$viewModels$default$4(null, a11), new OnboardingDialog$special$$inlined$viewModels$default$5(this, a11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public final void bind(boolean isShown) {
        final StorefrontLayoutOnboardingBinding storefrontLayoutOnboardingBinding = this.binding;
        if (storefrontLayoutOnboardingBinding == null || isShown) {
            return;
        }
        Bundle arguments = getArguments();
        final OnboardingDialogCutConfig onboardingDialogCutConfig = arguments != null ? (OnboardingDialogCutConfig) arguments.getParcelable("onBoarding_size") : null;
        Bundle arguments2 = getArguments();
        OnboardingModel onboardingModel = arguments2 != null ? (OnboardingModel) arguments2.getParcelable("onBoarding_banner_view") : null;
        ViewGroup rootView = ContextExtKt.getRootView(requireActivity());
        ViewGroup viewGroup = rootView != null ? (ViewGroup) rootView.findViewById(R.id.content) : null;
        if (viewGroup == null || onboardingDialogCutConfig == null || onboardingModel == null) {
            dismiss();
            return;
        }
        storefrontLayoutOnboardingBinding.bannerObv.bind(onboardingModel, new OnboardingDialog$bind$1$1(this));
        OnboardingBannerView bannerObv = storefrontLayoutOnboardingBinding.bannerObv;
        Intrinsics.checkNotNullExpressionValue(bannerObv, "bannerObv");
        int i11 = Y.f42258g;
        if (!bannerObv.isLaidOut() || bannerObv.isLayoutRequested()) {
            bannerObv.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog.OnboardingDialog$bind$lambda$4$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    OnboardingDialog.this.updateVerticalParams(onboardingDialogCutConfig);
                    storefrontLayoutOnboardingBinding.bannerObv.post(new OnboardingDialog$bind$1$2$1(OnboardingDialog.this, onboardingDialogCutConfig));
                    ImageView triangleIv = storefrontLayoutOnboardingBinding.triangleIv;
                    Intrinsics.checkNotNullExpressionValue(triangleIv, "triangleIv");
                    ViewGroup.LayoutParams layoutParams = triangleIv.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.leftMargin = (((onboardingDialogCutConfig.getRight() - onboardingDialogCutConfig.getLeft()) / 2) + onboardingDialogCutConfig.getLeft()) - (storefrontLayoutOnboardingBinding.triangleIv.getMeasuredWidth() / 2);
                    triangleIv.setLayoutParams(layoutParams2);
                    storefrontLayoutOnboardingBinding.cutDetailIv.setOnTouchListener(new OnboardingDialog$bind$1$2$3(OnboardingDialog.this));
                }
            });
        } else {
            updateVerticalParams(onboardingDialogCutConfig);
            storefrontLayoutOnboardingBinding.bannerObv.post(new OnboardingDialog$bind$1$2$1(this, onboardingDialogCutConfig));
            ImageView triangleIv = storefrontLayoutOnboardingBinding.triangleIv;
            Intrinsics.checkNotNullExpressionValue(triangleIv, "triangleIv");
            ViewGroup.LayoutParams layoutParams = triangleIv.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = (((onboardingDialogCutConfig.getRight() - onboardingDialogCutConfig.getLeft()) / 2) + onboardingDialogCutConfig.getLeft()) - (storefrontLayoutOnboardingBinding.triangleIv.getMeasuredWidth() / 2);
            triangleIv.setLayoutParams(layoutParams2);
            storefrontLayoutOnboardingBinding.cutDetailIv.setOnTouchListener(new OnboardingDialog$bind$1$2$3(this));
        }
        startAnimation(viewGroup, onboardingDialogCutConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureAnimationsAndStart() {
        final StorefrontLayoutOnboardingBinding storefrontLayoutOnboardingBinding = this.binding;
        if (storefrontLayoutOnboardingBinding == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        OnboardingBannerView bannerObv = storefrontLayoutOnboardingBinding.bannerObv;
        Intrinsics.checkNotNullExpressionValue(bannerObv, "bannerObv");
        Animator fadeInAnimator = fadeInAnimator(bannerObv);
        ImageView triangleIv = storefrontLayoutOnboardingBinding.triangleIv;
        Intrinsics.checkNotNullExpressionValue(triangleIv, "triangleIv");
        animatorSet.playTogether(fadeInAnimator, fadeInAnimator(triangleIv));
        AnimatorSet animatorSet2 = new AnimatorSet();
        FrameLayout rootFl = storefrontLayoutOnboardingBinding.rootFl;
        Intrinsics.checkNotNullExpressionValue(rootFl, "rootFl");
        Animator fadeInAnimator2 = fadeInAnimator(rootFl);
        ImageView cutDetailIv = storefrontLayoutOnboardingBinding.cutDetailIv;
        Intrinsics.checkNotNullExpressionValue(cutDetailIv, "cutDetailIv");
        animatorSet2.playSequentially(fadeInAnimator2, fadeInAnimator(cutDetailIv), animatorSet);
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog.OnboardingDialog$configureAnimationsAndStart$lambda$12$lambda$11$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                OnboardingDialogViewModel viewModel;
                boolean z11;
                FrameLayout frameLayout = StorefrontLayoutOnboardingBinding.this.rootFl;
                final OnboardingDialog onboardingDialog = this;
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog.OnboardingDialog$configureAnimationsAndStart$1$1$1$1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OnboardingDialog.this.dismiss();
                    }
                });
                viewModel = this.getViewModel();
                viewModel.onShowComplete();
                this.isShown = true;
                OnboardingDialog onboardingDialog2 = this;
                z11 = this.isShown;
                C5402x.a(d.b(new Pair("onBoardingState", new OnboardingResultState.Shown(z11))), onboardingDialog2, "OnboardingResultFragment");
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
    public final void drawOnBoardingArea(ImageView imageView, Bitmap bitmap, OnboardingDialogCutConfig onboardingDialogCutConfig) {
        Context context = imageView.getContext();
        int statusBarHeight = context != null ? ResourceExtKt.getStatusBarHeight(context) : 0;
        Rect rect = new Rect(onboardingDialogCutConfig.getLeft(), onboardingDialogCutConfig.getTop() + statusBarHeight, onboardingDialogCutConfig.getRight(), onboardingDialogCutConfig.getBottom() + statusBarHeight);
        int right = onboardingDialogCutConfig.getRight() - onboardingDialogCutConfig.getLeft();
        int bottom = onboardingDialogCutConfig.getBottom() - onboardingDialogCutConfig.getTop();
        int padding = (onboardingDialogCutConfig.getPadding() * 2) + right;
        int padding2 = (onboardingDialogCutConfig.getPadding() * 2) + bottom;
        Rect rect2 = new Rect(0, 0, right, bottom);
        Rect rect3 = new Rect(0, 0, (onboardingDialogCutConfig.getPadding() * 2) + right, (onboardingDialogCutConfig.getPadding() * 2) + bottom);
        Bitmap createBitmap = Bitmap.createBitmap(padding, padding2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        int resId = UniColors.LAYER_FLOOR_1.getResId();
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        paint.setColor(ColorExtKt.toColorInt(resId, context2));
        canvas.drawRoundRect(new RectF(rect3), onboardingDialogCutConfig.getBackgroundCornerRadius(), onboardingDialogCutConfig.getBackgroundCornerRadius(), paint);
        canvas.translate(onboardingDialogCutConfig.getPadding(), onboardingDialogCutConfig.getPadding());
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(new RectF(rect2), onboardingDialogCutConfig.getViewCornerRadius(), onboardingDialogCutConfig.getViewCornerRadius(), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
        canvas.drawBitmap(bitmap, rect, rect2, paint);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = onboardingDialogCutConfig.getLeft() - onboardingDialogCutConfig.getPadding();
        layoutParams2.topMargin = onboardingDialogCutConfig.getTop() - onboardingDialogCutConfig.getPadding();
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageBitmap(createBitmap);
    }

    private final Animator fadeInAnimator(final View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        Intrinsics.f(ofFloat);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog.OnboardingDialog$fadeInAnimator$lambda$19$$inlined$doOnStart$1
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

    /* JADX INFO: Access modifiers changed from: private */
    public final OnboardingDialogViewModel getViewModel() {
        return (OnboardingDialogViewModel) this.viewModel.getValue();
    }

    private final boolean isBannerTopPosition(OnboardingDialogCutConfig onBoardingCutConfig) {
        OnboardingBannerView onboardingBannerView;
        int top = onBoardingCutConfig.getTop();
        StorefrontLayoutOnboardingBinding storefrontLayoutOnboardingBinding = this.binding;
        return (top - ((storefrontLayoutOnboardingBinding == null || (onboardingBannerView = storefrontLayoutOnboardingBinding.bannerObv) == null) ? 0 : onboardingBannerView.getHeight())) - BANNER_PADDING >= TOP_SAFE_AREA;
    }

    private final void startAnimation(View rootViewGroup, OnboardingDialogCutConfig onboardingCutConfig) {
        StorefrontLayoutOnboardingBinding storefrontLayoutOnboardingBinding = this.binding;
        if (storefrontLayoutOnboardingBinding == null) {
            return;
        }
        try {
            takeScreenshot(rootViewGroup, new OnboardingDialog$startAnimation$1$1(this, storefrontLayoutOnboardingBinding, onboardingCutConfig));
        } catch (Throwable th2) {
            a.f17149a.e(th2);
            this.isShown = false;
            dismissAllowingStateLoss();
        }
    }

    private final void takeScreenshot(View rootViewGroup, final Function1<? super Bitmap, Unit> block) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (!rootViewGroup.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        final Bitmap createBitmap = Bitmap.createBitmap(rootViewGroup.getWidth(), rootViewGroup.getHeight(), config);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-rootViewGroup.getScrollX(), -rootViewGroup.getScrollY());
        rootViewGroup.draw(canvas);
        int[] iArr = new int[2];
        rootViewGroup.getLocationInWindow(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        PixelCopy.request(requireActivity().getWindow(), new Rect(i11, i12, rootViewGroup.getWidth() + i11, rootViewGroup.getHeight() + i12), createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: WJ.a
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i13) {
                OnboardingDialog.takeScreenshot$lambda$13(Function1.this, createBitmap, i13);
            }
        }, new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void takeScreenshot$lambda$13(Function1 function1, Bitmap bitmap, int i11) {
        if (i11 == 0) {
            function1.invoke(bitmap);
        } else {
            Integer num = 1;
            throw new IllegalStateException(num.toString());
        }
    }

    private final int topMarginBanner(OnboardingDialogCutConfig onBoardingCutConfig, boolean isBannerTopPosition) {
        OnboardingBannerView onboardingBannerView;
        if (!isBannerTopPosition) {
            return onBoardingCutConfig.getPadding() + onBoardingCutConfig.getBottom() + BANNER_PADDING;
        }
        StorefrontLayoutOnboardingBinding storefrontLayoutOnboardingBinding = this.binding;
        return ((onBoardingCutConfig.getTop() - onBoardingCutConfig.getPadding()) - ((storefrontLayoutOnboardingBinding == null || (onboardingBannerView = storefrontLayoutOnboardingBinding.bannerObv) == null) ? 0 : onboardingBannerView.getHeight())) - BANNER_PADDING;
    }

    private final int topMarginTriangle(OnboardingDialogCutConfig onBoardingCutConfig, boolean isBannerTopPosition) {
        ImageView imageView;
        if (isBannerTopPosition) {
            return ((onBoardingCutConfig.getTop() - onBoardingCutConfig.getPadding()) - BANNER_PADDING) - TRIANGLE_BANNER_INTERSECT_AREA;
        }
        StorefrontLayoutOnboardingBinding storefrontLayoutOnboardingBinding = this.binding;
        return (((onBoardingCutConfig.getPadding() + onBoardingCutConfig.getBottom()) + BANNER_PADDING) - ((storefrontLayoutOnboardingBinding == null || (imageView = storefrontLayoutOnboardingBinding.triangleIv) == null) ? 0 : imageView.getHeight())) + TRIANGLE_BANNER_INTERSECT_AREA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateVerticalParams(OnboardingDialogCutConfig onBoardingCutConfig) {
        StorefrontLayoutOnboardingBinding storefrontLayoutOnboardingBinding = this.binding;
        if (storefrontLayoutOnboardingBinding == null) {
            return;
        }
        boolean isBannerTopPosition = isBannerTopPosition(onBoardingCutConfig);
        OnboardingBannerView bannerObv = storefrontLayoutOnboardingBinding.bannerObv;
        Intrinsics.checkNotNullExpressionValue(bannerObv, "bannerObv");
        ViewGroup.LayoutParams layoutParams = bannerObv.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = topMarginBanner(onBoardingCutConfig, isBannerTopPosition);
        bannerObv.setLayoutParams(layoutParams2);
        ImageView triangleIv = storefrontLayoutOnboardingBinding.triangleIv;
        Intrinsics.checkNotNullExpressionValue(triangleIv, "triangleIv");
        ViewGroup.LayoutParams layoutParams3 = triangleIv.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        storefrontLayoutOnboardingBinding.triangleIv.setRotation(isBannerTopPosition ? 0.0f : 180.0f);
        layoutParams4.topMargin = topMarginTriangle(onBoardingCutConfig, isBannerTopPosition);
        triangleIv.setLayoutParams(layoutParams4);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public int getTheme() {
        return R$style.CommonOnboardingDialogTheme;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (savedInstanceState != null) {
            dismiss();
            return null;
        }
        StorefrontLayoutOnboardingBinding inflate = StorefrontLayoutOnboardingBinding.inflate(inflater, container, false);
        this.binding = inflate;
        if (inflate != null) {
            return inflate.getConstraintLayout();
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        this.binding = null;
        AnimatorSet animatorSet = this.onBoardingAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.onBoardingAnimation = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getViewModel().getShownEvent().observe(getViewLifecycleOwner(), new OnboardingDialog$sam$androidx_lifecycle_Observer$0(new OnboardingDialog$onViewCreated$1(this)));
        getViewModel().showOnboarding();
    }

    public final void updateVerticalConfig(@NotNull OnboardingDialogCutConfig onBoardingCutConfig) {
        Intrinsics.checkNotNullParameter(onBoardingCutConfig, "onBoardingCutConfig");
        StorefrontLayoutOnboardingBinding storefrontLayoutOnboardingBinding = this.binding;
        if (storefrontLayoutOnboardingBinding != null) {
            updateVerticalParams(onBoardingCutConfig);
            ImageView cutDetailIv = storefrontLayoutOnboardingBinding.cutDetailIv;
            Intrinsics.checkNotNullExpressionValue(cutDetailIv, "cutDetailIv");
            ViewGroup.LayoutParams layoutParams = cutDetailIv.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = onBoardingCutConfig.getTop() - onBoardingCutConfig.getPadding();
            cutDetailIv.setLayoutParams(layoutParams2);
        }
    }
}
