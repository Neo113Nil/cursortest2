package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes11.dex */
public final class CommonAudioStat$TypeAudioInputLagItem implements SchemeStat$EventBenchmarkMain.b {
    public final transient String a;

    @pmi0("audio_id")
    private final int audioId;

    @pmi0("audio_owner_id")
    private final long audioOwnerId;

    @pmi0("event_subtype")
    private final CommonAudioStat$AudioListeningPlayEventSubtypes eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("http_request_host")
    private final FilteredString filteredHttpRequestHost;

    @pmi0("is_vpn")
    private final boolean isVpn;

    @pmi0("load_source")
    private final LoadSource loadSource;

    @pmi0("nav_info")
    private final CommonAudioStat$AudioListeningNavInfo navInfo;

    @pmi0("network_effective_type")
    private final CommonCoreNetworkStat$NetworkEffectiveType networkEffectiveType;

    @pmi0(StatCustomFieldKey.NETWORK_TYPE)
    private final CommonCoreNetworkStat$NetworkType networkType;

    @pmi0("track_code")
    private final CommonStat$TypeTrackCodeItem trackCode;

    @pmi0("value")
    private final int value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("start")
        public static final EventType START;

        static {
            EventType eventType = new EventType("START", 0);
            START = eventType;
            EventType[] eventTypeArr = {eventType};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class LoadSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LoadSource[] $VALUES;

        @pmi0("cache")
        public static final LoadSource CACHE;

        @pmi0("downloaded")
        public static final LoadSource DOWNLOADED;

        @pmi0("network")
        public static final LoadSource NETWORK;

        static {
            LoadSource loadSource = new LoadSource("CACHE", 0);
            CACHE = loadSource;
            LoadSource loadSource2 = new LoadSource("DOWNLOADED", 1);
            DOWNLOADED = loadSource2;
            LoadSource loadSource3 = new LoadSource("NETWORK", 2);
            NETWORK = loadSource3;
            LoadSource[] loadSourceArr = {loadSource, loadSource2, loadSource3};
            $VALUES = loadSourceArr;
            $ENTRIES = new asp(loadSourceArr);
        }

        private LoadSource(String str, int i) {
        }

        public static LoadSource valueOf(String str) {
            return (LoadSource) Enum.valueOf(LoadSource.class, str);
        }

        public static LoadSource[] values() {
            return (LoadSource[]) $VALUES.clone();
        }
    }

