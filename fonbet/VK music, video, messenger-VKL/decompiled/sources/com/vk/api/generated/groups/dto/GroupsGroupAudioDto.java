package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupAudioDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupAudioDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupAudioDto[] $VALUES;
    public static final Parcelable.Creator<GroupsGroupAudioDto> CREATOR;

    @pmi0("0")
    public static final GroupsGroupAudioDto DISABLED;

    @pmi0("2")
    public static final GroupsGroupAudioDto LIMITED;

    @pmi0("1")
    public static final GroupsGroupAudioDto OPEN;
    private final int value;

    /* compiled from: GroupsGroupAudioDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupAudioDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupAudioDto createFromParcel(Parcel parcel) {
            return GroupsGroupAudioDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupAudioDto[] newArray(int i) {
            return new GroupsGroupAudioDto[i];
        }
    }

    static {
        GroupsGroupAudioDto groupsGroupAudioDto = new GroupsGroupAudioDto("DISABLED", 0, 0);
        DISABLED = groupsGroupAudioDto;
        GroupsGroupAudioDto groupsGroupAudioDto2 = new GroupsGroupAudioDto("OPEN", 1, 1);
        OPEN = groupsGroupAudioDto2;
        GroupsGroupAudioDto groupsGroupAudioDto3 = new GroupsGroupAudioDto("LIMITED", 2, 2);
        LIMITED = groupsGroupAudioDto3;
        GroupsGroupAudioDto[] groupsGroupAudioDtoArr = {groupsGroupAudioDto, groupsGroupAudioDto2, groupsGroupAudioDto3};
        $VALUES = groupsGroupAudioDtoArr;
        $ENTRIES = new asp(groupsGroupAudioDtoArr);
        CREATOR = new a();
    }

    private GroupsGroupAudioDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupAudioDto valueOf(String str) {
        return (GroupsGroupAudioDto) Enum.valueOf(GroupsGroupAudioDto.class, str);
    }

    public static GroupsGroupAudioDto[] values() {
        return (GroupsGroupAudioDto[]) $VALUES.clone();
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
