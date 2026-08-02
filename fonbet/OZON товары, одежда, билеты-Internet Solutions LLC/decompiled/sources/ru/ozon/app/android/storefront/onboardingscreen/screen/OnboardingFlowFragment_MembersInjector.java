package ru.ozon.app.android.storefront.onboardingscreen.screen;

import Ib.b;
import Pc.a;
import ru.ozon.app.android.analytics.startup.AppLaunchAnalytics;
import ru.ozon.app.android.storefront.onboardingscreen.closeFlowWatcher.OnboardingCloseFlowWatcher;

/* loaded from: classes2.dex */
public final class OnboardingFlowFragment_MembersInjector implements b<OnboardingFlowFragment> {
    public static void injectAppLaunchAnalytics(OnboardingFlowFragment onboardingFlowFragment, AppLaunchAnalytics appLaunchAnalytics) {
        onboardingFlowFragment.appLaunchAnalytics = appLaunchAnalytics;
    }

    public static void injectCloseFlowWatcher(OnboardingFlowFragment onboardingFlowFragment, OnboardingCloseFlowWatcher onboardingCloseFlowWatcher) {
        onboardingFlowFragment.closeFlowWatcher = onboardingCloseFlowWatcher;
    }

    public static void injectPViewModel(OnboardingFlowFragment onboardingFlowFragment, a<OnboardingFlowFragmentViewModel> aVar) {
        onboardingFlowFragment.pViewModel = aVar;
    }
}
