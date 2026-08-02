package com.vk.superapp.core.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.b9y;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CallAPIMethod.kt */
/* loaded from: classes6.dex */
public final class CallAPIMethod$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public CallAPIMethod$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new CallAPIMethod$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallAPIMethod$Response)) {
            return false;
        }
        CallAPIMethod$Response callAPIMethod$Response = (CallAPIMethod$Response) obj;
        return epx.f(this.type, callAPIMethod$Response.type) && epx.f(this.data, callAPIMethod$Response.data) && epx.f(this.requestId, callAPIMethod$Response.requestId);
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

    /* compiled from: CallAPIMethod.kt */
    public static final class Data {

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("response")
        private final b9y response;

        public Data(b9y b9yVar, String str) {
            this.response = b9yVar;
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
            return epx.f(this.response, data.response) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            b9y b9yVar = this.response;
            int hashCode = (b9yVar == null ? 0 : b9yVar.hashCode()) * 31;
            String str = this.requestId;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(response=");
            sb.append(this.response);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(b9y b9yVar, String str, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : b9yVar, str);
        }
    }

    public /* synthetic */ CallAPIMethod$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppCallAPIMethodResult" : str, data, str2);
    }
}
