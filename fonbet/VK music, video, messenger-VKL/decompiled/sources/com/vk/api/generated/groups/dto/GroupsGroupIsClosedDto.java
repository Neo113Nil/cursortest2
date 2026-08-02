package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupIsClosedDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupIsClosedDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupIsClosedDto[] $VALUES;

    @pmi0("1")
    public static final GroupsGroupIsClosedDto CLOSED;
    public static final Parcelable.Creator<GroupsGroupIsClosedDto> CREATOR;

    @pmi0("0")
    public static final GroupsGroupIsClosedDto OPEN;

    @pmi0("2")
    public static final GroupsGroupIsClosedDto PRIVATE;
    private final int value;

    /* compiled from: GroupsGroupIsClosedDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupIsClosedDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupIsClosedDto createFromParcel(Parcel parcel) {
            return GroupsGroupIsClosedDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupIsClosedDto[] newArray(int i) {
            return new GroupsGroupIsClosedDto[i];
        }
    }

    static {
        GroupsGroupIsClosedDto groupsGroupIsClosedDto = new GroupsGroupIsClosedDto("OPEN", 0, 0);
        OPEN = groupsGroupIsClosedDto;
        GroupsGroupIsClosedDto groupsGroupIsClosedDto2 = new GroupsGroupIsClosedDto("CLOSED", 1, 1);
        CLOSED = groupsGroupIsClosedDto2;
        GroupsGroupIsClosedDto groupsGroupIsClosedDto3 = new GroupsGroupIsClosedDto("PRIVATE", 2, 2);
        PRIVATE = groupsGroupIsClosedDto3;
        GroupsGroupIsClosedDto[] groupsGroupIsClosedDtoArr = {groupsGroupIsClosedDto, groupsGroupIsClosedDto2, groupsGroupIsClosedDto3};
        $VALUES = groupsGroupIsClosedDtoArr;
        $ENTRIES = new asp(groupsGroupIsClosedDtoArr);
        CREATOR = new a();
    }

    private GroupsGroupIsClosedDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupIsClosedDto valueOf(String str) {
        return (GroupsGroupIsClosedDto) Enum.valueOf(GroupsGroupIsClosedDto.class, str);
    }

    public static GroupsGroupIsClosedDto[] values() {
        return (GroupsGroupIsClosedDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
