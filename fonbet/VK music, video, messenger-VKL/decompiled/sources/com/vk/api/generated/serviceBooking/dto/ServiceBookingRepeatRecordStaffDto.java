package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: ServiceBookingRepeatRecordStaffDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingRepeatRecordStaffDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingRepeatRecordStaffDto> CREATOR = new a();

    @pmi0("avatar")
    private final String avatar;

    @pmi0("avatar_big")
    private final String avatarBig;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("specialization")
    private final String specialization;

    /* compiled from: ServiceBookingRepeatRecordStaffDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingRepeatRecordStaffDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingRepeatRecordStaffDto createFromParcel(Parcel parcel) {
            return new ServiceBookingRepeatRecordStaffDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingRepeatRecordStaffDto[] newArray(int i) {
            return new ServiceBookingRepeatRecordStaffDto[i];
        }
    }

    public ServiceBookingRepeatRecordStaffDto(int i, String str, String str2, String str3, String str4) {
        this.id = i;
        this.name = str;
        this.specialization = str2;
        this.avatar = str3;
        this.avatarBig = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingRepeatRecordStaffDto)) {
            return false;
        }
        ServiceBookingRepeatRecordStaffDto serviceBookingRepeatRecordStaffDto = (ServiceBookingRepeatRecordStaffDto) obj;
        return this.id == serviceBookingRepeatRecordStaffDto.id && epx.f(this.name, serviceBookingRepeatRecordStaffDto.name) && epx.f(this.specialization, serviceBookingRepeatRecordStaffDto.specialization) && epx.f(this.avatar, serviceBookingRepeatRecordStaffDto.avatar) && epx.f(this.avatarBig, serviceBookingRepeatRecordStaffDto.avatarBig);
    }

    public final int hashCode() {
        return this.avatarBig.hashCode() + urd0.a(urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.specialization), 31, this.avatar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingRepeatRecordStaffDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", specialization=");
        sb.append(this.specialization);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", avatarBig=");
        return ho8.a(sb, this.avatarBig, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.specialization);
        parcel.writeString(this.avatar);
        parcel.writeString(this.avatarBig);
    }
}
