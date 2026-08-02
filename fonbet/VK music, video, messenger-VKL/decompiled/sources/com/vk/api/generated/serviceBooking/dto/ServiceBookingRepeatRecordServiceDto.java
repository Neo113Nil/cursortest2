package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: ServiceBookingRepeatRecordServiceDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingRepeatRecordServiceDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingRepeatRecordServiceDto> CREATOR = new a();

    @pmi0("amount")
    private final int amount;

    @pmi0("cost_to_pay")
    private final int costToPay;

    @pmi0("discount")
    private final int discount;

    @pmi0("first_cost")
    private final int firstCost;

    @pmi0("id")
    private final int id;

    @pmi0("length")
    private final int length;

    @pmi0("title")
    private final String title;

    /* compiled from: ServiceBookingRepeatRecordServiceDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingRepeatRecordServiceDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingRepeatRecordServiceDto createFromParcel(Parcel parcel) {
            return new ServiceBookingRepeatRecordServiceDto(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingRepeatRecordServiceDto[] newArray(int i) {
            return new ServiceBookingRepeatRecordServiceDto[i];
        }
    }

    public ServiceBookingRepeatRecordServiceDto(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        this.id = i;
        this.title = str;
        this.firstCost = i2;
        this.costToPay = i3;
        this.discount = i4;
        this.amount = i5;
        this.length = i6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingRepeatRecordServiceDto)) {
            return false;
        }
        ServiceBookingRepeatRecordServiceDto serviceBookingRepeatRecordServiceDto = (ServiceBookingRepeatRecordServiceDto) obj;
        return this.id == serviceBookingRepeatRecordServiceDto.id && epx.f(this.title, serviceBookingRepeatRecordServiceDto.title) && this.firstCost == serviceBookingRepeatRecordServiceDto.firstCost && this.costToPay == serviceBookingRepeatRecordServiceDto.costToPay && this.discount == serviceBookingRepeatRecordServiceDto.discount && this.amount == serviceBookingRepeatRecordServiceDto.amount && this.length == serviceBookingRepeatRecordServiceDto.length;
    }

    public final int hashCode() {
        return Integer.hashCode(this.length) + shy.a(this.amount, shy.a(this.discount, shy.a(this.costToPay, shy.a(this.firstCost, urd0.a(Integer.hashCode(this.id) * 31, 31, this.title), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingRepeatRecordServiceDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", firstCost=");
        sb.append(this.firstCost);
        sb.append(", costToPay=");
        sb.append(this.costToPay);
        sb.append(", discount=");
        sb.append(this.discount);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", length=");
        return vu5.b(sb, this.length, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.firstCost);
        parcel.writeInt(this.costToPay);
        parcel.writeInt(this.discount);
        parcel.writeInt(this.amount);
        parcel.writeInt(this.length);
    }
}
