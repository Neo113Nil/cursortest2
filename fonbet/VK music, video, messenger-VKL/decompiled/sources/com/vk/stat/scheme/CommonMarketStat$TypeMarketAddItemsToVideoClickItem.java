package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketAddItemsToVideoClickItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("item_ids")
    private final List<String> itemIds;

    public CommonMarketStat$TypeMarketAddItemsToVideoClickItem(List<String> list) {
        this.itemIds = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonMarketStat$TypeMarketAddItemsToVideoClickItem) && epx.f(this.itemIds, ((CommonMarketStat$TypeMarketAddItemsToVideoClickItem) obj).itemIds);
    }

    public final int hashCode() {
        return this.itemIds.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("TypeMarketAddItemsToVideoClickItem(itemIds="), this.itemIds);
    }
}
