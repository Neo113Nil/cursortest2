package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: ServiceBookingSearchActivityDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingSearchActivityDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingSearchActivityDto> CREATOR = new a();

    @pmi0("activity")
    private final ServiceBookingActivityDto activity;

    @pmi0("time")
    private final ServiceBookingTimesDto time;

    /* compiled from: ServiceBookingSearchActivityDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingSearchActivityDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingSearchActivityDto createFromParcel(Parcel parcel) {
            return new ServiceBookingSearchActivityDto(ServiceBookingTimesDto.CREATOR.createFromParcel(parcel), ServiceBookingActivityDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingSearchActivityDto[] newArray(int i) {
            return new ServiceBookingSearchActivityDto[i];
        }
    }

    public ServiceBookingSearchActivityDto(ServiceBookingTimesDto serviceBookingTimesDto, ServiceBookingActivityDto serviceBookingActivityDto) {
        this.time = serviceBookingTimesDto;
        this.activity = serviceBookingActivityDto;
    }

    public final ServiceBookingActivityDto d() {
        return this.activity;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ServiceBookingTimesDto e() {
        return this.time;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingSearchActivityDto)) {
            return false;
        }
        ServiceBookingSearchActivityDto serviceBookingSearchActivityDto = (ServiceBookingSearchActivityDto) obj;
        return epx.f(this.time, serviceBookingSearchActivityDto.time) && epx.f(this.activity, serviceBookingSearchActivityDto.activity);
    }

    public final int hashCode() {
        return this.activity.hashCode() + (this.time.hashCode() * 31);
    }

    public final String toString() {
        return "ServiceBookingSearchActivityDto(time=" + this.time + ", activity=" + this.activity + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.time.writeToParcel(parcel, i);
        this.activity.writeToParcel(parcel, i);
    }
}
