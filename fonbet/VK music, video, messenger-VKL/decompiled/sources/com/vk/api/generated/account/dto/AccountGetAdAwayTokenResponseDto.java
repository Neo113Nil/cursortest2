package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: AccountGetAdAwayTokenResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountGetAdAwayTokenResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountGetAdAwayTokenResponseDto> CREATOR = new a();

    @pmi0("m_puad")
    private final String mPuad;

    @pmi0("m_puad_expire")
    private final int mPuadExpire;

    /* compiled from: AccountGetAdAwayTokenResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountGetAdAwayTokenResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountGetAdAwayTokenResponseDto createFromParcel(Parcel parcel) {
            return new AccountGetAdAwayTokenResponseDto(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountGetAdAwayTokenResponseDto[] newArray(int i) {
            return new AccountGetAdAwayTokenResponseDto[i];
        }
    }

    public AccountGetAdAwayTokenResponseDto(String str, int i) {
        this.mPuad = str;
        this.mPuadExpire = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountGetAdAwayTokenResponseDto)) {
            return false;
        }
        AccountGetAdAwayTokenResponseDto accountGetAdAwayTokenResponseDto = (AccountGetAdAwayTokenResponseDto) obj;
        return epx.f(this.mPuad, accountGetAdAwayTokenResponseDto.mPuad) && this.mPuadExpire == accountGetAdAwayTokenResponseDto.mPuadExpire;
    }

    public final int hashCode() {
        return Integer.hashCode(this.mPuadExpire) + (this.mPuad.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountGetAdAwayTokenResponseDto(mPuad=");
        sb.append(this.mPuad);
        sb.append(", mPuadExpire=");
        return vu5.b(sb, this.mPuadExpire, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mPuad);
        parcel.writeInt(this.mPuadExpire);
    }
}
