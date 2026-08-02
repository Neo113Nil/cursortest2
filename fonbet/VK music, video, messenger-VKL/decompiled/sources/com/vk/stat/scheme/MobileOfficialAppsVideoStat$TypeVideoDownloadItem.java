package com.vk.stat.scheme;

import com.ironsource.X3;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoDownloadItem implements SchemeStat$TypeClick.b {

    @pmi0("client_time")
    private final Long clientTime;

    @pmi0("event_source")
    private final MobileOfficialAppsVideoStat$VideoEventSource eventSource;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("quality")
    private final MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem quality;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("cancelled")
        public static final EventType CANCELLED;

        @pmi0("continued")
        public static final EventType CONTINUED;

        @pmi0("finished")
        public static final EventType FINISHED;

        @pmi0(X3.i.e0)
        public static final EventType PAUSED;

        @pmi0(X3.i.d0)
        public static final EventType STARTED;

        static {
            EventType eventType = new EventType(SignalingProtocol.STATE_STARTED, 0);
            STARTED = eventType;
            EventType eventType2 = new EventType("FINISHED", 1);
            FINISHED = eventType2;
            EventType eventType3 = new EventType("CANCELLED", 2);
            CANCELLED = eventType3;
            EventType eventType4 = new EventType("PAUSED", 3);
            PAUSED = eventType4;
            EventType eventType5 = new EventType("CONTINUED", 4);
            CONTINUED = eventType5;
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

    public MobileOfficialAppsVideoStat$TypeVideoDownloadItem() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoDownloadItem)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoDownloadItem mobileOfficialAppsVideoStat$TypeVideoDownloadItem = (MobileOfficialAppsVideoStat$TypeVideoDownloadItem) obj;
        return this.quality == mobileOfficialAppsVideoStat$TypeVideoDownloadItem.quality && this.eventType == mobileOfficialAppsVideoStat$TypeVideoDownloadItem.eventType && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoDownloadItem.screenMode && epx.f(this.clientTime, mobileOfficialAppsVideoStat$TypeVideoDownloadItem.clientTime) && this.eventSource == mobileOfficialAppsVideoStat$TypeVideoDownloadItem.eventSource;
    }

    public final int hashCode() {
        MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem = this.quality;
        int hashCode = (mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem == null ? 0 : mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem.hashCode()) * 31;
        EventType eventType = this.eventType;
        int hashCode2 = (hashCode + (eventType == null ? 0 : eventType.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = this.screenMode;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsVideoStat$TypeScreenMode == null ? 0 : mobileOfficialAppsVideoStat$TypeScreenMode.hashCode())) * 31;
        Long l = this.clientTime;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource = this.eventSource;
        return hashCode4 + (mobileOfficialAppsVideoStat$VideoEventSource != null ? mobileOfficialAppsVideoStat$VideoEventSource.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVideoDownloadItem(quality=" + this.quality + ", eventType=" + this.eventType + ", screenMode=" + this.screenMode + ", clientTime=" + this.clientTime + ", eventSource=" + this.eventSource + ')';
    }

    public MobileOfficialAppsVideoStat$TypeVideoDownloadItem(MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem, EventType eventType, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, Long l, MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource) {
        this.quality = mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem;
        this.eventType = eventType;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
        this.clientTime = l;
        this.eventSource = mobileOfficialAppsVideoStat$VideoEventSource;
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoDownloadItem(MobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem, EventType eventType, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, Long l, MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsCoreSettingsStat$SettingsVideoDownloadQualityItem, (i & 2) != 0 ? null : eventType, (i & 4) != 0 ? null : mobileOfficialAppsVideoStat$TypeScreenMode, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : mobileOfficialAppsVideoStat$VideoEventSource);
    }
}
