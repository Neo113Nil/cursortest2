package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountInfoSideMenuCustomItemDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoSideMenuCustomItemDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoSideMenuCustomItemDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("icon")
    private final AccountInfoSideMenuCustomItemIconDto icon;

    @pmi0("title")
    private final String title;

    /* compiled from: AccountInfoSideMenuCustomItemDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoSideMenuCustomItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoSideMenuCustomItemDto createFromParcel(Parcel parcel) {
            return new AccountInfoSideMenuCustomItemDto(parcel.readInt() == 0 ? null : AccountInfoSideMenuCustomItemIconDto.CREATOR.createFromParcel(parcel), parcel.readString(), (BaseLinkButtonActionDto) parcel.readParcelable(AccountInfoSideMenuCustomItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoSideMenuCustomItemDto[] newArray(int i) {
            return new AccountInfoSideMenuCustomItemDto[i];
        }
    }

    public AccountInfoSideMenuCustomItemDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfoSideMenuCustomItemDto)) {
            return false;
        }
        AccountInfoSideMenuCustomItemDto accountInfoSideMenuCustomItemDto = (AccountInfoSideMenuCustomItemDto) obj;
        return this.icon == accountInfoSideMenuCustomItemDto.icon && epx.f(this.title, accountInfoSideMenuCustomItemDto.title) && epx.f(this.action, accountInfoSideMenuCustomItemDto.action);
    }

    public final int hashCode() {
        AccountInfoSideMenuCustomItemIconDto accountInfoSideMenuCustomItemIconDto = this.icon;
        int hashCode = (accountInfoSideMenuCustomItemIconDto == null ? 0 : accountInfoSideMenuCustomItemIconDto.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        return hashCode2 + (baseLinkButtonActionDto != null ? baseLinkButtonActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "AccountInfoSideMenuCustomItemDto(icon=" + this.icon + ", title=" + this.title + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AccountInfoSideMenuCustomItemIconDto accountInfoSideMenuCustomItemIconDto = this.icon;
        if (accountInfoSideMenuCustomItemIconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoSideMenuCustomItemIconDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeParcelable(this.action, i);
    }

    public AccountInfoSideMenuCustomItemDto(AccountInfoSideMenuCustomItemIconDto accountInfoSideMenuCustomItemIconDto, String str, BaseLinkButtonActionDto baseLinkButtonActionDto) {
        this.icon = accountInfoSideMenuCustomItemIconDto;
        this.title = str;
        this.action = baseLinkButtonActionDto;
    }

    public /* synthetic */ AccountInfoSideMenuCustomItemDto(AccountInfoSideMenuCustomItemIconDto accountInfoSideMenuCustomItemIconDto, String str, BaseLinkButtonActionDto baseLinkButtonActionDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : accountInfoSideMenuCustomItemIconDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : baseLinkButtonActionDto);
    }
}
