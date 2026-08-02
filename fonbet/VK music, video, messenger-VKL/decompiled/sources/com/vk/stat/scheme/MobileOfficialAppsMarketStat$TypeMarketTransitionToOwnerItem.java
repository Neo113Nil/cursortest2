package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("referrer_item_id")
    private final Integer referrerItemId;

    @pmi0("referrer_item_type")
    private final MobileOfficialAppsMarketStat$ReferrerItemType referrerItemType;

    @pmi0("referrer_owner_id")
    private final Long referrerOwnerId;

    @pmi0("traffic_source")
    private final String trafficSource;

    public MobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem)) {
            return false;
        }
        MobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem mobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem = (MobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem) obj;
        return epx.f(this.referrerItemId, mobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem.referrerItemId) && epx.f(this.referrerOwnerId, mobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem.referrerOwnerId) && this.referrerItemType == mobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem.referrerItemType && epx.f(this.trafficSource, mobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem.trafficSource);
    }

    public final int hashCode() {
        Integer num = this.referrerItemId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.referrerOwnerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = this.referrerItemType;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsMarketStat$ReferrerItemType == null ? 0 : mobileOfficialAppsMarketStat$ReferrerItemType.hashCode())) * 31;
        String str = this.trafficSource;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketTransitionToOwnerItem(referrerItemId=");
        sb.append(this.referrerItemId);
        sb.append(", referrerOwnerId=");
        sb.append(this.referrerOwnerId);
        sb.append(", referrerItemType=");
        sb.append(this.referrerItemType);
        sb.append(", trafficSource=");
        return ho8.a(sb, this.trafficSource, ')');
    }

    public MobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem(Integer num, Long l, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, String str) {
        this.referrerItemId = num;
        this.referrerOwnerId = l;
        this.referrerItemType = mobileOfficialAppsMarketStat$ReferrerItemType;
        this.trafficSource = str;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem(Integer num, Long l, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : mobileOfficialAppsMarketStat$ReferrerItemType, (i & 8) != 0 ? null : str);
    }
}
