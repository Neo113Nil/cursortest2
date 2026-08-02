package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: ServiceBookingStaffPositionDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingStaffPositionDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingStaffPositionDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    /* compiled from: ServiceBookingStaffPositionDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingStaffPositionDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingStaffPositionDto createFromParcel(Parcel parcel) {
            return new ServiceBookingStaffPositionDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingStaffPositionDto[] newArray(int i) {
            return new ServiceBookingStaffPositionDto[i];
        }
    }

    public ServiceBookingStaffPositionDto(int i, String str) {
        this.id = i;
        this.title = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingStaffPositionDto)) {
            return false;
        }
        ServiceBookingStaffPositionDto serviceBookingStaffPositionDto = (ServiceBookingStaffPositionDto) obj;
        return this.id == serviceBookingStaffPositionDto.id && epx.f(this.title, serviceBookingStaffPositionDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingStaffPositionDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
    }
}
