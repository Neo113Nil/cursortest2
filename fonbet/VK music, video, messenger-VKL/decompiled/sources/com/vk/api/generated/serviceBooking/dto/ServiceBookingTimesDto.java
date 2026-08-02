package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;

/* compiled from: ServiceBookingTimesDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingTimesDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingTimesDto> CREATOR = new a();

    @pmi0("datetime")
    private final String datetime;

    @pmi0("seance_length")
    private final int seanceLength;

    @pmi0("time")
    private final String time;

    /* compiled from: ServiceBookingTimesDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingTimesDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingTimesDto createFromParcel(Parcel parcel) {
            return new ServiceBookingTimesDto(parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingTimesDto[] newArray(int i) {
            return new ServiceBookingTimesDto[i];
        }
    }

    public ServiceBookingTimesDto(String str, int i, String str2) {
        this.time = str;
        this.seanceLength = i;
        this.datetime = str2;
    }

    public final String d() {
        return this.datetime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.seanceLength;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingTimesDto)) {
            return false;
        }
        ServiceBookingTimesDto serviceBookingTimesDto = (ServiceBookingTimesDto) obj;
        return epx.f(this.time, serviceBookingTimesDto.time) && this.seanceLength == serviceBookingTimesDto.seanceLength && epx.f(this.datetime, serviceBookingTimesDto.datetime);
    }

    public final String f() {
        return this.time;
    }

    public final int hashCode() {
        return this.datetime.hashCode() + shy.a(this.seanceLength, this.time.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingTimesDto(time=");
        sb.append(this.time);
        sb.append(", seanceLength=");
        sb.append(this.seanceLength);
        sb.append(", datetime=");
        return ho8.a(sb, this.datetime, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.time);
        parcel.writeInt(this.seanceLength);
        parcel.writeString(this.datetime);
    }
}
