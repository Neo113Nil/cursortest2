package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AccountHelpHintResourceItemDto.kt */
/* loaded from: classes14.dex */
public final class AccountHelpHintResourceItemDto implements Parcelable {
    public static final Parcelable.Creator<AccountHelpHintResourceItemDto> CREATOR = new a();

    @pmi0("hash")
    private final int hash;

    @pmi0("key")
    private final String key;

    @pmi0("value")
    private final String value;

    /* compiled from: AccountHelpHintResourceItemDto.kt */
    public static final class a implements Parcelable.Creator<AccountHelpHintResourceItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountHelpHintResourceItemDto createFromParcel(Parcel parcel) {
            return new AccountHelpHintResourceItemDto(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountHelpHintResourceItemDto[] newArray(int i) {
            return new AccountHelpHintResourceItemDto[i];
        }
    }

    public AccountHelpHintResourceItemDto(int i, String str, String str2) {
        this.hash = i;
        this.key = str;
        this.value = str2;
    }

    public final String d() {
        return this.key;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountHelpHintResourceItemDto)) {
            return false;
        }
        AccountHelpHintResourceItemDto accountHelpHintResourceItemDto = (AccountHelpHintResourceItemDto) obj;
        return this.hash == accountHelpHintResourceItemDto.hash && epx.f(this.key, accountHelpHintResourceItemDto.key) && epx.f(this.value, accountHelpHintResourceItemDto.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + urd0.a(Integer.hashCode(this.hash) * 31, 31, this.key);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountHelpHintResourceItemDto(hash=");
        sb.append(this.hash);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hash);
        parcel.writeString(this.key);
        parcel.writeString(this.value);
    }
}
