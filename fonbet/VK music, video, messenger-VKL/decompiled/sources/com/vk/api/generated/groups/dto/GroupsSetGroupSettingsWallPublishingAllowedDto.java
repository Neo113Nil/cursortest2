package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSetGroupSettingsWallPublishingAllowedDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSetGroupSettingsWallPublishingAllowedDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSetGroupSettingsWallPublishingAllowedDto[] $VALUES;

    @pmi0("admins_and_editors")
    public static final GroupsSetGroupSettingsWallPublishingAllowedDto ADMINS_AND_EDITORS;
    public static final Parcelable.Creator<GroupsSetGroupSettingsWallPublishingAllowedDto> CREATOR;

    @pmi0("everyone")
    public static final GroupsSetGroupSettingsWallPublishingAllowedDto EVERYONE;
    private final String value;

    /* compiled from: GroupsSetGroupSettingsWallPublishingAllowedDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSetGroupSettingsWallPublishingAllowedDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsWallPublishingAllowedDto createFromParcel(Parcel parcel) {
            return GroupsSetGroupSettingsWallPublishingAllowedDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsWallPublishingAllowedDto[] newArray(int i) {
            return new GroupsSetGroupSettingsWallPublishingAllowedDto[i];
        }
    }

    static {
        GroupsSetGroupSettingsWallPublishingAllowedDto groupsSetGroupSettingsWallPublishingAllowedDto = new GroupsSetGroupSettingsWallPublishingAllowedDto("ADMINS_AND_EDITORS", 0, "admins_and_editors");
        ADMINS_AND_EDITORS = groupsSetGroupSettingsWallPublishingAllowedDto;
        GroupsSetGroupSettingsWallPublishingAllowedDto groupsSetGroupSettingsWallPublishingAllowedDto2 = new GroupsSetGroupSettingsWallPublishingAllowedDto("EVERYONE", 1, "everyone");
        EVERYONE = groupsSetGroupSettingsWallPublishingAllowedDto2;
        GroupsSetGroupSettingsWallPublishingAllowedDto[] groupsSetGroupSettingsWallPublishingAllowedDtoArr = {groupsSetGroupSettingsWallPublishingAllowedDto, groupsSetGroupSettingsWallPublishingAllowedDto2};
        $VALUES = groupsSetGroupSettingsWallPublishingAllowedDtoArr;
        $ENTRIES = new asp(groupsSetGroupSettingsWallPublishingAllowedDtoArr);
        CREATOR = new a();
    }

    private GroupsSetGroupSettingsWallPublishingAllowedDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsSetGroupSettingsWallPublishingAllowedDto valueOf(String str) {
        return (GroupsSetGroupSettingsWallPublishingAllowedDto) Enum.valueOf(GroupsSetGroupSettingsWallPublishingAllowedDto.class, str);
    }

    public static GroupsSetGroupSettingsWallPublishingAllowedDto[] values() {
        return (GroupsSetGroupSettingsWallPublishingAllowedDto[]) $VALUES.clone();
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
