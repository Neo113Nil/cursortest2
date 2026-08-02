package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketOrderInfoBannerDto.kt */
/* loaded from: classes15.dex */
public final class MarketOrderInfoBannerDto implements Parcelable {
    public static final Parcelable.Creator<MarketOrderInfoBannerDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    /* compiled from: MarketOrderInfoBannerDto.kt */
    public static final class a implements Parcelable.Creator<MarketOrderInfoBannerDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketOrderInfoBannerDto createFromParcel(Parcel parcel) {
            return new MarketOrderInfoBannerDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketOrderInfoBannerDto[] newArray(int i) {
            return new MarketOrderInfoBannerDto[i];
        }
    }

    public MarketOrderInfoBannerDto(String str) {
        this.text = str;
    }

    public final String d() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketOrderInfoBannerDto) && epx.f(this.text, ((MarketOrderInfoBannerDto) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MarketOrderInfoBannerDto(text="), this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
    }
}
