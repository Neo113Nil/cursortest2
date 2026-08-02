package com.vk.sdk.api.orders.dto;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OrdersAmountDto.kt */
/* loaded from: classes5.dex */
public final class OrdersAmountDto {

    @pmi0("amounts")
    private final List<OrdersAmountItemDto> amounts;

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final String currency;

    /* JADX WARN: Multi-variable type inference failed */
    public OrdersAmountDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersAmountDto)) {
            return false;
        }
        OrdersAmountDto ordersAmountDto = (OrdersAmountDto) obj;
        return epx.f(this.amounts, ordersAmountDto.amounts) && epx.f(this.currency, ordersAmountDto.currency);
    }

    public final int hashCode() {
        List<OrdersAmountItemDto> list = this.amounts;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.currency;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "OrdersAmountDto(amounts=" + this.amounts + ", currency=" + this.currency + ")";
    }

    public OrdersAmountDto(List<OrdersAmountItemDto> list, String str) {
        this.amounts = list;
        this.currency = str;
    }

    public /* synthetic */ OrdersAmountDto(List list, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}
