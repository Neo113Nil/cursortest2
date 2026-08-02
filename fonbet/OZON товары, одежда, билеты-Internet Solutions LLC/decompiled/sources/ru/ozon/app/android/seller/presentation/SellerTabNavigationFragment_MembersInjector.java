package ru.ozon.app.android.seller.presentation;

import EZ.h;
import GZ.g;
import Ib.b;
import Pc.a;
import ru.ozon.app.android.composer.universalscreen.view.CacheHolderTabActivityDelegate;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;

/* loaded from: classes2.dex */
public final class SellerTabNavigationFragment_MembersInjector implements b<SellerTabNavigationFragment> {
    public static void injectBottomNavigationControllerFactory(SellerTabNavigationFragment sellerTabNavigationFragment, BottomNavigationController.Factory factory) {
        sellerTabNavigationFragment.bottomNavigationControllerFactory = factory;
    }

    public static void injectCacheHolderTabActivityDelegate(SellerTabNavigationFragment sellerTabNavigationFragment, CacheHolderTabActivityDelegate cacheHolderTabActivityDelegate) {
        sellerTabNavigationFragment.cacheHolderTabActivityDelegate = cacheHolderTabActivityDelegate;
    }

    public static void injectHolder(SellerTabNavigationFragment sellerTabNavigationFragment, h hVar) {
        sellerTabNavigationFragment.holder = hVar;
    }

    public static void injectOzonRouter(SellerTabNavigationFragment sellerTabNavigationFragment, g gVar) {
        sellerTabNavigationFragment.ozonRouter = gVar;
    }

    public static void injectPSellerViewModel(SellerTabNavigationFragment sellerTabNavigationFragment, a<SellerViewModelImpl> aVar) {
        sellerTabNavigationFragment.pSellerViewModel = aVar;
    }

    public static void injectStateCorrector(SellerTabNavigationFragment sellerTabNavigationFragment, SellerScreenStateCorrector sellerScreenStateCorrector) {
        sellerTabNavigationFragment.stateCorrector = sellerScreenStateCorrector;
    }
}
