package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: AuthValidateAuthCodeResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthValidateAuthCodeResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthValidateAuthCodeResponseDto> CREATOR = new a();

    @pmi0("status")
    private final int status;

    /* compiled from: AuthValidateAuthCodeResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthValidateAuthCodeResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthValidateAuthCodeResponseDto createFromParcel(Parcel parcel) {
            return new AuthValidateAuthCodeResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthValidateAuthCodeResponseDto[] newArray(int i) {
            return new AuthValidateAuthCodeResponseDto[i];
        }
    }

    public AuthValidateAuthCodeResponseDto(int i) {
        this.status = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthValidateAuthCodeResponseDto) && this.status == ((AuthValidateAuthCodeResponseDto) obj).status;
    }

    public final int hashCode() {
        return Integer.hashCode(this.status);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("AuthValidateAuthCodeResponseDto(status="), this.status, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.status);
    }
}
