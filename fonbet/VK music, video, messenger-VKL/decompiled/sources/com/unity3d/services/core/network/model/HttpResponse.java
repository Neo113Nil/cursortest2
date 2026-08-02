package com.unity3d.services.core.network.model;

import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.Map;
import xsna.epx;
import xsna.jgp;
import xsna.shy;
import xsna.urd0;
import xsna.v11;
import xsna.vu5;
import xsna.zcl;

/* compiled from: HttpResponse.kt */
/* loaded from: classes14.dex */
public final class HttpResponse {
    private final Object body;
    private final String client;
    private final long contentSize;
    private final Map<String, List<String>> headers;
    private final String protocol;
    private final int statusCode;
    private final String urlString;

    public HttpResponse(Object obj) {
        this(obj, 0, null, null, null, null, 0L, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
    }

    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i, Map map, String str, String str2, String str3, long j, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = httpResponse.body;
        }
        if ((i2 & 2) != 0) {
            i = httpResponse.statusCode;
        }
        if ((i2 & 4) != 0) {
            map = httpResponse.headers;
        }
        if ((i2 & 8) != 0) {
            str = httpResponse.urlString;
        }
        if ((i2 & 16) != 0) {
            str2 = httpResponse.protocol;
        }
        if ((i2 & 32) != 0) {
            str3 = httpResponse.client;
        }
        if ((i2 & 64) != 0) {
            j = httpResponse.contentSize;
        }
        long j2 = j;
        String str4 = str2;
        String str5 = str3;
        return httpResponse.copy(obj, i, map, str, str4, str5, j2);
    }

    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final Map<String, List<String>> component3() {
        return this.headers;
    }

    public final String component4() {
        return this.urlString;
    }

    public final String component5() {
        return this.protocol;
    }

    public final String component6() {
        return this.client;
    }

    public final long component7() {
        return this.contentSize;
    }

    public final HttpResponse copy(Object obj, int i, Map<String, ? extends List<String>> map, String str, String str2, String str3, long j) {
        return new HttpResponse(obj, i, map, str, str2, str3, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return epx.f(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && epx.f(this.headers, httpResponse.headers) && epx.f(this.urlString, httpResponse.urlString) && epx.f(this.protocol, httpResponse.protocol) && epx.f(this.client, httpResponse.client) && this.contentSize == httpResponse.contentSize;
    }

    public final Object getBody() {
        return this.body;
    }

    public final String getClient() {
        return this.client;
    }

    public final long getContentSize() {
        return this.contentSize;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return Long.hashCode(this.contentSize) + urd0.a(urd0.a(urd0.a(v11.a(shy.a(this.statusCode, this.body.hashCode() * 31, 31), 31, this.headers), 31, this.urlString), 31, this.protocol), 31, this.client);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpResponse(body=");
        sb.append(this.body);
        sb.append(", statusCode=");
        sb.append(this.statusCode);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", urlString=");
        sb.append(this.urlString);
        sb.append(", protocol=");
        sb.append(this.protocol);
        sb.append(", client=");
        sb.append(this.client);
        sb.append(", contentSize=");
        return vu5.a(')', this.contentSize, sb);
    }

    public HttpResponse(Object obj, int i) {
        this(obj, i, null, null, null, null, 0L, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null);
    }

    public HttpResponse(Object obj, int i, Map<String, ? extends List<String>> map) {
        this(obj, i, map, null, null, null, 0L, 120, null);
    }

    public HttpResponse(Object obj, int i, Map<String, ? extends List<String>> map, String str) {
        this(obj, i, map, str, null, null, 0L, 112, null);
    }

    public HttpResponse(Object obj, int i, Map<String, ? extends List<String>> map, String str, String str2) {
        this(obj, i, map, str, str2, null, 0L, 96, null);
    }

    public HttpResponse(Object obj, int i, Map<String, ? extends List<String>> map, String str, String str2, String str3) {
        this(obj, i, map, str, str2, str3, 0L, 64, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpResponse(Object obj, int i, Map<String, ? extends List<String>> map, String str, String str2, String str3, long j) {
        this.body = obj;
        this.statusCode = i;
        this.headers = map;
        this.urlString = str;
        this.protocol = str2;
        this.client = str3;
        this.contentSize = j;
    }

    public /* synthetic */ HttpResponse(Object obj, int i, Map map, String str, String str2, String str3, long j, int i2, zcl zclVar) {
        this(obj, (i2 & 2) != 0 ? 200 : i, (i2 & 4) != 0 ? jgp.b : map, (i2 & 8) != 0 ? "" : str, (i2 & 16) == 0 ? str2 : "", (i2 & 32) != 0 ? "unknown" : str3, (i2 & 64) != 0 ? -1L : j);
    }
}
