package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FriendsSearch.kt */
/* loaded from: classes6.dex */
public final class FriendsSearch$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public FriendsSearch$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new FriendsSearch$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsSearch$Response)) {
            return false;
        }
        FriendsSearch$Response friendsSearch$Response = (FriendsSearch$Response) obj;
        return epx.f(this.type, friendsSearch$Response.type) && epx.f(this.data, friendsSearch$Response.data) && epx.f(this.requestId, friendsSearch$Response.requestId);
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

    /* compiled from: FriendsSearch.kt */
    public static final class Data {

        @pmi0("ids")
        private final List<Integer> ids;

        @pmi0("listIds")
        private final List<Integer> listIds;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(List<Integer> list, List<Integer> list2, String str) {
            this.ids = list;
            this.listIds = list2;
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
            return epx.f(this.ids, data.ids) && epx.f(this.listIds, data.listIds) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            List<Integer> list = this.ids;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<Integer> list2 = this.listIds;
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str = this.requestId;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(ids=");
            sb.append(this.ids);
            sb.append(", listIds=");
            sb.append(this.listIds);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(List list, List list2, String str, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, str);
        }
    }

    public /* synthetic */ FriendsSearch$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppFriendsFound" : str, data, str2);
    }
}
