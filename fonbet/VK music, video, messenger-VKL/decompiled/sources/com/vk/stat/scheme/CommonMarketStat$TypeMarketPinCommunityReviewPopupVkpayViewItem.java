package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.vu5;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem implements MobileOfficialAppsMarketStat$TypeMarketView.b {

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("price")
    private final int price;

    @pmi0("review_id")
    private final String reviewId;

    public CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem(long j, String str, int i) {
        this.ownerId = j;
        this.reviewId = str;
        this.price = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem)) {
            return false;
        }
        CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem commonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem = (CommonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem) obj;
        return this.ownerId == commonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem.ownerId && epx.f(this.reviewId, commonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem.reviewId) && this.price == commonMarketStat$TypeMarketPinCommunityReviewPopupVkpayViewItem.price;
    }

    public final int hashCode() {
        return Integer.hashCode(this.price) + urd0.a(Long.hashCode(this.ownerId) * 31, 31, this.reviewId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketPinCommunityReviewPopupVkpayViewItem(ownerId=");
        sb.append(this.ownerId);
        sb.append(", reviewId=");
        sb.append(this.reviewId);
        sb.append(", price=");
        return vu5.b(sb, this.price, ')');
    }
}
