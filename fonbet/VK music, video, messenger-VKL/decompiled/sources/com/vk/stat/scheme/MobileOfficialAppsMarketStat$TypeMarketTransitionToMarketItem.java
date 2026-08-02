package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("referrer_item_id")
    private final Integer referrerItemId;

    @pmi0("referrer_item_type")
    private final MobileOfficialAppsMarketStat$ReferrerItemType referrerItemType;

    @pmi0("referrer_owner_id")
    private final Long referrerOwnerId;

    @pmi0("traffic_source")
    private final String trafficSource;

    public MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem)) {
            return false;
        }
        MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem mobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem = (MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem) obj;
        return epx.f(this.referrerItemId, mobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem.referrerItemId) && epx.f(this.referrerOwnerId, mobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem.referrerOwnerId) && this.referrerItemType == mobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem.referrerItemType && epx.f(this.trafficSource, mobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem.trafficSource) && epx.f(this.postId, mobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem.postId);
    }

    public final int hashCode() {
        Integer num = this.referrerItemId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.referrerOwnerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = this.referrerItemType;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsMarketStat$ReferrerItemType == null ? 0 : mobileOfficialAppsMarketStat$ReferrerItemType.hashCode())) * 31;
        String str = this.trafficSource;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.postId;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketTransitionToMarketItem(referrerItemId=");
        sb.append(this.referrerItemId);
        sb.append(", referrerOwnerId=");
        sb.append(this.referrerOwnerId);
        sb.append(", referrerItemType=");
        sb.append(this.referrerItemType);
        sb.append(", trafficSource=");
        sb.append(this.trafficSource);
        sb.append(", postId=");
        return uqi.b(sb, this.postId, ')');
    }

    public MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem(Integer num, Long l, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, String str, Integer num2) {
        this.referrerItemId = num;
        this.referrerOwnerId = l;
        this.referrerItemType = mobileOfficialAppsMarketStat$ReferrerItemType;
        this.trafficSource = str;
        this.postId = num2;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem(Integer num, Long l, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, String str, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : mobileOfficialAppsMarketStat$ReferrerItemType, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num2);
    }
}
