package ru.ozon.app.android.fresh.navigation;

import EZ.h;
import GZ.g;
import Ib.b;
import Pc.a;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.fresh.navigation.deeplinks.FreshPdpInBottomSheetHandler;
import ru.ozon.app.android.fresh.navigation.tab.FreshNavigationHelper;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;

/* loaded from: classes12.dex */
public final class FreshTabNavigationFragment_MembersInjector implements b<FreshTabNavigationFragment> {
    public static void injectBottomNavigationControllerFactory(FreshTabNavigationFragment freshTabNavigationFragment, BottomNavigationController.Factory factory) {
        freshTabNavigationFragment.bottomNavigationControllerFactory = factory;
    }

    public static void injectCacheHolderTabActivityDelegate(FreshTabNavigationFragment freshTabNavigationFragment, CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate) {
        freshTabNavigationFragment.cacheHolderTabActivityDelegate = cacheHolderTabActivityDelegate;
    }

    public static void injectFreshNavigationHelper(FreshTabNavigationFragment freshTabNavigationFragment, FreshNavigationHelper freshNavigationHelper) {
        freshTabNavigationFragment.freshNavigationHelper = freshNavigationHelper;
    }

    public static void injectHolder(FreshTabNavigationFragment freshTabNavigationFragment, h hVar) {
        freshTabNavigationFragment.holder = hVar;
    }

    public static void injectOzonRouter(FreshTabNavigationFragment freshTabNavigationFragment, g gVar) {
        freshTabNavigationFragment.ozonRouter = gVar;
    }

    public static void injectPViewModel(FreshTabNavigationFragment freshTabNavigationFragment, a<FreshViewModelImpl> aVar) {
        freshTabNavigationFragment.pViewModel = aVar;
    }

    public static void injectPdpInBottomSheetHandler(FreshTabNavigationFragment freshTabNavigationFragment, FreshPdpInBottomSheetHandler freshPdpInBottomSheetHandler) {
        freshTabNavigationFragment.pdpInBottomSheetHandler = freshPdpInBottomSheetHandler;
    }
}
