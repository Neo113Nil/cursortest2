package com.vk.stat.scheme;

import xsna.pmi0;

/* compiled from: MobileOfficialAppsConStoriesStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsConStoriesStat$PhotoInfo {

    @pmi0("is_big_preview")
    private final boolean isBigPreview;

    @pmi0("is_cache")
    private final boolean isCache;

    public MobileOfficialAppsConStoriesStat$PhotoInfo(boolean z, boolean z2) {
        this.isBigPreview = z;
        this.isCache = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConStoriesStat$PhotoInfo)) {
            return false;
        }
        MobileOfficialAppsConStoriesStat$PhotoInfo mobileOfficialAppsConStoriesStat$PhotoInfo = (MobileOfficialAppsConStoriesStat$PhotoInfo) obj;
        return this.isBigPreview == mobileOfficialAppsConStoriesStat$PhotoInfo.isBigPreview && this.isCache == mobileOfficialAppsConStoriesStat$PhotoInfo.isCache;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isCache) + (Boolean.hashCode(this.isBigPreview) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoInfo(isBigPreview=");
        sb.append(this.isBigPreview);
        sb.append(", isCache=");
        return defpackage.q0.a(sb, this.isCache, ')');
    }
}
