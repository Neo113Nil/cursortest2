package ru.ozon.app.android.storefront.widgets.fashionOnboarding;

import GZ.g;
import Ib.b;
import Sg.a;

/* loaded from: classes2.dex */
public final class FashionTabOnboardingDialog_MembersInjector implements b<FashionTabOnboardingDialog> {
    public static void injectAnalyticsScreenStorage(FashionTabOnboardingDialog fashionTabOnboardingDialog, a aVar) {
        fashionTabOnboardingDialog.analyticsScreenStorage = aVar;
    }

    public static void injectOzonRouter(FashionTabOnboardingDialog fashionTabOnboardingDialog, g gVar) {
        fashionTabOnboardingDialog.ozonRouter = gVar;
    }

    public static void injectViewmodel(FashionTabOnboardingDialog fashionTabOnboardingDialog, FashionTabOnboardingViewModel fashionTabOnboardingViewModel) {
        fashionTabOnboardingDialog.viewmodel = fashionTabOnboardingViewModel;
    }
}
