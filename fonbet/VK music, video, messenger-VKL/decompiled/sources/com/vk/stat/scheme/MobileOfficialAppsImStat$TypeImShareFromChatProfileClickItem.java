package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("source")
    private final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("share_from_chat_profile")
        public static final EventType SHARE_FROM_CHAT_PROFILE;

        static {
            EventType eventType = new EventType("SHARE_FROM_CHAT_PROFILE", 0);
            SHARE_FROM_CHAT_PROFILE = eventType;
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
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("button_share_in_more_list")
        public static final Source BUTTON_SHARE_IN_MORE_LIST;

        @pmi0("button_share_in_upper_right_corner")
        public static final Source BUTTON_SHARE_IN_UPPER_RIGHT_CORNER;

        @pmi0("button_share_in_user_id")
        public static final Source BUTTON_SHARE_IN_USER_ID;

        static {
            Source source = new Source("BUTTON_SHARE_IN_UPPER_RIGHT_CORNER", 0);
            BUTTON_SHARE_IN_UPPER_RIGHT_CORNER = source;
            Source source2 = new Source("BUTTON_SHARE_IN_MORE_LIST", 1);
            BUTTON_SHARE_IN_MORE_LIST = source2;
            Source source3 = new Source("BUTTON_SHARE_IN_USER_ID", 2);
            BUTTON_SHARE_IN_USER_ID = source3;
            Source[] sourceArr = {source, source2, source3};
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

    public MobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem(EventType eventType, Source source) {
        this.eventType = eventType;
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem)) {
            return false;
        }
        MobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem mobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem = (MobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem) obj;
        return this.eventType == mobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem.eventType && this.source == mobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem.source;
    }

    public final int hashCode() {
        return this.source.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeImShareFromChatProfileClickItem(eventType=" + this.eventType + ", source=" + this.source + ')';
    }
}
