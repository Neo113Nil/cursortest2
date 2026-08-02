package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.vu5;
import xsna.x9y;
import xsna.z8y;

/* compiled from: CommonCatalogStat.kt */
/* loaded from: classes11.dex */
public final class CommonCatalogStat$TypeCatalogItemView implements SchemeStat$TypeView.b {
    public final transient String a;

    @pmi0("block_position")
    private final int blockPosition;

    @pmi0("block_id")
    private final FilteredString filteredBlockId;

    /* compiled from: CommonCatalogStat.kt */
    public static final class PersistenceSerializer implements uay<CommonCatalogStat$TypeCatalogItemView>, a9y<CommonCatalogStat$TypeCatalogItemView> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonCatalogStat$TypeCatalogItemView(fai.s(x9yVar, "block_id"), fai.p(x9yVar, "block_position"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonCatalogStat$TypeCatalogItemView commonCatalogStat$TypeCatalogItemView = (CommonCatalogStat$TypeCatalogItemView) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("block_id", commonCatalogStat$TypeCatalogItemView.a);
            x9yVar.n("block_position", Integer.valueOf(commonCatalogStat$TypeCatalogItemView.a()));
            return x9yVar;
        }
    }

    public CommonCatalogStat$TypeCatalogItemView(String str, int i) {
        this.a = str;
        this.blockPosition = i;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredBlockId = filteredString;
        filteredString.a(str);
    }

    public final int a() {
        return this.blockPosition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCatalogStat$TypeCatalogItemView)) {
            return false;
        }
        CommonCatalogStat$TypeCatalogItemView commonCatalogStat$TypeCatalogItemView = (CommonCatalogStat$TypeCatalogItemView) obj;
        return epx.f(this.a, commonCatalogStat$TypeCatalogItemView.a) && this.blockPosition == commonCatalogStat$TypeCatalogItemView.blockPosition;
    }

    public final int hashCode() {
        return Integer.hashCode(this.blockPosition) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeCatalogItemView(blockId=");
        sb.append(this.a);
        sb.append(", blockPosition=");
        return vu5.b(sb, this.blockPosition, ')');
    }
}
