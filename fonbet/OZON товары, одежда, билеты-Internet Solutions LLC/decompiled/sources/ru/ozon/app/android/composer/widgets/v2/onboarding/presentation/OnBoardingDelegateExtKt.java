package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation;

import Sc.o;
import Ur.a;
import a00.C4911f;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.G;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingDialog;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingDialogCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingResultState;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a;\u0010\u000b\u001a\u00020\t*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f\u001aI\u0010\u0014\u001a\u00020\t*\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0015\u0010\u001e\u001a\u00020\t*\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a5\u0010\"\u001a\u00020\t*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010$\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "", "widgetKey", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onboardingViewModel", "Landroid/view/View;", "targetView", "Lkotlin/Function0;", "", "bindDelegate", "checkForBindDelegate", "(La00/f;Ljava/lang/String;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "Landroidx/fragment/app/G;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "", "onShownOnboarding", "onCropAreaClick", "setupFragmentResultListener", "(Landroidx/fragment/app/G;Landroid/view/View;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "", "statusBarHeight", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "onBoardingCutConfig", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialogCutConfig;", "createOnboardingValues", "(Landroid/view/View;ILru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;)Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialogCutConfig;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialog;", "unbind", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialog;)V", "viewModel", "block", "showOnboarding", "(La00/f;Ljava/lang/String;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;Lkotlin/jvm/functions/Function0;)V", "getHeightPxLocation", "(Landroid/view/View;I)I", "composer_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OnBoardingDelegateExtKt {
    public static final void checkForBindDelegate(@NotNull C4911f c4911f, @NotNull String widgetKey, @NotNull BaseOnBoardingViewModel onboardingViewModel, @NotNull View targetView, @NotNull Function0<Unit> bindDelegate) {
        Intrinsics.checkNotNullParameter(c4911f, "<this>");
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        Intrinsics.checkNotNullParameter(onboardingViewModel, "onboardingViewModel");
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        Intrinsics.checkNotNullParameter(bindDelegate, "bindDelegate");
        ComposerExtKt.withPageTag(c4911f, new OnBoardingDelegateExtKt$checkForBindDelegate$1(targetView, onboardingViewModel, widgetKey, bindDelegate));
    }

    public static final OnBoardingDialogCutConfig createOnboardingValues(@NotNull View view, int i11, OnBoardingCutConfig onBoardingCutConfig) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int heightPxLocation = getHeightPxLocation(view, i11);
        if (onBoardingCutConfig == null) {
            return null;
        }
        int left = view.getLeft();
        Integer marginHorizontal = onBoardingCutConfig.getMarginHorizontal();
        int intValue = left + ((marginHorizontal == null && (marginHorizontal = onBoardingCutConfig.getMarginLeft()) == null) ? 0 : marginHorizontal.intValue());
        Integer marginVertical = onBoardingCutConfig.getMarginVertical();
        int intValue2 = ((marginVertical == null && (marginVertical = onBoardingCutConfig.getMarginTop()) == null) ? 0 : marginVertical.intValue()) + heightPxLocation;
        int right = view.getRight();
        Integer marginHorizontal2 = onBoardingCutConfig.getMarginHorizontal();
        int intValue3 = right - ((marginHorizontal2 == null && (marginHorizontal2 = onBoardingCutConfig.getMarginRight()) == null) ? 0 : marginHorizontal2.intValue());
        int height = view.getHeight() + heightPxLocation;
        Integer marginVertical2 = onBoardingCutConfig.getMarginVertical();
        return new OnBoardingDialogCutConfig(intValue, intValue2, intValue3, height - ((marginVertical2 == null && (marginVertical2 = onBoardingCutConfig.getMarginBottom()) == null) ? 0 : marginVertical2.intValue()), onBoardingCutConfig.getCornerRadius(), onBoardingCutConfig.getIsBannerTopPosition());
    }

    private static final int getHeightPxLocation(View view, int i11) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[1] - i11;
    }

    public static final void setupFragmentResultListener(@NotNull G g10, View view, @NotNull J lifecycleOwner, @NotNull Function1<? super Boolean, Unit> onShownOnboarding, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onShownOnboarding, "onShownOnboarding");
        g10.n1("OnboardingResultFragment", lifecycleOwner, new a(onShownOnboarding, function0, view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupFragmentResultListener$lambda$0(Function1 function1, Function0 function0, View view, String str, Bundle bundle) {
        OnBoardingResultState onBoardingResultState;
        Object parcelable;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = bundle.getParcelable("onBoardingState", OnBoardingResultState.class);
            onBoardingResultState = (OnBoardingResultState) parcelable;
        } else {
            onBoardingResultState = (OnBoardingResultState) bundle.getParcelable("onBoardingState");
        }
        if (onBoardingResultState == null) {
            return;
        }
        if (onBoardingResultState instanceof OnBoardingResultState.Shown) {
            function1.invoke(Boolean.valueOf(((OnBoardingResultState.Shown) onBoardingResultState).getIsShown()));
            return;
        }
        if (!(onBoardingResultState instanceof OnBoardingResultState.Tap)) {
            throw new o();
        }
        function1.invoke(Boolean.TRUE);
        if (function0 != null) {
            function0.invoke();
        } else if (view != null) {
            OnBoardingResultState.Tap tap = (OnBoardingResultState.Tap) onBoardingResultState;
            ViewExtKt.onTapEvent(view, tap.getX(), tap.getY());
        }
    }

    public static final void showOnboarding(@NotNull C4911f c4911f, @NotNull String widgetKey, @NotNull BaseOnBoardingViewModel viewModel, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(c4911f, "<this>");
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(block, "block");
        ComposerExtKt.withPageTag(c4911f, new OnBoardingDelegateExtKt$showOnboarding$1(viewModel, widgetKey, block));
    }

    public static final void unbind(OnBoardingDialog onBoardingDialog) {
        if (onBoardingDialog == null || !onBoardingDialog.isAdded()) {
            return;
        }
        onBoardingDialog.dismiss();
    }
}
