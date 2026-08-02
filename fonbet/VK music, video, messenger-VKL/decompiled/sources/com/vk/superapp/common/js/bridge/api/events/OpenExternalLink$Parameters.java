package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: OpenExternalLink.kt */
/* loaded from: classes6.dex */
public final class OpenExternalLink$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("url")
    private final String url;

    public OpenExternalLink$Parameters(String str, String str2) {
        this.url = str;
        this.requestId = str2;
    }

    public static final OpenExternalLink$Parameters a(OpenExternalLink$Parameters openExternalLink$Parameters) {
        return openExternalLink$Parameters.requestId == null ? new OpenExternalLink$Parameters(openExternalLink$Parameters.url, "default_request_id") : openExternalLink$Parameters;
    }

    public static final void b(OpenExternalLink$Parameters openExternalLink$Parameters) {
        if (openExternalLink$Parameters.url == null) {
            throw new IllegalArgumentException("Value of non-nullable member url cannot be\n                        null");
        }
        if (openExternalLink$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenExternalLink$Parameters)) {
            return false;
        }
        OpenExternalLink$Parameters openExternalLink$Parameters = (OpenExternalLink$Parameters) obj;
        return epx.f(this.url, openExternalLink$Parameters.url) && epx.f(this.requestId, openExternalLink$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + (this.url.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(url=");
        sb.append(this.url);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
