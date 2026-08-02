package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupPhotosDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupPhotosDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupPhotosDto[] $VALUES;
    public static final Parcelable.Creator<GroupsGroupPhotosDto> CREATOR;

    @pmi0("0")
    public static final GroupsGroupPhotosDto DISABLED;

    @pmi0("2")
    public static final GroupsGroupPhotosDto LIMITED;

    @pmi0("1")
    public static final GroupsGroupPhotosDto OPEN;
    private final int value;

    /* compiled from: GroupsGroupPhotosDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupPhotosDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupPhotosDto createFromParcel(Parcel parcel) {
            return GroupsGroupPhotosDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupPhotosDto[] newArray(int i) {
            return new GroupsGroupPhotosDto[i];
        }
    }

    static {
        GroupsGroupPhotosDto groupsGroupPhotosDto = new GroupsGroupPhotosDto("DISABLED", 0, 0);
        DISABLED = groupsGroupPhotosDto;
        GroupsGroupPhotosDto groupsGroupPhotosDto2 = new GroupsGroupPhotosDto("OPEN", 1, 1);
        OPEN = groupsGroupPhotosDto2;
        GroupsGroupPhotosDto groupsGroupPhotosDto3 = new GroupsGroupPhotosDto("LIMITED", 2, 2);
        LIMITED = groupsGroupPhotosDto3;
        GroupsGroupPhotosDto[] groupsGroupPhotosDtoArr = {groupsGroupPhotosDto, groupsGroupPhotosDto2, groupsGroupPhotosDto3};
        $VALUES = groupsGroupPhotosDtoArr;
        $ENTRIES = new asp(groupsGroupPhotosDtoArr);
        CREATOR = new a();
    }

    private GroupsGroupPhotosDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupPhotosDto valueOf(String str) {
        return (GroupsGroupPhotosDto) Enum.valueOf(GroupsGroupPhotosDto.class, str);
    }

    public static GroupsGroupPhotosDto[] values() {
        return (GroupsGroupPhotosDto[]) $VALUES.clone();
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
