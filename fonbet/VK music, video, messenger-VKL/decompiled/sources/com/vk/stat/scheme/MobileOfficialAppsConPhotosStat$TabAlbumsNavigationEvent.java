package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent {

    @pmi0("tab_albums_navigation_event_type")
    private final TabAlbumsNavigationEventType tabAlbumsNavigationEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class TabAlbumsNavigationEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TabAlbumsNavigationEventType[] $VALUES;

        @pmi0("click_to_create")
        public static final TabAlbumsNavigationEventType CLICK_TO_CREATE;

        @pmi0("click_to_settings")
        public static final TabAlbumsNavigationEventType CLICK_TO_SETTINGS;

        static {
            TabAlbumsNavigationEventType tabAlbumsNavigationEventType = new TabAlbumsNavigationEventType("CLICK_TO_CREATE", 0);
            CLICK_TO_CREATE = tabAlbumsNavigationEventType;
            TabAlbumsNavigationEventType tabAlbumsNavigationEventType2 = new TabAlbumsNavigationEventType("CLICK_TO_SETTINGS", 1);
            CLICK_TO_SETTINGS = tabAlbumsNavigationEventType2;
            TabAlbumsNavigationEventType[] tabAlbumsNavigationEventTypeArr = {tabAlbumsNavigationEventType, tabAlbumsNavigationEventType2};
            $VALUES = tabAlbumsNavigationEventTypeArr;
            $ENTRIES = new asp(tabAlbumsNavigationEventTypeArr);
        }

        private TabAlbumsNavigationEventType(String str, int i) {
        }

        public static TabAlbumsNavigationEventType valueOf(String str) {
            return (TabAlbumsNavigationEventType) Enum.valueOf(TabAlbumsNavigationEventType.class, str);
        }

        public static TabAlbumsNavigationEventType[] values() {
            return (TabAlbumsNavigationEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent(TabAlbumsNavigationEventType tabAlbumsNavigationEventType) {
        this.tabAlbumsNavigationEventType = tabAlbumsNavigationEventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent) && this.tabAlbumsNavigationEventType == ((MobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent) obj).tabAlbumsNavigationEventType;
    }

    public final int hashCode() {
        return this.tabAlbumsNavigationEventType.hashCode();
    }

    public final String toString() {
        return "TabAlbumsNavigationEvent(tabAlbumsNavigationEventType=" + this.tabAlbumsNavigationEventType + ')';
    }
}
