package ru.ozon.app.android.fakeOzon.tab;

import EZ.h;
import GZ.g;
import Ib.b;
import Pc.a;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;

/* loaded from: classes12.dex */
public final class FakeOzonTabNavigationFragment_MembersInjector implements b<FakeOzonTabNavigationFragment> {
    public static void injectBottomNavigationControllerFactory(FakeOzonTabNavigationFragment fakeOzonTabNavigationFragment, BottomNavigationController.Factory factory) {
        fakeOzonTabNavigationFragment.bottomNavigationControllerFactory = factory;
    }

    public static void injectCacheHolderTabActivityDelegate(FakeOzonTabNavigationFragment fakeOzonTabNavigationFragment, CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate) {
        fakeOzonTabNavigationFragment.cacheHolderTabActivityDelegate = cacheHolderTabActivityDelegate;
    }

    public static void injectNavigatorHolder(FakeOzonTabNavigationFragment fakeOzonTabNavigationFragment, h hVar) {
        fakeOzonTabNavigationFragment.navigatorHolder = hVar;
    }

    public static void injectRouter(FakeOzonTabNavigationFragment fakeOzonTabNavigationFragment, g gVar) {
        fakeOzonTabNavigationFragment.router = gVar;
    }

    public static void injectViewModelProvider(FakeOzonTabNavigationFragment fakeOzonTabNavigationFragment, a<FakeMainViewModel> aVar) {
        fakeOzonTabNavigationFragment.viewModelProvider = aVar;
    }
}
