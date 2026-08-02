package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSetGroupSettingsAudiosAddAllowedDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSetGroupSettingsAudiosAddAllowedDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSetGroupSettingsAudiosAddAllowedDto[] $VALUES;

    @pmi0("admins_and_editors")
    public static final GroupsSetGroupSettingsAudiosAddAllowedDto ADMINS_AND_EDITORS;
    public static final Parcelable.Creator<GroupsSetGroupSettingsAudiosAddAllowedDto> CREATOR;

    @pmi0("members")
    public static final GroupsSetGroupSettingsAudiosAddAllowedDto MEMBERS;
    private final String value;

    /* compiled from: GroupsSetGroupSettingsAudiosAddAllowedDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSetGroupSettingsAudiosAddAllowedDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsAudiosAddAllowedDto createFromParcel(Parcel parcel) {
            return GroupsSetGroupSettingsAudiosAddAllowedDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsAudiosAddAllowedDto[] newArray(int i) {
            return new GroupsSetGroupSettingsAudiosAddAllowedDto[i];
        }
    }

    static {
        GroupsSetGroupSettingsAudiosAddAllowedDto groupsSetGroupSettingsAudiosAddAllowedDto = new GroupsSetGroupSettingsAudiosAddAllowedDto("ADMINS_AND_EDITORS", 0, "admins_and_editors");
        ADMINS_AND_EDITORS = groupsSetGroupSettingsAudiosAddAllowedDto;
        GroupsSetGroupSettingsAudiosAddAllowedDto groupsSetGroupSettingsAudiosAddAllowedDto2 = new GroupsSetGroupSettingsAudiosAddAllowedDto("MEMBERS", 1, "members");
        MEMBERS = groupsSetGroupSettingsAudiosAddAllowedDto2;
        GroupsSetGroupSettingsAudiosAddAllowedDto[] groupsSetGroupSettingsAudiosAddAllowedDtoArr = {groupsSetGroupSettingsAudiosAddAllowedDto, groupsSetGroupSettingsAudiosAddAllowedDto2};
        $VALUES = groupsSetGroupSettingsAudiosAddAllowedDtoArr;
        $ENTRIES = new asp(groupsSetGroupSettingsAudiosAddAllowedDtoArr);
        CREATOR = new a();
    }

    private GroupsSetGroupSettingsAudiosAddAllowedDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsSetGroupSettingsAudiosAddAllowedDto valueOf(String str) {
        return (GroupsSetGroupSettingsAudiosAddAllowedDto) Enum.valueOf(GroupsSetGroupSettingsAudiosAddAllowedDto.class, str);
    }

    public static GroupsSetGroupSettingsAudiosAddAllowedDto[] values() {
        return (GroupsSetGroupSettingsAudiosAddAllowedDto[]) $VALUES.clone();
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
