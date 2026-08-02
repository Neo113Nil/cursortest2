package ru.ozon.app.android.mapcommon.map.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.C10551g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwe0/g;", "Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;", "toCameraPositionModel", "(Lwe0/g;)Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;", "toMapSdkCameraPosition", "(Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;)Lwe0/g;", "map-common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CameraPositionModelKt {
    @NotNull
    public static final CameraPositionModel toCameraPositionModel(@NotNull C10551g c10551g) {
        Intrinsics.checkNotNullParameter(c10551g, "<this>");
        return new CameraPositionModel(CoordinateModelKt.toCoordinateModel(c10551g.c()), c10551g.e(), c10551g.b(), c10551g.d());
    }

    @NotNull
    public static final C10551g toMapSdkCameraPosition(@NotNull CameraPositionModel cameraPositionModel) {
        Intrinsics.checkNotNullParameter(cameraPositionModel, "<this>");
        return new C10551g(CoordinateModelKt.toMapSdkCoordinate(cameraPositionModel.getTarget()), cameraPositionModel.getZoom(), cameraPositionModel.getAzimuth(), cameraPositionModel.getTiltAngle());
    }
}
