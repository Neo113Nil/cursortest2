package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupAccessDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupAccessDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupAccessDto[] $VALUES;

    @pmi0("1")
    public static final GroupsGroupAccessDto CLOSED;
    public static final Parcelable.Creator<GroupsGroupAccessDto> CREATOR;

    @pmi0("0")
    public static final GroupsGroupAccessDto OPEN;

    @pmi0("2")
    public static final GroupsGroupAccessDto PRIVATE;
    private final int value;

    /* compiled from: GroupsGroupAccessDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupAccessDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupAccessDto createFromParcel(Parcel parcel) {
            return GroupsGroupAccessDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupAccessDto[] newArray(int i) {
            return new GroupsGroupAccessDto[i];
        }
    }

    static {
        GroupsGroupAccessDto groupsGroupAccessDto = new GroupsGroupAccessDto("OPEN", 0, 0);
        OPEN = groupsGroupAccessDto;
        GroupsGroupAccessDto groupsGroupAccessDto2 = new GroupsGroupAccessDto("CLOSED", 1, 1);
        CLOSED = groupsGroupAccessDto2;
        GroupsGroupAccessDto groupsGroupAccessDto3 = new GroupsGroupAccessDto("PRIVATE", 2, 2);
        PRIVATE = groupsGroupAccessDto3;
        GroupsGroupAccessDto[] groupsGroupAccessDtoArr = {groupsGroupAccessDto, groupsGroupAccessDto2, groupsGroupAccessDto3};
        $VALUES = groupsGroupAccessDtoArr;
        $ENTRIES = new asp(groupsGroupAccessDtoArr);
        CREATOR = new a();
    }

    private GroupsGroupAccessDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupAccessDto valueOf(String str) {
        return (GroupsGroupAccessDto) Enum.valueOf(GroupsGroupAccessDto.class, str);
    }

    public static GroupsGroupAccessDto[] values() {
        return (GroupsGroupAccessDto[]) $VALUES.clone();
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
