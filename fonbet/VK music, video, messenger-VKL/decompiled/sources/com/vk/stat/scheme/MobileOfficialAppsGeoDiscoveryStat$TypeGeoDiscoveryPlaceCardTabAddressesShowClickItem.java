package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesShowClickItem {

    @pmi0("ids")
    private final MobileOfficialAppsGeoDiscoveryStat$PlaceIdCommunityId ids;

    public MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesShowClickItem(MobileOfficialAppsGeoDiscoveryStat$PlaceIdCommunityId mobileOfficialAppsGeoDiscoveryStat$PlaceIdCommunityId) {
        this.ids = mobileOfficialAppsGeoDiscoveryStat$PlaceIdCommunityId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesShowClickItem) && epx.f(this.ids, ((MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryPlaceCardTabAddressesShowClickItem) obj).ids);
    }

    public final int hashCode() {
        return this.ids.hashCode();
    }

    public final String toString() {
        return "TypeGeoDiscoveryPlaceCardTabAddressesShowClickItem(ids=" + this.ids + ')';
    }
}
