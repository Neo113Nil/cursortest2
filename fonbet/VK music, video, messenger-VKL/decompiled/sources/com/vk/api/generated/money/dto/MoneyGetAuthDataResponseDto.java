package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MoneyGetAuthDataResponseDto.kt */
/* loaded from: classes15.dex */
public final class MoneyGetAuthDataResponseDto implements Parcelable {
    public static final Parcelable.Creator<MoneyGetAuthDataResponseDto> CREATOR = new a();

    @pmi0("auth_data")
    private final String authData;

    @pmi0("auth_sign")
    private final String authSign;

    /* compiled from: MoneyGetAuthDataResponseDto.kt */
    public static final class a implements Parcelable.Creator<MoneyGetAuthDataResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyGetAuthDataResponseDto createFromParcel(Parcel parcel) {
            return new MoneyGetAuthDataResponseDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyGetAuthDataResponseDto[] newArray(int i) {
            return new MoneyGetAuthDataResponseDto[i];
        }
    }

    public MoneyGetAuthDataResponseDto(String str, String str2) {
        this.authData = str;
        this.authSign = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyGetAuthDataResponseDto)) {
            return false;
        }
        MoneyGetAuthDataResponseDto moneyGetAuthDataResponseDto = (MoneyGetAuthDataResponseDto) obj;
        return epx.f(this.authData, moneyGetAuthDataResponseDto.authData) && epx.f(this.authSign, moneyGetAuthDataResponseDto.authSign);
    }

    public final int hashCode() {
        return this.authSign.hashCode() + (this.authData.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyGetAuthDataResponseDto(authData=");
        sb.append(this.authData);
        sb.append(", authSign=");
        return ho8.a(sb, this.authSign, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.authData);
        parcel.writeString(this.authSign);
    }
}
