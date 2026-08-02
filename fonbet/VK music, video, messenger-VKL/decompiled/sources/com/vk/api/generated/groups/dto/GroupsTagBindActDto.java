package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsTagBindActDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTagBindActDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsTagBindActDto[] $VALUES;

    @pmi0("bind")
    public static final GroupsTagBindActDto BIND;
    public static final Parcelable.Creator<GroupsTagBindActDto> CREATOR;

    @pmi0("unbind")
    public static final GroupsTagBindActDto UNBIND;
    private final String value;

    /* compiled from: GroupsTagBindActDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTagBindActDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTagBindActDto createFromParcel(Parcel parcel) {
            return GroupsTagBindActDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTagBindActDto[] newArray(int i) {
            return new GroupsTagBindActDto[i];
        }
    }

    static {
        GroupsTagBindActDto groupsTagBindActDto = new GroupsTagBindActDto("BIND", 0, "bind");
        BIND = groupsTagBindActDto;
        GroupsTagBindActDto groupsTagBindActDto2 = new GroupsTagBindActDto("UNBIND", 1, "unbind");
        UNBIND = groupsTagBindActDto2;
        GroupsTagBindActDto[] groupsTagBindActDtoArr = {groupsTagBindActDto, groupsTagBindActDto2};
        $VALUES = groupsTagBindActDtoArr;
        $ENTRIES = new asp(groupsTagBindActDtoArr);
        CREATOR = new a();
    }

    private GroupsTagBindActDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsTagBindActDto valueOf(String str) {
        return (GroupsTagBindActDto) Enum.valueOf(GroupsTagBindActDto.class, str);
    }

    public static GroupsTagBindActDto[] values() {
        return (GroupsTagBindActDto[]) $VALUES.clone();
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
