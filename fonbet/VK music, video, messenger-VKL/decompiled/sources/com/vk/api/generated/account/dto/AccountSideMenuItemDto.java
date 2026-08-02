package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountSideMenuItemDto.kt */
/* loaded from: classes14.dex */
public final class AccountSideMenuItemDto implements Parcelable {
    public static final Parcelable.Creator<AccountSideMenuItemDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("additional_info")
    private final AccountAdditionalInfoDto additionalInfo;

    @pmi0("icon")
    private final AccountNavigationMenuItemIconDto icon;

    @pmi0("id")
    private final String id;

    @pmi0("title")
    private final String title;

    /* compiled from: AccountSideMenuItemDto.kt */
    public static final class a implements Parcelable.Creator<AccountSideMenuItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSideMenuItemDto createFromParcel(Parcel parcel) {
            return new AccountSideMenuItemDto(parcel.readInt() == 0 ? null : AccountNavigationMenuItemIconDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (BaseLinkButtonActionDto) parcel.readParcelable(AccountSideMenuItemDto.class.getClassLoader()), parcel.readInt() == 0 ? null : AccountAdditionalInfoDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSideMenuItemDto[] newArray(int i) {
            return new AccountSideMenuItemDto[i];
        }
    }

    public AccountSideMenuItemDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSideMenuItemDto)) {
            return false;
        }
        AccountSideMenuItemDto accountSideMenuItemDto = (AccountSideMenuItemDto) obj;
        return this.icon == accountSideMenuItemDto.icon && epx.f(this.id, accountSideMenuItemDto.id) && epx.f(this.title, accountSideMenuItemDto.title) && epx.f(this.action, accountSideMenuItemDto.action) && epx.f(this.additionalInfo, accountSideMenuItemDto.additionalInfo);
    }

    public final int hashCode() {
        AccountNavigationMenuItemIconDto accountNavigationMenuItemIconDto = this.icon;
        int hashCode = (accountNavigationMenuItemIconDto == null ? 0 : accountNavigationMenuItemIconDto.hashCode()) * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        int hashCode4 = (hashCode3 + (baseLinkButtonActionDto == null ? 0 : baseLinkButtonActionDto.hashCode())) * 31;
        AccountAdditionalInfoDto accountAdditionalInfoDto = this.additionalInfo;
        return hashCode4 + (accountAdditionalInfoDto != null ? accountAdditionalInfoDto.hashCode() : 0);
    }

    public final String toString() {
        return "AccountSideMenuItemDto(icon=" + this.icon + ", id=" + this.id + ", title=" + this.title + ", action=" + this.action + ", additionalInfo=" + this.additionalInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AccountNavigationMenuItemIconDto accountNavigationMenuItemIconDto = this.icon;
        if (accountNavigationMenuItemIconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountNavigationMenuItemIconDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.action, i);
        AccountAdditionalInfoDto accountAdditionalInfoDto = this.additionalInfo;
        if (accountAdditionalInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountAdditionalInfoDto.writeToParcel(parcel, i);
        }
    }

    public AccountSideMenuItemDto(AccountNavigationMenuItemIconDto accountNavigationMenuItemIconDto, String str, String str2, BaseLinkButtonActionDto baseLinkButtonActionDto, AccountAdditionalInfoDto accountAdditionalInfoDto) {
        this.icon = accountNavigationMenuItemIconDto;
        this.id = str;
        this.title = str2;
        this.action = baseLinkButtonActionDto;
        this.additionalInfo = accountAdditionalInfoDto;
    }

    public /* synthetic */ AccountSideMenuItemDto(AccountNavigationMenuItemIconDto accountNavigationMenuItemIconDto, String str, String str2, BaseLinkButtonActionDto baseLinkButtonActionDto, AccountAdditionalInfoDto accountAdditionalInfoDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : accountNavigationMenuItemIconDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : baseLinkButtonActionDto, (i & 16) != 0 ? null : accountAdditionalInfoDto);
    }
}
