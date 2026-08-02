package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupFullAgeMarkDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupFullAgeMarkDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupFullAgeMarkDto[] $VALUES;
    public static final Parcelable.Creator<GroupsGroupFullAgeMarkDto> CREATOR;

    @pmi0("1")
    public static final GroupsGroupFullAgeMarkDto NO;

    @pmi0("2")
    public static final GroupsGroupFullAgeMarkDto OVER_16;

    @pmi0("3")
    public static final GroupsGroupFullAgeMarkDto OVER_18;
    private final int value;

    /* compiled from: GroupsGroupFullAgeMarkDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupFullAgeMarkDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupFullAgeMarkDto createFromParcel(Parcel parcel) {
            return GroupsGroupFullAgeMarkDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupFullAgeMarkDto[] newArray(int i) {
            return new GroupsGroupFullAgeMarkDto[i];
        }
    }

    static {
        GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto = new GroupsGroupFullAgeMarkDto("NO", 0, 1);
        NO = groupsGroupFullAgeMarkDto;
        GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto2 = new GroupsGroupFullAgeMarkDto("OVER_16", 1, 2);
        OVER_16 = groupsGroupFullAgeMarkDto2;
        GroupsGroupFullAgeMarkDto groupsGroupFullAgeMarkDto3 = new GroupsGroupFullAgeMarkDto("OVER_18", 2, 3);
        OVER_18 = groupsGroupFullAgeMarkDto3;
        GroupsGroupFullAgeMarkDto[] groupsGroupFullAgeMarkDtoArr = {groupsGroupFullAgeMarkDto, groupsGroupFullAgeMarkDto2, groupsGroupFullAgeMarkDto3};
        $VALUES = groupsGroupFullAgeMarkDtoArr;
        $ENTRIES = new asp(groupsGroupFullAgeMarkDtoArr);
        CREATOR = new a();
    }

    private GroupsGroupFullAgeMarkDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupFullAgeMarkDto valueOf(String str) {
        return (GroupsGroupFullAgeMarkDto) Enum.valueOf(GroupsGroupFullAgeMarkDto.class, str);
    }

    public static GroupsGroupFullAgeMarkDto[] values() {
        return (GroupsGroupFullAgeMarkDto[]) $VALUES.clone();
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
