package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsCreateAccessDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreateAccessDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsCreateAccessDto[] $VALUES;
    public static final Parcelable.Creator<GroupsCreateAccessDto> CREATOR;

    @pmi0("0")
    public static final GroupsCreateAccessDto TYPE_0;

    @pmi0("1")
    public static final GroupsCreateAccessDto TYPE_1;

    @pmi0("2")
    public static final GroupsCreateAccessDto TYPE_2;
    private final int value;

    /* compiled from: GroupsCreateAccessDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreateAccessDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreateAccessDto createFromParcel(Parcel parcel) {
            return GroupsCreateAccessDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreateAccessDto[] newArray(int i) {
            return new GroupsCreateAccessDto[i];
        }
    }

    static {
        GroupsCreateAccessDto groupsCreateAccessDto = new GroupsCreateAccessDto("TYPE_0", 0, 0);
        TYPE_0 = groupsCreateAccessDto;
        GroupsCreateAccessDto groupsCreateAccessDto2 = new GroupsCreateAccessDto("TYPE_1", 1, 1);
        TYPE_1 = groupsCreateAccessDto2;
        GroupsCreateAccessDto groupsCreateAccessDto3 = new GroupsCreateAccessDto("TYPE_2", 2, 2);
        TYPE_2 = groupsCreateAccessDto3;
        GroupsCreateAccessDto[] groupsCreateAccessDtoArr = {groupsCreateAccessDto, groupsCreateAccessDto2, groupsCreateAccessDto3};
        $VALUES = groupsCreateAccessDtoArr;
        $ENTRIES = new asp(groupsCreateAccessDtoArr);
        CREATOR = new a();
    }

    private GroupsCreateAccessDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsCreateAccessDto valueOf(String str) {
        return (GroupsCreateAccessDto) Enum.valueOf(GroupsCreateAccessDto.class, str);
    }

    public static GroupsCreateAccessDto[] values() {
        return (GroupsCreateAccessDto[]) $VALUES.clone();
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
