package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountGetPhoneResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountGetPhoneResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountGetPhoneResponseDto> CREATOR = new a();

    @pmi0("phone_number")
    private final String phoneNumber;

    @pmi0("phone_partial_validated")
    private final Integer phonePartialValidated;

    @pmi0("phone_validated")
    private final Integer phoneValidated;

    @pmi0("sign")
    private final String sign;

    /* compiled from: AccountGetPhoneResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountGetPhoneResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountGetPhoneResponseDto createFromParcel(Parcel parcel) {
            return new AccountGetPhoneResponseDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountGetPhoneResponseDto[] newArray(int i) {
            return new AccountGetPhoneResponseDto[i];
        }
    }

    public AccountGetPhoneResponseDto(String str, Integer num, Integer num2, String str2) {
        this.phoneNumber = str;
        this.phoneValidated = num;
        this.phonePartialValidated = num2;
        this.sign = str2;
    }

    public final String d() {
        return this.phoneNumber;
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
        if (!(obj instanceof AccountGetPhoneResponseDto)) {
            return false;
        }
        AccountGetPhoneResponseDto accountGetPhoneResponseDto = (AccountGetPhoneResponseDto) obj;
        return epx.f(this.phoneNumber, accountGetPhoneResponseDto.phoneNumber) && epx.f(this.phoneValidated, accountGetPhoneResponseDto.phoneValidated) && epx.f(this.phonePartialValidated, accountGetPhoneResponseDto.phonePartialValidated) && epx.f(this.sign, accountGetPhoneResponseDto.sign);
    }

    public final int hashCode() {
        int hashCode = this.phoneNumber.hashCode() * 31;
        Integer num = this.phoneValidated;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.phonePartialValidated;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.sign;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountGetPhoneResponseDto(phoneNumber=");
        sb.append(this.phoneNumber);
        sb.append(", phoneValidated=");
        sb.append(this.phoneValidated);
        sb.append(", phonePartialValidated=");
        sb.append(this.phonePartialValidated);
        sb.append(", sign=");
        return ho8.a(sb, this.sign, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.phoneNumber);
        Integer num = this.phoneValidated;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.phonePartialValidated;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.sign);
    }

    public /* synthetic */ AccountGetPhoneResponseDto(String str, Integer num, Integer num2, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2);
    }
}
