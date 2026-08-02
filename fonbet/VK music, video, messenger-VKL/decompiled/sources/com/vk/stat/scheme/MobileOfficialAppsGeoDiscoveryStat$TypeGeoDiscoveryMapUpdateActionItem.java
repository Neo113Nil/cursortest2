package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapUpdateActionItem implements SchemeStat$TypeAction.b {

    @pmi0("markers_added")
    private final List<MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarker> markersAdded;

    @pmi0("markers_deleted")
    private final List<MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarker> markersDeleted;

    @pmi0("markers_updated")
    private final List<MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarker> markersUpdated;

    @pmi0("user_geo_info")
    private final MobileOfficialAppsGeoDiscoveryStat$UserGeoInfo userGeoInfo;

    public MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapUpdateActionItem(MobileOfficialAppsGeoDiscoveryStat$UserGeoInfo mobileOfficialAppsGeoDiscoveryStat$UserGeoInfo, List<MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarker> list, List<MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarker> list2, List<MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarker> list3) {
        this.userGeoInfo = mobileOfficialAppsGeoDiscoveryStat$UserGeoInfo;
        this.markersDeleted = list;
        this.markersUpdated = list2;
        this.markersAdded = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapUpdateActionItem)) {
            return false;
        }
        MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapUpdateActionItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapUpdateActionItem = (MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapUpdateActionItem) obj;
        return epx.f(this.userGeoInfo, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapUpdateActionItem.userGeoInfo) && epx.f(this.markersDeleted, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapUpdateActionItem.markersDeleted) && epx.f(this.markersUpdated, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapUpdateActionItem.markersUpdated) && epx.f(this.markersAdded, mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapUpdateActionItem.markersAdded);
    }

    public final int hashCode() {
        int hashCode = this.userGeoInfo.hashCode() * 31;
        List<MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarker> list = this.markersDeleted;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarker> list2 = this.markersUpdated;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMarker> list3 = this.markersAdded;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeGeoDiscoveryMapUpdateActionItem(userGeoInfo=");
        sb.append(this.userGeoInfo);
        sb.append(", markersDeleted=");
        sb.append(this.markersDeleted);
        sb.append(", markersUpdated=");
        sb.append(this.markersUpdated);
        sb.append(", markersAdded=");
        return ms9.a(')', sb, this.markersAdded);
    }

    public /* synthetic */ MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryMapUpdateActionItem(MobileOfficialAppsGeoDiscoveryStat$UserGeoInfo mobileOfficialAppsGeoDiscoveryStat$UserGeoInfo, List list, List list2, List list3, int i, zcl zclVar) {
        this(mobileOfficialAppsGeoDiscoveryStat$UserGeoInfo, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }
}
