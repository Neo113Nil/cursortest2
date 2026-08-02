package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoCreateClip implements SchemeStat$TypeClick.b {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("video_id")
    private final int videoId;

    @pmi0("video_owner_id")
    private final long videoOwnerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("from_video_additional")
        public static final EventSubtype FROM_VIDEO_ADDITIONAL;

        @pmi0("from_video_ellipsis")
        public static final EventSubtype FROM_VIDEO_ELLIPSIS;

        static {
            EventSubtype eventSubtype = new EventSubtype("FROM_VIDEO_ELLIPSIS", 0);
            FROM_VIDEO_ELLIPSIS = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("FROM_VIDEO_ADDITIONAL", 1);
            FROM_VIDEO_ADDITIONAL = eventSubtype2;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2};
            $VALUES = eventSubtypeArr;
            $ENTRIES = new asp(eventSubtypeArr);
        }

        private EventSubtype(String str, int i) {
        }

        public static EventSubtype valueOf(String str) {
            return (EventSubtype) Enum.valueOf(EventSubtype.class, str);
        }

        public static EventSubtype[] values() {
            return (EventSubtype[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("create_clip")
        public static final EventType CREATE_CLIP;

        @pmi0("create_clip_cancel")
        public static final EventType CREATE_CLIP_CANCEL;

        @pmi0("create_clip_cancel_no")
        public static final EventType CREATE_CLIP_CANCEL_NO;

        @pmi0("create_clip_cancel_yes")
        public static final EventType CREATE_CLIP_CANCEL_YES;

        @pmi0("create_clip_cut")
        public static final EventType CREATE_CLIP_CUT;

        @pmi0("create_clip_cut_crop")
        public static final EventType CREATE_CLIP_CUT_CROP;

        static {
            EventType eventType = new EventType("CREATE_CLIP", 0);
            CREATE_CLIP = eventType;
            EventType eventType2 = new EventType("CREATE_CLIP_CUT", 1);
            CREATE_CLIP_CUT = eventType2;
            EventType eventType3 = new EventType("CREATE_CLIP_CUT_CROP", 2);
            CREATE_CLIP_CUT_CROP = eventType3;
            EventType eventType4 = new EventType("CREATE_CLIP_CANCEL", 3);
            CREATE_CLIP_CANCEL = eventType4;
            EventType eventType5 = new EventType("CREATE_CLIP_CANCEL_YES", 4);
            CREATE_CLIP_CANCEL_YES = eventType5;
            EventType eventType6 = new EventType("CREATE_CLIP_CANCEL_NO", 5);
            CREATE_CLIP_CANCEL_NO = eventType6;
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

    public CommonVideoStat$TypeVideoCreateClip(long j, int i, EventType eventType, EventSubtype eventSubtype) {
        this.videoOwnerId = j;
        this.videoId = i;
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoCreateClip)) {
            return false;
        }
        CommonVideoStat$TypeVideoCreateClip commonVideoStat$TypeVideoCreateClip = (CommonVideoStat$TypeVideoCreateClip) obj;
        return this.videoOwnerId == commonVideoStat$TypeVideoCreateClip.videoOwnerId && this.videoId == commonVideoStat$TypeVideoCreateClip.videoId && this.eventType == commonVideoStat$TypeVideoCreateClip.eventType && this.eventSubtype == commonVideoStat$TypeVideoCreateClip.eventSubtype;
    }

    public final int hashCode() {
        int a = shy.a(this.videoId, Long.hashCode(this.videoOwnerId) * 31, 31);
        EventType eventType = this.eventType;
        int hashCode = (a + (eventType == null ? 0 : eventType.hashCode())) * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        return hashCode + (eventSubtype != null ? eventSubtype.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVideoCreateClip(videoOwnerId=" + this.videoOwnerId + ", videoId=" + this.videoId + ", eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ')';
    }

    public /* synthetic */ CommonVideoStat$TypeVideoCreateClip(long j, int i, EventType eventType, EventSubtype eventSubtype, int i2, zcl zclVar) {
        this(j, i, (i2 & 4) != 0 ? null : eventType, (i2 & 8) != 0 ? null : eventSubtype);
    }
}
