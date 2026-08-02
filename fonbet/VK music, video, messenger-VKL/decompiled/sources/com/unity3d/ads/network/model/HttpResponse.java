package com.unity3d.ads.network.model;

import java.util.Map;
import xsna.epx;
import xsna.ho8;
import xsna.jgp;
import xsna.shy;
import xsna.v11;
import xsna.zcl;

/* compiled from: HttpResponse.kt */
/* loaded from: classes14.dex */
public final class HttpResponse {
    private final Object body;
    private final Map<String, Object> headers;
    private final int statusCode;
    private final String urlString;

    public HttpResponse(Object obj) {
        this(obj, 0, null, null, 14, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i, Map map, String str, int i2, Object obj2) {
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
        return httpResponse.copy(obj, i, map, str);
    }

    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final Map<String, Object> component3() {
        return this.headers;
    }

    public final String component4() {
        return this.urlString;
    }

    public final HttpResponse copy(Object obj, int i, Map<String, ? extends Object> map, String str) {
        return new HttpResponse(obj, i, map, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return epx.f(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && epx.f(this.headers, httpResponse.headers) && epx.f(this.urlString, httpResponse.urlString);
    }

    public final Object getBody() {
        return this.body;
    }

    public final Map<String, Object> getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return this.urlString.hashCode() + v11.a(shy.a(this.statusCode, this.body.hashCode() * 31, 31), 31, this.headers);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpResponse(body=");
        sb.append(this.body);
        sb.append(", statusCode=");
        sb.append(this.statusCode);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", urlString=");
        return ho8.a(sb, this.urlString, ')');
    }

    public HttpResponse(Object obj, int i) {
        this(obj, i, null, null, 12, null);
    }

    public HttpResponse(Object obj, int i, Map<String, ? extends Object> map) {
        this(obj, i, map, null, 8, null);
    }

    public HttpResponse(Object obj, int i, Map<String, ? extends Object> map, String str) {
        this.body = obj;
        this.statusCode = i;
        this.headers = map;
        this.urlString = str;
    }

    public /* synthetic */ HttpResponse(Object obj, int i, Map map, String str, int i2, zcl zclVar) {
        this(obj, (i2 & 2) != 0 ? 200 : i, (i2 & 4) != 0 ? jgp.b : map, (i2 & 8) != 0 ? "" : str);
    }
}
