package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsEditCategoryGenderDto.kt */
/* loaded from: classes14.dex */
public final class GroupsEditCategoryGenderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsEditCategoryGenderDto[] $VALUES;
    public static final Parcelable.Creator<GroupsEditCategoryGenderDto> CREATOR;

    @pmi0("0")
    public static final GroupsEditCategoryGenderDto TYPE_0;

    @pmi0("1")
    public static final GroupsEditCategoryGenderDto TYPE_1;

    @pmi0("2")
    public static final GroupsEditCategoryGenderDto TYPE_2;
    private final int value;

    /* compiled from: GroupsEditCategoryGenderDto.kt */
    public static final class a implements Parcelable.Creator<GroupsEditCategoryGenderDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsEditCategoryGenderDto createFromParcel(Parcel parcel) {
            return GroupsEditCategoryGenderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsEditCategoryGenderDto[] newArray(int i) {
            return new GroupsEditCategoryGenderDto[i];
        }
    }

    static {
        GroupsEditCategoryGenderDto groupsEditCategoryGenderDto = new GroupsEditCategoryGenderDto("TYPE_0", 0, 0);
        TYPE_0 = groupsEditCategoryGenderDto;
        GroupsEditCategoryGenderDto groupsEditCategoryGenderDto2 = new GroupsEditCategoryGenderDto("TYPE_1", 1, 1);
        TYPE_1 = groupsEditCategoryGenderDto2;
        GroupsEditCategoryGenderDto groupsEditCategoryGenderDto3 = new GroupsEditCategoryGenderDto("TYPE_2", 2, 2);
        TYPE_2 = groupsEditCategoryGenderDto3;
        GroupsEditCategoryGenderDto[] groupsEditCategoryGenderDtoArr = {groupsEditCategoryGenderDto, groupsEditCategoryGenderDto2, groupsEditCategoryGenderDto3};
        $VALUES = groupsEditCategoryGenderDtoArr;
        $ENTRIES = new asp(groupsEditCategoryGenderDtoArr);
        CREATOR = new a();
    }

    private GroupsEditCategoryGenderDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsEditCategoryGenderDto valueOf(String str) {
        return (GroupsEditCategoryGenderDto) Enum.valueOf(GroupsEditCategoryGenderDto.class, str);
    }

    public static GroupsEditCategoryGenderDto[] values() {
        return (GroupsEditCategoryGenderDto[]) $VALUES.clone();
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
