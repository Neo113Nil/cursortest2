package com.vk.stat.scheme;

import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.uqi;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$FeedResponseContext {
    public final transient String a;

    @pmi0("next_from")
    private final FilteredString filteredNextFrom;

    @pmi0("items_count")
    private final Integer itemsCount;

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$FeedResponseContext>, a9y<MobileOfficialAppsFeedStat$FeedResponseContext> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsFeedStat$FeedResponseContext(fai.C(x9yVar, "next_from"), fai.A(x9yVar, "items_count"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$FeedResponseContext mobileOfficialAppsFeedStat$FeedResponseContext = (MobileOfficialAppsFeedStat$FeedResponseContext) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("next_from", mobileOfficialAppsFeedStat$FeedResponseContext.a);
            x9yVar.n("items_count", mobileOfficialAppsFeedStat$FeedResponseContext.a());
            return x9yVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsFeedStat$FeedResponseContext() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Integer a() {
        return this.itemsCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$FeedResponseContext)) {
            return false;
        }
        MobileOfficialAppsFeedStat$FeedResponseContext mobileOfficialAppsFeedStat$FeedResponseContext = (MobileOfficialAppsFeedStat$FeedResponseContext) obj;
        return epx.f(this.a, mobileOfficialAppsFeedStat$FeedResponseContext.a) && epx.f(this.itemsCount, mobileOfficialAppsFeedStat$FeedResponseContext.itemsCount);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.itemsCount;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedResponseContext(nextFrom=");
        sb.append(this.a);
        sb.append(", itemsCount=");
        return uqi.b(sb, this.itemsCount, ')');
    }

    public MobileOfficialAppsFeedStat$FeedResponseContext(String str, Integer num) {
        this.a = str;
        this.itemsCount = num;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredNextFrom = filteredString;
        filteredString.a(str);
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$FeedResponseContext(String str, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}
