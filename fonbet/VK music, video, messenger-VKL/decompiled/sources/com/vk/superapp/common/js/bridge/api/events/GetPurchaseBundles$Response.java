package com.vk.superapp.common.js.bridge.api.events;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GetPurchaseBundles.kt */
/* loaded from: classes6.dex */
public final class GetPurchaseBundles$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public GetPurchaseBundles$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetPurchaseBundles$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPurchaseBundles$Response)) {
            return false;
        }
        GetPurchaseBundles$Response getPurchaseBundles$Response = (GetPurchaseBundles$Response) obj;
        return epx.f(this.type, getPurchaseBundles$Response.type) && epx.f(this.data, getPurchaseBundles$Response.data) && epx.f(this.requestId, getPurchaseBundles$Response.requestId);
    }

    public final int hashCode() {
        int hashCode = (this.data.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.requestId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(type=");
        sb.append(this.type);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    /* compiled from: GetPurchaseBundles.kt */
    public static final class Data {

        @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
        private final String currency;

        @pmi0("items")
        private final List<GetPurchaseBundles$StoreItemInfo> items;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("subs")
        private final List<GetPurchaseBundles$StoreSubInfo> subs;

        public Data(String str, List<GetPurchaseBundles$StoreItemInfo> list, List<GetPurchaseBundles$StoreSubInfo> list2, String str2) {
            this.currency = str;
            this.items = list;
            this.subs = list2;
            this.requestId = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return epx.f(this.currency, data.currency) && epx.f(this.items, data.items) && epx.f(this.subs, data.subs) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = this.currency.hashCode() * 31;
            List<GetPurchaseBundles$StoreItemInfo> list = this.items;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<GetPurchaseBundles$StoreSubInfo> list2 = this.subs;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str = this.requestId;
            return hashCode3 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(currency=");
            sb.append(this.currency);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", subs=");
            sb.append(this.subs);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(String str, List list, List list2, String str2, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, str2);
        }
    }

    public /* synthetic */ GetPurchaseBundles$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetPurchaseBundlesResult" : str, data, str2);
    }
}
