package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketSwitchItemVariantItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("integration_type")
    private final String integrationType;

    @pmi0("item_idx")
    private final Integer itemIdx;

    @pmi0("variant_idx")
    private final Integer variantIdx;

    public CommonMarketStat$TypeMarketSwitchItemVariantItem() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketSwitchItemVariantItem)) {
            return false;
        }
        CommonMarketStat$TypeMarketSwitchItemVariantItem commonMarketStat$TypeMarketSwitchItemVariantItem = (CommonMarketStat$TypeMarketSwitchItemVariantItem) obj;
        return epx.f(this.variantIdx, commonMarketStat$TypeMarketSwitchItemVariantItem.variantIdx) && epx.f(this.itemIdx, commonMarketStat$TypeMarketSwitchItemVariantItem.itemIdx) && epx.f(this.integrationType, commonMarketStat$TypeMarketSwitchItemVariantItem.integrationType);
    }

    public final int hashCode() {
        Integer num = this.variantIdx;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.itemIdx;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.integrationType;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketSwitchItemVariantItem(variantIdx=");
        sb.append(this.variantIdx);
        sb.append(", itemIdx=");
        sb.append(this.itemIdx);
        sb.append(", integrationType=");
        return ho8.a(sb, this.integrationType, ')');
    }

    public CommonMarketStat$TypeMarketSwitchItemVariantItem(Integer num, Integer num2, String str) {
        this.variantIdx = num;
        this.itemIdx = num2;
        this.integrationType = str;
    }

    public /* synthetic */ CommonMarketStat$TypeMarketSwitchItemVariantItem(Integer num, Integer num2, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str);
    }
}
