package ru.ozon.app.android.mapcommon.map.model;

import Pk0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;", "", "Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;", "target", "", "zoom", "azimuth", "tiltAngle", "<init>", "(Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;FFF)V", "copy", "(Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;FFF)Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;", "getTarget", "()Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;", "F", "getZoom", "()F", "getAzimuth", "getTiltAngle", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CameraPositionModel {
    private final float azimuth;

    @NotNull
    private final CoordinateModel target;
    private final float tiltAngle;
    private final float zoom;

    public CameraPositionModel(@NotNull CoordinateModel target, float f7, float f11, float f12) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.target = target;
        this.zoom = f7;
        this.azimuth = f11;
        this.tiltAngle = f12;
    }

    public static /* synthetic */ CameraPositionModel copy$default(CameraPositionModel cameraPositionModel, CoordinateModel coordinateModel, float f7, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coordinateModel = cameraPositionModel.target;
        }
        if ((i11 & 2) != 0) {
            f7 = cameraPositionModel.zoom;
        }
        if ((i11 & 4) != 0) {
            f11 = cameraPositionModel.azimuth;
        }
        if ((i11 & 8) != 0) {
            f12 = cameraPositionModel.tiltAngle;
        }
        return cameraPositionModel.copy(coordinateModel, f7, f11, f12);
    }

    @NotNull
    public final CameraPositionModel copy(@NotNull CoordinateModel target, float zoom, float azimuth, float tiltAngle) {
        Intrinsics.checkNotNullParameter(target, "target");
        return new CameraPositionModel(target, zoom, azimuth, tiltAngle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraPositionModel)) {
            return false;
        }
        CameraPositionModel cameraPositionModel = (CameraPositionModel) other;
        return Intrinsics.d(this.target, cameraPositionModel.target) && Float.compare(this.zoom, cameraPositionModel.zoom) == 0 && Float.compare(this.azimuth, cameraPositionModel.azimuth) == 0 && Float.compare(this.tiltAngle, cameraPositionModel.tiltAngle) == 0;
    }

    public final float getAzimuth() {
        return this.azimuth;
    }

    @NotNull
    public final CoordinateModel getTarget() {
        return this.target;
    }

    public final float getTiltAngle() {
        return this.tiltAngle;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return Float.hashCode(this.tiltAngle) + b.a(this.azimuth, b.a(this.zoom, this.target.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "CameraPositionModel(target=" + this.target + ", zoom=" + this.zoom + ", azimuth=" + this.azimuth + ", tiltAngle=" + this.tiltAngle + ")";
    }
}
