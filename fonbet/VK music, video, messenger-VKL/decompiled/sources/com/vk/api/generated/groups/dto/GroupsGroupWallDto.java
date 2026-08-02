package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupWallDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupWallDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupWallDto[] $VALUES;

    @pmi0("3")
    public static final GroupsGroupWallDto CLOSED;
    public static final Parcelable.Creator<GroupsGroupWallDto> CREATOR;

    @pmi0("0")
    public static final GroupsGroupWallDto DISABLED;

    @pmi0("2")
    public static final GroupsGroupWallDto LIMITED;

    @pmi0("1")
    public static final GroupsGroupWallDto OPEN;
    private final int value;

    /* compiled from: GroupsGroupWallDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupWallDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupWallDto createFromParcel(Parcel parcel) {
            return GroupsGroupWallDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupWallDto[] newArray(int i) {
            return new GroupsGroupWallDto[i];
        }
    }

    static {
        GroupsGroupWallDto groupsGroupWallDto = new GroupsGroupWallDto("DISABLED", 0, 0);
        DISABLED = groupsGroupWallDto;
        GroupsGroupWallDto groupsGroupWallDto2 = new GroupsGroupWallDto("OPEN", 1, 1);
        OPEN = groupsGroupWallDto2;
        GroupsGroupWallDto groupsGroupWallDto3 = new GroupsGroupWallDto("LIMITED", 2, 2);
        LIMITED = groupsGroupWallDto3;
        GroupsGroupWallDto groupsGroupWallDto4 = new GroupsGroupWallDto("CLOSED", 3, 3);
        CLOSED = groupsGroupWallDto4;
        GroupsGroupWallDto[] groupsGroupWallDtoArr = {groupsGroupWallDto, groupsGroupWallDto2, groupsGroupWallDto3, groupsGroupWallDto4};
        $VALUES = groupsGroupWallDtoArr;
        $ENTRIES = new asp(groupsGroupWallDtoArr);
        CREATOR = new a();
    }

    private GroupsGroupWallDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupWallDto valueOf(String str) {
        return (GroupsGroupWallDto) Enum.valueOf(GroupsGroupWallDto.class, str);
    }

    public static GroupsGroupWallDto[] values() {
        return (GroupsGroupWallDto[]) $VALUES.clone();
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
