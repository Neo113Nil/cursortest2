package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthCheckAccessResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthCheckAccessResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthCheckAccessResponseDto> CREATOR = new a();

    @pmi0("token")
    private final String token;

    /* compiled from: AuthCheckAccessResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthCheckAccessResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthCheckAccessResponseDto createFromParcel(Parcel parcel) {
            return new AuthCheckAccessResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthCheckAccessResponseDto[] newArray(int i) {
            return new AuthCheckAccessResponseDto[i];
        }
    }

    public AuthCheckAccessResponseDto(String str) {
        this.token = str;
    }

    public final String d() {
        return this.token;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthCheckAccessResponseDto) && epx.f(this.token, ((AuthCheckAccessResponseDto) obj).token);
    }

    public final int hashCode() {
        return this.token.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AuthCheckAccessResponseDto(token="), this.token, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.token);
    }
}
