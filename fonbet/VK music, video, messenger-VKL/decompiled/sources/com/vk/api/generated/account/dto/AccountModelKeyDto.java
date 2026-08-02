package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: AccountModelKeyDto.kt */
/* loaded from: classes14.dex */
public final class AccountModelKeyDto implements Parcelable {
    public static final Parcelable.Creator<AccountModelKeyDto> CREATOR = new a();

    @pmi0("key")
    private final String key;

    @pmi0("meta_key")
    private final String metaKey;

    @pmi0("name")
    private final String name;

    @pmi0("version")
    private final int version;

    /* compiled from: AccountModelKeyDto.kt */
    public static final class a implements Parcelable.Creator<AccountModelKeyDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountModelKeyDto createFromParcel(Parcel parcel) {
            return new AccountModelKeyDto(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountModelKeyDto[] newArray(int i) {
            return new AccountModelKeyDto[i];
        }
    }

    public AccountModelKeyDto(String str, int i, String str2, String str3) {
        this.name = str;
        this.version = i;
        this.key = str2;
        this.metaKey = str3;
    }

    public final String d() {
        return this.key;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountModelKeyDto)) {
            return false;
        }
        AccountModelKeyDto accountModelKeyDto = (AccountModelKeyDto) obj;
        return epx.f(this.name, accountModelKeyDto.name) && this.version == accountModelKeyDto.version && epx.f(this.key, accountModelKeyDto.key) && epx.f(this.metaKey, accountModelKeyDto.metaKey);
    }

    public final int hashCode() {
        int a2 = shy.a(this.version, this.name.hashCode() * 31, 31);
        String str = this.key;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.metaKey;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountModelKeyDto(name=");
        sb.append(this.name);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", metaKey=");
        return ho8.a(sb, this.metaKey, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeInt(this.version);
        parcel.writeString(this.key);
        parcel.writeString(this.metaKey);
    }

    public /* synthetic */ AccountModelKeyDto(String str, int i, String str2, String str3, int i2, zcl zclVar) {
        this(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
    }
}
