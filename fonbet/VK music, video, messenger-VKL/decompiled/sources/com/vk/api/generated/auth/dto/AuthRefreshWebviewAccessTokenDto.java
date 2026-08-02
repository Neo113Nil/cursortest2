package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: AuthRefreshWebviewAccessTokenDto.kt */
/* loaded from: classes14.dex */
public final class AuthRefreshWebviewAccessTokenDto implements Parcelable {
    public static final Parcelable.Creator<AuthRefreshWebviewAccessTokenDto> CREATOR = new a();

    @pmi0(SharedKt.PARAM_EXPIRES_IN)
    private final int expiresIn;

    @pmi0("token")
    private final String token;

    /* compiled from: AuthRefreshWebviewAccessTokenDto.kt */
    public static final class a implements Parcelable.Creator<AuthRefreshWebviewAccessTokenDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthRefreshWebviewAccessTokenDto createFromParcel(Parcel parcel) {
            return new AuthRefreshWebviewAccessTokenDto(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthRefreshWebviewAccessTokenDto[] newArray(int i) {
            return new AuthRefreshWebviewAccessTokenDto[i];
        }
    }

    public AuthRefreshWebviewAccessTokenDto(String str, int i) {
        this.token = str;
        this.expiresIn = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthRefreshWebviewAccessTokenDto)) {
            return false;
        }
        AuthRefreshWebviewAccessTokenDto authRefreshWebviewAccessTokenDto = (AuthRefreshWebviewAccessTokenDto) obj;
        return epx.f(this.token, authRefreshWebviewAccessTokenDto.token) && this.expiresIn == authRefreshWebviewAccessTokenDto.expiresIn;
    }

    public final int hashCode() {
        return Integer.hashCode(this.expiresIn) + (this.token.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthRefreshWebviewAccessTokenDto(token=");
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
