package com.vk.stat.scheme;

import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: CommonEcommStat.kt */
/* loaded from: classes5.dex */
public final class CommonEcommStat$PremiumVerificationRequirementsShowItem {

    @pmi0("int_values")
    private final List<Integer> intValues;

    @pmi0("str_values")
    private final List<String> strValues;

    public CommonEcommStat$PremiumVerificationRequirementsShowItem(List<String> list, List<Integer> list2) {
        this.strValues = list;
        this.intValues = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonEcommStat$PremiumVerificationRequirementsShowItem)) {
            return false;
        }
        CommonEcommStat$PremiumVerificationRequirementsShowItem commonEcommStat$PremiumVerificationRequirementsShowItem = (CommonEcommStat$PremiumVerificationRequirementsShowItem) obj;
        return epx.f(this.strValues, commonEcommStat$PremiumVerificationRequirementsShowItem.strValues) && epx.f(this.intValues, commonEcommStat$PremiumVerificationRequirementsShowItem.intValues);
    }

    public final int hashCode() {
        return this.intValues.hashCode() + (this.strValues.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumVerificationRequirementsShowItem(strValues=");
        sb.append(this.strValues);
        sb.append(", intValues=");
        return ms9.a(')', sb, this.intValues);
    }
}
