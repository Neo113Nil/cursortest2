package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: AccountValidateProfileInfoResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountValidateProfileInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountValidateProfileInfoResponseDto> CREATOR = new a();

    @pmi0("fields")
    private final List<AccountValidateProfileInfoDto> fields;

    @pmi0("is_error")
    private final Boolean isError;

    @pmi0("verification_profile_change")
    private final Boolean verificationProfileChange;

    @pmi0("verification_profile_restore")
    private final Boolean verificationProfileRestore;

    /* compiled from: AccountValidateProfileInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountValidateProfileInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountValidateProfileInfoResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            Boolean valueOf2;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AccountValidateProfileInfoDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AccountValidateProfileInfoResponseDto(valueOf, arrayList, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountValidateProfileInfoResponseDto[] newArray(int i) {
            return new AccountValidateProfileInfoResponseDto[i];
        }
    }

    public AccountValidateProfileInfoResponseDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountValidateProfileInfoResponseDto)) {
            return false;
        }
        AccountValidateProfileInfoResponseDto accountValidateProfileInfoResponseDto = (AccountValidateProfileInfoResponseDto) obj;
        return epx.f(this.isError, accountValidateProfileInfoResponseDto.isError) && epx.f(this.fields, accountValidateProfileInfoResponseDto.fields) && epx.f(this.verificationProfileChange, accountValidateProfileInfoResponseDto.verificationProfileChange) && epx.f(this.verificationProfileRestore, accountValidateProfileInfoResponseDto.verificationProfileRestore);
    }

    public final int hashCode() {
        Boolean bool = this.isError;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<AccountValidateProfileInfoDto> list = this.fields;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.verificationProfileChange;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.verificationProfileRestore;
        return hashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountValidateProfileInfoResponseDto(isError=");
        sb.append(this.isError);
        sb.append(", fields=");
        sb.append(this.fields);
        sb.append(", verificationProfileChange=");
        sb.append(this.verificationProfileChange);
        sb.append(", verificationProfileRestore=");
        return tn.a(sb, this.verificationProfileRestore, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isError;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<AccountValidateProfileInfoDto> list = this.fields;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AccountValidateProfileInfoDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool2 = this.verificationProfileChange;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.verificationProfileRestore;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public AccountValidateProfileInfoResponseDto(Boolean bool, List<AccountValidateProfileInfoDto> list, Boolean bool2, Boolean bool3) {
        this.isError = bool;
        this.fields = list;
        this.verificationProfileChange = bool2;
        this.verificationProfileRestore = bool3;
    }

    public /* synthetic */ AccountValidateProfileInfoResponseDto(Boolean bool, List list, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3);
    }
}
