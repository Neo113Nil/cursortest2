package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShowSubscriptionBox.kt */
/* loaded from: classes6.dex */
public final class ShowSubscriptionBox$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public ShowSubscriptionBox$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new ShowSubscriptionBox$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowSubscriptionBox$Response)) {
            return false;
        }
        ShowSubscriptionBox$Response showSubscriptionBox$Response = (ShowSubscriptionBox$Response) obj;
        return epx.f(this.type, showSubscriptionBox$Response.type) && epx.f(this.data, showSubscriptionBox$Response.data) && epx.f(this.requestId, showSubscriptionBox$Response.requestId);
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

    /* compiled from: ShowSubscriptionBox.kt */
    public static final class Data {

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("subscription_id")
        private final Integer subscriptionId;

        @pmi0("success")
        private final boolean success;

        public Data(boolean z, Integer num, String str) {
            this.success = z;
            this.subscriptionId = num;
            this.requestId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.success == data.success && epx.f(this.subscriptionId, data.subscriptionId) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.success) * 31;
            Integer num = this.subscriptionId;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.requestId;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(success=");
            sb.append(this.success);
            sb.append(", subscriptionId=");
            sb.append(this.subscriptionId);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(boolean z, Integer num, String str, int i, zcl zclVar) {
            this(z, (i & 2) != 0 ? null : num, str);
        }
    }

    public /* synthetic */ ShowSubscriptionBox$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppShowSubscriptionBoxResult" : str, data, str2);
    }
}
