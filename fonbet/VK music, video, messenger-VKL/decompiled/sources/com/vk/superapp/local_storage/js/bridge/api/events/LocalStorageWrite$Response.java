package com.vk.superapp.local_storage.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: LocalStorageWrite.kt */
/* loaded from: classes6.dex */
public final class LocalStorageWrite$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("stats_id")
    private final Integer statsId;

    @pmi0("type")
    private final String type;

    /* compiled from: LocalStorageWrite.kt */
    public static final class Data {

        @pmi0("is_new")
        private final boolean isNew;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(boolean z, String str) {
            this.isNew = z;
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
            return this.isNew == data.isNew && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.isNew) * 31;
            String str = this.requestId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(isNew=");
            sb.append(this.isNew);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }
    }

    public LocalStorageWrite$Response(String str, Data data, Integer num, String str2) {
        this.type = str;
        this.data = data;
        this.statsId = num;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new LocalStorageWrite$Response(this.type, this.data, this.statsId, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalStorageWrite$Response)) {
            return false;
        }
        LocalStorageWrite$Response localStorageWrite$Response = (LocalStorageWrite$Response) obj;
        return epx.f(this.type, localStorageWrite$Response.type) && epx.f(this.data, localStorageWrite$Response.data) && epx.f(this.statsId, localStorageWrite$Response.statsId) && epx.f(this.requestId, localStorageWrite$Response.requestId);
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

    public /* synthetic */ LocalStorageWrite$Response(String str, Data data, Integer num, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppLocalStorageWriteResult" : str, data, (i & 4) != 0 ? null : num, str2);
    }
}
