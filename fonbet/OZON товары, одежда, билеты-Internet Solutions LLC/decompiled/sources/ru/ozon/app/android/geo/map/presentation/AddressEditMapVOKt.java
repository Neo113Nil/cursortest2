package ru.ozon.app.android.geo.map.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.mapcommon.map.model.PointModel;
import we0.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;", "Lru/ozon/app/android/mapcommon/map/model/PointModel;", "toPointModel", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;)Lru/ozon/app/android/mapcommon/map/model/PointModel;", "Lwe0/m;", "toSdkPoint", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;)Lwe0/m;", "geo_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditMapVOKt {
    @NotNull
    public static final PointModel toPointModel(@NotNull AddressEditMapVO.Coordinate coordinate) {
        Intrinsics.checkNotNullParameter(coordinate, "<this>");
        return new PointModel(coordinate.getLatitude(), coordinate.getLongitude());
    }

    @NotNull
    public static final m toSdkPoint(@NotNull AddressEditMapVO.Coordinate coordinate) {
        Intrinsics.checkNotNullParameter(coordinate, "<this>");
        return new m(coordinate.getLatitude(), coordinate.getLongitude());
    }
}
