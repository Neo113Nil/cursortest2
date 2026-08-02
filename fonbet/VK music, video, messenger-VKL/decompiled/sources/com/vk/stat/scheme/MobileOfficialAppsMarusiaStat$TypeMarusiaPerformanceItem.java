package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarusiaStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem implements SchemeStat$EventBenchmarkMain.b {

    @pmi0("entry_point")
    private final String entryPoint;

    @pmi0("key")
    private final String key;

    @pmi0("value")
    private final Long value;

    @pmi0("value_str")
    private final String valueStr;

    public MobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem(String str, Long l, String str2, String str3) {
        this.key = str;
        this.value = l;
        this.valueStr = str2;
        this.entryPoint = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem)) {
            return false;
        }
        MobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem mobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem = (MobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem) obj;
        return epx.f(this.key, mobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem.key) && epx.f(this.value, mobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem.value) && epx.f(this.valueStr, mobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem.valueStr) && epx.f(this.entryPoint, mobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem.entryPoint);
    }

    public final int hashCode() {
        int hashCode = this.key.hashCode() * 31;
        Long l = this.value;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.valueStr;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.entryPoint;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarusiaPerformanceItem(key=");
        sb.append(this.key);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", valueStr=");
        sb.append(this.valueStr);
        sb.append(", entryPoint=");
        return ho8.a(sb, this.entryPoint, ')');
    }

    public /* synthetic */ MobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem(String str, Long l, String str2, String str3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
