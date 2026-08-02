package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsFilterDto.kt */
/* loaded from: classes14.dex */
public final class GroupsFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsFilterDto[] $VALUES;

    @pmi0("admin")
    public static final GroupsFilterDto ADMIN;

    @pmi0(X3.i.F0)
    public static final GroupsFilterDto ADVERTISER;

    @pmi0("can_enable_notifications")
    public static final GroupsFilterDto CAN_ENABLE_NOTIFICATIONS;

    @pmi0("can_post_clips")
    public static final GroupsFilterDto CAN_POST_CLIPS;
    public static final Parcelable.Creator<GroupsFilterDto> CREATOR;

    @pmi0("editor")
    public static final GroupsFilterDto EDITOR;

    @pmi0("enabled_notifications")
    public static final GroupsFilterDto ENABLED_NOTIFICATIONS;

    @pmi0("events")
    public static final GroupsFilterDto EVENTS;

    @pmi0("groups")
    public static final GroupsFilterDto GROUPS;

    @pmi0("has_addresses")
    public static final GroupsFilterDto HAS_ADDRESSES;

    @pmi0("has_video")
    public static final GroupsFilterDto HAS_VIDEO;

    @pmi0("moder")
    public static final GroupsFilterDto MODER;

    @pmi0("possible_events_organizers")
    public static final GroupsFilterDto POSSIBLE_EVENTS_ORGANIZERS;

    @pmi0("publics")
    public static final GroupsFilterDto PUBLICS;

    @pmi0("stories_not_pinned")
    public static final GroupsFilterDto STORIES_NOT_PINNED;

    @pmi0("with_messages")
    public static final GroupsFilterDto WITH_MESSAGES;
    private final String value;

    /* compiled from: GroupsFilterDto.kt */
    public static final class a implements Parcelable.Creator<GroupsFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsFilterDto createFromParcel(Parcel parcel) {
            return GroupsFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsFilterDto[] newArray(int i) {
            return new GroupsFilterDto[i];
        }
    }

    static {
        GroupsFilterDto groupsFilterDto = new GroupsFilterDto("ADMIN", 0, "admin");
        ADMIN = groupsFilterDto;
        GroupsFilterDto groupsFilterDto2 = new GroupsFilterDto("EDITOR", 1, "editor");
        EDITOR = groupsFilterDto2;
        GroupsFilterDto groupsFilterDto3 = new GroupsFilterDto("MODER", 2, "moder");
        MODER = groupsFilterDto3;
        GroupsFilterDto groupsFilterDto4 = new GroupsFilterDto("ADVERTISER", 3, X3.i.F0);
        ADVERTISER = groupsFilterDto4;
        GroupsFilterDto groupsFilterDto5 = new GroupsFilterDto("ENABLED_NOTIFICATIONS", 4, "enabled_notifications");
        ENABLED_NOTIFICATIONS = groupsFilterDto5;
        GroupsFilterDto groupsFilterDto6 = new GroupsFilterDto("CAN_ENABLE_NOTIFICATIONS", 5, "can_enable_notifications");
        CAN_ENABLE_NOTIFICATIONS = groupsFilterDto6;
        GroupsFilterDto groupsFilterDto7 = new GroupsFilterDto("STORIES_NOT_PINNED", 6, "stories_not_pinned");
        STORIES_NOT_PINNED = groupsFilterDto7;
        GroupsFilterDto groupsFilterDto8 = new GroupsFilterDto("GROUPS", 7, "groups");
        GROUPS = groupsFilterDto8;
        GroupsFilterDto groupsFilterDto9 = new GroupsFilterDto("PUBLICS", 8, "publics");
        PUBLICS = groupsFilterDto9;
        GroupsFilterDto groupsFilterDto10 = new GroupsFilterDto("EVENTS", 9, "events");
        EVENTS = groupsFilterDto10;
        GroupsFilterDto groupsFilterDto11 = new GroupsFilterDto("HAS_ADDRESSES", 10, "has_addresses");
        HAS_ADDRESSES = groupsFilterDto11;
        GroupsFilterDto groupsFilterDto12 = new GroupsFilterDto("CAN_POST_CLIPS", 11, "can_post_clips");
        CAN_POST_CLIPS = groupsFilterDto12;
        GroupsFilterDto groupsFilterDto13 = new GroupsFilterDto("WITH_MESSAGES", 12, "with_messages");
        WITH_MESSAGES = groupsFilterDto13;
        GroupsFilterDto groupsFilterDto14 = new GroupsFilterDto("HAS_VIDEO", 13, "has_video");
        HAS_VIDEO = groupsFilterDto14;
        GroupsFilterDto groupsFilterDto15 = new GroupsFilterDto("POSSIBLE_EVENTS_ORGANIZERS", 14, "possible_events_organizers");
        POSSIBLE_EVENTS_ORGANIZERS = groupsFilterDto15;
        GroupsFilterDto[] groupsFilterDtoArr = {groupsFilterDto, groupsFilterDto2, groupsFilterDto3, groupsFilterDto4, groupsFilterDto5, groupsFilterDto6, groupsFilterDto7, groupsFilterDto8, groupsFilterDto9, groupsFilterDto10, groupsFilterDto11, groupsFilterDto12, groupsFilterDto13, groupsFilterDto14, groupsFilterDto15};
        $VALUES = groupsFilterDtoArr;
        $ENTRIES = new asp(groupsFilterDtoArr);
        CREATOR = new a();
    }

    private GroupsFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsFilterDto valueOf(String str) {
        return (GroupsFilterDto) Enum.valueOf(GroupsFilterDto.class, str);
    }

    public static GroupsFilterDto[] values() {
        return (GroupsFilterDto[]) $VALUES.clone();
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
