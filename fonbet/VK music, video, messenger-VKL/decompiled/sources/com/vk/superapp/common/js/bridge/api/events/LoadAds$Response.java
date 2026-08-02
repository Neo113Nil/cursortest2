package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: LoadAds.kt */
/* loaded from: classes6.dex */
public final class LoadAds$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public LoadAds$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new LoadAds$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadAds$Response)) {
            return false;
        }
        LoadAds$Response loadAds$Response = (LoadAds$Response) obj;
        return epx.f(this.type, loadAds$Response.type) && epx.f(this.data, loadAds$Response.data) && epx.f(this.requestId, loadAds$Response.requestId);
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

    /* compiled from: LoadAds.kt */
    public static final class Data {

        @pmi0("load")
        private final Boolean load;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(Boolean bool, String str) {
            this.load = bool;
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
            return epx.f(this.load, data.load) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            Boolean bool = this.load;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.requestId;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(load=");
            sb.append(this.load);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(Boolean bool, String str, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : bool, str);
        }
    }

    public /* synthetic */ LoadAds$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppLoadAds" : str, data, str2);
    }
}
