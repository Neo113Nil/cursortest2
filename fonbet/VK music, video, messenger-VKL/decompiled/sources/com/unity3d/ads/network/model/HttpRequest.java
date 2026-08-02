package com.unity3d.ads.network.model;

import com.unity3d.ads.network.model.HttpBody;
import java.util.List;
import java.util.Map;
import xsna.epx;
import xsna.jgp;
import xsna.shy;
import xsna.urd0;
import xsna.v11;
import xsna.vu5;
import xsna.zcl;

/* compiled from: HttpRequest.kt */
/* loaded from: classes14.dex */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_SCHEME = "https";
    private static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final HttpBody body;
    private final int callTimeout;
    private final int connectTimeout;
    private final Map<String, List<String>> headers;
    private final RequestType method;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int readTimeout;
    private final String scheme;
    private final int writeTimeout;

    /* compiled from: HttpRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public HttpRequest(String str) {
        this(str, null, null, null, null, null, null, null, 0, 0, 0, 0, 4094, null);
    }

    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = httpRequest.baseURL;
        }
        if ((i5 & 2) != 0) {
            str2 = httpRequest.path;
        }
        if ((i5 & 4) != 0) {
            requestType = httpRequest.method;
        }
        if ((i5 & 8) != 0) {
            httpBody = httpRequest.body;
        }
        if ((i5 & 16) != 0) {
            map = httpRequest.headers;
        }
        if ((i5 & 32) != 0) {
            map2 = httpRequest.parameters;
        }
        if ((i5 & 64) != 0) {
            str3 = httpRequest.scheme;
        }
        if ((i5 & 128) != 0) {
            num = httpRequest.port;
        }
        if ((i5 & 256) != 0) {
            i = httpRequest.connectTimeout;
        }
        if ((i5 & 512) != 0) {
            i2 = httpRequest.readTimeout;
        }
        if ((i5 & 1024) != 0) {
            i3 = httpRequest.writeTimeout;
        }
        if ((i5 & 2048) != 0) {
            i4 = httpRequest.callTimeout;
        }
        int i6 = i3;
        int i7 = i4;
        int i8 = i;
        int i9 = i2;
        String str4 = str3;
        Integer num2 = num;
        Map map3 = map;
        Map map4 = map2;
        return httpRequest.copy(str, str2, requestType, httpBody, map3, map4, str4, num2, i8, i9, i6, i7);
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.readTimeout;
    }

    public final int component11() {
        return this.writeTimeout;
    }

    public final int component12() {
        return this.callTimeout;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final HttpBody component4() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    public final String component7() {
        return this.scheme;
    }

    public final Integer component8() {
        return this.port;
    }

    public final int component9() {
        return this.connectTimeout;
    }

    public final HttpRequest copy(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i, int i2, int i3, int i4) {
        return new HttpRequest(str, str2, requestType, httpBody, map, map2, str3, num, i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return epx.f(this.baseURL, httpRequest.baseURL) && epx.f(this.path, httpRequest.path) && this.method == httpRequest.method && epx.f(this.body, httpRequest.body) && epx.f(this.headers, httpRequest.headers) && epx.f(this.parameters, httpRequest.parameters) && epx.f(this.scheme, httpRequest.scheme) && epx.f(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final HttpBody getBody() {
        return this.body;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final String getPath() {
        return this.path;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public int hashCode() {
        int a = urd0.a(v11.a(v11.a((this.body.hashCode() + ((this.method.hashCode() + urd0.a(this.baseURL.hashCode() * 31, 31, this.path)) * 31)) * 31, 31, this.headers), 31, this.parameters), 31, this.scheme);
        Integer num = this.port;
        return Integer.hashCode(this.callTimeout) + shy.a(this.writeTimeout, shy.a(this.readTimeout, shy.a(this.connectTimeout, (a + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpRequest(baseURL=");
        sb.append(this.baseURL);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", parameters=");
        sb.append(this.parameters);
        sb.append(", scheme=");
        sb.append(this.scheme);
        sb.append(", port=");
        sb.append(this.port);
        sb.append(", connectTimeout=");
        sb.append(this.connectTimeout);
        sb.append(", readTimeout=");
        sb.append(this.readTimeout);
        sb.append(", writeTimeout=");
        sb.append(this.writeTimeout);
        sb.append(", callTimeout=");
        return vu5.b(sb, this.callTimeout, ')');
    }

    public HttpRequest(String str, String str2) {
        this(str, str2, null, null, null, null, null, null, 0, 0, 0, 0, 4092, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType) {
        this(str, str2, requestType, null, null, null, null, null, 0, 0, 0, 0, 4088, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody) {
        this(str, str2, requestType, httpBody, null, null, null, null, 0, 0, 0, 0, 4080, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map) {
        this(str, str2, requestType, httpBody, map, null, null, null, 0, 0, 0, 0, 4064, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2) {
        this(str, str2, requestType, httpBody, map, map2, null, null, 0, 0, 0, 0, 4032, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3) {
        this(str, str2, requestType, httpBody, map, map2, str3, null, 0, 0, 0, 0, 3968, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num) {
        this(str, str2, requestType, httpBody, map, map2, str3, num, 0, 0, 0, 0, 3840, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i) {
        this(str, str2, requestType, httpBody, map, map2, str3, num, i, 0, 0, 0, 3584, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i, int i2) {
        this(str, str2, requestType, httpBody, map, map2, str3, num, i, i2, 0, 0, 3072, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i, int i2, int i3) {
        this(str, str2, requestType, httpBody, map, map2, str3, num, i, i2, i3, 0, 2048, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i, int i2, int i3, int i4) {
        this.baseURL = str;
        this.path = str2;
        this.method = requestType;
        this.body = httpBody;
        this.headers = map;
        this.parameters = map2;
        this.scheme = str3;
        this.port = num;
        this.connectTimeout = i;
        this.readTimeout = i2;
        this.writeTimeout = i3;
        this.callTimeout = i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i, int i2, int i3, int i4, int i5, zcl zclVar) {
        this(str, r1, r2, r3, r4 != 0 ? r5 : map, (i5 & 32) == 0 ? map2 : r5, (i5 & 64) != 0 ? "https" : str3, (i5 & 128) != 0 ? null : num, (i5 & 256) != 0 ? 30000 : i, (i5 & 512) != 0 ? 30000 : i2, (i5 & 1024) != 0 ? 30000 : i3, (i5 & 2048) != 0 ? 30000 : i4);
        String str4 = (i5 & 2) != 0 ? "" : str2;
        RequestType requestType2 = (i5 & 4) != 0 ? RequestType.GET : requestType;
        HttpBody httpBody2 = (i5 & 8) != 0 ? HttpBody.EmptyBody.INSTANCE : httpBody;
        int i6 = i5 & 16;
        Map map3 = jgp.b;
    }
}
