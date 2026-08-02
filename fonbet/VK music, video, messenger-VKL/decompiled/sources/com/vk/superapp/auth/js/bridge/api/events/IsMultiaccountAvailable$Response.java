package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: IsMultiaccountAvailable.kt */
/* loaded from: classes6.dex */
public final class IsMultiaccountAvailable$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    /* compiled from: IsMultiaccountAvailable.kt */
    public static final class Data {

        @pmi0("is_available")
        private final boolean isAvailable;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(boolean z, String str) {
            this.isAvailable = z;
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
            return this.isAvailable == data.isAvailable && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.isAvailable) * 31;
            String str = this.requestId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(isAvailable=");
            sb.append(this.isAvailable);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }
    }

    public IsMultiaccountAvailable$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new IsMultiaccountAvailable$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IsMultiaccountAvailable$Response)) {
            return false;
        }
        IsMultiaccountAvailable$Response isMultiaccountAvailable$Response = (IsMultiaccountAvailable$Response) obj;
        return epx.f(this.type, isMultiaccountAvailable$Response.type) && epx.f(this.data, isMultiaccountAvailable$Response.data) && epx.f(this.requestId, isMultiaccountAvailable$Response.requestId);
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

    public /* synthetic */ IsMultiaccountAvailable$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppIsMultiaccountAvailableResult" : str, data, str2);
    }
}
