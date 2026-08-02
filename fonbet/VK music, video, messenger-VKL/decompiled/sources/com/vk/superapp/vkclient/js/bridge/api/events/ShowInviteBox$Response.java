package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShowInviteBox.kt */
/* loaded from: classes6.dex */
public final class ShowInviteBox$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public ShowInviteBox$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new ShowInviteBox$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowInviteBox$Response)) {
            return false;
        }
        ShowInviteBox$Response showInviteBox$Response = (ShowInviteBox$Response) obj;
        return epx.f(this.type, showInviteBox$Response.type) && epx.f(this.data, showInviteBox$Response.data) && epx.f(this.requestId, showInviteBox$Response.requestId);
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

    /* compiled from: ShowInviteBox.kt */
    public static final class Data {

        @pmi0("notSentIds")
        private final List<Integer> notSentIds;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("success")
        private final boolean success;

        public Data(boolean z, List<Integer> list, String str) {
            this.success = z;
            this.notSentIds = list;
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
            return this.success == data.success && epx.f(this.notSentIds, data.notSentIds) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.success) * 31;
            List<Integer> list = this.notSentIds;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.requestId;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(success=");
            sb.append(this.success);
            sb.append(", notSentIds=");
            sb.append(this.notSentIds);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(boolean z, List list, String str, int i, zcl zclVar) {
            this(z, (i & 2) != 0 ? null : list, str);
        }
    }

    public /* synthetic */ ShowInviteBox$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppShowInviteBoxResult" : str, data, str2);
    }
}
