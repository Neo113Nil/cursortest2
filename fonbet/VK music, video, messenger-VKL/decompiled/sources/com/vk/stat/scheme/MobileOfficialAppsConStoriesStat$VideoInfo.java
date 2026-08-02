package com.vk.stat.scheme;

import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsConStoriesStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsConStoriesStat$VideoInfo {

    @pmi0("bytes_loaded")
    private final Long bytesLoaded;

    @pmi0("is_cache")
    private final Boolean isCache;

    @pmi0("is_local")
    private final Boolean isLocal;

    @pmi0("load_duration_ms")
    private final Long loadDurationMs;

    public MobileOfficialAppsConStoriesStat$VideoInfo() {
        this(null, null, null, null, 15, null);
    }

    public static MobileOfficialAppsConStoriesStat$VideoInfo a(MobileOfficialAppsConStoriesStat$VideoInfo mobileOfficialAppsConStoriesStat$VideoInfo, Boolean bool, Boolean bool2, Long l, Long l2, int i) {
        if ((i & 1) != 0) {
            bool = mobileOfficialAppsConStoriesStat$VideoInfo.isCache;
        }
        if ((i & 2) != 0) {
            bool2 = mobileOfficialAppsConStoriesStat$VideoInfo.isLocal;
        }
        if ((i & 4) != 0) {
            l = mobileOfficialAppsConStoriesStat$VideoInfo.bytesLoaded;
        }
        if ((i & 8) != 0) {
            l2 = mobileOfficialAppsConStoriesStat$VideoInfo.loadDurationMs;
        }
        mobileOfficialAppsConStoriesStat$VideoInfo.getClass();
        return new MobileOfficialAppsConStoriesStat$VideoInfo(bool, bool2, l, l2);
    }

    public final Long b() {
        return this.bytesLoaded;
    }

    public final Long c() {
        return this.loadDurationMs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConStoriesStat$VideoInfo)) {
            return false;
        }
        MobileOfficialAppsConStoriesStat$VideoInfo mobileOfficialAppsConStoriesStat$VideoInfo = (MobileOfficialAppsConStoriesStat$VideoInfo) obj;
        return epx.f(this.isCache, mobileOfficialAppsConStoriesStat$VideoInfo.isCache) && epx.f(this.isLocal, mobileOfficialAppsConStoriesStat$VideoInfo.isLocal) && epx.f(this.bytesLoaded, mobileOfficialAppsConStoriesStat$VideoInfo.bytesLoaded) && epx.f(this.loadDurationMs, mobileOfficialAppsConStoriesStat$VideoInfo.loadDurationMs);
    }

    public final int hashCode() {
        Boolean bool = this.isCache;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isLocal;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.bytesLoaded;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.loadDurationMs;
        return hashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoInfo(isCache=");
        sb.append(this.isCache);
        sb.append(", isLocal=");
        sb.append(this.isLocal);
        sb.append(", bytesLoaded=");
        sb.append(this.bytesLoaded);
        sb.append(", loadDurationMs=");
        return iq.b(sb, this.loadDurationMs, ')');
    }

    public MobileOfficialAppsConStoriesStat$VideoInfo(Boolean bool, Boolean bool2, Long l, Long l2) {
        this.isCache = bool;
        this.isLocal = bool2;
        this.bytesLoaded = l;
        this.loadDurationMs = l2;
    }

    public /* synthetic */ MobileOfficialAppsConStoriesStat$VideoInfo(Boolean bool, Boolean bool2, Long l, Long l2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2);
    }
}
