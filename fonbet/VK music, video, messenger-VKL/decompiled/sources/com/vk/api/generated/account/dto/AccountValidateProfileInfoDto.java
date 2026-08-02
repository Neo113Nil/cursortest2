package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountValidateProfileInfoDto.kt */
/* loaded from: classes14.dex */
public final class AccountValidateProfileInfoDto implements Parcelable {
    public static final Parcelable.Creator<AccountValidateProfileInfoDto> CREATOR = new a();

    @pmi0("error_code")
    private final Integer errorCode;

    @pmi0(SharedKt.PARAM_ERROR_MSG)
    private final String errorMsg;

    @pmi0("error_text")
    private final String errorText;

    @pmi0("field_name")
    private final String fieldName;

    /* compiled from: AccountValidateProfileInfoDto.kt */
    public static final class a implements Parcelable.Creator<AccountValidateProfileInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountValidateProfileInfoDto createFromParcel(Parcel parcel) {
            return new AccountValidateProfileInfoDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountValidateProfileInfoDto[] newArray(int i) {
            return new AccountValidateProfileInfoDto[i];
        }
    }

    public AccountValidateProfileInfoDto(String str, Integer num, String str2, String str3) {
        this.fieldName = str;
        this.errorCode = num;
        this.errorMsg = str2;
        this.errorText = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountValidateProfileInfoDto)) {
            return false;
        }
        AccountValidateProfileInfoDto accountValidateProfileInfoDto = (AccountValidateProfileInfoDto) obj;
        return epx.f(this.fieldName, accountValidateProfileInfoDto.fieldName) && epx.f(this.errorCode, accountValidateProfileInfoDto.errorCode) && epx.f(this.errorMsg, accountValidateProfileInfoDto.errorMsg) && epx.f(this.errorText, accountValidateProfileInfoDto.errorText);
    }

    public final int hashCode() {
        int hashCode = this.fieldName.hashCode() * 31;
        Integer num = this.errorCode;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.errorMsg;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorText;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountValidateProfileInfoDto(fieldName=");
        sb.append(this.fieldName);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorMsg=");
        sb.append(this.errorMsg);
        sb.append(", errorText=");
        return ho8.a(sb, this.errorText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fieldName);
        Integer num = this.errorCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.errorMsg);
        parcel.writeString(this.errorText);
    }

    public /* synthetic */ AccountValidateProfileInfoDto(String str, Integer num, String str2, String str3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
