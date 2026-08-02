package ru.ozon.app.android.fresh.navigation.onboarding;

import GZ.g;
import Ib.b;
import Sg.a;

/* loaded from: classes12.dex */
public final class FreshTabOnboardingDialog_MembersInjector implements b<FreshTabOnboardingDialog> {
    public static void injectAnalyticsScreenStorage(FreshTabOnboardingDialog freshTabOnboardingDialog, a aVar) {
        freshTabOnboardingDialog.analyticsScreenStorage = aVar;
    }

    public static void injectOzonRouter(FreshTabOnboardingDialog freshTabOnboardingDialog, g gVar) {
        freshTabOnboardingDialog.ozonRouter = gVar;
    }

    public static void injectViewmodel(FreshTabOnboardingDialog freshTabOnboardingDialog, FreshTabOnboardingViewModel freshTabOnboardingViewModel) {
        freshTabOnboardingDialog.viewmodel = freshTabOnboardingViewModel;
    }
}
