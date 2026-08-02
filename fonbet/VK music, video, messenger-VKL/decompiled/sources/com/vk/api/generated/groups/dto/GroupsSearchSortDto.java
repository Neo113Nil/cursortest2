package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSearchSortDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSearchSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSearchSortDto[] $VALUES;

    @pmi0("2")
    public static final GroupsSearchSortDto ATTENDANCE;

    @pmi0("4")
    public static final GroupsSearchSortDto COMMENTS;
    public static final Parcelable.Creator<GroupsSearchSortDto> CREATOR;

    @pmi0("0")
    public static final GroupsSearchSortDto DEFAULT;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final GroupsSearchSortDto ENTRIES;

    @pmi0("1")
    public static final GroupsSearchSortDto GROWTH;

    @pmi0("3")
    public static final GroupsSearchSortDto LIKES;

    @pmi0("6")
    public static final GroupsSearchSortDto MEMBERS;
    private final int value;

    /* compiled from: GroupsSearchSortDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSearchSortDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSearchSortDto createFromParcel(Parcel parcel) {
            return GroupsSearchSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSearchSortDto[] newArray(int i) {
            return new GroupsSearchSortDto[i];
        }
    }

    static {
        GroupsSearchSortDto groupsSearchSortDto = new GroupsSearchSortDto("DEFAULT", 0, 0);
        DEFAULT = groupsSearchSortDto;
        GroupsSearchSortDto groupsSearchSortDto2 = new GroupsSearchSortDto("GROWTH", 1, 1);
        GROWTH = groupsSearchSortDto2;
        GroupsSearchSortDto groupsSearchSortDto3 = new GroupsSearchSortDto("ATTENDANCE", 2, 2);
        ATTENDANCE = groupsSearchSortDto3;
        GroupsSearchSortDto groupsSearchSortDto4 = new GroupsSearchSortDto("LIKES", 3, 3);
        LIKES = groupsSearchSortDto4;
        GroupsSearchSortDto groupsSearchSortDto5 = new GroupsSearchSortDto("COMMENTS", 4, 4);
        COMMENTS = groupsSearchSortDto5;
        GroupsSearchSortDto groupsSearchSortDto6 = new GroupsSearchSortDto("ENTRIES", 5, 5);
        ENTRIES = groupsSearchSortDto6;
        GroupsSearchSortDto groupsSearchSortDto7 = new GroupsSearchSortDto("MEMBERS", 6, 6);
        MEMBERS = groupsSearchSortDto7;
        GroupsSearchSortDto[] groupsSearchSortDtoArr = {groupsSearchSortDto, groupsSearchSortDto2, groupsSearchSortDto3, groupsSearchSortDto4, groupsSearchSortDto5, groupsSearchSortDto6, groupsSearchSortDto7};
        $VALUES = groupsSearchSortDtoArr;
        $ENTRIES = new asp(groupsSearchSortDtoArr);
        CREATOR = new a();
    }

    private GroupsSearchSortDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsSearchSortDto valueOf(String str) {
        return (GroupsSearchSortDto) Enum.valueOf(GroupsSearchSortDto.class, str);
    }

    public static GroupsSearchSortDto[] values() {
        return (GroupsSearchSortDto[]) $VALUES.clone();
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
