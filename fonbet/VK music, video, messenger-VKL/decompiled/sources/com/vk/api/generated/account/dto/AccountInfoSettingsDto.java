package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: AccountInfoSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoSettingsDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoSettingsDto> CREATOR = new a();

    @pmi0("available")
    private final boolean available;

    @pmi0("forced")
    private final boolean forced;

    @pmi0("name")
    private final AccountInfoSettingsNameDto name;

    @pmi0("value")
    private final String value;

    /* compiled from: AccountInfoSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoSettingsDto createFromParcel(Parcel parcel) {
            return new AccountInfoSettingsDto(parcel.readInt() != 0, parcel.readInt() != 0, AccountInfoSettingsNameDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoSettingsDto[] newArray(int i) {
            return new AccountInfoSettingsDto[i];
        }
    }

    public AccountInfoSettingsDto(boolean z, boolean z2, AccountInfoSettingsNameDto accountInfoSettingsNameDto, String str) {
        this.available = z;
        this.forced = z2;
        this.name = accountInfoSettingsNameDto;
        this.value = str;
    }

    public final boolean d() {
        return this.available;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AccountInfoSettingsNameDto e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfoSettingsDto)) {
            return false;
        }
        AccountInfoSettingsDto accountInfoSettingsDto = (AccountInfoSettingsDto) obj;
        return this.available == accountInfoSettingsDto.available && this.forced == accountInfoSettingsDto.forced && this.name == accountInfoSettingsDto.name && epx.f(this.value, accountInfoSettingsDto.value);
    }

    public final String f() {
        return this.value;
    }

    public final int hashCode() {
        int hashCode = (this.name.hashCode() + qoy.b(Boolean.hashCode(this.available) * 31, 31, this.forced)) * 31;
        String str = this.value;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountInfoSettingsDto(available=");
        sb.append(this.available);
        sb.append(", forced=");
        sb.append(this.forced);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.available ? 1 : 0);
        parcel.writeInt(this.forced ? 1 : 0);
        this.name.writeToParcel(parcel, i);
        parcel.writeString(this.value);
    }

    public /* synthetic */ AccountInfoSettingsDto(boolean z, boolean z2, AccountInfoSettingsNameDto accountInfoSettingsNameDto, String str, int i, zcl zclVar) {
        this(z, z2, accountInfoSettingsNameDto, (i & 8) != 0 ? null : str);
    }
}
