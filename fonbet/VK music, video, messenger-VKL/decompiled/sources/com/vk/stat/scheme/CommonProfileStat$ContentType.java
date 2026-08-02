package com.vk.stat.scheme;

import com.ironsource.X3;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonProfileStat.kt */
/* loaded from: classes5.dex */
public final class CommonProfileStat$ContentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonProfileStat$ContentType[] $VALUES;

    @pmi0("addresses")
    public static final CommonProfileStat$ContentType ADDRESSES;

    @pmi0("albums")
    public static final CommonProfileStat$ContentType ALBUMS;

    @pmi0("archive_wall")
    public static final CommonProfileStat$ContentType ARCHIVE_WALL;

    @pmi0("articles")
    public static final CommonProfileStat$ContentType ARTICLES;

    @pmi0("chats")
    public static final CommonProfileStat$ContentType CHATS;

    @pmi0("classified")
    public static final CommonProfileStat$ContentType CLASSIFIED;

    @pmi0("clips")
    public static final CommonProfileStat$ContentType CLIPS;

    @pmi0("discussions")
    public static final CommonProfileStat$ContentType DISCUSSIONS;

    @pmi0("events")
    public static final CommonProfileStat$ContentType EVENTS;

    @pmi0("files")
    public static final CommonProfileStat$ContentType FILES;

    @pmi0("first_story_for_narrative")
    public static final CommonProfileStat$ContentType FIRST_STORY_FOR_NARRATIVE;

    @pmi0("gifts")
    public static final CommonProfileStat$ContentType GIFTS;

    @pmi0(X3.i.Z)
    public static final CommonProfileStat$ContentType MAIN;

    @pmi0("market")
    public static final CommonProfileStat$ContentType MARKET;

    @pmi0("music")
    public static final CommonProfileStat$ContentType MUSIC;

    @pmi0("narrative")
    public static final CommonProfileStat$ContentType NARRATIVE;

    @pmi0("nfts")
    public static final CommonProfileStat$ContentType NFTS;

    @pmi0("photo")
    public static final CommonProfileStat$ContentType PHOTO;

    @pmi0("podcasts")
    public static final CommonProfileStat$ContentType PODCASTS;

    @pmi0("services")
    public static final CommonProfileStat$ContentType SERVICES;

    @pmi0("stereo_rooms")
    public static final CommonProfileStat$ContentType STEREO_ROOMS;

    @pmi0("textlives")
    public static final CommonProfileStat$ContentType TEXTLIVES;

    @pmi0("video")
    public static final CommonProfileStat$ContentType VIDEO;

    @pmi0("wall")
    public static final CommonProfileStat$ContentType WALL;

    static {
        CommonProfileStat$ContentType commonProfileStat$ContentType = new CommonProfileStat$ContentType("PHOTO", 0);
        PHOTO = commonProfileStat$ContentType;
        CommonProfileStat$ContentType commonProfileStat$ContentType2 = new CommonProfileStat$ContentType("ALBUMS", 1);
        ALBUMS = commonProfileStat$ContentType2;
        CommonProfileStat$ContentType commonProfileStat$ContentType3 = new CommonProfileStat$ContentType("NARRATIVE", 2);
        NARRATIVE = commonProfileStat$ContentType3;
        CommonProfileStat$ContentType commonProfileStat$ContentType4 = new CommonProfileStat$ContentType("MUSIC", 3);
        MUSIC = commonProfileStat$ContentType4;
        CommonProfileStat$ContentType commonProfileStat$ContentType5 = new CommonProfileStat$ContentType("CLIPS", 4);
        CLIPS = commonProfileStat$ContentType5;
        CommonProfileStat$ContentType commonProfileStat$ContentType6 = new CommonProfileStat$ContentType("ARTICLES", 5);
        ARTICLES = commonProfileStat$ContentType6;
        CommonProfileStat$ContentType commonProfileStat$ContentType7 = new CommonProfileStat$ContentType(SignalingProtocol.MEDIA_OPTION_VIDEO, 6);
        VIDEO = commonProfileStat$ContentType7;
        CommonProfileStat$ContentType commonProfileStat$ContentType8 = new CommonProfileStat$ContentType("CLASSIFIED", 7);
        CLASSIFIED = commonProfileStat$ContentType8;
        CommonProfileStat$ContentType commonProfileStat$ContentType9 = new CommonProfileStat$ContentType("CHATS", 8);
        CHATS = commonProfileStat$ContentType9;
        CommonProfileStat$ContentType commonProfileStat$ContentType10 = new CommonProfileStat$ContentType("ADDRESSES", 9);
        ADDRESSES = commonProfileStat$ContentType10;
        CommonProfileStat$ContentType commonProfileStat$ContentType11 = new CommonProfileStat$ContentType("EVENTS", 10);
        EVENTS = commonProfileStat$ContentType11;
        CommonProfileStat$ContentType commonProfileStat$ContentType12 = new CommonProfileStat$ContentType("FILES", 11);
        FILES = commonProfileStat$ContentType12;
        CommonProfileStat$ContentType commonProfileStat$ContentType13 = new CommonProfileStat$ContentType("DISCUSSIONS", 12);
        DISCUSSIONS = commonProfileStat$ContentType13;
        CommonProfileStat$ContentType commonProfileStat$ContentType14 = new CommonProfileStat$ContentType("MARKET", 13);
        MARKET = commonProfileStat$ContentType14;
        CommonProfileStat$ContentType commonProfileStat$ContentType15 = new CommonProfileStat$ContentType("SERVICES", 14);
        SERVICES = commonProfileStat$ContentType15;
        CommonProfileStat$ContentType commonProfileStat$ContentType16 = new CommonProfileStat$ContentType("TEXTLIVES", 15);
        TEXTLIVES = commonProfileStat$ContentType16;
        CommonProfileStat$ContentType commonProfileStat$ContentType17 = new CommonProfileStat$ContentType("PODCASTS", 16);
        PODCASTS = commonProfileStat$ContentType17;
        CommonProfileStat$ContentType commonProfileStat$ContentType18 = new CommonProfileStat$ContentType("STEREO_ROOMS", 17);
        STEREO_ROOMS = commonProfileStat$ContentType18;
        CommonProfileStat$ContentType commonProfileStat$ContentType19 = new CommonProfileStat$ContentType("FIRST_STORY_FOR_NARRATIVE", 18);
        FIRST_STORY_FOR_NARRATIVE = commonProfileStat$ContentType19;
        CommonProfileStat$ContentType commonProfileStat$ContentType20 = new CommonProfileStat$ContentType("NFTS", 19);
        NFTS = commonProfileStat$ContentType20;
        CommonProfileStat$ContentType commonProfileStat$ContentType21 = new CommonProfileStat$ContentType("WALL", 20);
        WALL = commonProfileStat$ContentType21;
        CommonProfileStat$ContentType commonProfileStat$ContentType22 = new CommonProfileStat$ContentType("GIFTS", 21);
        GIFTS = commonProfileStat$ContentType22;
        CommonProfileStat$ContentType commonProfileStat$ContentType23 = new CommonProfileStat$ContentType("ARCHIVE_WALL", 22);
        ARCHIVE_WALL = commonProfileStat$ContentType23;
        CommonProfileStat$ContentType commonProfileStat$ContentType24 = new CommonProfileStat$ContentType("MAIN", 23);
        MAIN = commonProfileStat$ContentType24;
        CommonProfileStat$ContentType[] commonProfileStat$ContentTypeArr = {commonProfileStat$ContentType, commonProfileStat$ContentType2, commonProfileStat$ContentType3, commonProfileStat$ContentType4, commonProfileStat$ContentType5, commonProfileStat$ContentType6, commonProfileStat$ContentType7, commonProfileStat$ContentType8, commonProfileStat$ContentType9, commonProfileStat$ContentType10, commonProfileStat$ContentType11, commonProfileStat$ContentType12, commonProfileStat$ContentType13, commonProfileStat$ContentType14, commonProfileStat$ContentType15, commonProfileStat$ContentType16, commonProfileStat$ContentType17, commonProfileStat$ContentType18, commonProfileStat$ContentType19, commonProfileStat$ContentType20, commonProfileStat$ContentType21, commonProfileStat$ContentType22, commonProfileStat$ContentType23, commonProfileStat$ContentType24};
        $VALUES = commonProfileStat$ContentTypeArr;
        $ENTRIES = new asp(commonProfileStat$ContentTypeArr);
    }

    private CommonProfileStat$ContentType(String str, int i) {
    }

    public static CommonProfileStat$ContentType valueOf(String str) {
        return (CommonProfileStat$ContentType) Enum.valueOf(CommonProfileStat$ContentType.class, str);
    }

    public static CommonProfileStat$ContentType[] values() {
        return (CommonProfileStat$ContentType[]) $VALUES.clone();
    }
}
