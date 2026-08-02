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
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;

/* compiled from: ServiceBookingRepeatRecordDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingRepeatRecordDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingRepeatRecordDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("length")
    private final int length;

    @pmi0("services")
    private final List<ServiceBookingRepeatRecordServiceDto> services;

    @pmi0("services_count_text")
    private final String servicesCountText;

    @pmi0("staff")
    private final ServiceBookingRepeatRecordStaffDto staff;

    @pmi0("visit_date")
    private final int visitDate;

    /* compiled from: ServiceBookingRepeatRecordDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingRepeatRecordDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingRepeatRecordDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(ServiceBookingRepeatRecordServiceDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ServiceBookingRepeatRecordDto(readInt, arrayList, ServiceBookingRepeatRecordStaffDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingRepeatRecordDto[] newArray(int i) {
            return new ServiceBookingRepeatRecordDto[i];
        }
    }

    public ServiceBookingRepeatRecordDto(int i, List<ServiceBookingRepeatRecordServiceDto> list, ServiceBookingRepeatRecordStaffDto serviceBookingRepeatRecordStaffDto, int i2, int i3, String str) {
        this.id = i;
        this.services = list;
        this.staff = serviceBookingRepeatRecordStaffDto;
        this.length = i2;
        this.visitDate = i3;
        this.servicesCountText = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingRepeatRecordDto)) {
            return false;
        }
        ServiceBookingRepeatRecordDto serviceBookingRepeatRecordDto = (ServiceBookingRepeatRecordDto) obj;
        return this.id == serviceBookingRepeatRecordDto.id && epx.f(this.services, serviceBookingRepeatRecordDto.services) && epx.f(this.staff, serviceBookingRepeatRecordDto.staff) && this.length == serviceBookingRepeatRecordDto.length && this.visitDate == serviceBookingRepeatRecordDto.visitDate && epx.f(this.servicesCountText, serviceBookingRepeatRecordDto.servicesCountText);
    }

    public final int hashCode() {
        return this.servicesCountText.hashCode() + shy.a(this.visitDate, shy.a(this.length, (this.staff.hashCode() + fw3.a(Integer.hashCode(this.id) * 31, 31, this.services)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingRepeatRecordDto(id=");
        sb.append(this.id);
        sb.append(", services=");
        sb.append(this.services);
        sb.append(", staff=");
        sb.append(this.staff);
        sb.append(", length=");
        sb.append(this.length);
        sb.append(", visitDate=");
        sb.append(this.visitDate);
        sb.append(", servicesCountText=");
        return ho8.a(sb, this.servicesCountText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        Iterator a2 = ao.a(parcel, this.services);
        while (a2.hasNext()) {
            ((ServiceBookingRepeatRecordServiceDto) a2.next()).writeToParcel(parcel, i);
        }
        this.staff.writeToParcel(parcel, i);
        parcel.writeInt(this.length);
        parcel.writeInt(this.visitDate);
        parcel.writeString(this.servicesCountText);
    }
}
