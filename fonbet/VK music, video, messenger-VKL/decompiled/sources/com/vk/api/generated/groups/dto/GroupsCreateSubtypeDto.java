package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsCreateSubtypeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreateSubtypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsCreateSubtypeDto[] $VALUES;

    @pmi0("2")
    public static final GroupsCreateSubtypeDto COMPANY_OR_WEBSITE;
    public static final Parcelable.Creator<GroupsCreateSubtypeDto> CREATOR;

    @pmi0("0")
    public static final GroupsCreateSubtypeDto NONE;

    @pmi0("3")
    public static final GroupsCreateSubtypeDto PERSON_OR_GROUP;

    @pmi0("1")
    public static final GroupsCreateSubtypeDto PLACE_OR_BUSINESS;

    @pmi0("4")
    public static final GroupsCreateSubtypeDto PRODUCT_OR_ART;
    private final int value;

    /* compiled from: GroupsCreateSubtypeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreateSubtypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreateSubtypeDto createFromParcel(Parcel parcel) {
            return GroupsCreateSubtypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreateSubtypeDto[] newArray(int i) {
            return new GroupsCreateSubtypeDto[i];
        }
    }

    static {
        GroupsCreateSubtypeDto groupsCreateSubtypeDto = new GroupsCreateSubtypeDto("NONE", 0, 0);
        NONE = groupsCreateSubtypeDto;
        GroupsCreateSubtypeDto groupsCreateSubtypeDto2 = new GroupsCreateSubtypeDto("PLACE_OR_BUSINESS", 1, 1);
        PLACE_OR_BUSINESS = groupsCreateSubtypeDto2;
        GroupsCreateSubtypeDto groupsCreateSubtypeDto3 = new GroupsCreateSubtypeDto("COMPANY_OR_WEBSITE", 2, 2);
        COMPANY_OR_WEBSITE = groupsCreateSubtypeDto3;
        GroupsCreateSubtypeDto groupsCreateSubtypeDto4 = new GroupsCreateSubtypeDto("PERSON_OR_GROUP", 3, 3);
        PERSON_OR_GROUP = groupsCreateSubtypeDto4;
        GroupsCreateSubtypeDto groupsCreateSubtypeDto5 = new GroupsCreateSubtypeDto("PRODUCT_OR_ART", 4, 4);
        PRODUCT_OR_ART = groupsCreateSubtypeDto5;
        GroupsCreateSubtypeDto[] groupsCreateSubtypeDtoArr = {groupsCreateSubtypeDto, groupsCreateSubtypeDto2, groupsCreateSubtypeDto3, groupsCreateSubtypeDto4, groupsCreateSubtypeDto5};
        $VALUES = groupsCreateSubtypeDtoArr;
        $ENTRIES = new asp(groupsCreateSubtypeDtoArr);
        CREATOR = new a();
    }

    private GroupsCreateSubtypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsCreateSubtypeDto valueOf(String str) {
        return (GroupsCreateSubtypeDto) Enum.valueOf(GroupsCreateSubtypeDto.class, str);
    }

    public static GroupsCreateSubtypeDto[] values() {
        return (GroupsCreateSubtypeDto[]) $VALUES.clone();
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
