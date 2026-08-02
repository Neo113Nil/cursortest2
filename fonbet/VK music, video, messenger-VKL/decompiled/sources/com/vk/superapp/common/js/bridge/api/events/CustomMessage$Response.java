package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CustomMessage.kt */
/* loaded from: classes6.dex */
public final class CustomMessage$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    /* compiled from: CustomMessage.kt */
    public static final class Data {

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("result")
        private final String result;

        public Data(String str, String str2) {
            this.result = str;
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
            return epx.f(this.result, data.result) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = this.result.hashCode() * 31;
            String str = this.requestId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(result=");
            sb.append(this.result);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }
    }

    public CustomMessage$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new CustomMessage$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomMessage$Response)) {
            return false;
        }
        CustomMessage$Response customMessage$Response = (CustomMessage$Response) obj;
        return epx.f(this.type, customMessage$Response.type) && epx.f(this.data, customMessage$Response.data) && epx.f(this.requestId, customMessage$Response.requestId);
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

    public /* synthetic */ CustomMessage$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppCustomMessageResult" : str, data, str2);
    }
}
