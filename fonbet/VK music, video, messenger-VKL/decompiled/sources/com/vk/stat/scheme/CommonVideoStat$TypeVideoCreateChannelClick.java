package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoCreateChannelClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("source")
    private final Source source;

    @pmi0("video_owner_id")
    private final Long videoOwnerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("add_cover")
        public static final EventType ADD_COVER;

        @pmi0("add_first_channel")
        public static final EventType ADD_FIRST_CHANNEL;

        @pmi0("click_create_channel")
        public static final EventType CLICK_CREATE_CHANNEL;

        @pmi0("click_first_channel_creation_onboarding")
        public static final EventType CLICK_FIRST_CHANNEL_CREATION_ONBOARDING;

        @pmi0("create_first_channel")
        public static final EventType CREATE_FIRST_CHANNEL;

        @pmi0("find_cover")
        public static final EventType FIND_COVER;

        static {
            EventType eventType = new EventType("CLICK_CREATE_CHANNEL", 0);
            CLICK_CREATE_CHANNEL = eventType;
            EventType eventType2 = new EventType("ADD_FIRST_CHANNEL", 1);
            ADD_FIRST_CHANNEL = eventType2;
            EventType eventType3 = new EventType("CREATE_FIRST_CHANNEL", 2);
            CREATE_FIRST_CHANNEL = eventType3;
            EventType eventType4 = new EventType("ADD_COVER", 3);
            ADD_COVER = eventType4;
            EventType eventType5 = new EventType("FIND_COVER", 4);
            FIND_COVER = eventType5;
            EventType eventType6 = new EventType("CLICK_FIRST_CHANNEL_CREATION_ONBOARDING", 5);
            CLICK_FIRST_CHANNEL_CREATION_ONBOARDING = eventType6;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6};
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
    /* compiled from: CommonVideoStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("clip_editing_block")
        public static final Source CLIP_EDITING_BLOCK;

        @pmi0("clip_publish_block")
        public static final Source CLIP_PUBLISH_BLOCK;

        static {
            Source source = new Source("CLIP_EDITING_BLOCK", 0);
            CLIP_EDITING_BLOCK = source;
            Source source2 = new Source("CLIP_PUBLISH_BLOCK", 1);
            CLIP_PUBLISH_BLOCK = source2;
            Source[] sourceArr = {source, source2};
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

    public CommonVideoStat$TypeVideoCreateChannelClick() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoCreateChannelClick)) {
            return false;
        }
        CommonVideoStat$TypeVideoCreateChannelClick commonVideoStat$TypeVideoCreateChannelClick = (CommonVideoStat$TypeVideoCreateChannelClick) obj;
        return this.eventType == commonVideoStat$TypeVideoCreateChannelClick.eventType && epx.f(this.videoOwnerId, commonVideoStat$TypeVideoCreateChannelClick.videoOwnerId) && this.source == commonVideoStat$TypeVideoCreateChannelClick.source;
    }

    public final int hashCode() {
        EventType eventType = this.eventType;
        int hashCode = (eventType == null ? 0 : eventType.hashCode()) * 31;
        Long l = this.videoOwnerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Source source = this.source;
        return hashCode2 + (source != null ? source.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVideoCreateChannelClick(eventType=" + this.eventType + ", videoOwnerId=" + this.videoOwnerId + ", source=" + this.source + ')';
    }

    public CommonVideoStat$TypeVideoCreateChannelClick(EventType eventType, Long l, Source source) {
        this.eventType = eventType;
        this.videoOwnerId = l;
        this.source = source;
    }

    public /* synthetic */ CommonVideoStat$TypeVideoCreateChannelClick(EventType eventType, Long l, Source source, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : eventType, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : source);
    }
}
