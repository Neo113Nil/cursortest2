package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipsFloatingButton {

    @pmi0("clip_item")
    private final MobileOfficialAppsClipsStat$TypeClipsClipItem clipItem;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("id")
    private final String id;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click_floating_button")
        public static final EventType CLICK_FLOATING_BUTTON;

        @pmi0("click_link_floating_button")
        public static final EventType CLICK_LINK_FLOATING_BUTTON;

        @pmi0("close_floating_button")
        public static final EventType CLOSE_FLOATING_BUTTON;

        @pmi0("hide_modal_floating_button")
        public static final EventType HIDE_MODAL_FLOATING_BUTTON;

        @pmi0("show_floating_button")
        public static final EventType SHOW_FLOATING_BUTTON;

        static {
            EventType eventType = new EventType("SHOW_FLOATING_BUTTON", 0);
            SHOW_FLOATING_BUTTON = eventType;
            EventType eventType2 = new EventType("CLICK_FLOATING_BUTTON", 1);
            CLICK_FLOATING_BUTTON = eventType2;
            EventType eventType3 = new EventType("CLOSE_FLOATING_BUTTON", 2);
            CLOSE_FLOATING_BUTTON = eventType3;
            EventType eventType4 = new EventType("HIDE_MODAL_FLOATING_BUTTON", 3);
            HIDE_MODAL_FLOATING_BUTTON = eventType4;
            EventType eventType5 = new EventType("CLICK_LINK_FLOATING_BUTTON", 4);
            CLICK_LINK_FLOATING_BUTTON = eventType5;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5};
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

    public MobileOfficialAppsClipsStat$TypeClipsFloatingButton(EventType eventType, String str, MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem) {
        this.eventType = eventType;
        this.id = str;
        this.clipItem = mobileOfficialAppsClipsStat$TypeClipsClipItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipsFloatingButton)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipsFloatingButton mobileOfficialAppsClipsStat$TypeClipsFloatingButton = (MobileOfficialAppsClipsStat$TypeClipsFloatingButton) obj;
        return this.eventType == mobileOfficialAppsClipsStat$TypeClipsFloatingButton.eventType && epx.f(this.id, mobileOfficialAppsClipsStat$TypeClipsFloatingButton.id) && epx.f(this.clipItem, mobileOfficialAppsClipsStat$TypeClipsFloatingButton.clipItem);
    }

    public final int hashCode() {
        int a = urd0.a(this.eventType.hashCode() * 31, 31, this.id);
        MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem = this.clipItem;
        return a + (mobileOfficialAppsClipsStat$TypeClipsClipItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipsClipItem.hashCode());
    }

    public final String toString() {
        return "TypeClipsFloatingButton(eventType=" + this.eventType + ", id=" + this.id + ", clipItem=" + this.clipItem + ')';
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipsFloatingButton(EventType eventType, String str, MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem, int i, zcl zclVar) {
        this(eventType, str, (i & 4) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsClipItem);
    }
}
