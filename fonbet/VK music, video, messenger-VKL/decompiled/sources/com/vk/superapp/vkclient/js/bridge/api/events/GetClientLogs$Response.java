package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.b9y;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GetClientLogs.kt */
/* loaded from: classes6.dex */
public final class GetClientLogs$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public GetClientLogs$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetClientLogs$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetClientLogs$Response)) {
            return false;
        }
        GetClientLogs$Response getClientLogs$Response = (GetClientLogs$Response) obj;
        return epx.f(this.type, getClientLogs$Response.type) && epx.f(this.data, getClientLogs$Response.data) && epx.f(this.requestId, getClientLogs$Response.requestId);
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

    /* compiled from: GetClientLogs.kt */
    public static final class Data {

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("upload_response")
        private final b9y uploadResponse;

        public Data(b9y b9yVar, String str) {
            this.uploadResponse = b9yVar;
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
            return epx.f(this.uploadResponse, data.uploadResponse) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            b9y b9yVar = this.uploadResponse;
            int hashCode = (b9yVar == null ? 0 : b9yVar.hashCode()) * 31;
            String str = this.requestId;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(uploadResponse=");
            sb.append(this.uploadResponse);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(b9y b9yVar, String str, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : b9yVar, str);
        }
    }

    public /* synthetic */ GetClientLogs$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetClientLogsResult" : str, data, str2);
    }
}
