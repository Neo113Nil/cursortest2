package ru.ozon.app.android.fresh.feature.entry.fragment;

import EZ.h;
import GZ.g;
import Ib.b;
import Pc.a;
import ru.ozon.app.android.account.authEvents.AuthEventsCollector;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;

/* loaded from: classes12.dex */
public final class OzonFreshFragment_MembersInjector implements b<OzonFreshFragment> {
    public static void injectAuthEventsCollector(OzonFreshFragment ozonFreshFragment, AuthEventsCollector authEventsCollector) {
        ozonFreshFragment.authEventsCollector = authEventsCollector;
    }

    public static void injectBottomNavigationControllerFactory(OzonFreshFragment ozonFreshFragment, BottomNavigationController.Factory factory) {
        ozonFreshFragment.bottomNavigationControllerFactory = factory;
    }

    public static void injectCacheHolderTabActivityDelegate(OzonFreshFragment ozonFreshFragment, CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate) {
        ozonFreshFragment.cacheHolderTabActivityDelegate = cacheHolderTabActivityDelegate;
    }

    public static void injectNavigatorHolder(OzonFreshFragment ozonFreshFragment, h hVar) {
        ozonFreshFragment.navigatorHolder = hVar;
    }

    public static void injectRouter(OzonFreshFragment ozonFreshFragment, g gVar) {
        ozonFreshFragment.router = gVar;
    }

    public static void injectViewModelProvider(OzonFreshFragment ozonFreshFragment, a<OzonFreshFragmentViewModelImpl> aVar) {
        ozonFreshFragment.viewModelProvider = aVar;
    }
}
