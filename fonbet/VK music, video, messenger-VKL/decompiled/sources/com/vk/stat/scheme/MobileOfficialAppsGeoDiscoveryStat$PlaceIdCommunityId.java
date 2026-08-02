package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.shy;

/* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGeoDiscoveryStat$PlaceIdCommunityId {

    @pmi0("bbox")
    private final MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryBbox bbox;

    @pmi0("location")
    private final MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPoint location;

    @pmi0("zoom_level")
    private final int zoomLevel;

    public MobileOfficialAppsGeoDiscoveryStat$PlaceIdCommunityId(MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryBbox mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryBbox, int i, MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPoint mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPoint) {
        this.bbox = mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryBbox;
        this.zoomLevel = i;
        this.location = mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsGeoDiscoveryStat$PlaceIdCommunityId)) {
            return false;
        }
        MobileOfficialAppsGeoDiscoveryStat$PlaceIdCommunityId mobileOfficialAppsGeoDiscoveryStat$PlaceIdCommunityId = (MobileOfficialAppsGeoDiscoveryStat$PlaceIdCommunityId) obj;
        return epx.f(this.bbox, mobileOfficialAppsGeoDiscoveryStat$PlaceIdCommunityId.bbox) && this.zoomLevel == mobileOfficialAppsGeoDiscoveryStat$PlaceIdCommunityId.zoomLevel && epx.f(this.location, mobileOfficialAppsGeoDiscoveryStat$PlaceIdCommunityId.location);
    }

    public final int hashCode() {
        return this.location.hashCode() + shy.a(this.zoomLevel, this.bbox.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PlaceIdCommunityId(bbox=" + this.bbox + ", zoomLevel=" + this.zoomLevel + ", location=" + this.location + ')';
    }
}
