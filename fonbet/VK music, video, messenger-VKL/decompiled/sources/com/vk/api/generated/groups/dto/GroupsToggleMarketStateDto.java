package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsToggleMarketStateDto.kt */
/* loaded from: classes14.dex */
public final class GroupsToggleMarketStateDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsToggleMarketStateDto[] $VALUES;

    @pmi0("advanced")
    public static final GroupsToggleMarketStateDto ADVANCED;

    @pmi0("basic")
    public static final GroupsToggleMarketStateDto BASIC;
    public static final Parcelable.Creator<GroupsToggleMarketStateDto> CREATOR;

    @pmi0("none")
    public static final GroupsToggleMarketStateDto NONE;
    private final String value;

    /* compiled from: GroupsToggleMarketStateDto.kt */
    public static final class a implements Parcelable.Creator<GroupsToggleMarketStateDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsToggleMarketStateDto createFromParcel(Parcel parcel) {
            return GroupsToggleMarketStateDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsToggleMarketStateDto[] newArray(int i) {
            return new GroupsToggleMarketStateDto[i];
        }
    }

    static {
        GroupsToggleMarketStateDto groupsToggleMarketStateDto = new GroupsToggleMarketStateDto("ADVANCED", 0, "advanced");
        ADVANCED = groupsToggleMarketStateDto;
        GroupsToggleMarketStateDto groupsToggleMarketStateDto2 = new GroupsToggleMarketStateDto("BASIC", 1, "basic");
        BASIC = groupsToggleMarketStateDto2;
        GroupsToggleMarketStateDto groupsToggleMarketStateDto3 = new GroupsToggleMarketStateDto("NONE", 2, "none");
        NONE = groupsToggleMarketStateDto3;
        GroupsToggleMarketStateDto[] groupsToggleMarketStateDtoArr = {groupsToggleMarketStateDto, groupsToggleMarketStateDto2, groupsToggleMarketStateDto3};
        $VALUES = groupsToggleMarketStateDtoArr;
        $ENTRIES = new asp(groupsToggleMarketStateDtoArr);
        CREATOR = new a();
    }

    private GroupsToggleMarketStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsToggleMarketStateDto valueOf(String str) {
        return (GroupsToggleMarketStateDto) Enum.valueOf(GroupsToggleMarketStateDto.class, str);
    }

    public static GroupsToggleMarketStateDto[] values() {
        return (GroupsToggleMarketStateDto[]) $VALUES.clone();
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
