package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("block")
    private final String block;

    @pmi0("item_id")
    private final Integer itemId;

    @pmi0("item_idx")
    private final Integer itemIdx;

    @pmi0("owner_id")
    private final Long ownerId;

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

    public MobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem)) {
            return false;
        }
        MobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem = (MobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem) obj;
        return epx.f(this.itemId, mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem.itemId) && epx.f(this.ownerId, mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem.ownerId) && epx.f(this.block, mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem.block) && epx.f(this.searchQueryId, mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem.searchQueryId) && epx.f(this.itemIdx, mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem.itemIdx) && epx.f(this.referrerItemId, mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem.referrerItemId) && epx.f(this.referrerOwnerId, mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem.referrerOwnerId) && this.referrerItemType == mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem.referrerItemType && epx.f(this.trafficSource, mobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem.trafficSource);
    }

    public final int hashCode() {
        Integer num = this.itemId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.ownerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.block;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.searchQueryId;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.itemIdx;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.referrerItemId;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l3 = this.referrerOwnerId;
        int hashCode7 = (hashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = this.referrerItemType;
        int hashCode8 = (hashCode7 + (mobileOfficialAppsMarketStat$ReferrerItemType == null ? 0 : mobileOfficialAppsMarketStat$ReferrerItemType.hashCode())) * 31;
        String str2 = this.trafficSource;
        return hashCode8 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketRemoveItemFromBookmarkItem(itemId=");
        sb.append(this.itemId);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", block=");
        sb.append(this.block);
        sb.append(", searchQueryId=");
        sb.append(this.searchQueryId);
        sb.append(", itemIdx=");
        sb.append(this.itemIdx);
        sb.append(", referrerItemId=");
        sb.append(this.referrerItemId);
        sb.append(", referrerOwnerId=");
        sb.append(this.referrerOwnerId);
        sb.append(", referrerItemType=");
        sb.append(this.referrerItemType);
        sb.append(", trafficSource=");
        return ho8.a(sb, this.trafficSource, ')');
    }

    public MobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem(Integer num, Long l, String str, Long l2, Integer num2, Integer num3, Long l3, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, String str2) {
        this.itemId = num;
        this.ownerId = l;
        this.block = str;
        this.searchQueryId = l2;
        this.itemIdx = num2;
        this.referrerItemId = num3;
        this.referrerOwnerId = l3;
        this.referrerItemType = mobileOfficialAppsMarketStat$ReferrerItemType;
        this.trafficSource = str2;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem(Integer num, Long l, String str, Long l2, Integer num2, Integer num3, Long l3, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : l3, (i & 128) != 0 ? null : mobileOfficialAppsMarketStat$ReferrerItemType, (i & 256) != 0 ? null : str2);
    }
}
