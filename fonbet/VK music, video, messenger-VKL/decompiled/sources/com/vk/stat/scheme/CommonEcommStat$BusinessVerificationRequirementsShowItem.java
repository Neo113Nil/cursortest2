package com.vk.stat.scheme;

import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: CommonEcommStat.kt */
/* loaded from: classes5.dex */
public final class CommonEcommStat$BusinessVerificationRequirementsShowItem {

    @pmi0("int_values")
    private final List<Integer> intValues;

    @pmi0("str_values")
    private final List<String> strValues;

    public CommonEcommStat$BusinessVerificationRequirementsShowItem(List<String> list, List<Integer> list2) {
        this.strValues = list;
        this.intValues = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonEcommStat$BusinessVerificationRequirementsShowItem)) {
            return false;
        }
        CommonEcommStat$BusinessVerificationRequirementsShowItem commonEcommStat$BusinessVerificationRequirementsShowItem = (CommonEcommStat$BusinessVerificationRequirementsShowItem) obj;
        return epx.f(this.strValues, commonEcommStat$BusinessVerificationRequirementsShowItem.strValues) && epx.f(this.intValues, commonEcommStat$BusinessVerificationRequirementsShowItem.intValues);
    }

    public final int hashCode() {
        return this.intValues.hashCode() + (this.strValues.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BusinessVerificationRequirementsShowItem(strValues=");
        sb.append(this.strValues);
        sb.append(", intValues=");
        return ms9.a(')', sb, this.intValues);
    }
}
