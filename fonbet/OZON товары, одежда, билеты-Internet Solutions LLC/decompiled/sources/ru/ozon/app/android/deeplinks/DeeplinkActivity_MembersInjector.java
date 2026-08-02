package ru.ozon.app.android.deeplinks;

import GZ.g;
import Ib.b;
import Pc.a;
import ru.ozon.app.android.app.launch.handlers.listeners.AppLaunchListener;
import ru.ozon.app.android.platform.deeplink.ExternalDeeplinkProcessorDelegate;
import ru.ozon.app.android.storage.user.UserStatusStorage;
import ru.ozon.app.android.storefront.deeplinkhandlers.home.HomeDestinationFactory;
import ru.ozon.app.android.tabbar.ui.TabbarDeeplinksResolver;

/* loaded from: classes11.dex */
public final class DeeplinkActivity_MembersInjector implements b<DeeplinkActivity> {
    public static void injectAppLaunchListener(DeeplinkActivity deeplinkActivity, AppLaunchListener appLaunchListener) {
        deeplinkActivity.appLaunchListener = appLaunchListener;
    }

    public static void injectExternalDeeplinkProcessorDelegate(DeeplinkActivity deeplinkActivity, ExternalDeeplinkProcessorDelegate externalDeeplinkProcessorDelegate) {
        deeplinkActivity.externalDeeplinkProcessorDelegate = externalDeeplinkProcessorDelegate;
    }

    public static void injectHomeDestinationFactory(DeeplinkActivity deeplinkActivity, HomeDestinationFactory homeDestinationFactory) {
        deeplinkActivity.homeDestinationFactory = homeDestinationFactory;
    }

    public static void injectKeepActivityHandler(DeeplinkActivity deeplinkActivity, KeepActivityHandler keepActivityHandler) {
        deeplinkActivity.keepActivityHandler = keepActivityHandler;
    }

    public static void injectOzonRouter(DeeplinkActivity deeplinkActivity, g gVar) {
        deeplinkActivity.ozonRouter = gVar;
    }

    public static void injectTabbarDeeplinksResolver(DeeplinkActivity deeplinkActivity, TabbarDeeplinksResolver tabbarDeeplinksResolver) {
        deeplinkActivity.tabbarDeeplinksResolver = tabbarDeeplinksResolver;
    }

    public static void injectUserStatusStorage(DeeplinkActivity deeplinkActivity, UserStatusStorage userStatusStorage) {
        deeplinkActivity.userStatusStorage = userStatusStorage;
    }

    public static void injectViewModelProvider(DeeplinkActivity deeplinkActivity, a<DeeplinkViewModel> aVar) {
        deeplinkActivity.viewModelProvider = aVar;
    }
}
