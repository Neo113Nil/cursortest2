package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: ServiceBookingActivityDailyCollectionDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingActivityDailyCollectionDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingActivityDailyCollectionDto> CREATOR = new a();

    @pmi0("date")
    private final String date;

    @pmi0("periods")
    private final ServiceBookingActivityDailyPeriodsDto periods;

    /* compiled from: ServiceBookingActivityDailyCollectionDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingActivityDailyCollectionDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingActivityDailyCollectionDto createFromParcel(Parcel parcel) {
            return new ServiceBookingActivityDailyCollectionDto(parcel.readString(), ServiceBookingActivityDailyPeriodsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingActivityDailyCollectionDto[] newArray(int i) {
            return new ServiceBookingActivityDailyCollectionDto[i];
        }
    }

    public ServiceBookingActivityDailyCollectionDto(String str, ServiceBookingActivityDailyPeriodsDto serviceBookingActivityDailyPeriodsDto) {
        this.date = str;
        this.periods = serviceBookingActivityDailyPeriodsDto;
    }

    public final ServiceBookingActivityDailyPeriodsDto d() {
        return this.periods;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingActivityDailyCollectionDto)) {
            return false;
        }
        ServiceBookingActivityDailyCollectionDto serviceBookingActivityDailyCollectionDto = (ServiceBookingActivityDailyCollectionDto) obj;
        return epx.f(this.date, serviceBookingActivityDailyCollectionDto.date) && epx.f(this.periods, serviceBookingActivityDailyCollectionDto.periods);
    }

    public final int hashCode() {
        return this.periods.hashCode() + (this.date.hashCode() * 31);
    }

    public final String toString() {
        return "ServiceBookingActivityDailyCollectionDto(date=" + this.date + ", periods=" + this.periods + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.date);
        this.periods.writeToParcel(parcel, i);
    }
}
