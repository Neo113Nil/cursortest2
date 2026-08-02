package com.vk.stat.scheme;

import xsna.pmi0;
import xsna.vu5;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldInt {

    @pmi0("index")
    private final int index;

    @pmi0("value")
    private final int value;

    public MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldInt(int i, int i2) {
        this.index = i;
        this.value = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldInt)) {
            return false;
        }
        MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldInt mobileOfficialAppsImStat$ImPerformanceMetricCustomFieldInt = (MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldInt) obj;
        return this.index == mobileOfficialAppsImStat$ImPerformanceMetricCustomFieldInt.index && this.value == mobileOfficialAppsImStat$ImPerformanceMetricCustomFieldInt.value;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value) + (Integer.hashCode(this.index) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImPerformanceMetricCustomFieldInt(index=");
        sb.append(this.index);
        sb.append(", value=");
        return vu5.b(sb, this.value, ')');
    }
}
