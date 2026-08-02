package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthSilentTokenShortDto.kt */
/* loaded from: classes14.dex */
public final class AuthSilentTokenShortDto implements Parcelable {
    public static final Parcelable.Creator<AuthSilentTokenShortDto> CREATOR = new a();

    @pmi0("token")
    private final String token;

    @pmi0("uuid")
    private final String uuid;

    /* compiled from: AuthSilentTokenShortDto.kt */
    public static final class a implements Parcelable.Creator<AuthSilentTokenShortDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthSilentTokenShortDto createFromParcel(Parcel parcel) {
            return new AuthSilentTokenShortDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthSilentTokenShortDto[] newArray(int i) {
            return new AuthSilentTokenShortDto[i];
        }
    }

    public AuthSilentTokenShortDto(String str, String str2) {
        this.token = str;
        this.uuid = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthSilentTokenShortDto)) {
            return false;
        }
        AuthSilentTokenShortDto authSilentTokenShortDto = (AuthSilentTokenShortDto) obj;
        return epx.f(this.token, authSilentTokenShortDto.token) && epx.f(this.uuid, authSilentTokenShortDto.uuid);
    }

    public final int hashCode() {
        return this.uuid.hashCode() + (this.token.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthSilentTokenShortDto(token=");
        sb.append(this.token);
        sb.append(", uuid=");
        return ho8.a(sb, this.uuid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.token);
        parcel.writeString(this.uuid);
    }
}
