package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.api.methods.users.changePassword.ChangePasswordApiRequestV1;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthGetAuthDataHashDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthDataHashDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthDataHashDto> CREATOR = new a();

    @pmi0(ChangePasswordApiRequestV1.PARAM_NAME_LOGOUT_ALL)
    private final String logout;

    @pmi0("return_auth")
    private final String returnAuth;

    /* compiled from: AuthGetAuthDataHashDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthDataHashDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataHashDto createFromParcel(Parcel parcel) {
            return new AuthGetAuthDataHashDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataHashDto[] newArray(int i) {
            return new AuthGetAuthDataHashDto[i];
        }
    }

    public AuthGetAuthDataHashDto(String str, String str2) {
        this.logout = str;
        this.returnAuth = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAuthDataHashDto)) {
            return false;
        }
        AuthGetAuthDataHashDto authGetAuthDataHashDto = (AuthGetAuthDataHashDto) obj;
        return epx.f(this.logout, authGetAuthDataHashDto.logout) && epx.f(this.returnAuth, authGetAuthDataHashDto.returnAuth);
    }

    public final int hashCode() {
        return this.returnAuth.hashCode() + (this.logout.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetAuthDataHashDto(logout=");
        sb.append(this.logout);
        sb.append(", returnAuth=");
        return ho8.a(sb, this.returnAuth, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.logout);
        parcel.writeString(this.returnAuth);
    }
}
