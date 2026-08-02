package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGetPromoteUrlResponseObjectDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetPromoteUrlResponseObjectDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetPromoteUrlResponseObjectDto> CREATOR = new a();

    @pmi0("url")
    private final String url;

    /* compiled from: MarketGetPromoteUrlResponseObjectDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetPromoteUrlResponseObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetPromoteUrlResponseObjectDto createFromParcel(Parcel parcel) {
            return new MarketGetPromoteUrlResponseObjectDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetPromoteUrlResponseObjectDto[] newArray(int i) {
            return new MarketGetPromoteUrlResponseObjectDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketGetPromoteUrlResponseObjectDto() {
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
        return (obj instanceof MarketGetPromoteUrlResponseObjectDto) && epx.f(this.url, ((MarketGetPromoteUrlResponseObjectDto) obj).url);
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
        return ho8.a(new StringBuilder("MarketGetPromoteUrlResponseObjectDto(url="), this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
    }

    public MarketGetPromoteUrlResponseObjectDto(String str) {
        this.url = str;
    }

    public /* synthetic */ MarketGetPromoteUrlResponseObjectDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
