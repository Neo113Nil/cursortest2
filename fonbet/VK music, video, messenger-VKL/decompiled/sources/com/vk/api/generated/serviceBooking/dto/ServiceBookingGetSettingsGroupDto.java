package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: ServiceBookingGetSettingsGroupDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingGetSettingsGroupDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingGetSettingsGroupDto> CREATOR = new a();

    @pmi0("logo")
    private final String logo;

    @pmi0("name")
    private final String name;

    /* compiled from: ServiceBookingGetSettingsGroupDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingGetSettingsGroupDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingGetSettingsGroupDto createFromParcel(Parcel parcel) {
            return new ServiceBookingGetSettingsGroupDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingGetSettingsGroupDto[] newArray(int i) {
            return new ServiceBookingGetSettingsGroupDto[i];
        }
    }

    public ServiceBookingGetSettingsGroupDto(String str, String str2) {
        this.name = str;
        this.logo = str2;
    }

    public final String d() {
        return this.logo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingGetSettingsGroupDto)) {
            return false;
        }
        ServiceBookingGetSettingsGroupDto serviceBookingGetSettingsGroupDto = (ServiceBookingGetSettingsGroupDto) obj;
        return epx.f(this.name, serviceBookingGetSettingsGroupDto.name) && epx.f(this.logo, serviceBookingGetSettingsGroupDto.logo);
    }

    public final int hashCode() {
        return this.logo.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingGetSettingsGroupDto(name=");
        sb.append(this.name);
        sb.append(", logo=");
        return ho8.a(sb, this.logo, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.logo);
    }
}
