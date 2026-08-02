package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupCallsToCommunityPrivacyDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupCallsToCommunityPrivacyDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupCallsToCommunityPrivacyDto[] $VALUES;

    @pmi0("all_users")
    public static final GroupsGroupCallsToCommunityPrivacyDto ALL_USERS;
    public static final Parcelable.Creator<GroupsGroupCallsToCommunityPrivacyDto> CREATOR;

    @pmi0("subscribers")
    public static final GroupsGroupCallsToCommunityPrivacyDto SUBSCRIBERS;
    private final String value;

    /* compiled from: GroupsGroupCallsToCommunityPrivacyDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupCallsToCommunityPrivacyDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupCallsToCommunityPrivacyDto createFromParcel(Parcel parcel) {
            return GroupsGroupCallsToCommunityPrivacyDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupCallsToCommunityPrivacyDto[] newArray(int i) {
            return new GroupsGroupCallsToCommunityPrivacyDto[i];
        }
    }

    static {
        GroupsGroupCallsToCommunityPrivacyDto groupsGroupCallsToCommunityPrivacyDto = new GroupsGroupCallsToCommunityPrivacyDto("ALL_USERS", 0, "all_users");
        ALL_USERS = groupsGroupCallsToCommunityPrivacyDto;
        GroupsGroupCallsToCommunityPrivacyDto groupsGroupCallsToCommunityPrivacyDto2 = new GroupsGroupCallsToCommunityPrivacyDto("SUBSCRIBERS", 1, "subscribers");
        SUBSCRIBERS = groupsGroupCallsToCommunityPrivacyDto2;
        GroupsGroupCallsToCommunityPrivacyDto[] groupsGroupCallsToCommunityPrivacyDtoArr = {groupsGroupCallsToCommunityPrivacyDto, groupsGroupCallsToCommunityPrivacyDto2};
        $VALUES = groupsGroupCallsToCommunityPrivacyDtoArr;
        $ENTRIES = new asp(groupsGroupCallsToCommunityPrivacyDtoArr);
        CREATOR = new a();
    }

    private GroupsGroupCallsToCommunityPrivacyDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsGroupCallsToCommunityPrivacyDto valueOf(String str) {
        return (GroupsGroupCallsToCommunityPrivacyDto) Enum.valueOf(GroupsGroupCallsToCommunityPrivacyDto.class, str);
    }

    public static GroupsGroupCallsToCommunityPrivacyDto[] values() {
        return (GroupsGroupCallsToCommunityPrivacyDto[]) $VALUES.clone();
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
