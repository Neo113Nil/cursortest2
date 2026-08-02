package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGetBusinessCommunitySettingsResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetBusinessCommunitySettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetBusinessCommunitySettingsResponseDto> CREATOR = new a();

    @pmi0("create_modal_info")
    private final GroupsCreateModalInfoDto createModalInfo;

    @pmi0("settings")
    private final GroupsBusinessCommunitySettingsDto settings;

    /* compiled from: GroupsGetBusinessCommunitySettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetBusinessCommunitySettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetBusinessCommunitySettingsResponseDto createFromParcel(Parcel parcel) {
            return new GroupsGetBusinessCommunitySettingsResponseDto(parcel.readInt() == 0 ? null : GroupsCreateModalInfoDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GroupsBusinessCommunitySettingsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetBusinessCommunitySettingsResponseDto[] newArray(int i) {
            return new GroupsGetBusinessCommunitySettingsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsGetBusinessCommunitySettingsResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetBusinessCommunitySettingsResponseDto)) {
            return false;
        }
        GroupsGetBusinessCommunitySettingsResponseDto groupsGetBusinessCommunitySettingsResponseDto = (GroupsGetBusinessCommunitySettingsResponseDto) obj;
        return epx.f(this.createModalInfo, groupsGetBusinessCommunitySettingsResponseDto.createModalInfo) && epx.f(this.settings, groupsGetBusinessCommunitySettingsResponseDto.settings);
    }

    public final int hashCode() {
        GroupsCreateModalInfoDto groupsCreateModalInfoDto = this.createModalInfo;
        int hashCode = (groupsCreateModalInfoDto == null ? 0 : groupsCreateModalInfoDto.hashCode()) * 31;
        GroupsBusinessCommunitySettingsDto groupsBusinessCommunitySettingsDto = this.settings;
        return hashCode + (groupsBusinessCommunitySettingsDto != null ? groupsBusinessCommunitySettingsDto.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsGetBusinessCommunitySettingsResponseDto(createModalInfo=" + this.createModalInfo + ", settings=" + this.settings + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GroupsCreateModalInfoDto groupsCreateModalInfoDto = this.createModalInfo;
        if (groupsCreateModalInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsCreateModalInfoDto.writeToParcel(parcel, i);
        }
        GroupsBusinessCommunitySettingsDto groupsBusinessCommunitySettingsDto = this.settings;
        if (groupsBusinessCommunitySettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsBusinessCommunitySettingsDto.writeToParcel(parcel, i);
        }
    }

    public GroupsGetBusinessCommunitySettingsResponseDto(GroupsCreateModalInfoDto groupsCreateModalInfoDto, GroupsBusinessCommunitySettingsDto groupsBusinessCommunitySettingsDto) {
        this.createModalInfo = groupsCreateModalInfoDto;
        this.settings = groupsBusinessCommunitySettingsDto;
    }

    public /* synthetic */ GroupsGetBusinessCommunitySettingsResponseDto(GroupsCreateModalInfoDto groupsCreateModalInfoDto, GroupsBusinessCommunitySettingsDto groupsBusinessCommunitySettingsDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : groupsCreateModalInfoDto, (i & 2) != 0 ? null : groupsBusinessCommunitySettingsDto);
    }
}
