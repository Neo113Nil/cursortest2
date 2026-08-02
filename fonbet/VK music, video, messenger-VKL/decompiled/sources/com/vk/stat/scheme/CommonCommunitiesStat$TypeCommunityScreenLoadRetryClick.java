package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunityScreenLoadRetryClick implements SchemeStat$TypeClick.b {

    @pmi0("community_id")
    private final long communityId;

    public CommonCommunitiesStat$TypeCommunityScreenLoadRetryClick(long j) {
        this.communityId = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonCommunitiesStat$TypeCommunityScreenLoadRetryClick) && this.communityId == ((CommonCommunitiesStat$TypeCommunityScreenLoadRetryClick) obj).communityId;
    }

    public final int hashCode() {
        return Long.hashCode(this.communityId);
    }

    public final String toString() {
        return vu5.a(')', this.communityId, new StringBuilder("TypeCommunityScreenLoadRetryClick(communityId="));
    }
}
