package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClickPreferenceItem implements SchemeStat$TypeClick.b {

    @pmi0("choose_position")
    private final Integer choosePosition;

    @pmi0("switched_to")
    private final Boolean switchedTo;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("app_biometrics_lock")
        public static final Type APP_BIOMETRICS_LOCK;

        @pmi0("audio_cache_location")
        public static final Type AUDIO_CACHE_LOCATION;

        @pmi0("autoplay_gifs")
        public static final Type AUTOPLAY_GIFS;

        @pmi0("autoplay_videos")
        public static final Type AUTOPLAY_VIDEOS;

        @pmi0("background_play_videos")
        public static final Type BACKGROUND_PLAY_VIDEOS;

        @pmi0("choose_app_locale")
        public static final Type CHOOSE_APP_LOCALE;

        @pmi0("choose_font_size")
        public static final Type CHOOSE_FONT_SIZE;

        @pmi0("choose_friends_list_order")
        public static final Type CHOOSE_FRIENDS_LIST_ORDER;

        @pmi0("clear_audio_cache")
        public static final Type CLEAR_AUDIO_CACHE;

        @pmi0("clear_cache")
        public static final Type CLEAR_CACHE;

        @pmi0("clear_messages_cache")
        public static final Type CLEAR_MESSAGES_CACHE;

        @pmi0("compress_photos")
        public static final Type COMPRESS_PHOTOS;

        @pmi0("compress_videos")
        public static final Type COMPRESS_VIDEOS;

        @pmi0("double_tap_like")
        public static final Type DOUBLE_TAP_LIKE;

        @pmi0("download_audio")
        public static final Type DOWNLOAD_AUDIO;

        @pmi0("enable_audio_cache")
        public static final Type ENABLE_AUDIO_CACHE;

        @pmi0("in_app_browser")
        public static final Type IN_APP_BROWSER;

        @pmi0("posts_auto_translation")
        public static final Type POSTS_AUTO_TRANSLATION;

        @pmi0("prefetch_audio_messages")
        public static final Type PREFETCH_AUDIO_MESSAGES;

        @pmi0("reset_contacts")
        public static final Type RESET_CONTACTS;

        @pmi0("save_edited_photos")
        public static final Type SAVE_EDITED_PHOTOS;

        @pmi0("save_traffic")
        public static final Type SAVE_TRAFFIC;

        @pmi0("send_by_enter")
        public static final Type SEND_BY_ENTER;

        @pmi0("show_music_suggest_notification")
        public static final Type SHOW_MUSIC_SUGGEST_NOTIFICATION;

        @pmi0("sync_contacts")
        public static final Type SYNC_CONTACTS;

        @pmi0("track_installed_apps")
        public static final Type TRACK_INSTALLED_APPS;

        @pmi0("track_location_data")
        public static final Type TRACK_LOCATION_DATA;

        @pmi0("use_proxy_server")
        public static final Type USE_PROXY_SERVER;

        static {
            Type type = new Type("CHOOSE_FRIENDS_LIST_ORDER", 0);
            CHOOSE_FRIENDS_LIST_ORDER = type;
            Type type2 = new Type("CHOOSE_FONT_SIZE", 1);
            CHOOSE_FONT_SIZE = type2;
            Type type3 = new Type("CHOOSE_APP_LOCALE", 2);
            CHOOSE_APP_LOCALE = type3;
            Type type4 = new Type("SEND_BY_ENTER", 3);
            SEND_BY_ENTER = type4;
            Type type5 = new Type("IN_APP_BROWSER", 4);
            IN_APP_BROWSER = type5;
            Type type6 = new Type("TRACK_LOCATION_DATA", 5);
            TRACK_LOCATION_DATA = type6;
            Type type7 = new Type("TRACK_INSTALLED_APPS", 6);
            TRACK_INSTALLED_APPS = type7;
            Type type8 = new Type("USE_PROXY_SERVER", 7);
            USE_PROXY_SERVER = type8;
            Type type9 = new Type("SAVE_TRAFFIC", 8);
            SAVE_TRAFFIC = type9;
            Type type10 = new Type("COMPRESS_PHOTOS", 9);
            COMPRESS_PHOTOS = type10;
            Type type11 = new Type("COMPRESS_VIDEOS", 10);
            COMPRESS_VIDEOS = type11;
            Type type12 = new Type("SAVE_EDITED_PHOTOS", 11);
            SAVE_EDITED_PHOTOS = type12;
            Type type13 = new Type("SHOW_MUSIC_SUGGEST_NOTIFICATION", 12);
            SHOW_MUSIC_SUGGEST_NOTIFICATION = type13;
            Type type14 = new Type("PREFETCH_AUDIO_MESSAGES", 13);
            PREFETCH_AUDIO_MESSAGES = type14;
            Type type15 = new Type("AUTOPLAY_GIFS", 14);
            AUTOPLAY_GIFS = type15;
            Type type16 = new Type("AUTOPLAY_VIDEOS", 15);
            AUTOPLAY_VIDEOS = type16;
            Type type17 = new Type("ENABLE_AUDIO_CACHE", 16);
            ENABLE_AUDIO_CACHE = type17;
            Type type18 = new Type("AUDIO_CACHE_LOCATION", 17);
            AUDIO_CACHE_LOCATION = type18;
            Type type19 = new Type("DOWNLOAD_AUDIO", 18);
            DOWNLOAD_AUDIO = type19;
            Type type20 = new Type("CLEAR_AUDIO_CACHE", 19);
            CLEAR_AUDIO_CACHE = type20;
            Type type21 = new Type("CLEAR_CACHE", 20);
            CLEAR_CACHE = type21;
            Type type22 = new Type("CLEAR_MESSAGES_CACHE", 21);
            CLEAR_MESSAGES_CACHE = type22;
            Type type23 = new Type("RESET_CONTACTS", 22);
            RESET_CONTACTS = type23;
            Type type24 = new Type("SYNC_CONTACTS", 23);
            SYNC_CONTACTS = type24;
            Type type25 = new Type("DOUBLE_TAP_LIKE", 24);
            DOUBLE_TAP_LIKE = type25;
            Type type26 = new Type("BACKGROUND_PLAY_VIDEOS", 25);
            BACKGROUND_PLAY_VIDEOS = type26;
            Type type27 = new Type("APP_BIOMETRICS_LOCK", 26);
            APP_BIOMETRICS_LOCK = type27;
            Type type28 = new Type("POSTS_AUTO_TRANSLATION", 27);
            POSTS_AUTO_TRANSLATION = type28;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23, type24, type25, type26, type27, type28};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeClickPreferenceItem(Type type, Integer num, Boolean bool) {
        this.type = type;
        this.choosePosition = num;
        this.switchedTo = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClickPreferenceItem)) {
            return false;
        }
        SchemeStat$TypeClickPreferenceItem schemeStat$TypeClickPreferenceItem = (SchemeStat$TypeClickPreferenceItem) obj;
        return this.type == schemeStat$TypeClickPreferenceItem.type && epx.f(this.choosePosition, schemeStat$TypeClickPreferenceItem.choosePosition) && epx.f(this.switchedTo, schemeStat$TypeClickPreferenceItem.switchedTo);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Integer num = this.choosePosition;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.switchedTo;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClickPreferenceItem(type=");
        sb.append(this.type);
        sb.append(", choosePosition=");
        sb.append(this.choosePosition);
        sb.append(", switchedTo=");
        return tn.a(sb, this.switchedTo, ')');
    }

    public /* synthetic */ SchemeStat$TypeClickPreferenceItem(Type type, Integer num, Boolean bool, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool);
    }
}
