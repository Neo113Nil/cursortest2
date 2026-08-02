package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeMiniAppStart implements SchemeStat$EventBenchmarkMain.b {

    @pmi0("app_id")
    private final Integer appId;

    @pmi0("app_init_time")
    private final String appInitTime;

    @pmi0("dns_lookup_time")
    private final String dnsLookupTime;

    @pmi0("is_odr")
    private final Boolean isOdr;

    @pmi0("load_time")
    private final String loadTime;

    @pmi0("render_time")
    private final String renderTime;

    @pmi0("start_time")
    private final String startTime;

    public SchemeStat$TypeMiniAppStart() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeMiniAppStart)) {
            return false;
        }
        SchemeStat$TypeMiniAppStart schemeStat$TypeMiniAppStart = (SchemeStat$TypeMiniAppStart) obj;
        return epx.f(this.appId, schemeStat$TypeMiniAppStart.appId) && epx.f(this.startTime, schemeStat$TypeMiniAppStart.startTime) && epx.f(this.dnsLookupTime, schemeStat$TypeMiniAppStart.dnsLookupTime) && epx.f(this.renderTime, schemeStat$TypeMiniAppStart.renderTime) && epx.f(this.appInitTime, schemeStat$TypeMiniAppStart.appInitTime) && epx.f(this.loadTime, schemeStat$TypeMiniAppStart.loadTime) && epx.f(this.isOdr, schemeStat$TypeMiniAppStart.isOdr);
    }

    public final int hashCode() {
        Integer num = this.appId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.startTime;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dnsLookupTime;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.renderTime;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appInitTime;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.loadTime;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isOdr;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMiniAppStart(appId=");
        sb.append(this.appId);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", dnsLookupTime=");
        sb.append(this.dnsLookupTime);
        sb.append(", renderTime=");
        sb.append(this.renderTime);
        sb.append(", appInitTime=");
        sb.append(this.appInitTime);
        sb.append(", loadTime=");
        sb.append(this.loadTime);
        sb.append(", isOdr=");
        return tn.a(sb, this.isOdr, ')');
    }

    public SchemeStat$TypeMiniAppStart(Integer num, String str, String str2, String str3, String str4, String str5, Boolean bool) {
        this.appId = num;
        this.startTime = str;
        this.dnsLookupTime = str2;
        this.renderTime = str3;
        this.appInitTime = str4;
        this.loadTime = str5;
        this.isOdr = bool;
    }

    public /* synthetic */ SchemeStat$TypeMiniAppStart(Integer num, String str, String str2, String str3, String str4, String str5, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : bool);
    }
}
