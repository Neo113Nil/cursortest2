package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MobileOfficialAppsConStoriesStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsConStoriesStat$BatchUpload {

    @pmi0("count")
    private final int count;

    @pmi0("throughput")
    private final Integer throughput;

    public MobileOfficialAppsConStoriesStat$BatchUpload(int i, Integer num) {
        this.count = i;
        this.throughput = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConStoriesStat$BatchUpload)) {
            return false;
        }
        MobileOfficialAppsConStoriesStat$BatchUpload mobileOfficialAppsConStoriesStat$BatchUpload = (MobileOfficialAppsConStoriesStat$BatchUpload) obj;
        return this.count == mobileOfficialAppsConStoriesStat$BatchUpload.count && epx.f(this.throughput, mobileOfficialAppsConStoriesStat$BatchUpload.throughput);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.count) * 31;
        Integer num = this.throughput;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatchUpload(count=");
        sb.append(this.count);
        sb.append(", throughput=");
        return uqi.b(sb, this.throughput, ')');
    }

    public /* synthetic */ MobileOfficialAppsConStoriesStat$BatchUpload(int i, Integer num, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num);
    }
}
