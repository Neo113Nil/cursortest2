package ru.ozon.app.android.fresh.feature.entry;

import EZ.h;
import GZ.g;
import Ib.b;
import Pc.a;
import We.E;
import ru.ozon.app.android.platform.deeplink.ExternalDeeplinkProcessorDelegate;
import ru.ozon.app.android.storage.environment.EnvironmentService;

/* loaded from: classes12.dex */
public final class OzonFreshActivity_MembersInjector implements b<OzonFreshActivity> {
    public static void injectDeeplinkDelegate(OzonFreshActivity ozonFreshActivity, ExternalDeeplinkProcessorDelegate externalDeeplinkProcessorDelegate) {
        ozonFreshActivity.deeplinkDelegate = externalDeeplinkProcessorDelegate;
    }

    public static void injectEnvironmentService(OzonFreshActivity ozonFreshActivity, EnvironmentService environmentService) {
        ozonFreshActivity.environmentService = environmentService;
    }

    public static void injectNavigatorHolder(OzonFreshActivity ozonFreshActivity, h hVar) {
        ozonFreshActivity.navigatorHolder = hVar;
    }

    public static void injectOkHttpClient(OzonFreshActivity ozonFreshActivity, E e11) {
        ozonFreshActivity.okHttpClient = e11;
    }

    public static void injectOzonRouter(OzonFreshActivity ozonFreshActivity, g gVar) {
        ozonFreshActivity.ozonRouter = gVar;
    }

    public static void injectViewModelProvider(OzonFreshActivity ozonFreshActivity, a<OzonFreshViewModel> aVar) {
        ozonFreshActivity.viewModelProvider = aVar;
    }
}
