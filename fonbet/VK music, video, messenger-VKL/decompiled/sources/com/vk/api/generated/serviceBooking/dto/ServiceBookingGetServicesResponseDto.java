package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.hints.HintCategories;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: ServiceBookingGetServicesResponseDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingGetServicesResponseDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingGetServicesResponseDto> CREATOR = new a();

    @pmi0(HintCategories.PARAM_NAME)
    private final List<ServiceBookingCategoryDto> categories;

    @pmi0("services")
    private final List<ServiceBookingBookableServiceDto> services;

    /* compiled from: ServiceBookingGetServicesResponseDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingGetServicesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingGetServicesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(ServiceBookingBookableServiceDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(ServiceBookingCategoryDto.CREATOR, parcel, arrayList2, i, 1);
            }
            return new ServiceBookingGetServicesResponseDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingGetServicesResponseDto[] newArray(int i) {
            return new ServiceBookingGetServicesResponseDto[i];
        }
    }

    public ServiceBookingGetServicesResponseDto(List<ServiceBookingBookableServiceDto> list, List<ServiceBookingCategoryDto> list2) {
        this.services = list;
        this.categories = list2;
    }

    public final List<ServiceBookingCategoryDto> d() {
        return this.categories;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<ServiceBookingBookableServiceDto> e() {
        return this.services;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingGetServicesResponseDto)) {
            return false;
        }
        ServiceBookingGetServicesResponseDto serviceBookingGetServicesResponseDto = (ServiceBookingGetServicesResponseDto) obj;
        return epx.f(this.services, serviceBookingGetServicesResponseDto.services) && epx.f(this.categories, serviceBookingGetServicesResponseDto.categories);
    }

    public final int hashCode() {
        return this.categories.hashCode() + (this.services.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingGetServicesResponseDto(services=");
        sb.append(this.services);
        sb.append(", categories=");
        return ms9.a(')', sb, this.categories);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.services);
        while (a2.hasNext()) {
            ((ServiceBookingBookableServiceDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.categories);
        while (a3.hasNext()) {
            ((ServiceBookingCategoryDto) a3.next()).writeToParcel(parcel, i);
        }
    }
}
