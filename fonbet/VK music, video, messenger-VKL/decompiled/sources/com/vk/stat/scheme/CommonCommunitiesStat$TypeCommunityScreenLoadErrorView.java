package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunityScreenLoadErrorView implements SchemeStat$TypeView.b {

    @pmi0("community_id")
    private final long communityId;

    public CommonCommunitiesStat$TypeCommunityScreenLoadErrorView(long j) {
        this.communityId = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonCommunitiesStat$TypeCommunityScreenLoadErrorView) && this.communityId == ((CommonCommunitiesStat$TypeCommunityScreenLoadErrorView) obj).communityId;
    }

    public final int hashCode() {
        return Long.hashCode(this.communityId);
    }

    public final String toString() {
        return vu5.a(')', this.communityId, new StringBuilder("TypeCommunityScreenLoadErrorView(communityId="));
    }
}
