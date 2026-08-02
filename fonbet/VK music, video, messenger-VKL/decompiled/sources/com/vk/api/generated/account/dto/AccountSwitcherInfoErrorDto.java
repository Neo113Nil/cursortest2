package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;

/* compiled from: AccountSwitcherInfoErrorDto.kt */
/* loaded from: classes14.dex */
public final class AccountSwitcherInfoErrorDto implements Parcelable {
    public static final Parcelable.Creator<AccountSwitcherInfoErrorDto> CREATOR = new a();

    @pmi0("code")
    private final int code;

    @pmi0("description")
    private final String description;

    @pmi0("index")
    private final int index;

    /* compiled from: AccountSwitcherInfoErrorDto.kt */
    public static final class a implements Parcelable.Creator<AccountSwitcherInfoErrorDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSwitcherInfoErrorDto createFromParcel(Parcel parcel) {
            return new AccountSwitcherInfoErrorDto(parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSwitcherInfoErrorDto[] newArray(int i) {
            return new AccountSwitcherInfoErrorDto[i];
        }
    }

    public AccountSwitcherInfoErrorDto(int i, int i2, String str) {
        this.index = i;
        this.code = i2;
        this.description = str;
    }

    public final int d() {
        return this.code;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.index;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSwitcherInfoErrorDto)) {
            return false;
        }
        AccountSwitcherInfoErrorDto accountSwitcherInfoErrorDto = (AccountSwitcherInfoErrorDto) obj;
        return this.index == accountSwitcherInfoErrorDto.index && this.code == accountSwitcherInfoErrorDto.code && epx.f(this.description, accountSwitcherInfoErrorDto.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + shy.a(this.code, Integer.hashCode(this.index) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountSwitcherInfoErrorDto(index=");
        sb.append(this.index);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeInt(this.code);
        parcel.writeString(this.description);
    }
}
