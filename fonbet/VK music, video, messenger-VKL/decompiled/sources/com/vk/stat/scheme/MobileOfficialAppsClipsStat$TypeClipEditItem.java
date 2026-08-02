package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipEditItem implements SchemeStat$TypeAction.b {

    @pmi0("clip_item")
    private final MobileOfficialAppsClipsStat$TypeClipsClipItem clipItem;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("object_value")
    private final List<MobileOfficialAppsClipsStat$TypeClipEditChangedValue> objectValue;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("clip_edit")
        public static final EventType CLIP_EDIT;

        @pmi0("select_hashtag_trend_hint")
        public static final EventType SELECT_HASHTAG_TREND_HINT;

        static {
            EventType eventType = new EventType("CLIP_EDIT", 0);
            CLIP_EDIT = eventType;
            EventType eventType2 = new EventType("SELECT_HASHTAG_TREND_HINT", 1);
            SELECT_HASHTAG_TREND_HINT = eventType2;
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

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsClipsStat$TypeClipEditItem(EventType eventType, List<? extends MobileOfficialAppsClipsStat$TypeClipEditChangedValue> list, MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem) {
        this.eventType = eventType;
        this.objectValue = list;
        this.clipItem = mobileOfficialAppsClipsStat$TypeClipsClipItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipEditItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipEditItem mobileOfficialAppsClipsStat$TypeClipEditItem = (MobileOfficialAppsClipsStat$TypeClipEditItem) obj;
        return this.eventType == mobileOfficialAppsClipsStat$TypeClipEditItem.eventType && epx.f(this.objectValue, mobileOfficialAppsClipsStat$TypeClipEditItem.objectValue) && epx.f(this.clipItem, mobileOfficialAppsClipsStat$TypeClipEditItem.clipItem);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        List<MobileOfficialAppsClipsStat$TypeClipEditChangedValue> list = this.objectValue;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem = this.clipItem;
        return hashCode2 + (mobileOfficialAppsClipsStat$TypeClipsClipItem != null ? mobileOfficialAppsClipsStat$TypeClipsClipItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeClipEditItem(eventType=" + this.eventType + ", objectValue=" + this.objectValue + ", clipItem=" + this.clipItem + ')';
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipEditItem(EventType eventType, List list, MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsClipItem);
    }
}
