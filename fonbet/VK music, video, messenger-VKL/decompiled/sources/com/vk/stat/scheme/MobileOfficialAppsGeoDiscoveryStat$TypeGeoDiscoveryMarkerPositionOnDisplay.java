package com.vk.stat.scheme;

import xsna.pmi0;
import xsna.xq;

/* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerPositionOnDisplay {

    @pmi0("x")
    private final float x;

    @pmi0("y")
    private final float y;

    public MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerPositionOnDisplay(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerPositionOnDisplay)) {
            return false;
        }
        MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerPositionOnDisplay mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerPositionOnDisplay = (MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerPositionOnDisplay) obj;
        return Float.compare(this.x, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerPositionOnDisplay.x) == 0 && Float.compare(this.y, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerPositionOnDisplay.y) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeGeoDiscoveryMarkerPositionOnDisplay(x=");
        sb.append(this.x);
        sb.append(", y=");
        return xq.c(')', this.y, sb);
    }
}
