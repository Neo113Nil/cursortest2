package com.vk.superapp.local_storage.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: LocalStorageGetState.kt */
/* loaded from: classes6.dex */
public final class LocalStorageGetState$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("stats_id")
    private final Integer statsId;

    @pmi0("type")
    private final String type;

    /* compiled from: LocalStorageGetState.kt */
    public static final class Data {

        @pmi0("available_capacity")
        private final long availableCapacity;

        @pmi0("max_capacity")
        private final long maxCapacity;

        @pmi0("records_count")
        private final int recordsCount;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(long j, long j2, int i, String str) {
            this.maxCapacity = j;
            this.availableCapacity = j2;
            this.recordsCount = i;
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
            return this.maxCapacity == data.maxCapacity && this.availableCapacity == data.availableCapacity && this.recordsCount == data.recordsCount && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int a = shy.a(this.recordsCount, bh10.a(Long.hashCode(this.maxCapacity) * 31, 31, this.availableCapacity), 31);
            String str = this.requestId;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(maxCapacity=");
            sb.append(this.maxCapacity);
            sb.append(", availableCapacity=");
            sb.append(this.availableCapacity);
            sb.append(", recordsCount=");
            sb.append(this.recordsCount);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }
    }

    public LocalStorageGetState$Response(String str, Data data, Integer num, String str2) {
        this.type = str;
        this.data = data;
        this.statsId = num;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new LocalStorageGetState$Response(this.type, this.data, this.statsId, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalStorageGetState$Response)) {
            return false;
        }
        LocalStorageGetState$Response localStorageGetState$Response = (LocalStorageGetState$Response) obj;
        return epx.f(this.type, localStorageGetState$Response.type) && epx.f(this.data, localStorageGetState$Response.data) && epx.f(this.statsId, localStorageGetState$Response.statsId) && epx.f(this.requestId, localStorageGetState$Response.requestId);
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

    public /* synthetic */ LocalStorageGetState$Response(String str, Data data, Integer num, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppLocalStorageGetStateResult" : str, data, (i & 4) != 0 ? null : num, str2);
    }
}
