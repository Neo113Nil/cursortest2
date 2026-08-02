package com.vk.stat.scheme;

import xsna.pmi0;
import xsna.xq;

/* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryBbox {

    @pmi0("nw_lat")
    private final float nwLat;

    @pmi0("nw_lon")
    private final float nwLon;

    @pmi0("se_lat")
    private final float seLat;

    @pmi0("se_lon")
    private final float seLon;

    public MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryBbox(float f, float f2, float f3, float f4) {
        this.nwLat = f;
        this.nwLon = f2;
        this.seLat = f3;
        this.seLon = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryBbox)) {
            return false;
        }
        MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryBbox mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryBbox = (MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryBbox) obj;
        return Float.compare(this.nwLat, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryBbox.nwLat) == 0 && Float.compare(this.nwLon, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryBbox.nwLon) == 0 && Float.compare(this.seLat, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryBbox.seLat) == 0 && Float.compare(this.seLon, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryBbox.seLon) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.seLon) + io.reactivex.rxjava3.subjects.b.a(this.seLat, io.reactivex.rxjava3.subjects.b.a(this.nwLon, Float.hashCode(this.nwLat) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeGeoDiscoveryBbox(nwLat=");
        sb.append(this.nwLat);
        sb.append(", nwLon=");
        sb.append(this.nwLon);
        sb.append(", seLat=");
        sb.append(this.seLat);
        sb.append(", seLon=");
        return xq.c(')', this.seLon, sb);
    }
}
