package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: AccountMenuItemDto.kt */
/* loaded from: classes14.dex */
public final class AccountMenuItemDto implements Parcelable {
    public static final Parcelable.Creator<AccountMenuItemDto> CREATOR = new a();

    @pmi0("is_new")
    private final Boolean isNew;

    @pmi0("name")
    private final String name;

    @pmi0("target")
    private final AccountMenuItemTargetDto target;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: AccountMenuItemDto.kt */
    public static final class a implements Parcelable.Creator<AccountMenuItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountMenuItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AccountMenuItemDto(readString, valueOf, parcel.readInt() != 0 ? AccountMenuItemTargetDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountMenuItemDto[] newArray(int i) {
            return new AccountMenuItemDto[i];
        }
    }

    public AccountMenuItemDto(String str, Boolean bool, AccountMenuItemTargetDto accountMenuItemTargetDto, String str2) {
        this.name = str;
        this.isNew = bool;
        this.target = accountMenuItemTargetDto;
        this.trackCode = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountMenuItemDto)) {
            return false;
        }
        AccountMenuItemDto accountMenuItemDto = (AccountMenuItemDto) obj;
        return epx.f(this.name, accountMenuItemDto.name) && epx.f(this.isNew, accountMenuItemDto.isNew) && epx.f(this.target, accountMenuItemDto.target) && epx.f(this.trackCode, accountMenuItemDto.trackCode);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        Boolean bool = this.isNew;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        AccountMenuItemTargetDto accountMenuItemTargetDto = this.target;
        int hashCode3 = (hashCode2 + (accountMenuItemTargetDto == null ? 0 : accountMenuItemTargetDto.hashCode())) * 31;
        String str = this.trackCode;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountMenuItemDto(name=");
        sb.append(this.name);
        sb.append(", isNew=");
        sb.append(this.isNew);
        sb.append(", target=");
        sb.append(this.target);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        Boolean bool = this.isNew;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        AccountMenuItemTargetDto accountMenuItemTargetDto = this.target;
        if (accountMenuItemTargetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountMenuItemTargetDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.trackCode);
    }

    public /* synthetic */ AccountMenuItemDto(String str, Boolean bool, AccountMenuItemTargetDto accountMenuItemTargetDto, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : accountMenuItemTargetDto, (i & 8) != 0 ? null : str2);
    }
}
