package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsCreateCategoryGenderDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreateCategoryGenderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsCreateCategoryGenderDto[] $VALUES;
    public static final Parcelable.Creator<GroupsCreateCategoryGenderDto> CREATOR;

    @pmi0("0")
    public static final GroupsCreateCategoryGenderDto TYPE_0;

    @pmi0("1")
    public static final GroupsCreateCategoryGenderDto TYPE_1;

    @pmi0("2")
    public static final GroupsCreateCategoryGenderDto TYPE_2;
    private final int value;

    /* compiled from: GroupsCreateCategoryGenderDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreateCategoryGenderDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreateCategoryGenderDto createFromParcel(Parcel parcel) {
            return GroupsCreateCategoryGenderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreateCategoryGenderDto[] newArray(int i) {
            return new GroupsCreateCategoryGenderDto[i];
        }
    }

    static {
        GroupsCreateCategoryGenderDto groupsCreateCategoryGenderDto = new GroupsCreateCategoryGenderDto("TYPE_0", 0, 0);
        TYPE_0 = groupsCreateCategoryGenderDto;
        GroupsCreateCategoryGenderDto groupsCreateCategoryGenderDto2 = new GroupsCreateCategoryGenderDto("TYPE_1", 1, 1);
        TYPE_1 = groupsCreateCategoryGenderDto2;
        GroupsCreateCategoryGenderDto groupsCreateCategoryGenderDto3 = new GroupsCreateCategoryGenderDto("TYPE_2", 2, 2);
        TYPE_2 = groupsCreateCategoryGenderDto3;
        GroupsCreateCategoryGenderDto[] groupsCreateCategoryGenderDtoArr = {groupsCreateCategoryGenderDto, groupsCreateCategoryGenderDto2, groupsCreateCategoryGenderDto3};
        $VALUES = groupsCreateCategoryGenderDtoArr;
        $ENTRIES = new asp(groupsCreateCategoryGenderDtoArr);
        CREATOR = new a();
    }

    private GroupsCreateCategoryGenderDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsCreateCategoryGenderDto valueOf(String str) {
        return (GroupsCreateCategoryGenderDto) Enum.valueOf(GroupsCreateCategoryGenderDto.class, str);
    }

    public static GroupsCreateCategoryGenderDto[] values() {
        return (GroupsCreateCategoryGenderDto[]) $VALUES.clone();
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
