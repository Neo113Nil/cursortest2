package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGetChatsFilterDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetChatsFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGetChatsFilterDto[] $VALUES;

    @pmi0("all")
    public static final GroupsGetChatsFilterDto ALL;

    @pmi0("closed")
    public static final GroupsGetChatsFilterDto CLOSED;
    public static final Parcelable.Creator<GroupsGetChatsFilterDto> CREATOR;

    @pmi0("open")
    public static final GroupsGetChatsFilterDto OPEN;
    private final String value;

    /* compiled from: GroupsGetChatsFilterDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetChatsFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetChatsFilterDto createFromParcel(Parcel parcel) {
            return GroupsGetChatsFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetChatsFilterDto[] newArray(int i) {
            return new GroupsGetChatsFilterDto[i];
        }
    }

    static {
        GroupsGetChatsFilterDto groupsGetChatsFilterDto = new GroupsGetChatsFilterDto("ALL", 0, "all");
        ALL = groupsGetChatsFilterDto;
        GroupsGetChatsFilterDto groupsGetChatsFilterDto2 = new GroupsGetChatsFilterDto("CLOSED", 1, "closed");
        CLOSED = groupsGetChatsFilterDto2;
        GroupsGetChatsFilterDto groupsGetChatsFilterDto3 = new GroupsGetChatsFilterDto("OPEN", 2, "open");
        OPEN = groupsGetChatsFilterDto3;
        GroupsGetChatsFilterDto[] groupsGetChatsFilterDtoArr = {groupsGetChatsFilterDto, groupsGetChatsFilterDto2, groupsGetChatsFilterDto3};
        $VALUES = groupsGetChatsFilterDtoArr;
        $ENTRIES = new asp(groupsGetChatsFilterDtoArr);
        CREATOR = new a();
    }

    private GroupsGetChatsFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsGetChatsFilterDto valueOf(String str) {
        return (GroupsGetChatsFilterDto) Enum.valueOf(GroupsGetChatsFilterDto.class, str);
    }

    public static GroupsGetChatsFilterDto[] values() {
        return (GroupsGetChatsFilterDto[]) $VALUES.clone();
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
