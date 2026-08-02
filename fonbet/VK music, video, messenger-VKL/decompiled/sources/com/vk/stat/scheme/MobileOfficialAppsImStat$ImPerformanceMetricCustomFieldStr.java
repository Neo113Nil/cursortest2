package com.vk.stat.scheme;

import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr {
    public final transient String a;

    @pmi0("value")
    private final FilteredString filteredValue;

    @pmi0("index")
    private final int index;

    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr>, a9y<MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr(fai.p(x9yVar, "index"), fai.s(x9yVar, "value"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr mobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr = (MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("index", Integer.valueOf(mobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr.a()));
            x9yVar.o("value", mobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr.a);
            return x9yVar;
        }
    }

    public MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr(int i, String str) {
        this.index = i;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredValue = filteredString;
        filteredString.a(str);
    }

    public final int a() {
        return this.index;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr)) {
            return false;
        }
        MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr mobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr = (MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr) obj;
        return this.index == mobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr.index && epx.f(this.a, mobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(this.index) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImPerformanceMetricCustomFieldStr(index=");
        sb.append(this.index);
        sb.append(", value=");
        return ho8.a(sb, this.a, ')');
    }
}
