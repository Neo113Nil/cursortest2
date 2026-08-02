package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GetPhoneNumber.kt */
/* loaded from: classes6.dex */
public final class GetPhoneNumber$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public GetPhoneNumber$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetPhoneNumber$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPhoneNumber$Response)) {
            return false;
        }
        GetPhoneNumber$Response getPhoneNumber$Response = (GetPhoneNumber$Response) obj;
        return epx.f(this.type, getPhoneNumber$Response.type) && epx.f(this.data, getPhoneNumber$Response.data) && epx.f(this.requestId, getPhoneNumber$Response.requestId);
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

    /* compiled from: GetPhoneNumber.kt */
    public static final class Data {

        @pmi0("phone_number")
        private final String phoneNumber;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("sign")
        private final String sign;

        public Data(String str, String str2, String str3) {
            this.sign = str;
            this.phoneNumber = str2;
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
            return epx.f(this.sign, data.sign) && epx.f(this.phoneNumber, data.phoneNumber) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            String str = this.sign;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.phoneNumber;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.requestId;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(sign=");
            sb.append(this.sign);
            sb.append(", phoneNumber=");
            sb.append(this.phoneNumber);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(String str, String str2, String str3, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3);
        }
    }

    public /* synthetic */ GetPhoneNumber$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetPhoneNumberResult" : str, data, str2);
    }
}
