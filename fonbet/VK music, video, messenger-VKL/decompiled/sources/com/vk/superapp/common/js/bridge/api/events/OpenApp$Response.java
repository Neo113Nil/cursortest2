package com.vk.superapp.common.js.bridge.api.events;

import defpackage.q0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OpenApp.kt */
/* loaded from: classes6.dex */
public final class OpenApp$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    /* compiled from: OpenApp.kt */
    public static abstract class Data {

        @pmi0(CommonUrlParts.REQUEST_ID)
        private String requestId;

        /* compiled from: OpenApp.kt */
        public static final class InfoValue extends Data {

            @pmi0("info")
            private final a info;

            public InfoValue(a aVar) {
                super(null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InfoValue)) {
                    return false;
                }
                ((InfoValue) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "InfoValue(info=null)";
            }
        }

        /* compiled from: OpenApp.kt */
        public static final class ResultValue extends Data {

            @pmi0("result")
            private final Result result;

            public ResultValue(Result result) {
                super(null);
                this.result = result;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ResultValue) && epx.f(this.result, ((ResultValue) obj).result);
            }

            public final int hashCode() {
                return this.result.hashCode();
            }

            public final String toString() {
                return "ResultValue(result=" + this.result + ')';
            }
        }

        public /* synthetic */ Data(zcl zclVar) {
            this();
        }

        private Data() {
        }
    }

    /* compiled from: OpenApp.kt */
    public static final class Result {

        @pmi0("result")
        private final boolean result;

        public Result(boolean z) {
            this.result = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && this.result == ((Result) obj).result;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.result);
        }

        public final String toString() {
            return q0.a(new StringBuilder("Result(result="), this.result, ')');
        }
    }

    /* compiled from: OpenApp.kt */
    public static final class a {
    }

    public OpenApp$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new OpenApp$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenApp$Response)) {
            return false;
        }
        OpenApp$Response openApp$Response = (OpenApp$Response) obj;
        return epx.f(this.type, openApp$Response.type) && epx.f(this.data, openApp$Response.data) && epx.f(this.requestId, openApp$Response.requestId);
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

    public /* synthetic */ OpenApp$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppOpenAppResult" : str, data, str2);
    }
}
