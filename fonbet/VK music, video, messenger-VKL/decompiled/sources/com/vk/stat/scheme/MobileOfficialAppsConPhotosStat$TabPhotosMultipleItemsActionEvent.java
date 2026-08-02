package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent {

    @pmi0("string_value_param")
    private final MobileOfficialAppsConPhotosStat$StringValueParam stringValueParam;

    @pmi0("tab_photos_multiple_items_action_event_type")
    private final TabPhotosMultipleItemsActionEventType tabPhotosMultipleItemsActionEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class TabPhotosMultipleItemsActionEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TabPhotosMultipleItemsActionEventType[] $VALUES;

        @pmi0("archivate")
        public static final TabPhotosMultipleItemsActionEventType ARCHIVATE;

        @pmi0("click_to_share")
        public static final TabPhotosMultipleItemsActionEventType CLICK_TO_SHARE;

        @pmi0("delete")
        public static final TabPhotosMultipleItemsActionEventType DELETE;

        @pmi0("download")
        public static final TabPhotosMultipleItemsActionEventType DOWNLOAD;

        @pmi0("move_to_album")
        public static final TabPhotosMultipleItemsActionEventType MOVE_TO_ALBUM;

        static {
            TabPhotosMultipleItemsActionEventType tabPhotosMultipleItemsActionEventType = new TabPhotosMultipleItemsActionEventType("DOWNLOAD", 0);
            DOWNLOAD = tabPhotosMultipleItemsActionEventType;
            TabPhotosMultipleItemsActionEventType tabPhotosMultipleItemsActionEventType2 = new TabPhotosMultipleItemsActionEventType("DELETE", 1);
            DELETE = tabPhotosMultipleItemsActionEventType2;
            TabPhotosMultipleItemsActionEventType tabPhotosMultipleItemsActionEventType3 = new TabPhotosMultipleItemsActionEventType("ARCHIVATE", 2);
            ARCHIVATE = tabPhotosMultipleItemsActionEventType3;
            TabPhotosMultipleItemsActionEventType tabPhotosMultipleItemsActionEventType4 = new TabPhotosMultipleItemsActionEventType("CLICK_TO_SHARE", 3);
            CLICK_TO_SHARE = tabPhotosMultipleItemsActionEventType4;
            TabPhotosMultipleItemsActionEventType tabPhotosMultipleItemsActionEventType5 = new TabPhotosMultipleItemsActionEventType("MOVE_TO_ALBUM", 4);
            MOVE_TO_ALBUM = tabPhotosMultipleItemsActionEventType5;
            TabPhotosMultipleItemsActionEventType[] tabPhotosMultipleItemsActionEventTypeArr = {tabPhotosMultipleItemsActionEventType, tabPhotosMultipleItemsActionEventType2, tabPhotosMultipleItemsActionEventType3, tabPhotosMultipleItemsActionEventType4, tabPhotosMultipleItemsActionEventType5};
            $VALUES = tabPhotosMultipleItemsActionEventTypeArr;
            $ENTRIES = new asp(tabPhotosMultipleItemsActionEventTypeArr);
        }

        private TabPhotosMultipleItemsActionEventType(String str, int i) {
        }

        public static TabPhotosMultipleItemsActionEventType valueOf(String str) {
            return (TabPhotosMultipleItemsActionEventType) Enum.valueOf(TabPhotosMultipleItemsActionEventType.class, str);
        }

        public static TabPhotosMultipleItemsActionEventType[] values() {
            return (TabPhotosMultipleItemsActionEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent(TabPhotosMultipleItemsActionEventType tabPhotosMultipleItemsActionEventType, MobileOfficialAppsConPhotosStat$StringValueParam mobileOfficialAppsConPhotosStat$StringValueParam) {
        this.tabPhotosMultipleItemsActionEventType = tabPhotosMultipleItemsActionEventType;
        this.stringValueParam = mobileOfficialAppsConPhotosStat$StringValueParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent mobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent = (MobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent) obj;
        return this.tabPhotosMultipleItemsActionEventType == mobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent.tabPhotosMultipleItemsActionEventType && epx.f(this.stringValueParam, mobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent.stringValueParam);
    }

    public final int hashCode() {
        return this.stringValueParam.hashCode() + (this.tabPhotosMultipleItemsActionEventType.hashCode() * 31);
    }

    public final String toString() {
        return "TabPhotosMultipleItemsActionEvent(tabPhotosMultipleItemsActionEventType=" + this.tabPhotosMultipleItemsActionEventType + ", stringValueParam=" + this.stringValueParam + ')';
    }
}
