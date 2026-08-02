package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSetGroupSettingsPhotosAddAllowedDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSetGroupSettingsPhotosAddAllowedDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSetGroupSettingsPhotosAddAllowedDto[] $VALUES;

    @pmi0("admins_and_editors")
    public static final GroupsSetGroupSettingsPhotosAddAllowedDto ADMINS_AND_EDITORS;
    public static final Parcelable.Creator<GroupsSetGroupSettingsPhotosAddAllowedDto> CREATOR;

    @pmi0("members")
    public static final GroupsSetGroupSettingsPhotosAddAllowedDto MEMBERS;
    private final String value;

    /* compiled from: GroupsSetGroupSettingsPhotosAddAllowedDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSetGroupSettingsPhotosAddAllowedDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsPhotosAddAllowedDto createFromParcel(Parcel parcel) {
            return GroupsSetGroupSettingsPhotosAddAllowedDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsPhotosAddAllowedDto[] newArray(int i) {
            return new GroupsSetGroupSettingsPhotosAddAllowedDto[i];
        }
    }

    static {
        GroupsSetGroupSettingsPhotosAddAllowedDto groupsSetGroupSettingsPhotosAddAllowedDto = new GroupsSetGroupSettingsPhotosAddAllowedDto("ADMINS_AND_EDITORS", 0, "admins_and_editors");
        ADMINS_AND_EDITORS = groupsSetGroupSettingsPhotosAddAllowedDto;
        GroupsSetGroupSettingsPhotosAddAllowedDto groupsSetGroupSettingsPhotosAddAllowedDto2 = new GroupsSetGroupSettingsPhotosAddAllowedDto("MEMBERS", 1, "members");
        MEMBERS = groupsSetGroupSettingsPhotosAddAllowedDto2;
        GroupsSetGroupSettingsPhotosAddAllowedDto[] groupsSetGroupSettingsPhotosAddAllowedDtoArr = {groupsSetGroupSettingsPhotosAddAllowedDto, groupsSetGroupSettingsPhotosAddAllowedDto2};
        $VALUES = groupsSetGroupSettingsPhotosAddAllowedDtoArr;
        $ENTRIES = new asp(groupsSetGroupSettingsPhotosAddAllowedDtoArr);
        CREATOR = new a();
    }

    private GroupsSetGroupSettingsPhotosAddAllowedDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsSetGroupSettingsPhotosAddAllowedDto valueOf(String str) {
        return (GroupsSetGroupSettingsPhotosAddAllowedDto) Enum.valueOf(GroupsSetGroupSettingsPhotosAddAllowedDto.class, str);
    }

    public static GroupsSetGroupSettingsPhotosAddAllowedDto[] values() {
        return (GroupsSetGroupSettingsPhotosAddAllowedDto[]) $VALUES.clone();
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
