package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ServiceBookingAddressDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingAddressDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingAddressDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("comment")
    private final String comment;

    @pmi0("id")
    private final String id;

    @pmi0("latitude")
    private final Float latitude;

    @pmi0("longitude")
    private final Float longitude;

    @pmi0("metro")
    private final String metro;

    @pmi0("phone")
    private final String phone;

    @pmi0("site")
    private final String site;

    @pmi0("staff_id")
    private final int staffId;

    /* compiled from: ServiceBookingAddressDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingAddressDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingAddressDto createFromParcel(Parcel parcel) {
            return new ServiceBookingAddressDto(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingAddressDto[] newArray(int i) {
            return new ServiceBookingAddressDto[i];
        }
    }

    public ServiceBookingAddressDto(String str, int i, String str2, String str3, Float f, Float f2, String str4, String str5, String str6) {
        this.id = str;
        this.staffId = i;
        this.address = str2;
        this.metro = str3;
        this.latitude = f;
        this.longitude = f2;
        this.phone = str4;
        this.site = str5;
        this.comment = str6;
    }

    public final String d() {
        return this.address;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingAddressDto)) {
            return false;
        }
        ServiceBookingAddressDto serviceBookingAddressDto = (ServiceBookingAddressDto) obj;
        return epx.f(this.id, serviceBookingAddressDto.id) && this.staffId == serviceBookingAddressDto.staffId && epx.f(this.address, serviceBookingAddressDto.address) && epx.f(this.metro, serviceBookingAddressDto.metro) && epx.f(this.latitude, serviceBookingAddressDto.latitude) && epx.f(this.longitude, serviceBookingAddressDto.longitude) && epx.f(this.phone, serviceBookingAddressDto.phone) && epx.f(this.site, serviceBookingAddressDto.site) && epx.f(this.comment, serviceBookingAddressDto.comment);
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.staffId, this.id.hashCode() * 31, 31), 31, this.address);
        String str = this.metro;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.latitude;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.longitude;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str2 = this.phone;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.site;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.comment;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingAddressDto(id=");
        sb.append(this.id);
        sb.append(", staffId=");
        sb.append(this.staffId);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", metro=");
        sb.append(this.metro);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", site=");
        sb.append(this.site);
        sb.append(", comment=");
        return ho8.a(sb, this.comment, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeInt(this.staffId);
        parcel.writeString(this.address);
        parcel.writeString(this.metro);
        Float f = this.latitude;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.longitude;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        parcel.writeString(this.phone);
        parcel.writeString(this.site);
        parcel.writeString(this.comment);
    }

    public /* synthetic */ ServiceBookingAddressDto(String str, int i, String str2, String str3, Float f, Float f2, String str4, String str5, String str6, int i2, zcl zclVar) {
        this(str, i, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : f, (i2 & 32) != 0 ? null : f2, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? null : str6);
    }
}
