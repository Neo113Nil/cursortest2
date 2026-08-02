package ru.ozon.app.android.mapcommon.map.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;", "", "Lru/ozon/app/android/mapcommon/map/model/PointModel;", "southWest", "northEast", "<init>", "(Lru/ozon/app/android/mapcommon/map/model/PointModel;Lru/ozon/app/android/mapcommon/map/model/PointModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/mapcommon/map/model/PointModel;", "getSouthWest", "()Lru/ozon/app/android/mapcommon/map/model/PointModel;", "getNorthEast", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BoundingBoxModel {

    @NotNull
    private final PointModel northEast;

    @NotNull
    private final PointModel southWest;

    public BoundingBoxModel(@NotNull PointModel southWest, @NotNull PointModel northEast) {
        Intrinsics.checkNotNullParameter(southWest, "southWest");
        Intrinsics.checkNotNullParameter(northEast, "northEast");
        this.southWest = southWest;
        this.northEast = northEast;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoundingBoxModel)) {
            return false;
        }
        BoundingBoxModel boundingBoxModel = (BoundingBoxModel) other;
        return Intrinsics.d(this.southWest, boundingBoxModel.southWest) && Intrinsics.d(this.northEast, boundingBoxModel.northEast);
    }

    @NotNull
    public final PointModel getNorthEast() {
        return this.northEast;
    }

    @NotNull
    public final PointModel getSouthWest() {
        return this.southWest;
    }

    public int hashCode() {
        return this.northEast.hashCode() + (this.southWest.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "BoundingBoxModel(southWest=" + this.southWest + ", northEast=" + this.northEast + ")";
    }
}
