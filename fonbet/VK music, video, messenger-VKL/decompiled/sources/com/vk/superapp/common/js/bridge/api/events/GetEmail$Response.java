package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GetEmail.kt */
/* loaded from: classes6.dex */
public final class GetEmail$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    /* compiled from: GetEmail.kt */
    public static final class Data {

        @pmi0("email")
        private final String email;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("sign")
        private final String sign;

        public Data(String str, String str2, String str3) {
            this.sign = str;
            this.email = str2;
            this.requestId = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return epx.f(this.sign, data.sign) && epx.f(this.email, data.email) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int a = urd0.a(this.sign.hashCode() * 31, 31, this.email);
            String str = this.requestId;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(sign=");
            sb.append(this.sign);
            sb.append(", email=");
            sb.append(this.email);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }
    }

    public GetEmail$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetEmail$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetEmail$Response)) {
            return false;
        }
        GetEmail$Response getEmail$Response = (GetEmail$Response) obj;
        return epx.f(this.type, getEmail$Response.type) && epx.f(this.data, getEmail$Response.data) && epx.f(this.requestId, getEmail$Response.requestId);
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

    public /* synthetic */ GetEmail$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetEmailResult" : str, data, str2);
    }
}
