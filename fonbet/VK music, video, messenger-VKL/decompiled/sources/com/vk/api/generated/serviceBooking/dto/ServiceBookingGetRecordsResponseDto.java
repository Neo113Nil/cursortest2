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

/* compiled from: ServiceBookingGetRecordsResponseDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingGetRecordsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingGetRecordsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<ServiceBookingRecordDto> items;

    /* compiled from: ServiceBookingGetRecordsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingGetRecordsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingGetRecordsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(ServiceBookingRecordDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ServiceBookingGetRecordsResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingGetRecordsResponseDto[] newArray(int i) {
            return new ServiceBookingGetRecordsResponseDto[i];
        }
    }

    public ServiceBookingGetRecordsResponseDto(int i, List<ServiceBookingRecordDto> list) {
        this.count = i;
        this.items = list;
    }

    public final List<ServiceBookingRecordDto> d() {
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
        if (!(obj instanceof ServiceBookingGetRecordsResponseDto)) {
            return false;
        }
        ServiceBookingGetRecordsResponseDto serviceBookingGetRecordsResponseDto = (ServiceBookingGetRecordsResponseDto) obj;
        return this.count == serviceBookingGetRecordsResponseDto.count && epx.f(this.items, serviceBookingGetRecordsResponseDto.items);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingGetRecordsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ServiceBookingRecordDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
