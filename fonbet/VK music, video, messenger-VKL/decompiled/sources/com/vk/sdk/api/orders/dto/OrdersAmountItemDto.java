package com.vk.sdk.api.orders.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OrdersAmountItemDto.kt */
/* loaded from: classes5.dex */
public final class OrdersAmountItemDto {

    @pmi0("amount")
    private final Float amount;

    @pmi0("description")
    private final String description;

    @pmi0("votes")
    private final String votes;

    public OrdersAmountItemDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersAmountItemDto)) {
            return false;
        }
        OrdersAmountItemDto ordersAmountItemDto = (OrdersAmountItemDto) obj;
        return epx.f(this.amount, ordersAmountItemDto.amount) && epx.f(this.description, ordersAmountItemDto.description) && epx.f(this.votes, ordersAmountItemDto.votes);
    }

    public final int hashCode() {
        Float f = this.amount;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.votes;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Float f = this.amount;
        String str = this.description;
        String str2 = this.votes;
        StringBuilder sb = new StringBuilder("OrdersAmountItemDto(amount=");
        sb.append(f);
        sb.append(", description=");
        sb.append(str);
        sb.append(", votes=");
        return i5s.a(sb, str2, ")");
    }

    public OrdersAmountItemDto(Float f, String str, String str2) {
        this.amount = f;
        this.description = str;
        this.votes = str2;
    }

    public /* synthetic */ OrdersAmountItemDto(Float f, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
