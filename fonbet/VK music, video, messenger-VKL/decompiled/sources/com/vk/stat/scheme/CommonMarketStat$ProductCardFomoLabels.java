package com.vk.stat.scheme;

import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$ProductCardFomoLabels {

    @pmi0("int_values")
    private final List<Integer> intValues;

    @pmi0("subtype_names")
    private final List<String> subtypeNames;

    public CommonMarketStat$ProductCardFomoLabels(List<String> list, List<Integer> list2) {
        this.subtypeNames = list;
        this.intValues = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$ProductCardFomoLabels)) {
            return false;
        }
        CommonMarketStat$ProductCardFomoLabels commonMarketStat$ProductCardFomoLabels = (CommonMarketStat$ProductCardFomoLabels) obj;
        return epx.f(this.subtypeNames, commonMarketStat$ProductCardFomoLabels.subtypeNames) && epx.f(this.intValues, commonMarketStat$ProductCardFomoLabels.intValues);
    }

    public final int hashCode() {
        return this.intValues.hashCode() + (this.subtypeNames.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductCardFomoLabels(subtypeNames=");
        sb.append(this.subtypeNames);
        sb.append(", intValues=");
        return ms9.a(')', sb, this.intValues);
    }
}
