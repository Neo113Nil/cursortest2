package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoCreateChannelAction implements SchemeStat$TypeAction.b {

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

        @pmi0("create_new_channel")
        public static final EventType CREATE_NEW_CHANNEL;

        @pmi0("error_create_channel")
        public static final EventType ERROR_CREATE_CHANNEL;

        @pmi0("show_first_channel_creation_onboarding")
        public static final EventType SHOW_FIRST_CHANNEL_CREATION_ONBOARDING;

        static {
            EventType eventType = new EventType("CREATE_NEW_CHANNEL", 0);
            CREATE_NEW_CHANNEL = eventType;
            EventType eventType2 = new EventType("ERROR_CREATE_CHANNEL", 1);
            ERROR_CREATE_CHANNEL = eventType2;
            EventType eventType3 = new EventType("SHOW_FIRST_CHANNEL_CREATION_ONBOARDING", 2);
            SHOW_FIRST_CHANNEL_CREATION_ONBOARDING = eventType3;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3};
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

    public CommonVideoStat$TypeVideoCreateChannelAction(EventType eventType, Long l, Source source) {
        this.eventType = eventType;
        this.videoOwnerId = l;
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoCreateChannelAction)) {
            return false;
        }
        CommonVideoStat$TypeVideoCreateChannelAction commonVideoStat$TypeVideoCreateChannelAction = (CommonVideoStat$TypeVideoCreateChannelAction) obj;
        return this.eventType == commonVideoStat$TypeVideoCreateChannelAction.eventType && epx.f(this.videoOwnerId, commonVideoStat$TypeVideoCreateChannelAction.videoOwnerId) && this.source == commonVideoStat$TypeVideoCreateChannelAction.source;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        Long l = this.videoOwnerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Source source = this.source;
        return hashCode2 + (source != null ? source.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVideoCreateChannelAction(eventType=" + this.eventType + ", videoOwnerId=" + this.videoOwnerId + ", source=" + this.source + ')';
    }

    public /* synthetic */ CommonVideoStat$TypeVideoCreateChannelAction(EventType eventType, Long l, Source source, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : source);
    }
}
