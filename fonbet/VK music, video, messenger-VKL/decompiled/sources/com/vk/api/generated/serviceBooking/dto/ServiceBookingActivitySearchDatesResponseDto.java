package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: ServiceBookingActivitySearchDatesResponseDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingActivitySearchDatesResponseDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingActivitySearchDatesResponseDto> CREATOR = new a();

    @pmi0("dates")
    private final List<String> dates;

    /* compiled from: ServiceBookingActivitySearchDatesResponseDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingActivitySearchDatesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingActivitySearchDatesResponseDto createFromParcel(Parcel parcel) {
            return new ServiceBookingActivitySearchDatesResponseDto(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingActivitySearchDatesResponseDto[] newArray(int i) {
            return new ServiceBookingActivitySearchDatesResponseDto[i];
        }
    }

    public ServiceBookingActivitySearchDatesResponseDto(List<String> list) {
        this.dates = list;
    }

    public final List<String> d() {
        return this.dates;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServiceBookingActivitySearchDatesResponseDto) && epx.f(this.dates, ((ServiceBookingActivitySearchDatesResponseDto) obj).dates);
    }

    public final int hashCode() {
        return this.dates.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ServiceBookingActivitySearchDatesResponseDto(dates="), this.dates);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.dates);
    }
}
