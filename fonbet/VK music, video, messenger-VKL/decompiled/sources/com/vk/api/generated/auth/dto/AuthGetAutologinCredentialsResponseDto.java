package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthGetAutologinCredentialsResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAutologinCredentialsResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAutologinCredentialsResponseDto> CREATOR = new a();

    @pmi0("autologin_delay")
    private final int autologinDelay;

    @pmi0("token_info")
    private final AuthSilentTokenDto tokenInfo;

    /* compiled from: AuthGetAutologinCredentialsResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAutologinCredentialsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAutologinCredentialsResponseDto createFromParcel(Parcel parcel) {
            return new AuthGetAutologinCredentialsResponseDto(parcel.readInt(), parcel.readInt() == 0 ? null : AuthSilentTokenDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAutologinCredentialsResponseDto[] newArray(int i) {
            return new AuthGetAutologinCredentialsResponseDto[i];
        }
    }

    public AuthGetAutologinCredentialsResponseDto(int i, AuthSilentTokenDto authSilentTokenDto) {
        this.autologinDelay = i;
        this.tokenInfo = authSilentTokenDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAutologinCredentialsResponseDto)) {
            return false;
        }
        AuthGetAutologinCredentialsResponseDto authGetAutologinCredentialsResponseDto = (AuthGetAutologinCredentialsResponseDto) obj;
        return this.autologinDelay == authGetAutologinCredentialsResponseDto.autologinDelay && epx.f(this.tokenInfo, authGetAutologinCredentialsResponseDto.tokenInfo);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.autologinDelay) * 31;
        AuthSilentTokenDto authSilentTokenDto = this.tokenInfo;
        return hashCode + (authSilentTokenDto == null ? 0 : authSilentTokenDto.hashCode());
    }

    public final String toString() {
        return "AuthGetAutologinCredentialsResponseDto(autologinDelay=" + this.autologinDelay + ", tokenInfo=" + this.tokenInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.autologinDelay);
        AuthSilentTokenDto authSilentTokenDto = this.tokenInfo;
        if (authSilentTokenDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authSilentTokenDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AuthGetAutologinCredentialsResponseDto(int i, AuthSilentTokenDto authSilentTokenDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : authSilentTokenDto);
    }
}
