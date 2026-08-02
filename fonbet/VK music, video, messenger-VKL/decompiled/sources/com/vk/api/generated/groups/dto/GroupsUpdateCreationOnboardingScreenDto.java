package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsUpdateCreationOnboardingScreenDto.kt */
/* loaded from: classes14.dex */
public final class GroupsUpdateCreationOnboardingScreenDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsUpdateCreationOnboardingScreenDto[] $VALUES;
    public static final Parcelable.Creator<GroupsUpdateCreationOnboardingScreenDto> CREATOR;

    @pmi0("screen_clips")
    public static final GroupsUpdateCreationOnboardingScreenDto SCREEN_CLIPS;

    @pmi0("screen_design")
    public static final GroupsUpdateCreationOnboardingScreenDto SCREEN_DESIGN;

    @pmi0("screen_finish")
    public static final GroupsUpdateCreationOnboardingScreenDto SCREEN_FINISH;

    @pmi0("screen_market_items")
    public static final GroupsUpdateCreationOnboardingScreenDto SCREEN_MARKET_ITEMS;

    @pmi0("screen_posting")
    public static final GroupsUpdateCreationOnboardingScreenDto SCREEN_POSTING;

    @pmi0("screen_regular_posting")
    public static final GroupsUpdateCreationOnboardingScreenDto SCREEN_REGULAR_POSTING;

    @pmi0("screen_subscribers")
    public static final GroupsUpdateCreationOnboardingScreenDto SCREEN_SUBSCRIBERS;
    private final String value;

    /* compiled from: GroupsUpdateCreationOnboardingScreenDto.kt */
    public static final class a implements Parcelable.Creator<GroupsUpdateCreationOnboardingScreenDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsUpdateCreationOnboardingScreenDto createFromParcel(Parcel parcel) {
            return GroupsUpdateCreationOnboardingScreenDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsUpdateCreationOnboardingScreenDto[] newArray(int i) {
            return new GroupsUpdateCreationOnboardingScreenDto[i];
        }
    }

    static {
        GroupsUpdateCreationOnboardingScreenDto groupsUpdateCreationOnboardingScreenDto = new GroupsUpdateCreationOnboardingScreenDto("SCREEN_CLIPS", 0, "screen_clips");
        SCREEN_CLIPS = groupsUpdateCreationOnboardingScreenDto;
        GroupsUpdateCreationOnboardingScreenDto groupsUpdateCreationOnboardingScreenDto2 = new GroupsUpdateCreationOnboardingScreenDto("SCREEN_DESIGN", 1, "screen_design");
        SCREEN_DESIGN = groupsUpdateCreationOnboardingScreenDto2;
        GroupsUpdateCreationOnboardingScreenDto groupsUpdateCreationOnboardingScreenDto3 = new GroupsUpdateCreationOnboardingScreenDto("SCREEN_FINISH", 2, "screen_finish");
        SCREEN_FINISH = groupsUpdateCreationOnboardingScreenDto3;
        GroupsUpdateCreationOnboardingScreenDto groupsUpdateCreationOnboardingScreenDto4 = new GroupsUpdateCreationOnboardingScreenDto("SCREEN_MARKET_ITEMS", 3, "screen_market_items");
        SCREEN_MARKET_ITEMS = groupsUpdateCreationOnboardingScreenDto4;
        GroupsUpdateCreationOnboardingScreenDto groupsUpdateCreationOnboardingScreenDto5 = new GroupsUpdateCreationOnboardingScreenDto("SCREEN_POSTING", 4, "screen_posting");
        SCREEN_POSTING = groupsUpdateCreationOnboardingScreenDto5;
        GroupsUpdateCreationOnboardingScreenDto groupsUpdateCreationOnboardingScreenDto6 = new GroupsUpdateCreationOnboardingScreenDto("SCREEN_REGULAR_POSTING", 5, "screen_regular_posting");
        SCREEN_REGULAR_POSTING = groupsUpdateCreationOnboardingScreenDto6;
        GroupsUpdateCreationOnboardingScreenDto groupsUpdateCreationOnboardingScreenDto7 = new GroupsUpdateCreationOnboardingScreenDto("SCREEN_SUBSCRIBERS", 6, "screen_subscribers");
        SCREEN_SUBSCRIBERS = groupsUpdateCreationOnboardingScreenDto7;
        GroupsUpdateCreationOnboardingScreenDto[] groupsUpdateCreationOnboardingScreenDtoArr = {groupsUpdateCreationOnboardingScreenDto, groupsUpdateCreationOnboardingScreenDto2, groupsUpdateCreationOnboardingScreenDto3, groupsUpdateCreationOnboardingScreenDto4, groupsUpdateCreationOnboardingScreenDto5, groupsUpdateCreationOnboardingScreenDto6, groupsUpdateCreationOnboardingScreenDto7};
        $VALUES = groupsUpdateCreationOnboardingScreenDtoArr;
        $ENTRIES = new asp(groupsUpdateCreationOnboardingScreenDtoArr);
        CREATOR = new a();
    }

    private GroupsUpdateCreationOnboardingScreenDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<GroupsUpdateCreationOnboardingScreenDto> i() {
        return $ENTRIES;
    }

    public static GroupsUpdateCreationOnboardingScreenDto valueOf(String str) {
        return (GroupsUpdateCreationOnboardingScreenDto) Enum.valueOf(GroupsUpdateCreationOnboardingScreenDto.class, str);
    }

    public static GroupsUpdateCreationOnboardingScreenDto[] values() {
        return (GroupsUpdateCreationOnboardingScreenDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
