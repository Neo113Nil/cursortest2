package ru.ozon.fintech.features.metrix.data;

import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lru/ozon/fintech/features/metrix/data/Geopoint;", "", "lat", "", "lon", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getLat", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLon", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lru/ozon/fintech/features/metrix/data/Geopoint;", "equals", "", "other", "hashCode", "", "toString", "", "metrix_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Geopoint {

    @i(name = "lat")
    private final Double lat;

    @i(name = "lon")
    private final Double lon;

    public Geopoint(Double d11, Double d12) {
        this.lat = d11;
        this.lon = d12;
    }

    public static /* synthetic */ Geopoint copy$default(Geopoint geopoint, Double d11, Double d12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = geopoint.lat;
        }
        if ((i11 & 2) != 0) {
            d12 = geopoint.lon;
        }
        return geopoint.copy(d11, d12);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getLat() {
        return this.lat;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getLon() {
        return this.lon;
    }

    @NotNull
    public final Geopoint copy(Double lat, Double lon) {
        return new Geopoint(lat, lon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Geopoint)) {
            return false;
        }
        Geopoint geopoint = (Geopoint) other;
        return Intrinsics.d(this.lat, geopoint.lat) && Intrinsics.d(this.lon, geopoint.lon);
    }

    public final Double getLat() {
        return this.lat;
    }

    public final Double getLon() {
        return this.lon;
    }

    public int hashCode() {
        Double d11 = this.lat;
        int hashCode = (d11 == null ? 0 : d11.hashCode()) * 31;
        Double d12 = this.lon;
        return hashCode + (d12 != null ? d12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Geopoint(lat=" + this.lat + ", lon=" + this.lon + ")";
    }
}
