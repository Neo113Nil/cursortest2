package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsEditAgeLimitsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsEditAgeLimitsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsEditAgeLimitsDto[] $VALUES;
    public static final Parcelable.Creator<GroupsEditAgeLimitsDto> CREATOR;

    @pmi0("1")
    public static final GroupsEditAgeLimitsDto TYPE_1;

    @pmi0("2")
    public static final GroupsEditAgeLimitsDto TYPE_2;

    @pmi0("3")
    public static final GroupsEditAgeLimitsDto TYPE_3;
    private final int value;

    /* compiled from: GroupsEditAgeLimitsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsEditAgeLimitsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsEditAgeLimitsDto createFromParcel(Parcel parcel) {
            return GroupsEditAgeLimitsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsEditAgeLimitsDto[] newArray(int i) {
            return new GroupsEditAgeLimitsDto[i];
        }
    }

    static {
        GroupsEditAgeLimitsDto groupsEditAgeLimitsDto = new GroupsEditAgeLimitsDto("TYPE_1", 0, 1);
        TYPE_1 = groupsEditAgeLimitsDto;
        GroupsEditAgeLimitsDto groupsEditAgeLimitsDto2 = new GroupsEditAgeLimitsDto("TYPE_2", 1, 2);
        TYPE_2 = groupsEditAgeLimitsDto2;
        GroupsEditAgeLimitsDto groupsEditAgeLimitsDto3 = new GroupsEditAgeLimitsDto("TYPE_3", 2, 3);
        TYPE_3 = groupsEditAgeLimitsDto3;
        GroupsEditAgeLimitsDto[] groupsEditAgeLimitsDtoArr = {groupsEditAgeLimitsDto, groupsEditAgeLimitsDto2, groupsEditAgeLimitsDto3};
        $VALUES = groupsEditAgeLimitsDtoArr;
        $ENTRIES = new asp(groupsEditAgeLimitsDtoArr);
        CREATOR = new a();
    }

    private GroupsEditAgeLimitsDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsEditAgeLimitsDto valueOf(String str) {
        return (GroupsEditAgeLimitsDto) Enum.valueOf(GroupsEditAgeLimitsDto.class, str);
    }

    public static GroupsEditAgeLimitsDto[] values() {
        return (GroupsEditAgeLimitsDto[]) $VALUES.clone();
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
