package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.privacy.dto.PrivacyCategoryDto;
import com.vk.api.generated.privacy.dto.PrivacyListsDto;
import com.vk.api.generated.privacy.dto.PrivacyOwnersDto;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: BasePrivacyDto.kt */
/* loaded from: classes14.dex */
public final class BasePrivacyDto implements Parcelable {
    public static final Parcelable.Creator<BasePrivacyDto> CREATOR = new a();

    @pmi0("category")
    private final PrivacyCategoryDto category;

    @pmi0("excluded_category")
    private final PrivacyCategoryDto excludedCategory;

    @pmi0("is_enabled")
    private final Boolean isEnabled;

    @pmi0("lists")
    private final PrivacyListsDto lists;

    @pmi0("owners")
    private final PrivacyOwnersDto owners;

    /* compiled from: BasePrivacyDto.kt */
    public static final class a implements Parcelable.Creator<BasePrivacyDto> {
        @Override // android.os.Parcelable.Creator
        public final BasePrivacyDto createFromParcel(Parcel parcel) {
            Boolean bool = null;
            PrivacyCategoryDto createFromParcel = parcel.readInt() == 0 ? null : PrivacyCategoryDto.CREATOR.createFromParcel(parcel);
            PrivacyCategoryDto createFromParcel2 = parcel.readInt() == 0 ? null : PrivacyCategoryDto.CREATOR.createFromParcel(parcel);
            PrivacyListsDto createFromParcel3 = parcel.readInt() == 0 ? null : PrivacyListsDto.CREATOR.createFromParcel(parcel);
            PrivacyOwnersDto createFromParcel4 = parcel.readInt() == 0 ? null : PrivacyOwnersDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BasePrivacyDto(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final BasePrivacyDto[] newArray(int i) {
            return new BasePrivacyDto[i];
        }
    }

    public BasePrivacyDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final PrivacyCategoryDto d() {
        return this.category;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final PrivacyCategoryDto e() {
        return this.excludedCategory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasePrivacyDto)) {
            return false;
        }
        BasePrivacyDto basePrivacyDto = (BasePrivacyDto) obj;
        return this.category == basePrivacyDto.category && this.excludedCategory == basePrivacyDto.excludedCategory && epx.f(this.lists, basePrivacyDto.lists) && epx.f(this.owners, basePrivacyDto.owners) && epx.f(this.isEnabled, basePrivacyDto.isEnabled);
    }

    public final PrivacyListsDto f() {
        return this.lists;
    }

    public final PrivacyOwnersDto g() {
        return this.owners;
    }

    public final int hashCode() {
        PrivacyCategoryDto privacyCategoryDto = this.category;
        int hashCode = (privacyCategoryDto == null ? 0 : privacyCategoryDto.hashCode()) * 31;
        PrivacyCategoryDto privacyCategoryDto2 = this.excludedCategory;
        int hashCode2 = (hashCode + (privacyCategoryDto2 == null ? 0 : privacyCategoryDto2.hashCode())) * 31;
        PrivacyListsDto privacyListsDto = this.lists;
        int hashCode3 = (hashCode2 + (privacyListsDto == null ? 0 : privacyListsDto.hashCode())) * 31;
        PrivacyOwnersDto privacyOwnersDto = this.owners;
        int hashCode4 = (hashCode3 + (privacyOwnersDto == null ? 0 : privacyOwnersDto.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BasePrivacyDto(category=");
        sb.append(this.category);
        sb.append(", excludedCategory=");
        sb.append(this.excludedCategory);
        sb.append(", lists=");
        sb.append(this.lists);
        sb.append(", owners=");
        sb.append(this.owners);
        sb.append(", isEnabled=");
        return tn.a(sb, this.isEnabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PrivacyCategoryDto privacyCategoryDto = this.category;
        if (privacyCategoryDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            privacyCategoryDto.writeToParcel(parcel, i);
        }
        PrivacyCategoryDto privacyCategoryDto2 = this.excludedCategory;
        if (privacyCategoryDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            privacyCategoryDto2.writeToParcel(parcel, i);
        }
        PrivacyListsDto privacyListsDto = this.lists;
        if (privacyListsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            privacyListsDto.writeToParcel(parcel, i);
        }
        PrivacyOwnersDto privacyOwnersDto = this.owners;
        if (privacyOwnersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            privacyOwnersDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public BasePrivacyDto(PrivacyCategoryDto privacyCategoryDto, PrivacyCategoryDto privacyCategoryDto2, PrivacyListsDto privacyListsDto, PrivacyOwnersDto privacyOwnersDto, Boolean bool) {
        this.category = privacyCategoryDto;
        this.excludedCategory = privacyCategoryDto2;
        this.lists = privacyListsDto;
        this.owners = privacyOwnersDto;
        this.isEnabled = bool;
    }

    public /* synthetic */ BasePrivacyDto(PrivacyCategoryDto privacyCategoryDto, PrivacyCategoryDto privacyCategoryDto2, PrivacyListsDto privacyListsDto, PrivacyOwnersDto privacyOwnersDto, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : privacyCategoryDto, (i & 2) != 0 ? null : privacyCategoryDto2, (i & 4) != 0 ? null : privacyListsDto, (i & 8) != 0 ? null : privacyOwnersDto, (i & 16) != 0 ? null : bool);
    }
}
