package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSetGroupSettingsVideosAddAllowedDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSetGroupSettingsVideosAddAllowedDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSetGroupSettingsVideosAddAllowedDto[] $VALUES;

    @pmi0("admins_and_editors")
    public static final GroupsSetGroupSettingsVideosAddAllowedDto ADMINS_AND_EDITORS;
    public static final Parcelable.Creator<GroupsSetGroupSettingsVideosAddAllowedDto> CREATOR;

    @pmi0("members")
    public static final GroupsSetGroupSettingsVideosAddAllowedDto MEMBERS;
    private final String value;

    /* compiled from: GroupsSetGroupSettingsVideosAddAllowedDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSetGroupSettingsVideosAddAllowedDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsVideosAddAllowedDto createFromParcel(Parcel parcel) {
            return GroupsSetGroupSettingsVideosAddAllowedDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsVideosAddAllowedDto[] newArray(int i) {
            return new GroupsSetGroupSettingsVideosAddAllowedDto[i];
        }
    }

    static {
        GroupsSetGroupSettingsVideosAddAllowedDto groupsSetGroupSettingsVideosAddAllowedDto = new GroupsSetGroupSettingsVideosAddAllowedDto("ADMINS_AND_EDITORS", 0, "admins_and_editors");
        ADMINS_AND_EDITORS = groupsSetGroupSettingsVideosAddAllowedDto;
        GroupsSetGroupSettingsVideosAddAllowedDto groupsSetGroupSettingsVideosAddAllowedDto2 = new GroupsSetGroupSettingsVideosAddAllowedDto("MEMBERS", 1, "members");
        MEMBERS = groupsSetGroupSettingsVideosAddAllowedDto2;
        GroupsSetGroupSettingsVideosAddAllowedDto[] groupsSetGroupSettingsVideosAddAllowedDtoArr = {groupsSetGroupSettingsVideosAddAllowedDto, groupsSetGroupSettingsVideosAddAllowedDto2};
        $VALUES = groupsSetGroupSettingsVideosAddAllowedDtoArr;
        $ENTRIES = new asp(groupsSetGroupSettingsVideosAddAllowedDtoArr);
        CREATOR = new a();
    }

    private GroupsSetGroupSettingsVideosAddAllowedDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsSetGroupSettingsVideosAddAllowedDto valueOf(String str) {
        return (GroupsSetGroupSettingsVideosAddAllowedDto) Enum.valueOf(GroupsSetGroupSettingsVideosAddAllowedDto.class, str);
    }

    public static GroupsSetGroupSettingsVideosAddAllowedDto[] values() {
        return (GroupsSetGroupSettingsVideosAddAllowedDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
