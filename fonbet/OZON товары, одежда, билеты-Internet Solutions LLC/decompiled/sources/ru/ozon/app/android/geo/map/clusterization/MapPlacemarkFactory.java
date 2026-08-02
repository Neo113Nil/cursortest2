package ru.ozon.app.android.geo.map.clusterization;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import we0.u;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/MapPlacemarkFactory;", "", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationData;", "data", "", "Lwe0/u;", "createMapPlacemarks", "(Lru/ozon/app/android/geo/map/clusterization/ClusterizationData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "cacheKey", "Lru/ozon/app/android/geo/map/clusterization/BitmapContainer;", "getBitmapContainer", "(I)Lru/ozon/app/android/geo/map/clusterization/BitmapContainer;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface MapPlacemarkFactory {
    Object createMapPlacemarks(@NotNull ClusterizationData clusterizationData, @NotNull d<? super List<u>> dVar);

    BitmapContainer getBitmapContainer(int cacheKey);
}
