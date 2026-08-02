package com.vk.catalog2.common.dto.api;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Iterator;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContentType.kt */
/* loaded from: classes16.dex */
public final class ContentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ContentType[] $VALUES;
    public static final ContentType ARTIST;
    public static final ContentType ARTIST_BIG;
    public static final ContentType AUDIO_ALBUMS;
    public static final ContentType AUDIO_AUDIOBOOKS;
    public static final ContentType AUDIO_AVAILABLE_OFFER;
    public static final ContentType AUDIO_BOOK;
    public static final ContentType AUDIO_FOLLOWINGS;
    public static final ContentType AUDIO_KIDS;
    public static final ContentType AUDIO_OFFLINE;
    public static final ContentType AUDIO_PLAYLISTS;
    public static final ContentType AUDIO_PODCASTS;
    public static final ContentType AUDIO_RADIO;
    public static final ContentType AUDIO_RECENT;
    public static final ContentType CONCERT;
    public static final ContentType CURATOR;
    public static final a Companion;
    public static final ContentType GROUP;
    public static final ContentType MINIAPP;
    public static final ContentType PODCAST;
    public static final ContentType PROFILE;
    public static final ContentType SEARCH_ADS;
    public static final ContentType URL;
    public static final ContentType USER;
    public static final ContentType VIDEO;
    private final String value;

    /* compiled from: ContentType.kt */
    public static final class a {
        public static ContentType a(String str) {
            Object obj;
            Iterator<E> it = ContentType.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((ContentType) obj).i(), str)) {
                    break;
                }
            }
            return (ContentType) obj;
        }
    }

    static {
        ContentType contentType = new ContentType("PROFILE", 0, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        PROFILE = contentType;
        ContentType contentType2 = new ContentType("USER", 1, "user");
        USER = contentType2;
        ContentType contentType3 = new ContentType("GROUP", 2, "group");
        GROUP = contentType3;
        ContentType contentType4 = new ContentType("MINIAPP", 3, "mini_app");
        MINIAPP = contentType4;
        ContentType contentType5 = new ContentType("SEARCH_ADS", 4, "search_ads");
        SEARCH_ADS = contentType5;
        ContentType contentType6 = new ContentType("ARTIST", 5, "artist");
        ARTIST = contentType6;
        ContentType contentType7 = new ContentType("ARTIST_BIG", 6, "artist_big");
        ARTIST_BIG = contentType7;
        ContentType contentType8 = new ContentType("CURATOR", 7, "curator");
        CURATOR = contentType8;
        ContentType contentType9 = new ContentType(SignalingProtocol.MEDIA_OPTION_VIDEO, 8, "video");
        VIDEO = contentType9;
        ContentType contentType10 = new ContentType("URL", 9, "url");
        URL = contentType10;
        ContentType contentType11 = new ContentType("CONCERT", 10, "concert");
        CONCERT = contentType11;
        ContentType contentType12 = new ContentType("AUDIO_RECENT", 11, "audio_recent");
        AUDIO_RECENT = contentType12;
        ContentType contentType13 = new ContentType("AUDIO_PLAYLISTS", 12, "audio_playlists");
        AUDIO_PLAYLISTS = contentType13;
        ContentType contentType14 = new ContentType("AUDIO_PODCASTS", 13, "audio_podcasts");
        AUDIO_PODCASTS = contentType14;
        ContentType contentType15 = new ContentType("AUDIO_AUDIOBOOKS", 14, "audio_audiobooks");
        AUDIO_AUDIOBOOKS = contentType15;
        ContentType contentType16 = new ContentType("AUDIO_ALBUMS", 15, "audio_albums");
        AUDIO_ALBUMS = contentType16;
        ContentType contentType17 = new ContentType("AUDIO_FOLLOWINGS", 16, "audio_followings");
        AUDIO_FOLLOWINGS = contentType17;
        ContentType contentType18 = new ContentType("AUDIO_RADIO", 17, "audio_radio");
        AUDIO_RADIO = contentType18;
        ContentType contentType19 = new ContentType("AUDIO_OFFLINE", 18, "audio_offline");
        AUDIO_OFFLINE = contentType19;
        ContentType contentType20 = new ContentType("AUDIO_AVAILABLE_OFFER", 19, "audio_available_offer");
        AUDIO_AVAILABLE_OFFER = contentType20;
        ContentType contentType21 = new ContentType("AUDIO_KIDS", 20, "audio_kids");
        AUDIO_KIDS = contentType21;
        ContentType contentType22 = new ContentType("PODCAST", 21, "podcast");
        PODCAST = contentType22;
        ContentType contentType23 = new ContentType("AUDIO_BOOK", 22, "audio_book");
        AUDIO_BOOK = contentType23;
        ContentType[] contentTypeArr = {contentType, contentType2, contentType3, contentType4, contentType5, contentType6, contentType7, contentType8, contentType9, contentType10, contentType11, contentType12, contentType13, contentType14, contentType15, contentType16, contentType17, contentType18, contentType19, contentType20, contentType21, contentType22, contentType23};
        $VALUES = contentTypeArr;
        $ENTRIES = new asp(contentTypeArr);
        Companion = new a();
    }

    public ContentType(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<ContentType> h() {
        return $ENTRIES;
    }

    public static ContentType valueOf(String str) {
        return (ContentType) Enum.valueOf(ContentType.class, str);
    }

    public static ContentType[] values() {
        return (ContentType[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
