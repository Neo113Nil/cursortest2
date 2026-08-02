package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryEventClickItem {

    @pmi0("track_code")
    private final CommonStat$TypeCommonEventItem trackCode;

    public MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryEventClickItem(CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem) {
        this.trackCode = commonStat$TypeCommonEventItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryEventClickItem) && epx.f(this.trackCode, ((MobileOfficialAppsGeoDiscoveryStat$TypeGeoDiscoveryEventClickItem) obj).trackCode);
    }

    public final int hashCode() {
        return this.trackCode.hashCode();
    }

    public final String toString() {
        return "TypeGeoDiscoveryEventClickItem(trackCode=" + this.trackCode + ')';
    }
}
