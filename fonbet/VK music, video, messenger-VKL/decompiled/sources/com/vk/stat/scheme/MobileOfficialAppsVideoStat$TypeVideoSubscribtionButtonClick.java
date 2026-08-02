package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("source")
    private final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("type_join")
        public static final EventType TYPE_JOIN;

        @pmi0("type_leave")
        public static final EventType TYPE_LEAVE;

        static {
            EventType eventType = new EventType("TYPE_JOIN", 0);
            TYPE_JOIN = eventType;
            EventType eventType2 = new EventType("TYPE_LEAVE", 1);
            TYPE_LEAVE = eventType2;
            EventType[] eventTypeArr = {eventType, eventType2};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        private EventType(String str, int i) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("clips")
        public static final Source CLIPS;

        @pmi0("clips_owner")
        public static final Source CLIPS_OWNER;

        @pmi0("meta_group")
        public static final Source META_GROUP;

        @pmi0("similar_channels")
        public static final Source SIMILAR_CHANNELS;

        @pmi0("video_channel")
        public static final Source VIDEO_CHANNEL;

        @pmi0("video_discovery")
        public static final Source VIDEO_DISCOVERY;

        @pmi0("video_fullscreen_landscape")
        public static final Source VIDEO_FULLSCREEN_LANDSCAPE;

        @pmi0("video_fullscreen_portrait")
        public static final Source VIDEO_FULLSCREEN_PORTRAIT;

        @pmi0("video_search_author")
        public static final Source VIDEO_SEARCH_AUTHOR;

        static {
            Source source = new Source("VIDEO_DISCOVERY", 0);
            VIDEO_DISCOVERY = source;
            Source source2 = new Source("VIDEO_CHANNEL", 1);
            VIDEO_CHANNEL = source2;
            Source source3 = new Source("VIDEO_SEARCH_AUTHOR", 2);
            VIDEO_SEARCH_AUTHOR = source3;
            Source source4 = new Source("CLIPS_OWNER", 3);
            CLIPS_OWNER = source4;
            Source source5 = new Source("CLIPS", 4);
            CLIPS = source5;
            Source source6 = new Source("SIMILAR_CHANNELS", 5);
            SIMILAR_CHANNELS = source6;
            Source source7 = new Source("VIDEO_FULLSCREEN_LANDSCAPE", 6);
            VIDEO_FULLSCREEN_LANDSCAPE = source7;
            Source source8 = new Source("VIDEO_FULLSCREEN_PORTRAIT", 7);
            VIDEO_FULLSCREEN_PORTRAIT = source8;
            Source source9 = new Source("META_GROUP", 8);
            META_GROUP = source9;
            Source[] sourceArr = {source, source2, source3, source4, source5, source6, source7, source8, source9};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        private Source(String str, int i) {
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick(Source source, EventType eventType) {
        this.source = source;
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick mobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick = (MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick) obj;
        return this.source == mobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick.source && this.eventType == mobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick.eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode() + (this.source.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVideoSubscribtionButtonClick(source=" + this.source + ", eventType=" + this.eventType + ')';
    }
}
