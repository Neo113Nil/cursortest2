package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: AuthRefreshAccessTokenDto.kt */
/* loaded from: classes14.dex */
public final class AuthRefreshAccessTokenDto implements Parcelable {
    public static final Parcelable.Creator<AuthRefreshAccessTokenDto> CREATOR = new a();

    @pmi0(SharedKt.PARAM_EXPIRES_IN)
    private final int expiresIn;

    @pmi0("token")
    private final String token;

    /* compiled from: AuthRefreshAccessTokenDto.kt */
    public static final class a implements Parcelable.Creator<AuthRefreshAccessTokenDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthRefreshAccessTokenDto createFromParcel(Parcel parcel) {
            return new AuthRefreshAccessTokenDto(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthRefreshAccessTokenDto[] newArray(int i) {
            return new AuthRefreshAccessTokenDto[i];
        }
    }

    public AuthRefreshAccessTokenDto(String str, int i) {
        this.token = str;
        this.expiresIn = i;
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
        if (!(obj instanceof AuthRefreshAccessTokenDto)) {
            return false;
        }
        AuthRefreshAccessTokenDto authRefreshAccessTokenDto = (AuthRefreshAccessTokenDto) obj;
        return epx.f(this.token, authRefreshAccessTokenDto.token) && this.expiresIn == authRefreshAccessTokenDto.expiresIn;
    }

    public final int hashCode() {
        return Integer.hashCode(this.expiresIn) + (this.token.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthRefreshAccessTokenDto(token=");
        sb.append(this.token);
        sb.append(", expiresIn=");
        return vu5.b(sb, this.expiresIn, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.token);
        parcel.writeInt(this.expiresIn);
    }
}
