package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("review_id")
    private final String reviewId;

    public CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem(long j, String str) {
        this.ownerId = j;
        this.reviewId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem)) {
            return false;
        }
        CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem commonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem = (CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem) obj;
        return this.ownerId == commonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem.ownerId && epx.f(this.reviewId, commonMarketStat$TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem.reviewId);
    }

    public final int hashCode() {
        return this.reviewId.hashCode() + (Long.hashCode(this.ownerId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketPinCommunityReviewPopupErrorUnpinTryAgainClickItem(ownerId=");
        sb.append(this.ownerId);
        sb.append(", reviewId=");
        return ho8.a(sb, this.reviewId, ')');
    }
}
