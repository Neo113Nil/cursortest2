package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGetEditUrlResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetEditUrlResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetEditUrlResponseDto> CREATOR = new a();

    @pmi0("url")
    private final String url;

    /* compiled from: MarketGetEditUrlResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetEditUrlResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetEditUrlResponseDto createFromParcel(Parcel parcel) {
            return new MarketGetEditUrlResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetEditUrlResponseDto[] newArray(int i) {
            return new MarketGetEditUrlResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketGetEditUrlResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketGetEditUrlResponseDto) && epx.f(this.url, ((MarketGetEditUrlResponseDto) obj).url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.url;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MarketGetEditUrlResponseDto(url="), this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
    }

    public MarketGetEditUrlResponseDto(String str) {
        this.url = str;
    }

    public /* synthetic */ MarketGetEditUrlResponseDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
