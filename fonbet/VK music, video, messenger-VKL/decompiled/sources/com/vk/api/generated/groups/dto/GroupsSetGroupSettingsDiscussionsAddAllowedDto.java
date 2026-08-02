package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSetGroupSettingsDiscussionsAddAllowedDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSetGroupSettingsDiscussionsAddAllowedDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSetGroupSettingsDiscussionsAddAllowedDto[] $VALUES;

    @pmi0("admins_and_editors")
    public static final GroupsSetGroupSettingsDiscussionsAddAllowedDto ADMINS_AND_EDITORS;
    public static final Parcelable.Creator<GroupsSetGroupSettingsDiscussionsAddAllowedDto> CREATOR;

    @pmi0("members")
    public static final GroupsSetGroupSettingsDiscussionsAddAllowedDto MEMBERS;
    private final String value;

    /* compiled from: GroupsSetGroupSettingsDiscussionsAddAllowedDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSetGroupSettingsDiscussionsAddAllowedDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsDiscussionsAddAllowedDto createFromParcel(Parcel parcel) {
            return GroupsSetGroupSettingsDiscussionsAddAllowedDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsDiscussionsAddAllowedDto[] newArray(int i) {
            return new GroupsSetGroupSettingsDiscussionsAddAllowedDto[i];
        }
    }

    static {
        GroupsSetGroupSettingsDiscussionsAddAllowedDto groupsSetGroupSettingsDiscussionsAddAllowedDto = new GroupsSetGroupSettingsDiscussionsAddAllowedDto("ADMINS_AND_EDITORS", 0, "admins_and_editors");
        ADMINS_AND_EDITORS = groupsSetGroupSettingsDiscussionsAddAllowedDto;
        GroupsSetGroupSettingsDiscussionsAddAllowedDto groupsSetGroupSettingsDiscussionsAddAllowedDto2 = new GroupsSetGroupSettingsDiscussionsAddAllowedDto("MEMBERS", 1, "members");
        MEMBERS = groupsSetGroupSettingsDiscussionsAddAllowedDto2;
        GroupsSetGroupSettingsDiscussionsAddAllowedDto[] groupsSetGroupSettingsDiscussionsAddAllowedDtoArr = {groupsSetGroupSettingsDiscussionsAddAllowedDto, groupsSetGroupSettingsDiscussionsAddAllowedDto2};
        $VALUES = groupsSetGroupSettingsDiscussionsAddAllowedDtoArr;
        $ENTRIES = new asp(groupsSetGroupSettingsDiscussionsAddAllowedDtoArr);
        CREATOR = new a();
    }

    private GroupsSetGroupSettingsDiscussionsAddAllowedDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsSetGroupSettingsDiscussionsAddAllowedDto valueOf(String str) {
        return (GroupsSetGroupSettingsDiscussionsAddAllowedDto) Enum.valueOf(GroupsSetGroupSettingsDiscussionsAddAllowedDto.class, str);
    }

    public static GroupsSetGroupSettingsDiscussionsAddAllowedDto[] values() {
        return (GroupsSetGroupSettingsDiscussionsAddAllowedDto[]) $VALUES.clone();
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
