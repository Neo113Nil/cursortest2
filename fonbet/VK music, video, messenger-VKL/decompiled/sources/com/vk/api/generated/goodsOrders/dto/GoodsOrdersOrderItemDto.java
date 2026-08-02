package com.vk.api.generated.goodsOrders.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GoodsOrdersOrderItemDto.kt */
/* loaded from: classes14.dex */
public final class GoodsOrdersOrderItemDto implements Parcelable {
    public static final Parcelable.Creator<GoodsOrdersOrderItemDto> CREATOR = new a();

    @pmi0("amount")
    private final Integer amount;

    @pmi0("app_id")
    private final int appId;

    @pmi0("date")
    private final Integer date;

    @pmi0("fiscal_id")
    private final String fiscalId;

    @pmi0("merchant_product_id")
    private final String merchantProductId;

    @pmi0("order_status")
    private final Integer orderStatus;

    @pmi0("payment_status")
    private final Integer paymentStatus;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: GoodsOrdersOrderItemDto.kt */
    public static final class a implements Parcelable.Creator<GoodsOrdersOrderItemDto> {
        @Override // android.os.Parcelable.Creator
        public final GoodsOrdersOrderItemDto createFromParcel(Parcel parcel) {
            return new GoodsOrdersOrderItemDto(parcel.readInt(), (UserId) parcel.readParcelable(GoodsOrdersOrderItemDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GoodsOrdersOrderItemDto[] newArray(int i) {
            return new GoodsOrdersOrderItemDto[i];
        }
    }

    public GoodsOrdersOrderItemDto(int i, UserId userId, String str, Integer num, Integer num2, String str2, Integer num3, Integer num4) {
        this.appId = i;
        this.userId = userId;
        this.merchantProductId = str;
        this.paymentStatus = num;
        this.orderStatus = num2;
        this.fiscalId = str2;
        this.amount = num3;
        this.date = num4;
    }

    public final Integer d() {
        return this.orderStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.paymentStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoodsOrdersOrderItemDto)) {
            return false;
        }
        GoodsOrdersOrderItemDto goodsOrdersOrderItemDto = (GoodsOrdersOrderItemDto) obj;
        return this.appId == goodsOrdersOrderItemDto.appId && epx.f(this.userId, goodsOrdersOrderItemDto.userId) && epx.f(this.merchantProductId, goodsOrdersOrderItemDto.merchantProductId) && epx.f(this.paymentStatus, goodsOrdersOrderItemDto.paymentStatus) && epx.f(this.orderStatus, goodsOrdersOrderItemDto.orderStatus) && epx.f(this.fiscalId, goodsOrdersOrderItemDto.fiscalId) && epx.f(this.amount, goodsOrdersOrderItemDto.amount) && epx.f(this.date, goodsOrdersOrderItemDto.date);
    }

    public final int hashCode() {
        int a2 = urd0.a(bh10.a(Integer.hashCode(this.appId) * 31, 31, this.userId.b), 31, this.merchantProductId);
        Integer num = this.paymentStatus;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.orderStatus;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.fiscalId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.amount;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.date;
        return hashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodsOrdersOrderItemDto(appId=");
        sb.append(this.appId);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", merchantProductId=");
        sb.append(this.merchantProductId);
        sb.append(", paymentStatus=");
        sb.append(this.paymentStatus);
        sb.append(", orderStatus=");
        sb.append(this.orderStatus);
        sb.append(", fiscalId=");
        sb.append(this.fiscalId);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", date=");
        return uqi.b(sb, this.date, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.appId);
        parcel.writeParcelable(this.userId, i);
        parcel.writeString(this.merchantProductId);
        Integer num = this.paymentStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.orderStatus;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.fiscalId);
        Integer num3 = this.amount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.date;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
    }

    public /* synthetic */ GoodsOrdersOrderItemDto(int i, UserId userId, String str, Integer num, Integer num2, String str2, Integer num3, Integer num4, int i2, zcl zclVar) {
        this(i, userId, str, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : num2, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : num3, (i2 & 128) != 0 ? null : num4);
    }
}
