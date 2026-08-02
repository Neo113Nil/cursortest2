package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupFullAgeLimitsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupFullAgeLimitsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupFullAgeLimitsDto[] $VALUES;
    public static final Parcelable.Creator<GroupsGroupFullAgeLimitsDto> CREATOR;

    @pmi0("1")
    public static final GroupsGroupFullAgeLimitsDto NO;

    @pmi0("2")
    public static final GroupsGroupFullAgeLimitsDto OVER_16;

    @pmi0("3")
    public static final GroupsGroupFullAgeLimitsDto OVER_18;
    private final int value;

    /* compiled from: GroupsGroupFullAgeLimitsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupFullAgeLimitsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupFullAgeLimitsDto createFromParcel(Parcel parcel) {
            return GroupsGroupFullAgeLimitsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupFullAgeLimitsDto[] newArray(int i) {
            return new GroupsGroupFullAgeLimitsDto[i];
        }
    }

    static {
        GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto = new GroupsGroupFullAgeLimitsDto("NO", 0, 1);
        NO = groupsGroupFullAgeLimitsDto;
        GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto2 = new GroupsGroupFullAgeLimitsDto("OVER_16", 1, 2);
        OVER_16 = groupsGroupFullAgeLimitsDto2;
        GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto3 = new GroupsGroupFullAgeLimitsDto("OVER_18", 2, 3);
        OVER_18 = groupsGroupFullAgeLimitsDto3;
        GroupsGroupFullAgeLimitsDto[] groupsGroupFullAgeLimitsDtoArr = {groupsGroupFullAgeLimitsDto, groupsGroupFullAgeLimitsDto2, groupsGroupFullAgeLimitsDto3};
        $VALUES = groupsGroupFullAgeLimitsDtoArr;
        $ENTRIES = new asp(groupsGroupFullAgeLimitsDtoArr);
        CREATOR = new a();
    }

    private GroupsGroupFullAgeLimitsDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupFullAgeLimitsDto valueOf(String str) {
        return (GroupsGroupFullAgeLimitsDto) Enum.valueOf(GroupsGroupFullAgeLimitsDto.class, str);
    }

    public static GroupsGroupFullAgeLimitsDto[] values() {
        return (GroupsGroupFullAgeLimitsDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
