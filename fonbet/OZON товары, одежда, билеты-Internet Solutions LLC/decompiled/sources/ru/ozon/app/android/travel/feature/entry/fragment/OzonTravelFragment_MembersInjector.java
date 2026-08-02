package ru.ozon.app.android.travel.feature.entry.fragment;

import EZ.h;
import GZ.g;
import Ib.b;
import Pc.a;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;

/* loaded from: classes3.dex */
public final class OzonTravelFragment_MembersInjector implements b<OzonTravelFragment> {
    public static void injectBottomNavigationControllerFactory(OzonTravelFragment ozonTravelFragment, BottomNavigationController.Factory factory) {
        ozonTravelFragment.bottomNavigationControllerFactory = factory;
    }

    public static void injectCacheHolderTabActivityDelegate(OzonTravelFragment ozonTravelFragment, CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate) {
        ozonTravelFragment.cacheHolderTabActivityDelegate = cacheHolderTabActivityDelegate;
    }

    public static void injectNavigatorHolder(OzonTravelFragment ozonTravelFragment, h hVar) {
        ozonTravelFragment.navigatorHolder = hVar;
    }

    public static void injectRouter(OzonTravelFragment ozonTravelFragment, g gVar) {
        ozonTravelFragment.router = gVar;
    }

    public static void injectViewModelProvider(OzonTravelFragment ozonTravelFragment, a<OzonTravelFragmentViewModelImpl> aVar) {
        ozonTravelFragment.viewModelProvider = aVar;
    }
}
