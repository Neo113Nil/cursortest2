package com.vk.stat.scheme;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketItemReviewClick;
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

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes11.dex */
public final class CommonMarketStat$TypeItemReviewSendReviewItem implements CommonMarketStat$TypeMarketItemReviewClick.b {
    public final transient String a;
    public final transient String b;
    public final transient String c;

    @pmi0("review_text_cons")
    private final FilteredString filteredReviewTextCons;

    @pmi0("review_text_general")
    private final FilteredString filteredReviewTextGeneral;

    @pmi0("review_text_pros")
    private final FilteredString filteredReviewTextPros;

    @pmi0("review_rate")
    private final Integer reviewRate;

    @pmi0("review_text_cons_length")
    private final Integer reviewTextConsLength;

    @pmi0("review_text_general_length")
    private final Integer reviewTextGeneralLength;

    @pmi0("review_text_pros_length")
    private final Integer reviewTextProsLength;

    /* compiled from: CommonMarketStat.kt */
    public static final class PersistenceSerializer implements uay<CommonMarketStat$TypeItemReviewSendReviewItem>, a9y<CommonMarketStat$TypeItemReviewSendReviewItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonMarketStat$TypeItemReviewSendReviewItem(fai.A(x9yVar, "review_rate"), fai.C(x9yVar, "review_text_pros"), fai.A(x9yVar, "review_text_pros_length"), fai.C(x9yVar, "review_text_cons"), fai.A(x9yVar, "review_text_cons_length"), fai.C(x9yVar, "review_text_general"), fai.A(x9yVar, "review_text_general_length"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonMarketStat$TypeItemReviewSendReviewItem commonMarketStat$TypeItemReviewSendReviewItem = (CommonMarketStat$TypeItemReviewSendReviewItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("review_rate", commonMarketStat$TypeItemReviewSendReviewItem.a());
            x9yVar.o("review_text_pros", commonMarketStat$TypeItemReviewSendReviewItem.a);
            x9yVar.n("review_text_pros_length", commonMarketStat$TypeItemReviewSendReviewItem.d());
            x9yVar.o("review_text_cons", commonMarketStat$TypeItemReviewSendReviewItem.b);
            x9yVar.n("review_text_cons_length", commonMarketStat$TypeItemReviewSendReviewItem.b());
            x9yVar.o("review_text_general", commonMarketStat$TypeItemReviewSendReviewItem.c);
            x9yVar.n("review_text_general_length", commonMarketStat$TypeItemReviewSendReviewItem.c());
            return x9yVar;
        }
    }

    public CommonMarketStat$TypeItemReviewSendReviewItem() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final Integer a() {
        return this.reviewRate;
    }

    public final Integer b() {
        return this.reviewTextConsLength;
    }

    public final Integer c() {
        return this.reviewTextGeneralLength;
    }

    public final Integer d() {
        return this.reviewTextProsLength;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeItemReviewSendReviewItem)) {
            return false;
        }
        CommonMarketStat$TypeItemReviewSendReviewItem commonMarketStat$TypeItemReviewSendReviewItem = (CommonMarketStat$TypeItemReviewSendReviewItem) obj;
        return epx.f(this.reviewRate, commonMarketStat$TypeItemReviewSendReviewItem.reviewRate) && epx.f(this.a, commonMarketStat$TypeItemReviewSendReviewItem.a) && epx.f(this.reviewTextProsLength, commonMarketStat$TypeItemReviewSendReviewItem.reviewTextProsLength) && epx.f(this.b, commonMarketStat$TypeItemReviewSendReviewItem.b) && epx.f(this.reviewTextConsLength, commonMarketStat$TypeItemReviewSendReviewItem.reviewTextConsLength) && epx.f(this.c, commonMarketStat$TypeItemReviewSendReviewItem.c) && epx.f(this.reviewTextGeneralLength, commonMarketStat$TypeItemReviewSendReviewItem.reviewTextGeneralLength);
    }

    public final int hashCode() {
        Integer num = this.reviewRate;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.reviewTextProsLength;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.b;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.reviewTextConsLength;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.c;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.reviewTextGeneralLength;
        return hashCode6 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeItemReviewSendReviewItem(reviewRate=");
        sb.append(this.reviewRate);
        sb.append(", reviewTextPros=");
        sb.append(this.a);
        sb.append(", reviewTextProsLength=");
        sb.append(this.reviewTextProsLength);
        sb.append(", reviewTextCons=");
        sb.append(this.b);
        sb.append(", reviewTextConsLength=");
        sb.append(this.reviewTextConsLength);
        sb.append(", reviewTextGeneral=");
        sb.append(this.c);
        sb.append(", reviewTextGeneralLength=");
        return uqi.b(sb, this.reviewTextGeneralLength, ')');
    }

    public CommonMarketStat$TypeItemReviewSendReviewItem(Integer num, String str, Integer num2, String str2, Integer num3, String str3, Integer num4) {
        this.reviewRate = num;
        this.a = str;
        this.reviewTextProsLength = num2;
        this.b = str2;
        this.reviewTextConsLength = num3;
        this.c = str3;
        this.reviewTextGeneralLength = num4;
        FilteredString filteredString = new FilteredString(lhg.b(IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW));
        this.filteredReviewTextPros = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW));
        this.filteredReviewTextCons = filteredString2;
        FilteredString filteredString3 = new FilteredString(lhg.b(IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW));
        this.filteredReviewTextGeneral = filteredString3;
        filteredString.a(str);
        filteredString2.a(str2);
        filteredString3.a(str3);
    }

    public /* synthetic */ CommonMarketStat$TypeItemReviewSendReviewItem(Integer num, String str, Integer num2, String str2, Integer num3, String str3, Integer num4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num4);
    }
}
