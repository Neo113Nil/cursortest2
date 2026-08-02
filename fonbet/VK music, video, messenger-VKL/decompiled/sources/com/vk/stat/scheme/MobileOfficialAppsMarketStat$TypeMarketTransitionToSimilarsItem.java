package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("item_idx")
    private final Integer itemIdx;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem) && epx.f(this.itemIdx, ((MobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem) obj).itemIdx);
    }

    public final int hashCode() {
        Integer num = this.itemIdx;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("TypeMarketTransitionToSimilarsItem(itemIdx="), this.itemIdx, ')');
    }

    public MobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem(Integer num) {
        this.itemIdx = num;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketTransitionToSimilarsItem(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
