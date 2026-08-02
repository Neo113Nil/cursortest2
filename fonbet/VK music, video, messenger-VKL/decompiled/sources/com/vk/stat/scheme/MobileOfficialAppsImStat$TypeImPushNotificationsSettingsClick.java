package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick implements SchemeStat$TypeClick.b {

    @pmi0("community_id")
    private final Long communityId;

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

        @pmi0("push_disabled")
        public static final Event PUSH_DISABLED;

        @pmi0("push_enabled")
        public static final Event PUSH_ENABLED;

        static {
            Event event = new Event("PUSH_ENABLED", 0);
            PUSH_ENABLED = event;
            Event event2 = new Event("PUSH_DISABLED", 1);
            PUSH_DISABLED = event2;
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
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class Label {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Label[] $VALUES;

        @pmi0("community_pushes_detailed")
        public static final Label COMMUNITY_PUSHES_DETAILED;

        @pmi0("selected_community_pushes")
        public static final Label SELECTED_COMMUNITY_PUSHES;

        static {
            Label label = new Label("SELECTED_COMMUNITY_PUSHES", 0);
            SELECTED_COMMUNITY_PUSHES = label;
            Label label2 = new Label("COMMUNITY_PUSHES_DETAILED", 1);
            COMMUNITY_PUSHES_DETAILED = label2;
            Label[] labelArr = {label, label2};
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

        @pmi0("selected")
        public static final LabelType SELECTED;

        static {
            LabelType labelType = new LabelType("ALL", 0);
            ALL = labelType;
            LabelType labelType2 = new LabelType("SELECTED", 1);
            SELECTED = labelType2;
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

    public MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick(Event event, Label label, Long l, LabelType labelType) {
        this.event = event;
        this.label = label;
        this.communityId = l;
        this.labelType = labelType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick)) {
            return false;
        }
        MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick mobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick = (MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick) obj;
        return this.event == mobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick.event && this.label == mobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick.label && epx.f(this.communityId, mobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick.communityId) && this.labelType == mobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick.labelType;
    }

    public final int hashCode() {
        int hashCode = (this.label.hashCode() + (this.event.hashCode() * 31)) * 31;
        Long l = this.communityId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        LabelType labelType = this.labelType;
        return hashCode2 + (labelType != null ? labelType.hashCode() : 0);
    }

    public final String toString() {
        return "TypeImPushNotificationsSettingsClick(event=" + this.event + ", label=" + this.label + ", communityId=" + this.communityId + ", labelType=" + this.labelType + ')';
    }

    public /* synthetic */ MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick(Event event, Label label, Long l, LabelType labelType, int i, zcl zclVar) {
        this(event, label, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : labelType);
    }
}
