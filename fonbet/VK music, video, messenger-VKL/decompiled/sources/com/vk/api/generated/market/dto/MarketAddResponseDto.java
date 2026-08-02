package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MarketAddResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketAddResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketAddResponseDto> CREATOR = new a();

    @pmi0("market_item_id")
    private final int marketItemId;

    /* compiled from: MarketAddResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketAddResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketAddResponseDto createFromParcel(Parcel parcel) {
            return new MarketAddResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketAddResponseDto[] newArray(int i) {
            return new MarketAddResponseDto[i];
        }
    }

    public MarketAddResponseDto(int i) {
        this.marketItemId = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketAddResponseDto) && this.marketItemId == ((MarketAddResponseDto) obj).marketItemId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.marketItemId);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("MarketAddResponseDto(marketItemId="), this.marketItemId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.marketItemId);
    }
}
