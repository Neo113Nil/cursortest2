package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: ServiceBookingGetRepeatRecordsResponseDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingGetRepeatRecordsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingGetRepeatRecordsResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<ServiceBookingRepeatRecordDto> items;

    /* compiled from: ServiceBookingGetRepeatRecordsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingGetRepeatRecordsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingGetRepeatRecordsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(ServiceBookingGetRepeatRecordsResponseDto.class, parcel, arrayList, i, 1);
            }
            return new ServiceBookingGetRepeatRecordsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingGetRepeatRecordsResponseDto[] newArray(int i) {
            return new ServiceBookingGetRepeatRecordsResponseDto[i];
        }
    }

    public ServiceBookingGetRepeatRecordsResponseDto(List<ServiceBookingRepeatRecordDto> list) {
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServiceBookingGetRepeatRecordsResponseDto) && epx.f(this.items, ((ServiceBookingGetRepeatRecordsResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ServiceBookingGetRepeatRecordsResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
