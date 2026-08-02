package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupTypeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupTypeDto[] $VALUES;
    public static final Parcelable.Creator<GroupsGroupTypeDto> CREATOR;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    public static final GroupsGroupTypeDto EVENT;

    @pmi0("group")
    public static final GroupsGroupTypeDto GROUP;

    @pmi0("page")
    public static final GroupsGroupTypeDto PAGE;
    private final String value;

    /* compiled from: GroupsGroupTypeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupTypeDto createFromParcel(Parcel parcel) {
            return GroupsGroupTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupTypeDto[] newArray(int i) {
            return new GroupsGroupTypeDto[i];
        }
    }

    static {
        GroupsGroupTypeDto groupsGroupTypeDto = new GroupsGroupTypeDto("GROUP", 0, "group");
        GROUP = groupsGroupTypeDto;
        GroupsGroupTypeDto groupsGroupTypeDto2 = new GroupsGroupTypeDto("PAGE", 1, "page");
        PAGE = groupsGroupTypeDto2;
        GroupsGroupTypeDto groupsGroupTypeDto3 = new GroupsGroupTypeDto("EVENT", 2, NotificationCompat.CATEGORY_EVENT);
        EVENT = groupsGroupTypeDto3;
        GroupsGroupTypeDto[] groupsGroupTypeDtoArr = {groupsGroupTypeDto, groupsGroupTypeDto2, groupsGroupTypeDto3};
        $VALUES = groupsGroupTypeDtoArr;
        $ENTRIES = new asp(groupsGroupTypeDtoArr);
        CREATOR = new a();
    }

    private GroupsGroupTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsGroupTypeDto valueOf(String str) {
        return (GroupsGroupTypeDto) Enum.valueOf(GroupsGroupTypeDto.class, str);
    }

    public static GroupsGroupTypeDto[] values() {
        return (GroupsGroupTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
