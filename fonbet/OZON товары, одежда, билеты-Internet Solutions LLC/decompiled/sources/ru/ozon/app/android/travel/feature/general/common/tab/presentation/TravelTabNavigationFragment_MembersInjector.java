package ru.ozon.app.android.travel.feature.general.common.tab.presentation;

import EZ.h;
import GZ.g;
import Ib.b;
import Pc.a;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;

/* loaded from: classes3.dex */
public final class TravelTabNavigationFragment_MembersInjector implements b<TravelTabNavigationFragment> {
    public static void injectBottomNavigationControllerFactory(TravelTabNavigationFragment travelTabNavigationFragment, BottomNavigationController.Factory factory) {
        travelTabNavigationFragment.bottomNavigationControllerFactory = factory;
    }

    public static void injectCacheHolderTabActivityDelegate(TravelTabNavigationFragment travelTabNavigationFragment, CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate) {
        travelTabNavigationFragment.cacheHolderTabActivityDelegate = cacheHolderTabActivityDelegate;
    }

    public static void injectHolder(TravelTabNavigationFragment travelTabNavigationFragment, h hVar) {
        travelTabNavigationFragment.holder = hVar;
    }

    public static void injectOzonRouter(TravelTabNavigationFragment travelTabNavigationFragment, g gVar) {
        travelTabNavigationFragment.ozonRouter = gVar;
    }

    public static void injectPViewModel(TravelTabNavigationFragment travelTabNavigationFragment, a<TravelTabViewModelImpl> aVar) {
        travelTabNavigationFragment.pViewModel = aVar;
    }
}
