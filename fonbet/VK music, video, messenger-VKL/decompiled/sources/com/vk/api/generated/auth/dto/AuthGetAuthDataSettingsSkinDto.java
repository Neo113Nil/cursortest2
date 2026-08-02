package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AuthGetAuthDataSettingsSkinDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthDataSettingsSkinDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthDataSettingsSkinDto> CREATOR = new a();

    @pmi0(X3.a.t)
    private final String mode;

    @pmi0("params")
    private final AuthGetAuthDataSettingsSkinParamsObjectDto params;

    /* compiled from: AuthGetAuthDataSettingsSkinDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthDataSettingsSkinDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataSettingsSkinDto createFromParcel(Parcel parcel) {
            return new AuthGetAuthDataSettingsSkinDto(parcel.readString(), AuthGetAuthDataSettingsSkinParamsObjectDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataSettingsSkinDto[] newArray(int i) {
            return new AuthGetAuthDataSettingsSkinDto[i];
        }
    }

    public AuthGetAuthDataSettingsSkinDto(String str, AuthGetAuthDataSettingsSkinParamsObjectDto authGetAuthDataSettingsSkinParamsObjectDto) {
        this.mode = str;
        this.params = authGetAuthDataSettingsSkinParamsObjectDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAuthDataSettingsSkinDto)) {
            return false;
        }
        AuthGetAuthDataSettingsSkinDto authGetAuthDataSettingsSkinDto = (AuthGetAuthDataSettingsSkinDto) obj;
        return epx.f(this.mode, authGetAuthDataSettingsSkinDto.mode) && epx.f(this.params, authGetAuthDataSettingsSkinDto.params);
    }

    public final int hashCode() {
        return this.params.hashCode() + (this.mode.hashCode() * 31);
    }

    public final String toString() {
        return "AuthGetAuthDataSettingsSkinDto(mode=" + this.mode + ", params=" + this.params + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mode);
        this.params.writeToParcel(parcel, i);
    }
}
