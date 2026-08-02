package ru.ozon.app.android.mapcommon.map.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwe0/m;", "Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;", "toCoordinateModel", "(Lwe0/m;)Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;", "toMapSdkCoordinate", "(Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;)Lwe0/m;", "map-common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CoordinateModelKt {
    @NotNull
    public static final CoordinateModel toCoordinateModel(@NotNull m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return new CoordinateModel(mVar.getLatitude(), mVar.getLongitude());
    }

    @NotNull
    public static final m toMapSdkCoordinate(@NotNull CoordinateModel coordinateModel) {
        Intrinsics.checkNotNullParameter(coordinateModel, "<this>");
        return new m(coordinateModel.getLatitude(), coordinateModel.getLongitude());
    }
}
