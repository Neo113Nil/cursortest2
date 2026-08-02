package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsLeaveLeaveModeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsLeaveLeaveModeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsLeaveLeaveModeDto[] $VALUES;

    @pmi0("admin_leave_without_right")
    public static final GroupsLeaveLeaveModeDto ADMIN_LEAVE_WITHOUT_RIGHT;

    @pmi0("admin_leave_with_right")
    public static final GroupsLeaveLeaveModeDto ADMIN_LEAVE_WITH_RIGHT;
    public static final Parcelable.Creator<GroupsLeaveLeaveModeDto> CREATOR;
    private final String value;

    /* compiled from: GroupsLeaveLeaveModeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsLeaveLeaveModeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsLeaveLeaveModeDto createFromParcel(Parcel parcel) {
            return GroupsLeaveLeaveModeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsLeaveLeaveModeDto[] newArray(int i) {
            return new GroupsLeaveLeaveModeDto[i];
        }
    }

    static {
        GroupsLeaveLeaveModeDto groupsLeaveLeaveModeDto = new GroupsLeaveLeaveModeDto("ADMIN_LEAVE_WITH_RIGHT", 0, "admin_leave_with_right");
        ADMIN_LEAVE_WITH_RIGHT = groupsLeaveLeaveModeDto;
        GroupsLeaveLeaveModeDto groupsLeaveLeaveModeDto2 = new GroupsLeaveLeaveModeDto("ADMIN_LEAVE_WITHOUT_RIGHT", 1, "admin_leave_without_right");
        ADMIN_LEAVE_WITHOUT_RIGHT = groupsLeaveLeaveModeDto2;
        GroupsLeaveLeaveModeDto[] groupsLeaveLeaveModeDtoArr = {groupsLeaveLeaveModeDto, groupsLeaveLeaveModeDto2};
        $VALUES = groupsLeaveLeaveModeDtoArr;
        $ENTRIES = new asp(groupsLeaveLeaveModeDtoArr);
        CREATOR = new a();
    }

    private GroupsLeaveLeaveModeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsLeaveLeaveModeDto valueOf(String str) {
        return (GroupsLeaveLeaveModeDto) Enum.valueOf(GroupsLeaveLeaveModeDto.class, str);
    }

    public static GroupsLeaveLeaveModeDto[] values() {
        return (GroupsLeaveLeaveModeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
