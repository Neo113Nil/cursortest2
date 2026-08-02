package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGetEventsFilterDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetEventsFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGetEventsFilterDto[] $VALUES;

    @pmi0("all")
    public static final GroupsGetEventsFilterDto ALL;
    public static final Parcelable.Creator<GroupsGetEventsFilterDto> CREATOR;

    @pmi0("upcoming")
    public static final GroupsGetEventsFilterDto UPCOMING;
    private final String value;

    /* compiled from: GroupsGetEventsFilterDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetEventsFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetEventsFilterDto createFromParcel(Parcel parcel) {
            return GroupsGetEventsFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetEventsFilterDto[] newArray(int i) {
            return new GroupsGetEventsFilterDto[i];
        }
    }

    static {
        GroupsGetEventsFilterDto groupsGetEventsFilterDto = new GroupsGetEventsFilterDto("ALL", 0, "all");
        ALL = groupsGetEventsFilterDto;
        GroupsGetEventsFilterDto groupsGetEventsFilterDto2 = new GroupsGetEventsFilterDto("UPCOMING", 1, "upcoming");
        UPCOMING = groupsGetEventsFilterDto2;
        GroupsGetEventsFilterDto[] groupsGetEventsFilterDtoArr = {groupsGetEventsFilterDto, groupsGetEventsFilterDto2};
        $VALUES = groupsGetEventsFilterDtoArr;
        $ENTRIES = new asp(groupsGetEventsFilterDtoArr);
        CREATOR = new a();
    }

    private GroupsGetEventsFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsGetEventsFilterDto valueOf(String str) {
        return (GroupsGetEventsFilterDto) Enum.valueOf(GroupsGetEventsFilterDto.class, str);
    }

    public static GroupsGetEventsFilterDto[] values() {
        return (GroupsGetEventsFilterDto[]) $VALUES.clone();
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
