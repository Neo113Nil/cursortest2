package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketCreateOrderResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketCreateOrderResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketCreateOrderResponseDto> CREATOR = new a();

    @pmi0("order_id")
    private final int orderId;

    @pmi0("payment_action")
    private final MarketPaymentActionDto paymentAction;

    @pmi0("payment_parameters")
    private final MarketPaymentParametersDto paymentParameters;

    /* compiled from: MarketCreateOrderResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketCreateOrderResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCreateOrderResponseDto createFromParcel(Parcel parcel) {
            return new MarketCreateOrderResponseDto(parcel.readInt(), parcel.readInt() == 0 ? null : MarketPaymentActionDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MarketPaymentParametersDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCreateOrderResponseDto[] newArray(int i) {
            return new MarketCreateOrderResponseDto[i];
        }
    }

    public MarketCreateOrderResponseDto(int i, MarketPaymentActionDto marketPaymentActionDto, MarketPaymentParametersDto marketPaymentParametersDto) {
        this.orderId = i;
        this.paymentAction = marketPaymentActionDto;
        this.paymentParameters = marketPaymentParametersDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCreateOrderResponseDto)) {
            return false;
        }
        MarketCreateOrderResponseDto marketCreateOrderResponseDto = (MarketCreateOrderResponseDto) obj;
        return this.orderId == marketCreateOrderResponseDto.orderId && epx.f(this.paymentAction, marketCreateOrderResponseDto.paymentAction) && epx.f(this.paymentParameters, marketCreateOrderResponseDto.paymentParameters);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.orderId) * 31;
        MarketPaymentActionDto marketPaymentActionDto = this.paymentAction;
        int hashCode2 = (hashCode + (marketPaymentActionDto == null ? 0 : marketPaymentActionDto.hashCode())) * 31;
        MarketPaymentParametersDto marketPaymentParametersDto = this.paymentParameters;
        return hashCode2 + (marketPaymentParametersDto != null ? marketPaymentParametersDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketCreateOrderResponseDto(orderId=" + this.orderId + ", paymentAction=" + this.paymentAction + ", paymentParameters=" + this.paymentParameters + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.orderId);
        MarketPaymentActionDto marketPaymentActionDto = this.paymentAction;
        if (marketPaymentActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketPaymentActionDto.writeToParcel(parcel, i);
        }
        MarketPaymentParametersDto marketPaymentParametersDto = this.paymentParameters;
        if (marketPaymentParametersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketPaymentParametersDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketCreateOrderResponseDto(int i, MarketPaymentActionDto marketPaymentActionDto, MarketPaymentParametersDto marketPaymentParametersDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : marketPaymentActionDto, (i2 & 4) != 0 ? null : marketPaymentParametersDto);
    }
}
