package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsImStat$TypeOpenCommunityChats implements SchemeStat$TypeClick.b {

    @pmi0("community_id")
    private final long communityId;

    public MobileOfficialAppsImStat$TypeOpenCommunityChats(long j) {
        this.communityId = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsImStat$TypeOpenCommunityChats) && this.communityId == ((MobileOfficialAppsImStat$TypeOpenCommunityChats) obj).communityId;
    }

    public final int hashCode() {
        return Long.hashCode(this.communityId);
    }

    public final String toString() {
        return vu5.a(')', this.communityId, new StringBuilder("TypeOpenCommunityChats(communityId="));
    }
}
