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
import xsna.zcl;

/* compiled from: CommonEcommStat.kt */
/* loaded from: classes11.dex */
public final class CommonEcommStat$TypeAliexpressProductHideItem {
    public final transient String a;
    public final transient String b;

    @pmi0("ref_source")
    private final FilteredString filteredRefSource;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("item_idx")
    private final Integer itemIdx;

    @pmi0("product_id")
    private final Long productId;

    /* compiled from: CommonEcommStat.kt */
    public static final class PersistenceSerializer implements uay<CommonEcommStat$TypeAliexpressProductHideItem>, a9y<CommonEcommStat$TypeAliexpressProductHideItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonEcommStat$TypeAliexpressProductHideItem(fai.B(x9yVar, "product_id"), fai.C(x9yVar, "track_code"), fai.A(x9yVar, "item_idx"), fai.C(x9yVar, "ref_source"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonEcommStat$TypeAliexpressProductHideItem commonEcommStat$TypeAliexpressProductHideItem = (CommonEcommStat$TypeAliexpressProductHideItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("product_id", commonEcommStat$TypeAliexpressProductHideItem.b());
            x9yVar.o("track_code", commonEcommStat$TypeAliexpressProductHideItem.a);
            x9yVar.n("item_idx", commonEcommStat$TypeAliexpressProductHideItem.a());
            x9yVar.o("ref_source", commonEcommStat$TypeAliexpressProductHideItem.b);
            return x9yVar;
        }
    }

    public CommonEcommStat$TypeAliexpressProductHideItem() {
        this(null, null, null, null, 15, null);
    }

    public final Integer a() {
        return this.itemIdx;
    }

    public final Long b() {
        return this.productId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonEcommStat$TypeAliexpressProductHideItem)) {
            return false;
        }
        CommonEcommStat$TypeAliexpressProductHideItem commonEcommStat$TypeAliexpressProductHideItem = (CommonEcommStat$TypeAliexpressProductHideItem) obj;
        return epx.f(this.productId, commonEcommStat$TypeAliexpressProductHideItem.productId) && epx.f(this.a, commonEcommStat$TypeAliexpressProductHideItem.a) && epx.f(this.itemIdx, commonEcommStat$TypeAliexpressProductHideItem.itemIdx) && epx.f(this.b, commonEcommStat$TypeAliexpressProductHideItem.b);
    }

    public final int hashCode() {
        Long l = this.productId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.itemIdx;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.b;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeAliexpressProductHideItem(productId=");
        sb.append(this.productId);
        sb.append(", trackCode=");
        sb.append(this.a);
        sb.append(", itemIdx=");
        sb.append(this.itemIdx);
        sb.append(", refSource=");
        return ho8.a(sb, this.b, ')');
    }

    public CommonEcommStat$TypeAliexpressProductHideItem(Long l, String str, Integer num, String str2) {
        this.productId = l;
        this.a = str;
        this.itemIdx = num;
        this.b = str2;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredTrackCode = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(256));
        this.filteredRefSource = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public /* synthetic */ CommonEcommStat$TypeAliexpressProductHideItem(Long l, String str, Integer num, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2);
    }
}
