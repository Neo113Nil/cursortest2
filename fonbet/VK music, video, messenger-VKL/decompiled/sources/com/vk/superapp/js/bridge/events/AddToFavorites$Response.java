package com.vk.superapp.js.bridge.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AddToFavorites.kt */
/* loaded from: classes6.dex */
public final class AddToFavorites$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0("type")
    private final String type;

    public AddToFavorites$Response(String str, Data data) {
        this.type = str;
        this.data = data;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new AddToFavorites$Response(this.type, Data.a(str, this.data));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddToFavorites$Response)) {
            return false;
        }
        AddToFavorites$Response addToFavorites$Response = (AddToFavorites$Response) obj;
        return epx.f(this.type, addToFavorites$Response.type) && epx.f(this.data, addToFavorites$Response.data);
    }

    public final int hashCode() {
        return this.data.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "Response(type=" + this.type + ", data=" + this.data + ')';
    }

    /* compiled from: AddToFavorites.kt */
    public static final class Data {

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("result")
        private final boolean result;

        public Data(boolean z, String str) {
            this.result = z;
            this.requestId = str;
        }

        public static Data a(String str, Data data) {
            boolean z = data.result;
            data.getClass();
            return new Data(z, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.result == data.result && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.result) * 31;
            String str = this.requestId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(result=");
            sb.append(this.result);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(boolean z, String str, int i, zcl zclVar) {
            this(z, (i & 2) != 0 ? null : str);
        }
    }

    public /* synthetic */ AddToFavorites$Response(String str, Data data, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppAddToFavoritesResult" : str, data);
    }
}
