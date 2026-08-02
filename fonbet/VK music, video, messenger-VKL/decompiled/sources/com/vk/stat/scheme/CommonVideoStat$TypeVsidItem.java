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

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes11.dex */
public final class CommonVideoStat$TypeVsidItem {
    public final transient String a;

    @pmi0("vsid")
    private final FilteredString filteredVsid;

    /* compiled from: CommonVideoStat.kt */
    public static final class PersistenceSerializer implements uay<CommonVideoStat$TypeVsidItem>, a9y<CommonVideoStat$TypeVsidItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            return new CommonVideoStat$TypeVsidItem(fai.s((x9y) b9yVar, "vsid"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            x9y x9yVar = new x9y();
            x9yVar.o("vsid", ((CommonVideoStat$TypeVsidItem) obj).a);
            return x9yVar;
        }
    }

    public CommonVideoStat$TypeVsidItem(String str) {
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(14));
        this.filteredVsid = filteredString;
        filteredString.a(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonVideoStat$TypeVsidItem) && epx.f(this.a, ((CommonVideoStat$TypeVsidItem) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeVsidItem(vsid="), this.a, ')');
    }
}
