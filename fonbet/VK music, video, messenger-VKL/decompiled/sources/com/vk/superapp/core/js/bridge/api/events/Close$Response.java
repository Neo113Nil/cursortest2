package com.vk.superapp.core.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.b9y;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: Close.kt */
/* loaded from: classes6.dex */
public final class Close$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public Close$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new Close$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Close$Response)) {
            return false;
        }
        Close$Response close$Response = (Close$Response) obj;
        return epx.f(this.type, close$Response.type) && epx.f(this.data, close$Response.data) && epx.f(this.requestId, close$Response.requestId);
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

    /* compiled from: Close.kt */
    public static final class Data {

        @pmi0("payload")
        private final b9y payload;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("status")
        private final Status status;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Close.kt */
        public static final class Status {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;

            @pmi0("error")
            public static final Status ERROR;

            @pmi0("failed")
            public static final Status FAILED;

            @pmi0("success")
            public static final Status SUCCESS;

            static {
                Status status = new Status("SUCCESS", 0);
                SUCCESS = status;
                Status status2 = new Status(SignalingProtocol.HUNGUP_REASON_FAILED, 1);
                FAILED = status2;
                Status status3 = new Status("ERROR", 2);
                ERROR = status3;
                Status[] statusArr = {status, status2, status3};
                $VALUES = statusArr;
                $ENTRIES = new asp(statusArr);
            }

            private Status(String str, int i) {
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }

        public Data(Status status, b9y b9yVar, String str) {
            this.status = status;
            this.payload = b9yVar;
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
            return this.status == data.status && epx.f(this.payload, data.payload) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = this.status.hashCode() * 31;
            b9y b9yVar = this.payload;
            int hashCode2 = (hashCode + (b9yVar == null ? 0 : b9yVar.hashCode())) * 31;
            String str = this.requestId;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(status=");
            sb.append(this.status);
            sb.append(", payload=");
            sb.append(this.payload);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(Status status, b9y b9yVar, String str, int i, zcl zclVar) {
            this(status, (i & 2) != 0 ? null : b9yVar, str);
        }
    }

    public /* synthetic */ Close$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppCloseResult" : str, data, str2);
    }
}
