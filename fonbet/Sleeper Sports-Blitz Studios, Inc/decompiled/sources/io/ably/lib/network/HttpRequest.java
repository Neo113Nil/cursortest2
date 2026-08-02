package io.ably.lib.network;

import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class HttpRequest {
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String CONTENT_TYPE = "Content-Type";
    private final HttpBody body;
    private final Map<String, List<String>> headers;
    private final int httpOpenTimeout;
    private final int httpReadTimeout;
    private final String method;
    private final URL url;

    protected boolean canEqual(Object obj) {
        return obj instanceof HttpRequest;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        if (!httpRequest.canEqual(this) || getHttpOpenTimeout() != httpRequest.getHttpOpenTimeout() || getHttpReadTimeout() != httpRequest.getHttpReadTimeout()) {
            return false;
        }
        URL url = getUrl();
        URL url2 = httpRequest.getUrl();
        if (url != null ? !url.equals(url2) : url2 != null) {
            return false;
        }
        String method = getMethod();
        String method2 = httpRequest.getMethod();
        if (method != null ? !method.equals(method2) : method2 != null) {
            return false;
        }
        HttpBody body = getBody();
        HttpBody body2 = httpRequest.getBody();
        if (body != null ? !body.equals(body2) : body2 != null) {
            return false;
        }
        Map<String, List<String>> headers = getHeaders();
        Map<String, List<String>> headers2 = httpRequest.getHeaders();
        return headers != null ? headers.equals(headers2) : headers2 == null;
    }

    public int hashCode() {
        int httpOpenTimeout = ((getHttpOpenTimeout() + 59) * 59) + getHttpReadTimeout();
        URL url = getUrl();
        int hashCode = (httpOpenTimeout * 59) + (url == null ? 43 : url.hashCode());
        String method = getMethod();
        int hashCode2 = (hashCode * 59) + (method == null ? 43 : method.hashCode());
        HttpBody body = getBody();
        int hashCode3 = (hashCode2 * 59) + (body == null ? 43 : body.hashCode());
        Map<String, List<String>> headers = getHeaders();
        return (hashCode3 * 59) + (headers != null ? headers.hashCode() : 43);
    }

    public String toString() {
        return "HttpRequest(url=" + getUrl() + ", method=" + getMethod() + ", httpOpenTimeout=" + getHttpOpenTimeout() + ", httpReadTimeout=" + getHttpReadTimeout() + ", body=" + getBody() + ", headers=" + getHeaders() + ")";
    }

    public HttpRequest(URL url, String str, int i, int i2, HttpBody httpBody, Map<String, List<String>> map) {
        this.url = url;
        this.method = str;
        this.httpOpenTimeout = i;
        this.httpReadTimeout = i2;
        this.body = httpBody;
        this.headers = map;
    }

    public URL getUrl() {
        return this.url;
    }

    public String getMethod() {
        return this.method;
    }

    public int getHttpOpenTimeout() {
        return this.httpOpenTimeout;
    }

    public int getHttpReadTimeout() {
        return this.httpReadTimeout;
    }

    public HttpBody getBody() {
        return this.body;
    }

    public Map<String, List<String>> getHeaders() {
        HashMap hashMap = new HashMap(this.headers);
        HttpBody httpBody = this.body;
        if (httpBody != null) {
            int length = httpBody.getContent() == null ? 0 : this.body.getContent().length;
            hashMap.put("Content-Type", Collections.singletonList(this.body.getContentType()));
            hashMap.put("Content-Length", Collections.singletonList(Integer.toString(length)));
        }
        return hashMap;
    }

    public static HttpRequestBuilder builder() {
        return new HttpRequestBuilder();
    }

    public static class HttpRequestBuilder {
        private HttpBody body;
        private Map<String, List<String>> headers;
        private int httpOpenTimeout;
        private int httpReadTimeout;
        private String method;
        private URL url;

        HttpRequestBuilder() {
        }

        public HttpRequestBuilder url(URL url) {
            this.url = url;
            return this;
        }

        public HttpRequestBuilder method(String str) {
            this.method = str;
            return this;
        }

        public HttpRequestBuilder httpOpenTimeout(int i) {
            this.httpOpenTimeout = i;
            return this;
        }

        public HttpRequestBuilder httpReadTimeout(int i) {
            this.httpReadTimeout = i;
            return this;
        }

        public HttpRequestBuilder body(HttpBody httpBody) {
            this.body = httpBody;
            return this;
        }

        public HttpRequestBuilder headers(Map<String, String> map) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), Collections.singletonList(entry.getValue()));
            }
            this.headers = Collections.unmodifiableMap(hashMap);
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this.url, this.method, this.httpOpenTimeout, this.httpReadTimeout, this.body, this.headers);
        }

        public String toString() {
            return "HttpRequest.HttpRequestBuilder(url=" + this.url + ", method=" + this.method + ", httpOpenTimeout=" + this.httpOpenTimeout + ", httpReadTimeout=" + this.httpReadTimeout + ", body=" + this.body + ", headers=" + this.headers + ")";
        }
    }
}
