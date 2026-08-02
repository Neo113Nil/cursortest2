package ru.ozon.app.android.travel.feature.hotels.map.shared.data;

import V.e;
import com.squareup.moshi.j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBoxV2;", "", "southWest", "", "northEast", "<init>", "([D[D)V", "getSouthWest", "()[D", "getNorthEast", "equals", "", "other", "hashCode", "", "component1", "component2", "copy", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BoundingBoxV2 {

    @NotNull
    private final double[] northEast;

    @NotNull
    private final double[] southWest;

    public BoundingBoxV2(@NotNull double[] southWest, @NotNull double[] northEast) {
        Intrinsics.checkNotNullParameter(southWest, "southWest");
        Intrinsics.checkNotNullParameter(northEast, "northEast");
        this.southWest = southWest;
        this.northEast = northEast;
    }

    public static /* synthetic */ BoundingBoxV2 copy$default(BoundingBoxV2 boundingBoxV2, double[] dArr, double[] dArr2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dArr = boundingBoxV2.southWest;
        }
        if ((i11 & 2) != 0) {
            dArr2 = boundingBoxV2.northEast;
        }
        return boundingBoxV2.copy(dArr, dArr2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final double[] getSouthWest() {
        return this.southWest;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final double[] getNorthEast() {
        return this.northEast;
    }

    @NotNull
    public final BoundingBoxV2 copy(@NotNull double[] southWest, @NotNull double[] northEast) {
        Intrinsics.checkNotNullParameter(southWest, "southWest");
        Intrinsics.checkNotNullParameter(northEast, "northEast");
        return new BoundingBoxV2(southWest, northEast);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!BoundingBoxV2.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.hotels.map.shared.data.BoundingBoxV2");
        BoundingBoxV2 boundingBoxV2 = (BoundingBoxV2) other;
        return Arrays.equals(this.southWest, boundingBoxV2.southWest) && Arrays.equals(this.northEast, boundingBoxV2.northEast);
    }

    @NotNull
    public final double[] getNorthEast() {
        return this.northEast;
    }

    @NotNull
    public final double[] getSouthWest() {
        return this.southWest;
    }

    public int hashCode() {
        return Arrays.hashCode(this.northEast) + (Arrays.hashCode(this.southWest) * 31);
    }

    @NotNull
    public String toString() {
        return e.a("BoundingBoxV2(southWest=", Arrays.toString(this.southWest), ", northEast=", Arrays.toString(this.northEast), ")");
    }
}
