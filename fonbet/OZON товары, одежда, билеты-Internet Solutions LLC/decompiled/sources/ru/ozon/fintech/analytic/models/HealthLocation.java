package ru.ozon.fintech.analytic.models;

import Cm.e;
import Pk0.g;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/fintech/analytic/models/HealthLocation;", "", "latitude", "", "longitude", "precision", "", "<init>", "(DDI)V", "getLatitude", "()D", "getLongitude", "getPrecision", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HealthLocation {

    @i(name = "latitude")
    private final double latitude;

    @i(name = "longitude")
    private final double longitude;

    @i(name = "altitude")
    private final int precision;

    public HealthLocation(double d11, double d12, int i11) {
        this.latitude = d11;
        this.longitude = d12;
        this.precision = i11;
    }

    public static /* synthetic */ HealthLocation copy$default(HealthLocation healthLocation, double d11, double d12, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            d11 = healthLocation.latitude;
        }
        double d13 = d11;
        if ((i12 & 2) != 0) {
            d12 = healthLocation.longitude;
        }
        double d14 = d12;
        if ((i12 & 4) != 0) {
            i11 = healthLocation.precision;
        }
        return healthLocation.copy(d13, d14, i11);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPrecision() {
        return this.precision;
    }

    @NotNull
    public final HealthLocation copy(double latitude, double longitude, int precision) {
        return new HealthLocation(latitude, longitude, precision);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthLocation)) {
            return false;
        }
        HealthLocation healthLocation = (HealthLocation) other;
        return Double.compare(this.latitude, healthLocation.latitude) == 0 && Double.compare(this.longitude, healthLocation.longitude) == 0 && this.precision == healthLocation.precision;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final int getPrecision() {
        return this.precision;
    }

    public int hashCode() {
        return Integer.hashCode(this.precision) + g.a(Double.hashCode(this.latitude) * 31, 31, this.longitude);
    }

    @NotNull
    public String toString() {
        double d11 = this.latitude;
        double d12 = this.longitude;
        int i11 = this.precision;
        StringBuilder e11 = e.e(d11, "HealthLocation(latitude=", ", longitude=");
        e11.append(d12);
        e11.append(", precision=");
        e11.append(i11);
        e11.append(")");
        return e11.toString();
    }
}
