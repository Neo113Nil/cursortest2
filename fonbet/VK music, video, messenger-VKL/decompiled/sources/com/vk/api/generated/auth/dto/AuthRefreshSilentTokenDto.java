package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;

/* compiled from: AuthRefreshSilentTokenDto.kt */
/* loaded from: classes14.dex */
public final class AuthRefreshSilentTokenDto implements Parcelable {
    public static final Parcelable.Creator<AuthRefreshSilentTokenDto> CREATOR = new a();

    @pmi0(SharedKt.PARAM_EXPIRES_IN)
    private final int expiresIn;

    @pmi0("token")
    private final String token;

    @pmi0("uuid")
    private final String uuid;

    /* compiled from: AuthRefreshSilentTokenDto.kt */
    public static final class a implements Parcelable.Creator<AuthRefreshSilentTokenDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthRefreshSilentTokenDto createFromParcel(Parcel parcel) {
            return new AuthRefreshSilentTokenDto(parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthRefreshSilentTokenDto[] newArray(int i) {
            return new AuthRefreshSilentTokenDto[i];
        }
    }

    public AuthRefreshSilentTokenDto(String str, int i, String str2) {
        this.token = str;
        this.expiresIn = i;
        this.uuid = str2;
    }

    public final int d() {
        return this.expiresIn;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthRefreshSilentTokenDto)) {
            return false;
        }
        AuthRefreshSilentTokenDto authRefreshSilentTokenDto = (AuthRefreshSilentTokenDto) obj;
        return epx.f(this.token, authRefreshSilentTokenDto.token) && this.expiresIn == authRefreshSilentTokenDto.expiresIn && epx.f(this.uuid, authRefreshSilentTokenDto.uuid);
    }

    public final String f() {
        return this.uuid;
    }

    public final int hashCode() {
        return this.uuid.hashCode() + shy.a(this.expiresIn, this.token.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthRefreshSilentTokenDto(token=");
        sb.append(this.token);
        sb.append(", expiresIn=");
        sb.append(this.expiresIn);
        sb.append(", uuid=");
        return ho8.a(sb, this.uuid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.token);
        parcel.writeInt(this.expiresIn);
        parcel.writeString(this.uuid);
    }
}
