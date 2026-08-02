package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;

/* compiled from: ServiceBookingActivityDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingActivityDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingActivityDto> CREATOR = new a();

    @pmi0("capacity")
    private final int capacity;

    @pmi0("company_id")
    private final int companyId;

    @pmi0("date")
    private final String date;

    @pmi0("has_available_spots")
    private final boolean hasAvailableSpots;

    @pmi0("id")
    private final int id;

    @pmi0("length")
    private final int length;

    @pmi0("records_count")
    private final int recordsCount;

    @pmi0("service")
    private final ServiceBookingBookableServiceDto service;

    @pmi0("service_id")
    private final int serviceId;

    @pmi0("staff")
    private final ServiceBookingStaffDto staff;

    @pmi0("staff_id")
    private final int staffId;

    @pmi0("timestamp")
    private final int timestamp;

    /* compiled from: ServiceBookingActivityDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingActivityDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingActivityDto createFromParcel(Parcel parcel) {
            return new ServiceBookingActivityDto(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, ServiceBookingStaffDto.CREATOR.createFromParcel(parcel), ServiceBookingBookableServiceDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingActivityDto[] newArray(int i) {
            return new ServiceBookingActivityDto[i];
        }
    }

    public ServiceBookingActivityDto(int i, int i2, int i3, int i4, String str, int i5, int i6, int i7, int i8, boolean z, ServiceBookingStaffDto serviceBookingStaffDto, ServiceBookingBookableServiceDto serviceBookingBookableServiceDto) {
        this.id = i;
        this.serviceId = i2;
        this.companyId = i3;
        this.staffId = i4;
        this.date = str;
        this.timestamp = i5;
        this.length = i6;
        this.capacity = i7;
        this.recordsCount = i8;
        this.hasAvailableSpots = z;
        this.staff = serviceBookingStaffDto;
        this.service = serviceBookingBookableServiceDto;
    }

    public final int d() {
        return this.capacity;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.recordsCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingActivityDto)) {
            return false;
        }
        ServiceBookingActivityDto serviceBookingActivityDto = (ServiceBookingActivityDto) obj;
        return this.id == serviceBookingActivityDto.id && this.serviceId == serviceBookingActivityDto.serviceId && this.companyId == serviceBookingActivityDto.companyId && this.staffId == serviceBookingActivityDto.staffId && epx.f(this.date, serviceBookingActivityDto.date) && this.timestamp == serviceBookingActivityDto.timestamp && this.length == serviceBookingActivityDto.length && this.capacity == serviceBookingActivityDto.capacity && this.recordsCount == serviceBookingActivityDto.recordsCount && this.hasAvailableSpots == serviceBookingActivityDto.hasAvailableSpots && epx.f(this.staff, serviceBookingActivityDto.staff) && epx.f(this.service, serviceBookingActivityDto.service);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.service.hashCode() + ((this.staff.hashCode() + qoy.b(shy.a(this.recordsCount, shy.a(this.capacity, shy.a(this.length, shy.a(this.timestamp, urd0.a(shy.a(this.staffId, shy.a(this.companyId, shy.a(this.serviceId, Integer.hashCode(this.id) * 31, 31), 31), 31), 31, this.date), 31), 31), 31), 31), 31, this.hasAvailableSpots)) * 31);
    }

    public final String toString() {
        return "ServiceBookingActivityDto(id=" + this.id + ", serviceId=" + this.serviceId + ", companyId=" + this.companyId + ", staffId=" + this.staffId + ", date=" + this.date + ", timestamp=" + this.timestamp + ", length=" + this.length + ", capacity=" + this.capacity + ", recordsCount=" + this.recordsCount + ", hasAvailableSpots=" + this.hasAvailableSpots + ", staff=" + this.staff + ", service=" + this.service + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.serviceId);
        parcel.writeInt(this.companyId);
        parcel.writeInt(this.staffId);
        parcel.writeString(this.date);
        parcel.writeInt(this.timestamp);
        parcel.writeInt(this.length);
        parcel.writeInt(this.capacity);
        parcel.writeInt(this.recordsCount);
        parcel.writeInt(this.hasAvailableSpots ? 1 : 0);
        this.staff.writeToParcel(parcel, i);
        this.service.writeToParcel(parcel, i);
    }
}
