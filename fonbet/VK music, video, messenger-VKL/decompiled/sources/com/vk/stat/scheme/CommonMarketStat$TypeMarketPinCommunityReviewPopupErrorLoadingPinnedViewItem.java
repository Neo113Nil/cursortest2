package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem implements MobileOfficialAppsMarketStat$TypeMarketView.b {

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("review_id")
    private final String reviewId;

    public CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem(long j, String str) {
        this.ownerId = j;
        this.reviewId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem)) {
            return false;
        }
        CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem = (CommonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem) obj;
        return this.ownerId == commonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem.ownerId && epx.f(this.reviewId, commonMarketStat$TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem.reviewId);
    }

    public final int hashCode() {
        return this.reviewId.hashCode() + (Long.hashCode(this.ownerId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketPinCommunityReviewPopupErrorLoadingPinnedViewItem(ownerId=");
        sb.append(this.ownerId);
        sb.append(", reviewId=");
        return ho8.a(sb, this.reviewId, ')');
    }
}
