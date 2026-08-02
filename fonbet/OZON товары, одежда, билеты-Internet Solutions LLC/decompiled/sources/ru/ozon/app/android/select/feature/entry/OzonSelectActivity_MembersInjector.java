package ru.ozon.app.android.select.feature.entry;

import Ib.b;
import Pc.a;
import ru.ozon.app.android.platform.deeplink.ExternalDeeplinkProcessorDelegate;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingViewModel;

/* loaded from: classes13.dex */
public final class OzonSelectActivity_MembersInjector implements b<OzonSelectActivity> {
    public static void injectEnvironmentService(OzonSelectActivity ozonSelectActivity, EnvironmentService environmentService) {
        ozonSelectActivity.environmentService = environmentService;
    }

    public static void injectExternalDeeplinkDelegate(OzonSelectActivity ozonSelectActivity, ExternalDeeplinkProcessorDelegate externalDeeplinkProcessorDelegate) {
        ozonSelectActivity.externalDeeplinkDelegate = externalDeeplinkProcessorDelegate;
    }

    public static void injectPAppOnboardingViewModel(OzonSelectActivity ozonSelectActivity, a<AppOnboardingViewModel> aVar) {
        ozonSelectActivity.pAppOnboardingViewModel = aVar;
    }

    public static void injectPViewModel(OzonSelectActivity ozonSelectActivity, a<OzonSelectViewModel> aVar) {
        ozonSelectActivity.pViewModel = aVar;
    }
}
