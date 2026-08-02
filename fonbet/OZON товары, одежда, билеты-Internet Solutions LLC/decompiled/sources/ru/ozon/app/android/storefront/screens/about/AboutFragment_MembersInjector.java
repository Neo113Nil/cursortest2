package ru.ozon.app.android.storefront.screens.about;

import GZ.g;
import Ib.b;
import Pc.a;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes2.dex */
public final class AboutFragment_MembersInjector implements b<AboutFragment> {
    public static void injectAppType(AboutFragment aboutFragment, AppType appType) {
        aboutFragment.appType = appType;
    }

    public static void injectConfig(AboutFragment aboutFragment, NetworkComponentConfig networkComponentConfig) {
        aboutFragment.config = networkComponentConfig;
    }

    public static void injectDebugToolsService(AboutFragment aboutFragment, DebugToolsService debugToolsService) {
        aboutFragment.debugToolsService = debugToolsService;
    }

    public static void injectRouter(AboutFragment aboutFragment, g gVar) {
        aboutFragment.router = gVar;
    }

    public static void injectUserManager(AboutFragment aboutFragment, UserManager userManager) {
        aboutFragment.userManager = userManager;
    }

    public static void injectViewModelProvider(AboutFragment aboutFragment, a<AboutViewModelImpl> aVar) {
        aboutFragment.viewModelProvider = aVar;
    }
}
