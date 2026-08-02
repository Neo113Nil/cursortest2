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

/* compiled from: ServiceBookingGetStaffResponseDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingGetStaffResponseDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingGetStaffResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<ServiceBookingBookableStaffDto> items;

    /* compiled from: ServiceBookingGetStaffResponseDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingGetStaffResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingGetStaffResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(ServiceBookingBookableStaffDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ServiceBookingGetStaffResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingGetStaffResponseDto[] newArray(int i) {
            return new ServiceBookingGetStaffResponseDto[i];
        }
    }

    public ServiceBookingGetStaffResponseDto(int i, List<ServiceBookingBookableStaffDto> list) {
        this.count = i;
        this.items = list;
    }

    public final List<ServiceBookingBookableStaffDto> d() {
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
        if (!(obj instanceof ServiceBookingGetStaffResponseDto)) {
            return false;
        }
        ServiceBookingGetStaffResponseDto serviceBookingGetStaffResponseDto = (ServiceBookingGetStaffResponseDto) obj;
        return this.count == serviceBookingGetStaffResponseDto.count && epx.f(this.items, serviceBookingGetStaffResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingGetStaffResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ServiceBookingBookableStaffDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
