package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem {

    @pmi0("ids")
    private final MobileOfficialAppsGeoDiscoveryStat$PlaceIdCommunityId ids;

    public MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem(MobileOfficialAppsGeoDiscoveryStat$PlaceIdCommunityId mobileOfficialAppsGeoDiscoveryStat$PlaceIdCommunityId) {
        this.ids = mobileOfficialAppsGeoDiscoveryStat$PlaceIdCommunityId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem) && epx.f(this.ids, ((MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem) obj).ids);
    }

    public final int hashCode() {
        return this.ids.hashCode();
    }

    public final String toString() {
        return "TypeGeoDiscoveryPlaceCardTabAddressesWorkHoursClickItem(ids=" + this.ids + ')';
    }
}
