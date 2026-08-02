package com.vk.api.generated.restore.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: RestoreGetInstantAuthByNotifyInfoResponseDto.kt */
/* loaded from: classes15.dex */
public final class RestoreGetInstantAuthByNotifyInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<RestoreGetInstantAuthByNotifyInfoResponseDto> CREATOR = new a();

    @pmi0("city")
    private final String city;

    @pmi0("created_at_display")
    private final String createdAtDisplay;

    @pmi0("device")
    private final String device;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("photo")
    private final String photo;

    @pmi0("place")
    private final String place;

    @pmi0("result")
    private final int result;

    @pmi0("status")
    private final Integer status;

    @pmi0("time_created_at")
    private final Integer timeCreatedAt;

    /* compiled from: RestoreGetInstantAuthByNotifyInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<RestoreGetInstantAuthByNotifyInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final RestoreGetInstantAuthByNotifyInfoResponseDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer num;
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                valueOf = null;
                num = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                num = null;
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new RestoreGetInstantAuthByNotifyInfoResponseDto(readInt, valueOf, readString, num, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RestoreGetInstantAuthByNotifyInfoResponseDto[] newArray(int i) {
            return new RestoreGetInstantAuthByNotifyInfoResponseDto[i];
        }
    }

    public RestoreGetInstantAuthByNotifyInfoResponseDto(int i, Integer num, String str, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.result = i;
        this.timeCreatedAt = num;
        this.createdAtDisplay = str;
        this.status = num2;
        this.device = str2;
        this.place = str3;
        this.firstName = str4;
        this.lastName = str5;
        this.photo = str6;
        this.city = str7;
    }

    public final String d() {
        return this.city;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.device;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RestoreGetInstantAuthByNotifyInfoResponseDto)) {
            return false;
        }
        RestoreGetInstantAuthByNotifyInfoResponseDto restoreGetInstantAuthByNotifyInfoResponseDto = (RestoreGetInstantAuthByNotifyInfoResponseDto) obj;
        return this.result == restoreGetInstantAuthByNotifyInfoResponseDto.result && epx.f(this.timeCreatedAt, restoreGetInstantAuthByNotifyInfoResponseDto.timeCreatedAt) && epx.f(this.createdAtDisplay, restoreGetInstantAuthByNotifyInfoResponseDto.createdAtDisplay) && epx.f(this.status, restoreGetInstantAuthByNotifyInfoResponseDto.status) && epx.f(this.device, restoreGetInstantAuthByNotifyInfoResponseDto.device) && epx.f(this.place, restoreGetInstantAuthByNotifyInfoResponseDto.place) && epx.f(this.firstName, restoreGetInstantAuthByNotifyInfoResponseDto.firstName) && epx.f(this.lastName, restoreGetInstantAuthByNotifyInfoResponseDto.lastName) && epx.f(this.photo, restoreGetInstantAuthByNotifyInfoResponseDto.photo) && epx.f(this.city, restoreGetInstantAuthByNotifyInfoResponseDto.city);
    }

    public final String f() {
        return this.firstName;
    }

    public final String g() {
        return this.lastName;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.result) * 31;
        Integer num = this.timeCreatedAt;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.createdAtDisplay;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.status;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.device;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.place;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstName;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lastName;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.photo;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.city;
        return hashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String i() {
        return this.photo;
    }

    public final String j() {
        return this.place;
    }

    public final Integer k() {
        return this.status;
    }

    public final Integer l() {
        return this.timeCreatedAt;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RestoreGetInstantAuthByNotifyInfoResponseDto(result=");
        sb.append(this.result);
        sb.append(", timeCreatedAt=");
        sb.append(this.timeCreatedAt);
        sb.append(", createdAtDisplay=");
        sb.append(this.createdAtDisplay);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", place=");
        sb.append(this.place);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", city=");
        return ho8.a(sb, this.city, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.result);
        Integer num = this.timeCreatedAt;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.createdAtDisplay);
        Integer num2 = this.status;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.device);
        parcel.writeString(this.place);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.photo);
        parcel.writeString(this.city);
    }

    public /* synthetic */ RestoreGetInstantAuthByNotifyInfoResponseDto(int i, Integer num, String str, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : num2, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? null : str6, (i2 & 512) != 0 ? null : str7);
    }
}
