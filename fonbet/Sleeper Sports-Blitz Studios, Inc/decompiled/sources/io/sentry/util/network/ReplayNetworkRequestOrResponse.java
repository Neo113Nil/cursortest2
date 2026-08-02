package io.sentry.util.network;

import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes9.dex */
public final class ReplayNetworkRequestOrResponse {
    private final NetworkBody body;
    private final Map<String, String> headers;
    private final Long size;

    public ReplayNetworkRequestOrResponse(Long l, NetworkBody networkBody, Map<String, String> map) {
        this.size = l;
        this.body = networkBody;
        this.headers = map;
    }

    public Long getSize() {
        return this.size;
    }

    public NetworkBody getBody() {
        return this.body;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String toString() {
        return "ReplayNetworkRequestOrResponse{size=" + this.size + ", body=" + this.body + ", headers=" + this.headers + AbstractJsonLexerKt.END_OBJ;
    }
}
