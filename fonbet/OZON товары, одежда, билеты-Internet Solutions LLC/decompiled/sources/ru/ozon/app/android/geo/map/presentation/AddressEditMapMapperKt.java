package ru.ozon.app.android.geo.map.presentation;

import android.location.Location;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.mapcommon.map.model.CoordinateModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0005¨\u0006\u0006"}, d2 = {"toVO", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;", "Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;", "toPoint", "toCoordinateModel", "Landroid/location/Location;", "geo_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditMapMapperKt {
    @NotNull
    public static final CoordinateModel toCoordinateModel(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "<this>");
        return new CoordinateModel(location.getLatitude(), location.getLongitude());
    }

    @NotNull
    public static final CoordinateModel toPoint(@NotNull AddressEditMapVO.Coordinate coordinate) {
        Intrinsics.checkNotNullParameter(coordinate, "<this>");
        return new CoordinateModel(coordinate.getLatitude(), coordinate.getLongitude());
    }

    @NotNull
    public static final AddressEditMapVO.Coordinate toVO(@NotNull CoordinateModel coordinateModel) {
        Intrinsics.checkNotNullParameter(coordinateModel, "<this>");
        return new AddressEditMapVO.Coordinate(coordinateModel.getLatitude(), coordinateModel.getLongitude());
    }
}
