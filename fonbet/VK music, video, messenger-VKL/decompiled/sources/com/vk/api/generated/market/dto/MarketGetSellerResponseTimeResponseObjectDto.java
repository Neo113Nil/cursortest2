package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGetSellerResponseTimeResponseObjectDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetSellerResponseTimeResponseObjectDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetSellerResponseTimeResponseObjectDto> CREATOR = new a();

    @pmi0("long_text")
    private final String longText;

    @pmi0("minutes")
    private final int minutes;

    @pmi0("short_text")
    private final String shortText;

    /* compiled from: MarketGetSellerResponseTimeResponseObjectDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetSellerResponseTimeResponseObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetSellerResponseTimeResponseObjectDto createFromParcel(Parcel parcel) {
            return new MarketGetSellerResponseTimeResponseObjectDto(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetSellerResponseTimeResponseObjectDto[] newArray(int i) {
            return new MarketGetSellerResponseTimeResponseObjectDto[i];
        }
    }

    public MarketGetSellerResponseTimeResponseObjectDto(int i, String str, String str2) {
        this.minutes = i;
        this.shortText = str;
        this.longText = str2;
    }

    public final String d() {
        return this.longText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.minutes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetSellerResponseTimeResponseObjectDto)) {
            return false;
        }
        MarketGetSellerResponseTimeResponseObjectDto marketGetSellerResponseTimeResponseObjectDto = (MarketGetSellerResponseTimeResponseObjectDto) obj;
        return this.minutes == marketGetSellerResponseTimeResponseObjectDto.minutes && epx.f(this.shortText, marketGetSellerResponseTimeResponseObjectDto.shortText) && epx.f(this.longText, marketGetSellerResponseTimeResponseObjectDto.longText);
    }

    public final String f() {
        return this.shortText;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.minutes) * 31;
        String str = this.shortText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.longText;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetSellerResponseTimeResponseObjectDto(minutes=");
        sb.append(this.minutes);
        sb.append(", shortText=");
        sb.append(this.shortText);
        sb.append(", longText=");
        return ho8.a(sb, this.longText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.minutes);
        parcel.writeString(this.shortText);
        parcel.writeString(this.longText);
    }

    public /* synthetic */ MarketGetSellerResponseTimeResponseObjectDto(int i, String str, String str2, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
    }
}
