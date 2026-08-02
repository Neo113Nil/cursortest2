package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final CommonMarketStat$TypeEventTypeRemoveItem eventType;

    @pmi0("item_id")
    private final Integer itemId;

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("ref_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen refScreen;

    @pmi0("ref_source")
    private final CommonMarketStat$TypeRefSource refSource;

    public MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem(long j, CommonMarketStat$TypeEventTypeRemoveItem commonMarketStat$TypeEventTypeRemoveItem, Integer num, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
        this.ownerId = j;
        this.eventType = commonMarketStat$TypeEventTypeRemoveItem;
        this.itemId = num;
        this.refScreen = mobileOfficialAppsCoreNavStat$EventScreen;
        this.refSource = commonMarketStat$TypeRefSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem)) {
            return false;
        }
        MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem mobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem = (MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem) obj;
        return this.ownerId == mobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem.ownerId && this.eventType == mobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem.eventType && epx.f(this.itemId, mobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem.itemId) && this.refScreen == mobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem.refScreen && this.refSource == mobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem.refSource;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.ownerId) * 31;
        CommonMarketStat$TypeEventTypeRemoveItem commonMarketStat$TypeEventTypeRemoveItem = this.eventType;
        int hashCode2 = (hashCode + (commonMarketStat$TypeEventTypeRemoveItem == null ? 0 : commonMarketStat$TypeEventTypeRemoveItem.hashCode())) * 31;
        Integer num = this.itemId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.refScreen;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsCoreNavStat$EventScreen == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen.hashCode())) * 31;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.refSource;
        return hashCode4 + (commonMarketStat$TypeRefSource != null ? commonMarketStat$TypeRefSource.hashCode() : 0);
    }

    public final String toString() {
        return "TypeRemoveItemFromCartItem(ownerId=" + this.ownerId + ", eventType=" + this.eventType + ", itemId=" + this.itemId + ", refScreen=" + this.refScreen + ", refSource=" + this.refSource + ')';
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem(long j, CommonMarketStat$TypeEventTypeRemoveItem commonMarketStat$TypeEventTypeRemoveItem, Integer num, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : commonMarketStat$TypeEventTypeRemoveItem, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen, (i & 16) != 0 ? null : commonMarketStat$TypeRefSource);
    }
}
