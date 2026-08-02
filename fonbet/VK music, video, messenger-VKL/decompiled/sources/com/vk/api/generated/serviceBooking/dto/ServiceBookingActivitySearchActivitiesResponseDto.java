package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: ServiceBookingActivitySearchActivitiesResponseDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingActivitySearchActivitiesResponseDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingActivitySearchActivitiesResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<ServiceBookingActivityDailyCollectionDto> items;

    /* compiled from: ServiceBookingActivitySearchActivitiesResponseDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingActivitySearchActivitiesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingActivitySearchActivitiesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ServiceBookingActivityDailyCollectionDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ServiceBookingActivitySearchActivitiesResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingActivitySearchActivitiesResponseDto[] newArray(int i) {
            return new ServiceBookingActivitySearchActivitiesResponseDto[i];
        }
    }

    public ServiceBookingActivitySearchActivitiesResponseDto(List<ServiceBookingActivityDailyCollectionDto> list) {
        this.items = list;
    }

    public final List<ServiceBookingActivityDailyCollectionDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServiceBookingActivitySearchActivitiesResponseDto) && epx.f(this.items, ((ServiceBookingActivitySearchActivitiesResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ServiceBookingActivitySearchActivitiesResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ServiceBookingActivityDailyCollectionDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
