package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.ad6;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: ConfirmUserByService.kt */
/* loaded from: classes6.dex */
public final class ConfirmUserByService$Parameters implements ad6 {

    @pmi0("app2appURLs")
    private final List<String> app2appURLs;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("webviewURL")
    private final String webviewURL;

    public ConfirmUserByService$Parameters(String str, List<String> list, String str2) {
        this.webviewURL = str;
        this.app2appURLs = list;
        this.requestId = str2;
    }

    public static final ConfirmUserByService$Parameters a(ConfirmUserByService$Parameters confirmUserByService$Parameters) {
        return confirmUserByService$Parameters.requestId == null ? new ConfirmUserByService$Parameters(confirmUserByService$Parameters.webviewURL, confirmUserByService$Parameters.app2appURLs, "default_request_id") : confirmUserByService$Parameters;
    }

    public static final void b(ConfirmUserByService$Parameters confirmUserByService$Parameters) {
        if (confirmUserByService$Parameters.webviewURL == null) {
            throw new IllegalArgumentException("Value of non-nullable member webviewURL cannot be\n                        null");
        }
        if (confirmUserByService$Parameters.app2appURLs == null) {
            throw new IllegalArgumentException("Value of non-nullable member app2appURLs cannot be\n                        null");
        }
        if (confirmUserByService$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final List<String> c() {
        return this.app2appURLs;
    }

    public final String d() {
        return this.webviewURL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmUserByService$Parameters)) {
            return false;
        }
        ConfirmUserByService$Parameters confirmUserByService$Parameters = (ConfirmUserByService$Parameters) obj;
        return epx.f(this.webviewURL, confirmUserByService$Parameters.webviewURL) && epx.f(this.app2appURLs, confirmUserByService$Parameters.app2appURLs) && epx.f(this.requestId, confirmUserByService$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + fw3.a(this.webviewURL.hashCode() * 31, 31, this.app2appURLs);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(webviewURL=");
        sb.append(this.webviewURL);
        sb.append(", app2appURLs=");
        sb.append(this.app2appURLs);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
