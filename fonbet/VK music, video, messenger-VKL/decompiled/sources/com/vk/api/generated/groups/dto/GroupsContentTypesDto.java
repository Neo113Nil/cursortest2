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
/* compiled from: GroupsContentTypesDto.kt */
/* loaded from: classes14.dex */
public final class GroupsContentTypesDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsContentTypesDto[] $VALUES;

    @pmi0("addresses")
    public static final GroupsContentTypesDto ADDRESSES;

    @pmi0("articles")
    public static final GroupsContentTypesDto ARTICLES;

    @pmi0("audios")
    public static final GroupsContentTypesDto AUDIOS;

    @pmi0("audios_playlists")
    public static final GroupsContentTypesDto AUDIOS_PLAYLISTS;

    @pmi0("chats")
    public static final GroupsContentTypesDto CHATS;
    public static final Parcelable.Creator<GroupsContentTypesDto> CREATOR;

    @pmi0("discussions")
    public static final GroupsContentTypesDto DISCUSSIONS;

    @pmi0("donut_wall")
    public static final GroupsContentTypesDto DONUT_WALL;

    @pmi0("events")
    public static final GroupsContentTypesDto EVENTS;

    @pmi0("files")
    public static final GroupsContentTypesDto FILES;

    @pmi0(X3.i.Z)
    public static final GroupsContentTypesDto MAIN;

    @pmi0("market")
    public static final GroupsContentTypesDto MARKET;

    @pmi0("market_albums")
    public static final GroupsContentTypesDto MARKET_ALBUMS;

    @pmi0("narratives")
    public static final GroupsContentTypesDto NARRATIVES;

    @pmi0("photos")
    public static final GroupsContentTypesDto PHOTOS;

    @pmi0("photos_albums")
    public static final GroupsContentTypesDto PHOTOS_ALBUMS;

    @pmi0("podcasts")
    public static final GroupsContentTypesDto PODCASTS;

    @pmi0(SignalingProtocol.KEY_ROOMS)
    public static final GroupsContentTypesDto ROOMS;

    @pmi0("services")
    public static final GroupsContentTypesDto SERVICES;

    @pmi0("service_albums")
    public static final GroupsContentTypesDto SERVICE_ALBUMS;

    @pmi0("short_videos")
    public static final GroupsContentTypesDto SHORT_VIDEOS;

    @pmi0("short_videos_playlists")
    public static final GroupsContentTypesDto SHORT_VIDEOS_PLAYLISTS;

    @pmi0("textlives")
    public static final GroupsContentTypesDto TEXTLIVES;

    @pmi0("videos")
    public static final GroupsContentTypesDto VIDEOS;

    @pmi0("videos_playlists")
    public static final GroupsContentTypesDto VIDEOS_PLAYLISTS;

    @pmi0("wall")
    public static final GroupsContentTypesDto WALL;
    private final String value;

    /* compiled from: GroupsContentTypesDto.kt */
    public static final class a implements Parcelable.Creator<GroupsContentTypesDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsContentTypesDto createFromParcel(Parcel parcel) {
            return GroupsContentTypesDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsContentTypesDto[] newArray(int i) {
            return new GroupsContentTypesDto[i];
        }
    }

    static {
        GroupsContentTypesDto groupsContentTypesDto = new GroupsContentTypesDto("WALL", 0, "wall");
        WALL = groupsContentTypesDto;
        GroupsContentTypesDto groupsContentTypesDto2 = new GroupsContentTypesDto("DONUT_WALL", 1, "donut_wall");
        DONUT_WALL = groupsContentTypesDto2;
        GroupsContentTypesDto groupsContentTypesDto3 = new GroupsContentTypesDto("PHOTOS", 2, "photos");
        PHOTOS = groupsContentTypesDto3;
        GroupsContentTypesDto groupsContentTypesDto4 = new GroupsContentTypesDto("PHOTOS_ALBUMS", 3, "photos_albums");
        PHOTOS_ALBUMS = groupsContentTypesDto4;
        GroupsContentTypesDto groupsContentTypesDto5 = new GroupsContentTypesDto("VIDEOS", 4, "videos");
        VIDEOS = groupsContentTypesDto5;
        GroupsContentTypesDto groupsContentTypesDto6 = new GroupsContentTypesDto("VIDEOS_PLAYLISTS", 5, "videos_playlists");
        VIDEOS_PLAYLISTS = groupsContentTypesDto6;
        GroupsContentTypesDto groupsContentTypesDto7 = new GroupsContentTypesDto("AUDIOS", 6, "audios");
        AUDIOS = groupsContentTypesDto7;
        GroupsContentTypesDto groupsContentTypesDto8 = new GroupsContentTypesDto("AUDIOS_PLAYLISTS", 7, "audios_playlists");
        AUDIOS_PLAYLISTS = groupsContentTypesDto8;
        GroupsContentTypesDto groupsContentTypesDto9 = new GroupsContentTypesDto("CHATS", 8, "chats");
        CHATS = groupsContentTypesDto9;
        GroupsContentTypesDto groupsContentTypesDto10 = new GroupsContentTypesDto("SHORT_VIDEOS", 9, "short_videos");
        SHORT_VIDEOS = groupsContentTypesDto10;
        GroupsContentTypesDto groupsContentTypesDto11 = new GroupsContentTypesDto("SHORT_VIDEOS_PLAYLISTS", 10, "short_videos_playlists");
        SHORT_VIDEOS_PLAYLISTS = groupsContentTypesDto11;
        GroupsContentTypesDto groupsContentTypesDto12 = new GroupsContentTypesDto("FILES", 11, "files");
        FILES = groupsContentTypesDto12;
        GroupsContentTypesDto groupsContentTypesDto13 = new GroupsContentTypesDto("DISCUSSIONS", 12, "discussions");
        DISCUSSIONS = groupsContentTypesDto13;
        GroupsContentTypesDto groupsContentTypesDto14 = new GroupsContentTypesDto("ARTICLES", 13, "articles");
        ARTICLES = groupsContentTypesDto14;
        GroupsContentTypesDto groupsContentTypesDto15 = new GroupsContentTypesDto("NARRATIVES", 14, "narratives");
        NARRATIVES = groupsContentTypesDto15;
        GroupsContentTypesDto groupsContentTypesDto16 = new GroupsContentTypesDto("MARKET", 15, "market");
        MARKET = groupsContentTypesDto16;
        GroupsContentTypesDto groupsContentTypesDto17 = new GroupsContentTypesDto("MARKET_ALBUMS", 16, "market_albums");
        MARKET_ALBUMS = groupsContentTypesDto17;
        GroupsContentTypesDto groupsContentTypesDto18 = new GroupsContentTypesDto("SERVICES", 17, "services");
        SERVICES = groupsContentTypesDto18;
        GroupsContentTypesDto groupsContentTypesDto19 = new GroupsContentTypesDto("SERVICE_ALBUMS", 18, "service_albums");
        SERVICE_ALBUMS = groupsContentTypesDto19;
        GroupsContentTypesDto groupsContentTypesDto20 = new GroupsContentTypesDto("TEXTLIVES", 19, "textlives");
        TEXTLIVES = groupsContentTypesDto20;
        GroupsContentTypesDto groupsContentTypesDto21 = new GroupsContentTypesDto("PODCASTS", 20, "podcasts");
        PODCASTS = groupsContentTypesDto21;
        GroupsContentTypesDto groupsContentTypesDto22 = new GroupsContentTypesDto("ROOMS", 21, SignalingProtocol.KEY_ROOMS);
        ROOMS = groupsContentTypesDto22;
        GroupsContentTypesDto groupsContentTypesDto23 = new GroupsContentTypesDto("EVENTS", 22, "events");
        EVENTS = groupsContentTypesDto23;
        GroupsContentTypesDto groupsContentTypesDto24 = new GroupsContentTypesDto("ADDRESSES", 23, "addresses");
        ADDRESSES = groupsContentTypesDto24;
        GroupsContentTypesDto groupsContentTypesDto25 = new GroupsContentTypesDto("MAIN", 24, X3.i.Z);
        MAIN = groupsContentTypesDto25;
        GroupsContentTypesDto[] groupsContentTypesDtoArr = {groupsContentTypesDto, groupsContentTypesDto2, groupsContentTypesDto3, groupsContentTypesDto4, groupsContentTypesDto5, groupsContentTypesDto6, groupsContentTypesDto7, groupsContentTypesDto8, groupsContentTypesDto9, groupsContentTypesDto10, groupsContentTypesDto11, groupsContentTypesDto12, groupsContentTypesDto13, groupsContentTypesDto14, groupsContentTypesDto15, groupsContentTypesDto16, groupsContentTypesDto17, groupsContentTypesDto18, groupsContentTypesDto19, groupsContentTypesDto20, groupsContentTypesDto21, groupsContentTypesDto22, groupsContentTypesDto23, groupsContentTypesDto24, groupsContentTypesDto25};
        $VALUES = groupsContentTypesDtoArr;
        $ENTRIES = new asp(groupsContentTypesDtoArr);
        CREATOR = new a();
    }

    private GroupsContentTypesDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsContentTypesDto valueOf(String str) {
        return (GroupsContentTypesDto) Enum.valueOf(GroupsContentTypesDto.class, str);
    }

    public static GroupsContentTypesDto[] values() {
        return (GroupsContentTypesDto[]) $VALUES.clone();
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
