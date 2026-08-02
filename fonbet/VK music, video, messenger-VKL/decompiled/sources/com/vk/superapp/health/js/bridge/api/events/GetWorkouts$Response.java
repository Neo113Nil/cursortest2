package com.vk.superapp.health.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GetWorkouts.kt */
/* loaded from: classes6.dex */
public final class GetWorkouts$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public GetWorkouts$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetWorkouts$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetWorkouts$Response)) {
            return false;
        }
        GetWorkouts$Response getWorkouts$Response = (GetWorkouts$Response) obj;
        return epx.f(this.type, getWorkouts$Response.type) && epx.f(this.data, getWorkouts$Response.data) && epx.f(this.requestId, getWorkouts$Response.requestId);
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

    /* compiled from: GetWorkouts.kt */
    public static final class Data {

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("result")
        private final Result result;

        /* compiled from: GetWorkouts.kt */
        public static final class Result {

            @pmi0("count")
            private final Integer count;

            @pmi0("description")
            private final String description;

            @pmi0("gms_version")
            private final String gmsVersion;

            @pmi0("google_fit_version")
            private final String googleFitVersion;

            @pmi0("load_time")
            private final Integer loadTime;

            public Result() {
                this(null, null, null, null, null, 31, null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Result)) {
                    return false;
                }
                Result result = (Result) obj;
                return epx.f(this.count, result.count) && epx.f(this.description, result.description) && epx.f(this.loadTime, result.loadTime) && epx.f(this.googleFitVersion, result.googleFitVersion) && epx.f(this.gmsVersion, result.gmsVersion);
            }

            public final int hashCode() {
                Integer num = this.count;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.description;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Integer num2 = this.loadTime;
                int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str2 = this.googleFitVersion;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.gmsVersion;
                return hashCode4 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(count=");
                sb.append(this.count);
                sb.append(", description=");
                sb.append(this.description);
                sb.append(", loadTime=");
                sb.append(this.loadTime);
                sb.append(", googleFitVersion=");
                sb.append(this.googleFitVersion);
                sb.append(", gmsVersion=");
                return ho8.a(sb, this.gmsVersion, ')');
            }

            public Result(Integer num, String str, Integer num2, String str2, String str3) {
                this.count = num;
                this.description = str;
                this.loadTime = num2;
                this.googleFitVersion = str2;
                this.gmsVersion = str3;
            }

            public /* synthetic */ Result(Integer num, String str, Integer num2, String str2, String str3, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
            }
        }

        public Data(Result result, String str) {
            this.result = result;
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
            return epx.f(this.result, data.result) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            Result result = this.result;
            int hashCode = (result == null ? 0 : result.hashCode()) * 31;
            String str = this.requestId;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(result=");
            sb.append(this.result);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(Result result, String str, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : result, str);
        }
    }

    public /* synthetic */ GetWorkouts$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetWorkoutsResult" : str, data, str2);
    }
}
