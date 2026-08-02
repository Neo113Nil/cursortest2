package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupTopicsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupTopicsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupTopicsDto[] $VALUES;
    public static final Parcelable.Creator<GroupsGroupTopicsDto> CREATOR;

    @pmi0("0")
    public static final GroupsGroupTopicsDto DISABLED;

    @pmi0("2")
    public static final GroupsGroupTopicsDto LIMITED;

    @pmi0("1")
    public static final GroupsGroupTopicsDto OPEN;
    private final int value;

    /* compiled from: GroupsGroupTopicsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupTopicsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupTopicsDto createFromParcel(Parcel parcel) {
            return GroupsGroupTopicsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupTopicsDto[] newArray(int i) {
            return new GroupsGroupTopicsDto[i];
        }
    }

    static {
        GroupsGroupTopicsDto groupsGroupTopicsDto = new GroupsGroupTopicsDto("DISABLED", 0, 0);
        DISABLED = groupsGroupTopicsDto;
        GroupsGroupTopicsDto groupsGroupTopicsDto2 = new GroupsGroupTopicsDto("OPEN", 1, 1);
        OPEN = groupsGroupTopicsDto2;
        GroupsGroupTopicsDto groupsGroupTopicsDto3 = new GroupsGroupTopicsDto("LIMITED", 2, 2);
        LIMITED = groupsGroupTopicsDto3;
        GroupsGroupTopicsDto[] groupsGroupTopicsDtoArr = {groupsGroupTopicsDto, groupsGroupTopicsDto2, groupsGroupTopicsDto3};
        $VALUES = groupsGroupTopicsDtoArr;
        $ENTRIES = new asp(groupsGroupTopicsDtoArr);
        CREATOR = new a();
    }

    private GroupsGroupTopicsDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupTopicsDto valueOf(String str) {
        return (GroupsGroupTopicsDto) Enum.valueOf(GroupsGroupTopicsDto.class, str);
    }

    public static GroupsGroupTopicsDto[] values() {
        return (GroupsGroupTopicsDto[]) $VALUES.clone();
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
