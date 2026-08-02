package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: ServiceBookingActivityDailyPeriodsDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingActivityDailyPeriodsDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingActivityDailyPeriodsDto> CREATOR = new a();

    @pmi0("day")
    private final List<ServiceBookingSearchActivityDto> day;

    @pmi0("evening")
    private final List<ServiceBookingSearchActivityDto> evening;

    @pmi0("morning")
    private final List<ServiceBookingSearchActivityDto> morning;

    @pmi0("night")
    private final List<ServiceBookingSearchActivityDto> night;

    /* compiled from: ServiceBookingActivityDailyPeriodsDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingActivityDailyPeriodsDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingActivityDailyPeriodsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(ServiceBookingSearchActivityDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i3 = 0;
            while (i3 != readInt2) {
                i3 = en.a(ServiceBookingSearchActivityDto.CREATOR, parcel, arrayList2, i3, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            int i4 = 0;
            while (i4 != readInt3) {
                i4 = en.a(ServiceBookingSearchActivityDto.CREATOR, parcel, arrayList3, i4, 1);
            }
            int readInt4 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt4);
            while (i != readInt4) {
                i = en.a(ServiceBookingSearchActivityDto.CREATOR, parcel, arrayList4, i, 1);
            }
            return new ServiceBookingActivityDailyPeriodsDto(arrayList, arrayList2, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingActivityDailyPeriodsDto[] newArray(int i) {
            return new ServiceBookingActivityDailyPeriodsDto[i];
        }
    }

    public ServiceBookingActivityDailyPeriodsDto(List<ServiceBookingSearchActivityDto> list, List<ServiceBookingSearchActivityDto> list2, List<ServiceBookingSearchActivityDto> list3, List<ServiceBookingSearchActivityDto> list4) {
        this.night = list;
        this.morning = list2;
        this.day = list3;
        this.evening = list4;
    }

    public final List<ServiceBookingSearchActivityDto> d() {
        return this.day;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<ServiceBookingSearchActivityDto> e() {
        return this.evening;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingActivityDailyPeriodsDto)) {
            return false;
        }
        ServiceBookingActivityDailyPeriodsDto serviceBookingActivityDailyPeriodsDto = (ServiceBookingActivityDailyPeriodsDto) obj;
        return epx.f(this.night, serviceBookingActivityDailyPeriodsDto.night) && epx.f(this.morning, serviceBookingActivityDailyPeriodsDto.morning) && epx.f(this.day, serviceBookingActivityDailyPeriodsDto.day) && epx.f(this.evening, serviceBookingActivityDailyPeriodsDto.evening);
    }

    public final List<ServiceBookingSearchActivityDto> f() {
        return this.morning;
    }

    public final List<ServiceBookingSearchActivityDto> g() {
        return this.night;
    }

    public final int hashCode() {
        return this.evening.hashCode() + fw3.a(fw3.a(this.night.hashCode() * 31, 31, this.morning), 31, this.day);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingActivityDailyPeriodsDto(night=");
        sb.append(this.night);
        sb.append(", morning=");
        sb.append(this.morning);
        sb.append(", day=");
        sb.append(this.day);
        sb.append(", evening=");
        return ms9.a(')', sb, this.evening);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.night);
        while (a2.hasNext()) {
            ((ServiceBookingSearchActivityDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.morning);
        while (a3.hasNext()) {
            ((ServiceBookingSearchActivityDto) a3.next()).writeToParcel(parcel, i);
        }
        Iterator a4 = ao.a(parcel, this.day);
        while (a4.hasNext()) {
            ((ServiceBookingSearchActivityDto) a4.next()).writeToParcel(parcel, i);
        }
        Iterator a5 = ao.a(parcel, this.evening);
        while (a5.hasNext()) {
            ((ServiceBookingSearchActivityDto) a5.next()).writeToParcel(parcel, i);
        }
    }
}
