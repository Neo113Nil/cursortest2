package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("item_id")
    private final Integer itemId;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem) && epx.f(this.itemId, ((MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem) obj).itemId);
    }

    public final int hashCode() {
        Integer num = this.itemId;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("TypeMarketplaceTransitionToCartClickItem(itemId="), this.itemId, ')');
    }

    public MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem(Integer num) {
        this.itemId = num;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToCartClickItem(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
