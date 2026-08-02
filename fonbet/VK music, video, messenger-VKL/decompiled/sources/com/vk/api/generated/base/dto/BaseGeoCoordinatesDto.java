package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.xq;

/* compiled from: BaseGeoCoordinatesDto.kt */
/* loaded from: classes14.dex */
public final class BaseGeoCoordinatesDto implements Parcelable {
    public static final Parcelable.Creator<BaseGeoCoordinatesDto> CREATOR = new a();

    @pmi0("latitude")
    private final float latitude;

    @pmi0("longitude")
    private final float longitude;

    /* compiled from: BaseGeoCoordinatesDto.kt */
    public static final class a implements Parcelable.Creator<BaseGeoCoordinatesDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseGeoCoordinatesDto createFromParcel(Parcel parcel) {
            return new BaseGeoCoordinatesDto(parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseGeoCoordinatesDto[] newArray(int i) {
            return new BaseGeoCoordinatesDto[i];
        }
    }

    public BaseGeoCoordinatesDto(float f, float f2) {
        this.latitude = f;
        this.longitude = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseGeoCoordinatesDto)) {
            return false;
        }
        BaseGeoCoordinatesDto baseGeoCoordinatesDto = (BaseGeoCoordinatesDto) obj;
        return Float.compare(this.latitude, baseGeoCoordinatesDto.latitude) == 0 && Float.compare(this.longitude, baseGeoCoordinatesDto.longitude) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.longitude) + (Float.hashCode(this.latitude) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseGeoCoordinatesDto(latitude=");
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
