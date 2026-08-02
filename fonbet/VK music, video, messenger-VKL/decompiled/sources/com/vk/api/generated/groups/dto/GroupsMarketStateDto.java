package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsMarketStateDto.kt */
/* loaded from: classes14.dex */
public final class GroupsMarketStateDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsMarketStateDto[] $VALUES;

    @pmi0("advanced")
    public static final GroupsMarketStateDto ADVANCED;

    @pmi0("basic")
    public static final GroupsMarketStateDto BASIC;
    public static final Parcelable.Creator<GroupsMarketStateDto> CREATOR;

    @pmi0("none")
    public static final GroupsMarketStateDto NONE;
    private final String value;

    /* compiled from: GroupsMarketStateDto.kt */
    public static final class a implements Parcelable.Creator<GroupsMarketStateDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsMarketStateDto createFromParcel(Parcel parcel) {
            return GroupsMarketStateDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsMarketStateDto[] newArray(int i) {
            return new GroupsMarketStateDto[i];
        }
    }

    static {
        GroupsMarketStateDto groupsMarketStateDto = new GroupsMarketStateDto("NONE", 0, "none");
        NONE = groupsMarketStateDto;
        GroupsMarketStateDto groupsMarketStateDto2 = new GroupsMarketStateDto("BASIC", 1, "basic");
        BASIC = groupsMarketStateDto2;
        GroupsMarketStateDto groupsMarketStateDto3 = new GroupsMarketStateDto("ADVANCED", 2, "advanced");
        ADVANCED = groupsMarketStateDto3;
        GroupsMarketStateDto[] groupsMarketStateDtoArr = {groupsMarketStateDto, groupsMarketStateDto2, groupsMarketStateDto3};
        $VALUES = groupsMarketStateDtoArr;
        $ENTRIES = new asp(groupsMarketStateDtoArr);
        CREATOR = new a();
    }

    private GroupsMarketStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsMarketStateDto valueOf(String str) {
        return (GroupsMarketStateDto) Enum.valueOf(GroupsMarketStateDto.class, str);
    }

    public static GroupsMarketStateDto[] values() {
        return (GroupsMarketStateDto[]) $VALUES.clone();
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
