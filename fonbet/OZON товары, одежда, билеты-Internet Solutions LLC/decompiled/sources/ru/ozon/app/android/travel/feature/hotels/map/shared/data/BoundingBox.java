package ru.ozon.app.android.travel.feature.hotels.map.shared.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBox;", "", "southWest", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/Coordinate;", "northEast", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/shared/data/Coordinate;Lru/ozon/app/android/travel/feature/hotels/map/shared/data/Coordinate;)V", "getSouthWest", "()Lru/ozon/app/android/travel/feature/hotels/map/shared/data/Coordinate;", "getNorthEast", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BoundingBox {

    @NotNull
    private final Coordinate northEast;

    @NotNull
    private final Coordinate southWest;

    public BoundingBox(@NotNull Coordinate southWest, @NotNull Coordinate northEast) {
        Intrinsics.checkNotNullParameter(southWest, "southWest");
        Intrinsics.checkNotNullParameter(northEast, "northEast");
        this.southWest = southWest;
        this.northEast = northEast;
    }

    public static /* synthetic */ BoundingBox copy$default(BoundingBox boundingBox, Coordinate coordinate, Coordinate coordinate2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coordinate = boundingBox.southWest;
        }
        if ((i11 & 2) != 0) {
            coordinate2 = boundingBox.northEast;
        }
        return boundingBox.copy(coordinate, coordinate2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Coordinate getSouthWest() {
        return this.southWest;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Coordinate getNorthEast() {
        return this.northEast;
    }

    @NotNull
    public final BoundingBox copy(@NotNull Coordinate southWest, @NotNull Coordinate northEast) {
        Intrinsics.checkNotNullParameter(southWest, "southWest");
        Intrinsics.checkNotNullParameter(northEast, "northEast");
        return new BoundingBox(southWest, northEast);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoundingBox)) {
            return false;
        }
        BoundingBox boundingBox = (BoundingBox) other;
        return Intrinsics.d(this.southWest, boundingBox.southWest) && Intrinsics.d(this.northEast, boundingBox.northEast);
    }

    @NotNull
    public final Coordinate getNorthEast() {
        return this.northEast;
    }

    @NotNull
    public final Coordinate getSouthWest() {
        return this.southWest;
    }

    public int hashCode() {
        return this.northEast.hashCode() + (this.southWest.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "BoundingBox(southWest=" + this.southWest + ", northEast=" + this.northEast + ")";
    }
}
