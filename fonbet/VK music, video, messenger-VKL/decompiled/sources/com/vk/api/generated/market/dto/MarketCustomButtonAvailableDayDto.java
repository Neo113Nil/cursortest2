package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketCustomButtonAvailableDayDto.kt */
/* loaded from: classes15.dex */
public final class MarketCustomButtonAvailableDayDto implements Parcelable {
    public static final Parcelable.Creator<MarketCustomButtonAvailableDayDto> CREATOR = new a();

    @pmi0("from")
    private final String from;

    @pmi0("is_workday")
    private final boolean isWorkday;

    @pmi0("to")
    private final String to;

    /* compiled from: MarketCustomButtonAvailableDayDto.kt */
    public static final class a implements Parcelable.Creator<MarketCustomButtonAvailableDayDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonAvailableDayDto createFromParcel(Parcel parcel) {
            return new MarketCustomButtonAvailableDayDto(parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonAvailableDayDto[] newArray(int i) {
            return new MarketCustomButtonAvailableDayDto[i];
        }
    }

    public MarketCustomButtonAvailableDayDto(boolean z, String str, String str2) {
        this.isWorkday = z;
        this.from = str;
        this.to = str2;
    }

    public final String d() {
        return this.from;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.to;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCustomButtonAvailableDayDto)) {
            return false;
        }
        MarketCustomButtonAvailableDayDto marketCustomButtonAvailableDayDto = (MarketCustomButtonAvailableDayDto) obj;
        return this.isWorkday == marketCustomButtonAvailableDayDto.isWorkday && epx.f(this.from, marketCustomButtonAvailableDayDto.from) && epx.f(this.to, marketCustomButtonAvailableDayDto.to);
    }

    public final boolean f() {
        return this.isWorkday;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isWorkday) * 31;
        String str = this.from;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.to;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCustomButtonAvailableDayDto(isWorkday=");
        sb.append(this.isWorkday);
        sb.append(", from=");
        sb.append(this.from);
        sb.append(", to=");
        return ho8.a(sb, this.to, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isWorkday ? 1 : 0);
        parcel.writeString(this.from);
        parcel.writeString(this.to);
    }

    public /* synthetic */ MarketCustomButtonAvailableDayDto(boolean z, String str, String str2, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
