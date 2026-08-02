package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthCheckValidationStatusResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthCheckValidationStatusResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthCheckValidationStatusResponseDto> CREATOR = new a();

    @pmi0("status")
    private final String status;

    /* compiled from: AuthCheckValidationStatusResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthCheckValidationStatusResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthCheckValidationStatusResponseDto createFromParcel(Parcel parcel) {
            return new AuthCheckValidationStatusResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthCheckValidationStatusResponseDto[] newArray(int i) {
            return new AuthCheckValidationStatusResponseDto[i];
        }
    }

    public AuthCheckValidationStatusResponseDto(String str) {
        this.status = str;
    }

    public final String d() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthCheckValidationStatusResponseDto) && epx.f(this.status, ((AuthCheckValidationStatusResponseDto) obj).status);
    }

    public final int hashCode() {
        return this.status.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AuthCheckValidationStatusResponseDto(status="), this.status, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.status);
    }
}
