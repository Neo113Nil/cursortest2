package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CreateHash.kt */
/* loaded from: classes6.dex */
public final class CreateHash$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public CreateHash$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new CreateHash$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateHash$Response)) {
            return false;
        }
        CreateHash$Response createHash$Response = (CreateHash$Response) obj;
        return epx.f(this.type, createHash$Response.type) && epx.f(this.data, createHash$Response.data) && epx.f(this.requestId, createHash$Response.requestId);
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

    public /* synthetic */ CreateHash$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppCreateHashResult" : str, data, str2);
    }

    /* compiled from: CreateHash.kt */
    public static final class Data {

        @pmi0("edu_sign")
        private final String eduSign;

        @pmi0("payload")
        private final String payload;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("sign")
        private final String sign;

        @pmi0("ts")
        private final long ts;

        public Data(long j, String str, String str2, String str3, String str4) {
            this.ts = j;
            this.sign = str;
            this.payload = str2;
            this.eduSign = str3;
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
            return this.ts == data.ts && epx.f(this.sign, data.sign) && epx.f(this.payload, data.payload) && epx.f(this.eduSign, data.eduSign) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int a = urd0.a(Long.hashCode(this.ts) * 31, 31, this.sign);
            String str = this.payload;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.eduSign;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.requestId;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(ts=");
            sb.append(this.ts);
            sb.append(", sign=");
            sb.append(this.sign);
            sb.append(", payload=");
            sb.append(this.payload);
            sb.append(", eduSign=");
            sb.append(this.eduSign);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Data(long j, String str, String str2, String str3, String str4, int i, zcl zclVar) {
            this(j, str, str2, r7, r8);
            String str5;
            String str6;
            str2 = (i & 4) != 0 ? null : str2;
            if ((i & 8) != 0) {
                str5 = str4;
                str6 = null;
            } else {
                str5 = str4;
                str6 = str3;
            }
        }
    }
}
