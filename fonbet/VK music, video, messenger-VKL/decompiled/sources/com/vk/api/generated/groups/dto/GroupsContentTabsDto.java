package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsContentTabsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsContentTabsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsContentTabsDto[] $VALUES;

    @pmi0("addresses")
    public static final GroupsContentTabsDto ADDRESSES;

    @pmi0("articles")
    public static final GroupsContentTabsDto ARTICLES;

    @pmi0("audios")
    public static final GroupsContentTabsDto AUDIOS;

    @pmi0("chats")
    public static final GroupsContentTabsDto CHATS;

    @pmi0("classifieds")
    public static final GroupsContentTabsDto CLASSIFIEDS;
    public static final Parcelable.Creator<GroupsContentTabsDto> CREATOR;

    @pmi0("discussions")
    public static final GroupsContentTabsDto DISCUSSIONS;

    @pmi0("donut_wall")
    public static final GroupsContentTabsDto DONUT_WALL;

    @pmi0("events")
    public static final GroupsContentTabsDto EVENTS;

    @pmi0("files")
    public static final GroupsContentTabsDto FILES;

    @pmi0("market")
    public static final GroupsContentTabsDto MARKET;

    @pmi0("narratives")
    public static final GroupsContentTabsDto NARRATIVES;

    @pmi0("photos")
    public static final GroupsContentTabsDto PHOTOS;

    @pmi0("podcasts")
    public static final GroupsContentTabsDto PODCASTS;

    @pmi0(SignalingProtocol.KEY_ROOMS)
    public static final GroupsContentTabsDto ROOMS;

    @pmi0("services")
    public static final GroupsContentTabsDto SERVICES;

    @pmi0("short_videos")
    public static final GroupsContentTabsDto SHORT_VIDEOS;

    @pmi0("textlives")
    public static final GroupsContentTabsDto TEXTLIVES;

    @pmi0("videos")
    public static final GroupsContentTabsDto VIDEOS;

    @pmi0("wall")
    public static final GroupsContentTabsDto WALL;
    private final String value;

    /* compiled from: GroupsContentTabsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsContentTabsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsContentTabsDto createFromParcel(Parcel parcel) {
            return GroupsContentTabsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsContentTabsDto[] newArray(int i) {
            return new GroupsContentTabsDto[i];
        }
    }

    static {
        GroupsContentTabsDto groupsContentTabsDto = new GroupsContentTabsDto("PHOTOS", 0, "photos");
        PHOTOS = groupsContentTabsDto;
        GroupsContentTabsDto groupsContentTabsDto2 = new GroupsContentTabsDto("VIDEOS", 1, "videos");
        VIDEOS = groupsContentTabsDto2;
        GroupsContentTabsDto groupsContentTabsDto3 = new GroupsContentTabsDto("AUDIOS", 2, "audios");
        AUDIOS = groupsContentTabsDto3;
        GroupsContentTabsDto groupsContentTabsDto4 = new GroupsContentTabsDto("CHATS", 3, "chats");
        CHATS = groupsContentTabsDto4;
        GroupsContentTabsDto groupsContentTabsDto5 = new GroupsContentTabsDto("ADDRESSES", 4, "addresses");
        ADDRESSES = groupsContentTabsDto5;
        GroupsContentTabsDto groupsContentTabsDto6 = new GroupsContentTabsDto("SHORT_VIDEOS", 5, "short_videos");
        SHORT_VIDEOS = groupsContentTabsDto6;
        GroupsContentTabsDto groupsContentTabsDto7 = new GroupsContentTabsDto("EVENTS", 6, "events");
        EVENTS = groupsContentTabsDto7;
        GroupsContentTabsDto groupsContentTabsDto8 = new GroupsContentTabsDto("FILES", 7, "files");
        FILES = groupsContentTabsDto8;
        GroupsContentTabsDto groupsContentTabsDto9 = new GroupsContentTabsDto("DISCUSSIONS", 8, "discussions");
        DISCUSSIONS = groupsContentTabsDto9;
        GroupsContentTabsDto groupsContentTabsDto10 = new GroupsContentTabsDto("ARTICLES", 9, "articles");
        ARTICLES = groupsContentTabsDto10;
        GroupsContentTabsDto groupsContentTabsDto11 = new GroupsContentTabsDto("NARRATIVES", 10, "narratives");
        NARRATIVES = groupsContentTabsDto11;
        GroupsContentTabsDto groupsContentTabsDto12 = new GroupsContentTabsDto("MARKET", 11, "market");
        MARKET = groupsContentTabsDto12;
        GroupsContentTabsDto groupsContentTabsDto13 = new GroupsContentTabsDto("SERVICES", 12, "services");
        SERVICES = groupsContentTabsDto13;
        GroupsContentTabsDto groupsContentTabsDto14 = new GroupsContentTabsDto("CLASSIFIEDS", 13, "classifieds");
        CLASSIFIEDS = groupsContentTabsDto14;
        GroupsContentTabsDto groupsContentTabsDto15 = new GroupsContentTabsDto("TEXTLIVES", 14, "textlives");
        TEXTLIVES = groupsContentTabsDto15;
        GroupsContentTabsDto groupsContentTabsDto16 = new GroupsContentTabsDto("PODCASTS", 15, "podcasts");
        PODCASTS = groupsContentTabsDto16;
        GroupsContentTabsDto groupsContentTabsDto17 = new GroupsContentTabsDto("ROOMS", 16, SignalingProtocol.KEY_ROOMS);
        ROOMS = groupsContentTabsDto17;
        GroupsContentTabsDto groupsContentTabsDto18 = new GroupsContentTabsDto("WALL", 17, "wall");
        WALL = groupsContentTabsDto18;
        GroupsContentTabsDto groupsContentTabsDto19 = new GroupsContentTabsDto("DONUT_WALL", 18, "donut_wall");
        DONUT_WALL = groupsContentTabsDto19;
        GroupsContentTabsDto[] groupsContentTabsDtoArr = {groupsContentTabsDto, groupsContentTabsDto2, groupsContentTabsDto3, groupsContentTabsDto4, groupsContentTabsDto5, groupsContentTabsDto6, groupsContentTabsDto7, groupsContentTabsDto8, groupsContentTabsDto9, groupsContentTabsDto10, groupsContentTabsDto11, groupsContentTabsDto12, groupsContentTabsDto13, groupsContentTabsDto14, groupsContentTabsDto15, groupsContentTabsDto16, groupsContentTabsDto17, groupsContentTabsDto18, groupsContentTabsDto19};
        $VALUES = groupsContentTabsDtoArr;
        $ENTRIES = new asp(groupsContentTabsDtoArr);
        CREATOR = new a();
    }

    private GroupsContentTabsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsContentTabsDto valueOf(String str) {
        return (GroupsContentTabsDto) Enum.valueOf(GroupsContentTabsDto.class, str);
    }

    public static GroupsContentTabsDto[] values() {
        return (GroupsContentTabsDto[]) $VALUES.clone();
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
