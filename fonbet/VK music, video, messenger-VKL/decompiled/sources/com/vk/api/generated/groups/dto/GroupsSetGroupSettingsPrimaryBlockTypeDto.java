package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSetGroupSettingsPrimaryBlockTypeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSetGroupSettingsPrimaryBlockTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSetGroupSettingsPrimaryBlockTypeDto[] $VALUES;

    @pmi0("channel")
    public static final GroupsSetGroupSettingsPrimaryBlockTypeDto CHANNEL;
    public static final Parcelable.Creator<GroupsSetGroupSettingsPrimaryBlockTypeDto> CREATOR;

    @pmi0("market")
    public static final GroupsSetGroupSettingsPrimaryBlockTypeDto MARKET;

    @pmi0("services")
    public static final GroupsSetGroupSettingsPrimaryBlockTypeDto SERVICES;
    private final String value;

    /* compiled from: GroupsSetGroupSettingsPrimaryBlockTypeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSetGroupSettingsPrimaryBlockTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsPrimaryBlockTypeDto createFromParcel(Parcel parcel) {
            return GroupsSetGroupSettingsPrimaryBlockTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsPrimaryBlockTypeDto[] newArray(int i) {
            return new GroupsSetGroupSettingsPrimaryBlockTypeDto[i];
        }
    }

    static {
        GroupsSetGroupSettingsPrimaryBlockTypeDto groupsSetGroupSettingsPrimaryBlockTypeDto = new GroupsSetGroupSettingsPrimaryBlockTypeDto("CHANNEL", 0, "channel");
        CHANNEL = groupsSetGroupSettingsPrimaryBlockTypeDto;
        GroupsSetGroupSettingsPrimaryBlockTypeDto groupsSetGroupSettingsPrimaryBlockTypeDto2 = new GroupsSetGroupSettingsPrimaryBlockTypeDto("MARKET", 1, "market");
        MARKET = groupsSetGroupSettingsPrimaryBlockTypeDto2;
        GroupsSetGroupSettingsPrimaryBlockTypeDto groupsSetGroupSettingsPrimaryBlockTypeDto3 = new GroupsSetGroupSettingsPrimaryBlockTypeDto("SERVICES", 2, "services");
        SERVICES = groupsSetGroupSettingsPrimaryBlockTypeDto3;
        GroupsSetGroupSettingsPrimaryBlockTypeDto[] groupsSetGroupSettingsPrimaryBlockTypeDtoArr = {groupsSetGroupSettingsPrimaryBlockTypeDto, groupsSetGroupSettingsPrimaryBlockTypeDto2, groupsSetGroupSettingsPrimaryBlockTypeDto3};
        $VALUES = groupsSetGroupSettingsPrimaryBlockTypeDtoArr;
        $ENTRIES = new asp(groupsSetGroupSettingsPrimaryBlockTypeDtoArr);
        CREATOR = new a();
    }

    private GroupsSetGroupSettingsPrimaryBlockTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsSetGroupSettingsPrimaryBlockTypeDto valueOf(String str) {
        return (GroupsSetGroupSettingsPrimaryBlockTypeDto) Enum.valueOf(GroupsSetGroupSettingsPrimaryBlockTypeDto.class, str);
    }

    public static GroupsSetGroupSettingsPrimaryBlockTypeDto[] values() {
        return (GroupsSetGroupSettingsPrimaryBlockTypeDto[]) $VALUES.clone();
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
