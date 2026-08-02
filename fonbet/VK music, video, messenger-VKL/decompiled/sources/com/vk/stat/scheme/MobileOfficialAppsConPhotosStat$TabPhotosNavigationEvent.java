package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent {

    @pmi0("tab_photos_navigation_event_type")
    private final TabPhotosNavigationEventType tabPhotosNavigationEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class TabPhotosNavigationEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TabPhotosNavigationEventType[] $VALUES;

        @pmi0("click_to_create")
        public static final TabPhotosNavigationEventType CLICK_TO_CREATE;

        @pmi0("click_to_settings")
        public static final TabPhotosNavigationEventType CLICK_TO_SETTINGS;

        @pmi0("open_archive")
        public static final TabPhotosNavigationEventType OPEN_ARCHIVE;

        static {
            TabPhotosNavigationEventType tabPhotosNavigationEventType = new TabPhotosNavigationEventType("CLICK_TO_CREATE", 0);
            CLICK_TO_CREATE = tabPhotosNavigationEventType;
            TabPhotosNavigationEventType tabPhotosNavigationEventType2 = new TabPhotosNavigationEventType("CLICK_TO_SETTINGS", 1);
            CLICK_TO_SETTINGS = tabPhotosNavigationEventType2;
            TabPhotosNavigationEventType tabPhotosNavigationEventType3 = new TabPhotosNavigationEventType("OPEN_ARCHIVE", 2);
            OPEN_ARCHIVE = tabPhotosNavigationEventType3;
            TabPhotosNavigationEventType[] tabPhotosNavigationEventTypeArr = {tabPhotosNavigationEventType, tabPhotosNavigationEventType2, tabPhotosNavigationEventType3};
            $VALUES = tabPhotosNavigationEventTypeArr;
            $ENTRIES = new asp(tabPhotosNavigationEventTypeArr);
        }

        private TabPhotosNavigationEventType(String str, int i) {
        }

        public static TabPhotosNavigationEventType valueOf(String str) {
            return (TabPhotosNavigationEventType) Enum.valueOf(TabPhotosNavigationEventType.class, str);
        }

        public static TabPhotosNavigationEventType[] values() {
            return (TabPhotosNavigationEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent(TabPhotosNavigationEventType tabPhotosNavigationEventType) {
        this.tabPhotosNavigationEventType = tabPhotosNavigationEventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent) && this.tabPhotosNavigationEventType == ((MobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent) obj).tabPhotosNavigationEventType;
    }

    public final int hashCode() {
        return this.tabPhotosNavigationEventType.hashCode();
    }

    public final String toString() {
        return "TabPhotosNavigationEvent(tabPhotosNavigationEventType=" + this.tabPhotosNavigationEventType + ')';
    }
}
