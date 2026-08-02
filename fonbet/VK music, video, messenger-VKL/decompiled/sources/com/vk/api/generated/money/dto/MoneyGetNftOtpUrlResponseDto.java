package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MoneyGetNftOtpUrlResponseDto.kt */
/* loaded from: classes15.dex */
public final class MoneyGetNftOtpUrlResponseDto implements Parcelable {
    public static final Parcelable.Creator<MoneyGetNftOtpUrlResponseDto> CREATOR = new a();

    @pmi0("otp_url")
    private final String otpUrl;

    /* compiled from: MoneyGetNftOtpUrlResponseDto.kt */
    public static final class a implements Parcelable.Creator<MoneyGetNftOtpUrlResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyGetNftOtpUrlResponseDto createFromParcel(Parcel parcel) {
            return new MoneyGetNftOtpUrlResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyGetNftOtpUrlResponseDto[] newArray(int i) {
            return new MoneyGetNftOtpUrlResponseDto[i];
        }
    }

    public MoneyGetNftOtpUrlResponseDto(String str) {
        this.otpUrl = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoneyGetNftOtpUrlResponseDto) && epx.f(this.otpUrl, ((MoneyGetNftOtpUrlResponseDto) obj).otpUrl);
    }

    public final int hashCode() {
        return this.otpUrl.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MoneyGetNftOtpUrlResponseDto(otpUrl="), this.otpUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.otpUrl);
    }
}
