package com.vk.api.generated.orders.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: OrdersConfirmSubscriptionResponseDto.kt */
/* loaded from: classes15.dex */
public final class OrdersConfirmSubscriptionResponseDto implements Parcelable {
    public static final Parcelable.Creator<OrdersConfirmSubscriptionResponseDto> CREATOR = new a();

    @pmi0("subscription_id")
    private final int subscriptionId;

    /* compiled from: OrdersConfirmSubscriptionResponseDto.kt */
    public static final class a implements Parcelable.Creator<OrdersConfirmSubscriptionResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final OrdersConfirmSubscriptionResponseDto createFromParcel(Parcel parcel) {
            return new OrdersConfirmSubscriptionResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final OrdersConfirmSubscriptionResponseDto[] newArray(int i) {
            return new OrdersConfirmSubscriptionResponseDto[i];
        }
    }

    public OrdersConfirmSubscriptionResponseDto(int i) {
        this.subscriptionId = i;
    }

    public final int d() {
        return this.subscriptionId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrdersConfirmSubscriptionResponseDto) && this.subscriptionId == ((OrdersConfirmSubscriptionResponseDto) obj).subscriptionId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.subscriptionId);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("OrdersConfirmSubscriptionResponseDto(subscriptionId="), this.subscriptionId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.subscriptionId);
    }
}
