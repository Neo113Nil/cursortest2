package ru.ozon.app.android.travel.map.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.travel.map.flags.TravelOzonMapNewProviderFlow;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorageV1Impl;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorageV2Impl;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/map/di/TravelMapModule;", "", "<init>", "()V", "provideTravelGeoProvidersStorage", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "featureService", "Lru/ozon/app/android/network/abtool/FeatureService;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelMapModule {
    @NotNull
    public final TravelGeoProvidersStorage provideTravelGeoProvidersStorage(@NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        return featureService.getBooleanKey(TravelOzonMapNewProviderFlow.INSTANCE) ? new TravelGeoProvidersStorageV2Impl(featureService) : new TravelGeoProvidersStorageV1Impl();
    }
}
