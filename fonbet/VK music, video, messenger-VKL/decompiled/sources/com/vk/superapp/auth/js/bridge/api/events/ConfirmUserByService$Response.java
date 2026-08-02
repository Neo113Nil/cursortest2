package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ConfirmUserByService.kt */
/* loaded from: classes6.dex */
public final class ConfirmUserByService$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public ConfirmUserByService$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new ConfirmUserByService$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmUserByService$Response)) {
            return false;
        }
        ConfirmUserByService$Response confirmUserByService$Response = (ConfirmUserByService$Response) obj;
        return epx.f(this.type, confirmUserByService$Response.type) && epx.f(this.data, confirmUserByService$Response.data) && epx.f(this.requestId, confirmUserByService$Response.requestId);
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

    /* compiled from: ConfirmUserByService.kt */
    public static final class Data {

        @pmi0("callbackURL")
        private final String callbackURL;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(String str, String str2) {
            this.callbackURL = str;
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
            return epx.f(this.callbackURL, data.callbackURL) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            String str = this.callbackURL;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.requestId;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(callbackURL=");
            sb.append(this.callbackURL);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(String str, String str2, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : str, str2);
        }
    }

    public /* synthetic */ ConfirmUserByService$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppConfirmUserByServiceResult" : str, data, str2);
    }
}
