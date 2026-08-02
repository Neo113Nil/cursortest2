package com.vk.superapp.libverify.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: LibverifyChangeState.kt */
/* loaded from: classes6.dex */
public final class LibverifyChangeState$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public LibverifyChangeState$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new LibverifyChangeState$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibverifyChangeState$Response)) {
            return false;
        }
        LibverifyChangeState$Response libverifyChangeState$Response = (LibverifyChangeState$Response) obj;
        return epx.f(this.type, libverifyChangeState$Response.type) && epx.f(this.data, libverifyChangeState$Response.data) && epx.f(this.requestId, libverifyChangeState$Response.requestId);
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

    public /* synthetic */ LibverifyChangeState$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppLibverifyChangeState" : str, data, str2);
    }

    /* compiled from: LibverifyChangeState.kt */
    public static final class Data {

        @pmi0("current_loader_state")
        private final Boolean currentLoaderState;

        @pmi0("current_state")
        private final String currentState;

        @pmi0("digits_count")
        private final Integer digitsCount;

        @pmi0("error")
        private final Integer error;

        @pmi0("error_description")
        private final String errorDescription;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("validate_session")
        private final String validateSession;

        @pmi0("validate_token")
        private final String validateToken;

        public Data(String str, Boolean bool, Integer num, String str2, String str3, Integer num2, String str4, String str5) {
            this.currentState = str;
            this.currentLoaderState = bool;
            this.digitsCount = num;
            this.validateToken = str2;
            this.validateSession = str3;
            this.error = num2;
            this.errorDescription = str4;
            this.requestId = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return epx.f(this.currentState, data.currentState) && epx.f(this.currentLoaderState, data.currentLoaderState) && epx.f(this.digitsCount, data.digitsCount) && epx.f(this.validateToken, data.validateToken) && epx.f(this.validateSession, data.validateSession) && epx.f(this.error, data.error) && epx.f(this.errorDescription, data.errorDescription) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            String str = this.currentState;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.currentLoaderState;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.digitsCount;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.validateToken;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.validateSession;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num2 = this.error;
            int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str4 = this.errorDescription;
            int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.requestId;
            return hashCode7 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(currentState=");
            sb.append(this.currentState);
            sb.append(", currentLoaderState=");
            sb.append(this.currentLoaderState);
            sb.append(", digitsCount=");
            sb.append(this.digitsCount);
            sb.append(", validateToken=");
            sb.append(this.validateToken);
            sb.append(", validateSession=");
            sb.append(this.validateSession);
            sb.append(", error=");
            sb.append(this.error);
            sb.append(", errorDescription=");
            sb.append(this.errorDescription);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Data(String str, Boolean bool, Integer num, String str2, String str3, Integer num2, String str4, String str5, int i, zcl zclVar) {
            this(str, bool, num, str2, str3, num2, r9, r10);
            String str6;
            String str7;
            str = (i & 1) != 0 ? null : str;
            bool = (i & 2) != 0 ? null : bool;
            num = (i & 4) != 0 ? null : num;
            str2 = (i & 8) != 0 ? null : str2;
            str3 = (i & 16) != 0 ? null : str3;
            num2 = (i & 32) != 0 ? null : num2;
            if ((i & 64) != 0) {
                str6 = str5;
                str7 = null;
            } else {
                str6 = str5;
                str7 = str4;
            }
        }
    }
}
