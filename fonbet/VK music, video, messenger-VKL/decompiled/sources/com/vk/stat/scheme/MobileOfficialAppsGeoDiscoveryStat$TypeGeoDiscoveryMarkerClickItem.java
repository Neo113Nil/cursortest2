package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem {

    @pmi0("marker_location")
    private final MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPoint markerLocation;

    @pmi0("marker_position_on_display")
    private final MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerPositionOnDisplay markerPositionOnDisplay;

    @pmi0("place_id")
    private final long placeId;

    @pmi0("type")
    private final MobileOfficialAppsGeoDiscoveryStat$MarkerType type;

    @pmi0("user_geo_info")
    private final MobileOfficialAppsGeoDiscoveryStat$UserGeoInfo userGeoInfo;

    public MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem(MobileOfficialAppsGeoDiscoveryStat$UserGeoInfo mobileOfficialAppsGeoDiscoveryStat$UserGeoInfo, MobileOfficialAppsGeoDiscoveryStat$MarkerType mobileOfficialAppsGeoDiscoveryStat$MarkerType, MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPoint mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPoint, MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerPositionOnDisplay mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerPositionOnDisplay, long j) {
        this.userGeoInfo = mobileOfficialAppsGeoDiscoveryStat$UserGeoInfo;
        this.type = mobileOfficialAppsGeoDiscoveryStat$MarkerType;
        this.markerLocation = mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPoint;
        this.markerPositionOnDisplay = mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerPositionOnDisplay;
        this.placeId = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem)) {
            return false;
        }
        MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem = (MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem) obj;
        return epx.f(this.userGeoInfo, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem.userGeoInfo) && epx.f(this.type, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem.type) && epx.f(this.markerLocation, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem.markerLocation) && epx.f(this.markerPositionOnDisplay, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem.markerPositionOnDisplay) && this.placeId == mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarkerClickItem.placeId;
    }

    public final int hashCode() {
        return Long.hashCode(this.placeId) + ((this.markerPositionOnDisplay.hashCode() + ((this.markerLocation.hashCode() + ((this.type.hashCode() + (this.userGeoInfo.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeGeoDiscoveryMarkerClickItem(userGeoInfo=");
        sb.append(this.userGeoInfo);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", markerLocation=");
        sb.append(this.markerLocation);
        sb.append(", markerPositionOnDisplay=");
        sb.append(this.markerPositionOnDisplay);
        sb.append(", placeId=");
        return vu5.a(')', this.placeId, sb);
    }
}
