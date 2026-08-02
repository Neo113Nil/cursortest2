package com.vk.api.generated.goodsOrders.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: GoodsOrdersNewOrderItemDto.kt */
/* loaded from: classes14.dex */
public final class GoodsOrdersNewOrderItemDto implements Parcelable {
    public static final Parcelable.Creator<GoodsOrdersNewOrderItemDto> CREATOR = new a();

    @pmi0("order_id")
    private final int orderId;

    @pmi0("payment_url")
    private final String paymentUrl;

    /* compiled from: GoodsOrdersNewOrderItemDto.kt */
    public static final class a implements Parcelable.Creator<GoodsOrdersNewOrderItemDto> {
        @Override // android.os.Parcelable.Creator
        public final GoodsOrdersNewOrderItemDto createFromParcel(Parcel parcel) {
            return new GoodsOrdersNewOrderItemDto(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final GoodsOrdersNewOrderItemDto[] newArray(int i) {
            return new GoodsOrdersNewOrderItemDto[i];
        }
    }

    public GoodsOrdersNewOrderItemDto(String str, int i) {
        this.paymentUrl = str;
        this.orderId = i;
    }

    public final int d() {
        return this.orderId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.paymentUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoodsOrdersNewOrderItemDto)) {
            return false;
        }
        GoodsOrdersNewOrderItemDto goodsOrdersNewOrderItemDto = (GoodsOrdersNewOrderItemDto) obj;
        return epx.f(this.paymentUrl, goodsOrdersNewOrderItemDto.paymentUrl) && this.orderId == goodsOrdersNewOrderItemDto.orderId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.orderId) + (this.paymentUrl.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodsOrdersNewOrderItemDto(paymentUrl=");
        sb.append(this.paymentUrl);
        sb.append(", orderId=");
        return vu5.b(sb, this.orderId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.paymentUrl);
        parcel.writeInt(this.orderId);
    }
}
