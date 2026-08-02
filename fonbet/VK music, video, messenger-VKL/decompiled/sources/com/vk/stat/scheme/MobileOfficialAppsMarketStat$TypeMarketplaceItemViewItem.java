package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem implements MobileOfficialAppsMarketStat$TypeMarketView.b {

    @pmi0("block_id")
    private final String blockId;

    @pmi0("item_idx")
    private final Integer itemIdx;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem)) {
            return false;
        }
        MobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem mobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem = (MobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem) obj;
        return epx.f(this.blockId, mobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem.blockId) && epx.f(this.itemIdx, mobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem.itemIdx);
    }

    public final int hashCode() {
        String str = this.blockId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.itemIdx;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketplaceItemViewItem(blockId=");
        sb.append(this.blockId);
        sb.append(", itemIdx=");
        return uqi.b(sb, this.itemIdx, ')');
    }

    public MobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem(String str, Integer num) {
        this.blockId = str;
        this.itemIdx = num;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketplaceItemViewItem(String str, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}
