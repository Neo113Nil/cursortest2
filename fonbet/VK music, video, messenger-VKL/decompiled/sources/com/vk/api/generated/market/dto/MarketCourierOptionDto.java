package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: MarketCourierOptionDto.kt */
/* loaded from: classes15.dex */
public final class MarketCourierOptionDto implements Parcelable {
    public static final Parcelable.Creator<MarketCourierOptionDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("name")
    private final String name;

    @pmi0("period")
    private final int period;

    @pmi0("price")
    private final String price;

    /* compiled from: MarketCourierOptionDto.kt */
    public static final class a implements Parcelable.Creator<MarketCourierOptionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCourierOptionDto createFromParcel(Parcel parcel) {
            return new MarketCourierOptionDto(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCourierOptionDto[] newArray(int i) {
            return new MarketCourierOptionDto[i];
        }
    }

    public MarketCourierOptionDto(String str, String str2, int i, String str3) {
        this.id = str;
        this.name = str2;
        this.period = i;
        this.price = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCourierOptionDto)) {
            return false;
        }
        MarketCourierOptionDto marketCourierOptionDto = (MarketCourierOptionDto) obj;
        return epx.f(this.id, marketCourierOptionDto.id) && epx.f(this.name, marketCourierOptionDto.name) && this.period == marketCourierOptionDto.period && epx.f(this.price, marketCourierOptionDto.price);
    }

    public final int hashCode() {
        return this.price.hashCode() + shy.a(this.period, urd0.a(this.id.hashCode() * 31, 31, this.name), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCourierOptionDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", period=");
        sb.append(this.period);
        sb.append(", price=");
        return ho8.a(sb, this.price, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeInt(this.period);
        parcel.writeString(this.price);
    }
}
