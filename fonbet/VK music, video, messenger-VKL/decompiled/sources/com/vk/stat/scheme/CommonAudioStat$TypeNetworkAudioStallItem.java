package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.a9y;
import xsna.b9y;
import xsna.bh10;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes11.dex */
public final class CommonAudioStat$TypeNetworkAudioStallItem implements SchemeStat$EventBenchmarkMain.b {
    public final transient String a;

    @pmi0("audio_id")
    private final long audioId;

    @pmi0("buffering_time")
    private final Integer bufferingTime;

    @pmi0("http_request_host")
    private final FilteredString filteredHttpRequestHost;

    @pmi0("fragment_id")
    private final long fragmentId;

    @pmi0("is_vpn")
    private final Boolean isVpn;

    @pmi0("network_effective_type")
    private final CommonCoreNetworkStat$NetworkEffectiveType networkEffectiveType;

    @pmi0(StatCustomFieldKey.NETWORK_TYPE)
    private final CommonCoreNetworkStat$NetworkType networkType;

    @pmi0("owner_id")
    private final long ownerId;

    /* compiled from: CommonAudioStat.kt */
    public static final class PersistenceSerializer implements uay<CommonAudioStat$TypeNetworkAudioStallItem>, a9y<CommonAudioStat$TypeNetworkAudioStallItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            long q = fai.q(x9yVar, "owner_id");
            long q2 = fai.q(x9yVar, "audio_id");
            long q3 = fai.q(x9yVar, "fragment_id");
            Integer A = fai.A(x9yVar, "buffering_time");
            Boolean y = fai.y(x9yVar, "is_vpn");
            String C = fai.C(x9yVar, "http_request_host");
            Gson a = tru.a();
            b9y q4 = x9yVar.q(StatCustomFieldKey.NETWORK_TYPE);
            Object obj = null;
            CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType = (CommonCoreNetworkStat$NetworkType) ((q4 == null || (q4 instanceof u9y)) ? null : a.fromJson(q4.k(), CommonCoreNetworkStat$NetworkType.class));
            Gson a2 = tru.a();
            b9y q5 = x9yVar.q("network_effective_type");
            if (q5 != null && !(q5 instanceof u9y)) {
                obj = a2.fromJson(q5.k(), (Class<Object>) CommonCoreNetworkStat$NetworkEffectiveType.class);
            }
            return new CommonAudioStat$TypeNetworkAudioStallItem(q, q2, q3, A, y, C, commonCoreNetworkStat$NetworkType, (CommonCoreNetworkStat$NetworkEffectiveType) obj);
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonAudioStat$TypeNetworkAudioStallItem commonAudioStat$TypeNetworkAudioStallItem = (CommonAudioStat$TypeNetworkAudioStallItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("owner_id", Long.valueOf(commonAudioStat$TypeNetworkAudioStallItem.f()));
            x9yVar.n("audio_id", Long.valueOf(commonAudioStat$TypeNetworkAudioStallItem.a()));
            x9yVar.n("fragment_id", Long.valueOf(commonAudioStat$TypeNetworkAudioStallItem.c()));
            x9yVar.n("buffering_time", commonAudioStat$TypeNetworkAudioStallItem.b());
            x9yVar.m(commonAudioStat$TypeNetworkAudioStallItem.g(), "is_vpn");
            x9yVar.o("http_request_host", commonAudioStat$TypeNetworkAudioStallItem.a);
            x9yVar.o(StatCustomFieldKey.NETWORK_TYPE, tru.a().toJson(commonAudioStat$TypeNetworkAudioStallItem.e()));
            x9yVar.o("network_effective_type", tru.a().toJson(commonAudioStat$TypeNetworkAudioStallItem.d()));
            return x9yVar;
        }
    }

    public CommonAudioStat$TypeNetworkAudioStallItem(long j, long j2, long j3, Integer num, Boolean bool, String str, CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType, CommonCoreNetworkStat$NetworkEffectiveType commonCoreNetworkStat$NetworkEffectiveType) {
        this.ownerId = j;
        this.audioId = j2;
        this.fragmentId = j3;
        this.bufferingTime = num;
        this.isVpn = bool;
        this.a = str;
        this.networkType = commonCoreNetworkStat$NetworkType;
        this.networkEffectiveType = commonCoreNetworkStat$NetworkEffectiveType;
        FilteredString filteredString = new FilteredString(lhg.b(64));
        this.filteredHttpRequestHost = filteredString;
        filteredString.a(str);
    }

    public final long a() {
        return this.audioId;
    }

    public final Integer b() {
        return this.bufferingTime;
    }

    public final long c() {
        return this.fragmentId;
    }

    public final CommonCoreNetworkStat$NetworkEffectiveType d() {
        return this.networkEffectiveType;
    }

    public final CommonCoreNetworkStat$NetworkType e() {
        return this.networkType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeNetworkAudioStallItem)) {
            return false;
        }
        CommonAudioStat$TypeNetworkAudioStallItem commonAudioStat$TypeNetworkAudioStallItem = (CommonAudioStat$TypeNetworkAudioStallItem) obj;
        return this.ownerId == commonAudioStat$TypeNetworkAudioStallItem.ownerId && this.audioId == commonAudioStat$TypeNetworkAudioStallItem.audioId && this.fragmentId == commonAudioStat$TypeNetworkAudioStallItem.fragmentId && epx.f(this.bufferingTime, commonAudioStat$TypeNetworkAudioStallItem.bufferingTime) && epx.f(this.isVpn, commonAudioStat$TypeNetworkAudioStallItem.isVpn) && epx.f(this.a, commonAudioStat$TypeNetworkAudioStallItem.a) && this.networkType == commonAudioStat$TypeNetworkAudioStallItem.networkType && this.networkEffectiveType == commonAudioStat$TypeNetworkAudioStallItem.networkEffectiveType;
    }

    public final long f() {
        return this.ownerId;
    }

    public final Boolean g() {
        return this.isVpn;
    }

    public final int hashCode() {
        int a = bh10.a(bh10.a(Long.hashCode(this.ownerId) * 31, 31, this.audioId), 31, this.fragmentId);
        Integer num = this.bufferingTime;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isVpn;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.a;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType = this.networkType;
        int hashCode4 = (hashCode3 + (commonCoreNetworkStat$NetworkType == null ? 0 : commonCoreNetworkStat$NetworkType.hashCode())) * 31;
        CommonCoreNetworkStat$NetworkEffectiveType commonCoreNetworkStat$NetworkEffectiveType = this.networkEffectiveType;
        return hashCode4 + (commonCoreNetworkStat$NetworkEffectiveType != null ? commonCoreNetworkStat$NetworkEffectiveType.hashCode() : 0);
    }

    public final String toString() {
        return "TypeNetworkAudioStallItem(ownerId=" + this.ownerId + ", audioId=" + this.audioId + ", fragmentId=" + this.fragmentId + ", bufferingTime=" + this.bufferingTime + ", isVpn=" + this.isVpn + ", httpRequestHost=" + this.a + ", networkType=" + this.networkType + ", networkEffectiveType=" + this.networkEffectiveType + ')';
    }

    public /* synthetic */ CommonAudioStat$TypeNetworkAudioStallItem(long j, long j2, long j3, Integer num, Boolean bool, String str, CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType, CommonCoreNetworkStat$NetworkEffectiveType commonCoreNetworkStat$NetworkEffectiveType, int i, zcl zclVar) {
        this(j, j2, j3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : commonCoreNetworkStat$NetworkType, (i & 128) != 0 ? null : commonCoreNetworkStat$NetworkEffectiveType);
    }
}
