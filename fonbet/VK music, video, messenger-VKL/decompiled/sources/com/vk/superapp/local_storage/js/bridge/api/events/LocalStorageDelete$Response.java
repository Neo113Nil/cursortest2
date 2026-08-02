package com.vk.superapp.local_storage.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.bd6;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: LocalStorageDelete.kt */
/* loaded from: classes6.dex */
public final class LocalStorageDelete$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("stats_id")
    private final Integer statsId;

    @pmi0("type")
    private final String type;

    /* compiled from: LocalStorageDelete.kt */
    public static final class Data {

        @pmi0("cleared_keys")
        private final List<String> clearedKeys;

        @pmi0("not_found_keys")
        private final List<String> notFoundKeys;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(List<String> list, List<String> list2, String str) {
            this.clearedKeys = list;
            this.notFoundKeys = list2;
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
            return epx.f(this.clearedKeys, data.clearedKeys) && epx.f(this.notFoundKeys, data.notFoundKeys) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int a = fw3.a(this.clearedKeys.hashCode() * 31, 31, this.notFoundKeys);
            String str = this.requestId;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(clearedKeys=");
            sb.append(this.clearedKeys);
            sb.append(", notFoundKeys=");
            sb.append(this.notFoundKeys);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }
    }

    public LocalStorageDelete$Response(String str, Data data, Integer num, String str2) {
        this.type = str;
        this.data = data;
        this.statsId = num;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new LocalStorageDelete$Response(this.type, this.data, this.statsId, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalStorageDelete$Response)) {
            return false;
        }
        LocalStorageDelete$Response localStorageDelete$Response = (LocalStorageDelete$Response) obj;
        return epx.f(this.type, localStorageDelete$Response.type) && epx.f(this.data, localStorageDelete$Response.data) && epx.f(this.statsId, localStorageDelete$Response.statsId) && epx.f(this.requestId, localStorageDelete$Response.requestId);
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

    public /* synthetic */ LocalStorageDelete$Response(String str, Data data, Integer num, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppLocalStorageDeleteResult" : str, data, (i & 4) != 0 ? null : num, str2);
    }
}
