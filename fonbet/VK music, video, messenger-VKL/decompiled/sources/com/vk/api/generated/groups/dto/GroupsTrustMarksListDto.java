package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsTrustMarksListDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTrustMarksListDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTrustMarksListDto> CREATOR = new a();

    @pmi0("action_buttons")
    private final GroupsActionButtonsDto actionButtons;

    @pmi0("admin_buttons")
    private final GroupsTrustMarksAdminButtonsUrlDto adminButtons;

    @pmi0("links")
    private final GroupsTrustMarksLinksDto links;

    @pmi0("main_mark")
    private final GroupsTrustMarksItemDto mainMark;

    @pmi0("marks")
    private final GroupsAllTrustMarksDto marks;

    @pmi0("phone")
    private final GroupsTrustMarksItemDto phone;

    /* compiled from: GroupsTrustMarksListDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTrustMarksListDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTrustMarksListDto createFromParcel(Parcel parcel) {
            return new GroupsTrustMarksListDto(parcel.readInt() == 0 ? null : GroupsTrustMarksAdminButtonsUrlDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsTrustMarksItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsActionButtonsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsTrustMarksItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsTrustMarksLinksDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GroupsAllTrustMarksDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTrustMarksListDto[] newArray(int i) {
            return new GroupsTrustMarksListDto[i];
        }
    }

    public GroupsTrustMarksListDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final GroupsActionButtonsDto d() {
        return this.actionButtons;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsTrustMarksAdminButtonsUrlDto e() {
        return this.adminButtons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsTrustMarksListDto)) {
            return false;
        }
        GroupsTrustMarksListDto groupsTrustMarksListDto = (GroupsTrustMarksListDto) obj;
        return epx.f(this.adminButtons, groupsTrustMarksListDto.adminButtons) && epx.f(this.mainMark, groupsTrustMarksListDto.mainMark) && epx.f(this.actionButtons, groupsTrustMarksListDto.actionButtons) && epx.f(this.phone, groupsTrustMarksListDto.phone) && epx.f(this.links, groupsTrustMarksListDto.links) && epx.f(this.marks, groupsTrustMarksListDto.marks);
    }

    public final GroupsTrustMarksItemDto f() {
        return this.mainMark;
    }

    public final GroupsAllTrustMarksDto g() {
        return this.marks;
    }

    public final int hashCode() {
        GroupsTrustMarksAdminButtonsUrlDto groupsTrustMarksAdminButtonsUrlDto = this.adminButtons;
        int hashCode = (groupsTrustMarksAdminButtonsUrlDto == null ? 0 : groupsTrustMarksAdminButtonsUrlDto.hashCode()) * 31;
        GroupsTrustMarksItemDto groupsTrustMarksItemDto = this.mainMark;
        int hashCode2 = (hashCode + (groupsTrustMarksItemDto == null ? 0 : groupsTrustMarksItemDto.hashCode())) * 31;
        GroupsActionButtonsDto groupsActionButtonsDto = this.actionButtons;
        int hashCode3 = (hashCode2 + (groupsActionButtonsDto == null ? 0 : groupsActionButtonsDto.hashCode())) * 31;
        GroupsTrustMarksItemDto groupsTrustMarksItemDto2 = this.phone;
        int hashCode4 = (hashCode3 + (groupsTrustMarksItemDto2 == null ? 0 : groupsTrustMarksItemDto2.hashCode())) * 31;
        GroupsTrustMarksLinksDto groupsTrustMarksLinksDto = this.links;
        int hashCode5 = (hashCode4 + (groupsTrustMarksLinksDto == null ? 0 : groupsTrustMarksLinksDto.hashCode())) * 31;
        GroupsAllTrustMarksDto groupsAllTrustMarksDto = this.marks;
        return hashCode5 + (groupsAllTrustMarksDto != null ? groupsAllTrustMarksDto.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsTrustMarksListDto(adminButtons=" + this.adminButtons + ", mainMark=" + this.mainMark + ", actionButtons=" + this.actionButtons + ", phone=" + this.phone + ", links=" + this.links + ", marks=" + this.marks + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GroupsTrustMarksAdminButtonsUrlDto groupsTrustMarksAdminButtonsUrlDto = this.adminButtons;
        if (groupsTrustMarksAdminButtonsUrlDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTrustMarksAdminButtonsUrlDto.writeToParcel(parcel, i);
        }
        GroupsTrustMarksItemDto groupsTrustMarksItemDto = this.mainMark;
        if (groupsTrustMarksItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTrustMarksItemDto.writeToParcel(parcel, i);
        }
        GroupsActionButtonsDto groupsActionButtonsDto = this.actionButtons;
        if (groupsActionButtonsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsActionButtonsDto.writeToParcel(parcel, i);
        }
        GroupsTrustMarksItemDto groupsTrustMarksItemDto2 = this.phone;
        if (groupsTrustMarksItemDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTrustMarksItemDto2.writeToParcel(parcel, i);
        }
        GroupsTrustMarksLinksDto groupsTrustMarksLinksDto = this.links;
        if (groupsTrustMarksLinksDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTrustMarksLinksDto.writeToParcel(parcel, i);
        }
        GroupsAllTrustMarksDto groupsAllTrustMarksDto = this.marks;
        if (groupsAllTrustMarksDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsAllTrustMarksDto.writeToParcel(parcel, i);
        }
    }

    public GroupsTrustMarksListDto(GroupsTrustMarksAdminButtonsUrlDto groupsTrustMarksAdminButtonsUrlDto, GroupsTrustMarksItemDto groupsTrustMarksItemDto, GroupsActionButtonsDto groupsActionButtonsDto, GroupsTrustMarksItemDto groupsTrustMarksItemDto2, GroupsTrustMarksLinksDto groupsTrustMarksLinksDto, GroupsAllTrustMarksDto groupsAllTrustMarksDto) {
        this.adminButtons = groupsTrustMarksAdminButtonsUrlDto;
        this.mainMark = groupsTrustMarksItemDto;
        this.actionButtons = groupsActionButtonsDto;
        this.phone = groupsTrustMarksItemDto2;
        this.links = groupsTrustMarksLinksDto;
        this.marks = groupsAllTrustMarksDto;
    }

    public /* synthetic */ GroupsTrustMarksListDto(GroupsTrustMarksAdminButtonsUrlDto groupsTrustMarksAdminButtonsUrlDto, GroupsTrustMarksItemDto groupsTrustMarksItemDto, GroupsActionButtonsDto groupsActionButtonsDto, GroupsTrustMarksItemDto groupsTrustMarksItemDto2, GroupsTrustMarksLinksDto groupsTrustMarksLinksDto, GroupsAllTrustMarksDto groupsAllTrustMarksDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : groupsTrustMarksAdminButtonsUrlDto, (i & 2) != 0 ? null : groupsTrustMarksItemDto, (i & 4) != 0 ? null : groupsActionButtonsDto, (i & 8) != 0 ? null : groupsTrustMarksItemDto2, (i & 16) != 0 ? null : groupsTrustMarksLinksDto, (i & 32) != 0 ? null : groupsAllTrustMarksDto);
    }
}
