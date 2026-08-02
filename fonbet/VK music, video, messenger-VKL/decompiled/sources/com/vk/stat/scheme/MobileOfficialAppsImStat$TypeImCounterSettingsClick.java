package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.ironsource.C4217a2;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsImStat$TypeImCounterSettingsClick implements SchemeStat$TypeClick.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    @pmi0("label")
    private final Label label;

    @pmi0("label_type")
    private final LabelType labelType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("counter_disabled")
        public static final Event COUNTER_DISABLED;

        @pmi0("counter_enabled")
        public static final Event COUNTER_ENABLED;

        @pmi0(C4217a2.e)
        public static final Event DISABLED;

        @pmi0("enabled")
        public static final Event ENABLED;

        static {
            Event event = new Event("ENABLED", 0);
            ENABLED = event;
            Event event2 = new Event("DISABLED", 1);
            DISABLED = event2;
            Event event3 = new Event("COUNTER_ENABLED", 2);
            COUNTER_ENABLED = event3;
            Event event4 = new Event("COUNTER_DISABLED", 3);
            COUNTER_DISABLED = event4;
            Event[] eventArr = {event, event2, event3, event4};
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
    public static final class Label {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Label[] $VALUES;

        @pmi0("channels_counter_folder")
        public static final Label CHANNELS_COUNTER_FOLDER;

        @pmi0("channel_counter_manual")
        public static final Label CHANNEL_COUNTER_MANUAL;

        @pmi0("chats_counter")
        public static final Label CHATS_COUNTER;

        @pmi0("communities_counter_folder")
        public static final Label COMMUNITIES_COUNTER_FOLDER;

        @pmi0("communities_counter_manual")
        public static final Label COMMUNITIES_COUNTER_MANUAL;

        static {
            Label label = new Label("CHATS_COUNTER", 0);
            CHATS_COUNTER = label;
            Label label2 = new Label("COMMUNITIES_COUNTER_MANUAL", 1);
            COMMUNITIES_COUNTER_MANUAL = label2;
            Label label3 = new Label("CHANNEL_COUNTER_MANUAL", 2);
            CHANNEL_COUNTER_MANUAL = label3;
            Label label4 = new Label("COMMUNITIES_COUNTER_FOLDER", 3);
            COMMUNITIES_COUNTER_FOLDER = label4;
            Label label5 = new Label("CHANNELS_COUNTER_FOLDER", 4);
            CHANNELS_COUNTER_FOLDER = label5;
            Label[] labelArr = {label, label2, label3, label4, label5};
            $VALUES = labelArr;
            $ENTRIES = new asp(labelArr);
        }

        private Label(String str, int i) {
        }

        public static Label valueOf(String str) {
            return (Label) Enum.valueOf(Label.class, str);
        }

        public static Label[] values() {
            return (Label[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class LabelType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LabelType[] $VALUES;

        @pmi0("all")
        public static final LabelType ALL;

        @pmi0("with_push")
        public static final LabelType WITH_PUSH;

        static {
            LabelType labelType = new LabelType("ALL", 0);
            ALL = labelType;
            LabelType labelType2 = new LabelType("WITH_PUSH", 1);
            WITH_PUSH = labelType2;
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

    public MobileOfficialAppsImStat$TypeImCounterSettingsClick(Event event, Label label, LabelType labelType) {
        this.event = event;
        this.label = label;
        this.labelType = labelType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$TypeImCounterSettingsClick)) {
            return false;
        }
        MobileOfficialAppsImStat$TypeImCounterSettingsClick mobileOfficialAppsImStat$TypeImCounterSettingsClick = (MobileOfficialAppsImStat$TypeImCounterSettingsClick) obj;
        return this.event == mobileOfficialAppsImStat$TypeImCounterSettingsClick.event && this.label == mobileOfficialAppsImStat$TypeImCounterSettingsClick.label && this.labelType == mobileOfficialAppsImStat$TypeImCounterSettingsClick.labelType;
    }

    public final int hashCode() {
        int hashCode = (this.label.hashCode() + (this.event.hashCode() * 31)) * 31;
        LabelType labelType = this.labelType;
        return hashCode + (labelType == null ? 0 : labelType.hashCode());
    }

    public final String toString() {
        return "TypeImCounterSettingsClick(event=" + this.event + ", label=" + this.label + ", labelType=" + this.labelType + ')';
    }

    public /* synthetic */ MobileOfficialAppsImStat$TypeImCounterSettingsClick(Event event, Label label, LabelType labelType, int i, zcl zclVar) {
        this(event, label, (i & 4) != 0 ? null : labelType);
    }
}
