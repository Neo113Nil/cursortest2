package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMarusiaStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarusiaStat$TypeAppWidgetItem {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    @pmi0("type")
    private final Type type;

    @pmi0("type_day_summary_app_widget_item")
    private final MobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem typeDaySummaryAppWidgetItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMarusiaStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("added")
        public static final Event ADDED;

        @pmi0("removed")
        public static final Event REMOVED;

        static {
            Event event = new Event("ADDED", 0);
            ADDED = event;
            Event event2 = new Event(SignalingProtocol.HUNGUP_REASON_REMOVED, 1);
            REMOVED = event2;
            Event[] eventArr = {event, event2};
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
    /* compiled from: MobileOfficialAppsMarusiaStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_day_summary_app_widget_item")
        public static final Type TYPE_DAY_SUMMARY_APP_WIDGET_ITEM;

        static {
            Type type = new Type("TYPE_DAY_SUMMARY_APP_WIDGET_ITEM", 0);
            TYPE_DAY_SUMMARY_APP_WIDGET_ITEM = type;
            Type[] typeArr = {type};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ MobileOfficialAppsMarusiaStat$TypeAppWidgetItem(Type type, Event event, MobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem mobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem, zcl zclVar) {
        this(type, event, mobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarusiaStat$TypeAppWidgetItem)) {
            return false;
        }
        MobileOfficialAppsMarusiaStat$TypeAppWidgetItem mobileOfficialAppsMarusiaStat$TypeAppWidgetItem = (MobileOfficialAppsMarusiaStat$TypeAppWidgetItem) obj;
        return this.type == mobileOfficialAppsMarusiaStat$TypeAppWidgetItem.type && this.event == mobileOfficialAppsMarusiaStat$TypeAppWidgetItem.event && epx.f(this.typeDaySummaryAppWidgetItem, mobileOfficialAppsMarusiaStat$TypeAppWidgetItem.typeDaySummaryAppWidgetItem);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Event event = this.event;
        int hashCode2 = (hashCode + (event == null ? 0 : event.hashCode())) * 31;
        MobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem mobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem = this.typeDaySummaryAppWidgetItem;
        return hashCode2 + (mobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem != null ? mobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAppWidgetItem(type=" + this.type + ", event=" + this.event + ", typeDaySummaryAppWidgetItem=" + this.typeDaySummaryAppWidgetItem + ')';
    }

    private MobileOfficialAppsMarusiaStat$TypeAppWidgetItem(Type type, Event event, MobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem mobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem) {
        this.type = type;
        this.event = event;
        this.typeDaySummaryAppWidgetItem = mobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem;
    }

    public /* synthetic */ MobileOfficialAppsMarusiaStat$TypeAppWidgetItem(Type type, Event event, MobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem mobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : event, (i & 4) != 0 ? null : mobileOfficialAppsMarusiaStat$TypeDaySummaryAppWidgetItem);
    }
}
