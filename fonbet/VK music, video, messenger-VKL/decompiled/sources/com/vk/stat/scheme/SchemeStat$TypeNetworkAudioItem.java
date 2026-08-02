package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeNetworkAudioItem implements SchemeStat$EventBenchmarkMain.b {

    @pmi0("audio_id")
    private final int audioId;

    @pmi0("buffering_time")
    private final Integer bufferingTime;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("fragment_duration")
    private final Integer fragmentDuration;

    @pmi0("fragment_id")
    private final int fragmentId;

    @pmi0("http_request_host")
    private final String httpRequestHost;

    @pmi0("http_response_code")
    private final Integer httpResponseCode;

    @pmi0("is_vpn")
    private final Boolean isVpn;

    @pmi0("network_info")
    private final MobileOfficialAppsCoreDeviceStat$NetworkInfo networkInfo;

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("protocol")
    private final SchemeStat$TypeNetworkProtocol protocol;

    @pmi0("response_time")
    private final Integer responseTime;

    @pmi0("response_ttfb")
    private final Integer responseTtfb;

    @pmi0("response_ttff")
    private final Integer responseTtff;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("fragment_loaded")
        public static final EventType FRAGMENT_LOADED;

        @pmi0("fragment_stalled")
        public static final EventType FRAGMENT_STALLED;

        static {
            EventType eventType = new EventType("FRAGMENT_LOADED", 0);
            FRAGMENT_LOADED = eventType;
            EventType eventType2 = new EventType("FRAGMENT_STALLED", 1);
            FRAGMENT_STALLED = eventType2;
            EventType[] eventTypeArr = {eventType, eventType2};
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

    public SchemeStat$TypeNetworkAudioItem(EventType eventType, long j, int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo, String str, Integer num6, SchemeStat$TypeNetworkProtocol schemeStat$TypeNetworkProtocol, Boolean bool) {
        this.eventType = eventType;
        this.ownerId = j;
        this.audioId = i;
        this.fragmentId = i2;
        this.responseTtfb = num;
        this.responseTtff = num2;
        this.responseTime = num3;
        this.bufferingTime = num4;
        this.fragmentDuration = num5;
        this.networkInfo = mobileOfficialAppsCoreDeviceStat$NetworkInfo;
        this.httpRequestHost = str;
        this.httpResponseCode = num6;
        this.protocol = schemeStat$TypeNetworkProtocol;
        this.isVpn = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeNetworkAudioItem)) {
            return false;
        }
        SchemeStat$TypeNetworkAudioItem schemeStat$TypeNetworkAudioItem = (SchemeStat$TypeNetworkAudioItem) obj;
        return this.eventType == schemeStat$TypeNetworkAudioItem.eventType && this.ownerId == schemeStat$TypeNetworkAudioItem.ownerId && this.audioId == schemeStat$TypeNetworkAudioItem.audioId && this.fragmentId == schemeStat$TypeNetworkAudioItem.fragmentId && epx.f(this.responseTtfb, schemeStat$TypeNetworkAudioItem.responseTtfb) && epx.f(this.responseTtff, schemeStat$TypeNetworkAudioItem.responseTtff) && epx.f(this.responseTime, schemeStat$TypeNetworkAudioItem.responseTime) && epx.f(this.bufferingTime, schemeStat$TypeNetworkAudioItem.bufferingTime) && epx.f(this.fragmentDuration, schemeStat$TypeNetworkAudioItem.fragmentDuration) && epx.f(this.networkInfo, schemeStat$TypeNetworkAudioItem.networkInfo) && epx.f(this.httpRequestHost, schemeStat$TypeNetworkAudioItem.httpRequestHost) && epx.f(this.httpResponseCode, schemeStat$TypeNetworkAudioItem.httpResponseCode) && this.protocol == schemeStat$TypeNetworkAudioItem.protocol && epx.f(this.isVpn, schemeStat$TypeNetworkAudioItem.isVpn);
    }

    public final int hashCode() {
        int a = shy.a(this.fragmentId, shy.a(this.audioId, bh10.a(this.eventType.hashCode() * 31, 31, this.ownerId), 31), 31);
        Integer num = this.responseTtfb;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.responseTtff;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.responseTime;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.bufferingTime;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.fragmentDuration;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo = this.networkInfo;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsCoreDeviceStat$NetworkInfo == null ? 0 : mobileOfficialAppsCoreDeviceStat$NetworkInfo.hashCode())) * 31;
        String str = this.httpRequestHost;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num6 = this.httpResponseCode;
        int hashCode8 = (hashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        SchemeStat$TypeNetworkProtocol schemeStat$TypeNetworkProtocol = this.protocol;
        int hashCode9 = (hashCode8 + (schemeStat$TypeNetworkProtocol == null ? 0 : schemeStat$TypeNetworkProtocol.hashCode())) * 31;
        Boolean bool = this.isVpn;
        return hashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeNetworkAudioItem(eventType=");
        sb.append(this.eventType);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", audioId=");
        sb.append(this.audioId);
        sb.append(", fragmentId=");
        sb.append(this.fragmentId);
        sb.append(", responseTtfb=");
        sb.append(this.responseTtfb);
        sb.append(", responseTtff=");
        sb.append(this.responseTtff);
        sb.append(", responseTime=");
        sb.append(this.responseTime);
        sb.append(", bufferingTime=");
        sb.append(this.bufferingTime);
        sb.append(", fragmentDuration=");
        sb.append(this.fragmentDuration);
        sb.append(", networkInfo=");
        sb.append(this.networkInfo);
        sb.append(", httpRequestHost=");
        sb.append(this.httpRequestHost);
        sb.append(", httpResponseCode=");
        sb.append(this.httpResponseCode);
        sb.append(", protocol=");
        sb.append(this.protocol);
        sb.append(", isVpn=");
        return tn.a(sb, this.isVpn, ')');
    }

    public /* synthetic */ SchemeStat$TypeNetworkAudioItem(EventType eventType, long j, int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo, String str, Integer num6, SchemeStat$TypeNetworkProtocol schemeStat$TypeNetworkProtocol, Boolean bool, int i3, zcl zclVar) {
        this(eventType, j, i, i2, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : num2, (i3 & 64) != 0 ? null : num3, (i3 & 128) != 0 ? null : num4, (i3 & 256) != 0 ? null : num5, (i3 & 512) != 0 ? null : mobileOfficialAppsCoreDeviceStat$NetworkInfo, (i3 & 1024) != 0 ? null : str, (i3 & 2048) != 0 ? null : num6, (i3 & 4096) != 0 ? null : schemeStat$TypeNetworkProtocol, (i3 & 8192) != 0 ? null : bool);
    }
}
