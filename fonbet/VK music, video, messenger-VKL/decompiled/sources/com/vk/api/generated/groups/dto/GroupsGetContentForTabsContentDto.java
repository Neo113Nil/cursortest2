package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGetContentForTabsContentDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetContentForTabsContentDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGetContentForTabsContentDto[] $VALUES;

    @pmi0("addresses")
    public static final GroupsGetContentForTabsContentDto ADDRESSES;

    @pmi0("articles")
    public static final GroupsGetContentForTabsContentDto ARTICLES;

    @pmi0("audios")
    public static final GroupsGetContentForTabsContentDto AUDIOS;

    @pmi0("audios_playlists")
    public static final GroupsGetContentForTabsContentDto AUDIOS_PLAYLISTS;

    @pmi0("chats")
    public static final GroupsGetContentForTabsContentDto CHATS;
    public static final Parcelable.Creator<GroupsGetContentForTabsContentDto> CREATOR;

    @pmi0("discussions")
    public static final GroupsGetContentForTabsContentDto DISCUSSIONS;

    @pmi0("donut_wall")
    public static final GroupsGetContentForTabsContentDto DONUT_WALL;

    @pmi0("events")
    public static final GroupsGetContentForTabsContentDto EVENTS;

    @pmi0("files")
    public static final GroupsGetContentForTabsContentDto FILES;

    @pmi0(X3.i.Z)
    public static final GroupsGetContentForTabsContentDto MAIN;

    @pmi0("market")
    public static final GroupsGetContentForTabsContentDto MARKET;

    @pmi0("market_albums")
    public static final GroupsGetContentForTabsContentDto MARKET_ALBUMS;

    @pmi0("narratives")
    public static final GroupsGetContentForTabsContentDto NARRATIVES;

    @pmi0("photos")
    public static final GroupsGetContentForTabsContentDto PHOTOS;

    @pmi0("photos_albums")
    public static final GroupsGetContentForTabsContentDto PHOTOS_ALBUMS;

    @pmi0("podcasts")
    public static final GroupsGetContentForTabsContentDto PODCASTS;

    @pmi0(SignalingProtocol.KEY_ROOMS)
    public static final GroupsGetContentForTabsContentDto ROOMS;

    @pmi0("services")
    public static final GroupsGetContentForTabsContentDto SERVICES;

    @pmi0("service_albums")
    public static final GroupsGetContentForTabsContentDto SERVICE_ALBUMS;

    @pmi0("short_videos")
    public static final GroupsGetContentForTabsContentDto SHORT_VIDEOS;

    @pmi0("short_videos_playlists")
    public static final GroupsGetContentForTabsContentDto SHORT_VIDEOS_PLAYLISTS;

    @pmi0("textlives")
    public static final GroupsGetContentForTabsContentDto TEXTLIVES;

    @pmi0("videos")
    public static final GroupsGetContentForTabsContentDto VIDEOS;

    @pmi0("videos_playlists")
    public static final GroupsGetContentForTabsContentDto VIDEOS_PLAYLISTS;

    @pmi0("wall")
    public static final GroupsGetContentForTabsContentDto WALL;
    private final String value;

    /* compiled from: GroupsGetContentForTabsContentDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetContentForTabsContentDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetContentForTabsContentDto createFromParcel(Parcel parcel) {
            return GroupsGetContentForTabsContentDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetContentForTabsContentDto[] newArray(int i) {
            return new GroupsGetContentForTabsContentDto[i];
        }
    }

    static {
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto = new GroupsGetContentForTabsContentDto("ADDRESSES", 0, "addresses");
        ADDRESSES = groupsGetContentForTabsContentDto;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto2 = new GroupsGetContentForTabsContentDto("ARTICLES", 1, "articles");
        ARTICLES = groupsGetContentForTabsContentDto2;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto3 = new GroupsGetContentForTabsContentDto("AUDIOS", 2, "audios");
        AUDIOS = groupsGetContentForTabsContentDto3;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto4 = new GroupsGetContentForTabsContentDto("AUDIOS_PLAYLISTS", 3, "audios_playlists");
        AUDIOS_PLAYLISTS = groupsGetContentForTabsContentDto4;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto5 = new GroupsGetContentForTabsContentDto("CHATS", 4, "chats");
        CHATS = groupsGetContentForTabsContentDto5;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto6 = new GroupsGetContentForTabsContentDto("DISCUSSIONS", 5, "discussions");
        DISCUSSIONS = groupsGetContentForTabsContentDto6;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto7 = new GroupsGetContentForTabsContentDto("DONUT_WALL", 6, "donut_wall");
        DONUT_WALL = groupsGetContentForTabsContentDto7;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto8 = new GroupsGetContentForTabsContentDto("EVENTS", 7, "events");
        EVENTS = groupsGetContentForTabsContentDto8;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto9 = new GroupsGetContentForTabsContentDto("FILES", 8, "files");
        FILES = groupsGetContentForTabsContentDto9;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto10 = new GroupsGetContentForTabsContentDto("MAIN", 9, X3.i.Z);
        MAIN = groupsGetContentForTabsContentDto10;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto11 = new GroupsGetContentForTabsContentDto("MARKET", 10, "market");
        MARKET = groupsGetContentForTabsContentDto11;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto12 = new GroupsGetContentForTabsContentDto("MARKET_ALBUMS", 11, "market_albums");
        MARKET_ALBUMS = groupsGetContentForTabsContentDto12;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto13 = new GroupsGetContentForTabsContentDto("NARRATIVES", 12, "narratives");
        NARRATIVES = groupsGetContentForTabsContentDto13;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto14 = new GroupsGetContentForTabsContentDto("PHOTOS", 13, "photos");
        PHOTOS = groupsGetContentForTabsContentDto14;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto15 = new GroupsGetContentForTabsContentDto("PHOTOS_ALBUMS", 14, "photos_albums");
        PHOTOS_ALBUMS = groupsGetContentForTabsContentDto15;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto16 = new GroupsGetContentForTabsContentDto("PODCASTS", 15, "podcasts");
        PODCASTS = groupsGetContentForTabsContentDto16;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto17 = new GroupsGetContentForTabsContentDto("ROOMS", 16, SignalingProtocol.KEY_ROOMS);
        ROOMS = groupsGetContentForTabsContentDto17;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto18 = new GroupsGetContentForTabsContentDto("SERVICE_ALBUMS", 17, "service_albums");
        SERVICE_ALBUMS = groupsGetContentForTabsContentDto18;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto19 = new GroupsGetContentForTabsContentDto("SERVICES", 18, "services");
        SERVICES = groupsGetContentForTabsContentDto19;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto20 = new GroupsGetContentForTabsContentDto("SHORT_VIDEOS", 19, "short_videos");
        SHORT_VIDEOS = groupsGetContentForTabsContentDto20;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto21 = new GroupsGetContentForTabsContentDto("SHORT_VIDEOS_PLAYLISTS", 20, "short_videos_playlists");
        SHORT_VIDEOS_PLAYLISTS = groupsGetContentForTabsContentDto21;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto22 = new GroupsGetContentForTabsContentDto("TEXTLIVES", 21, "textlives");
        TEXTLIVES = groupsGetContentForTabsContentDto22;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto23 = new GroupsGetContentForTabsContentDto("VIDEOS", 22, "videos");
        VIDEOS = groupsGetContentForTabsContentDto23;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto24 = new GroupsGetContentForTabsContentDto("VIDEOS_PLAYLISTS", 23, "videos_playlists");
        VIDEOS_PLAYLISTS = groupsGetContentForTabsContentDto24;
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto25 = new GroupsGetContentForTabsContentDto("WALL", 24, "wall");
        WALL = groupsGetContentForTabsContentDto25;
        GroupsGetContentForTabsContentDto[] groupsGetContentForTabsContentDtoArr = {groupsGetContentForTabsContentDto, groupsGetContentForTabsContentDto2, groupsGetContentForTabsContentDto3, groupsGetContentForTabsContentDto4, groupsGetContentForTabsContentDto5, groupsGetContentForTabsContentDto6, groupsGetContentForTabsContentDto7, groupsGetContentForTabsContentDto8, groupsGetContentForTabsContentDto9, groupsGetContentForTabsContentDto10, groupsGetContentForTabsContentDto11, groupsGetContentForTabsContentDto12, groupsGetContentForTabsContentDto13, groupsGetContentForTabsContentDto14, groupsGetContentForTabsContentDto15, groupsGetContentForTabsContentDto16, groupsGetContentForTabsContentDto17, groupsGetContentForTabsContentDto18, groupsGetContentForTabsContentDto19, groupsGetContentForTabsContentDto20, groupsGetContentForTabsContentDto21, groupsGetContentForTabsContentDto22, groupsGetContentForTabsContentDto23, groupsGetContentForTabsContentDto24, groupsGetContentForTabsContentDto25};
        $VALUES = groupsGetContentForTabsContentDtoArr;
        $ENTRIES = new asp(groupsGetContentForTabsContentDtoArr);
        CREATOR = new a();
    }

    private GroupsGetContentForTabsContentDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsGetContentForTabsContentDto valueOf(String str) {
        return (GroupsGetContentForTabsContentDto) Enum.valueOf(GroupsGetContentForTabsContentDto.class, str);
    }

    public static GroupsGetContentForTabsContentDto[] values() {
        return (GroupsGetContentForTabsContentDto[]) $VALUES.clone();
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
