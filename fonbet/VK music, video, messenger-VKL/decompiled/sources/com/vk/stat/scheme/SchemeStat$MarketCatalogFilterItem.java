package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$MarketCatalogFilterItem {

    @pmi0("int_value")
    private final Integer intValue;

    @pmi0("key")
    private final String key;

    @pmi0("str_value")
    private final String strValue;

    public SchemeStat$MarketCatalogFilterItem(String str, String str2, Integer num) {
        this.key = str;
        this.strValue = str2;
        this.intValue = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$MarketCatalogFilterItem)) {
            return false;
        }
        SchemeStat$MarketCatalogFilterItem schemeStat$MarketCatalogFilterItem = (SchemeStat$MarketCatalogFilterItem) obj;
        return epx.f(this.key, schemeStat$MarketCatalogFilterItem.key) && epx.f(this.strValue, schemeStat$MarketCatalogFilterItem.strValue) && epx.f(this.intValue, schemeStat$MarketCatalogFilterItem.intValue);
    }

    public final int hashCode() {
        int hashCode = this.key.hashCode() * 31;
        String str = this.strValue;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.intValue;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCatalogFilterItem(key=");
        sb.append(this.key);
        sb.append(", strValue=");
        sb.append(this.strValue);
        sb.append(", intValue=");
        return uqi.b(sb, this.intValue, ')');
    }

    public /* synthetic */ SchemeStat$MarketCatalogFilterItem(String str, String str2, Integer num, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }
}
