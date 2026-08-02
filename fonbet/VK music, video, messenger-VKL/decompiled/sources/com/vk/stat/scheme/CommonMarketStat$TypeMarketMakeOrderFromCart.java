package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketMakeOrderFromCart implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("order_id")
    private final int orderId;

    @pmi0("owner_id")
    private final long ownerId;

    public CommonMarketStat$TypeMarketMakeOrderFromCart(long j, int i) {
        this.ownerId = j;
        this.orderId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketMakeOrderFromCart)) {
            return false;
        }
        CommonMarketStat$TypeMarketMakeOrderFromCart commonMarketStat$TypeMarketMakeOrderFromCart = (CommonMarketStat$TypeMarketMakeOrderFromCart) obj;
        return this.ownerId == commonMarketStat$TypeMarketMakeOrderFromCart.ownerId && this.orderId == commonMarketStat$TypeMarketMakeOrderFromCart.orderId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.orderId) + (Long.hashCode(this.ownerId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketMakeOrderFromCart(ownerId=");
        sb.append(this.ownerId);
        sb.append(", orderId=");
        return vu5.b(sb, this.orderId, ')');
    }
}
