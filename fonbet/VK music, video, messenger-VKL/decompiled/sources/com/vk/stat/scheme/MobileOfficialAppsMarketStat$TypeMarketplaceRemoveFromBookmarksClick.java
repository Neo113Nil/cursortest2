package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("block_id")
    private final String blockId;

    @pmi0("item_idx")
    private final Integer itemIdx;

    @pmi0("referrer_item_id")
    private final Integer referrerItemId;

    @pmi0("referrer_item_type")
    private final MobileOfficialAppsMarketStat$ReferrerItemType referrerItemType;

    @pmi0("referrer_owner_id")
    private final Long referrerOwnerId;

    public MobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick)) {
            return false;
        }
        MobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick mobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick = (MobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick) obj;
        return epx.f(this.blockId, mobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick.blockId) && epx.f(this.itemIdx, mobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick.itemIdx) && epx.f(this.referrerItemId, mobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick.referrerItemId) && epx.f(this.referrerOwnerId, mobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick.referrerOwnerId) && this.referrerItemType == mobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick.referrerItemType;
    }

    public final int hashCode() {
        String str = this.blockId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.itemIdx;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.referrerItemId;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.referrerOwnerId;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = this.referrerItemType;
        return hashCode4 + (mobileOfficialAppsMarketStat$ReferrerItemType != null ? mobileOfficialAppsMarketStat$ReferrerItemType.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMarketplaceRemoveFromBookmarksClick(blockId=" + this.blockId + ", itemIdx=" + this.itemIdx + ", referrerItemId=" + this.referrerItemId + ", referrerOwnerId=" + this.referrerOwnerId + ", referrerItemType=" + this.referrerItemType + ')';
    }

    public MobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick(String str, Integer num, Integer num2, Long l, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType) {
        this.blockId = str;
        this.itemIdx = num;
        this.referrerItemId = num2;
        this.referrerOwnerId = l;
        this.referrerItemType = mobileOfficialAppsMarketStat$ReferrerItemType;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketplaceRemoveFromBookmarksClick(String str, Integer num, Integer num2, Long l, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : mobileOfficialAppsMarketStat$ReferrerItemType);
    }
}
