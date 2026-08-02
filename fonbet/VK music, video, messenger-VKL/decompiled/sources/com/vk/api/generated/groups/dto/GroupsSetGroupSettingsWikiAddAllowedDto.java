package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSetGroupSettingsWikiAddAllowedDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSetGroupSettingsWikiAddAllowedDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSetGroupSettingsWikiAddAllowedDto[] $VALUES;

    @pmi0("admins_and_editors")
    public static final GroupsSetGroupSettingsWikiAddAllowedDto ADMINS_AND_EDITORS;
    public static final Parcelable.Creator<GroupsSetGroupSettingsWikiAddAllowedDto> CREATOR;

    @pmi0("members")
    public static final GroupsSetGroupSettingsWikiAddAllowedDto MEMBERS;
    private final String value;

    /* compiled from: GroupsSetGroupSettingsWikiAddAllowedDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSetGroupSettingsWikiAddAllowedDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsWikiAddAllowedDto createFromParcel(Parcel parcel) {
            return GroupsSetGroupSettingsWikiAddAllowedDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsWikiAddAllowedDto[] newArray(int i) {
            return new GroupsSetGroupSettingsWikiAddAllowedDto[i];
        }
    }

    static {
        GroupsSetGroupSettingsWikiAddAllowedDto groupsSetGroupSettingsWikiAddAllowedDto = new GroupsSetGroupSettingsWikiAddAllowedDto("ADMINS_AND_EDITORS", 0, "admins_and_editors");
        ADMINS_AND_EDITORS = groupsSetGroupSettingsWikiAddAllowedDto;
        GroupsSetGroupSettingsWikiAddAllowedDto groupsSetGroupSettingsWikiAddAllowedDto2 = new GroupsSetGroupSettingsWikiAddAllowedDto("MEMBERS", 1, "members");
        MEMBERS = groupsSetGroupSettingsWikiAddAllowedDto2;
        GroupsSetGroupSettingsWikiAddAllowedDto[] groupsSetGroupSettingsWikiAddAllowedDtoArr = {groupsSetGroupSettingsWikiAddAllowedDto, groupsSetGroupSettingsWikiAddAllowedDto2};
        $VALUES = groupsSetGroupSettingsWikiAddAllowedDtoArr;
        $ENTRIES = new asp(groupsSetGroupSettingsWikiAddAllowedDtoArr);
        CREATOR = new a();
    }

    private GroupsSetGroupSettingsWikiAddAllowedDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsSetGroupSettingsWikiAddAllowedDto valueOf(String str) {
        return (GroupsSetGroupSettingsWikiAddAllowedDto) Enum.valueOf(GroupsSetGroupSettingsWikiAddAllowedDto.class, str);
    }

    public static GroupsSetGroupSettingsWikiAddAllowedDto[] values() {
        return (GroupsSetGroupSettingsWikiAddAllowedDto[]) $VALUES.clone();
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
