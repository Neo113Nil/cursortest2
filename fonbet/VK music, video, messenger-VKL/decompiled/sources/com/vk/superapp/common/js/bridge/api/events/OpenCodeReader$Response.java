package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OpenCodeReader.kt */
/* loaded from: classes6.dex */
public final class OpenCodeReader$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public OpenCodeReader$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new OpenCodeReader$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenCodeReader$Response)) {
            return false;
        }
        OpenCodeReader$Response openCodeReader$Response = (OpenCodeReader$Response) obj;
        return epx.f(this.type, openCodeReader$Response.type) && epx.f(this.data, openCodeReader$Response.data) && epx.f(this.requestId, openCodeReader$Response.requestId);
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

    /* compiled from: OpenCodeReader.kt */
    public static final class Data {

        @pmi0("code_data")
        private final String codeData;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(String str, String str2) {
            this.codeData = str;
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
            return epx.f(this.codeData, data.codeData) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            String str = this.codeData;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.requestId;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(codeData=");
            sb.append(this.codeData);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(String str, String str2, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : str, str2);
        }
    }

    public /* synthetic */ OpenCodeReader$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppOpenCodeReaderResult" : str, data, str2);
    }
}
