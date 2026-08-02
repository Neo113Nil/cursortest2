package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AccountDeletePasswordResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountDeletePasswordResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountDeletePasswordResponseDto> CREATOR = new a();

    @pmi0("exchange_token")
    private final String exchangeToken;

    /* compiled from: AccountDeletePasswordResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountDeletePasswordResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountDeletePasswordResponseDto createFromParcel(Parcel parcel) {
            return new AccountDeletePasswordResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountDeletePasswordResponseDto[] newArray(int i) {
            return new AccountDeletePasswordResponseDto[i];
        }
    }

    public AccountDeletePasswordResponseDto(String str) {
        this.exchangeToken = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountDeletePasswordResponseDto) && epx.f(this.exchangeToken, ((AccountDeletePasswordResponseDto) obj).exchangeToken);
    }

    public final int hashCode() {
        return this.exchangeToken.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AccountDeletePasswordResponseDto(exchangeToken="), this.exchangeToken, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.exchangeToken);
    }
}
