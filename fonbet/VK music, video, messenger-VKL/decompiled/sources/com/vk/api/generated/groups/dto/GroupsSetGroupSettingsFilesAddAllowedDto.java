package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSetGroupSettingsFilesAddAllowedDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSetGroupSettingsFilesAddAllowedDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSetGroupSettingsFilesAddAllowedDto[] $VALUES;

    @pmi0("admins_and_editors")
    public static final GroupsSetGroupSettingsFilesAddAllowedDto ADMINS_AND_EDITORS;
    public static final Parcelable.Creator<GroupsSetGroupSettingsFilesAddAllowedDto> CREATOR;

    @pmi0("members")
    public static final GroupsSetGroupSettingsFilesAddAllowedDto MEMBERS;
    private final String value;

    /* compiled from: GroupsSetGroupSettingsFilesAddAllowedDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSetGroupSettingsFilesAddAllowedDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsFilesAddAllowedDto createFromParcel(Parcel parcel) {
            return GroupsSetGroupSettingsFilesAddAllowedDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsFilesAddAllowedDto[] newArray(int i) {
            return new GroupsSetGroupSettingsFilesAddAllowedDto[i];
        }
    }

    static {
        GroupsSetGroupSettingsFilesAddAllowedDto groupsSetGroupSettingsFilesAddAllowedDto = new GroupsSetGroupSettingsFilesAddAllowedDto("ADMINS_AND_EDITORS", 0, "admins_and_editors");
        ADMINS_AND_EDITORS = groupsSetGroupSettingsFilesAddAllowedDto;
        GroupsSetGroupSettingsFilesAddAllowedDto groupsSetGroupSettingsFilesAddAllowedDto2 = new GroupsSetGroupSettingsFilesAddAllowedDto("MEMBERS", 1, "members");
        MEMBERS = groupsSetGroupSettingsFilesAddAllowedDto2;
        GroupsSetGroupSettingsFilesAddAllowedDto[] groupsSetGroupSettingsFilesAddAllowedDtoArr = {groupsSetGroupSettingsFilesAddAllowedDto, groupsSetGroupSettingsFilesAddAllowedDto2};
        $VALUES = groupsSetGroupSettingsFilesAddAllowedDtoArr;
        $ENTRIES = new asp(groupsSetGroupSettingsFilesAddAllowedDtoArr);
        CREATOR = new a();
    }

    private GroupsSetGroupSettingsFilesAddAllowedDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsSetGroupSettingsFilesAddAllowedDto valueOf(String str) {
        return (GroupsSetGroupSettingsFilesAddAllowedDto) Enum.valueOf(GroupsSetGroupSettingsFilesAddAllowedDto.class, str);
    }

    public static GroupsSetGroupSettingsFilesAddAllowedDto[] values() {
        return (GroupsSetGroupSettingsFilesAddAllowedDto[]) $VALUES.clone();
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
