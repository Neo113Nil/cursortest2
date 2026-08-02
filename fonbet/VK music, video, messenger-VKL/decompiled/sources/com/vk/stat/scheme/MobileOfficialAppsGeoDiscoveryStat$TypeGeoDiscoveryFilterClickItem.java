package com.vk.stat.scheme;

import com.ironsource.X3;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryFilterClickItem {

    @pmi0("filter_id")
    private final long filterId;

    @pmi0(X3.i.L)
    private final int position;

    public MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryFilterClickItem(long j, int i) {
        this.filterId = j;
        this.position = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryFilterClickItem)) {
            return false;
        }
        MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryFilterClickItem mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryFilterClickItem = (MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryFilterClickItem) obj;
        return this.filterId == mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryFilterClickItem.filterId && this.position == mobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryFilterClickItem.position;
    }

    public final int hashCode() {
        return Integer.hashCode(this.position) + (Long.hashCode(this.filterId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeGeoDiscoveryFilterClickItem(filterId=");
        sb.append(this.filterId);
        sb.append(", position=");
        return vu5.b(sb, this.position, ')');
    }
}
