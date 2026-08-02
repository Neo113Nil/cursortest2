package com.vk.api.generated.orders.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: OrdersGetAllUserSubscriptionsResponseDto.kt */
/* loaded from: classes15.dex */
public final class OrdersGetAllUserSubscriptionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<OrdersGetAllUserSubscriptionsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<OrdersSubscriptionDto> items;

    /* compiled from: OrdersGetAllUserSubscriptionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<OrdersGetAllUserSubscriptionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final OrdersGetAllUserSubscriptionsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(OrdersGetAllUserSubscriptionsResponseDto.class, parcel, arrayList, i, 1);
            }
            return new OrdersGetAllUserSubscriptionsResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final OrdersGetAllUserSubscriptionsResponseDto[] newArray(int i) {
            return new OrdersGetAllUserSubscriptionsResponseDto[i];
        }
    }

    public OrdersGetAllUserSubscriptionsResponseDto(int i, List<OrdersSubscriptionDto> list) {
        this.count = i;
        this.items = list;
    }

    public final List<OrdersSubscriptionDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersGetAllUserSubscriptionsResponseDto)) {
            return false;
        }
        OrdersGetAllUserSubscriptionsResponseDto ordersGetAllUserSubscriptionsResponseDto = (OrdersGetAllUserSubscriptionsResponseDto) obj;
        return this.count == ordersGetAllUserSubscriptionsResponseDto.count && epx.f(this.items, ordersGetAllUserSubscriptionsResponseDto.items);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrdersGetAllUserSubscriptionsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
