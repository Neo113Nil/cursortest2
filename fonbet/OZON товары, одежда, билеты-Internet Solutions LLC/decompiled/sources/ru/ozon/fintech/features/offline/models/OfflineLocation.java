package ru.ozon.fintech.features.offline.models;

import Cm.e;
import Pk0.g;
import androidx.annotation.Keep;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/fintech/features/offline/models/OfflineLocation;", "", "latitude", "", "longitude", "isOffline", "", "<init>", "(DDZ)V", "getLatitude", "()D", "getLongitude", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OfflineLocation {
    private final boolean isOffline;
    private final double latitude;
    private final double longitude;

    public OfflineLocation(double d11, double d12, boolean z11) {
        this.latitude = d11;
        this.longitude = d12;
        this.isOffline = z11;
    }

    public static /* synthetic */ OfflineLocation copy$default(OfflineLocation offlineLocation, double d11, double d12, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = offlineLocation.latitude;
        }
        double d13 = d11;
        if ((i11 & 2) != 0) {
            d12 = offlineLocation.longitude;
        }
        double d14 = d12;
        if ((i11 & 4) != 0) {
            z11 = offlineLocation.isOffline;
        }
        return offlineLocation.copy(d13, d14, z11);
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
    public final boolean getIsOffline() {
        return this.isOffline;
    }

    @NotNull
    public final OfflineLocation copy(double latitude, double longitude, boolean isOffline) {
        return new OfflineLocation(latitude, longitude, isOffline);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineLocation)) {
            return false;
        }
        OfflineLocation offlineLocation = (OfflineLocation) other;
        return Double.compare(this.latitude, offlineLocation.latitude) == 0 && Double.compare(this.longitude, offlineLocation.longitude) == 0 && this.isOffline == offlineLocation.isOffline;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isOffline) + g.a(Double.hashCode(this.latitude) * 31, 31, this.longitude);
    }

    public final boolean isOffline() {
        return this.isOffline;
    }

    @NotNull
    public String toString() {
        double d11 = this.latitude;
        double d12 = this.longitude;
        boolean z11 = this.isOffline;
        StringBuilder e11 = e.e(d11, "OfflineLocation(latitude=", ", longitude=");
        e11.append(d12);
        e11.append(", isOffline=");
        e11.append(z11);
        e11.append(")");
        return e11.toString();
    }
}
