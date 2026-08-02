package com.vk.stat.scheme;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketViewItemItem implements MobileOfficialAppsMarketStat$TypeMarketView.b {

    @pmi0("context_content")
    private final CommonMarketStat$TypeMarketContextContent contextContent;

    @pmi0("item_id")
    private final Integer itemId;

    @pmi0("item_idx")
    private final Integer itemIdx;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("parent_context_content")
    private final CommonMarketStat$TypeMarketContextContent parentContextContent;

    @pmi0("referrer_item_id")
    private final Integer referrerItemId;

    @pmi0("referrer_item_type")
    private final MobileOfficialAppsMarketStat$ReferrerItemType referrerItemType;

    @pmi0("referrer_owner_id")
    private final Long referrerOwnerId;

    @pmi0("search_query_id")
    private final Long searchQueryId;

    @pmi0("traffic_source")
    private final String trafficSource;

    public MobileOfficialAppsMarketStat$TypeMarketViewItemItem() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarketStat$TypeMarketViewItemItem)) {
            return false;
        }
        MobileOfficialAppsMarketStat$TypeMarketViewItemItem mobileOfficialAppsMarketStat$TypeMarketViewItemItem = (MobileOfficialAppsMarketStat$TypeMarketViewItemItem) obj;
        return epx.f(this.itemId, mobileOfficialAppsMarketStat$TypeMarketViewItemItem.itemId) && epx.f(this.ownerId, mobileOfficialAppsMarketStat$TypeMarketViewItemItem.ownerId) && epx.f(this.searchQueryId, mobileOfficialAppsMarketStat$TypeMarketViewItemItem.searchQueryId) && epx.f(this.itemIdx, mobileOfficialAppsMarketStat$TypeMarketViewItemItem.itemIdx) && epx.f(this.referrerItemId, mobileOfficialAppsMarketStat$TypeMarketViewItemItem.referrerItemId) && epx.f(this.referrerOwnerId, mobileOfficialAppsMarketStat$TypeMarketViewItemItem.referrerOwnerId) && this.referrerItemType == mobileOfficialAppsMarketStat$TypeMarketViewItemItem.referrerItemType && epx.f(this.trafficSource, mobileOfficialAppsMarketStat$TypeMarketViewItemItem.trafficSource) && epx.f(this.contextContent, mobileOfficialAppsMarketStat$TypeMarketViewItemItem.contextContent) && epx.f(this.parentContextContent, mobileOfficialAppsMarketStat$TypeMarketViewItemItem.parentContextContent);
    }

    public final int hashCode() {
        Integer num = this.itemId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.ownerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.searchQueryId;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.itemIdx;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.referrerItemId;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l3 = this.referrerOwnerId;
        int hashCode6 = (hashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = this.referrerItemType;
        int hashCode7 = (hashCode6 + (mobileOfficialAppsMarketStat$ReferrerItemType == null ? 0 : mobileOfficialAppsMarketStat$ReferrerItemType.hashCode())) * 31;
        String str = this.trafficSource;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent = this.contextContent;
        int hashCode9 = (hashCode8 + (commonMarketStat$TypeMarketContextContent == null ? 0 : commonMarketStat$TypeMarketContextContent.hashCode())) * 31;
        CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent2 = this.parentContextContent;
        return hashCode9 + (commonMarketStat$TypeMarketContextContent2 != null ? commonMarketStat$TypeMarketContextContent2.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMarketViewItemItem(itemId=" + this.itemId + ", ownerId=" + this.ownerId + ", searchQueryId=" + this.searchQueryId + ", itemIdx=" + this.itemIdx + ", referrerItemId=" + this.referrerItemId + ", referrerOwnerId=" + this.referrerOwnerId + ", referrerItemType=" + this.referrerItemType + ", trafficSource=" + this.trafficSource + ", contextContent=" + this.contextContent + ", parentContextContent=" + this.parentContextContent + ')';
    }

    public MobileOfficialAppsMarketStat$TypeMarketViewItemItem(Integer num, Long l, Long l2, Integer num2, Integer num3, Long l3, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, String str, CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent, CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent2) {
        this.itemId = num;
        this.ownerId = l;
        this.searchQueryId = l2;
        this.itemIdx = num2;
        this.referrerItemId = num3;
        this.referrerOwnerId = l3;
        this.referrerItemType = mobileOfficialAppsMarketStat$ReferrerItemType;
        this.trafficSource = str;
        this.contextContent = commonMarketStat$TypeMarketContextContent;
        this.parentContextContent = commonMarketStat$TypeMarketContextContent2;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketViewItemItem(Integer num, Long l, Long l2, Integer num2, Integer num3, Long l3, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, String str, CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent, CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : l3, (i & 64) != 0 ? null : mobileOfficialAppsMarketStat$ReferrerItemType, (i & 128) != 0 ? null : str, (i & 256) != 0 ? null : commonMarketStat$TypeMarketContextContent, (i & 512) != 0 ? null : commonMarketStat$TypeMarketContextContent2);
    }
}
