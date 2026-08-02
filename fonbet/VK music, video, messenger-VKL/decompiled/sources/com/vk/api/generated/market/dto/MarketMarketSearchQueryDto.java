package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketMarketSearchQueryDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketSearchQueryDto implements Parcelable {
    public static final Parcelable.Creator<MarketMarketSearchQueryDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    /* compiled from: MarketMarketSearchQueryDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketSearchQueryDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketSearchQueryDto createFromParcel(Parcel parcel) {
            return new MarketMarketSearchQueryDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketSearchQueryDto[] newArray(int i) {
            return new MarketMarketSearchQueryDto[i];
        }
    }

    public MarketMarketSearchQueryDto(String str) {
        this.text = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketMarketSearchQueryDto) && epx.f(this.text, ((MarketMarketSearchQueryDto) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MarketMarketSearchQueryDto(text="), this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
    }
}
