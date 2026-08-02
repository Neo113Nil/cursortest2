package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoMoviePageButtonClick implements SchemeStat$TypeClick.b {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("object_value")
    private final ObjectValue objectValue;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("add_video")
        public static final EventSubtype ADD_VIDEO;

        @pmi0("collapse")
        public static final EventSubtype COLLAPSE;

        @pmi0("details_close")
        public static final EventSubtype DETAILS_CLOSE;

        @pmi0("details_open")
        public static final EventSubtype DETAILS_OPEN;

        @pmi0("remove_video")
        public static final EventSubtype REMOVE_VIDEO;

        @pmi0("share")
        public static final EventSubtype SHARE;

        @pmi0("trailer")
        public static final EventSubtype TRAILER;

        @pmi0("trailer_start")
        public static final EventSubtype TRAILER_START;

        @pmi0("watch")
        public static final EventSubtype WATCH;

        static {
            EventSubtype eventSubtype = new EventSubtype("WATCH", 0);
            WATCH = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("TRAILER", 1);
            TRAILER = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("COLLAPSE", 2);
            COLLAPSE = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("SHARE", 3);
            SHARE = eventSubtype4;
            EventSubtype eventSubtype5 = new EventSubtype("ADD_VIDEO", 4);
            ADD_VIDEO = eventSubtype5;
            EventSubtype eventSubtype6 = new EventSubtype("REMOVE_VIDEO", 5);
            REMOVE_VIDEO = eventSubtype6;
            EventSubtype eventSubtype7 = new EventSubtype("TRAILER_START", 6);
            TRAILER_START = eventSubtype7;
            EventSubtype eventSubtype8 = new EventSubtype("DETAILS_OPEN", 7);
            DETAILS_OPEN = eventSubtype8;
            EventSubtype eventSubtype9 = new EventSubtype("DETAILS_CLOSE", 8);
            DETAILS_CLOSE = eventSubtype9;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4, eventSubtype5, eventSubtype6, eventSubtype7, eventSubtype8, eventSubtype9};
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

        @pmi0("button_click")
        public static final EventType BUTTON_CLICK;

        static {
            EventType eventType = new EventType("BUTTON_CLICK", 0);
            BUTTON_CLICK = eventType;
            EventType[] eventTypeArr = {eventType};
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
    public static final class ObjectValue {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ObjectValue[] $VALUES;

        @pmi0("about_movie")
        public static final ObjectValue ABOUT_MOVIE;

        @pmi0("description")
        public static final ObjectValue DESCRIPTION;

        static {
            ObjectValue objectValue = new ObjectValue(NativeAdContent.ViewTag.AD_DESCRIPTION, 0);
            DESCRIPTION = objectValue;
            ObjectValue objectValue2 = new ObjectValue("ABOUT_MOVIE", 1);
            ABOUT_MOVIE = objectValue2;
            ObjectValue[] objectValueArr = {objectValue, objectValue2};
            $VALUES = objectValueArr;
            $ENTRIES = new asp(objectValueArr);
        }

        private ObjectValue(String str, int i) {
        }

        public static ObjectValue valueOf(String str) {
            return (ObjectValue) Enum.valueOf(ObjectValue.class, str);
        }

        public static ObjectValue[] values() {
            return (ObjectValue[]) $VALUES.clone();
        }
    }

    public CommonVideoStat$TypeVideoMoviePageButtonClick() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoMoviePageButtonClick)) {
            return false;
        }
        CommonVideoStat$TypeVideoMoviePageButtonClick commonVideoStat$TypeVideoMoviePageButtonClick = (CommonVideoStat$TypeVideoMoviePageButtonClick) obj;
        return this.eventType == commonVideoStat$TypeVideoMoviePageButtonClick.eventType && this.eventSubtype == commonVideoStat$TypeVideoMoviePageButtonClick.eventSubtype && this.objectValue == commonVideoStat$TypeVideoMoviePageButtonClick.objectValue;
    }

    public final int hashCode() {
        EventType eventType = this.eventType;
        int hashCode = (eventType == null ? 0 : eventType.hashCode()) * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        int hashCode2 = (hashCode + (eventSubtype == null ? 0 : eventSubtype.hashCode())) * 31;
        ObjectValue objectValue = this.objectValue;
        return hashCode2 + (objectValue != null ? objectValue.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVideoMoviePageButtonClick(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ", objectValue=" + this.objectValue + ')';
    }

    public CommonVideoStat$TypeVideoMoviePageButtonClick(EventType eventType, EventSubtype eventSubtype, ObjectValue objectValue) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
        this.objectValue = objectValue;
    }

    public /* synthetic */ CommonVideoStat$TypeVideoMoviePageButtonClick(EventType eventType, EventSubtype eventSubtype, ObjectValue objectValue, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : eventType, (i & 2) != 0 ? null : eventSubtype, (i & 4) != 0 ? null : objectValue);
    }
}
