package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonProfileStat.kt */
/* loaded from: classes5.dex */
public final class CommonProfileStat$WatchingContentEvent {

    @pmi0("content_type")
    private final CommonProfileStat$ContentType contentType;

    @pmi0("watching_content_event_type")
    private final WatchingContentEventType watchingContentEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonProfileStat.kt */
    public static final class WatchingContentEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WatchingContentEventType[] $VALUES;

        @pmi0("click_to_addresses_button")
        public static final WatchingContentEventType CLICK_TO_ADDRESSES_BUTTON;

        @pmi0("click_to_add_content")
        public static final WatchingContentEventType CLICK_TO_ADD_CONTENT;

        @pmi0("click_to_albums_button")
        public static final WatchingContentEventType CLICK_TO_ALBUMS_BUTTON;

        @pmi0("click_to_articles_button")
        public static final WatchingContentEventType CLICK_TO_ARTICLES_BUTTON;

        @pmi0("click_to_chats_button")
        public static final WatchingContentEventType CLICK_TO_CHATS_BUTTON;

        @pmi0("click_to_classified")
        public static final WatchingContentEventType CLICK_TO_CLASSIFIED;

        @pmi0("click_to_clips_button")
        public static final WatchingContentEventType CLICK_TO_CLIPS_BUTTON;

        @pmi0("click_to_discussions_button")
        public static final WatchingContentEventType CLICK_TO_DISCUSSIONS_BUTTON;

        @pmi0("click_to_events_button")
        public static final WatchingContentEventType CLICK_TO_EVENTS_BUTTON;

        @pmi0("click_to_files_button")
        public static final WatchingContentEventType CLICK_TO_FILES_BUTTON;

        @pmi0("click_to_first_story_for_narrative_button")
        public static final WatchingContentEventType CLICK_TO_FIRST_STORY_FOR_NARRATIVE_BUTTON;

        @pmi0("click_to_gifts_button")
        public static final WatchingContentEventType CLICK_TO_GIFTS_BUTTON;

        @pmi0("click_to_market_button")
        public static final WatchingContentEventType CLICK_TO_MARKET_BUTTON;

        @pmi0("click_to_more_content")
        public static final WatchingContentEventType CLICK_TO_MORE_CONTENT;

        @pmi0("click_to_music_button")
        public static final WatchingContentEventType CLICK_TO_MUSIC_BUTTON;

        @pmi0("click_to_narratives_button")
        public static final WatchingContentEventType CLICK_TO_NARRATIVES_BUTTON;

        @pmi0("click_to_nfts_button")
        public static final WatchingContentEventType CLICK_TO_NFTS_BUTTON;

        @pmi0("click_to_photo_button")
        public static final WatchingContentEventType CLICK_TO_PHOTO_BUTTON;

        @pmi0("click_to_podcasts_button")
        public static final WatchingContentEventType CLICK_TO_PODCASTS_BUTTON;

        @pmi0("click_to_services_button")
        public static final WatchingContentEventType CLICK_TO_SERVICES_BUTTON;

        @pmi0("click_to_stereo_rooms_button")
        public static final WatchingContentEventType CLICK_TO_STEREO_ROOMS_BUTTON;

        @pmi0("click_to_tab")
        public static final WatchingContentEventType CLICK_TO_TAB;

        @pmi0("click_to_textlives_button")
        public static final WatchingContentEventType CLICK_TO_TEXTLIVES_BUTTON;

        @pmi0("click_to_video_button")
        public static final WatchingContentEventType CLICK_TO_VIDEO_BUTTON;

        @pmi0("click_to_wall_button")
        public static final WatchingContentEventType CLICK_TO_WALL_BUTTON;

