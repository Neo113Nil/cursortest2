package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketBlockDataDto.kt */
/* loaded from: classes15.dex */
public final class MarketBlockDataDto implements Parcelable {
    public static final Parcelable.Creator<MarketBlockDataDto> CREATOR = new a();

    @pmi0("block_title")
    private final String blockTitle;

    @pmi0("button_link")
    private final String buttonLink;

    @pmi0("button_title")
    private final String buttonTitle;

    /* compiled from: MarketBlockDataDto.kt */
    public static final class a implements Parcelable.Creator<MarketBlockDataDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketBlockDataDto createFromParcel(Parcel parcel) {
            return new MarketBlockDataDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketBlockDataDto[] newArray(int i) {
            return new MarketBlockDataDto[i];
        }
    }

    public MarketBlockDataDto() {
        this(null, null, null, 7, null);
    }

    public final String d() {
        return this.blockTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.buttonLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketBlockDataDto)) {
            return false;
        }
        MarketBlockDataDto marketBlockDataDto = (MarketBlockDataDto) obj;
        return epx.f(this.blockTitle, marketBlockDataDto.blockTitle) && epx.f(this.buttonTitle, marketBlockDataDto.buttonTitle) && epx.f(this.buttonLink, marketBlockDataDto.buttonLink);
    }

    public final String f() {
        return this.buttonTitle;
    }

    public final int hashCode() {
        String str = this.blockTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.buttonTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonLink;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketBlockDataDto(blockTitle=");
        sb.append(this.blockTitle);
        sb.append(", buttonTitle=");
        sb.append(this.buttonTitle);
        sb.append(", buttonLink=");
        return ho8.a(sb, this.buttonLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.blockTitle);
        parcel.writeString(this.buttonTitle);
        parcel.writeString(this.buttonLink);
    }

    public MarketBlockDataDto(String str, String str2, String str3) {
        this.blockTitle = str;
        this.buttonTitle = str2;
        this.buttonLink = str3;
    }

    public /* synthetic */ MarketBlockDataDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
