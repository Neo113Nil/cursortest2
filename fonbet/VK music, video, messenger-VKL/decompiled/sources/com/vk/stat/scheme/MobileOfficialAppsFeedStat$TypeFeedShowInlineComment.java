package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedShowInlineComment implements SchemeStat$TypeView.b {

    @pmi0("comment_id")
    private final Integer commentId;

    @pmi0("event_subtype")
    private final MobileOfficialAppsFeedStat$SocialProofAuthorType eventSubtype;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsFeedStat$TypeFeedShowInlineComment() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedShowInlineComment)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedShowInlineComment mobileOfficialAppsFeedStat$TypeFeedShowInlineComment = (MobileOfficialAppsFeedStat$TypeFeedShowInlineComment) obj;
        return epx.f(this.commentId, mobileOfficialAppsFeedStat$TypeFeedShowInlineComment.commentId) && this.eventSubtype == mobileOfficialAppsFeedStat$TypeFeedShowInlineComment.eventSubtype;
    }

    public final int hashCode() {
        Integer num = this.commentId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        MobileOfficialAppsFeedStat$SocialProofAuthorType mobileOfficialAppsFeedStat$SocialProofAuthorType = this.eventSubtype;
        return hashCode + (mobileOfficialAppsFeedStat$SocialProofAuthorType != null ? mobileOfficialAppsFeedStat$SocialProofAuthorType.hashCode() : 0);
    }

    public final String toString() {
        return "TypeFeedShowInlineComment(commentId=" + this.commentId + ", eventSubtype=" + this.eventSubtype + ')';
    }

    public MobileOfficialAppsFeedStat$TypeFeedShowInlineComment(Integer num, MobileOfficialAppsFeedStat$SocialProofAuthorType mobileOfficialAppsFeedStat$SocialProofAuthorType) {
        this.commentId = num;
        this.eventSubtype = mobileOfficialAppsFeedStat$SocialProofAuthorType;
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedShowInlineComment(Integer num, MobileOfficialAppsFeedStat$SocialProofAuthorType mobileOfficialAppsFeedStat$SocialProofAuthorType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : mobileOfficialAppsFeedStat$SocialProofAuthorType);
    }
}
