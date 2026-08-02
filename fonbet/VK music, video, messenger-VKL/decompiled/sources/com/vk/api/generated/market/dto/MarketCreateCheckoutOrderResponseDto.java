package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketCreateCheckoutOrderResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketCreateCheckoutOrderResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketCreateCheckoutOrderResponseDto> CREATOR = new a();

    @pmi0("display_order_id")
    private final String displayOrderId;

    @pmi0("order_id")
    private final int orderId;

    @pmi0("payment_parameters")
    private final MarketPaymentParametersDto paymentParameters;

    @pmi0("seller")
    private final MarketOrderSellerDto seller;

    /* compiled from: MarketCreateCheckoutOrderResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketCreateCheckoutOrderResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCreateCheckoutOrderResponseDto createFromParcel(Parcel parcel) {
            return new MarketCreateCheckoutOrderResponseDto(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : MarketOrderSellerDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MarketPaymentParametersDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCreateCheckoutOrderResponseDto[] newArray(int i) {
            return new MarketCreateCheckoutOrderResponseDto[i];
        }
    }

    public MarketCreateCheckoutOrderResponseDto(int i, String str, MarketOrderSellerDto marketOrderSellerDto, MarketPaymentParametersDto marketPaymentParametersDto) {
        this.orderId = i;
        this.displayOrderId = str;
        this.seller = marketOrderSellerDto;
        this.paymentParameters = marketPaymentParametersDto;
    }

    public final String d() {
        return this.displayOrderId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.orderId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCreateCheckoutOrderResponseDto)) {
            return false;
        }
        MarketCreateCheckoutOrderResponseDto marketCreateCheckoutOrderResponseDto = (MarketCreateCheckoutOrderResponseDto) obj;
        return this.orderId == marketCreateCheckoutOrderResponseDto.orderId && epx.f(this.displayOrderId, marketCreateCheckoutOrderResponseDto.displayOrderId) && epx.f(this.seller, marketCreateCheckoutOrderResponseDto.seller) && epx.f(this.paymentParameters, marketCreateCheckoutOrderResponseDto.paymentParameters);
    }

    public final MarketPaymentParametersDto f() {
        return this.paymentParameters;
    }

    public final MarketOrderSellerDto g() {
        return this.seller;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.orderId) * 31, 31, this.displayOrderId);
        MarketOrderSellerDto marketOrderSellerDto = this.seller;
        int hashCode = (a2 + (marketOrderSellerDto == null ? 0 : marketOrderSellerDto.hashCode())) * 31;
        MarketPaymentParametersDto marketPaymentParametersDto = this.paymentParameters;
        return hashCode + (marketPaymentParametersDto != null ? marketPaymentParametersDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketCreateCheckoutOrderResponseDto(orderId=" + this.orderId + ", displayOrderId=" + this.displayOrderId + ", seller=" + this.seller + ", paymentParameters=" + this.paymentParameters + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.orderId);
        parcel.writeString(this.displayOrderId);
        MarketOrderSellerDto marketOrderSellerDto = this.seller;
        if (marketOrderSellerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketOrderSellerDto.writeToParcel(parcel, i);
        }
        MarketPaymentParametersDto marketPaymentParametersDto = this.paymentParameters;
        if (marketPaymentParametersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketPaymentParametersDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketCreateCheckoutOrderResponseDto(int i, String str, MarketOrderSellerDto marketOrderSellerDto, MarketPaymentParametersDto marketPaymentParametersDto, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : marketOrderSellerDto, (i2 & 8) != 0 ? null : marketPaymentParametersDto);
    }
}
