package ru.ozon.app.android.travel.map.di;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;

/* loaded from: classes2.dex */
public final class TravelMapModule_ProvideTravelGeoProvidersStorageFactory implements e<TravelGeoProvidersStorage> {
    private final a<FeatureService> featureServiceProvider;
    private final TravelMapModule module;

    public TravelMapModule_ProvideTravelGeoProvidersStorageFactory(TravelMapModule travelMapModule, a<FeatureService> aVar) {
        this.module = travelMapModule;
        this.featureServiceProvider = aVar;
    }

    public static TravelMapModule_ProvideTravelGeoProvidersStorageFactory create(TravelMapModule travelMapModule, a<FeatureService> aVar) {
        return new TravelMapModule_ProvideTravelGeoProvidersStorageFactory(travelMapModule, aVar);
    }

    public static TravelGeoProvidersStorage provideTravelGeoProvidersStorage(TravelMapModule travelMapModule, FeatureService featureService) {
        TravelGeoProvidersStorage provideTravelGeoProvidersStorage = travelMapModule.provideTravelGeoProvidersStorage(featureService);
        j.d(provideTravelGeoProvidersStorage);
        return provideTravelGeoProvidersStorage;
    }

    @Override // Pc.a
    public TravelGeoProvidersStorage get() {
        return provideTravelGeoProvidersStorage(this.module, this.featureServiceProvider.get());
    }
}
