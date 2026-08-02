package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountGetEmailResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountGetEmailResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountGetEmailResponseDto> CREATOR = new a();

    @pmi0("email")
    private final String email;

    @pmi0("sign")
    private final String sign;

    /* compiled from: AccountGetEmailResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountGetEmailResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountGetEmailResponseDto createFromParcel(Parcel parcel) {
            return new AccountGetEmailResponseDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountGetEmailResponseDto[] newArray(int i) {
            return new AccountGetEmailResponseDto[i];
        }
    }

    public AccountGetEmailResponseDto(String str, String str2) {
        this.email = str;
        this.sign = str2;
    }

    public final String d() {
        return this.email;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.sign;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountGetEmailResponseDto)) {
            return false;
        }
        AccountGetEmailResponseDto accountGetEmailResponseDto = (AccountGetEmailResponseDto) obj;
        return epx.f(this.email, accountGetEmailResponseDto.email) && epx.f(this.sign, accountGetEmailResponseDto.sign);
    }

    public final int hashCode() {
        int hashCode = this.email.hashCode() * 31;
        String str = this.sign;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountGetEmailResponseDto(email=");
        sb.append(this.email);
        sb.append(", sign=");
        return ho8.a(sb, this.sign, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.email);
        parcel.writeString(this.sign);
    }

    public /* synthetic */ AccountGetEmailResponseDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
