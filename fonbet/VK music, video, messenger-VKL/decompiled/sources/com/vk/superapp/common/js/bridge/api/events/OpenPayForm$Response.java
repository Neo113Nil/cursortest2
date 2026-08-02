package com.vk.superapp.common.js.bridge.api.events;

import com.huawei.hms.adapter.internal.CommonCode;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: OpenPayForm.kt */
/* loaded from: classes6.dex */
public final class OpenPayForm$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public OpenPayForm$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new OpenPayForm$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenPayForm$Response)) {
            return false;
        }
        OpenPayForm$Response openPayForm$Response = (OpenPayForm$Response) obj;
        return epx.f(this.type, openPayForm$Response.type) && epx.f(this.data, openPayForm$Response.data) && epx.f(this.requestId, openPayForm$Response.requestId);
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

    public /* synthetic */ OpenPayForm$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebOpenPayFormFailed" : str, data, str2);
    }

    /* compiled from: OpenPayForm.kt */
    public static final class Data {

        @pmi0("amount")
        private final String amount;

        @pmi0("extra")
        private final String extra;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("status")
        private final boolean status;

        @pmi0(CommonCode.MapKey.TRANSACTION_ID)
        private final String transactionId;

        public Data(boolean z, String str, String str2, String str3, String str4) {
            this.status = z;
            this.transactionId = str;
            this.amount = str2;
            this.extra = str3;
            this.requestId = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.status == data.status && epx.f(this.transactionId, data.transactionId) && epx.f(this.amount, data.amount) && epx.f(this.extra, data.extra) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int a = urd0.a(urd0.a(Boolean.hashCode(this.status) * 31, 31, this.transactionId), 31, this.amount);
            String str = this.extra;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.requestId;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(status=");
            sb.append(this.status);
            sb.append(", transactionId=");
            sb.append(this.transactionId);
            sb.append(", amount=");
            sb.append(this.amount);
            sb.append(", extra=");
            sb.append(this.extra);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(boolean z, String str, String str2, String str3, String str4, int i, zcl zclVar) {
            this(z, str, str2, (i & 8) != 0 ? null : str3, str4);
        }
    }
}
