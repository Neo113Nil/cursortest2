package ru.ozon.app.android.tabbar.ui;

import EZ.h;
import GZ.g;
import Ib.b;
import Pc.a;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.tabbar.TabConfigViewModel;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;
import ru.ozon.app.android.tabbar.ui.analytics.TabBarAnalytics;

/* loaded from: classes7.dex */
public final class TabNavigationFragment_MembersInjector implements b<TabNavigationFragment> {
    public static void injectBottomNavigationControllerFactory(TabNavigationFragment tabNavigationFragment, BottomNavigationController.Factory factory) {
        tabNavigationFragment.bottomNavigationControllerFactory = factory;
    }

    public static void injectCacheHolderTabActivityDelegate(TabNavigationFragment tabNavigationFragment, CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate) {
        tabNavigationFragment.cacheHolderTabActivityDelegate = cacheHolderTabActivityDelegate;
    }

    public static void injectNavigatorHolder(TabNavigationFragment tabNavigationFragment, h hVar) {
        tabNavigationFragment.navigatorHolder = hVar;
    }

    public static void injectRouter(TabNavigationFragment tabNavigationFragment, g gVar) {
        tabNavigationFragment.router = gVar;
    }

    public static void injectTabBarAnalytics(TabNavigationFragment tabNavigationFragment, TabBarAnalytics tabBarAnalytics) {
        tabNavigationFragment.tabBarAnalytics = tabBarAnalytics;
    }

    public static void injectTabConfigViewModel(TabNavigationFragment tabNavigationFragment, a<TabConfigViewModel> aVar) {
        tabNavigationFragment.tabConfigViewModel = aVar;
    }
}
