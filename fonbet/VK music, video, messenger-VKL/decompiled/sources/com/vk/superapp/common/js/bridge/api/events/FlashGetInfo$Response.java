package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FlashGetInfo.kt */
/* loaded from: classes6.dex */
public final class FlashGetInfo$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public FlashGetInfo$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new FlashGetInfo$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlashGetInfo$Response)) {
            return false;
        }
        FlashGetInfo$Response flashGetInfo$Response = (FlashGetInfo$Response) obj;
        return epx.f(this.type, flashGetInfo$Response.type) && epx.f(this.data, flashGetInfo$Response.data) && epx.f(this.requestId, flashGetInfo$Response.requestId);
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

    /* compiled from: FlashGetInfo.kt */
    public static final class Data {

        @pmi0("is_available")
        private final boolean isAvailable;

        @pmi0("level")
        private final Float level;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(boolean z, Float f, String str) {
            this.isAvailable = z;
            this.level = f;
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
            return this.isAvailable == data.isAvailable && epx.f(this.level, data.level) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.isAvailable) * 31;
            Float f = this.level;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            String str = this.requestId;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(isAvailable=");
            sb.append(this.isAvailable);
            sb.append(", level=");
            sb.append(this.level);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(boolean z, Float f, String str, int i, zcl zclVar) {
            this(z, (i & 2) != 0 ? null : f, str);
        }
    }

    public /* synthetic */ FlashGetInfo$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppFlashGetInfoResult" : str, data, str2);
    }
}
