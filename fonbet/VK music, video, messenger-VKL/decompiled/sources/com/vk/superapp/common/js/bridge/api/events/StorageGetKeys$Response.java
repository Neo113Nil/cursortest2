package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StorageGetKeys.kt */
/* loaded from: classes6.dex */
public final class StorageGetKeys$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public StorageGetKeys$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new StorageGetKeys$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageGetKeys$Response)) {
            return false;
        }
        StorageGetKeys$Response storageGetKeys$Response = (StorageGetKeys$Response) obj;
        return epx.f(this.type, storageGetKeys$Response.type) && epx.f(this.data, storageGetKeys$Response.data) && epx.f(this.requestId, storageGetKeys$Response.requestId);
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

    /* compiled from: StorageGetKeys.kt */
    public static final class Data {

        @pmi0(ApiProtocol.PARAM_KEYS)
        private final List<String> keys;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(List<String> list, String str) {
            this.keys = list;
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
            return epx.f(this.keys, data.keys) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            List<String> list = this.keys;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.requestId;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(keys=");
            sb.append(this.keys);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(List list, String str, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : list, str);
        }
    }

    public /* synthetic */ StorageGetKeys$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppStorageGetKeysResult" : str, data, str2);
    }
}
