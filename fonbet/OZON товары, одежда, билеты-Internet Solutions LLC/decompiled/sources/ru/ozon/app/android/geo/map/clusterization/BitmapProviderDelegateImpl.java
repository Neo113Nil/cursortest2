package ru.ozon.app.android.geo.map.clusterization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/BitmapProviderDelegateImpl;", "Lru/ozon/app/android/geo/map/clusterization/BitmapProviderDelegate;", "mapPlacemarkFactory", "Lru/ozon/app/android/geo/map/clusterization/MapPlacemarkFactory;", "<init>", "(Lru/ozon/app/android/geo/map/clusterization/MapPlacemarkFactory;)V", "getBitmap", "Lru/ozon/app/android/geo/map/clusterization/BitmapContainer;", "cacheKey", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BitmapProviderDelegateImpl implements BitmapProviderDelegate {

    @NotNull
    private final MapPlacemarkFactory mapPlacemarkFactory;

    public BitmapProviderDelegateImpl(@NotNull MapPlacemarkFactory mapPlacemarkFactory) {
        Intrinsics.checkNotNullParameter(mapPlacemarkFactory, "mapPlacemarkFactory");
        this.mapPlacemarkFactory = mapPlacemarkFactory;
    }

    @Override // ru.ozon.app.android.geo.map.clusterization.BitmapProviderDelegate
    public BitmapContainer getBitmap(int cacheKey) {
        return this.mapPlacemarkFactory.getBitmapContainer(cacheKey);
    }
}
