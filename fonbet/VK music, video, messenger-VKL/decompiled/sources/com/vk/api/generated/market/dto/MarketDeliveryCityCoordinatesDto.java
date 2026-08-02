package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.xq;

/* compiled from: MarketDeliveryCityCoordinatesDto.kt */
/* loaded from: classes15.dex */
public final class MarketDeliveryCityCoordinatesDto implements Parcelable {
    public static final Parcelable.Creator<MarketDeliveryCityCoordinatesDto> CREATOR = new a();

    @pmi0("latitude")
    private final float latitude;

    @pmi0("longitude")
    private final float longitude;

    /* compiled from: MarketDeliveryCityCoordinatesDto.kt */
    public static final class a implements Parcelable.Creator<MarketDeliveryCityCoordinatesDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryCityCoordinatesDto createFromParcel(Parcel parcel) {
            return new MarketDeliveryCityCoordinatesDto(parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryCityCoordinatesDto[] newArray(int i) {
            return new MarketDeliveryCityCoordinatesDto[i];
        }
    }

    public MarketDeliveryCityCoordinatesDto(float f, float f2) {
        this.latitude = f;
        this.longitude = f2;
    }

    public final float d() {
        return this.latitude;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float e() {
        return this.longitude;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketDeliveryCityCoordinatesDto)) {
            return false;
        }
        MarketDeliveryCityCoordinatesDto marketDeliveryCityCoordinatesDto = (MarketDeliveryCityCoordinatesDto) obj;
        return Float.compare(this.latitude, marketDeliveryCityCoordinatesDto.latitude) == 0 && Float.compare(this.longitude, marketDeliveryCityCoordinatesDto.longitude) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.longitude) + (Float.hashCode(this.latitude) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketDeliveryCityCoordinatesDto(latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        return xq.c(')', this.longitude, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.latitude);
        parcel.writeFloat(this.longitude);
    }
}
