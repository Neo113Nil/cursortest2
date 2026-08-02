package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.privacy.dto.PrivacyCategoryDto;
import com.vk.api.generated.privacy.dto.PrivacyListsDto;
import com.vk.api.generated.privacy.dto.PrivacyListsOwnersDto;
import com.vk.api.generated.privacy.dto.PrivacyOwnersDto;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: AccountSetPrivacyResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountSetPrivacyResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountSetPrivacyResponseDto> CREATOR = new a();

    @pmi0("category")
    private final PrivacyCategoryDto category;

    @pmi0("excluded_category")
    private final PrivacyCategoryDto excludedCategory;

    @pmi0("is_enabled")
    private final Boolean isEnabled;

    @pmi0("lists")
    private final PrivacyListsDto lists;

    @pmi0("lists_categories")
    private final AccountPrivacySettingValueListCategoriesDto listsCategories;

    @pmi0("lists_owners")
    private final PrivacyListsOwnersDto listsOwners;

    @pmi0("owners")
    private final PrivacyOwnersDto owners;

    /* compiled from: AccountSetPrivacyResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountSetPrivacyResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSetPrivacyResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AccountSetPrivacyResponseDto(valueOf, (PrivacyCategoryDto) parcel.readParcelable(AccountSetPrivacyResponseDto.class.getClassLoader()), (PrivacyCategoryDto) parcel.readParcelable(AccountSetPrivacyResponseDto.class.getClassLoader()), (PrivacyOwnersDto) parcel.readParcelable(AccountSetPrivacyResponseDto.class.getClassLoader()), (PrivacyListsDto) parcel.readParcelable(AccountSetPrivacyResponseDto.class.getClassLoader()), parcel.readInt() != 0 ? PrivacyListsOwnersDto.CREATOR.createFromParcel(parcel) : null, (AccountPrivacySettingValueListCategoriesDto) parcel.readParcelable(AccountSetPrivacyResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSetPrivacyResponseDto[] newArray(int i) {
            return new AccountSetPrivacyResponseDto[i];
        }
    }

    public AccountSetPrivacyResponseDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final PrivacyOwnersDto d() {
        return this.owners;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSetPrivacyResponseDto)) {
            return false;
        }
        AccountSetPrivacyResponseDto accountSetPrivacyResponseDto = (AccountSetPrivacyResponseDto) obj;
        return epx.f(this.isEnabled, accountSetPrivacyResponseDto.isEnabled) && this.category == accountSetPrivacyResponseDto.category && this.excludedCategory == accountSetPrivacyResponseDto.excludedCategory && epx.f(this.owners, accountSetPrivacyResponseDto.owners) && epx.f(this.lists, accountSetPrivacyResponseDto.lists) && epx.f(this.listsOwners, accountSetPrivacyResponseDto.listsOwners) && epx.f(this.listsCategories, accountSetPrivacyResponseDto.listsCategories);
    }

    public final int hashCode() {
        Boolean bool = this.isEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        PrivacyCategoryDto privacyCategoryDto = this.category;
        int hashCode2 = (hashCode + (privacyCategoryDto == null ? 0 : privacyCategoryDto.hashCode())) * 31;
        PrivacyCategoryDto privacyCategoryDto2 = this.excludedCategory;
        int hashCode3 = (hashCode2 + (privacyCategoryDto2 == null ? 0 : privacyCategoryDto2.hashCode())) * 31;
        PrivacyOwnersDto privacyOwnersDto = this.owners;
        int hashCode4 = (hashCode3 + (privacyOwnersDto == null ? 0 : privacyOwnersDto.hashCode())) * 31;
        PrivacyListsDto privacyListsDto = this.lists;
        int hashCode5 = (hashCode4 + (privacyListsDto == null ? 0 : privacyListsDto.hashCode())) * 31;
        PrivacyListsOwnersDto privacyListsOwnersDto = this.listsOwners;
        int hashCode6 = (hashCode5 + (privacyListsOwnersDto == null ? 0 : privacyListsOwnersDto.hashCode())) * 31;
        AccountPrivacySettingValueListCategoriesDto accountPrivacySettingValueListCategoriesDto = this.listsCategories;
        return hashCode6 + (accountPrivacySettingValueListCategoriesDto != null ? accountPrivacySettingValueListCategoriesDto.hashCode() : 0);
    }

    public final String toString() {
        return "AccountSetPrivacyResponseDto(isEnabled=" + this.isEnabled + ", category=" + this.category + ", excludedCategory=" + this.excludedCategory + ", owners=" + this.owners + ", lists=" + this.lists + ", listsOwners=" + this.listsOwners + ", listsCategories=" + this.listsCategories + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.category, i);
        parcel.writeParcelable(this.excludedCategory, i);
        parcel.writeParcelable(this.owners, i);
        parcel.writeParcelable(this.lists, i);
        PrivacyListsOwnersDto privacyListsOwnersDto = this.listsOwners;
        if (privacyListsOwnersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            privacyListsOwnersDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.listsCategories, i);
    }

    public AccountSetPrivacyResponseDto(Boolean bool, PrivacyCategoryDto privacyCategoryDto, PrivacyCategoryDto privacyCategoryDto2, PrivacyOwnersDto privacyOwnersDto, PrivacyListsDto privacyListsDto, PrivacyListsOwnersDto privacyListsOwnersDto, AccountPrivacySettingValueListCategoriesDto accountPrivacySettingValueListCategoriesDto) {
        this.isEnabled = bool;
        this.category = privacyCategoryDto;
        this.excludedCategory = privacyCategoryDto2;
        this.owners = privacyOwnersDto;
        this.lists = privacyListsDto;
        this.listsOwners = privacyListsOwnersDto;
        this.listsCategories = accountPrivacySettingValueListCategoriesDto;
    }

    public /* synthetic */ AccountSetPrivacyResponseDto(Boolean bool, PrivacyCategoryDto privacyCategoryDto, PrivacyCategoryDto privacyCategoryDto2, PrivacyOwnersDto privacyOwnersDto, PrivacyListsDto privacyListsDto, PrivacyListsOwnersDto privacyListsOwnersDto, AccountPrivacySettingValueListCategoriesDto accountPrivacySettingValueListCategoriesDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : privacyCategoryDto, (i & 4) != 0 ? null : privacyCategoryDto2, (i & 8) != 0 ? null : privacyOwnersDto, (i & 16) != 0 ? null : privacyListsDto, (i & 32) != 0 ? null : privacyListsOwnersDto, (i & 64) != 0 ? null : accountPrivacySettingValueListCategoriesDto);
    }
}