        static {
            WatchingContentEventType watchingContentEventType = new WatchingContentEventType("CLICK_TO_PHOTO_BUTTON", 0);
            CLICK_TO_PHOTO_BUTTON = watchingContentEventType;
            WatchingContentEventType watchingContentEventType2 = new WatchingContentEventType("CLICK_TO_ALBUMS_BUTTON", 1);
            CLICK_TO_ALBUMS_BUTTON = watchingContentEventType2;
            WatchingContentEventType watchingContentEventType3 = new WatchingContentEventType("CLICK_TO_NARRATIVES_BUTTON", 2);
            CLICK_TO_NARRATIVES_BUTTON = watchingContentEventType3;
            WatchingContentEventType watchingContentEventType4 = new WatchingContentEventType("CLICK_TO_MUSIC_BUTTON", 3);
            CLICK_TO_MUSIC_BUTTON = watchingContentEventType4;
            WatchingContentEventType watchingContentEventType5 = new WatchingContentEventType("CLICK_TO_CLIPS_BUTTON", 4);
            CLICK_TO_CLIPS_BUTTON = watchingContentEventType5;
            WatchingContentEventType watchingContentEventType6 = new WatchingContentEventType("CLICK_TO_ARTICLES_BUTTON", 5);
            CLICK_TO_ARTICLES_BUTTON = watchingContentEventType6;
            WatchingContentEventType watchingContentEventType7 = new WatchingContentEventType("CLICK_TO_VIDEO_BUTTON", 6);
            CLICK_TO_VIDEO_BUTTON = watchingContentEventType7;
            WatchingContentEventType watchingContentEventType8 = new WatchingContentEventType("CLICK_TO_CLASSIFIED", 7);
            CLICK_TO_CLASSIFIED = watchingContentEventType8;
            WatchingContentEventType watchingContentEventType9 = new WatchingContentEventType("CLICK_TO_CHATS_BUTTON", 8);
            CLICK_TO_CHATS_BUTTON = watchingContentEventType9;
            WatchingContentEventType watchingContentEventType10 = new WatchingContentEventType("CLICK_TO_ADDRESSES_BUTTON", 9);
            CLICK_TO_ADDRESSES_BUTTON = watchingContentEventType10;
            WatchingContentEventType watchingContentEventType11 = new WatchingContentEventType("CLICK_TO_EVENTS_BUTTON", 10);
            CLICK_TO_EVENTS_BUTTON = watchingContentEventType11;
            WatchingContentEventType watchingContentEventType12 = new WatchingContentEventType("CLICK_TO_FILES_BUTTON", 11);
            CLICK_TO_FILES_BUTTON = watchingContentEventType12;
            WatchingContentEventType watchingContentEventType13 = new WatchingContentEventType("CLICK_TO_DISCUSSIONS_BUTTON", 12);
            CLICK_TO_DISCUSSIONS_BUTTON = watchingContentEventType13;
            WatchingContentEventType watchingContentEventType14 = new WatchingContentEventType("CLICK_TO_MARKET_BUTTON", 13);
            CLICK_TO_MARKET_BUTTON = watchingContentEventType14;
            WatchingContentEventType watchingContentEventType15 = new WatchingContentEventType("CLICK_TO_SERVICES_BUTTON", 14);
            CLICK_TO_SERVICES_BUTTON = watchingContentEventType15;
            WatchingContentEventType watchingContentEventType16 = new WatchingContentEventType("CLICK_TO_TEXTLIVES_BUTTON", 15);
            CLICK_TO_TEXTLIVES_BUTTON = watchingContentEventType16;
            WatchingContentEventType watchingContentEventType17 = new WatchingContentEventType("CLICK_TO_PODCASTS_BUTTON", 16);
            CLICK_TO_PODCASTS_BUTTON = watchingContentEventType17;
            WatchingContentEventType watchingContentEventType18 = new WatchingContentEventType("CLICK_TO_STEREO_ROOMS_BUTTON", 17);
            CLICK_TO_STEREO_ROOMS_BUTTON = watchingContentEventType18;
            WatchingContentEventType watchingContentEventType19 = new WatchingContentEventType("CLICK_TO_NFTS_BUTTON", 18);
            CLICK_TO_NFTS_BUTTON = watchingContentEventType19;
            WatchingContentEventType watchingContentEventType20 = new WatchingContentEventType("CLICK_TO_FIRST_STORY_FOR_NARRATIVE_BUTTON", 19);
            CLICK_TO_FIRST_STORY_FOR_NARRATIVE_BUTTON = watchingContentEventType20;
            WatchingContentEventType watchingContentEventType21 = new WatchingContentEventType("CLICK_TO_MORE_CONTENT", 20);
            CLICK_TO_MORE_CONTENT = watchingContentEventType21;
            WatchingContentEventType watchingContentEventType22 = new WatchingContentEventType("CLICK_TO_ADD_CONTENT", 21);
            CLICK_TO_ADD_CONTENT = watchingContentEventType22;
            WatchingContentEventType watchingContentEventType23 = new WatchingContentEventType("CLICK_TO_WALL_BUTTON", 22);
            CLICK_TO_WALL_BUTTON = watchingContentEventType23;
            WatchingContentEventType watchingContentEventType24 = new WatchingContentEventType("CLICK_TO_GIFTS_BUTTON", 23);
            CLICK_TO_GIFTS_BUTTON = watchingContentEventType24;
            WatchingContentEventType watchingContentEventType25 = new WatchingContentEventType("CLICK_TO_TAB", 24);
            CLICK_TO_TAB = watchingContentEventType25;
            WatchingContentEventType[] watchingContentEventTypeArr = {watchingContentEventType, watchingContentEventType2, watchingContentEventType3, watchingContentEventType4, watchingContentEventType5, watchingContentEventType6, watchingContentEventType7, watchingContentEventType8, watchingContentEventType9, watchingContentEventType10, watchingContentEventType11, watchingContentEventType12, watchingContentEventType13, watchingContentEventType14, watchingContentEventType15, watchingContentEventType16, watchingContentEventType17, watchingContentEventType18, watchingContentEventType19, watchingContentEventType20, watchingContentEventType21, watchingContentEventType22, watchingContentEventType23, watchingContentEventType24, watchingContentEventType25};
            $VALUES = watchingContentEventTypeArr;
            $ENTRIES = new asp(watchingContentEventTypeArr);
        }

