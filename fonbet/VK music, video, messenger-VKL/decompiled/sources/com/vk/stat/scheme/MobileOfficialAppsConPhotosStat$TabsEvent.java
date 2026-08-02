package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$TabsEvent {

    @pmi0("content_type")
    private final MobileOfficialAppsConPhotosStat$ContentType contentType;

    @pmi0("tabs_event_type")
    private final TabsEventType tabsEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class TabsEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TabsEventType[] $VALUES;

        @pmi0("change_tab")
        public static final TabsEventType CHANGE_TAB;

        static {
            TabsEventType tabsEventType = new TabsEventType("CHANGE_TAB", 0);
            CHANGE_TAB = tabsEventType;
            TabsEventType[] tabsEventTypeArr = {tabsEventType};
            $VALUES = tabsEventTypeArr;
            $ENTRIES = new asp(tabsEventTypeArr);
        }

        private TabsEventType(String str, int i) {
        }

        public static TabsEventType valueOf(String str) {
            return (TabsEventType) Enum.valueOf(TabsEventType.class, str);
        }

        public static TabsEventType[] values() {
            return (TabsEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$TabsEvent(TabsEventType tabsEventType, MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType) {
        this.tabsEventType = tabsEventType;
        this.contentType = mobileOfficialAppsConPhotosStat$ContentType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$TabsEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$TabsEvent mobileOfficialAppsConPhotosStat$TabsEvent = (MobileOfficialAppsConPhotosStat$TabsEvent) obj;
        return this.tabsEventType == mobileOfficialAppsConPhotosStat$TabsEvent.tabsEventType && this.contentType == mobileOfficialAppsConPhotosStat$TabsEvent.contentType;
    }

    public final int hashCode() {
        return this.contentType.hashCode() + (this.tabsEventType.hashCode() * 31);
    }

    public final String toString() {
        return "TabsEvent(tabsEventType=" + this.tabsEventType + ", contentType=" + this.contentType + ')';
    }
}
