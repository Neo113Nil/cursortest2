package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketDeliveryFreeTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketDeliveryFreeTypeDto implements Parcelable {
    public static final Parcelable.Creator<MarketDeliveryFreeTypeDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketDeliveryFreeTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketDeliveryFreeTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryFreeTypeDto createFromParcel(Parcel parcel) {
            return new MarketDeliveryFreeTypeDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryFreeTypeDto[] newArray(int i) {
            return new MarketDeliveryFreeTypeDto[i];
        }
    }

    public MarketDeliveryFreeTypeDto(int i, String str) {
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
        if (!(obj instanceof MarketDeliveryFreeTypeDto)) {
            return false;
        }
        MarketDeliveryFreeTypeDto marketDeliveryFreeTypeDto = (MarketDeliveryFreeTypeDto) obj;
        return this.id == marketDeliveryFreeTypeDto.id && epx.f(this.title, marketDeliveryFreeTypeDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketDeliveryFreeTypeDto(id=");
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
