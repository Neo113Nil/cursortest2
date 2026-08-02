package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthGetAuthDataSettingsRestoreDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthDataSettingsRestoreDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthDataSettingsRestoreDto> CREATOR = new a();

    @pmi0("callback_hash")
    private final String callbackHash;

    @pmi0("callback_uri")
    private final String callbackUri;

    /* compiled from: AuthGetAuthDataSettingsRestoreDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthDataSettingsRestoreDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataSettingsRestoreDto createFromParcel(Parcel parcel) {
            return new AuthGetAuthDataSettingsRestoreDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataSettingsRestoreDto[] newArray(int i) {
            return new AuthGetAuthDataSettingsRestoreDto[i];
        }
    }

    public AuthGetAuthDataSettingsRestoreDto(String str, String str2) {
        this.callbackUri = str;
        this.callbackHash = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAuthDataSettingsRestoreDto)) {
            return false;
        }
        AuthGetAuthDataSettingsRestoreDto authGetAuthDataSettingsRestoreDto = (AuthGetAuthDataSettingsRestoreDto) obj;
        return epx.f(this.callbackUri, authGetAuthDataSettingsRestoreDto.callbackUri) && epx.f(this.callbackHash, authGetAuthDataSettingsRestoreDto.callbackHash);
    }

    public final int hashCode() {
        return this.callbackHash.hashCode() + (this.callbackUri.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetAuthDataSettingsRestoreDto(callbackUri=");
        sb.append(this.callbackUri);
        sb.append(", callbackHash=");
        return ho8.a(sb, this.callbackHash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.callbackUri);
        parcel.writeString(this.callbackHash);
    }
}
