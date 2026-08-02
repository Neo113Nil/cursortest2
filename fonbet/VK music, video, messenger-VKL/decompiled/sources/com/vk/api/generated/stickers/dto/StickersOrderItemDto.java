package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: StickersOrderItemDto.kt */
/* loaded from: classes15.dex */
public final class StickersOrderItemDto implements Parcelable {
    public static final Parcelable.Creator<StickersOrderItemDto> CREATOR = new a();

    @pmi0("buyer_id")
    private final int buyerId;

    @pmi0("discount")
    private final String discount;

    @pmi0("error")
    private final String error;

    @pmi0("price")
    private final StickersOrderPriceDto price;

    @pmi0("product_id")
    private final int productId;

    @pmi0("recipient_id")
    private final int recipientId;

    /* compiled from: StickersOrderItemDto.kt */
    public static final class a implements Parcelable.Creator<StickersOrderItemDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersOrderItemDto createFromParcel(Parcel parcel) {
            return new StickersOrderItemDto(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : StickersOrderPriceDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersOrderItemDto[] newArray(int i) {
            return new StickersOrderItemDto[i];
        }
    }

    public StickersOrderItemDto(int i, int i2, int i3, StickersOrderPriceDto stickersOrderPriceDto, String str, String str2) {
        this.buyerId = i;
        this.productId = i2;
        this.recipientId = i3;
        this.price = stickersOrderPriceDto;
        this.error = str;
        this.discount = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersOrderItemDto)) {
            return false;
        }
        StickersOrderItemDto stickersOrderItemDto = (StickersOrderItemDto) obj;
        return this.buyerId == stickersOrderItemDto.buyerId && this.productId == stickersOrderItemDto.productId && this.recipientId == stickersOrderItemDto.recipientId && epx.f(this.price, stickersOrderItemDto.price) && epx.f(this.error, stickersOrderItemDto.error) && epx.f(this.discount, stickersOrderItemDto.discount);
    }

    public final int hashCode() {
        int a2 = shy.a(this.recipientId, shy.a(this.productId, Integer.hashCode(this.buyerId) * 31, 31), 31);
        StickersOrderPriceDto stickersOrderPriceDto = this.price;
        int hashCode = (a2 + (stickersOrderPriceDto == null ? 0 : stickersOrderPriceDto.hashCode())) * 31;
        String str = this.error;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.discount;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersOrderItemDto(buyerId=");
        sb.append(this.buyerId);
        sb.append(", productId=");
        sb.append(this.productId);
        sb.append(", recipientId=");
        sb.append(this.recipientId);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", discount=");
        return ho8.a(sb, this.discount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.buyerId);
        parcel.writeInt(this.productId);
        parcel.writeInt(this.recipientId);
        StickersOrderPriceDto stickersOrderPriceDto = this.price;
        if (stickersOrderPriceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersOrderPriceDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.error);
        parcel.writeString(this.discount);
    }

    public /* synthetic */ StickersOrderItemDto(int i, int i2, int i3, StickersOrderPriceDto stickersOrderPriceDto, String str, String str2, int i4, zcl zclVar) {
        this(i, i2, i3, (i4 & 8) != 0 ? null : stickersOrderPriceDto, (i4 & 16) != 0 ? null : str, (i4 & 32) != 0 ? null : str2);
    }
}
