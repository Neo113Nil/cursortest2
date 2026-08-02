package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketDeliveryServiceDto.kt */
/* loaded from: classes15.dex */
public final class MarketDeliveryServiceDto implements Parcelable {
    public static final Parcelable.Creator<MarketDeliveryServiceDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketDeliveryServiceDto.kt */
    public static final class a implements Parcelable.Creator<MarketDeliveryServiceDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryServiceDto createFromParcel(Parcel parcel) {
            return new MarketDeliveryServiceDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryServiceDto[] newArray(int i) {
            return new MarketDeliveryServiceDto[i];
        }
    }

    public MarketDeliveryServiceDto(int i, String str) {
        this.id = i;
        this.title = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketDeliveryServiceDto)) {
            return false;
        }
        MarketDeliveryServiceDto marketDeliveryServiceDto = (MarketDeliveryServiceDto) obj;
        return this.id == marketDeliveryServiceDto.id && epx.f(this.title, marketDeliveryServiceDto.title);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.title.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketDeliveryServiceDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
    }
}
