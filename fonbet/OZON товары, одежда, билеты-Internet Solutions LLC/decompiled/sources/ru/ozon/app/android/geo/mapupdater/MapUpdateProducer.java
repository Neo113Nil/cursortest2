package ru.ozon.app.android.geo.mapupdater;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.addresseditformprompt.data.Coordinate;
import ru.ozon.app.android.geo.addresseditformprompt.data.ViewPort;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.mapcommon.mapcommon.MapUpdateManager;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\f\u0010\f\u001a\u00020\r*\u00020\u000bH\u0002J\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/geo/mapupdater/MapUpdateProducer;", "", "mapUpdateManager", "Lru/ozon/app/android/mapcommon/mapcommon/MapUpdateManager;", "<init>", "(Lru/ozon/app/android/mapcommon/mapcommon/MapUpdateManager;)V", "sendMapUpdate", "", "link", "", "viewPort", "Lru/ozon/app/android/geo/addresseditformprompt/data/ViewPort;", "toMapViewPort", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "toMapCoordinate", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;", "Lru/ozon/app/android/geo/addresseditformprompt/data/Coordinate;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapUpdateProducer {

    @NotNull
    private final MapUpdateManager mapUpdateManager;

    public MapUpdateProducer(@NotNull MapUpdateManager mapUpdateManager) {
        Intrinsics.checkNotNullParameter(mapUpdateManager, "mapUpdateManager");
        this.mapUpdateManager = mapUpdateManager;
    }

    private final AddressEditMapVO.Coordinate toMapCoordinate(Coordinate coordinate) {
        return new AddressEditMapVO.Coordinate(coordinate.getLatitude(), coordinate.getLongitude());
    }

    private final AddressEditMapVO.ViewPort toMapViewPort(ViewPort viewPort) {
        return new AddressEditMapVO.ViewPort(toMapCoordinate(viewPort.getLeftBottom()), toMapCoordinate(viewPort.getRightTop()));
    }

    public final void sendMapUpdate(@NotNull String link, @NotNull ViewPort viewPort) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(viewPort, "viewPort");
        MapUpdateEvent mapUpdateEvent = new MapUpdateEvent(link, toMapViewPort(viewPort));
        MapUpdateManager mapUpdateManager = this.mapUpdateManager;
        if (mapUpdateManager != null) {
            mapUpdateManager.update(mapUpdateEvent);
        }
    }
}
