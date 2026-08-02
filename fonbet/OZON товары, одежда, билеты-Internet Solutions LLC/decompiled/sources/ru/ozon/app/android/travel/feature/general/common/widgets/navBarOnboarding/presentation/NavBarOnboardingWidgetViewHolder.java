package ru.ozon.app.android.travel.feature.general.common.widgets.navBarOnboarding.presentation;

import Cm.e;
import Lm0.a;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.K;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateForOverlayWidgetsImpl;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.travel.utils.extensions.OnboardingExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import xe.B0;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/navBarOnboarding/presentation/NavBarOnboardingWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/navBarOnboarding/presentation/NavBarOnboardingVO;", "Ll10/i;", "container", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onboardingViewModel", "<init>", "(Ll10/i;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "", "bindOnBoarding", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "", "key", "initDelegate", "(Ljava/lang/String;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "", "isScreenVisible", "()Z", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/navBarOnboarding/presentation/NavBarOnboardingVO;)V", "onWidgetDestroyed", "()V", "Ll10/i;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "", "onboardingCornerRadius", "F", "Lxe/B0;", "onboardingJob", "Lxe/B0;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegateForOverlayWidgetsImpl;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegateForOverlayWidgetsImpl;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NavBarOnboardingWidgetViewHolder extends AbstractC6065b<NavBarOnboardingVO> {

    @NotNull
    private final i container;
    private final View metricView;
    private OnBoardingDelegateForOverlayWidgetsImpl onBoardingDelegate;
    private final float onboardingCornerRadius;
    private B0 onboardingJob;

    @NotNull
    private final BaseOnBoardingViewModel onboardingViewModel;

    public NavBarOnboardingWidgetViewHolder(@NotNull i container, @NotNull BaseOnBoardingViewModel onboardingViewModel) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(onboardingViewModel, "onboardingViewModel");
        this.container = container;
        this.onboardingViewModel = onboardingViewModel;
        Context context = container.Y().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.onboardingCornerRadius = ResourceExtKt.toPxF(8, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindOnBoarding(final OnBoardingDTO onboarding) {
        r a11;
        LinearLayout linearLayout;
        int childCount;
        final NavBarOnboardingVO boundData;
        final View childAt;
        if (!isScreenVisible() || (a11 = this.container.Q().a()) == null || (linearLayout = (LinearLayout) a11.findViewById(R$id.bottomNavigationTabsContainer)) == null || (childCount = linearLayout.getChildCount()) == 0 || (boundData = getBoundData()) == null) {
            return;
        }
        if (boundData.getTabNumber() == null) {
            childAt = linearLayout.getChildAt(childCount - 1);
        } else {
            int intValue = boundData.getTabNumber().intValue() - 1;
            if (intValue < 0 || intValue >= childCount) {
                a.f17149a.e("NavBarOnboarding", e.c("Target tab index ", intValue, " is out of bounds (0-", ")", childCount - 1));
                return;
            } else {
                if (boundData.getIsReverseOrder()) {
                    intValue = (childCount - intValue) - 1;
                }
                childAt = linearLayout.getChildAt(intValue);
            }
        }
        if (childAt == null) {
            return;
        }
        int i11 = Y.f42258g;
        if (!childAt.isLaidOut() || childAt.isLayoutRequested()) {
            childAt.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.navBarOnboarding.presentation.NavBarOnboardingWidgetViewHolder$bindOnBoarding$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    String onboardingKey = NavBarOnboardingVO.this.getOnboarding().getOnboardingKey();
                    if (onboardingKey == null) {
                        onboardingKey = "nav_bar_onboarding_key";
                    }
                    ComposerExtKt.withPageTag(this.container, new NavBarOnboardingWidgetViewHolder$bindOnBoarding$1$1(this, onboardingKey, onboarding, childAt));
                }
            });
            return;
        }
        String onboardingKey = boundData.getOnboarding().getOnboardingKey();
        if (onboardingKey == null) {
            onboardingKey = "nav_bar_onboarding_key";
        }
        ComposerExtKt.withPageTag(this.container, new NavBarOnboardingWidgetViewHolder$bindOnBoarding$1$1(this, onboardingKey, onboarding, childAt));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(String key, OnBoardingDTO onboarding) {
        i iVar = this.container;
        NavBarOnboardingVO boundData = getBoundData();
        OnBoardingDelegateForOverlayWidgetsImpl onBoardingDelegateForOverlayWidgetsImpl = new OnBoardingDelegateForOverlayWidgetsImpl(iVar, this, boundData != null ? Long.valueOf(boundData.getId()) : null, key, onboarding, this.onboardingViewModel);
        onBoardingDelegateForOverlayWidgetsImpl.setOnShownListener(new NavBarOnboardingWidgetViewHolder$initDelegate$1$1(this));
        this.onBoardingDelegate = onBoardingDelegateForOverlayWidgetsImpl;
    }

    private final boolean isScreenVisible() {
        List<ComponentCallbacksC5392m> r02;
        G d11 = this.container.Q().d();
        ComponentCallbacksC5392m componentCallbacksC5392m = (d11 == null || (r02 = d11.r0()) == null) ? null : (ComponentCallbacksC5392m) C7714v.Z(r02);
        return (componentCallbacksC5392m instanceof ComposerFragment) && ((ComposerFragment) componentCallbacksC5392m).getConfig().getBottomSheetConfig() == null;
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        ComposerExtKt.withPageTag(this.container, new NavBarOnboardingWidgetViewHolder$onWidgetDestroyed$1(this));
        OnBoardingDelegateForOverlayWidgetsImpl onBoardingDelegateForOverlayWidgetsImpl = this.onBoardingDelegate;
        if (onBoardingDelegateForOverlayWidgetsImpl != null) {
            onBoardingDelegateForOverlayWidgetsImpl.unbind();
        }
        B0 b02 = this.onboardingJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.onboardingJob = null;
        this.onBoardingDelegate = null;
        super.onWidgetDestroyed();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull NavBarOnboardingVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        B0 b02 = this.onboardingJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.onboardingJob = OnboardingExtensionsKt.showOnboardingWithDelay(item.getOnboarding(), this.container.K().f().getLifecycle(), K.a(this), new NavBarOnboardingWidgetViewHolder$bind$1(this));
    }
}
