package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketOrderTagDto.kt */
/* loaded from: classes15.dex */
public final class MarketOrderTagDto implements Parcelable {
    public static final Parcelable.Creator<MarketOrderTagDto> CREATOR = new a();

    @pmi0("index")
    private final int index;

    @pmi0("name")
    private final String name;

    /* compiled from: MarketOrderTagDto.kt */
    public static final class a implements Parcelable.Creator<MarketOrderTagDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketOrderTagDto createFromParcel(Parcel parcel) {
            return new MarketOrderTagDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketOrderTagDto[] newArray(int i) {
            return new MarketOrderTagDto[i];
        }
    }

    public MarketOrderTagDto(int i, String str) {
        this.index = i;
        this.name = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketOrderTagDto)) {
            return false;
        }
        MarketOrderTagDto marketOrderTagDto = (MarketOrderTagDto) obj;
        return this.index == marketOrderTagDto.index && epx.f(this.name, marketOrderTagDto.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.index) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketOrderTagDto(index=");
        sb.append(this.index);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeString(this.name);
    }
}
