package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMiniappsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen implements SchemeStat$TypeAction.b {

    @pmi0("app_id")
    private final MobileOfficialAppsMiniappsStat$AppIdItem appId;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("source_info")
    private final SchemeStat$EventItem sourceInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMiniappsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final EventType CLOSE;

        @pmi0("launch_app")
        public static final EventType LAUNCH_APP;

        @pmi0("open")
        public static final EventType OPEN;

        static {
            EventType eventType = new EventType("OPEN", 0);
            OPEN = eventType;
            EventType eventType2 = new EventType("LAUNCH_APP", 1);
            LAUNCH_APP = eventType2;
            EventType eventType3 = new EventType("CLOSE", 2);
            CLOSE = eventType3;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3};
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

    public MobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen(EventType eventType, MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem, SchemeStat$EventItem schemeStat$EventItem) {
        this.eventType = eventType;
        this.appId = mobileOfficialAppsMiniappsStat$AppIdItem;
        this.sourceInfo = schemeStat$EventItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen)) {
            return false;
        }
        MobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen mobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen = (MobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen) obj;
        return this.eventType == mobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen.eventType && epx.f(this.appId, mobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen.appId) && epx.f(this.sourceInfo, mobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen.sourceInfo);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem = this.appId;
        int hashCode2 = (hashCode + (mobileOfficialAppsMiniappsStat$AppIdItem == null ? 0 : mobileOfficialAppsMiniappsStat$AppIdItem.hashCode())) * 31;
        SchemeStat$EventItem schemeStat$EventItem = this.sourceInfo;
        return hashCode2 + (schemeStat$EventItem != null ? schemeStat$EventItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMiniAppsInstallScreen(eventType=" + this.eventType + ", appId=" + this.appId + ", sourceInfo=" + this.sourceInfo + ')';
    }

    public /* synthetic */ MobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen(EventType eventType, MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem, SchemeStat$EventItem schemeStat$EventItem, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : mobileOfficialAppsMiniappsStat$AppIdItem, (i & 4) != 0 ? null : schemeStat$EventItem);
    }
}
