package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketShowItemsFromVideoViewItem implements MobileOfficialAppsMarketStat$TypeMarketView.b {

    @pmi0("item_ids")
    private final List<String> itemIds;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonMarketStat$TypeMarketShowItemsFromVideoViewItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonMarketStat$TypeMarketShowItemsFromVideoViewItem) && epx.f(this.itemIds, ((CommonMarketStat$TypeMarketShowItemsFromVideoViewItem) obj).itemIds);
    }

    public final int hashCode() {
        List<String> list = this.itemIds;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("TypeMarketShowItemsFromVideoViewItem(itemIds="), this.itemIds);
    }

    public CommonMarketStat$TypeMarketShowItemsFromVideoViewItem(List<String> list) {
        this.itemIds = list;
    }

    public /* synthetic */ CommonMarketStat$TypeMarketShowItemsFromVideoViewItem(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
