package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGetEditUrlResponseObjectDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetEditUrlResponseObjectDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetEditUrlResponseObjectDto> CREATOR = new a();

    @pmi0("url")
    private final String url;

    /* compiled from: MarketGetEditUrlResponseObjectDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetEditUrlResponseObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetEditUrlResponseObjectDto createFromParcel(Parcel parcel) {
            return new MarketGetEditUrlResponseObjectDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetEditUrlResponseObjectDto[] newArray(int i) {
            return new MarketGetEditUrlResponseObjectDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketGetEditUrlResponseObjectDto() {
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
        return (obj instanceof MarketGetEditUrlResponseObjectDto) && epx.f(this.url, ((MarketGetEditUrlResponseObjectDto) obj).url);
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
        return ho8.a(new StringBuilder("MarketGetEditUrlResponseObjectDto(url="), this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
    }

    public MarketGetEditUrlResponseObjectDto(String str) {
        this.url = str;
    }

    public /* synthetic */ MarketGetEditUrlResponseObjectDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
