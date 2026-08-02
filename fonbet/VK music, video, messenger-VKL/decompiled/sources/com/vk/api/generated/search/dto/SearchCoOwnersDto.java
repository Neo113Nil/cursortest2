package com.vk.api.generated.search.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.generated.base.dto.BaseLinkDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SearchCoOwnersDto.kt */
/* loaded from: classes15.dex */
public final class SearchCoOwnersDto implements Parcelable {
    public static final Parcelable.Creator<SearchCoOwnersDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("group")
    private final SearchGroupExtendedDto group;

    @pmi0("link")
    private final BaseLinkDto link;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final SearchProfileExtendedDto profile;

    @pmi0("type")
    private final SearchCoOwnersTypeDto type;

    /* compiled from: SearchCoOwnersDto.kt */
    public static final class a implements Parcelable.Creator<SearchCoOwnersDto> {
        @Override // android.os.Parcelable.Creator
        public final SearchCoOwnersDto createFromParcel(Parcel parcel) {
            return new SearchCoOwnersDto(parcel.readString(), SearchCoOwnersTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SearchGroupExtendedDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SearchProfileExtendedDto.CREATOR.createFromParcel(parcel) : null, (BaseLinkDto) parcel.readParcelable(SearchCoOwnersDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchCoOwnersDto[] newArray(int i) {
            return new SearchCoOwnersDto[i];
        }
    }

    public SearchCoOwnersDto(String str, SearchCoOwnersTypeDto searchCoOwnersTypeDto, SearchGroupExtendedDto searchGroupExtendedDto, SearchProfileExtendedDto searchProfileExtendedDto, BaseLinkDto baseLinkDto) {
        this.description = str;
        this.type = searchCoOwnersTypeDto;
        this.group = searchGroupExtendedDto;
        this.profile = searchProfileExtendedDto;
        this.link = baseLinkDto;
    }

    public final SearchGroupExtendedDto d() {
        return this.group;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final SearchProfileExtendedDto e() {
        return this.profile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchCoOwnersDto)) {
            return false;
        }
        SearchCoOwnersDto searchCoOwnersDto = (SearchCoOwnersDto) obj;
        return epx.f(this.description, searchCoOwnersDto.description) && this.type == searchCoOwnersDto.type && epx.f(this.group, searchCoOwnersDto.group) && epx.f(this.profile, searchCoOwnersDto.profile) && epx.f(this.link, searchCoOwnersDto.link);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + (this.description.hashCode() * 31)) * 31;
        SearchGroupExtendedDto searchGroupExtendedDto = this.group;
        int hashCode2 = (hashCode + (searchGroupExtendedDto == null ? 0 : searchGroupExtendedDto.hashCode())) * 31;
        SearchProfileExtendedDto searchProfileExtendedDto = this.profile;
        int hashCode3 = (hashCode2 + (searchProfileExtendedDto == null ? 0 : searchProfileExtendedDto.hashCode())) * 31;
        BaseLinkDto baseLinkDto = this.link;
        return hashCode3 + (baseLinkDto != null ? baseLinkDto.hashCode() : 0);
    }

    public final String toString() {
        return "SearchCoOwnersDto(description=" + this.description + ", type=" + this.type + ", group=" + this.group + ", profile=" + this.profile + ", link=" + this.link + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.description);
        this.type.writeToParcel(parcel, i);
        SearchGroupExtendedDto searchGroupExtendedDto = this.group;
        if (searchGroupExtendedDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchGroupExtendedDto.writeToParcel(parcel, i);
        }
        SearchProfileExtendedDto searchProfileExtendedDto = this.profile;
        if (searchProfileExtendedDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchProfileExtendedDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.link, i);
    }

    public /* synthetic */ SearchCoOwnersDto(String str, SearchCoOwnersTypeDto searchCoOwnersTypeDto, SearchGroupExtendedDto searchGroupExtendedDto, SearchProfileExtendedDto searchProfileExtendedDto, BaseLinkDto baseLinkDto, int i, zcl zclVar) {
        this(str, searchCoOwnersTypeDto, (i & 4) != 0 ? null : searchGroupExtendedDto, (i & 8) != 0 ? null : searchProfileExtendedDto, (i & 16) != 0 ? null : baseLinkDto);
    }
}
