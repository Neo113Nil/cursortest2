package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthGetContinuationForServiceResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetContinuationForServiceResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetContinuationForServiceResponseDto> CREATOR = new a();

    @pmi0("super_app_token")
    private final String superAppToken;

    /* compiled from: AuthGetContinuationForServiceResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetContinuationForServiceResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetContinuationForServiceResponseDto createFromParcel(Parcel parcel) {
            return new AuthGetContinuationForServiceResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetContinuationForServiceResponseDto[] newArray(int i) {
            return new AuthGetContinuationForServiceResponseDto[i];
        }
    }

    public AuthGetContinuationForServiceResponseDto(String str) {
        this.superAppToken = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthGetContinuationForServiceResponseDto) && epx.f(this.superAppToken, ((AuthGetContinuationForServiceResponseDto) obj).superAppToken);
    }

    public final int hashCode() {
        return this.superAppToken.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AuthGetContinuationForServiceResponseDto(superAppToken="), this.superAppToken, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.superAppToken);
    }
}
