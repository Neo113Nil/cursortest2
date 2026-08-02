package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("referrer_item_id")
    private final Integer referrerItemId;

    @pmi0("referrer_item_type")
    private final MobileOfficialAppsMarketStat$ReferrerItemType referrerItemType;

    @pmi0("referrer_owner_id")
    private final Long referrerOwnerId;

    public MobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem)) {
            return false;
        }
        MobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem mobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem = (MobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem) obj;
        return epx.f(this.referrerItemId, mobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem.referrerItemId) && epx.f(this.referrerOwnerId, mobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem.referrerOwnerId) && this.referrerItemType == mobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem.referrerItemType;
    }

    public final int hashCode() {
        Integer num = this.referrerItemId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.referrerOwnerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = this.referrerItemType;
        return hashCode2 + (mobileOfficialAppsMarketStat$ReferrerItemType != null ? mobileOfficialAppsMarketStat$ReferrerItemType.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMarketCopyLinkClickItem(referrerItemId=" + this.referrerItemId + ", referrerOwnerId=" + this.referrerOwnerId + ", referrerItemType=" + this.referrerItemType + ')';
    }

    public MobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem(Integer num, Long l, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType) {
        this.referrerItemId = num;
        this.referrerOwnerId = l;
        this.referrerItemType = mobileOfficialAppsMarketStat$ReferrerItemType;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem(Integer num, Long l, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : mobileOfficialAppsMarketStat$ReferrerItemType);
    }
}
