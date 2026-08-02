package com.vk.stat.scheme;

import com.coremedia.iso.boxes.FreeSpaceBox;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoCatalogWarmupClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click_to_search")
        public static final EventType CLICK_TO_SEARCH;

        @pmi0(FreeSpaceBox.TYPE)
        public static final EventType SKIP;

        static {
            EventType eventType = new EventType(BatchApiRequest.FIELD_VALUE_ON_ERROR_SKIP, 0);
            SKIP = eventType;
            EventType eventType2 = new EventType("CLICK_TO_SEARCH", 1);
            CLICK_TO_SEARCH = eventType2;
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

    public MobileOfficialAppsVideoStat$TypeVideoCatalogWarmupClick(EventType eventType) {
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoCatalogWarmupClick) && this.eventType == ((MobileOfficialAppsVideoStat$TypeVideoCatalogWarmupClick) obj).eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode();
    }

    public final String toString() {
        return "TypeVideoCatalogWarmupClick(eventType=" + this.eventType + ')';
    }
}
