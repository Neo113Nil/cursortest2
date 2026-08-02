package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShowNewPostBox.kt */
/* loaded from: classes6.dex */
public final class ShowNewPostBox$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public ShowNewPostBox$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new ShowNewPostBox$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowNewPostBox$Response)) {
            return false;
        }
        ShowNewPostBox$Response showNewPostBox$Response = (ShowNewPostBox$Response) obj;
        return epx.f(this.type, showNewPostBox$Response.type) && epx.f(this.data, showNewPostBox$Response.data) && epx.f(this.requestId, showNewPostBox$Response.requestId);
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

    /* compiled from: ShowNewPostBox.kt */
    public static final class Data {

        @pmi0("owner_id")
        private final Integer ownerId;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(Integer num, Integer num2, String str) {
            this.postId = num;
            this.ownerId = num2;
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
            return epx.f(this.postId, data.postId) && epx.f(this.ownerId, data.ownerId) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            Integer num = this.postId;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.ownerId;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.requestId;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(postId=");
            sb.append(this.postId);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(Integer num, Integer num2, String str, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, str);
        }
    }

    public /* synthetic */ ShowNewPostBox$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppShowNewPostBoxResult" : str, data, str2);
    }
}
