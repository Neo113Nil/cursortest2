package com.vk.stat.scheme;

import com.ironsource.mediationsdk.logger.IronSourceError;
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

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes11.dex */
public final class CommonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem {
    public final transient String a;

    @pmi0("review_text")
    private final FilteredString filteredReviewText;

    @pmi0("qr_source")
    private final String qrSource;

    @pmi0("review_rate")
    private final Integer reviewRate;

    /* compiled from: CommonCommunitiesStat.kt */
    public static final class PersistenceSerializer implements uay<CommonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem>, a9y<CommonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem(fai.C(x9yVar, "review_text"), fai.A(x9yVar, "review_rate"), fai.C(x9yVar, "qr_source"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem commonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem = (CommonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("review_text", commonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem.a);
            x9yVar.n("review_rate", commonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem.b());
            x9yVar.o("qr_source", commonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem.a());
            return x9yVar;
        }
    }

    public CommonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem() {
        this(null, null, null, 7, null);
    }

    public final String a() {
        return this.qrSource;
    }

    public final Integer b() {
        return this.reviewRate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem)) {
            return false;
        }
        CommonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem commonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem = (CommonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem) obj;
        return epx.f(this.a, commonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem.a) && epx.f(this.reviewRate, commonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem.reviewRate) && epx.f(this.qrSource, commonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem.qrSource);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.reviewRate;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.qrSource;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeCommunityReviewShowWindowReviewItem(reviewText=");
        sb.append(this.a);
        sb.append(", reviewRate=");
        sb.append(this.reviewRate);
        sb.append(", qrSource=");
        return ho8.a(sb, this.qrSource, ')');
    }

    public CommonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem(String str, Integer num, String str2) {
        this.a = str;
        this.reviewRate = num;
        this.qrSource = str2;
        FilteredString filteredString = new FilteredString(lhg.b(IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW));
        this.filteredReviewText = filteredString;
        filteredString.a(str);
    }

    public /* synthetic */ CommonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem(String str, Integer num, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2);
    }
}
