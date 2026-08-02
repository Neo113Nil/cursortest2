package com.vk.superapp.local_storage.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: LocalStorageRead.kt */
/* loaded from: classes6.dex */
public final class LocalStorageRead$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("stats_id")
    private final Integer statsId;

    @pmi0("type")
    private final String type;

    public LocalStorageRead$Response(String str, Data data, Integer num, String str2) {
        this.type = str;
        this.data = data;
        this.statsId = num;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new LocalStorageRead$Response(this.type, this.data, this.statsId, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalStorageRead$Response)) {
            return false;
        }
        LocalStorageRead$Response localStorageRead$Response = (LocalStorageRead$Response) obj;
        return epx.f(this.type, localStorageRead$Response.type) && epx.f(this.data, localStorageRead$Response.data) && epx.f(this.statsId, localStorageRead$Response.statsId) && epx.f(this.requestId, localStorageRead$Response.requestId);
    }

    public final int hashCode() {
        int hashCode = (this.data.hashCode() + (this.type.hashCode() * 31)) * 31;
        Integer num = this.statsId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.requestId;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(type=");
        sb.append(this.type);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", statsId=");
        sb.append(this.statsId);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    /* compiled from: LocalStorageRead.kt */
    public static final class Data {

        @pmi0("data")
        private final String data;

        @pmi0("is_empty")
        private final boolean isEmpty;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(boolean z, String str, String str2) {
            this.isEmpty = z;
            this.data = str;
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
            return this.isEmpty == data.isEmpty && epx.f(this.data, data.data) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.isEmpty) * 31;
            String str = this.data;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.requestId;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(isEmpty=");
            sb.append(this.isEmpty);
            sb.append(", data=");
            sb.append(this.data);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(boolean z, String str, String str2, int i, zcl zclVar) {
            this(z, (i & 2) != 0 ? null : str, str2);
        }
    }

    public /* synthetic */ LocalStorageRead$Response(String str, Data data, Integer num, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppLocalStorageReadResult" : str, data, (i & 4) != 0 ? null : num, str2);
    }
}
