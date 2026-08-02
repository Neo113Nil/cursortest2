package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupDonutSubscriptionsStatisticTypeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupDonutSubscriptionsStatisticTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupDonutSubscriptionsStatisticTypeDto[] $VALUES;
    public static final Parcelable.Creator<GroupsGroupDonutSubscriptionsStatisticTypeDto> CREATOR;

    @pmi0("friends")
    public static final GroupsGroupDonutSubscriptionsStatisticTypeDto FRIENDS;

    @pmi0("subscribers")
    public static final GroupsGroupDonutSubscriptionsStatisticTypeDto SUBSCRIBERS;
    private final String value;

    /* compiled from: GroupsGroupDonutSubscriptionsStatisticTypeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupDonutSubscriptionsStatisticTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutSubscriptionsStatisticTypeDto createFromParcel(Parcel parcel) {
            return GroupsGroupDonutSubscriptionsStatisticTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutSubscriptionsStatisticTypeDto[] newArray(int i) {
            return new GroupsGroupDonutSubscriptionsStatisticTypeDto[i];
        }
    }

    static {
        GroupsGroupDonutSubscriptionsStatisticTypeDto groupsGroupDonutSubscriptionsStatisticTypeDto = new GroupsGroupDonutSubscriptionsStatisticTypeDto("SUBSCRIBERS", 0, "subscribers");
        SUBSCRIBERS = groupsGroupDonutSubscriptionsStatisticTypeDto;
        GroupsGroupDonutSubscriptionsStatisticTypeDto groupsGroupDonutSubscriptionsStatisticTypeDto2 = new GroupsGroupDonutSubscriptionsStatisticTypeDto(Privacy.FRIENDS, 1, "friends");
        FRIENDS = groupsGroupDonutSubscriptionsStatisticTypeDto2;
        GroupsGroupDonutSubscriptionsStatisticTypeDto[] groupsGroupDonutSubscriptionsStatisticTypeDtoArr = {groupsGroupDonutSubscriptionsStatisticTypeDto, groupsGroupDonutSubscriptionsStatisticTypeDto2};
        $VALUES = groupsGroupDonutSubscriptionsStatisticTypeDtoArr;
        $ENTRIES = new asp(groupsGroupDonutSubscriptionsStatisticTypeDtoArr);
        CREATOR = new a();
    }

    private GroupsGroupDonutSubscriptionsStatisticTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsGroupDonutSubscriptionsStatisticTypeDto valueOf(String str) {
        return (GroupsGroupDonutSubscriptionsStatisticTypeDto) Enum.valueOf(GroupsGroupDonutSubscriptionsStatisticTypeDto.class, str);
    }

    public static GroupsGroupDonutSubscriptionsStatisticTypeDto[] values() {
        return (GroupsGroupDonutSubscriptionsStatisticTypeDto[]) $VALUES.clone();
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
