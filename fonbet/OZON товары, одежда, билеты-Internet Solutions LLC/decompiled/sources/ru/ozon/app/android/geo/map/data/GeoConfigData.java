package ru.ozon.app.android.geo.map.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/geo/map/data/GeoConfigData;", "", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "geoProviderConfig", "", "sessionId", "<init>", "(Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "getGeoProviderConfig", "()Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "Ljava/lang/String;", "getSessionId", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GeoConfigData {
    private final GeoProviderConfig geoProviderConfig;
    private final String sessionId;

    public GeoConfigData(GeoProviderConfig geoProviderConfig, String str) {
        this.geoProviderConfig = geoProviderConfig;
        this.sessionId = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeoConfigData)) {
            return false;
        }
        GeoConfigData geoConfigData = (GeoConfigData) other;
        return Intrinsics.d(this.geoProviderConfig, geoConfigData.geoProviderConfig) && Intrinsics.d(this.sessionId, geoConfigData.sessionId);
    }

    public final GeoProviderConfig getGeoProviderConfig() {
        return this.geoProviderConfig;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        GeoProviderConfig geoProviderConfig = this.geoProviderConfig;
        int hashCode = (geoProviderConfig == null ? 0 : geoProviderConfig.hashCode()) * 31;
        String str = this.sessionId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GeoConfigData(geoProviderConfig=" + this.geoProviderConfig + ", sessionId=" + this.sessionId + ")";
    }
}
