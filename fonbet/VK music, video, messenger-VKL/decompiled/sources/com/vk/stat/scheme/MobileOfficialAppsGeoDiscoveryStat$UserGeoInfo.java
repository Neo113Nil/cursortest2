package com.vk.stat.scheme;

import xsna.pmi0;
import xsna.vu5;

/* compiled from: MobileOfficialAppsGeoDiscoveryStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGeoDiscoveryStat$UserGeoInfo {

    @pmi0("community_id")
    private final long communityId;

    @pmi0("place_id")
    private final long placeId;

    public MobileOfficialAppsGeoDiscoveryStat$UserGeoInfo(long j, long j2) {
        this.placeId = j;
        this.communityId = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsGeoDiscoveryStat$UserGeoInfo)) {
            return false;
        }
        MobileOfficialAppsGeoDiscoveryStat$UserGeoInfo mobileOfficialAppsGeoDiscoveryStat$UserGeoInfo = (MobileOfficialAppsGeoDiscoveryStat$UserGeoInfo) obj;
        return this.placeId == mobileOfficialAppsGeoDiscoveryStat$UserGeoInfo.placeId && this.communityId == mobileOfficialAppsGeoDiscoveryStat$UserGeoInfo.communityId;
    }

    public final int hashCode() {
        return Long.hashCode(this.communityId) + (Long.hashCode(this.placeId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserGeoInfo(placeId=");
        sb.append(this.placeId);
        sb.append(", communityId=");
        return vu5.a(')', this.communityId, sb);
    }
}
