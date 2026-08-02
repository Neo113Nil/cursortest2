package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketViewCheckout implements MobileOfficialAppsMarketStat$TypeMarketView.b {

    @pmi0("autofill_info")
    private final List<CommonMarketStat$TypeAutofillInfo> autofillInfo;

    @pmi0("owner_id")
    private final Long ownerId;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonMarketStat$TypeMarketViewCheckout() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketViewCheckout)) {
            return false;
        }
        CommonMarketStat$TypeMarketViewCheckout commonMarketStat$TypeMarketViewCheckout = (CommonMarketStat$TypeMarketViewCheckout) obj;
        return epx.f(this.ownerId, commonMarketStat$TypeMarketViewCheckout.ownerId) && epx.f(this.autofillInfo, commonMarketStat$TypeMarketViewCheckout.autofillInfo);
    }

    public final int hashCode() {
        Long l = this.ownerId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        List<CommonMarketStat$TypeAutofillInfo> list = this.autofillInfo;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketViewCheckout(ownerId=");
        sb.append(this.ownerId);
        sb.append(", autofillInfo=");
        return ms9.a(')', sb, this.autofillInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommonMarketStat$TypeMarketViewCheckout(Long l, List<? extends CommonMarketStat$TypeAutofillInfo> list) {
        this.ownerId = l;
        this.autofillInfo = list;
    }

    public /* synthetic */ CommonMarketStat$TypeMarketViewCheckout(Long l, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : list);
    }
}
