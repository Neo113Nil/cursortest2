package com.vk.stat.scheme;

import com.ironsource.O6;
import xsna.pmi0;
import xsna.xq;

/* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPoint {

    @pmi0(O6.s)
    private final float lat;

    @pmi0("lon")
    private final float lon;

    public MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPoint(float f, float f2) {
        this.lat = f;
        this.lon = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPoint)) {
            return false;
        }
        MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPoint mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPoint = (MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPoint) obj;
        return Float.compare(this.lat, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPoint.lat) == 0 && Float.compare(this.lon, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPoint.lon) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.lon) + (Float.hashCode(this.lat) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeGeoDiscoveryPoint(lat=");
        sb.append(this.lat);
        sb.append(", lon=");
        return xq.c(')', this.lon, sb);
    }
}
