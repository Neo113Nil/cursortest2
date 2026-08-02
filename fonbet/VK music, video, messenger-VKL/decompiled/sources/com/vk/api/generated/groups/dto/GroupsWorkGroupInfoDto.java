package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsWorkGroupInfoDto.kt */
/* loaded from: classes14.dex */
public final class GroupsWorkGroupInfoDto implements Parcelable {
    public static final Parcelable.Creator<GroupsWorkGroupInfoDto> CREATOR = new a();

    @pmi0("details")
    private final GroupsWorkGroupInfoDetailsDto details;

    @pmi0("icon_name")
    private final String iconName;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsWorkGroupInfoDto.kt */
    public static final class a implements Parcelable.Creator<GroupsWorkGroupInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsWorkGroupInfoDto createFromParcel(Parcel parcel) {
            return new GroupsWorkGroupInfoDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : GroupsWorkGroupInfoDetailsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsWorkGroupInfoDto[] newArray(int i) {
            return new GroupsWorkGroupInfoDto[i];
        }
    }

    public GroupsWorkGroupInfoDto(String str, String str2, GroupsWorkGroupInfoDetailsDto groupsWorkGroupInfoDetailsDto) {
        this.title = str;
        this.iconName = str2;
        this.details = groupsWorkGroupInfoDetailsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsWorkGroupInfoDto)) {
            return false;
        }
        GroupsWorkGroupInfoDto groupsWorkGroupInfoDto = (GroupsWorkGroupInfoDto) obj;
        return epx.f(this.title, groupsWorkGroupInfoDto.title) && epx.f(this.iconName, groupsWorkGroupInfoDto.iconName) && epx.f(this.details, groupsWorkGroupInfoDto.details);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.iconName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        GroupsWorkGroupInfoDetailsDto groupsWorkGroupInfoDetailsDto = this.details;
        return hashCode2 + (groupsWorkGroupInfoDetailsDto != null ? groupsWorkGroupInfoDetailsDto.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsWorkGroupInfoDto(title=" + this.title + ", iconName=" + this.iconName + ", details=" + this.details + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.iconName);
        GroupsWorkGroupInfoDetailsDto groupsWorkGroupInfoDetailsDto = this.details;
        if (groupsWorkGroupInfoDetailsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsWorkGroupInfoDetailsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsWorkGroupInfoDto(String str, String str2, GroupsWorkGroupInfoDetailsDto groupsWorkGroupInfoDetailsDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : groupsWorkGroupInfoDetailsDto);
    }
}
