package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsEditCallsToCommunityPrivacyDto.kt */
/* loaded from: classes14.dex */
public final class GroupsEditCallsToCommunityPrivacyDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsEditCallsToCommunityPrivacyDto[] $VALUES;

    @pmi0("all_users")
    public static final GroupsEditCallsToCommunityPrivacyDto ALL_USERS;
    public static final Parcelable.Creator<GroupsEditCallsToCommunityPrivacyDto> CREATOR;

    @pmi0("subscribers")
    public static final GroupsEditCallsToCommunityPrivacyDto SUBSCRIBERS;
    private final String value;

    /* compiled from: GroupsEditCallsToCommunityPrivacyDto.kt */
    public static final class a implements Parcelable.Creator<GroupsEditCallsToCommunityPrivacyDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsEditCallsToCommunityPrivacyDto createFromParcel(Parcel parcel) {
            return GroupsEditCallsToCommunityPrivacyDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsEditCallsToCommunityPrivacyDto[] newArray(int i) {
            return new GroupsEditCallsToCommunityPrivacyDto[i];
        }
    }

    static {
        GroupsEditCallsToCommunityPrivacyDto groupsEditCallsToCommunityPrivacyDto = new GroupsEditCallsToCommunityPrivacyDto("ALL_USERS", 0, "all_users");
        ALL_USERS = groupsEditCallsToCommunityPrivacyDto;
        GroupsEditCallsToCommunityPrivacyDto groupsEditCallsToCommunityPrivacyDto2 = new GroupsEditCallsToCommunityPrivacyDto("SUBSCRIBERS", 1, "subscribers");
        SUBSCRIBERS = groupsEditCallsToCommunityPrivacyDto2;
        GroupsEditCallsToCommunityPrivacyDto[] groupsEditCallsToCommunityPrivacyDtoArr = {groupsEditCallsToCommunityPrivacyDto, groupsEditCallsToCommunityPrivacyDto2};
        $VALUES = groupsEditCallsToCommunityPrivacyDtoArr;
        $ENTRIES = new asp(groupsEditCallsToCommunityPrivacyDtoArr);
        CREATOR = new a();
    }

    private GroupsEditCallsToCommunityPrivacyDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsEditCallsToCommunityPrivacyDto valueOf(String str) {
        return (GroupsEditCallsToCommunityPrivacyDto) Enum.valueOf(GroupsEditCallsToCommunityPrivacyDto.class, str);
    }

    public static GroupsEditCallsToCommunityPrivacyDto[] values() {
        return (GroupsEditCallsToCommunityPrivacyDto[]) $VALUES.clone();
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
