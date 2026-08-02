package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarker {

    @pmi0("id")
    private final long id;

    @pmi0("position_on_display")
    private final MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerPositionOnDisplay positionOnDisplay;

    @pmi0("type")
    private final MobileOfficialAppsGeoDiscoveryStat$MarkerType type;

    public MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarker(long j, MobileOfficialAppsGeoDiscoveryStat$MarkerType mobileOfficialAppsGeoDiscoveryStat$MarkerType, MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerPositionOnDisplay mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerPositionOnDisplay) {
        this.id = j;
        this.type = mobileOfficialAppsGeoDiscoveryStat$MarkerType;
        this.positionOnDisplay = mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerPositionOnDisplay;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarker)) {
            return false;
        }
        MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarker mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarker = (MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarker) obj;
        return this.id == mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarker.id && epx.f(this.type, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarker.type) && epx.f(this.positionOnDisplay, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarker.positionOnDisplay);
    }

    public final int hashCode() {
        return this.positionOnDisplay.hashCode() + ((this.type.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
    }

    public final String toString() {
        return "TypeGeoDiscoveryMarker(id=" + this.id + ", type=" + this.type + ", positionOnDisplay=" + this.positionOnDisplay + ')';
    }
}
