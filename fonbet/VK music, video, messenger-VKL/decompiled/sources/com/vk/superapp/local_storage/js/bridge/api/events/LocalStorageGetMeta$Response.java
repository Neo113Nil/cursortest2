package com.vk.superapp.local_storage.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: LocalStorageGetMeta.kt */
/* loaded from: classes6.dex */
public final class LocalStorageGetMeta$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("stats_id")
    private final Integer statsId;

    @pmi0("type")
    private final String type;

    public LocalStorageGetMeta$Response(String str, Data data, Integer num, String str2) {
        this.type = str;
        this.data = data;
        this.statsId = num;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new LocalStorageGetMeta$Response(this.type, this.data, this.statsId, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalStorageGetMeta$Response)) {
            return false;
        }
        LocalStorageGetMeta$Response localStorageGetMeta$Response = (LocalStorageGetMeta$Response) obj;
        return epx.f(this.type, localStorageGetMeta$Response.type) && epx.f(this.data, localStorageGetMeta$Response.data) && epx.f(this.statsId, localStorageGetMeta$Response.statsId) && epx.f(this.requestId, localStorageGetMeta$Response.requestId);
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

    /* compiled from: LocalStorageGetMeta.kt */
    public static final class Data {

        @pmi0("meta_records")
        private final List<MetaRecords> metaRecords;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(List<MetaRecords> list, String str) {
            this.metaRecords = list;
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
            return epx.f(this.metaRecords, data.metaRecords) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = this.metaRecords.hashCode() * 31;
            String str = this.requestId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(metaRecords=");
            sb.append(this.metaRecords);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        /* compiled from: LocalStorageGetMeta.kt */
        public static final class MetaRecords {

            @pmi0("accessed_counter")
            private final Integer accessedCounter;

            @pmi0("created_at")
            private final Long createdAt;

            @pmi0("key")
            private final String key;

            @pmi0("last_read_at")
            private final Long lastReadAt;

            @pmi0("updated_at")
            private final Long updatedAt;

            public MetaRecords(String str, Integer num, Long l, Long l2, Long l3) {
                this.key = str;
                this.accessedCounter = num;
                this.lastReadAt = l;
                this.updatedAt = l2;
                this.createdAt = l3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MetaRecords)) {
                    return false;
                }
                MetaRecords metaRecords = (MetaRecords) obj;
                return epx.f(this.key, metaRecords.key) && epx.f(this.accessedCounter, metaRecords.accessedCounter) && epx.f(this.lastReadAt, metaRecords.lastReadAt) && epx.f(this.updatedAt, metaRecords.updatedAt) && epx.f(this.createdAt, metaRecords.createdAt);
            }

            public final int hashCode() {
                int hashCode = this.key.hashCode() * 31;
                Integer num = this.accessedCounter;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Long l = this.lastReadAt;
                int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
                Long l2 = this.updatedAt;
                int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
                Long l3 = this.createdAt;
                return hashCode4 + (l3 != null ? l3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MetaRecords(key=");
                sb.append(this.key);
                sb.append(", accessedCounter=");
                sb.append(this.accessedCounter);
                sb.append(", lastReadAt=");
                sb.append(this.lastReadAt);
                sb.append(", updatedAt=");
                sb.append(this.updatedAt);
                sb.append(", createdAt=");
                return iq.b(sb, this.createdAt, ')');
            }

            public /* synthetic */ MetaRecords(String str, Integer num, Long l, Long l2, Long l3, int i, zcl zclVar) {
                this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : l3);
            }
        }
    }

    public /* synthetic */ LocalStorageGetMeta$Response(String str, Data data, Integer num, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppLocalStorageGetMetaResult" : str, data, (i & 4) != 0 ? null : num, str2);
    }
}
