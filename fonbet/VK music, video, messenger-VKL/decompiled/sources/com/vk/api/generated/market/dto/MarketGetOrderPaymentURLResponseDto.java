package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGetOrderPaymentURLResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetOrderPaymentURLResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetOrderPaymentURLResponseDto> CREATOR = new a();

    @pmi0("payment_parameters")
    private final MarketPaymentParametersDto paymentParameters;

    /* compiled from: MarketGetOrderPaymentURLResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetOrderPaymentURLResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetOrderPaymentURLResponseDto createFromParcel(Parcel parcel) {
            return new MarketGetOrderPaymentURLResponseDto(parcel.readInt() == 0 ? null : MarketPaymentParametersDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetOrderPaymentURLResponseDto[] newArray(int i) {
            return new MarketGetOrderPaymentURLResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketGetOrderPaymentURLResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final MarketPaymentParametersDto d() {
        return this.paymentParameters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketGetOrderPaymentURLResponseDto) && epx.f(this.paymentParameters, ((MarketGetOrderPaymentURLResponseDto) obj).paymentParameters);
    }

    public final int hashCode() {
        MarketPaymentParametersDto marketPaymentParametersDto = this.paymentParameters;
        if (marketPaymentParametersDto == null) {
            return 0;
        }
        return marketPaymentParametersDto.hashCode();
    }

    public final String toString() {
        return "MarketGetOrderPaymentURLResponseDto(paymentParameters=" + this.paymentParameters + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MarketPaymentParametersDto marketPaymentParametersDto = this.paymentParameters;
        if (marketPaymentParametersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketPaymentParametersDto.writeToParcel(parcel, i);
        }
    }

    public MarketGetOrderPaymentURLResponseDto(MarketPaymentParametersDto marketPaymentParametersDto) {
        this.paymentParameters = marketPaymentParametersDto;
    }

    public /* synthetic */ MarketGetOrderPaymentURLResponseDto(MarketPaymentParametersDto marketPaymentParametersDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : marketPaymentParametersDto);
    }
}
