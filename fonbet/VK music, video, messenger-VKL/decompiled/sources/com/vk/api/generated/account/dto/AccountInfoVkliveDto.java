package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AccountInfoVkliveDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoVkliveDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoVkliveDto> CREATOR = new a();

    @pmi0("schema")
    private final String schema;

    @pmi0("store_url")
    private final String storeUrl;

    /* compiled from: AccountInfoVkliveDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoVkliveDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoVkliveDto createFromParcel(Parcel parcel) {
            return new AccountInfoVkliveDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoVkliveDto[] newArray(int i) {
            return new AccountInfoVkliveDto[i];
        }
    }

    public AccountInfoVkliveDto(String str, String str2) {
        this.storeUrl = str;
        this.schema = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfoVkliveDto)) {
            return false;
        }
        AccountInfoVkliveDto accountInfoVkliveDto = (AccountInfoVkliveDto) obj;
        return epx.f(this.storeUrl, accountInfoVkliveDto.storeUrl) && epx.f(this.schema, accountInfoVkliveDto.schema);
    }

    public final int hashCode() {
        return this.schema.hashCode() + (this.storeUrl.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountInfoVkliveDto(storeUrl=");
        sb.append(this.storeUrl);
        sb.append(", schema=");
        return ho8.a(sb, this.schema, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.storeUrl);
        parcel.writeString(this.schema);
    }
}
