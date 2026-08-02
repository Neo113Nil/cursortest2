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

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes11.dex */
public final class CommonMarketStat$MarketOrderColorTag {
    public final transient String a;

    @pmi0("name")
    private final FilteredString filteredName;

    @pmi0("id")
    private final int id;

    /* compiled from: CommonMarketStat.kt */
    public static final class PersistenceSerializer implements uay<CommonMarketStat$MarketOrderColorTag>, a9y<CommonMarketStat$MarketOrderColorTag> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonMarketStat$MarketOrderColorTag(fai.p(x9yVar, "id"), fai.s(x9yVar, "name"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonMarketStat$MarketOrderColorTag commonMarketStat$MarketOrderColorTag = (CommonMarketStat$MarketOrderColorTag) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("id", Integer.valueOf(commonMarketStat$MarketOrderColorTag.a()));
            x9yVar.o("name", commonMarketStat$MarketOrderColorTag.a);
            return x9yVar;
        }
    }

    public CommonMarketStat$MarketOrderColorTag(int i, String str) {
        this.id = i;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(128));
        this.filteredName = filteredString;
        filteredString.a(str);
    }

    public final int a() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$MarketOrderColorTag)) {
            return false;
        }
        CommonMarketStat$MarketOrderColorTag commonMarketStat$MarketOrderColorTag = (CommonMarketStat$MarketOrderColorTag) obj;
        return this.id == commonMarketStat$MarketOrderColorTag.id && epx.f(this.a, commonMarketStat$MarketOrderColorTag.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketOrderColorTag(id=");
        sb.append(this.id);
        sb.append(", name=");
        return ho8.a(sb, this.a, ')');
    }
}
