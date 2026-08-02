package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4504q2;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGetOrderByIdResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetOrderByIdResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetOrderByIdResponseDto> CREATOR = new a();

    @pmi0(C4504q2.u)
    private final MarketOrderDto order;

    /* compiled from: MarketGetOrderByIdResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetOrderByIdResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetOrderByIdResponseDto createFromParcel(Parcel parcel) {
            return new MarketGetOrderByIdResponseDto(parcel.readInt() == 0 ? null : MarketOrderDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetOrderByIdResponseDto[] newArray(int i) {
            return new MarketGetOrderByIdResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketGetOrderByIdResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final MarketOrderDto d() {
        return this.order;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketGetOrderByIdResponseDto) && epx.f(this.order, ((MarketGetOrderByIdResponseDto) obj).order);
    }

    public final int hashCode() {
        MarketOrderDto marketOrderDto = this.order;
        if (marketOrderDto == null) {
            return 0;
        }
        return marketOrderDto.hashCode();
    }

    public final String toString() {
        return "MarketGetOrderByIdResponseDto(order=" + this.order + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MarketOrderDto marketOrderDto = this.order;
        if (marketOrderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketOrderDto.writeToParcel(parcel, i);
        }
    }

    public MarketGetOrderByIdResponseDto(MarketOrderDto marketOrderDto) {
        this.order = marketOrderDto;
    }

    public /* synthetic */ MarketGetOrderByIdResponseDto(MarketOrderDto marketOrderDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : marketOrderDto);
    }
}
