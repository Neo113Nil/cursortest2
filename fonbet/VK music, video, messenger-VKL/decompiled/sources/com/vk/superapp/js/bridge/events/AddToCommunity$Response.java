package com.vk.superapp.js.bridge.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AddToCommunity.kt */
/* loaded from: classes6.dex */
public final class AddToCommunity$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0("type")
    private final String type;

    public AddToCommunity$Response(String str, Data data) {
        this.type = str;
        this.data = data;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new AddToCommunity$Response(this.type, Data.a(str, this.data));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddToCommunity$Response)) {
            return false;
        }
        AddToCommunity$Response addToCommunity$Response = (AddToCommunity$Response) obj;
        return epx.f(this.type, addToCommunity$Response.type) && epx.f(this.data, addToCommunity$Response.data);
    }

    public final int hashCode() {
        return this.data.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "Response(type=" + this.type + ", data=" + this.data + ')';
    }

    /* compiled from: AddToCommunity.kt */
    public static final class Data {

        @pmi0("group_id")
        private final long groupId;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(long j, String str) {
            this.groupId = j;
            this.requestId = str;
        }

        public static Data a(String str, Data data) {
            long j = data.groupId;
            data.getClass();
            return new Data(j, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.groupId == data.groupId && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.groupId) * 31;
            String str = this.requestId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(groupId=");
            sb.append(this.groupId);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(long j, String str, int i, zcl zclVar) {
            this(j, (i & 2) != 0 ? null : str);
        }
    }

    public /* synthetic */ AddToCommunity$Response(String str, Data data, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppAddToCommunityResult" : str, data);
    }
}
