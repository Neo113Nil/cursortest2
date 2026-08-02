package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupDocsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupDocsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupDocsDto[] $VALUES;
    public static final Parcelable.Creator<GroupsGroupDocsDto> CREATOR;

    @pmi0("0")
    public static final GroupsGroupDocsDto DISABLED;

    @pmi0("2")
    public static final GroupsGroupDocsDto LIMITED;

    @pmi0("1")
    public static final GroupsGroupDocsDto OPEN;
    private final int value;

    /* compiled from: GroupsGroupDocsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupDocsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDocsDto createFromParcel(Parcel parcel) {
            return GroupsGroupDocsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDocsDto[] newArray(int i) {
            return new GroupsGroupDocsDto[i];
        }
    }

    static {
        GroupsGroupDocsDto groupsGroupDocsDto = new GroupsGroupDocsDto("DISABLED", 0, 0);
        DISABLED = groupsGroupDocsDto;
        GroupsGroupDocsDto groupsGroupDocsDto2 = new GroupsGroupDocsDto("OPEN", 1, 1);
        OPEN = groupsGroupDocsDto2;
        GroupsGroupDocsDto groupsGroupDocsDto3 = new GroupsGroupDocsDto("LIMITED", 2, 2);
        LIMITED = groupsGroupDocsDto3;
        GroupsGroupDocsDto[] groupsGroupDocsDtoArr = {groupsGroupDocsDto, groupsGroupDocsDto2, groupsGroupDocsDto3};
        $VALUES = groupsGroupDocsDtoArr;
        $ENTRIES = new asp(groupsGroupDocsDtoArr);
        CREATOR = new a();
    }

    private GroupsGroupDocsDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupDocsDto valueOf(String str) {
        return (GroupsGroupDocsDto) Enum.valueOf(GroupsGroupDocsDto.class, str);
    }

    public static GroupsGroupDocsDto[] values() {
        return (GroupsGroupDocsDto[]) $VALUES.clone();
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
