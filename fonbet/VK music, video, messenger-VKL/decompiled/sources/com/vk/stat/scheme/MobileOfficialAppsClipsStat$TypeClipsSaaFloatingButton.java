package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("hide_position")
    private final Integer hidePosition;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click_to_button")
        public static final EventType CLICK_TO_BUTTON;

        @pmi0("click_to_button_hide")
        public static final EventType CLICK_TO_BUTTON_HIDE;

        @pmi0("click_to_install")
        public static final EventType CLICK_TO_INSTALL;

        @pmi0("show_button")
        public static final EventType SHOW_BUTTON;

        static {
            EventType eventType = new EventType("CLICK_TO_BUTTON", 0);
            CLICK_TO_BUTTON = eventType;
            EventType eventType2 = new EventType("CLICK_TO_BUTTON_HIDE", 1);
            CLICK_TO_BUTTON_HIDE = eventType2;
            EventType eventType3 = new EventType("CLICK_TO_INSTALL", 2);
            CLICK_TO_INSTALL = eventType3;
            EventType eventType4 = new EventType("SHOW_BUTTON", 3);
            SHOW_BUTTON = eventType4;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4};
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

    public MobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton(EventType eventType, Integer num) {
        this.eventType = eventType;
        this.hidePosition = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton mobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton = (MobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton) obj;
        return this.eventType == mobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton.eventType && epx.f(this.hidePosition, mobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton.hidePosition);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        Integer num = this.hidePosition;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClipsSaaFloatingButton(eventType=");
        sb.append(this.eventType);
        sb.append(", hidePosition=");
        return uqi.b(sb, this.hidePosition, ')');
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipsSaaFloatingButton(EventType eventType, Integer num, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : num);
    }
}
