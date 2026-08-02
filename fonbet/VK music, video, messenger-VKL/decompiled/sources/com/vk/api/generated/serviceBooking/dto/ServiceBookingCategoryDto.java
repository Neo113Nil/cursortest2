package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: ServiceBookingCategoryDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingCategoryDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingCategoryDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("sex")
    private final int sex;

    @pmi0("title")
    private final String title;

    @pmi0("weight")
    private final int weight;

    /* compiled from: ServiceBookingCategoryDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingCategoryDto createFromParcel(Parcel parcel) {
            return new ServiceBookingCategoryDto(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingCategoryDto[] newArray(int i) {
            return new ServiceBookingCategoryDto[i];
        }
    }

    public ServiceBookingCategoryDto(int i, String str, int i2, int i3) {
        this.id = i;
        this.title = str;
        this.sex = i2;
        this.weight = i3;
    }

    public final int d() {
        return this.weight;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingCategoryDto)) {
            return false;
        }
        ServiceBookingCategoryDto serviceBookingCategoryDto = (ServiceBookingCategoryDto) obj;
        return this.id == serviceBookingCategoryDto.id && epx.f(this.title, serviceBookingCategoryDto.title) && this.sex == serviceBookingCategoryDto.sex && this.weight == serviceBookingCategoryDto.weight;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return Integer.hashCode(this.weight) + shy.a(this.sex, urd0.a(Integer.hashCode(this.id) * 31, 31, this.title), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingCategoryDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", sex=");
        sb.append(this.sex);
        sb.append(", weight=");
        return vu5.b(sb, this.weight, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.sex);
        parcel.writeInt(this.weight);
    }
}
