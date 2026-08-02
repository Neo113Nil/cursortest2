package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthGetAuthDataSettingsBaseCountryDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthDataSettingsBaseCountryDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthDataSettingsBaseCountryDto> CREATOR = new a();

    @pmi0("dial_code")
    private final String dialCode;

    @pmi0("iso2")
    private final String iso2;

    /* compiled from: AuthGetAuthDataSettingsBaseCountryDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthDataSettingsBaseCountryDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataSettingsBaseCountryDto createFromParcel(Parcel parcel) {
            return new AuthGetAuthDataSettingsBaseCountryDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataSettingsBaseCountryDto[] newArray(int i) {
            return new AuthGetAuthDataSettingsBaseCountryDto[i];
        }
    }

    public AuthGetAuthDataSettingsBaseCountryDto(String str, String str2) {
        this.dialCode = str;
        this.iso2 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAuthDataSettingsBaseCountryDto)) {
            return false;
        }
        AuthGetAuthDataSettingsBaseCountryDto authGetAuthDataSettingsBaseCountryDto = (AuthGetAuthDataSettingsBaseCountryDto) obj;
        return epx.f(this.dialCode, authGetAuthDataSettingsBaseCountryDto.dialCode) && epx.f(this.iso2, authGetAuthDataSettingsBaseCountryDto.iso2);
    }

    public final int hashCode() {
        return this.iso2.hashCode() + (this.dialCode.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetAuthDataSettingsBaseCountryDto(dialCode=");
        sb.append(this.dialCode);
        sb.append(", iso2=");
        return ho8.a(sb, this.iso2, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.dialCode);
        parcel.writeString(this.iso2);
    }
}
