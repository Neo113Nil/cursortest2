package com.vk.api.generated.phone.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.O6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PhoneValidationInfoDto.kt */
/* loaded from: classes15.dex */
public final class PhoneValidationInfoDto implements Parcelable {
    public static final Parcelable.Creator<PhoneValidationInfoDto> CREATOR = new a();

    @pmi0("phone")
    private final String phone;

    @pmi0(O6.e1)
    private final String sid;

    @pmi0("status")
    private final String status;

    /* compiled from: PhoneValidationInfoDto.kt */
    public static final class a implements Parcelable.Creator<PhoneValidationInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final PhoneValidationInfoDto createFromParcel(Parcel parcel) {
            return new PhoneValidationInfoDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneValidationInfoDto[] newArray(int i) {
            return new PhoneValidationInfoDto[i];
        }
    }

    public PhoneValidationInfoDto() {
        this(null, null, null, 7, null);
    }

    public final String d() {
        return this.phone;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.sid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneValidationInfoDto)) {
            return false;
        }
        PhoneValidationInfoDto phoneValidationInfoDto = (PhoneValidationInfoDto) obj;
        return epx.f(this.sid, phoneValidationInfoDto.sid) && epx.f(this.phone, phoneValidationInfoDto.phone) && epx.f(this.status, phoneValidationInfoDto.status);
    }

    public final String f() {
        return this.status;
    }

    public final int hashCode() {
        String str = this.sid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phone;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneValidationInfoDto(sid=");
        sb.append(this.sid);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", status=");
        return ho8.a(sb, this.status, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sid);
        parcel.writeString(this.phone);
        parcel.writeString(this.status);
    }

    public PhoneValidationInfoDto(String str, String str2, String str3) {
        this.sid = str;
        this.phone = str2;
        this.status = str3;
    }

    public /* synthetic */ PhoneValidationInfoDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
