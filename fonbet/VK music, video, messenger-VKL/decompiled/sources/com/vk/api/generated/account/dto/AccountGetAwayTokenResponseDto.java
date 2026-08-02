package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountGetAwayTokenResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountGetAwayTokenResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountGetAwayTokenResponseDto> CREATOR = new a();

    @pmi0("away_token")
    private final String awayToken;

    @pmi0("status")
    private final boolean status;

    /* compiled from: AccountGetAwayTokenResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountGetAwayTokenResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountGetAwayTokenResponseDto createFromParcel(Parcel parcel) {
            return new AccountGetAwayTokenResponseDto(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountGetAwayTokenResponseDto[] newArray(int i) {
            return new AccountGetAwayTokenResponseDto[i];
        }
    }

    public AccountGetAwayTokenResponseDto(boolean z, String str) {
        this.status = z;
        this.awayToken = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountGetAwayTokenResponseDto)) {
            return false;
        }
        AccountGetAwayTokenResponseDto accountGetAwayTokenResponseDto = (AccountGetAwayTokenResponseDto) obj;
        return this.status == accountGetAwayTokenResponseDto.status && epx.f(this.awayToken, accountGetAwayTokenResponseDto.awayToken);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.status) * 31;
        String str = this.awayToken;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountGetAwayTokenResponseDto(status=");
        sb.append(this.status);
        sb.append(", awayToken=");
        return ho8.a(sb, this.awayToken, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.status ? 1 : 0);
        parcel.writeString(this.awayToken);
    }

    public /* synthetic */ AccountGetAwayTokenResponseDto(boolean z, String str, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : str);
    }
}
