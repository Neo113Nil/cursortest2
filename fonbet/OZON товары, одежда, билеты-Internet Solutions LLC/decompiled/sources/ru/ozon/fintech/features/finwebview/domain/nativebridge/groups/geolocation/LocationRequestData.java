package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.geolocation;

import B90.C2619v;
import Cm.e;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/geolocation/LocationRequestData;", "", "latitude", "", "longitude", "<init>", "(DD)V", "getLatitude", "()D", "getLongitude", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LocationRequestData {
    private final double latitude;
    private final double longitude;

    public LocationRequestData(@i(name = "latitude") double d11, @i(name = "longitude") double d12) {
        this.latitude = d11;
        this.longitude = d12;
    }

    public static /* synthetic */ LocationRequestData copy$default(LocationRequestData locationRequestData, double d11, double d12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = locationRequestData.latitude;
        }
        if ((i11 & 2) != 0) {
            d12 = locationRequestData.longitude;
        }
        return locationRequestData.copy(d11, d12);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final LocationRequestData copy(@i(name = "latitude") double latitude, @i(name = "longitude") double longitude) {
        return new LocationRequestData(latitude, longitude);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationRequestData)) {
            return false;
        }
        LocationRequestData locationRequestData = (LocationRequestData) other;
        return Double.compare(this.latitude, locationRequestData.latitude) == 0 && Double.compare(this.longitude, locationRequestData.longitude) == 0;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
    }

    @NotNull
    public String toString() {
        double d11 = this.latitude;
        return C2619v.c(e.e(d11, "LocationRequestData(latitude=", ", longitude="), this.longitude, ")");
    }
}
