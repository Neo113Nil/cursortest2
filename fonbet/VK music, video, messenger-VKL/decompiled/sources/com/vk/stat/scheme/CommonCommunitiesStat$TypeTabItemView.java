package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.bh10;
import xsna.pmi0;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeTabItemView implements SchemeStat$TypeView.b {

    @pmi0("content_id")
    private final long contentId;

    @pmi0("content_type")
    private final CommonCommunitiesStat$TypeTabContentType contentType;

    @pmi0("owner_id")
    private final long ownerId;

    public CommonCommunitiesStat$TypeTabItemView(long j, long j2, CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType) {
        this.ownerId = j;
        this.contentId = j2;
        this.contentType = commonCommunitiesStat$TypeTabContentType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeTabItemView)) {
            return false;
        }
        CommonCommunitiesStat$TypeTabItemView commonCommunitiesStat$TypeTabItemView = (CommonCommunitiesStat$TypeTabItemView) obj;
        return this.ownerId == commonCommunitiesStat$TypeTabItemView.ownerId && this.contentId == commonCommunitiesStat$TypeTabItemView.contentId && this.contentType == commonCommunitiesStat$TypeTabItemView.contentType;
    }

    public final int hashCode() {
        return this.contentType.hashCode() + bh10.a(Long.hashCode(this.ownerId) * 31, 31, this.contentId);
    }

    public final String toString() {
        return "TypeTabItemView(ownerId=" + this.ownerId + ", contentId=" + this.contentId + ", contentType=" + this.contentType + ')';
    }
}
