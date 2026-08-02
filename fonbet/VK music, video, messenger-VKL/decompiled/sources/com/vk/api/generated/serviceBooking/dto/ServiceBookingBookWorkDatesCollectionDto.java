package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: ServiceBookingBookWorkDatesCollectionDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingBookWorkDatesCollectionDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingBookWorkDatesCollectionDto> CREATOR = new a();

    @pmi0("booking_dates")
    private final List<String> bookingDates;

    @pmi0("working_dates")
    private final List<String> workingDates;

    /* compiled from: ServiceBookingBookWorkDatesCollectionDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingBookWorkDatesCollectionDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingBookWorkDatesCollectionDto createFromParcel(Parcel parcel) {
            return new ServiceBookingBookWorkDatesCollectionDto(parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingBookWorkDatesCollectionDto[] newArray(int i) {
            return new ServiceBookingBookWorkDatesCollectionDto[i];
        }
    }

    public ServiceBookingBookWorkDatesCollectionDto(List<String> list, List<String> list2) {
        this.bookingDates = list;
        this.workingDates = list2;
    }

    public final List<String> d() {
        return this.bookingDates;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingBookWorkDatesCollectionDto)) {
            return false;
        }
        ServiceBookingBookWorkDatesCollectionDto serviceBookingBookWorkDatesCollectionDto = (ServiceBookingBookWorkDatesCollectionDto) obj;
        return epx.f(this.bookingDates, serviceBookingBookWorkDatesCollectionDto.bookingDates) && epx.f(this.workingDates, serviceBookingBookWorkDatesCollectionDto.workingDates);
    }

    public final int hashCode() {
        return this.workingDates.hashCode() + (this.bookingDates.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingBookWorkDatesCollectionDto(bookingDates=");
        sb.append(this.bookingDates);
        sb.append(", workingDates=");
        return ms9.a(')', sb, this.workingDates);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.bookingDates);
        parcel.writeStringList(this.workingDates);
    }
}
