package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoToClipAttach implements SchemeStat$TypeClick.b {

    @pmi0("clips_count")
    private final Integer clipsCount;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("from_channel")
        public static final EventSubtype FROM_CHANNEL;

        @pmi0("from_edit")
        public static final EventSubtype FROM_EDIT;

        @pmi0("from_edit_clip_section_cabinet")
        public static final EventSubtype FROM_EDIT_CLIP_SECTION_CABINET;

        @pmi0("from_upload")
        public static final EventSubtype FROM_UPLOAD;

        @pmi0("from_upload_clip")
        public static final EventSubtype FROM_UPLOAD_CLIP;

        static {
            EventSubtype eventSubtype = new EventSubtype("FROM_CHANNEL", 0);
            FROM_CHANNEL = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("FROM_UPLOAD", 1);
            FROM_UPLOAD = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("FROM_EDIT", 2);
            FROM_EDIT = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("FROM_UPLOAD_CLIP", 3);
            FROM_UPLOAD_CLIP = eventSubtype4;
            EventSubtype eventSubtype5 = new EventSubtype("FROM_EDIT_CLIP_SECTION_CABINET", 4);
            FROM_EDIT_CLIP_SECTION_CABINET = eventSubtype5;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4, eventSubtype5};
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
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("attach_clip_cancel")
        public static final EventType ATTACH_CLIP_CANCEL;

        @pmi0("attach_clip_click")
        public static final EventType ATTACH_CLIP_CLICK;

        @pmi0("try_to_attach_clip")
        public static final EventType TRY_TO_ATTACH_CLIP;

        static {
            EventType eventType = new EventType("TRY_TO_ATTACH_CLIP", 0);
            TRY_TO_ATTACH_CLIP = eventType;
            EventType eventType2 = new EventType("ATTACH_CLIP_CLICK", 1);
            ATTACH_CLIP_CLICK = eventType2;
            EventType eventType3 = new EventType("ATTACH_CLIP_CANCEL", 2);
            ATTACH_CLIP_CANCEL = eventType3;
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

    public MobileOfficialAppsVideoStat$TypeVideoToClipAttach(EventType eventType, EventSubtype eventSubtype, Integer num) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
        this.clipsCount = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoToClipAttach)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoToClipAttach mobileOfficialAppsVideoStat$TypeVideoToClipAttach = (MobileOfficialAppsVideoStat$TypeVideoToClipAttach) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoToClipAttach.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoToClipAttach.eventSubtype && epx.f(this.clipsCount, mobileOfficialAppsVideoStat$TypeVideoToClipAttach.clipsCount);
    }

    public final int hashCode() {
        int hashCode = (this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31)) * 31;
        Integer num = this.clipsCount;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoToClipAttach(eventType=");
        sb.append(this.eventType);
        sb.append(", eventSubtype=");
        sb.append(this.eventSubtype);
        sb.append(", clipsCount=");
        return uqi.b(sb, this.clipsCount, ')');
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoToClipAttach(EventType eventType, EventSubtype eventSubtype, Integer num, int i, zcl zclVar) {
        this(eventType, eventSubtype, (i & 4) != 0 ? null : num);
    }
}
