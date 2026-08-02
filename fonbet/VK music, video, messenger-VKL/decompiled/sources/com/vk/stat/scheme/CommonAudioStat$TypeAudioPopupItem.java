package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioPopupItem implements SchemeStat$TypeView.b, SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final CommonStat$TypeCommonEventItem item;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("restriction")
        public static final EventType RESTRICTION;

        @pmi0("vpn")
        public static final EventType VPN;

        static {
            EventType eventType = new EventType("VPN", 0);
            VPN = eventType;
            EventType eventType2 = new EventType("RESTRICTION", 1);
            RESTRICTION = eventType2;
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

    public CommonAudioStat$TypeAudioPopupItem(CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem, EventType eventType) {
        this.item = commonStat$TypeCommonEventItem;
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioPopupItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioPopupItem commonAudioStat$TypeAudioPopupItem = (CommonAudioStat$TypeAudioPopupItem) obj;
        return epx.f(this.item, commonAudioStat$TypeAudioPopupItem.item) && this.eventType == commonAudioStat$TypeAudioPopupItem.eventType;
    }

    public final int hashCode() {
        int hashCode = this.item.hashCode() * 31;
        EventType eventType = this.eventType;
        return hashCode + (eventType == null ? 0 : eventType.hashCode());
    }

    public final String toString() {
        return "TypeAudioPopupItem(item=" + this.item + ", eventType=" + this.eventType + ')';
    }

    public /* synthetic */ CommonAudioStat$TypeAudioPopupItem(CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem, EventType eventType, int i, zcl zclVar) {
        this(commonStat$TypeCommonEventItem, (i & 2) != 0 ? null : eventType);
    }
}
