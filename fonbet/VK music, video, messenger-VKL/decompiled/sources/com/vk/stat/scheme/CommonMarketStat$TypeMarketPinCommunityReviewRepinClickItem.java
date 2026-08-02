package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketPinCommunityReviewRepinClickItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("review_id")
    private final String reviewId;

    public CommonMarketStat$TypeMarketPinCommunityReviewRepinClickItem(long j, String str) {
        this.ownerId = j;
        this.reviewId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketPinCommunityReviewRepinClickItem)) {
            return false;
        }
        CommonMarketStat$TypeMarketPinCommunityReviewRepinClickItem commonMarketStat$TypeMarketPinCommunityReviewRepinClickItem = (CommonMarketStat$TypeMarketPinCommunityReviewRepinClickItem) obj;
        return this.ownerId == commonMarketStat$TypeMarketPinCommunityReviewRepinClickItem.ownerId && epx.f(this.reviewId, commonMarketStat$TypeMarketPinCommunityReviewRepinClickItem.reviewId);
    }

    public final int hashCode() {
        return this.reviewId.hashCode() + (Long.hashCode(this.ownerId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketPinCommunityReviewRepinClickItem(ownerId=");
        sb.append(this.ownerId);
        sb.append(", reviewId=");
        return ho8.a(sb, this.reviewId, ')');
    }
}
