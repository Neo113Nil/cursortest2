package com.vk.stat.scheme;

import com.vk.stat.scheme.CommonMarketStat$TypeRatingClick;
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
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes11.dex */
public final class CommonMarketStat$TypeRatingSendReviewItem implements CommonMarketStat$TypeRatingClick.b {
    public final transient String a;

    @pmi0("review_text")
    private final FilteredString filteredReviewText;

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("rate_count")
    private final Integer rateCount;

    @pmi0("rate_value")
    private final Float rateValue;

    @pmi0("review_rate")
    private final Integer reviewRate;

    /* compiled from: CommonMarketStat.kt */
    public static final class PersistenceSerializer implements uay<CommonMarketStat$TypeRatingSendReviewItem>, a9y<CommonMarketStat$TypeRatingSendReviewItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonMarketStat$TypeRatingSendReviewItem(fai.q(x9yVar, "owner_id"), fai.z(x9yVar, "rate_value"), fai.A(x9yVar, "rate_count"), fai.A(x9yVar, "review_rate"), fai.C(x9yVar, "review_text"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonMarketStat$TypeRatingSendReviewItem commonMarketStat$TypeRatingSendReviewItem = (CommonMarketStat$TypeRatingSendReviewItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("owner_id", Long.valueOf(commonMarketStat$TypeRatingSendReviewItem.a()));
            x9yVar.n("rate_value", commonMarketStat$TypeRatingSendReviewItem.c());
            x9yVar.n("rate_count", commonMarketStat$TypeRatingSendReviewItem.b());
            x9yVar.n("review_rate", commonMarketStat$TypeRatingSendReviewItem.d());
            x9yVar.o("review_text", commonMarketStat$TypeRatingSendReviewItem.a);
            return x9yVar;
        }
    }

    public CommonMarketStat$TypeRatingSendReviewItem(long j, Float f, Integer num, Integer num2, String str) {
        this.ownerId = j;
        this.rateValue = f;
        this.rateCount = num;
        this.reviewRate = num2;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(1050));
        this.filteredReviewText = filteredString;
        filteredString.a(str);
    }

    public final long a() {
        return this.ownerId;
    }

    public final Integer b() {
        return this.rateCount;
    }

    public final Float c() {
        return this.rateValue;
    }

    public final Integer d() {
        return this.reviewRate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeRatingSendReviewItem)) {
            return false;
        }
        CommonMarketStat$TypeRatingSendReviewItem commonMarketStat$TypeRatingSendReviewItem = (CommonMarketStat$TypeRatingSendReviewItem) obj;
        return this.ownerId == commonMarketStat$TypeRatingSendReviewItem.ownerId && epx.f(this.rateValue, commonMarketStat$TypeRatingSendReviewItem.rateValue) && epx.f(this.rateCount, commonMarketStat$TypeRatingSendReviewItem.rateCount) && epx.f(this.reviewRate, commonMarketStat$TypeRatingSendReviewItem.reviewRate) && epx.f(this.a, commonMarketStat$TypeRatingSendReviewItem.a);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.ownerId) * 31;
        Float f = this.rateValue;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.rateCount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.reviewRate;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.a;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeRatingSendReviewItem(ownerId=");
        sb.append(this.ownerId);
        sb.append(", rateValue=");
        sb.append(this.rateValue);
        sb.append(", rateCount=");
        sb.append(this.rateCount);
        sb.append(", reviewRate=");
        sb.append(this.reviewRate);
        sb.append(", reviewText=");
        return ho8.a(sb, this.a, ')');
    }

    public /* synthetic */ CommonMarketStat$TypeRatingSendReviewItem(long j, Float f, Integer num, Integer num2, String str, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str);
    }
}
