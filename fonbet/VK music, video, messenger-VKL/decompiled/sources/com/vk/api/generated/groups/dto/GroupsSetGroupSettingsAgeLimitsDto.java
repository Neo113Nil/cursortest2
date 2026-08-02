package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSetGroupSettingsAgeLimitsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSetGroupSettingsAgeLimitsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSetGroupSettingsAgeLimitsDto[] $VALUES;
    public static final Parcelable.Creator<GroupsSetGroupSettingsAgeLimitsDto> CREATOR;

    @pmi0("1")
    public static final GroupsSetGroupSettingsAgeLimitsDto TYPE_1;

    @pmi0("2")
    public static final GroupsSetGroupSettingsAgeLimitsDto TYPE_2;

    @pmi0("3")
    public static final GroupsSetGroupSettingsAgeLimitsDto TYPE_3;
    private final int value;

    /* compiled from: GroupsSetGroupSettingsAgeLimitsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSetGroupSettingsAgeLimitsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsAgeLimitsDto createFromParcel(Parcel parcel) {
            return GroupsSetGroupSettingsAgeLimitsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsAgeLimitsDto[] newArray(int i) {
            return new GroupsSetGroupSettingsAgeLimitsDto[i];
        }
    }

    static {
        GroupsSetGroupSettingsAgeLimitsDto groupsSetGroupSettingsAgeLimitsDto = new GroupsSetGroupSettingsAgeLimitsDto("TYPE_1", 0, 1);
        TYPE_1 = groupsSetGroupSettingsAgeLimitsDto;
        GroupsSetGroupSettingsAgeLimitsDto groupsSetGroupSettingsAgeLimitsDto2 = new GroupsSetGroupSettingsAgeLimitsDto("TYPE_2", 1, 2);
        TYPE_2 = groupsSetGroupSettingsAgeLimitsDto2;
        GroupsSetGroupSettingsAgeLimitsDto groupsSetGroupSettingsAgeLimitsDto3 = new GroupsSetGroupSettingsAgeLimitsDto("TYPE_3", 2, 3);
        TYPE_3 = groupsSetGroupSettingsAgeLimitsDto3;
        GroupsSetGroupSettingsAgeLimitsDto[] groupsSetGroupSettingsAgeLimitsDtoArr = {groupsSetGroupSettingsAgeLimitsDto, groupsSetGroupSettingsAgeLimitsDto2, groupsSetGroupSettingsAgeLimitsDto3};
        $VALUES = groupsSetGroupSettingsAgeLimitsDtoArr;
        $ENTRIES = new asp(groupsSetGroupSettingsAgeLimitsDtoArr);
        CREATOR = new a();
    }

    private GroupsSetGroupSettingsAgeLimitsDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsSetGroupSettingsAgeLimitsDto valueOf(String str) {
        return (GroupsSetGroupSettingsAgeLimitsDto) Enum.valueOf(GroupsSetGroupSettingsAgeLimitsDto.class, str);
    }

    public static GroupsSetGroupSettingsAgeLimitsDto[] values() {
        return (GroupsSetGroupSettingsAgeLimitsDto[]) $VALUES.clone();
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
