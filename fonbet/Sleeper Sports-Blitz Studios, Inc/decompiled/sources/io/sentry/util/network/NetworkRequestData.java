package io.sentry.util.network;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes9.dex */
public final class NetworkRequestData {
    private final String method;
    private ReplayNetworkRequestOrResponse request;
    private Long requestBodySize;
    private ReplayNetworkRequestOrResponse response;
    private Long responseBodySize;
    private Integer statusCode;

    public NetworkRequestData(String str) {
        this.method = str;
    }

    public String getMethod() {
        return this.method;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Long getRequestBodySize() {
        return this.requestBodySize;
    }

    public Long getResponseBodySize() {
        return this.responseBodySize;
    }

    public ReplayNetworkRequestOrResponse getRequest() {
        return this.request;
    }

    public ReplayNetworkRequestOrResponse getResponse() {
        return this.response;
    }

    public void setRequestDetails(ReplayNetworkRequestOrResponse replayNetworkRequestOrResponse) {
        this.request = replayNetworkRequestOrResponse;
        this.requestBodySize = replayNetworkRequestOrResponse.getSize();
    }

    public void setResponseDetails(int i, ReplayNetworkRequestOrResponse replayNetworkRequestOrResponse) {
        this.statusCode = Integer.valueOf(i);
        this.response = replayNetworkRequestOrResponse;
        this.responseBodySize = replayNetworkRequestOrResponse.getSize();
    }

    public String toString() {
        return "NetworkRequestData{method='" + this.method + "', statusCode=" + this.statusCode + ", requestBodySize=" + this.requestBodySize + ", responseBodySize=" + this.responseBodySize + ", request=" + this.request + ", response=" + this.response + AbstractJsonLexerKt.END_OBJ;
    }
}
