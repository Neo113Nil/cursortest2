package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShowWallPostBox.kt */
/* loaded from: classes6.dex */
public final class ShowWallPostBox$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    /* compiled from: ShowWallPostBox.kt */
    public static final class Data {

        @pmi0("post_id")
        private final int postId;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(int i, String str) {
            this.postId = i;
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
            return this.postId == data.postId && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.postId) * 31;
            String str = this.requestId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(postId=");
            sb.append(this.postId);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }
    }

    public ShowWallPostBox$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new ShowWallPostBox$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowWallPostBox$Response)) {
            return false;
        }
        ShowWallPostBox$Response showWallPostBox$Response = (ShowWallPostBox$Response) obj;
        return epx.f(this.type, showWallPostBox$Response.type) && epx.f(this.data, showWallPostBox$Response.data) && epx.f(this.requestId, showWallPostBox$Response.requestId);
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

    public /* synthetic */ ShowWallPostBox$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppShowWallPostBoxResult" : str, data, str2);
    }
}
