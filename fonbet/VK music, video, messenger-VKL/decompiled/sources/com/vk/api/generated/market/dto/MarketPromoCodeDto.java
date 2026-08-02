package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketPromoCodeDto.kt */
/* loaded from: classes15.dex */
public final class MarketPromoCodeDto implements Parcelable {
    public static final Parcelable.Creator<MarketPromoCodeDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    /* compiled from: MarketPromoCodeDto.kt */
    public static final class a implements Parcelable.Creator<MarketPromoCodeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketPromoCodeDto createFromParcel(Parcel parcel) {
            return new MarketPromoCodeDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketPromoCodeDto[] newArray(int i) {
            return new MarketPromoCodeDto[i];
        }
    }

    public MarketPromoCodeDto(String str) {
        this.name = str;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketPromoCodeDto) && epx.f(this.name, ((MarketPromoCodeDto) obj).name);
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MarketPromoCodeDto(name="), this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
    }
}
