package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsEditSettingsSectionsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsEditSettingsSectionsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsEditSettingsSectionsDto[] $VALUES;

    @pmi0("action_button")
    public static final GroupsEditSettingsSectionsDto ACTION_BUTTON;
    public static final Parcelable.Creator<GroupsEditSettingsSectionsDto> CREATOR;
    private final String value;

    /* compiled from: GroupsEditSettingsSectionsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsEditSettingsSectionsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsEditSettingsSectionsDto createFromParcel(Parcel parcel) {
            return GroupsEditSettingsSectionsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsEditSettingsSectionsDto[] newArray(int i) {
            return new GroupsEditSettingsSectionsDto[i];
        }
    }

    static {
        GroupsEditSettingsSectionsDto groupsEditSettingsSectionsDto = new GroupsEditSettingsSectionsDto("ACTION_BUTTON", 0, "action_button");
        ACTION_BUTTON = groupsEditSettingsSectionsDto;
        GroupsEditSettingsSectionsDto[] groupsEditSettingsSectionsDtoArr = {groupsEditSettingsSectionsDto};
        $VALUES = groupsEditSettingsSectionsDtoArr;
        $ENTRIES = new asp(groupsEditSettingsSectionsDtoArr);
        CREATOR = new a();
    }

    private GroupsEditSettingsSectionsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsEditSettingsSectionsDto valueOf(String str) {
        return (GroupsEditSettingsSectionsDto) Enum.valueOf(GroupsEditSettingsSectionsDto.class, str);
    }

    public static GroupsEditSettingsSectionsDto[] values() {
        return (GroupsEditSettingsSectionsDto[]) $VALUES.clone();
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
