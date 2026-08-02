package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSearchTypeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSearchTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSearchTypeDto[] $VALUES;
    public static final Parcelable.Creator<GroupsSearchTypeDto> CREATOR;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    public static final GroupsSearchTypeDto EVENT;

    @pmi0("group")
    public static final GroupsSearchTypeDto GROUP;

    @pmi0("page")
    public static final GroupsSearchTypeDto PAGE;
    private final String value;

    /* compiled from: GroupsSearchTypeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSearchTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSearchTypeDto createFromParcel(Parcel parcel) {
            return GroupsSearchTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSearchTypeDto[] newArray(int i) {
            return new GroupsSearchTypeDto[i];
        }
    }

    static {
        GroupsSearchTypeDto groupsSearchTypeDto = new GroupsSearchTypeDto("EVENT", 0, NotificationCompat.CATEGORY_EVENT);
        EVENT = groupsSearchTypeDto;
        GroupsSearchTypeDto groupsSearchTypeDto2 = new GroupsSearchTypeDto("GROUP", 1, "group");
        GROUP = groupsSearchTypeDto2;
        GroupsSearchTypeDto groupsSearchTypeDto3 = new GroupsSearchTypeDto("PAGE", 2, "page");
        PAGE = groupsSearchTypeDto3;
        GroupsSearchTypeDto[] groupsSearchTypeDtoArr = {groupsSearchTypeDto, groupsSearchTypeDto2, groupsSearchTypeDto3};
        $VALUES = groupsSearchTypeDtoArr;
        $ENTRIES = new asp(groupsSearchTypeDtoArr);
        CREATOR = new a();
    }

    private GroupsSearchTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsSearchTypeDto valueOf(String str) {
        return (GroupsSearchTypeDto) Enum.valueOf(GroupsSearchTypeDto.class, str);
    }

    public static GroupsSearchTypeDto[] values() {
        return (GroupsSearchTypeDto[]) $VALUES.clone();
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
