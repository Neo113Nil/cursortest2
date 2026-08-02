package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountChangePasswordResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountChangePasswordResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountChangePasswordResponseDto> CREATOR = new a();

    @pmi0("secret")
    private final String secret;

    @pmi0("token")
    private final String token;

    /* compiled from: AccountChangePasswordResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountChangePasswordResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountChangePasswordResponseDto createFromParcel(Parcel parcel) {
            return new AccountChangePasswordResponseDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountChangePasswordResponseDto[] newArray(int i) {
            return new AccountChangePasswordResponseDto[i];
        }
    }

    public AccountChangePasswordResponseDto(String str, String str2) {
        this.token = str;
        this.secret = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountChangePasswordResponseDto)) {
            return false;
        }
        AccountChangePasswordResponseDto accountChangePasswordResponseDto = (AccountChangePasswordResponseDto) obj;
        return epx.f(this.token, accountChangePasswordResponseDto.token) && epx.f(this.secret, accountChangePasswordResponseDto.secret);
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        String str = this.secret;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountChangePasswordResponseDto(token=");
        sb.append(this.token);
        sb.append(", secret=");
        return ho8.a(sb, this.secret, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.token);
        parcel.writeString(this.secret);
    }

    public /* synthetic */ AccountChangePasswordResponseDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
