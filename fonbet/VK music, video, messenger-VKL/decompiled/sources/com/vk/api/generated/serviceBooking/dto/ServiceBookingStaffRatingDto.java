package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.xq;

/* compiled from: ServiceBookingStaffRatingDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingStaffRatingDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingStaffRatingDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    @pmi0("value")
    private final float value;

    /* compiled from: ServiceBookingStaffRatingDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingStaffRatingDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingStaffRatingDto createFromParcel(Parcel parcel) {
            return new ServiceBookingStaffRatingDto(parcel.readString(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingStaffRatingDto[] newArray(int i) {
            return new ServiceBookingStaffRatingDto[i];
        }
    }

    public ServiceBookingStaffRatingDto(String str, float f) {
        this.text = str;
        this.value = f;
    }

    public final String d() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingStaffRatingDto)) {
            return false;
        }
        ServiceBookingStaffRatingDto serviceBookingStaffRatingDto = (ServiceBookingStaffRatingDto) obj;
        return epx.f(this.text, serviceBookingStaffRatingDto.text) && Float.compare(this.value, serviceBookingStaffRatingDto.value) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.value) + (this.text.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingStaffRatingDto(text=");
        sb.append(this.text);
        sb.append(", value=");
        return xq.c(')', this.value, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeFloat(this.value);
    }
}
