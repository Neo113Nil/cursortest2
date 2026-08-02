package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGetMembersSortDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetMembersSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGetMembersSortDto[] $VALUES;
    public static final Parcelable.Creator<GroupsGetMembersSortDto> CREATOR;

    @pmi0("dons_desc")
    public static final GroupsGetMembersSortDto DONS_DESC;

    @pmi0("id_asc")
    public static final GroupsGetMembersSortDto ID_ASC;

    @pmi0("id_desc")
    public static final GroupsGetMembersSortDto ID_DESC;

    @pmi0("time_asc")
    public static final GroupsGetMembersSortDto TIME_ASC;

    @pmi0("time_desc")
    public static final GroupsGetMembersSortDto TIME_DESC;
    private final String value;

    /* compiled from: GroupsGetMembersSortDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetMembersSortDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetMembersSortDto createFromParcel(Parcel parcel) {
            return GroupsGetMembersSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetMembersSortDto[] newArray(int i) {
            return new GroupsGetMembersSortDto[i];
        }
    }

    static {
        GroupsGetMembersSortDto groupsGetMembersSortDto = new GroupsGetMembersSortDto("DONS_DESC", 0, "dons_desc");
        DONS_DESC = groupsGetMembersSortDto;
        GroupsGetMembersSortDto groupsGetMembersSortDto2 = new GroupsGetMembersSortDto("ID_ASC", 1, "id_asc");
        ID_ASC = groupsGetMembersSortDto2;
        GroupsGetMembersSortDto groupsGetMembersSortDto3 = new GroupsGetMembersSortDto("ID_DESC", 2, "id_desc");
        ID_DESC = groupsGetMembersSortDto3;
        GroupsGetMembersSortDto groupsGetMembersSortDto4 = new GroupsGetMembersSortDto("TIME_ASC", 3, "time_asc");
        TIME_ASC = groupsGetMembersSortDto4;
        GroupsGetMembersSortDto groupsGetMembersSortDto5 = new GroupsGetMembersSortDto("TIME_DESC", 4, "time_desc");
        TIME_DESC = groupsGetMembersSortDto5;
        GroupsGetMembersSortDto[] groupsGetMembersSortDtoArr = {groupsGetMembersSortDto, groupsGetMembersSortDto2, groupsGetMembersSortDto3, groupsGetMembersSortDto4, groupsGetMembersSortDto5};
        $VALUES = groupsGetMembersSortDtoArr;
        $ENTRIES = new asp(groupsGetMembersSortDtoArr);
        CREATOR = new a();
    }

    private GroupsGetMembersSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsGetMembersSortDto valueOf(String str) {
        return (GroupsGetMembersSortDto) Enum.valueOf(GroupsGetMembersSortDto.class, str);
    }

    public static GroupsGetMembersSortDto[] values() {
        return (GroupsGetMembersSortDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
