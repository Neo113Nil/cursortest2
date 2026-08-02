package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent {

    @pmi0("content_id_param")
    private final MobileOfficialAppsConPhotosStat$ContentIdParam contentIdParam;

    @pmi0("string_value_param")
    private final MobileOfficialAppsConPhotosStat$StringValueParam stringValueParam;

    @pmi0("tab_photos_detailed_action_event_type")
    private final TabPhotosDetailedActionEventType tabPhotosDetailedActionEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class TabPhotosDetailedActionEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TabPhotosDetailedActionEventType[] $VALUES;

        @pmi0("go_to_album")
        public static final TabPhotosDetailedActionEventType GO_TO_ALBUM;

        @pmi0("longtap")
        public static final TabPhotosDetailedActionEventType LONGTAP;

        static {
            TabPhotosDetailedActionEventType tabPhotosDetailedActionEventType = new TabPhotosDetailedActionEventType("LONGTAP", 0);
            LONGTAP = tabPhotosDetailedActionEventType;
            TabPhotosDetailedActionEventType tabPhotosDetailedActionEventType2 = new TabPhotosDetailedActionEventType("GO_TO_ALBUM", 1);
            GO_TO_ALBUM = tabPhotosDetailedActionEventType2;
            TabPhotosDetailedActionEventType[] tabPhotosDetailedActionEventTypeArr = {tabPhotosDetailedActionEventType, tabPhotosDetailedActionEventType2};
            $VALUES = tabPhotosDetailedActionEventTypeArr;
            $ENTRIES = new asp(tabPhotosDetailedActionEventTypeArr);
        }

        private TabPhotosDetailedActionEventType(String str, int i) {
        }

        public static TabPhotosDetailedActionEventType valueOf(String str) {
            return (TabPhotosDetailedActionEventType) Enum.valueOf(TabPhotosDetailedActionEventType.class, str);
        }

        public static TabPhotosDetailedActionEventType[] values() {
            return (TabPhotosDetailedActionEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent(TabPhotosDetailedActionEventType tabPhotosDetailedActionEventType, MobileOfficialAppsConPhotosStat$ContentIdParam mobileOfficialAppsConPhotosStat$ContentIdParam, MobileOfficialAppsConPhotosStat$StringValueParam mobileOfficialAppsConPhotosStat$StringValueParam) {
        this.tabPhotosDetailedActionEventType = tabPhotosDetailedActionEventType;
        this.contentIdParam = mobileOfficialAppsConPhotosStat$ContentIdParam;
        this.stringValueParam = mobileOfficialAppsConPhotosStat$StringValueParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent mobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent = (MobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent) obj;
        return this.tabPhotosDetailedActionEventType == mobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent.tabPhotosDetailedActionEventType && epx.f(this.contentIdParam, mobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent.contentIdParam) && epx.f(this.stringValueParam, mobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent.stringValueParam);
    }

    public final int hashCode() {
        return this.stringValueParam.hashCode() + ((this.contentIdParam.hashCode() + (this.tabPhotosDetailedActionEventType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TabPhotosDetailedActionEvent(tabPhotosDetailedActionEventType=" + this.tabPhotosDetailedActionEventType + ", contentIdParam=" + this.contentIdParam + ", stringValueParam=" + this.stringValueParam + ')';
    }
}
