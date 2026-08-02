package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketSettingsGroupDto.kt */
/* loaded from: classes15.dex */
public final class MarketSettingsGroupDto implements Parcelable {
    public static final Parcelable.Creator<MarketSettingsGroupDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_50")
    private final String photo50;

    /* compiled from: MarketSettingsGroupDto.kt */
    public static final class a implements Parcelable.Creator<MarketSettingsGroupDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSettingsGroupDto createFromParcel(Parcel parcel) {
            return new MarketSettingsGroupDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSettingsGroupDto[] newArray(int i) {
            return new MarketSettingsGroupDto[i];
        }
    }

    public MarketSettingsGroupDto(String str, String str2, String str3, String str4) {
        this.name = str;
        this.photo50 = str2;
        this.photo100 = str3;
        this.photo200 = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSettingsGroupDto)) {
            return false;
        }
        MarketSettingsGroupDto marketSettingsGroupDto = (MarketSettingsGroupDto) obj;
        return epx.f(this.name, marketSettingsGroupDto.name) && epx.f(this.photo50, marketSettingsGroupDto.photo50) && epx.f(this.photo100, marketSettingsGroupDto.photo100) && epx.f(this.photo200, marketSettingsGroupDto.photo200);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.photo50;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo100;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo200;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketSettingsGroupDto(name=");
        sb.append(this.name);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photo200=");
        return ho8.a(sb, this.photo200, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo200);
    }

    public /* synthetic */ MarketSettingsGroupDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
