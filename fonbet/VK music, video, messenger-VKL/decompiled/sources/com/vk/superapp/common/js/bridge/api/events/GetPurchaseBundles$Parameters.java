package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GetPurchaseBundles.kt */
/* loaded from: classes6.dex */
public final class GetPurchaseBundles$Parameters implements ad6 {

    @pmi0("app_id")
    private final Integer appId;

    @pmi0("item_ids")
    private final List<String> itemIds;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("subs_ids")
    private final List<String> subsIds;

    public GetPurchaseBundles$Parameters(Integer num, List<String> list, List<String> list2, String str) {
        this.appId = num;
        this.itemIds = list;
        this.subsIds = list2;
        this.requestId = str;
    }

    public static final GetPurchaseBundles$Parameters a(GetPurchaseBundles$Parameters getPurchaseBundles$Parameters) {
        return getPurchaseBundles$Parameters.requestId == null ? new GetPurchaseBundles$Parameters(getPurchaseBundles$Parameters.appId, getPurchaseBundles$Parameters.itemIds, getPurchaseBundles$Parameters.subsIds, "default_request_id") : getPurchaseBundles$Parameters;
    }

    public static final void b(GetPurchaseBundles$Parameters getPurchaseBundles$Parameters) {
        Integer num = getPurchaseBundles$Parameters.appId;
        if (num != null && num.intValue() < 1) {
            throw new IllegalArgumentException("Value appId cannot be less than 1");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPurchaseBundles$Parameters)) {
            return false;
        }
        GetPurchaseBundles$Parameters getPurchaseBundles$Parameters = (GetPurchaseBundles$Parameters) obj;
        return epx.f(this.appId, getPurchaseBundles$Parameters.appId) && epx.f(this.itemIds, getPurchaseBundles$Parameters.itemIds) && epx.f(this.subsIds, getPurchaseBundles$Parameters.subsIds) && epx.f(this.requestId, getPurchaseBundles$Parameters.requestId);
    }

    public final int hashCode() {
        Integer num = this.appId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.itemIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.subsIds;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.requestId;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(appId=");
        sb.append(this.appId);
        sb.append(", itemIds=");
        sb.append(this.itemIds);
        sb.append(", subsIds=");
        sb.append(this.subsIds);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    public /* synthetic */ GetPurchaseBundles$Parameters(Integer num, List list, List list2, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, str);
    }
}
