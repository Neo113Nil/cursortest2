package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketServicesDurationDto.kt */
/* loaded from: classes15.dex */
public final class MarketServicesDurationDto implements Parcelable {
    public static final Parcelable.Creator<MarketServicesDurationDto> CREATOR = new a();

    @pmi0("minutes")
    private final int minutes;

    @pmi0("text")
    private final String text;

    /* compiled from: MarketServicesDurationDto.kt */
    public static final class a implements Parcelable.Creator<MarketServicesDurationDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketServicesDurationDto createFromParcel(Parcel parcel) {
            return new MarketServicesDurationDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketServicesDurationDto[] newArray(int i) {
            return new MarketServicesDurationDto[i];
        }
    }

    public MarketServicesDurationDto(int i, String str) {
        this.minutes = i;
        this.text = str;
    }

    public final int d() {
        return this.minutes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketServicesDurationDto)) {
            return false;
        }
        MarketServicesDurationDto marketServicesDurationDto = (MarketServicesDurationDto) obj;
        return this.minutes == marketServicesDurationDto.minutes && epx.f(this.text, marketServicesDurationDto.text);
    }

    public final int hashCode() {
        return this.text.hashCode() + (Integer.hashCode(this.minutes) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketServicesDurationDto(minutes=");
        sb.append(this.minutes);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.minutes);
        parcel.writeString(this.text);
    }
}
