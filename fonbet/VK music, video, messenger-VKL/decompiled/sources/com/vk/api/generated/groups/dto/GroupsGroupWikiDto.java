package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupWikiDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupWikiDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupWikiDto[] $VALUES;
    public static final Parcelable.Creator<GroupsGroupWikiDto> CREATOR;

    @pmi0("0")
    public static final GroupsGroupWikiDto DISABLED;

    @pmi0("2")
    public static final GroupsGroupWikiDto LIMITED;

    @pmi0("1")
    public static final GroupsGroupWikiDto OPEN;
    private final int value;

    /* compiled from: GroupsGroupWikiDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupWikiDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupWikiDto createFromParcel(Parcel parcel) {
            return GroupsGroupWikiDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupWikiDto[] newArray(int i) {
            return new GroupsGroupWikiDto[i];
        }
    }

    static {
        GroupsGroupWikiDto groupsGroupWikiDto = new GroupsGroupWikiDto("DISABLED", 0, 0);
        DISABLED = groupsGroupWikiDto;
        GroupsGroupWikiDto groupsGroupWikiDto2 = new GroupsGroupWikiDto("OPEN", 1, 1);
        OPEN = groupsGroupWikiDto2;
        GroupsGroupWikiDto groupsGroupWikiDto3 = new GroupsGroupWikiDto("LIMITED", 2, 2);
        LIMITED = groupsGroupWikiDto3;
        GroupsGroupWikiDto[] groupsGroupWikiDtoArr = {groupsGroupWikiDto, groupsGroupWikiDto2, groupsGroupWikiDto3};
        $VALUES = groupsGroupWikiDtoArr;
        $ENTRIES = new asp(groupsGroupWikiDtoArr);
        CREATOR = new a();
    }

    private GroupsGroupWikiDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupWikiDto valueOf(String str) {
        return (GroupsGroupWikiDto) Enum.valueOf(GroupsGroupWikiDto.class, str);
    }

    public static GroupsGroupWikiDto[] values() {
        return (GroupsGroupWikiDto[]) $VALUES.clone();
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
