package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketDeliveryBlockClickItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("days")
    private final Integer days;

    @pmi0("method_type")
    private final Integer methodType;

    @pmi0("price")
    private final Long price;

    @pmi0("to_city_id")
    private final Integer toCityId;

    public CommonMarketStat$TypeMarketDeliveryBlockClickItem() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketDeliveryBlockClickItem)) {
            return false;
        }
        CommonMarketStat$TypeMarketDeliveryBlockClickItem commonMarketStat$TypeMarketDeliveryBlockClickItem = (CommonMarketStat$TypeMarketDeliveryBlockClickItem) obj;
        return epx.f(this.toCityId, commonMarketStat$TypeMarketDeliveryBlockClickItem.toCityId) && epx.f(this.methodType, commonMarketStat$TypeMarketDeliveryBlockClickItem.methodType) && epx.f(this.days, commonMarketStat$TypeMarketDeliveryBlockClickItem.days) && epx.f(this.price, commonMarketStat$TypeMarketDeliveryBlockClickItem.price);
    }

    public final int hashCode() {
        Integer num = this.toCityId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.methodType;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.days;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l = this.price;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketDeliveryBlockClickItem(toCityId=");
        sb.append(this.toCityId);
        sb.append(", methodType=");
        sb.append(this.methodType);
        sb.append(", days=");
        sb.append(this.days);
        sb.append(", price=");
        return iq.b(sb, this.price, ')');
    }

    public CommonMarketStat$TypeMarketDeliveryBlockClickItem(Integer num, Integer num2, Integer num3, Long l) {
        this.toCityId = num;
        this.methodType = num2;
        this.days = num3;
        this.price = l;
    }

    public /* synthetic */ CommonMarketStat$TypeMarketDeliveryBlockClickItem(Integer num, Integer num2, Integer num3, Long l, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : l);
    }
}
