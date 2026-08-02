package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: ServiceBookingSearchServiceDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingSearchServiceDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingSearchServiceDto> CREATOR = new a();

    @pmi0("bookable_status")
    private final String bookableStatus;

    @pmi0("duration")
    private final int duration;

    @pmi0("id")
    private final int id;

    @pmi0("is_bookable")
    private final boolean isBookable;

    @pmi0("price_max")
    private final int priceMax;

    @pmi0("price_min")
    private final int priceMin;

    /* compiled from: ServiceBookingSearchServiceDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingSearchServiceDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingSearchServiceDto createFromParcel(Parcel parcel) {
            return new ServiceBookingSearchServiceDto(parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingSearchServiceDto[] newArray(int i) {
            return new ServiceBookingSearchServiceDto[i];
        }
    }

    public ServiceBookingSearchServiceDto(int i, boolean z, String str, int i2, int i3, int i4) {
        this.id = i;
        this.isBookable = z;
        this.bookableStatus = str;
        this.duration = i2;
        this.priceMin = i3;
        this.priceMax = i4;
    }

    public final int d() {
        return this.priceMax;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.priceMin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingSearchServiceDto)) {
            return false;
        }
        ServiceBookingSearchServiceDto serviceBookingSearchServiceDto = (ServiceBookingSearchServiceDto) obj;
        return this.id == serviceBookingSearchServiceDto.id && this.isBookable == serviceBookingSearchServiceDto.isBookable && epx.f(this.bookableStatus, serviceBookingSearchServiceDto.bookableStatus) && this.duration == serviceBookingSearchServiceDto.duration && this.priceMin == serviceBookingSearchServiceDto.priceMin && this.priceMax == serviceBookingSearchServiceDto.priceMax;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return Integer.hashCode(this.priceMax) + shy.a(this.priceMin, shy.a(this.duration, urd0.a(qoy.b(Integer.hashCode(this.id) * 31, 31, this.isBookable), 31, this.bookableStatus), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingSearchServiceDto(id=");
        sb.append(this.id);
        sb.append(", isBookable=");
        sb.append(this.isBookable);
        sb.append(", bookableStatus=");
        sb.append(this.bookableStatus);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", priceMin=");
        sb.append(this.priceMin);
        sb.append(", priceMax=");
        return vu5.b(sb, this.priceMax, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.isBookable ? 1 : 0);
        parcel.writeString(this.bookableStatus);
        parcel.writeInt(this.duration);
        parcel.writeInt(this.priceMin);
        parcel.writeInt(this.priceMax);
    }
}
