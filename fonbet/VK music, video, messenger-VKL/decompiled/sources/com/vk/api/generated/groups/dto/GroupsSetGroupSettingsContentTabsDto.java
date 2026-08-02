package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSetGroupSettingsContentTabsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSetGroupSettingsContentTabsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSetGroupSettingsContentTabsDto[] $VALUES;

    @pmi0("addresses")
    public static final GroupsSetGroupSettingsContentTabsDto ADDRESSES;

    @pmi0("articles")
    public static final GroupsSetGroupSettingsContentTabsDto ARTICLES;

    @pmi0("audios")
    public static final GroupsSetGroupSettingsContentTabsDto AUDIOS;

    @pmi0("chats")
    public static final GroupsSetGroupSettingsContentTabsDto CHATS;

    @pmi0("classifieds")
    public static final GroupsSetGroupSettingsContentTabsDto CLASSIFIEDS;
    public static final Parcelable.Creator<GroupsSetGroupSettingsContentTabsDto> CREATOR;

    @pmi0("discussions")
    public static final GroupsSetGroupSettingsContentTabsDto DISCUSSIONS;

    @pmi0("donut_wall")
    public static final GroupsSetGroupSettingsContentTabsDto DONUT_WALL;

    @pmi0("events")
    public static final GroupsSetGroupSettingsContentTabsDto EVENTS;

    @pmi0("files")
    public static final GroupsSetGroupSettingsContentTabsDto FILES;

    @pmi0("market")
    public static final GroupsSetGroupSettingsContentTabsDto MARKET;

    @pmi0("narratives")
    public static final GroupsSetGroupSettingsContentTabsDto NARRATIVES;

    @pmi0("photos")
    public static final GroupsSetGroupSettingsContentTabsDto PHOTOS;

    @pmi0("podcasts")
    public static final GroupsSetGroupSettingsContentTabsDto PODCASTS;

    @pmi0(SignalingProtocol.KEY_ROOMS)
    public static final GroupsSetGroupSettingsContentTabsDto ROOMS;

    @pmi0("services")
    public static final GroupsSetGroupSettingsContentTabsDto SERVICES;

    @pmi0("short_videos")
    public static final GroupsSetGroupSettingsContentTabsDto SHORT_VIDEOS;

    @pmi0("textlives")
    public static final GroupsSetGroupSettingsContentTabsDto TEXTLIVES;

    @pmi0("videos")
    public static final GroupsSetGroupSettingsContentTabsDto VIDEOS;

    @pmi0("wall")
    public static final GroupsSetGroupSettingsContentTabsDto WALL;
    private final String value;

    /* compiled from: GroupsSetGroupSettingsContentTabsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSetGroupSettingsContentTabsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsContentTabsDto createFromParcel(Parcel parcel) {
            return GroupsSetGroupSettingsContentTabsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsContentTabsDto[] newArray(int i) {
            return new GroupsSetGroupSettingsContentTabsDto[i];
        }
    }

    static {
        GroupsSetGroupSettingsContentTabsDto groupsSetGroupSettingsContentTabsDto = new GroupsSetGroupSettingsContentTabsDto("ADDRESSES", 0, "addresses");
        ADDRESSES = groupsSetGroupSettingsContentTabsDto;
        GroupsSetGroupSettingsContentTabsDto groupsSetGroupSettingsContentTabsDto2 = new GroupsSetGroupSettingsContentTabsDto("ARTICLES", 1, "articles");
        ARTICLES = groupsSetGroupSettingsContentTabsDto2;
        GroupsSetGroupSettingsContentTabsDto groupsSetGroupSettingsContentTabsDto3 = new GroupsSetGroupSettingsContentTabsDto("AUDIOS", 2, "audios");
        AUDIOS = groupsSetGroupSettingsContentTabsDto3;
        GroupsSetGroupSettingsContentTabsDto groupsSetGroupSettingsContentTabsDto4 = new GroupsSetGroupSettingsContentTabsDto("CHATS", 3, "chats");
        CHATS = groupsSetGroupSettingsContentTabsDto4;
        GroupsSetGroupSettingsContentTabsDto groupsSetGroupSettingsContentTabsDto5 = new GroupsSetGroupSettingsContentTabsDto("CLASSIFIEDS", 4, "classifieds");
        CLASSIFIEDS = groupsSetGroupSettingsContentTabsDto5;
        GroupsSetGroupSettingsContentTabsDto groupsSetGroupSettingsContentTabsDto6 = new GroupsSetGroupSettingsContentTabsDto("DISCUSSIONS", 5, "discussions");
        DISCUSSIONS = groupsSetGroupSettingsContentTabsDto6;
        GroupsSetGroupSettingsContentTabsDto groupsSetGroupSettingsContentTabsDto7 = new GroupsSetGroupSettingsContentTabsDto("DONUT_WALL", 6, "donut_wall");
        DONUT_WALL = groupsSetGroupSettingsContentTabsDto7;
        GroupsSetGroupSettingsContentTabsDto groupsSetGroupSettingsContentTabsDto8 = new GroupsSetGroupSettingsContentTabsDto("EVENTS", 7, "events");
        EVENTS = groupsSetGroupSettingsContentTabsDto8;
        GroupsSetGroupSettingsContentTabsDto groupsSetGroupSettingsContentTabsDto9 = new GroupsSetGroupSettingsContentTabsDto("FILES", 8, "files");
        FILES = groupsSetGroupSettingsContentTabsDto9;
        GroupsSetGroupSettingsContentTabsDto groupsSetGroupSettingsContentTabsDto10 = new GroupsSetGroupSettingsContentTabsDto("MARKET", 9, "market");
        MARKET = groupsSetGroupSettingsContentTabsDto10;
        GroupsSetGroupSettingsContentTabsDto groupsSetGroupSettingsContentTabsDto11 = new GroupsSetGroupSettingsContentTabsDto("NARRATIVES", 10, "narratives");
        NARRATIVES = groupsSetGroupSettingsContentTabsDto11;
        GroupsSetGroupSettingsContentTabsDto groupsSetGroupSettingsContentTabsDto12 = new GroupsSetGroupSettingsContentTabsDto("PHOTOS", 11, "photos");
        PHOTOS = groupsSetGroupSettingsContentTabsDto12;
        GroupsSetGroupSettingsContentTabsDto groupsSetGroupSettingsContentTabsDto13 = new GroupsSetGroupSettingsContentTabsDto("PODCASTS", 12, "podcasts");
        PODCASTS = groupsSetGroupSettingsContentTabsDto13;
        GroupsSetGroupSettingsContentTabsDto groupsSetGroupSettingsContentTabsDto14 = new GroupsSetGroupSettingsContentTabsDto("ROOMS", 13, SignalingProtocol.KEY_ROOMS);
        ROOMS = groupsSetGroupSettingsContentTabsDto14;
        GroupsSetGroupSettingsContentTabsDto groupsSetGroupSettingsContentTabsDto15 = new GroupsSetGroupSettingsContentTabsDto("SERVICES", 14, "services");
        SERVICES = groupsSetGroupSettingsContentTabsDto15;
        GroupsSetGroupSettingsContentTabsDto groupsSetGroupSettingsContentTabsDto16 = new GroupsSetGroupSettingsContentTabsDto("SHORT_VIDEOS", 15, "short_videos");
        SHORT_VIDEOS = groupsSetGroupSettingsContentTabsDto16;
        GroupsSetGroupSettingsContentTabsDto groupsSetGroupSettingsContentTabsDto17 = new GroupsSetGroupSettingsContentTabsDto("TEXTLIVES", 16, "textlives");
        TEXTLIVES = groupsSetGroupSettingsContentTabsDto17;
        GroupsSetGroupSettingsContentTabsDto groupsSetGroupSettingsContentTabsDto18 = new GroupsSetGroupSettingsContentTabsDto("VIDEOS", 17, "videos");
        VIDEOS = groupsSetGroupSettingsContentTabsDto18;
        GroupsSetGroupSettingsContentTabsDto groupsSetGroupSettingsContentTabsDto19 = new GroupsSetGroupSettingsContentTabsDto("WALL", 18, "wall");
        WALL = groupsSetGroupSettingsContentTabsDto19;
        GroupsSetGroupSettingsContentTabsDto[] groupsSetGroupSettingsContentTabsDtoArr = {groupsSetGroupSettingsContentTabsDto, groupsSetGroupSettingsContentTabsDto2, groupsSetGroupSettingsContentTabsDto3, groupsSetGroupSettingsContentTabsDto4, groupsSetGroupSettingsContentTabsDto5, groupsSetGroupSettingsContentTabsDto6, groupsSetGroupSettingsContentTabsDto7, groupsSetGroupSettingsContentTabsDto8, groupsSetGroupSettingsContentTabsDto9, groupsSetGroupSettingsContentTabsDto10, groupsSetGroupSettingsContentTabsDto11, groupsSetGroupSettingsContentTabsDto12, groupsSetGroupSettingsContentTabsDto13, groupsSetGroupSettingsContentTabsDto14, groupsSetGroupSettingsContentTabsDto15, groupsSetGroupSettingsContentTabsDto16, groupsSetGroupSettingsContentTabsDto17, groupsSetGroupSettingsContentTabsDto18, groupsSetGroupSettingsContentTabsDto19};
        $VALUES = groupsSetGroupSettingsContentTabsDtoArr;
        $ENTRIES = new asp(groupsSetGroupSettingsContentTabsDtoArr);
        CREATOR = new a();
    }

    private GroupsSetGroupSettingsContentTabsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsSetGroupSettingsContentTabsDto valueOf(String str) {
        return (GroupsSetGroupSettingsContentTabsDto) Enum.valueOf(GroupsSetGroupSettingsContentTabsDto.class, str);
    }

    public static GroupsSetGroupSettingsContentTabsDto[] values() {
        return (GroupsSetGroupSettingsContentTabsDto[]) $VALUES.clone();
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
