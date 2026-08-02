package ru.ozon.app.android.pdp.widgets.priceV4.presentation;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.Y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.pdp.utils.Dimens;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00052\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bJ2\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00052\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bJ\u0006\u0010\u0012\u001a\u00020\u000bJ\b\u0010\u0013\u001a\u00020\u000bH\u0002J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/presentation/PriceV4SizeResolver;", "", "<init>", "()V", "topBadgeView", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/PriceV4BaseView;", "bottomBadgeView", "bindTopOnboarding", "Lkotlin/Function2;", "", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "", "bindBottomOnboarding", "setTopBadgeConfig", "onboardingKey", "view", "bindOnboarding", "setBottomBadgeConfig", "onDetach", "resolveRightContainerSize", "chooseConfigForOnboarding", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceV4SizeResolver {
    private Function2<? super String, ? super OnBoardingCutConfig, Unit> bindBottomOnboarding;
    private Function2<? super String, ? super OnBoardingCutConfig, Unit> bindTopOnboarding;
    private PriceV4BaseView bottomBadgeView;
    private PriceV4BaseView topBadgeView;
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public final void chooseConfigForOnboarding(String onboardingKey) {
        PriceV4BaseView priceV4BaseView;
        Function2<? super String, ? super OnBoardingCutConfig, Unit> function2;
        Integer marginLeft;
        Integer marginLeft2;
        PriceV4BaseView priceV4BaseView2 = this.topBadgeView;
        if (priceV4BaseView2 == null || (priceV4BaseView = this.bottomBadgeView) == null) {
            return;
        }
        OnBoardingCutConfig onBoardingCutConfig = priceV4BaseView2.onBoardingCutConfig();
        OnBoardingCutConfig onBoardingCutConfig2 = priceV4BaseView.onBoardingCutConfig();
        int i11 = Integer.MAX_VALUE;
        int intValue = (onBoardingCutConfig == null || (marginLeft2 = onBoardingCutConfig.getMarginLeft()) == null) ? Integer.MAX_VALUE : marginLeft2.intValue();
        if (onBoardingCutConfig2 != null && (marginLeft = onBoardingCutConfig2.getMarginLeft()) != null) {
            i11 = marginLeft.intValue();
        }
        if (intValue >= i11) {
            if (onBoardingCutConfig2 == null || (function2 = this.bindBottomOnboarding) == null) {
                return;
            }
            function2.invoke(onboardingKey, onBoardingCutConfig2);
            return;
        }
        if (onBoardingCutConfig != null) {
            int bottom = priceV4BaseView2.getBottom() - priceV4BaseView.getBottom();
            Integer marginBottom = onBoardingCutConfig.getMarginBottom();
            int intValue2 = bottom + (marginBottom != null ? marginBottom.intValue() : 0);
            Function2<? super String, ? super OnBoardingCutConfig, Unit> function22 = this.bindTopOnboarding;
            if (function22 != null) {
                function22.invoke(onboardingKey, OnBoardingCutConfig.copy$default(onBoardingCutConfig, null, null, null, Integer.valueOf(intValue2), null, null, null, false, 247, null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolveRightContainerSize() {
        PriceV4BaseView priceV4BaseView;
        PriceV4BaseView priceV4BaseView2 = this.topBadgeView;
        if (priceV4BaseView2 == null || (priceV4BaseView = this.bottomBadgeView) == null) {
            return;
        }
        Integer rightContainerWidth = priceV4BaseView.rightContainerWidth();
        Integer rightContainerWidth2 = priceV4BaseView2.rightContainerWidth();
        if (rightContainerWidth == null && rightContainerWidth2 == null) {
            return;
        }
        int i11 = 0;
        if ((rightContainerWidth2 != null ? rightContainerWidth2.intValue() : 0) < (rightContainerWidth != null ? rightContainerWidth.intValue() : 0)) {
            if (rightContainerWidth != null) {
                i11 = rightContainerWidth.intValue() - Dimens.INSTANCE.getDP_8();
            } else if (rightContainerWidth2 != null) {
                i11 = rightContainerWidth2.intValue();
            }
            priceV4BaseView2.updateRightContainerWidth(i11);
            return;
        }
        if ((rightContainerWidth2 != null ? rightContainerWidth2.intValue() : 0) > (rightContainerWidth != null ? rightContainerWidth.intValue() : 0)) {
            if (rightContainerWidth2 != null) {
                i11 = Dimens.INSTANCE.getDP_8() + rightContainerWidth2.intValue();
            } else if (rightContainerWidth != null) {
                i11 = rightContainerWidth.intValue();
            }
            priceV4BaseView.updateRightContainerWidth(i11);
        }
    }

    public final void onDetach() {
        this.topBadgeView = null;
        this.bottomBadgeView = null;
        this.bindTopOnboarding = null;
        this.bindBottomOnboarding = null;
    }

    public final void setBottomBadgeConfig(final String onboardingKey, @NotNull final PriceV4BaseView view, @NotNull final Function2<? super String, ? super OnBoardingCutConfig, Unit> bindOnboarding) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(bindOnboarding, "bindOnboarding");
        int i11 = Y.f42258g;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.pdp.widgets.priceV4.presentation.PriceV4SizeResolver$setBottomBadgeConfig$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    PriceV4SizeResolver.this.bottomBadgeView = view;
                    PriceV4SizeResolver.this.resolveRightContainerSize();
                }
            });
        } else {
            this.bottomBadgeView = view;
            resolveRightContainerSize();
        }
        if (onboardingKey != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.pdp.widgets.priceV4.presentation.PriceV4SizeResolver$setBottomBadgeConfig$lambda$5$$inlined$afterMeasured$1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
                        return;
                    }
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    this.bindBottomOnboarding = bindOnboarding;
                    this.chooseConfigForOnboarding(onboardingKey);
                }
            });
        }
    }

    public final void setTopBadgeConfig(final String onboardingKey, @NotNull final PriceV4BaseView view, final Function2<? super String, ? super OnBoardingCutConfig, Unit> bindOnboarding) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i11 = Y.f42258g;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.pdp.widgets.priceV4.presentation.PriceV4SizeResolver$setTopBadgeConfig$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    PriceV4SizeResolver.this.topBadgeView = view;
                    PriceV4SizeResolver.this.resolveRightContainerSize();
                }
            });
        } else {
            this.topBadgeView = view;
            resolveRightContainerSize();
        }
        if (onboardingKey != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.pdp.widgets.priceV4.presentation.PriceV4SizeResolver$setTopBadgeConfig$lambda$2$$inlined$afterMeasured$1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
                        return;
                    }
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    this.bindTopOnboarding = bindOnboarding;
                    this.chooseConfigForOnboarding(onboardingKey);
                }
            });
        }
    }
}
