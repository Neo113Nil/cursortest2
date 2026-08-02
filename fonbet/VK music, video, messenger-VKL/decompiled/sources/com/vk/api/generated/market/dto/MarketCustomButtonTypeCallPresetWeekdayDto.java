package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketCustomButtonTypeCallPresetWeekdayDto.kt */
/* loaded from: classes15.dex */
public final class MarketCustomButtonTypeCallPresetWeekdayDto implements Parcelable {
    public static final Parcelable.Creator<MarketCustomButtonTypeCallPresetWeekdayDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0("weekday")
    private final String weekday;

    /* compiled from: MarketCustomButtonTypeCallPresetWeekdayDto.kt */
    public static final class a implements Parcelable.Creator<MarketCustomButtonTypeCallPresetWeekdayDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonTypeCallPresetWeekdayDto createFromParcel(Parcel parcel) {
            return new MarketCustomButtonTypeCallPresetWeekdayDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonTypeCallPresetWeekdayDto[] newArray(int i) {
            return new MarketCustomButtonTypeCallPresetWeekdayDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketCustomButtonTypeCallPresetWeekdayDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCustomButtonTypeCallPresetWeekdayDto)) {
            return false;
        }
        MarketCustomButtonTypeCallPresetWeekdayDto marketCustomButtonTypeCallPresetWeekdayDto = (MarketCustomButtonTypeCallPresetWeekdayDto) obj;
        return epx.f(this.weekday, marketCustomButtonTypeCallPresetWeekdayDto.weekday) && epx.f(this.name, marketCustomButtonTypeCallPresetWeekdayDto.name);
    }

    public final int hashCode() {
        String str = this.weekday;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCustomButtonTypeCallPresetWeekdayDto(weekday=");
        sb.append(this.weekday);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.weekday);
        parcel.writeString(this.name);
    }

    public MarketCustomButtonTypeCallPresetWeekdayDto(String str, String str2) {
        this.weekday = str;
        this.name = str2;
    }

    public /* synthetic */ MarketCustomButtonTypeCallPresetWeekdayDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
