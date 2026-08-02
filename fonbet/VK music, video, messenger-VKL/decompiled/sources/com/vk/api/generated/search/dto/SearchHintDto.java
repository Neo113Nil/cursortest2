package com.vk.api.generated.search.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseLinkDto;
import com.vk.api.generated.groups.dto.GroupsGroupDto;
import com.vk.api.generated.users.dto.UsersUserMinDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SearchHintDto.kt */
/* loaded from: classes15.dex */
public final class SearchHintDto implements Parcelable {
    public static final Parcelable.Creator<SearchHintDto> CREATOR = new a();

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AppsAppDto f81app;

    @pmi0("description")
    private final String description;

    @pmi0("global")
    private final BaseBoolIntDto global;

    @pmi0("group")
    private final GroupsGroupDto group;

    @pmi0("link")
    private final BaseLinkDto link;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final UsersUserMinDto profile;

    @pmi0("section")
    private final SearchHintSectionDto section;

    @pmi0("type")
    private final SearchHintTypeDto type;

    /* compiled from: SearchHintDto.kt */
    public static final class a implements Parcelable.Creator<SearchHintDto> {
        @Override // android.os.Parcelable.Creator
        public final SearchHintDto createFromParcel(Parcel parcel) {
            return new SearchHintDto(parcel.readString(), SearchHintTypeDto.CREATOR.createFromParcel(parcel), (AppsAppDto) parcel.readParcelable(SearchHintDto.class.getClassLoader()), (BaseBoolIntDto) parcel.readParcelable(SearchHintDto.class.getClassLoader()), parcel.readInt() == 0 ? null : GroupsGroupDto.CREATOR.createFromParcel(parcel), (UsersUserMinDto) parcel.readParcelable(SearchHintDto.class.getClassLoader()), parcel.readInt() != 0 ? SearchHintSectionDto.CREATOR.createFromParcel(parcel) : null, (BaseLinkDto) parcel.readParcelable(SearchHintDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchHintDto[] newArray(int i) {
            return new SearchHintDto[i];
        }
    }

    public SearchHintDto(String str, SearchHintTypeDto searchHintTypeDto, AppsAppDto appsAppDto, BaseBoolIntDto baseBoolIntDto, GroupsGroupDto groupsGroupDto, UsersUserMinDto usersUserMinDto, SearchHintSectionDto searchHintSectionDto, BaseLinkDto baseLinkDto) {
        this.description = str;
        this.type = searchHintTypeDto;
        this.f81app = appsAppDto;
        this.global = baseBoolIntDto;
        this.group = groupsGroupDto;
        this.profile = usersUserMinDto;
        this.section = searchHintSectionDto;
        this.link = baseLinkDto;
    }

    public final AppsAppDto d() {
        return this.f81app;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchHintDto)) {
            return false;
        }
        SearchHintDto searchHintDto = (SearchHintDto) obj;
        return epx.f(this.description, searchHintDto.description) && this.type == searchHintDto.type && epx.f(this.f81app, searchHintDto.f81app) && this.global == searchHintDto.global && epx.f(this.group, searchHintDto.group) && epx.f(this.profile, searchHintDto.profile) && this.section == searchHintDto.section && epx.f(this.link, searchHintDto.link);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + (this.description.hashCode() * 31)) * 31;
        AppsAppDto appsAppDto = this.f81app;
        int hashCode2 = (hashCode + (appsAppDto == null ? 0 : appsAppDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.global;
        int hashCode3 = (hashCode2 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        GroupsGroupDto groupsGroupDto = this.group;
        int hashCode4 = (hashCode3 + (groupsGroupDto == null ? 0 : groupsGroupDto.hashCode())) * 31;
        UsersUserMinDto usersUserMinDto = this.profile;
        int hashCode5 = (hashCode4 + (usersUserMinDto == null ? 0 : usersUserMinDto.hashCode())) * 31;
        SearchHintSectionDto searchHintSectionDto = this.section;
        int hashCode6 = (hashCode5 + (searchHintSectionDto == null ? 0 : searchHintSectionDto.hashCode())) * 31;
        BaseLinkDto baseLinkDto = this.link;
        return hashCode6 + (baseLinkDto != null ? baseLinkDto.hashCode() : 0);
    }

    public final String toString() {
        return "SearchHintDto(description=" + this.description + ", type=" + this.type + ", app=" + this.f81app + ", global=" + this.global + ", group=" + this.group + ", profile=" + this.profile + ", section=" + this.section + ", link=" + this.link + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.description);
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f81app, i);
        parcel.writeParcelable(this.global, i);
        GroupsGroupDto groupsGroupDto = this.group;
        if (groupsGroupDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.profile, i);
        SearchHintSectionDto searchHintSectionDto = this.section;
        if (searchHintSectionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchHintSectionDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.link, i);
    }

    public /* synthetic */ SearchHintDto(String str, SearchHintTypeDto searchHintTypeDto, AppsAppDto appsAppDto, BaseBoolIntDto baseBoolIntDto, GroupsGroupDto groupsGroupDto, UsersUserMinDto usersUserMinDto, SearchHintSectionDto searchHintSectionDto, BaseLinkDto baseLinkDto, int i, zcl zclVar) {
        this(str, searchHintTypeDto, (i & 4) != 0 ? null : appsAppDto, (i & 8) != 0 ? null : baseBoolIntDto, (i & 16) != 0 ? null : groupsGroupDto, (i & 32) != 0 ? null : usersUserMinDto, (i & 64) != 0 ? null : searchHintSectionDto, (i & 128) != 0 ? null : baseLinkDto);
    }
}
