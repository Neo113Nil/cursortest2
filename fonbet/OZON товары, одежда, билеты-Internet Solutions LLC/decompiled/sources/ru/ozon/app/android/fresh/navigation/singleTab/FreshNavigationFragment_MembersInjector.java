package ru.ozon.app.android.fresh.navigation.singleTab;

import EZ.h;
import GZ.g;
import Ib.b;
import Pc.a;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.fresh.navigation.FreshViewModelImpl;
import ru.ozon.app.android.fresh.navigation.deeplinks.FreshPdpInBottomSheetHandler;
import ru.ozon.app.android.fresh.navigation.tab.FreshNavigationHelper;

/* loaded from: classes12.dex */
public final class FreshNavigationFragment_MembersInjector implements b<FreshNavigationFragment> {
    public static void injectCacheHolderTabActivityDelegate(FreshNavigationFragment freshNavigationFragment, CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate) {
        freshNavigationFragment.cacheHolderTabActivityDelegate = cacheHolderTabActivityDelegate;
    }

    public static void injectFreshNavigationHelper(FreshNavigationFragment freshNavigationFragment, FreshNavigationHelper freshNavigationHelper) {
        freshNavigationFragment.freshNavigationHelper = freshNavigationHelper;
    }

    public static void injectHolder(FreshNavigationFragment freshNavigationFragment, h hVar) {
        freshNavigationFragment.holder = hVar;
    }

    public static void injectOzonRouter(FreshNavigationFragment freshNavigationFragment, g gVar) {
        freshNavigationFragment.ozonRouter = gVar;
    }

    public static void injectPViewModel(FreshNavigationFragment freshNavigationFragment, a<FreshViewModelImpl> aVar) {
        freshNavigationFragment.pViewModel = aVar;
    }

    public static void injectPdpInBottomSheetHandler(FreshNavigationFragment freshNavigationFragment, FreshPdpInBottomSheetHandler freshPdpInBottomSheetHandler) {
        freshNavigationFragment.pdpInBottomSheetHandler = freshPdpInBottomSheetHandler;
    }
}
