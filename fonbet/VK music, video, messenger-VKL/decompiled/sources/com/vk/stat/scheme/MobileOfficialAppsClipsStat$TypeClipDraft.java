package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipEditorItem;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipDraft implements MobileOfficialAppsClipsStat$TypeClipEditorItem.a {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("delete_draft")
        public static final EventType DELETE_DRAFT;

        @pmi0("open_draft")
        public static final EventType OPEN_DRAFT;

        @pmi0("save_draft")
        public static final EventType SAVE_DRAFT;

        static {
            EventType eventType = new EventType("OPEN_DRAFT", 0);
            OPEN_DRAFT = eventType;
            EventType eventType2 = new EventType("SAVE_DRAFT", 1);
            SAVE_DRAFT = eventType2;
            EventType eventType3 = new EventType("DELETE_DRAFT", 2);
            DELETE_DRAFT = eventType3;
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

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsClipsStat$TypeClipDraft() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsClipsStat$TypeClipDraft) && this.eventType == ((MobileOfficialAppsClipsStat$TypeClipDraft) obj).eventType;
    }

    public final int hashCode() {
        EventType eventType = this.eventType;
        if (eventType == null) {
            return 0;
        }
        return eventType.hashCode();
    }

    public final String toString() {
        return "TypeClipDraft(eventType=" + this.eventType + ')';
    }

    public MobileOfficialAppsClipsStat$TypeClipDraft(EventType eventType) {
        this.eventType = eventType;
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipDraft(EventType eventType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : eventType);
    }
}
