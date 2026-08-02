package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeAddItemToCart implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final CommonMarketStat$TypeEventTypeAddItem eventType;

    @pmi0("item_id")
    private final Integer itemId;

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("ref_source")
    private final CommonMarketStat$TypeRefSource refSource;

    public MobileOfficialAppsMarketStat$TypeAddItemToCart(long j, CommonMarketStat$TypeEventTypeAddItem commonMarketStat$TypeEventTypeAddItem, Integer num, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
        this.ownerId = j;
        this.eventType = commonMarketStat$TypeEventTypeAddItem;
        this.itemId = num;
        this.refSource = commonMarketStat$TypeRefSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarketStat$TypeAddItemToCart)) {
            return false;
        }
        MobileOfficialAppsMarketStat$TypeAddItemToCart mobileOfficialAppsMarketStat$TypeAddItemToCart = (MobileOfficialAppsMarketStat$TypeAddItemToCart) obj;
        return this.ownerId == mobileOfficialAppsMarketStat$TypeAddItemToCart.ownerId && this.eventType == mobileOfficialAppsMarketStat$TypeAddItemToCart.eventType && epx.f(this.itemId, mobileOfficialAppsMarketStat$TypeAddItemToCart.itemId) && this.refSource == mobileOfficialAppsMarketStat$TypeAddItemToCart.refSource;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.ownerId) * 31;
        CommonMarketStat$TypeEventTypeAddItem commonMarketStat$TypeEventTypeAddItem = this.eventType;
        int hashCode2 = (hashCode + (commonMarketStat$TypeEventTypeAddItem == null ? 0 : commonMarketStat$TypeEventTypeAddItem.hashCode())) * 31;
        Integer num = this.itemId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.refSource;
        return hashCode3 + (commonMarketStat$TypeRefSource != null ? commonMarketStat$TypeRefSource.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAddItemToCart(ownerId=" + this.ownerId + ", eventType=" + this.eventType + ", itemId=" + this.itemId + ", refSource=" + this.refSource + ')';
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeAddItemToCart(long j, CommonMarketStat$TypeEventTypeAddItem commonMarketStat$TypeEventTypeAddItem, Integer num, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : commonMarketStat$TypeEventTypeAddItem, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : commonMarketStat$TypeRefSource);
    }
}
