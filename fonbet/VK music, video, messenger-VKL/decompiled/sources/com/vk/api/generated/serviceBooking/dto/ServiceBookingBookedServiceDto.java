package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: ServiceBookingBookedServiceDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingBookedServiceDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingBookedServiceDto> CREATOR = new a();

    @pmi0("abonement_restriction")
    private final int abonementRestriction;

    @pmi0("amount")
    private final int amount;

    @pmi0("api_id")
    private final String apiId;

    @pmi0("cost")
    private final int cost;

    @pmi0("discount")
    private final int discount;

    @pmi0("id")
    private final int id;

    @pmi0("price_max")
    private final int priceMax;

    @pmi0("price_min")
    private final int priceMin;

    @pmi0("seance_length")
    private final int seanceLength;

    @pmi0("title")
    private final String title;

    /* compiled from: ServiceBookingBookedServiceDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingBookedServiceDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingBookedServiceDto createFromParcel(Parcel parcel) {
            return new ServiceBookingBookedServiceDto(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingBookedServiceDto[] newArray(int i) {
            return new ServiceBookingBookedServiceDto[i];
        }
    }

    public ServiceBookingBookedServiceDto(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, String str2, int i8) {
        this.id = i;
        this.title = str;
        this.cost = i2;
        this.priceMin = i3;
        this.priceMax = i4;
        this.discount = i5;
        this.amount = i6;
        this.seanceLength = i7;
        this.apiId = str2;
        this.abonementRestriction = i8;
    }

    public final int d() {
        return this.discount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.priceMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingBookedServiceDto)) {
            return false;
        }
        ServiceBookingBookedServiceDto serviceBookingBookedServiceDto = (ServiceBookingBookedServiceDto) obj;
        return this.id == serviceBookingBookedServiceDto.id && epx.f(this.title, serviceBookingBookedServiceDto.title) && this.cost == serviceBookingBookedServiceDto.cost && this.priceMin == serviceBookingBookedServiceDto.priceMin && this.priceMax == serviceBookingBookedServiceDto.priceMax && this.discount == serviceBookingBookedServiceDto.discount && this.amount == serviceBookingBookedServiceDto.amount && this.seanceLength == serviceBookingBookedServiceDto.seanceLength && epx.f(this.apiId, serviceBookingBookedServiceDto.apiId) && this.abonementRestriction == serviceBookingBookedServiceDto.abonementRestriction;
    }

    public final int f() {
        return this.priceMin;
    }

    public final int g() {
        return this.seanceLength;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return Integer.hashCode(this.abonementRestriction) + urd0.a(shy.a(this.seanceLength, shy.a(this.amount, shy.a(this.discount, shy.a(this.priceMax, shy.a(this.priceMin, shy.a(this.cost, urd0.a(Integer.hashCode(this.id) * 31, 31, this.title), 31), 31), 31), 31), 31), 31), 31, this.apiId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingBookedServiceDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", cost=");
        sb.append(this.cost);
        sb.append(", priceMin=");
        sb.append(this.priceMin);
        sb.append(", priceMax=");
        sb.append(this.priceMax);
        sb.append(", discount=");
        sb.append(this.discount);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", seanceLength=");
        sb.append(this.seanceLength);
        sb.append(", apiId=");
        sb.append(this.apiId);
        sb.append(", abonementRestriction=");
        return vu5.b(sb, this.abonementRestriction, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.cost);
        parcel.writeInt(this.priceMin);
        parcel.writeInt(this.priceMax);
        parcel.writeInt(this.discount);
        parcel.writeInt(this.amount);
        parcel.writeInt(this.seanceLength);
        parcel.writeString(this.apiId);
        parcel.writeInt(this.abonementRestriction);
    }
}
