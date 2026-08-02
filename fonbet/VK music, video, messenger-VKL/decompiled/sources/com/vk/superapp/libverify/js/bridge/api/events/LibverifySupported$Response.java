package com.vk.superapp.libverify.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: LibverifySupported.kt */
/* loaded from: classes6.dex */
public final class LibverifySupported$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    /* compiled from: LibverifySupported.kt */
    public static final class Data {

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("supported")
        private final boolean supported;

        @pmi0("version")
        private final int version;

        public Data(boolean z, int i, String str) {
            this.supported = z;
            this.version = i;
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
            return this.supported == data.supported && this.version == data.version && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int a = shy.a(this.version, Boolean.hashCode(this.supported) * 31, 31);
            String str = this.requestId;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(supported=");
            sb.append(this.supported);
            sb.append(", version=");
            sb.append(this.version);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }
    }

    public LibverifySupported$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new LibverifySupported$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibverifySupported$Response)) {
            return false;
        }
        LibverifySupported$Response libverifySupported$Response = (LibverifySupported$Response) obj;
        return epx.f(this.type, libverifySupported$Response.type) && epx.f(this.data, libverifySupported$Response.data) && epx.f(this.requestId, libverifySupported$Response.requestId);
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

    public /* synthetic */ LibverifySupported$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppLibverifySupportedResult" : str, data, str2);
    }
}