    /* compiled from: CommonAudioStat.kt */
    public static final class PersistenceSerializer implements uay<CommonAudioStat$TypeAudioInputLagItem>, a9y<CommonAudioStat$TypeAudioInputLagItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            int p = fai.p(x9yVar, "value");
            int p2 = fai.p(x9yVar, "audio_id");
            long q = fai.q(x9yVar, "audio_owner_id");
            EventType eventType = (EventType) dq.f(x9yVar, "event_type", tru.a(), EventType.class);
            CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes = (CommonAudioStat$AudioListeningPlayEventSubtypes) dq.f(x9yVar, "event_subtype", tru.a(), CommonAudioStat$AudioListeningPlayEventSubtypes.class);
            CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = (CommonStat$TypeTrackCodeItem) dq.f(x9yVar, "track_code", tru.a(), CommonStat$TypeTrackCodeItem.class);
            CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType = (CommonCoreNetworkStat$NetworkType) dq.f(x9yVar, StatCustomFieldKey.NETWORK_TYPE, tru.a(), CommonCoreNetworkStat$NetworkType.class);
            boolean m = fai.m(x9yVar, "is_vpn");
            Gson a = tru.a();
            b9y q2 = x9yVar.q("nav_info");
            CommonAudioStat$AudioListeningNavInfo commonAudioStat$AudioListeningNavInfo = (CommonAudioStat$AudioListeningNavInfo) ((q2 == null || (q2 instanceof u9y)) ? null : a.fromJson(q2.k(), CommonAudioStat$AudioListeningNavInfo.class));
            Gson a2 = tru.a();
            b9y q3 = x9yVar.q("network_effective_type");
            CommonCoreNetworkStat$NetworkEffectiveType commonCoreNetworkStat$NetworkEffectiveType = (CommonCoreNetworkStat$NetworkEffectiveType) ((q3 == null || (q3 instanceof u9y)) ? null : a2.fromJson(q3.k(), CommonCoreNetworkStat$NetworkEffectiveType.class));
            String C = fai.C(x9yVar, "http_request_host");
            Gson a3 = tru.a();
            b9y q4 = x9yVar.q("load_source");
            return new CommonAudioStat$TypeAudioInputLagItem(p, p2, q, eventType, commonAudioStat$AudioListeningPlayEventSubtypes, commonStat$TypeTrackCodeItem, commonCoreNetworkStat$NetworkType, m, commonAudioStat$AudioListeningNavInfo, commonCoreNetworkStat$NetworkEffectiveType, C, (LoadSource) ((q4 == null || (q4 instanceof u9y)) ? null : a3.fromJson(q4.k(), LoadSource.class)));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonAudioStat$TypeAudioInputLagItem commonAudioStat$TypeAudioInputLagItem = (CommonAudioStat$TypeAudioInputLagItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("value", Integer.valueOf(commonAudioStat$TypeAudioInputLagItem.j()));
            x9yVar.n("audio_id", Integer.valueOf(commonAudioStat$TypeAudioInputLagItem.a()));
            x9yVar.n("audio_owner_id", Long.valueOf(commonAudioStat$TypeAudioInputLagItem.b()));
            x9yVar.o("event_type", tru.a().toJson(commonAudioStat$TypeAudioInputLagItem.d()));
            x9yVar.o("event_subtype", tru.a().toJson(commonAudioStat$TypeAudioInputLagItem.c()));
            x9yVar.o("track_code", tru.a().toJson(commonAudioStat$TypeAudioInputLagItem.i()));
            x9yVar.o(StatCustomFieldKey.NETWORK_TYPE, tru.a().toJson(commonAudioStat$TypeAudioInputLagItem.h()));
            x9yVar.m(Boolean.valueOf(commonAudioStat$TypeAudioInputLagItem.k()), "is_vpn");
            x9yVar.o("nav_info", tru.a().toJson(commonAudioStat$TypeAudioInputLagItem.f()));
            x9yVar.o("network_effective_type", tru.a().toJson(commonAudioStat$TypeAudioInputLagItem.g()));
            x9yVar.o("http_request_host", commonAudioStat$TypeAudioInputLagItem.a);
            x9yVar.o("load_source", tru.a().toJson(commonAudioStat$TypeAudioInputLagItem.e()));
            return x9yVar;
        }
    }

    public CommonAudioStat$TypeAudioInputLagItem(int i, int i2, long j, EventType eventType, CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType, boolean z, CommonAudioStat$AudioListeningNavInfo commonAudioStat$AudioListeningNavInfo, CommonCoreNetworkStat$NetworkEffectiveType commonCoreNetworkStat$NetworkEffectiveType, String str, LoadSource loadSource) {
        this.value = i;
        this.audioId = i2;
        this.audioOwnerId = j;
        this.eventType = eventType;
        this.eventSubtype = commonAudioStat$AudioListeningPlayEventSubtypes;
        this.trackCode = commonStat$TypeTrackCodeItem;
        this.networkType = commonCoreNetworkStat$NetworkType;
        this.isVpn = z;
        this.navInfo = commonAudioStat$AudioListeningNavInfo;
        this.networkEffectiveType = commonCoreNetworkStat$NetworkEffectiveType;
        this.a = str;
        this.loadSource = loadSource;
        FilteredString filteredString = new FilteredString(lhg.b(64));
        this.filteredHttpRequestHost = filteredString;
        filteredString.a(str);
    }

    public final int a() {
        return this.audioId;
    }

    public final long b() {
        return this.audioOwnerId;
    }

    public final CommonAudioStat$AudioListeningPlayEventSubtypes c() {
        return this.eventSubtype;
    }

    public final EventType d() {
        return this.eventType;
    }

    public final LoadSource e() {
        return this.loadSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioInputLagItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioInputLagItem commonAudioStat$TypeAudioInputLagItem = (CommonAudioStat$TypeAudioInputLagItem) obj;
        return this.value == commonAudioStat$TypeAudioInputLagItem.value && this.audioId == commonAudioStat$TypeAudioInputLagItem.audioId && this.audioOwnerId == commonAudioStat$TypeAudioInputLagItem.audioOwnerId && this.eventType == commonAudioStat$TypeAudioInputLagItem.eventType && this.eventSubtype == commonAudioStat$TypeAudioInputLagItem.eventSubtype && epx.f(this.trackCode, commonAudioStat$TypeAudioInputLagItem.trackCode) && this.networkType == commonAudioStat$TypeAudioInputLagItem.networkType && this.isVpn == commonAudioStat$TypeAudioInputLagItem.isVpn && epx.f(this.navInfo, commonAudioStat$TypeAudioInputLagItem.navInfo) && this.networkEffectiveType == commonAudioStat$TypeAudioInputLagItem.networkEffectiveType && epx.f(this.a, commonAudioStat$TypeAudioInputLagItem.a) && this.loadSource == commonAudioStat$TypeAudioInputLagItem.loadSource;
    }

    public final CommonAudioStat$AudioListeningNavInfo f() {
        return this.navInfo;
    }

    public final CommonCoreNetworkStat$NetworkEffectiveType g() {
        return this.networkEffectiveType;
    }

    public final CommonCoreNetworkStat$NetworkType h() {
        return this.networkType;
    }

    public final int hashCode() {
        int b = qoy.b((this.networkType.hashCode() + urd0.a((this.eventSubtype.hashCode() + ((this.eventType.hashCode() + bh10.a(shy.a(this.audioId, Integer.hashCode(this.value) * 31, 31), 31, this.audioOwnerId)) * 31)) * 31, 31, this.trackCode.a)) * 31, 31, this.isVpn);
        CommonAudioStat$AudioListeningNavInfo commonAudioStat$AudioListeningNavInfo = this.navInfo;
        int hashCode = (b + (commonAudioStat$AudioListeningNavInfo == null ? 0 : commonAudioStat$AudioListeningNavInfo.hashCode())) * 31;
        CommonCoreNetworkStat$NetworkEffectiveType commonCoreNetworkStat$NetworkEffectiveType = this.networkEffectiveType;
        int hashCode2 = (hashCode + (commonCoreNetworkStat$NetworkEffectiveType == null ? 0 : commonCoreNetworkStat$NetworkEffectiveType.hashCode())) * 31;
        String str = this.a;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        LoadSource loadSource = this.loadSource;
        return hashCode3 + (loadSource != null ? loadSource.hashCode() : 0);
    }

    public final CommonStat$TypeTrackCodeItem i() {
        return this.trackCode;
    }

    public final int j() {
        return this.value;
    }

    public final boolean k() {
        return this.isVpn;
    }

    public final String toString() {
        return "TypeAudioInputLagItem(value=" + this.value + ", audioId=" + this.audioId + ", audioOwnerId=" + this.audioOwnerId + ", eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ", trackCode=" + this.trackCode + ", networkType=" + this.networkType + ", isVpn=" + this.isVpn + ", navInfo=" + this.navInfo + ", networkEffectiveType=" + this.networkEffectiveType + ", httpRequestHost=" + this.a + ", loadSource=" + this.loadSource + ')';
    }

    public /* synthetic */ CommonAudioStat$TypeAudioInputLagItem(int i, int i2, long j, EventType eventType, CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType, boolean z, CommonAudioStat$AudioListeningNavInfo commonAudioStat$AudioListeningNavInfo, CommonCoreNetworkStat$NetworkEffectiveType commonCoreNetworkStat$NetworkEffectiveType, String str, LoadSource loadSource, int i3, zcl zclVar) {
        this(i, i2, j, eventType, commonAudioStat$AudioListeningPlayEventSubtypes, commonStat$TypeTrackCodeItem, commonCoreNetworkStat$NetworkType, z, (i3 & 256) != 0 ? null : commonAudioStat$AudioListeningNavInfo, (i3 & 512) != 0 ? null : commonCoreNetworkStat$NetworkEffectiveType, (i3 & 1024) != 0 ? null : str, (i3 & 2048) != 0 ? null : loadSource);
    }
}
