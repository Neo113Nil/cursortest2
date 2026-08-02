package com.vk.superapp.analytics.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GetMyTrackerId.kt */
/* loaded from: classes6.dex */
public final class GetMyTrackerId$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    /* compiled from: GetMyTrackerId.kt */
    public static final class Data {

        @pmi0("id")
        private final String id;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(String str, String str2) {
            this.id = str;
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
            return epx.f(this.id, data.id) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            String str = this.requestId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(id=");
            sb.append(this.id);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }
    }

    public GetMyTrackerId$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetMyTrackerId$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetMyTrackerId$Response)) {
            return false;
        }
        GetMyTrackerId$Response getMyTrackerId$Response = (GetMyTrackerId$Response) obj;
        return epx.f(this.type, getMyTrackerId$Response.type) && epx.f(this.data, getMyTrackerId$Response.data) && epx.f(this.requestId, getMyTrackerId$Response.requestId);
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

    public /* synthetic */ GetMyTrackerId$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetByTrackerIdResult" : str, data, str2);
    }
}
