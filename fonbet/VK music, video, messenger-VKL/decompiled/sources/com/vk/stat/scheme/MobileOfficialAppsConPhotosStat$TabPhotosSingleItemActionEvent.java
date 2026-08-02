package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent {

    @pmi0("content_id_param")
    private final MobileOfficialAppsConPhotosStat$ContentIdParam contentIdParam;

    @pmi0("tab_photos_single_item_action_event_type")
    private final TabPhotosSingleItemActionEventType tabPhotosSingleItemActionEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class TabPhotosSingleItemActionEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TabPhotosSingleItemActionEventType[] $VALUES;

        @pmi0("click_to_pick")
        public static final TabPhotosSingleItemActionEventType CLICK_TO_PICK;

        @pmi0("open")
        public static final TabPhotosSingleItemActionEventType OPEN;

        @pmi0("pin")
        public static final TabPhotosSingleItemActionEventType PIN;

        @pmi0("unpin")
        public static final TabPhotosSingleItemActionEventType UNPIN;

        static {
            TabPhotosSingleItemActionEventType tabPhotosSingleItemActionEventType = new TabPhotosSingleItemActionEventType("OPEN", 0);
            OPEN = tabPhotosSingleItemActionEventType;
            TabPhotosSingleItemActionEventType tabPhotosSingleItemActionEventType2 = new TabPhotosSingleItemActionEventType("PIN", 1);
            PIN = tabPhotosSingleItemActionEventType2;
            TabPhotosSingleItemActionEventType tabPhotosSingleItemActionEventType3 = new TabPhotosSingleItemActionEventType("UNPIN", 2);
            UNPIN = tabPhotosSingleItemActionEventType3;
            TabPhotosSingleItemActionEventType tabPhotosSingleItemActionEventType4 = new TabPhotosSingleItemActionEventType("CLICK_TO_PICK", 3);
            CLICK_TO_PICK = tabPhotosSingleItemActionEventType4;
            TabPhotosSingleItemActionEventType[] tabPhotosSingleItemActionEventTypeArr = {tabPhotosSingleItemActionEventType, tabPhotosSingleItemActionEventType2, tabPhotosSingleItemActionEventType3, tabPhotosSingleItemActionEventType4};
            $VALUES = tabPhotosSingleItemActionEventTypeArr;
            $ENTRIES = new asp(tabPhotosSingleItemActionEventTypeArr);
        }

        private TabPhotosSingleItemActionEventType(String str, int i) {
        }

        public static TabPhotosSingleItemActionEventType valueOf(String str) {
            return (TabPhotosSingleItemActionEventType) Enum.valueOf(TabPhotosSingleItemActionEventType.class, str);
        }

        public static TabPhotosSingleItemActionEventType[] values() {
            return (TabPhotosSingleItemActionEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent(TabPhotosSingleItemActionEventType tabPhotosSingleItemActionEventType, MobileOfficialAppsConPhotosStat$ContentIdParam mobileOfficialAppsConPhotosStat$ContentIdParam) {
        this.tabPhotosSingleItemActionEventType = tabPhotosSingleItemActionEventType;
        this.contentIdParam = mobileOfficialAppsConPhotosStat$ContentIdParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent mobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent = (MobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent) obj;
        return this.tabPhotosSingleItemActionEventType == mobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent.tabPhotosSingleItemActionEventType && epx.f(this.contentIdParam, mobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent.contentIdParam);
    }

    public final int hashCode() {
        return this.contentIdParam.hashCode() + (this.tabPhotosSingleItemActionEventType.hashCode() * 31);
    }

    public final String toString() {
        return "TabPhotosSingleItemActionEvent(tabPhotosSingleItemActionEventType=" + this.tabPhotosSingleItemActionEventType + ", contentIdParam=" + this.contentIdParam + ')';
    }
}
