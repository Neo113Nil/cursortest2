package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupAgeLimitsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupAgeLimitsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupAgeLimitsDto[] $VALUES;
    public static final Parcelable.Creator<GroupsGroupAgeLimitsDto> CREATOR;

    @pmi0("2")
    public static final GroupsGroupAgeLimitsDto TYPE_16_PLUS;

    @pmi0("3")
    public static final GroupsGroupAgeLimitsDto TYPE_18_PLUS;

    @pmi0("1")
    public static final GroupsGroupAgeLimitsDto UNLIMITED;
    private final int value;

    /* compiled from: GroupsGroupAgeLimitsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupAgeLimitsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupAgeLimitsDto createFromParcel(Parcel parcel) {
            return GroupsGroupAgeLimitsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupAgeLimitsDto[] newArray(int i) {
            return new GroupsGroupAgeLimitsDto[i];
        }
    }

    static {
        GroupsGroupAgeLimitsDto groupsGroupAgeLimitsDto = new GroupsGroupAgeLimitsDto("UNLIMITED", 0, 1);
        UNLIMITED = groupsGroupAgeLimitsDto;
        GroupsGroupAgeLimitsDto groupsGroupAgeLimitsDto2 = new GroupsGroupAgeLimitsDto("TYPE_16_PLUS", 1, 2);
        TYPE_16_PLUS = groupsGroupAgeLimitsDto2;
        GroupsGroupAgeLimitsDto groupsGroupAgeLimitsDto3 = new GroupsGroupAgeLimitsDto("TYPE_18_PLUS", 2, 3);
        TYPE_18_PLUS = groupsGroupAgeLimitsDto3;
        GroupsGroupAgeLimitsDto[] groupsGroupAgeLimitsDtoArr = {groupsGroupAgeLimitsDto, groupsGroupAgeLimitsDto2, groupsGroupAgeLimitsDto3};
        $VALUES = groupsGroupAgeLimitsDtoArr;
        $ENTRIES = new asp(groupsGroupAgeLimitsDtoArr);
        CREATOR = new a();
    }

    private GroupsGroupAgeLimitsDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupAgeLimitsDto valueOf(String str) {
        return (GroupsGroupAgeLimitsDto) Enum.valueOf(GroupsGroupAgeLimitsDto.class, str);
    }

    public static GroupsGroupAgeLimitsDto[] values() {
        return (GroupsGroupAgeLimitsDto[]) $VALUES.clone();
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
