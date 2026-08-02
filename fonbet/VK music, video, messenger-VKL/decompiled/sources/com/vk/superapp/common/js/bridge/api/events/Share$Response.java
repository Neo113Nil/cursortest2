package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: Share.kt */
/* loaded from: classes6.dex */
public final class Share$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public Share$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new Share$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Share$Response)) {
            return false;
        }
        Share$Response share$Response = (Share$Response) obj;
        return epx.f(this.type, share$Response.type) && epx.f(this.data, share$Response.data) && epx.f(this.requestId, share$Response.requestId);
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

    /* compiled from: Share.kt */
    public static final class Data {

        @pmi0("post_id")
        private final Integer postId;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("story_id")
        private final Integer storyId;

        @pmi0("type")
        private final String type;

        public Data(String str, Integer num, Integer num2, String str2) {
            this.type = str;
            this.postId = num;
            this.storyId = num2;
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
            return epx.f(this.type, data.type) && epx.f(this.postId, data.postId) && epx.f(this.storyId, data.storyId) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            Integer num = this.postId;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.storyId;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.requestId;
            return hashCode3 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(type=");
            sb.append(this.type);
            sb.append(", postId=");
            sb.append(this.postId);
            sb.append(", storyId=");
            sb.append(this.storyId);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(String str, Integer num, Integer num2, String str2, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, str2);
        }
    }

    public /* synthetic */ Share$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppShareResult" : str, data, str2);
    }
}
