package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketPaginationInProductTile implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("item_media_idx")
    private final Integer itemMediaIdx;

    @pmi0("traffic_source")
    private final String trafficSource;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonMarketStat$TypeMarketPaginationInProductTile() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketPaginationInProductTile)) {
            return false;
        }
        CommonMarketStat$TypeMarketPaginationInProductTile commonMarketStat$TypeMarketPaginationInProductTile = (CommonMarketStat$TypeMarketPaginationInProductTile) obj;
        return epx.f(this.itemMediaIdx, commonMarketStat$TypeMarketPaginationInProductTile.itemMediaIdx) && epx.f(this.trafficSource, commonMarketStat$TypeMarketPaginationInProductTile.trafficSource);
    }

    public final int hashCode() {
        Integer num = this.itemMediaIdx;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.trafficSource;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketPaginationInProductTile(itemMediaIdx=");
        sb.append(this.itemMediaIdx);
        sb.append(", trafficSource=");
        return ho8.a(sb, this.trafficSource, ')');
    }

    public CommonMarketStat$TypeMarketPaginationInProductTile(Integer num, String str) {
        this.itemMediaIdx = num;
        this.trafficSource = str;
    }

    public /* synthetic */ CommonMarketStat$TypeMarketPaginationInProductTile(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
