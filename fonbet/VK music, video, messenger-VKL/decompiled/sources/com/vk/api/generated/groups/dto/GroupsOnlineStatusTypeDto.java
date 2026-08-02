package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.eok;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsOnlineStatusTypeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsOnlineStatusTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsOnlineStatusTypeDto[] $VALUES;

    @pmi0("answer_mark")
    public static final GroupsOnlineStatusTypeDto ANSWER_MARK;
    public static final Parcelable.Creator<GroupsOnlineStatusTypeDto> CREATOR;

    @pmi0("none")
    public static final GroupsOnlineStatusTypeDto NONE;

    @pmi0(eok.ONLINE_EXTRAS_KEY)
    public static final GroupsOnlineStatusTypeDto ONLINE;
    private final String value;

    /* compiled from: GroupsOnlineStatusTypeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsOnlineStatusTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsOnlineStatusTypeDto createFromParcel(Parcel parcel) {
            return GroupsOnlineStatusTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsOnlineStatusTypeDto[] newArray(int i) {
            return new GroupsOnlineStatusTypeDto[i];
        }
    }

    static {
        GroupsOnlineStatusTypeDto groupsOnlineStatusTypeDto = new GroupsOnlineStatusTypeDto("NONE", 0, "none");
        NONE = groupsOnlineStatusTypeDto;
        GroupsOnlineStatusTypeDto groupsOnlineStatusTypeDto2 = new GroupsOnlineStatusTypeDto("ONLINE", 1, eok.ONLINE_EXTRAS_KEY);
        ONLINE = groupsOnlineStatusTypeDto2;
        GroupsOnlineStatusTypeDto groupsOnlineStatusTypeDto3 = new GroupsOnlineStatusTypeDto("ANSWER_MARK", 2, "answer_mark");
        ANSWER_MARK = groupsOnlineStatusTypeDto3;
        GroupsOnlineStatusTypeDto[] groupsOnlineStatusTypeDtoArr = {groupsOnlineStatusTypeDto, groupsOnlineStatusTypeDto2, groupsOnlineStatusTypeDto3};
        $VALUES = groupsOnlineStatusTypeDtoArr;
        $ENTRIES = new asp(groupsOnlineStatusTypeDtoArr);
        CREATOR = new a();
    }

    private GroupsOnlineStatusTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsOnlineStatusTypeDto valueOf(String str) {
        return (GroupsOnlineStatusTypeDto) Enum.valueOf(GroupsOnlineStatusTypeDto.class, str);
    }

    public static GroupsOnlineStatusTypeDto[] values() {
        return (GroupsOnlineStatusTypeDto[]) $VALUES.clone();
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