        private WatchingContentEventType(String str, int i) {
        }

        public static WatchingContentEventType valueOf(String str) {
            return (WatchingContentEventType) Enum.valueOf(WatchingContentEventType.class, str);
        }

        public static WatchingContentEventType[] values() {
            return (WatchingContentEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommonProfileStat$WatchingContentEvent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonProfileStat$WatchingContentEvent)) {
            return false;
        }
        CommonProfileStat$WatchingContentEvent commonProfileStat$WatchingContentEvent = (CommonProfileStat$WatchingContentEvent) obj;
        return this.watchingContentEventType == commonProfileStat$WatchingContentEvent.watchingContentEventType && this.contentType == commonProfileStat$WatchingContentEvent.contentType;
    }

    public final int hashCode() {
        WatchingContentEventType watchingContentEventType = this.watchingContentEventType;
        int hashCode = (watchingContentEventType == null ? 0 : watchingContentEventType.hashCode()) * 31;
        CommonProfileStat$ContentType commonProfileStat$ContentType = this.contentType;
        return hashCode + (commonProfileStat$ContentType != null ? commonProfileStat$ContentType.hashCode() : 0);
    }

    public final String toString() {
        return "WatchingContentEvent(watchingContentEventType=" + this.watchingContentEventType + ", contentType=" + this.contentType + ')';
    }

    public CommonProfileStat$WatchingContentEvent(WatchingContentEventType watchingContentEventType, CommonProfileStat$ContentType commonProfileStat$ContentType) {
        this.watchingContentEventType = watchingContentEventType;
        this.contentType = commonProfileStat$ContentType;
    }

    public /* synthetic */ CommonProfileStat$WatchingContentEvent(WatchingContentEventType watchingContentEventType, CommonProfileStat$ContentType commonProfileStat$ContentType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : watchingContentEventType, (i & 2) != 0 ? null : commonProfileStat$ContentType);
    }
}
