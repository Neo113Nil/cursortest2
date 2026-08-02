package com.vk.stat.scheme;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$ClipsAnalyticsItem {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("object_type")
    private final ObjectType objectType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("author_analytics")
        public static final EventSubtype AUTHOR_ANALYTICS;

        @pmi0("clip_analytics")
        public static final EventSubtype CLIP_ANALYTICS;

        static {
            EventSubtype eventSubtype = new EventSubtype("CLIP_ANALYTICS", 0);
            CLIP_ANALYTICS = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("AUTHOR_ANALYTICS", 1);
            AUTHOR_ANALYTICS = eventSubtype2;
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
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class ObjectType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ObjectType[] $VALUES;

        @pmi0("grid")
        public static final ObjectType GRID;

        @pmi0("viewer")
        public static final ObjectType VIEWER;

        static {
            ObjectType objectType = new ObjectType("VIEWER", 0);
            VIEWER = objectType;
            ObjectType objectType2 = new ObjectType(SignalingProtocol.KEY_GRID, 1);
            GRID = objectType2;
            ObjectType[] objectTypeArr = {objectType, objectType2};
            $VALUES = objectTypeArr;
            $ENTRIES = new asp(objectTypeArr);
        }

        private ObjectType(String str, int i) {
        }

        public static ObjectType valueOf(String str) {
            return (ObjectType) Enum.valueOf(ObjectType.class, str);
        }

        public static ObjectType[] values() {
            return (ObjectType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsClipsStat$ClipsAnalyticsItem(ObjectType objectType, EventSubtype eventSubtype) {
        this.objectType = objectType;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$ClipsAnalyticsItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$ClipsAnalyticsItem mobileOfficialAppsClipsStat$ClipsAnalyticsItem = (MobileOfficialAppsClipsStat$ClipsAnalyticsItem) obj;
        return this.objectType == mobileOfficialAppsClipsStat$ClipsAnalyticsItem.objectType && this.eventSubtype == mobileOfficialAppsClipsStat$ClipsAnalyticsItem.eventSubtype;
    }

    public final int hashCode() {
        int hashCode = this.objectType.hashCode() * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        return hashCode + (eventSubtype == null ? 0 : eventSubtype.hashCode());
    }

    public final String toString() {
        return "ClipsAnalyticsItem(objectType=" + this.objectType + ", eventSubtype=" + this.eventSubtype + ')';
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$ClipsAnalyticsItem(ObjectType objectType, EventSubtype eventSubtype, int i, zcl zclVar) {
        this(objectType, (i & 2) != 0 ? null : eventSubtype);
    }
}
