package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent {

    @pmi0("content_id_param")
    private final MobileOfficialAppsConPhotosStat$ContentIdParam contentIdParam;

    @pmi0("tab_albums_single_item_action_event_type")
    private final TabAlbumsSingleItemActionEventType tabAlbumsSingleItemActionEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class TabAlbumsSingleItemActionEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TabAlbumsSingleItemActionEventType[] $VALUES;

        @pmi0("click_to_share")
        public static final TabAlbumsSingleItemActionEventType CLICK_TO_SHARE;

        @pmi0("delete")
        public static final TabAlbumsSingleItemActionEventType DELETE;

        @pmi0("download")
        public static final TabAlbumsSingleItemActionEventType DOWNLOAD;

        @pmi0("edit")
        public static final TabAlbumsSingleItemActionEventType EDIT;

        @pmi0("longtap")
        public static final TabAlbumsSingleItemActionEventType LONGTAP;

        @pmi0("open")
        public static final TabAlbumsSingleItemActionEventType OPEN;

        static {
            TabAlbumsSingleItemActionEventType tabAlbumsSingleItemActionEventType = new TabAlbumsSingleItemActionEventType("OPEN", 0);
            OPEN = tabAlbumsSingleItemActionEventType;
            TabAlbumsSingleItemActionEventType tabAlbumsSingleItemActionEventType2 = new TabAlbumsSingleItemActionEventType("LONGTAP", 1);
            LONGTAP = tabAlbumsSingleItemActionEventType2;
            TabAlbumsSingleItemActionEventType tabAlbumsSingleItemActionEventType3 = new TabAlbumsSingleItemActionEventType("EDIT", 2);
            EDIT = tabAlbumsSingleItemActionEventType3;
            TabAlbumsSingleItemActionEventType tabAlbumsSingleItemActionEventType4 = new TabAlbumsSingleItemActionEventType("CLICK_TO_SHARE", 3);
            CLICK_TO_SHARE = tabAlbumsSingleItemActionEventType4;
            TabAlbumsSingleItemActionEventType tabAlbumsSingleItemActionEventType5 = new TabAlbumsSingleItemActionEventType("DOWNLOAD", 4);
            DOWNLOAD = tabAlbumsSingleItemActionEventType5;
            TabAlbumsSingleItemActionEventType tabAlbumsSingleItemActionEventType6 = new TabAlbumsSingleItemActionEventType("DELETE", 5);
            DELETE = tabAlbumsSingleItemActionEventType6;
            TabAlbumsSingleItemActionEventType[] tabAlbumsSingleItemActionEventTypeArr = {tabAlbumsSingleItemActionEventType, tabAlbumsSingleItemActionEventType2, tabAlbumsSingleItemActionEventType3, tabAlbumsSingleItemActionEventType4, tabAlbumsSingleItemActionEventType5, tabAlbumsSingleItemActionEventType6};
            $VALUES = tabAlbumsSingleItemActionEventTypeArr;
            $ENTRIES = new asp(tabAlbumsSingleItemActionEventTypeArr);
        }

        private TabAlbumsSingleItemActionEventType(String str, int i) {
        }

        public static TabAlbumsSingleItemActionEventType valueOf(String str) {
            return (TabAlbumsSingleItemActionEventType) Enum.valueOf(TabAlbumsSingleItemActionEventType.class, str);
        }

        public static TabAlbumsSingleItemActionEventType[] values() {
            return (TabAlbumsSingleItemActionEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent(TabAlbumsSingleItemActionEventType tabAlbumsSingleItemActionEventType, MobileOfficialAppsConPhotosStat$ContentIdParam mobileOfficialAppsConPhotosStat$ContentIdParam) {
        this.tabAlbumsSingleItemActionEventType = tabAlbumsSingleItemActionEventType;
        this.contentIdParam = mobileOfficialAppsConPhotosStat$ContentIdParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent mobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent = (MobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent) obj;
        return this.tabAlbumsSingleItemActionEventType == mobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent.tabAlbumsSingleItemActionEventType && epx.f(this.contentIdParam, mobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent.contentIdParam);
    }

    public final int hashCode() {
        return this.contentIdParam.hashCode() + (this.tabAlbumsSingleItemActionEventType.hashCode() * 31);
    }

    public final String toString() {
        return "TabAlbumsSingleItemActionEvent(tabAlbumsSingleItemActionEventType=" + this.tabAlbumsSingleItemActionEventType + ", contentIdParam=" + this.contentIdParam + ')';
    }
}
