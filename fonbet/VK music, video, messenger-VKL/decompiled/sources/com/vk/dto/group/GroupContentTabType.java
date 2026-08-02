package com.vk.dto.group;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ironsource.X3;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupContentTabType.kt */
/* loaded from: classes18.dex */
public final class GroupContentTabType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupContentTabType[] $VALUES;
    public static final GroupContentTabType ARTICLES;
    public static final GroupContentTabType AUDIOS;
    public static final GroupContentTabType AUDIOS_PLAYLISTS;
    public static final GroupContentTabType CHANNEL;
    public static final GroupContentTabType CHATS;
    public static final a Companion;
    public static final GroupContentTabType DISCUSSIONS;
    public static final GroupContentTabType DONUT_WALL;
    public static final GroupContentTabType EVENTS;
    public static final GroupContentTabType FILES;
    public static final GroupContentTabType MAIN_WALL;
    public static final GroupContentTabType MARKET;
    public static final GroupContentTabType MARKET_ALBUMS;
    public static final GroupContentTabType NARRATIVES;
    public static final GroupContentTabType PHOTOS;
    public static final GroupContentTabType PHOTOS_ALBUMS;
    public static final GroupContentTabType PODCASTS;
    public static final GroupContentTabType ROOMS;
    public static final GroupContentTabType SERVICES;
    public static final GroupContentTabType SERVICE_ALBUMS;
    public static final GroupContentTabType SHORT_VIDEOS;
    public static final GroupContentTabType SHORT_VIDEOS_PLAYLISTS;
    public static final GroupContentTabType TEXTLIVES;
    public static final GroupContentTabType UNKNOWN;
    public static final GroupContentTabType VIDEOS;
    public static final GroupContentTabType VIDEOS_PLAYLISTS;
    public static final GroupContentTabType WALL;
    private final List<String> aliases;
    private final String id;

    /* compiled from: GroupContentTabType.kt */
    public static final class a {
        public static GroupContentTabType a(String str) {
            Object obj;
            Iterator<E> it = GroupContentTabType.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                GroupContentTabType groupContentTabType = (GroupContentTabType) obj;
                if (epx.f(groupContentTabType.getId(), str) || groupContentTabType.aliases.contains(str)) {
                    break;
                }
            }
            GroupContentTabType groupContentTabType2 = (GroupContentTabType) obj;
            return groupContentTabType2 == null ? GroupContentTabType.UNKNOWN : groupContentTabType2;
        }
    }

    static {
        GroupContentTabType groupContentTabType = new GroupContentTabType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, "");
        UNKNOWN = groupContentTabType;
        GroupContentTabType groupContentTabType2 = new GroupContentTabType(1, "WALL", "wall", Collections.singletonList("posts"));
        WALL = groupContentTabType2;
        GroupContentTabType groupContentTabType3 = new GroupContentTabType("MAIN_WALL", 2, X3.i.Z);
        MAIN_WALL = groupContentTabType3;
        GroupContentTabType groupContentTabType4 = new GroupContentTabType(3, "DONUT_WALL", "donut_wall", Collections.singletonList("donut"));
        DONUT_WALL = groupContentTabType4;
        GroupContentTabType groupContentTabType5 = new GroupContentTabType("PHOTOS", 4, "photos");
        PHOTOS = groupContentTabType5;
        GroupContentTabType groupContentTabType6 = new GroupContentTabType("PHOTOS_ALBUMS", 5, "photos_albums");
        PHOTOS_ALBUMS = groupContentTabType6;
        GroupContentTabType groupContentTabType7 = new GroupContentTabType("VIDEOS", 6, "videos");
        VIDEOS = groupContentTabType7;
        GroupContentTabType groupContentTabType8 = new GroupContentTabType(7, "VIDEOS_PLAYLISTS", "videos_playlists", Collections.singletonList("video_playlists"));
        VIDEOS_PLAYLISTS = groupContentTabType8;
        GroupContentTabType groupContentTabType9 = new GroupContentTabType("AUDIOS", 8, "audios");
        AUDIOS = groupContentTabType9;
        GroupContentTabType groupContentTabType10 = new GroupContentTabType("AUDIOS_PLAYLISTS", 9, "audios_playlists");
        AUDIOS_PLAYLISTS = groupContentTabType10;
        GroupContentTabType groupContentTabType11 = new GroupContentTabType("CHATS", 10, "chats");
        CHATS = groupContentTabType11;
        GroupContentTabType groupContentTabType12 = new GroupContentTabType("SHORT_VIDEOS", 11, "short_videos");
        SHORT_VIDEOS = groupContentTabType12;
        GroupContentTabType groupContentTabType13 = new GroupContentTabType(12, "SHORT_VIDEOS_PLAYLISTS", "short_videos_playlists", Collections.singletonList("short_video_playlists"));
        SHORT_VIDEOS_PLAYLISTS = groupContentTabType13;
        GroupContentTabType groupContentTabType14 = new GroupContentTabType("FILES", 13, "files");
        FILES = groupContentTabType14;
        GroupContentTabType groupContentTabType15 = new GroupContentTabType("DISCUSSIONS", 14, "discussions");
        DISCUSSIONS = groupContentTabType15;
        GroupContentTabType groupContentTabType16 = new GroupContentTabType("ARTICLES", 15, "articles");
        ARTICLES = groupContentTabType16;
        GroupContentTabType groupContentTabType17 = new GroupContentTabType("NARRATIVES", 16, "narratives");
        NARRATIVES = groupContentTabType17;
        GroupContentTabType groupContentTabType18 = new GroupContentTabType("MARKET", 17, "market");
        MARKET = groupContentTabType18;
        GroupContentTabType groupContentTabType19 = new GroupContentTabType("MARKET_ALBUMS", 18, "market_albums");
        MARKET_ALBUMS = groupContentTabType19;
        GroupContentTabType groupContentTabType20 = new GroupContentTabType("SERVICES", 19, "services");
        SERVICES = groupContentTabType20;
        GroupContentTabType groupContentTabType21 = new GroupContentTabType("SERVICE_ALBUMS", 20, "service_albums");
        SERVICE_ALBUMS = groupContentTabType21;
        GroupContentTabType groupContentTabType22 = new GroupContentTabType("TEXTLIVES", 21, "textlives");
        TEXTLIVES = groupContentTabType22;
        GroupContentTabType groupContentTabType23 = new GroupContentTabType("PODCASTS", 22, "podcasts");
        PODCASTS = groupContentTabType23;
        GroupContentTabType groupContentTabType24 = new GroupContentTabType("ROOMS", 23, SignalingProtocol.KEY_ROOMS);
        ROOMS = groupContentTabType24;
        GroupContentTabType groupContentTabType25 = new GroupContentTabType("CHANNEL", 24, "channel");
        CHANNEL = groupContentTabType25;
        GroupContentTabType groupContentTabType26 = new GroupContentTabType("EVENTS", 25, "events");
        EVENTS = groupContentTabType26;
        GroupContentTabType[] groupContentTabTypeArr = {groupContentTabType, groupContentTabType2, groupContentTabType3, groupContentTabType4, groupContentTabType5, groupContentTabType6, groupContentTabType7, groupContentTabType8, groupContentTabType9, groupContentTabType10, groupContentTabType11, groupContentTabType12, groupContentTabType13, groupContentTabType14, groupContentTabType15, groupContentTabType16, groupContentTabType17, groupContentTabType18, groupContentTabType19, groupContentTabType20, groupContentTabType21, groupContentTabType22, groupContentTabType23, groupContentTabType24, groupContentTabType25, groupContentTabType26};
        $VALUES = groupContentTabTypeArr;
        $ENTRIES = new asp(groupContentTabTypeArr);
        Companion = new a();
    }

    public GroupContentTabType(int i, String str, String str2, List list) {
        this.id = str2;
        this.aliases = list;
    }

    public static zrp<GroupContentTabType> h() {
        return $ENTRIES;
    }

    public static GroupContentTabType valueOf(String str) {
        return (GroupContentTabType) Enum.valueOf(GroupContentTabType.class, str);
    }

    public static GroupContentTabType[] values() {
        return (GroupContentTabType[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }

    public GroupContentTabType(String str, int i, String str2) {
        this(i, str, str2, EmptyList.b);
    }
}
