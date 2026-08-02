package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.pmi0;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunityScreenTabLoadErrorView implements SchemeStat$TypeView.b {

    @pmi0("community_id")
    private final long communityId;

    @pmi0("content_type")
    private final CommonCommunitiesStat$TypeTabContentType contentType;

    public CommonCommunitiesStat$TypeCommunityScreenTabLoadErrorView(long j, CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType) {
        this.communityId = j;
        this.contentType = commonCommunitiesStat$TypeTabContentType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeCommunityScreenTabLoadErrorView)) {
            return false;
        }
        CommonCommunitiesStat$TypeCommunityScreenTabLoadErrorView commonCommunitiesStat$TypeCommunityScreenTabLoadErrorView = (CommonCommunitiesStat$TypeCommunityScreenTabLoadErrorView) obj;
        return this.communityId == commonCommunitiesStat$TypeCommunityScreenTabLoadErrorView.communityId && this.contentType == commonCommunitiesStat$TypeCommunityScreenTabLoadErrorView.contentType;
    }

    public final int hashCode() {
        return this.contentType.hashCode() + (Long.hashCode(this.communityId) * 31);
    }

    public final String toString() {
        return "TypeCommunityScreenTabLoadErrorView(communityId=" + this.communityId + ", contentType=" + this.contentType + ')';
    }
}
