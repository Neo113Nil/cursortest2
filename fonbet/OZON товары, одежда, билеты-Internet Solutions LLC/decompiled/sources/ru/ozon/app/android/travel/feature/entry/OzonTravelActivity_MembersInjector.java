package ru.ozon.app.android.travel.feature.entry;

import Ib.b;
import Pc.a;
import ru.ozon.app.android.platform.deeplink.ExternalDeeplinkProcessorDelegate;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.NotificationOnboardingViewModel;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;

/* loaded from: classes3.dex */
public final class OzonTravelActivity_MembersInjector implements b<OzonTravelActivity> {
    public static void injectDeeplinkDelegate(OzonTravelActivity ozonTravelActivity, ExternalDeeplinkProcessorDelegate externalDeeplinkProcessorDelegate) {
        ozonTravelActivity.deeplinkDelegate = externalDeeplinkProcessorDelegate;
    }

    public static void injectEnvironmentService(OzonTravelActivity ozonTravelActivity, EnvironmentService environmentService) {
        ozonTravelActivity.environmentService = environmentService;
    }

    public static void injectNotificationViewModelProvider(OzonTravelActivity ozonTravelActivity, a<NotificationOnboardingViewModel> aVar) {
        ozonTravelActivity.notificationViewModelProvider = aVar;
    }

    public static void injectTravelGeoProvidersStorage(OzonTravelActivity ozonTravelActivity, TravelGeoProvidersStorage travelGeoProvidersStorage) {
        ozonTravelActivity.travelGeoProvidersStorage = travelGeoProvidersStorage;
    }

    public static void injectViewModelProvider(OzonTravelActivity ozonTravelActivity, a<OzonTravelViewModel> aVar) {
        ozonTravelActivity.viewModelProvider = aVar;
    }
}
