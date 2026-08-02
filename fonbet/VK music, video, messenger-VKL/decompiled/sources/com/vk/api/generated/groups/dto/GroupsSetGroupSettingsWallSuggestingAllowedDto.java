package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSetGroupSettingsWallSuggestingAllowedDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSetGroupSettingsWallSuggestingAllowedDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSetGroupSettingsWallSuggestingAllowedDto[] $VALUES;
    public static final Parcelable.Creator<GroupsSetGroupSettingsWallSuggestingAllowedDto> CREATOR;

    @pmi0("everyone")
    public static final GroupsSetGroupSettingsWallSuggestingAllowedDto EVERYONE;

    @pmi0("members")
    public static final GroupsSetGroupSettingsWallSuggestingAllowedDto MEMBERS;

    @pmi0("nobody")
    public static final GroupsSetGroupSettingsWallSuggestingAllowedDto NOBODY;
    private final String value;

    /* compiled from: GroupsSetGroupSettingsWallSuggestingAllowedDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSetGroupSettingsWallSuggestingAllowedDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsWallSuggestingAllowedDto createFromParcel(Parcel parcel) {
            return GroupsSetGroupSettingsWallSuggestingAllowedDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsWallSuggestingAllowedDto[] newArray(int i) {
            return new GroupsSetGroupSettingsWallSuggestingAllowedDto[i];
        }
    }

    static {
        GroupsSetGroupSettingsWallSuggestingAllowedDto groupsSetGroupSettingsWallSuggestingAllowedDto = new GroupsSetGroupSettingsWallSuggestingAllowedDto("EVERYONE", 0, "everyone");
        EVERYONE = groupsSetGroupSettingsWallSuggestingAllowedDto;
        GroupsSetGroupSettingsWallSuggestingAllowedDto groupsSetGroupSettingsWallSuggestingAllowedDto2 = new GroupsSetGroupSettingsWallSuggestingAllowedDto("MEMBERS", 1, "members");
        MEMBERS = groupsSetGroupSettingsWallSuggestingAllowedDto2;
        GroupsSetGroupSettingsWallSuggestingAllowedDto groupsSetGroupSettingsWallSuggestingAllowedDto3 = new GroupsSetGroupSettingsWallSuggestingAllowedDto("NOBODY", 2, "nobody");
        NOBODY = groupsSetGroupSettingsWallSuggestingAllowedDto3;
        GroupsSetGroupSettingsWallSuggestingAllowedDto[] groupsSetGroupSettingsWallSuggestingAllowedDtoArr = {groupsSetGroupSettingsWallSuggestingAllowedDto, groupsSetGroupSettingsWallSuggestingAllowedDto2, groupsSetGroupSettingsWallSuggestingAllowedDto3};
        $VALUES = groupsSetGroupSettingsWallSuggestingAllowedDtoArr;
        $ENTRIES = new asp(groupsSetGroupSettingsWallSuggestingAllowedDtoArr);
        CREATOR = new a();
    }

    private GroupsSetGroupSettingsWallSuggestingAllowedDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsSetGroupSettingsWallSuggestingAllowedDto valueOf(String str) {
        return (GroupsSetGroupSettingsWallSuggestingAllowedDto) Enum.valueOf(GroupsSetGroupSettingsWallSuggestingAllowedDto.class, str);
    }

    public static GroupsSetGroupSettingsWallSuggestingAllowedDto[] values() {
        return (GroupsSetGroupSettingsWallSuggestingAllowedDto[]) $VALUES.clone();
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
