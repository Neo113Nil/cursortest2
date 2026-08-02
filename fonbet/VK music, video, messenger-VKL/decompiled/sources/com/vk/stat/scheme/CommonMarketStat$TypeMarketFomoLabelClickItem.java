package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketFomoLabelClickItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("fomo_labels")
    private final CommonMarketStat$ProductCardFomoLabels fomoLabels;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonMarketStat$TypeMarketFomoLabelClickItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonMarketStat$TypeMarketFomoLabelClickItem) && epx.f(this.fomoLabels, ((CommonMarketStat$TypeMarketFomoLabelClickItem) obj).fomoLabels);
    }

    public final int hashCode() {
        CommonMarketStat$ProductCardFomoLabels commonMarketStat$ProductCardFomoLabels = this.fomoLabels;
        if (commonMarketStat$ProductCardFomoLabels == null) {
            return 0;
        }
        return commonMarketStat$ProductCardFomoLabels.hashCode();
    }

    public final String toString() {
        return "TypeMarketFomoLabelClickItem(fomoLabels=" + this.fomoLabels + ')';
    }

    public CommonMarketStat$TypeMarketFomoLabelClickItem(CommonMarketStat$ProductCardFomoLabels commonMarketStat$ProductCardFomoLabels) {
        this.fomoLabels = commonMarketStat$ProductCardFomoLabels;
    }

    public /* synthetic */ CommonMarketStat$TypeMarketFomoLabelClickItem(CommonMarketStat$ProductCardFomoLabels commonMarketStat$ProductCardFomoLabels, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : commonMarketStat$ProductCardFomoLabels);
    }
}
