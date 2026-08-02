package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.pmi0;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick implements SchemeStat$TypeClick.b {

    @pmi0("community_id")
    private final long communityId;

    @pmi0("content_type")
    private final CommonCommunitiesStat$TypeTabContentType contentType;

    public CommonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick(long j, CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType) {
        this.communityId = j;
        this.contentType = commonCommunitiesStat$TypeTabContentType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick)) {
            return false;
        }
        CommonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick commonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick = (CommonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick) obj;
        return this.communityId == commonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick.communityId && this.contentType == commonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick.contentType;
    }

    public final int hashCode() {
        return this.contentType.hashCode() + (Long.hashCode(this.communityId) * 31);
    }

    public final String toString() {
        return "TypeCommunityScreenTabLoadRetryClick(communityId=" + this.communityId + ", contentType=" + this.contentType + ')';
    }
}
