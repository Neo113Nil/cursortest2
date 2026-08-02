package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OpenP2P.kt */
/* loaded from: classes6.dex */
public final class OpenP2P$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("url")
    private final String url;

    public OpenP2P$Parameters(String str, String str2) {
        this.requestId = str;
        this.url = str2;
    }

    public static final OpenP2P$Parameters a(OpenP2P$Parameters openP2P$Parameters) {
        return openP2P$Parameters.requestId == null ? new OpenP2P$Parameters("default_request_id", openP2P$Parameters.url) : openP2P$Parameters;
    }

    public static final void b(OpenP2P$Parameters openP2P$Parameters) {
        if (openP2P$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenP2P$Parameters)) {
            return false;
        }
        OpenP2P$Parameters openP2P$Parameters = (OpenP2P$Parameters) obj;
        return epx.f(this.requestId, openP2P$Parameters.requestId) && epx.f(this.url, openP2P$Parameters.url);
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        String str = this.url;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    public /* synthetic */ OpenP2P$Parameters(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
