package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypePerfPowerConsumption implements SchemeStat$EventBenchmarkMain.b {

    @pmi0("device_info_item")
    private final MobileOfficialAppsCoreDeviceStat$DeviceInfoItem deviceInfoItem;

    @pmi0("end_battery")
    private final int endBattery;

    @pmi0("end_temp")
    private final int endTemp;

    @pmi0("end_time")
    private final String endTime;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("is_started")
    private final Boolean isStarted;

    @pmi0("start_battery")
    private final int startBattery;

    @pmi0("start_temp")
    private final int startTemp;

    @pmi0("start_time")
    private final String startTime;

    @pmi0("was_charging")
    private final Boolean wasCharging;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("camera_live")
        public static final EventType CAMERA_LIVE;

        @pmi0("monthly_steps_sync")
        public static final EventType MONTHLY_STEPS_SYNC;

        @pmi0("video_player")
        public static final EventType VIDEO_PLAYER;

        @pmi0("voip_audio")
        public static final EventType VOIP_AUDIO;

        @pmi0("voip_video")
        public static final EventType VOIP_VIDEO;

        static {
            EventType eventType = new EventType("VOIP_AUDIO", 0);
            VOIP_AUDIO = eventType;
            EventType eventType2 = new EventType("VOIP_VIDEO", 1);
            VOIP_VIDEO = eventType2;
            EventType eventType3 = new EventType("VIDEO_PLAYER", 2);
            VIDEO_PLAYER = eventType3;
            EventType eventType4 = new EventType("CAMERA_LIVE", 3);
            CAMERA_LIVE = eventType4;
            EventType eventType5 = new EventType("MONTHLY_STEPS_SYNC", 4);
            MONTHLY_STEPS_SYNC = eventType5;
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

    public SchemeStat$TypePerfPowerConsumption(EventType eventType, MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem, String str, String str2, int i, int i2, int i3, int i4, Boolean bool, Boolean bool2) {
        this.eventType = eventType;
        this.deviceInfoItem = mobileOfficialAppsCoreDeviceStat$DeviceInfoItem;
        this.startTime = str;
        this.endTime = str2;
        this.startBattery = i;
        this.endBattery = i2;
        this.startTemp = i3;
        this.endTemp = i4;
        this.isStarted = bool;
        this.wasCharging = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypePerfPowerConsumption)) {
            return false;
        }
        SchemeStat$TypePerfPowerConsumption schemeStat$TypePerfPowerConsumption = (SchemeStat$TypePerfPowerConsumption) obj;
        return this.eventType == schemeStat$TypePerfPowerConsumption.eventType && epx.f(this.deviceInfoItem, schemeStat$TypePerfPowerConsumption.deviceInfoItem) && epx.f(this.startTime, schemeStat$TypePerfPowerConsumption.startTime) && epx.f(this.endTime, schemeStat$TypePerfPowerConsumption.endTime) && this.startBattery == schemeStat$TypePerfPowerConsumption.startBattery && this.endBattery == schemeStat$TypePerfPowerConsumption.endBattery && this.startTemp == schemeStat$TypePerfPowerConsumption.startTemp && this.endTemp == schemeStat$TypePerfPowerConsumption.endTemp && epx.f(this.isStarted, schemeStat$TypePerfPowerConsumption.isStarted) && epx.f(this.wasCharging, schemeStat$TypePerfPowerConsumption.wasCharging);
    }

    public final int hashCode() {
        int a = shy.a(this.endTemp, shy.a(this.startTemp, shy.a(this.endBattery, shy.a(this.startBattery, urd0.a(urd0.a((this.deviceInfoItem.hashCode() + (this.eventType.hashCode() * 31)) * 31, 31, this.startTime), 31, this.endTime), 31), 31), 31), 31);
        Boolean bool = this.isStarted;
        int hashCode = (a + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.wasCharging;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypePerfPowerConsumption(eventType=");
        sb.append(this.eventType);
        sb.append(", deviceInfoItem=");
        sb.append(this.deviceInfoItem);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", startBattery=");
        sb.append(this.startBattery);
        sb.append(", endBattery=");
        sb.append(this.endBattery);
        sb.append(", startTemp=");
        sb.append(this.startTemp);
        sb.append(", endTemp=");
        sb.append(this.endTemp);
        sb.append(", isStarted=");
        sb.append(this.isStarted);
        sb.append(", wasCharging=");
        return tn.a(sb, this.wasCharging, ')');
    }

    public /* synthetic */ SchemeStat$TypePerfPowerConsumption(EventType eventType, MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem, String str, String str2, int i, int i2, int i3, int i4, Boolean bool, Boolean bool2, int i5, zcl zclVar) {
        this(eventType, mobileOfficialAppsCoreDeviceStat$DeviceInfoItem, str, str2, i, i2, i3, i4, (i5 & 256) != 0 ? null : bool, (i5 & 512) != 0 ? null : bool2);
    }
}
