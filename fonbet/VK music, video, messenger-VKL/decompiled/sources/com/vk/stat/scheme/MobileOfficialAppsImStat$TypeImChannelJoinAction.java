package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsImStat$TypeImChannelJoinAction implements SchemeStat$TypeAction.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    @pmi0("label_type")
    private final LabelType labelType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("join_channel")
        public static final Event JOIN_CHANNEL;

        static {
            Event event = new Event("JOIN_CHANNEL", 0);
            JOIN_CHANNEL = event;
            Event[] eventArr = {event};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        private Event(String str, int i) {
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class LabelType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LabelType[] $VALUES;

        @pmi0("channel_feed_recom")
        public static final LabelType CHANNEL_FEED_RECOM;

        @pmi0("channel_feed_recom_plus")
        public static final LabelType CHANNEL_FEED_RECOM_PLUS;

        static {
            LabelType labelType = new LabelType("CHANNEL_FEED_RECOM", 0);
            CHANNEL_FEED_RECOM = labelType;
            LabelType labelType2 = new LabelType("CHANNEL_FEED_RECOM_PLUS", 1);
            CHANNEL_FEED_RECOM_PLUS = labelType2;
            LabelType[] labelTypeArr = {labelType, labelType2};
            $VALUES = labelTypeArr;
            $ENTRIES = new asp(labelTypeArr);
        }

        private LabelType(String str, int i) {
        }

        public static LabelType valueOf(String str) {
            return (LabelType) Enum.valueOf(LabelType.class, str);
        }

        public static LabelType[] values() {
            return (LabelType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsImStat$TypeImChannelJoinAction(Event event, LabelType labelType) {
        this.event = event;
        this.labelType = labelType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$TypeImChannelJoinAction)) {
            return false;
        }
        MobileOfficialAppsImStat$TypeImChannelJoinAction mobileOfficialAppsImStat$TypeImChannelJoinAction = (MobileOfficialAppsImStat$TypeImChannelJoinAction) obj;
        return this.event == mobileOfficialAppsImStat$TypeImChannelJoinAction.event && this.labelType == mobileOfficialAppsImStat$TypeImChannelJoinAction.labelType;
    }

    public final int hashCode() {
        return this.labelType.hashCode() + (this.event.hashCode() * 31);
    }

    public final String toString() {
        return "TypeImChannelJoinAction(event=" + this.event + ", labelType=" + this.labelType + ')';
    }
}
