package ru.ozon.app.android.travel.feature.general.common.tab.presentation;

import Ib.b;
import ru.ozon.app.android.network.abtool.FeatureService;

/* loaded from: classes3.dex */
public final class TravelMiniAppFragment_MembersInjector implements b<TravelMiniAppFragment> {
    public static void injectFeatureService(TravelMiniAppFragment travelMiniAppFragment, FeatureService featureService) {
        travelMiniAppFragment.featureService = featureService;
    }

    public static void injectSwitchMapProviderObserver(TravelMiniAppFragment travelMiniAppFragment, SwitchMapProviderObserver switchMapProviderObserver) {
        travelMiniAppFragment.switchMapProviderObserver = switchMapProviderObserver;
    }
}
