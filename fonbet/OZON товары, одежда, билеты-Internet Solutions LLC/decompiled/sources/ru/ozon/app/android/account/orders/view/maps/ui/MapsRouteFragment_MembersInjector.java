package ru.ozon.app.android.account.orders.view.maps.ui;

import Ib.b;
import Pc.a;
import ru.ozon.app.android.account.orders.view.maps.MapSelectorAnalytics;
import ru.ozon.app.android.account.orders.view.maps.MapsRouteViewModelImpl;

/* loaded from: classes11.dex */
public final class MapsRouteFragment_MembersInjector implements b<MapsRouteFragment> {
    public static void injectMapSelectorAnalytics(MapsRouteFragment mapsRouteFragment, MapSelectorAnalytics mapSelectorAnalytics) {
        mapsRouteFragment.mapSelectorAnalytics = mapSelectorAnalytics;
    }

    public static void injectPViewModel(MapsRouteFragment mapsRouteFragment, a<MapsRouteViewModelImpl> aVar) {
        mapsRouteFragment.pViewModel = aVar;
    }
}
