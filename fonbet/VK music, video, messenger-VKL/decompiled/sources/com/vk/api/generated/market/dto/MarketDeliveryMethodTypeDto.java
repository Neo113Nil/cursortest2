package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketDeliveryMethodTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketDeliveryMethodTypeDto implements Parcelable {
    public static final Parcelable.Creator<MarketDeliveryMethodTypeDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0("type")
    private final int type;

    /* compiled from: MarketDeliveryMethodTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketDeliveryMethodTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryMethodTypeDto createFromParcel(Parcel parcel) {
            return new MarketDeliveryMethodTypeDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryMethodTypeDto[] newArray(int i) {
            return new MarketDeliveryMethodTypeDto[i];
        }
    }

    public MarketDeliveryMethodTypeDto(int i, String str) {
        this.type = i;
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
        if (!(obj instanceof MarketDeliveryMethodTypeDto)) {
            return false;
        }
        MarketDeliveryMethodTypeDto marketDeliveryMethodTypeDto = (MarketDeliveryMethodTypeDto) obj;
        return this.type == marketDeliveryMethodTypeDto.type && epx.f(this.name, marketDeliveryMethodTypeDto.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.type) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketDeliveryMethodTypeDto(type=");
        sb.append(this.type);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeString(this.name);
    }
}
