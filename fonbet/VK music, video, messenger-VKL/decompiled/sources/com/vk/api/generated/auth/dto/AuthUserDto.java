package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AuthUserDto.kt */
/* loaded from: classes14.dex */
public final class AuthUserDto implements Parcelable {
    public static final Parcelable.Creator<AuthUserDto> CREATOR = new a();

    @pmi0("can_unbind_phone")
    private final Boolean canUnbindPhone;

    @pmi0("deactivated")
    private final String deactivated;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("has_2fa")
    private final boolean has2fa;

    @pmi0("has_password")
    private final Boolean hasPassword;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("phone")
    private final String phone;

    @pmi0("photo_200")
    private final String photo200;

    /* compiled from: AuthUserDto.kt */
    public static final class a implements Parcelable.Creator<AuthUserDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthUserDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Boolean valueOf;
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z3 = z2;
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0 ? true : z3);
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                bool = Boolean.valueOf(z3);
            }
            return new AuthUserDto(readString, z, readString2, readString3, readString4, readString5, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthUserDto[] newArray(int i) {
            return new AuthUserDto[i];
        }
    }

    public AuthUserDto(String str, boolean z, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2) {
        this.firstName = str;
        this.has2fa = z;
        this.lastName = str2;
        this.photo200 = str3;
        this.deactivated = str4;
        this.phone = str5;
        this.hasPassword = bool;
        this.canUnbindPhone = bool2;
    }

    public final Boolean d() {
        return this.canUnbindPhone;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.firstName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthUserDto)) {
            return false;
        }
        AuthUserDto authUserDto = (AuthUserDto) obj;
        return epx.f(this.firstName, authUserDto.firstName) && this.has2fa == authUserDto.has2fa && epx.f(this.lastName, authUserDto.lastName) && epx.f(this.photo200, authUserDto.photo200) && epx.f(this.deactivated, authUserDto.deactivated) && epx.f(this.phone, authUserDto.phone) && epx.f(this.hasPassword, authUserDto.hasPassword) && epx.f(this.canUnbindPhone, authUserDto.canUnbindPhone);
    }

    public final boolean f() {
        return this.has2fa;
    }

    public final Boolean g() {
        return this.hasPassword;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(qoy.b(this.firstName.hashCode() * 31, 31, this.has2fa), 31, this.lastName), 31, this.photo200);
        String str = this.deactivated;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phone;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hasPassword;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canUnbindPhone;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String i() {
        return this.lastName;
    }

    public final String j() {
        return this.phone;
    }

    public final String k() {
        return this.photo200;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthUserDto(firstName=");
        sb.append(this.firstName);
        sb.append(", has2fa=");
        sb.append(this.has2fa);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", deactivated=");
        sb.append(this.deactivated);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", hasPassword=");
        sb.append(this.hasPassword);
        sb.append(", canUnbindPhone=");
        return tn.a(sb, this.canUnbindPhone, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.firstName);
        parcel.writeInt(this.has2fa ? 1 : 0);
        parcel.writeString(this.lastName);
        parcel.writeString(this.photo200);
        parcel.writeString(this.deactivated);
        parcel.writeString(this.phone);
        Boolean bool = this.hasPassword;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canUnbindPhone;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ AuthUserDto(String str, boolean z, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this(str, z, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2);
    }
}
